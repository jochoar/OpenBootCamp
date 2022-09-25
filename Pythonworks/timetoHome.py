from datetime import date, datetime, time


date = datetime.now()
print(date)

dateNow= datetime.strftime(date, "%d/%m/%Y %H:%M:%S")
timeNow= datetime.strftime(date, "%H:%M:%S")

print(timeNow)

futureTime= datetime(2022, 9, 25, 19, 0, 0)
difference= futureTime - date
#-----------------------------------------------------

if difference == 0:
    print("Is time to go home")

else:
 print("Left", difference ,"hours to go home. ")