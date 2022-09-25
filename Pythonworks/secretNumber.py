#Identify the secret number

secretNumber = 50
value = 0
while value != secretNumber :
    value = int ( input(" Enter a number : "))

    if value > secretNumber :
        print ("very high ")
        continue
   
    if value < secretNumber :
        print ("Very low ") 
        continue

    if  value == secretNumber :
        print ("You got it")    