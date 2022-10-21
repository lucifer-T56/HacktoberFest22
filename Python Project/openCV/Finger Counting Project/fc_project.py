import cv2
import time
import os

from cv2 import dft
from cv2 import ml_ANN_MLP
import Hand_Tracking_Module as htm

wCam, hCam = 640, 480 # width and height of the camera
cap = cv2.VideoCapture(0)
cap.set(3, wCam)
cap.set(4, hCam)

folderPath = "Finger_Img"
myList = os.listdir(folderPath) ##accessing all the files in the Finger_Img folder at once
print(myList)
overlayList = [] # overlaying the images of fingers on your video
for imPath in myList:
    image =  cv2.imread(f'{folderPath}/{imPath}')# folderPath e directory er naam ta ache and imPath e images
    # print(f'{folderPath}/{imPath}')

    overlayList.append(image)

    
print(len(overlayList))
cTime = 0
pTime = 0
detector = htm.handDetector(detectionCon = 0.75)

tipsId = [4,8,12,16,20] # tips of the fingers

while True:
    success, img = cap.read()
    img = detector.findHands(img)
    lmList = detector.findPositions(img, draw = False)
    # print(lmList)



    if len(lmList)!=0:
        fingers = []
        
        # for thumb
        if lmList[tipsId[0]][1] > lmList[tipsId[0]-1][1]:
            fingers.append(1)
        else:
            fingers.append(0)

        # for other fingers
        for id in range(1,5): 
            if lmList[tipsId[id]][2] < lmList[tipsId[id]-2][2] :
                fingers.append(1)
            else:
                fingers.append(0)

        # print(fingers)
        totalFingers = fingers.count(1)
        print(totalFingers)

        h, w, c = overlayList[totalFingers-1].shape
        img[0:h, 0:w] = overlayList[totalFingers-1]
        #range of height : range of width

        # cv2.rectangle(img, (20, 255), (170, 425), (0,255,0), cv2.FILLED)
        # cv2.putText(img, str(totalFingers), (45, 375), cv2.FONT_HERSHEY_PLAIN,10,(255,0))
        
    cTime = time.time()
    fps = 1/(cTime - pTime)
    pTime =  cTime

    cv2.putText(img, f"fps = {str(int(fps))}", (400,70), cv2.FONT_HERSHEY_PLAIN, 3, (255,0,0), thickness = 5)
    cv2.imshow("Image ", img)
    cv2.waitKey(1)