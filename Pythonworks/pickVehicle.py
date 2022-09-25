import pickle

class pvehicle ():
    color= " "
    doors= 0
    model= " "
    
    def __init__ ( self, color, doors, model ):
      self.color = color
      self.doors = doors
      self.model = model
  
    def getmodel( self ) :
      return self.model 



ff = open("pVehicle.bin", "rb")
honda= pickle.load(ff)
ff.close()

print(type(honda))
print(honda.getmodel())






    