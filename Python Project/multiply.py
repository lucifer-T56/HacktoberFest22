import random
import math
import datetime
import time

def time_convert(sec):
  global mins
  global hours
  global seco
  mins = sec // 60
  seco = sec % 60
  hours = mins // 60
  mins = mins % 60
  
amount = int(input('How many equations do you want to do? ') ) 
amountcorrect = 0

for i in range(amount):
    firstNumber = random.randrange(0, 13)
    secondNumber = random.randrange(0, 13)
    print(f"{firstNumber}x{secondNumber}")
    start_time = time.time()
    answer = input('Answer? ')
    end_time = time.time()
    time_lapsed = end_time - start_time
    time_convert(time_lapsed)
    
    if answer == str(firstNumber*secondNumber):
        print("")
        print(f"You got it right in {hours} hours {mins} minute and {seco} seconds.")
        amountcorrect = amountcorrect +1
    else:
        print("")
        print(f"You got it wrong in {hours} hours {mins} minute and {seco} seconds.")
fractionCorrect = amountcorrect / amount
decCorrect = fractionCorrect * 100
print(str(round(decCorrect,2)) + '% Correct')
