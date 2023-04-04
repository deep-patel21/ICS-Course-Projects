#Adventure Story.py
#Deep Patel
#ICS201
#November 26th, 2018

print("Welcome to your Adventure Story")
name = str(input("What is your name?:"))
print("Hello", name)
print("\nPlease read the scenes given to you and respond with the numbers 1 or 2.")
print("\nYou are going to a recreation centre called the RINX to play lazer tag with your friends. How do you choose to get there?")
a1 = float(input("\nOption 1: Walking for 25 mintues or Option 2: Taking the bus for 10 minutes?"))
if a1 == 1:
    print("\nOn the way there, you meet a shady guy who wants to sell you drugs. What do you do?")
    aa2 = float(input("\nOption 1: Use the money for the lazer tag ticket to buy drugs or Option 2: Run away from the shady figure as fast as you can."))
    if aa2 == 1:
        print("\nWhen you take the drugs, you fall unconcious. You are not found, so any record of your existence is erased from the face of the earth. You wake up in the Mystopik realm. What do you do now?")
        aa3 = float(input("\nOption 1: You imagine yourself playing fortnite or Option 2: You train yourself to adapt to this enviroment."))
        if aa3 == 1:
            print("\nYou eventually lose your mind and will be stuck in the Mystopik realm forever.")
        if aa3 == 2:
            print("\nA professor soon learns about your dissappearance and now you are regarded as the greatest pyschisist in the world for going into the Mystopik Realm. You become immortal.")
    if aa2 == 2:
        print("\nYou are able to outran the shady figure without getting hurt, but now you have a new problem. You dropped your phone. What do you do?")
        ab2 = float(input("\nOption 1: Go back towards the shady figure to get your phone back or Option 2: Forget your phone and continue on towards the RINX."))
        if ab2 == 1:
            print("\nThe shady figure sees you approaching and ambushes you. He throws you into a truck and you are taken to a secret location. At this location he makes you his slave. You stay there for 58 years, until you die of natural causes.")
        if ab2 == 2:
            print("\nYou continue towards the RINX, but it starts raining, so you go home. Once you reach your house, you realize nobody is home. What do you do?")
            ab4 = float(input("\nOption 1: Call the police because you think something is wrong or Option 2: Hope onto your PS4 to play Fornite."))
            if ab4 == 1:
                print("\nYou were able to alert the police of your parents being kidnapped and the police forces fortunately saved them. You are now a happy family")
            if ab4 == 2:
                print("\nYou play Fortnite until 1am. Your parents are still not home. The next morning, you find out that your parents were kidnapped and killed. You are now an orphan.")

if a1 == 2: 
    print("\nThe bus you took ran into a car. Luckily you were not injured, but the bus got wrecked. Where do you go from now?")
    ab1 = float(input("\nOption 1: Walk to the RINX to play lazer tag or Option 2: Walk back to your home:"))
    if ab1 == 1:
        print("\nWhen you get to the RINX, you don't see any of your friends and figure out they ditched you. You are now a loser. What do you do")
        ab9 = float(input("\nOption 1: Accept your fate and move on or Option 2: Learn a new sport to impress and make new friends."))
        if ab9 == 1:
            print("\nYou remain anti social for the rest of your life. You are recruited by the CIA because you seem invisible to the world as nobody cares for you anymore. You are the perfect asset to their team.")
        if ab9 == 2:
            print("\nYou perfect soccer and become great at it. Later on in your life you are signed by one of the greatest european soccer teams. Real Madrid.")
    if ab1 == 2:
        print("\nWhen you enter your home, your parents tell you they saw the news about a bus crash. They ask you about it. What do you tell them?")
        ac1 = float(input("\nOption 1: Tell them you were in the crash, but weren't hurt or Option 2: Lie to them and tell them you don't know what they are talking about:"))
        if ac1 == 1:
            print("\nFeeling sorry for you, your parents let you stay home from school for a week to get rid of your tramatic experience. You now have an entire week to yourself. What do you decide to do?")
            ac2 = float(input("\nOption 1: Play video games all day long or Option 2: Read books all day long"))
            if ac2 == 1:
                print("\n Eventually, your eyesight fails and you become a blind teenager who is kicked out the house by your parents. You are now homeless.")
            if ac2 == 2:
                print("\n Due to your extensive knowledge on computers, gained with your bookish knowledge, you go on to be the greatest businessman alive. You are now the richest man on earth.")
        if ac1 == 2:
            print("\nYou get caught lying by your mothers in-built lie detector. You are never going out or having any type of fun in your life again.")
