#MemoryGame.py
#ICS201
#Deep Patel
#January 2019


import turtle#Start Turtle Process
t = turtle.Turtle() #Def Variable 't'
t.screen.bgcolor("blue")#Background Selection
t.speed(100)#Indicating how fast the turtle should draw

t.begin_fill()#Drawing Starts
t.pensize(10)
t.right(90)
t.forward(50)
t.left(90)
t.forward(95)
t.left(90)
t.forward(200)
t.left(90)
t.forward(95)
t.left(90)
t.forward(150)
t.color("Black") #ChangingColor
t.end_fill()

t.pencolor("Red")#ChangingColor
t.penup()
t.left(90)
t.forward(18)
t.left(90)
t.forward(145)
t.right(90)
t.pendown()

t.begin_fill()
t.pensize(1)
t.forward(60)
t.right(90)
t.forward(50)
t.right(90)
t.forward(60)
t.right(90)
t.forward(50)
t.color("red")#ChangingColor
t.end_fill()

t.penup()
t.right(180)
t.forward(65)

t.pendown()
t.pencolor("yellow")#ChangingColor
t.begin_fill()
t.left(90)
t.forward(60)
t.right(90)
t.forward(50)
t.right(90)
t.forward(60)
t.right(90)
t.forward(50)
t.color("Yellow")#ChangingColor
t.end_fill()

t.penup()
t.right(180)
t.forward(70)
t.pendown()

t.begin_fill()
t.pencolor("green")#ChangingColor
t.left(90)
t.forward(60)
t.right(90)
t.forward(50)
t.right(90)
t.forward(60)
t.right(90)
t.forward(50)
t.color("green")#ChangingColor
t.end_fill()

t.penup()
t.forward(136)
t.right(90)
t.forward(30)
t.right(90)
t.forward(50)
t.right(90)
t.forward(16)
t.color("white")#ChangingColor
t.write("W", font=("Arial",30,"normal"))

t.penup()
t.left(90)
t.forward(65)
t.left(90)
t.forward(15)
t.pendown()
t.color("black")#ChangingColor
t.write("I", font=("Arial",30,"normal"))#Writing out words without drawing them

t.penup()
t.right(90)
t.forward(70)
t.right(90)
t.forward(12)
t.pendown()
t.color("white")#ChangingColor
t.write("N",font=("Arial",30,"normal"))#Writing out words without drawing them

t.penup()
t.pencolor("red")#ChangingColor
t.pensize(5)
t.forward(65)
t.right(90)
t.forward(100)
t.pendown()

t.right(90)
t.forward(150)
t.left(90)
t.forward(110)
t.left(90)
t.forward(150)
t.left(90)
t.forward(105)
t.penup()
t.begin_fill()
t.left(90)
t.forward(125)
t.left(90)
t.forward(30)
t.right(90)
t.forward(35)

t.pendown()
t.pencolor("White")#ChangingColor
t.pensize(2)
t.left(45)
t.forward(25)
t.right(135)
t.forward(15)
t.left(90)
t.forward(50)
t.right(90)
t.forward(10)
t.right(90)
t.forward(50)
t.left(90)
t.forward(10)
t.right(135)
t.forward(23)

t.penup()
t.forward(300)
t.right(45)
t.forward(1)
t.left(90)
t.forward(315)
t.right(90)
t.forward(10)
t.write("Memory Game",font=("Impact",85,"normal"))#Writing out words without drawing them
t.right(90)
t.forward(690)
t.right(90)
t.pensize(3)
t.pencolor("yellow")#ChangingColor
t.forward(150)
t.pendown()
t.begin_fill()
t.forward(60)
t.left(90)
t.forward(80)
t.left(140)
t.forward(100)
t.color("yellow")#ChangingColor
t.end_fill()

t.penup()
t.left(140)
t.forward(75)
t.left(90)
t.forward(50)
t.right(90)
t.forward(25)
t.pensize(3)
t.pencolor("green")#ChangingColor
t.pendown()
t.begin_fill()
t.right(65)
t.forward(35)
t.left(65)
t.forward(35)
t.left(80)

