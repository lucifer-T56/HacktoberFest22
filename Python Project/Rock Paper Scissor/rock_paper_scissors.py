from this import d
from tkinter import *
import random

root = Tk()
root.geometry('600x600')
root.resizable(0,0)
root.title('Rock,Paper,Scissors')
root.config(bg = 'seashell3')

Label(root, text = 'Rock, Paper, Scissors', font = 'arial 20 bold', bg = 'seashell2').pack()
user_take = StringVar()
Label(root, text = 'choose any one: rock, paper, scissors', font='arial 15 bold',bg='seashell2').place(x= 20,y= 70)
Entry(root, font = 'arial 15', textvariable = user_take, bg='antiquewhite2').place(x=150,y=130)

comp_pick = random.randint(1,3)
if comp_pick == 1:
    comp_pick = 'rock'
elif comp_pick == 2:
    comp_pick = 'paper'
elif comp_pick == 3:
    comp_pick = 'scissors'

Result = StringVar()

def Play():
    user_pick = user_take.get()
    if user_pick == comp_pick:
        Result.set('Tie, You both selected the same')
    elif user_pick == 'rock' and comp_pick =='paper':
        Result.set('You Loose, Computer selected paper')
    elif user_pick == 'rock' and comp_pick =='scissors':
        Result.set('You win, Computer selected scissors')
    elif user_pick == 'paper' and comp_pick =='rock':
        Result.set('You win, Computer selected rock')
    elif user_pick == 'paper' and comp_pick =='scissors':
        Result.set('You Loose, Computer selected scissors')
    elif user_pick == 'scissors' and comp_pick =='paper':
        Result.set('You win, Computer selected paper')
    elif user_pick == 'scissors' and comp_pick =='rock':
        Result.set('You Loose, Computer selected rock')
    else:
        Result.set('invalid: choose any one from rock, paper, scissors')
    
def Reset():
    Result.set("")
    user_take.set("")

def Exit():
    root.destroy()


Entry(root, font = 'arial 10 bold', textvariable = Result, bg ='antiquewhite2',width = 50,).place(x=25, y = 250)
Button(root, font = 'arial 13 bold', text = 'PLAY'  ,padx =5,bg ='seashell4' ,command = Play).place(x=150,y=190)
Button(root, font = 'arial 13 bold', text = 'RESET'  ,padx =5,bg ='seashell4' ,command = Reset).place(x=70,y=310)
Button(root, font = 'arial 13 bold', text = 'EXIT'  ,padx =5,bg ='seashell4' ,command = Exit).place(x=230,y=310)

root.mainloop()
