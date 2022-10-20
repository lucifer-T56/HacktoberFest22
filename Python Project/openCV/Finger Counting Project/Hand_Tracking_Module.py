import cv2
import mediapipe as mp
import time


class handDetector():
    def __init__(self,mode=False, maxHand=2, detectionCon=0.5, trackCon=0.5, model_complexity=1):
        self.mode = mode
        self.maxHand = maxHand
        self.detectionCon = detectionCon
        self.trackCon = trackCon
        self.model_complexity = model_complexity

        self.mpHands = mp.solutions.hands
        self.hands = self.mpHands.Hands(self.mode, self.maxHand, self.model_complexity, self.detectionCon, self.trackCon)
        self.mpDraw = mp.solutions.drawing_utils

    def findHands(self, img, draw=True):
        imgRGB = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
        results = self.hands.process(imgRGB)

        #print(results.multi_hands_landmarks)

        self.multihands = results.multi_hand_landmarks
        if(self.multihands):
            for handLms in self.multihands :
                if draw:
                    self.mpDraw.draw_landmarks(img, handLms, self.mpHands.HAND_CONNECTIONS)
        return img
    
    def findPositions(self, img, handNo=0, draw=True):
        lmlist = []
        if self.multihands:
            myHand=self.multihands[handNo]

            for id, lm in enumerate(myHand.landmark):
                h,w,c = img.shape
                cx, cy = int(lm.x*w), int(lm.y*h)
                lmlist.append([id,cx,cy])
                if draw:
                    cv2.circle(img,(cx,cy),10,(255,0,0),cv2.FILLED)
        return lmlist
def main():
    pTime=0
    cTime=0
    cap=cv2.VideoCapture(0)
    detector = handDetector()
    while True:
        success, img = cap.read()
        detector.findHands(img)
        lmlist=detector.findPositions(img)
        if len(lmlist)!=0:
            print(lmlist[0])
        
        cTime=time.time()
        fps=1/(cTime-pTime)
        pTime = cTime

        cv2.putText(img,str(int(fps)),(10,50),cv2.FONT_HERSHEY_SCRIPT_COMPLEX,1,(255,0,0),thickness = 0)

        cv2.imshow("Image", img)
        cv2.waitKey(1)

if __name__=="__main__":
    main()