#In this second exercise, you will have to create a program that has a class called Student,
# that has its name and grade as attributes. 
# You must define the methods to initialize its attributes,
# print them and display a message with the result of the grade and if it has passed or not.

class Student():
  
  def init(self,name,grade):
        self.name=name
        self.grade=grade

  def printData(self):
        print("Name:",self.name)
        print("Grade:",self.grade)

  def printStatus(self):
        if self.grade > 5:
            print("Approbed")
        else:
            print("Disapprobed")
            
student1 = Student()
student1.init("Diego",2)
student1.printData()
student1.printStatus()

print("")


student2= Student()
student2.init("Ana",10)
student2.printData()
student2.printStatus()            