t.forward(45)
t.left(80)
t.forward(35)
t.left(65)
t.forward(36)
t.color("green")#ChangingColor
t.end_fill()

t.penup()
t.left(35)
t.forward(50)
t.left(90)
t.forward(90)
t.left(90)
t.pendown()
t.pencolor("red")#ChangingColor
t.begin_fill()
t.forward(85)
t.left(90)
t.forward(25)
t.right(135)
t.forward(45)
t.right(90)
t.forward(35)
t.right(135)
t.forward(16)
t.left(90)
t.forward(95)
t.right(90)
t.forward(15)
t.color("red")#ChangingColor
t.end_fill()

t.penup()
t.left(90)
t.forward(715)
t.pendown()
t.begin_fill()
t.pencolor("black")#ChangingColor
t.pensize(2)
t.pendown()
t.begin_fill()
t.left(90)
t.forward(30)
t.left(90)
t.forward(40)
t.left(90)
t.forward(30)
t.left(90)
t.forward(40)
t.color("pink")#ChangingColor
t.end_fill()
t.left(90)
t.penup()
t.pendown()
t.pencolor("black")#ChangingColor
t.begin_fill()
t.forward(7)
t.left(90)
t.forward(10)
t.left(90)
t.forward(7)
t.color("red")
t.end_fill()
t.begin_fill()
t.pencolor("black")#ChangingColor
t.pensize(2)
t.penup()
t.pendown()
t.right(90)
t.forward(10)
t.right(90)
t.forward(7)
t.right(90)
t.forward(10)
t.right(90)
t.color("lightgreen")#ChangingColor
t.end_fill()

t.penup()
t.forward(7)
t.right(90)
t.forward(10)
t.left(90)
t.pendown()
t.begin_fill()
t.pencolor("black")#ChangingColor
t.pensize(3)
t.forward(165)
t.right(90)
t.forward(215)
t.right(90)
t.forward(165)
t.right(90)
t.forward(215)
t.color("pink")#ChangingColor
t.end_fill()

t.penup()
t.right(180)
t.forward(35)
t.pendown()
t.begin_fill()
t.pencolor("black")#ChangingColor
t.pensize(2.5)
t.left(90)
t.forward(7)
t.right(90)
t.forward(25)
t.right(90)
t.forward(7)
t.left(90)
t.forward(40)
t.left(90)
t.forward(7)
t.right(90)
t.forward(15)
t.right(90)
t.forward(7)
t.left(90)
t.forward(9)
t.left(90)
t.forward(7)
t.right(90)
t.forward(45)
t.right(90)
t.forward(7)
t.left(90)
t.forward(25)
t.left(90)
t.forward(7)
t.right(90)
t.forward(20)

t.penup()
t.left(90)
t.forward(130)
t.pendown()
t.left(90)
t.forward(30)
t.right(90)
t.forward(30)
t.left(90)
t.forward(155)
t.left(90)
t.forward(30)
t.right(90)
t.forward(30)
t.left(90)
t.forward(105)
t.left(90)
t.forward(95)
t.left(90)
t.forward(85)
t.left(90)
t.forward(70)
t.left(90)
t.forward(60)
t.left(90)
t.forward(50)
t.left(90)
t.forward(35)
t.left(90)
t.forward(60)
t.left(90)
t.forward(70)
t.left(90)
t.forward(185)
t.left(90)
t.forward(70)
t.left(90)
t.forward(60)
t.left(90)
t.forward(35)
t.left(90)
t.forward(45)
t.left(90)
t.forward(60)
t.left(90)
t.forward(60)
t.left(90)
t.forward(85)
t.left(90)
t.forward(90)

t.penup()
t.left(90)
t.forward(470)
t.left(90)
t.forward(795)
t.pendown()
t.pensize(3.5)
t.right(180)

