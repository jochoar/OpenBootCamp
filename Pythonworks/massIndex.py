peso = input("What is your weight in kg?")
altura = input("What is your height in meters?")

#mathematical formula to calculate body mass index
indexMassc = round(float(peso)/float(altura)**2.2) 
#--------------------------------------------------

print("Your body mass index is " + str(indexMassc)) 