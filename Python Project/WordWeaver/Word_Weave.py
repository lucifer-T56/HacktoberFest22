word = input()

def weave(word):
    
    left_half = word[0:int((len(word)/2)+0.5)]
    right_half = word[int((len(word)/2)+0.5):int(len(word))]
    
    weaved = ''
    
    for i in range((len(word)//2)+1):
        
        if i == len(word)//2 and len(word)%2 !=0:
            weaved += left_half[i]
            
        elif i != len(word)//2:
            weaved += left_half[i]+right_half[i]
        
    return weaved
    
print(weave(word))
