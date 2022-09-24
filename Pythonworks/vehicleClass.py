#In this exercise you will create the Vehicle class which will have the following attributes: Color, Wheels, Doors. 
#On the other hand, you will create the Car class which will inherit from Vehicle and will have the following attributes: speed, cylinder capacity. 
# Finally, you will have to create an object of the Car class and display it on the console.

from turtle import color


class Vehicle ():
    color = "red" 
    wheels = 4
    doors = 5


class Car (Vehicle):
    maxSpeed = 200
    cylinderCapacity = 3500
    

sportCar = Car()

print("Color is ", sportCar.color)
print("Max speed is ", sportCar.maxSpeed, "Km/h")
print("Cylinder capacity", sportCar.cylinderCapacity, "C.C")        
print("Number of doors ", sportCar.doors)