for i in range(28): #Using a loop to draw the border of my title screen      
    t.begin_fill()
    t.pencolor("black")#ChangingColor
    t.forward(35)
    t.right(90)
    t.forward(30)
    t.right(90)
    t.forward(35)
    t.left(90)
    t.forward(5)
    t.left(90)
    t.color("purple")#ChangingColor
    t.end_fill()

t.penup()
t.forward(1920)
t.pendown()
t.right(180)

for i in range(28): #Using a loop to draw the border of my title screen 
    t.begin_fill()
    t.pencolor("black")#ChangingColor
    t.forward(35)
    t.right(90)
    t.forward(30)
    t.right(90)
    t.forward(35)
    t.left(90)
    t.forward(5)
    t.left(90)
    t.color("purple")#ChangingColor
    t.end_fill()

t.penup()
t.goto(0,0)
t.left(90)
t.forward(350)
t.left(90)
t.forward(650)
t.pensize(5)
t.pencolor("yellow")#ChangingColor
t.right(90)
t.forward(65)
t.left(130)
t.pendown()
t.pencolor("yellow")#ChangingColor
t.write("DEEP",font=("Impact",65,"normal"))#Writing out words without drawing them









import time #Importing a module which will help me introduce pauses between my different print statments
import random

print("Memory Game") #Information for the user
print("\nWELCOME")
print("This is a game inspired by a great decoding machine called Enigma, designed to test your memory skills. To see if you are skillful enough to be hired to the crew, we must run this training program.")

rules = str(input("\nType in 'rules' to view the procedures you are to follow during this game:"))#UserInput

time.sleep(1.25) #TimeModule to pause the time of the program

if rules == rules: #If Statments to determine which of the multiple paths the user will go through
    print("-> You will be shown a sequence of numbers, letters, or symbols.")
    print("-> After a certain time limit, depending on the level, the sequence will disappear.")
    print("-> If you repeat the sequence correctly, you will move onto the next level.")

time.sleep(8.75)#TimeModule to pause the time of the program
    
    
print("\nThe game will now begin on Stage 1: Fancy Five Digits, in exactly 3 seconds")

time.sleep(3)#TimeModule to pause the time of the program

print("\nMEMORIZE")

import random
for x in range(1):
    sequence1 = random.randint(9999,100000)#Program chooses random variable from list
    print(sequence1)#UserOutput

time.sleep(3)#TimeModule to pause the time of the program

for x in range(300):
    print("")

print("\nRepeat")
enter = int(input("Enter:"))#UserInput

if enter == sequence1:#If Statments to determine which of the multiple paths the user will go through
    print("\nYou have entered the sequenece correctly. Progress to Stage 2: Number Cruncher")
    print("You are now in Stage 2: Number Cruncher. Good Luck.")

    time.sleep(5)#TimeModule to pause the time of the program

    print("\nMEMORIZE")

    for x in range(1):
        sequence2 = random.randint(99999,10000000)#Program chooses random variable from list
        print(sequence2)#UserOutput

time.sleep(3.70)#TimeModule to pause the time of the program

for x in range(300):
    print("")

print("repeat")
enter2 = int(input("Enter:"))#UserInput

if enter2 == sequence2:#If Statments to determine which of the multiple paths the user will go through
     print("\nYou have entered the sequence correctly. Progress to Stage 3: Enigma Letters")
     print("You are now in Stage 3: Enigma Letters. Good Luck. You will need it.")

     time.sleep(5)#TimeModule to pause the time of the program

     print("\nMEMORIZE")

     sequencelist = ['lwjtyez','auhhrkp','tqfsjwp','teohsde','fhdjspe','afsgwesd','zixfsght','ewygskp','twfsght','fgiaxq','gfootfs','gtoofsat']
     sequence3 = random.choice(sequencelist)#Program chooses random variable from list
     print(sequence3)#UserOutput

     time.sleep(3.5)#TimeModule to pause the time of the program

