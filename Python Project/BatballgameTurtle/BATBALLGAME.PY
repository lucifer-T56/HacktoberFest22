import turtle as t

playerAscore = 0
playerBscore = 0

window = t.Screen()
window.title("SUJOYDA  GAME")
window.bgcolor("yellow")
window.setup(width=800, height=600)
window.tracer(0)

# for left dandi

leftpaddle = t.Turtle()
leftpaddle.speed(0)
leftpaddle.shape("square")
leftpaddle.color("blue")
leftpaddle.shapesize(stretch_wid=5, stretch_len=1)
leftpaddle.penup()
leftpaddle.goto(-350, 0)

# for right

rightpaddle = t.Turtle()
rightpaddle.speed(0)
rightpaddle.shape("square")
rightpaddle.color("green")
rightpaddle.shapesize(stretch_wid=5, stretch_len=1)
rightpaddle.penup()
rightpaddle.goto(350, 0)

# now ballll

ball = t.Turtle()
ball.speed(0)
ball.shape("circle")
ball.color("red")
ball.penup()
ball.goto(5, 5)
ballxdirection = 0.2
ballydirection = 0.2

# now pen

pen = t.Turtle()
pen.speed(0)
pen.color("red")
pen.penup()
pen.hideturtle()
pen.goto(0, 260)
pen.write("score", align="center", font=('Arial', 24, 'normal'))


# leftuupaddleiii

def leftpaddleup():
    y = leftpaddle.ycor()
    y = y + 90
    leftpaddle.sety(y)
#eta leftpaddle k 90 degree up e korte help kore

def leftpaddledown():
    y = leftpaddle.ycor()
    y = y - 90
    leftpaddle.sety(y)

#eta left paddle k 90 degree down e korte help kore
# for right padle

def rightpaddleup():
    y = rightpaddle.ycor()
    y = y + 90
    rightpaddle.sety(y)
#eta rightpaddle k 90 degree up e korte help kore

def rightpaddledown():
    y = rightpaddle.ycor()
    y = y - 90
    rightpaddle.sety(y)
#eta right paddle k 90 degree down e korte help kore

# assignkey

window.listen()
window.onkeypress(leftpaddleup, 'w')
window.onkeypress(leftpaddledown, 's')
window.onkeypress(rightpaddleup, 'i')
window.onkeypress(rightpaddledown, 'k')

while True:
    window.update()

    # ball sorate x ar y dirextion e aar speed hbe 0.2 jeta age ball create er time set kora
    ball.setx(ball.xcor() + ballxdirection)
    ball.sety(ball.ycor() + ballydirection)

    # now border setting

    if ball.ycor() > 290:
        ball.sety(290)
        ballydirection = ballydirection * -1
    if ball.ycor() <-290:
        ball.sety(-290)
        ballydirection = ballydirection * -1

    if ball.xcor() > 390:
        ball.goto(0, 0)
        ballxdirection = ballxdirection
        playerAscore = playerAscore + 1
    
        pen.clear()
        pen.write("ANIRBAN:{}    JASH:{}".format(playerAscore, playerBscore), align="center", font=('Arial',24,'normal'))
    
    if (ball.xcor()) <- 390:
        ball.goto(0, 0)
        ballxdirection = ballxdirection
        
        playerBscore = playerBscore + 1
        pen.clear()
        pen.write("ANIRBAN:{}    JASH:{}".format(playerAscore, playerBscore), align="center", font=('Arial',24,'normal'))
        
    if (ball.xcor() > 340) and (ball.xcor() < 350) and (
            ball.ycor() < rightpaddle.ycor() + 40 and ball.ycor() > rightpaddle.ycor() - 40):
        ball.setx(340)
        ballxdirection = ballxdirection * -1
    #to make inverse direction
    if (ball.xcor() < -340) and (ball.xcor() > -350) and (
            ball.ycor() < leftpaddle.ycor() + 40 and ball.ycor() > leftpaddle.ycor() - 40):
        ball.setx(-340)
        ballxdirection = ballxdirection * -1