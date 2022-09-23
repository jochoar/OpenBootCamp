peso = input("Cual es tu peso en kg?")
altura = input("Cual es tu altura en metros")

#mathematical formula to calculate body mass index
indexMassc = round(float(peso)/float(altura)**2.2) 
#--------------------------------------------------

print("Your body mass index is " + str(indexMassc)) 