for x in range(300):
    print("")

print("repeat")
enter3 = str(input("Enter:"))#UserInput
             
if enter3 == sequence3:#If Statments to determine which of the multiple paths the user will go through
    print("\nYou have entered the sequence correctly. Progress to Stage 4: Random Key to Success")
    print("\nYou are now in the Stage 4: Random Key to Success. Good Luck.You will need it again.")

    time.sleep(5)#TimeModule to pause the time of the program

    print("\nMEMORIZE")

    sequencelist2 = ['n97enu','qt9jqz','u8che7','gwnrqr','hg7y8e','o5hxtt','ioacq','mfs2y6','uruzrc','so7sza','ymhdft','7gydgm','gsug4t']  # over here it only printed of these, but not working down there....
    sequence4 = random.choice(sequencelist2)#Program chooses random variable from list
    print(sequence4)#UserOutput

    time.sleep(3)#TimeModule to pause the time of the program

for x in range(300):
    print("")
    
print("repeat")
enter4 = (str(input("Enter:")))#UserInput

if enter4 == sequence4:#If Statments to determine which of the multiple paths the user will go through
    print("\nYou have entered the sequence correctly. Progress to Final Stage: S-N-U-L-P")
    print("\nSNULP, short for symbols, numbers, uppercase, lowercase, and punctuation is the Final Stage. If you are able to pass this stage you will be hired. If not, we can not offer you a position in the ENIGMA crew.")

    time.sleep(5)#TimeModule to pause the time of the program

    print("\nENIGMA crew is surprised with your perseverance! This will put you at a better chance of getting the job! Point Noted. Now you will face the Final Stage.")                   

    time.sleep(4.1)#TimeModule to pause the time of the program

    print("\nMEMORIZE")

    sequencelistfinal = ['!.21JKzq..','*@72PRab?.','^%63JOpk..','(.23SDcx..','&.235Tru3','*@85GGzzT?','^%!!6Rm..:','#)(63Yq/h>']  #it prints this entire thing. i only want it to print of of these
    sequencefinal = random.choice(sequencelistfinal)#Program chooses random variable from list
    print(sequencefinal)#UserOutput

time.sleep(6.5)#TimeModule to pause the time of the program

for x in range(300):
    print("")

print("repeat")
enterfinal = (str(input("Enter:")))#UserInput

if enterfinal == sequencefinal:#If Statments to determine which of the multiple paths the user will go through
    print("Congratulations. You have passed the program.")
    print("\nYou have 33% Chance of getting hired, a 33% Chance of becoming our leader, and a 33% Chance of getting denied this job position.")
    print("\nPlease hold 10 seconds as I discuss the matter on hand with my colleagues. Thank You!")

    time.sleep(10)#TimeModule to pause the time of the program

    joblist = ['You have been chosen to be a LEADER','You have been chosen to an EMPLOYED','You have been DENIED']
    job = random.choice(joblist)#Program chooses random variable from list
    print(job)#UserOutput

    time.sleep(3)#TimeModule to pause the time of the program

    print("Thank you for participating. Do you promise to stay a lifelong learner?")

    if enterfinal != sequencefinal:#Determining if the user has reached the end of the game
        print("\nUnfortunately, you did not pass the final stage. We do appreciate your desire to learn and be a better memory champ. Thank you for playing and NEVER GIVE UP. Just don't come near our office again... or else!")
                    
        if enter4 != sequence4:#Determining if the user has reached the end of the game
            print("\nThe sequence you have entered is incorrect. You have failed the program.")
    
        if enter3 != sequence3:#Determining if the user has reached the end of the game
            print("\nThe sequence you have entered is incorrect. You have failed the program")
         

    if enter2 != sequence2:#Determining if the user has reached the end of the game
        print("\nThe sequence you have entered is incorrect. You have failed the program.")
         
    
elif enter != sequence1:#Determining if the user has reached the end of the game
    print("The sequence you have entered is incorrect. You have failed the program.")
