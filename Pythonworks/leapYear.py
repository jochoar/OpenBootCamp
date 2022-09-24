# Write a function that can tell you if a year (integer) is a leap year or not. #

def leapyears(year):
 
   if year % 4 == 0:
       print ("Is a leap-year")
   
   else: 
       print ("Not is a leap-year")
   
   
year = input("Wich year? ")

leapyears(int(year))  
  