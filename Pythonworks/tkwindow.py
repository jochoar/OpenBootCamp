#In this exercise you have to create a RadioButton list that shows the option that has been selected,
#and that contains a reset button so that it leaves everything as it was at the beginning.
#At first there does not have to be an option selected.
import tkinter as tk

class Aplication:
   
    def __init__(self):
        self.window1=tk.Tk()
        self.select=tk.IntVar()
        self.select.set(None)
        
        self.radio1=tk.Radiobutton(self.window1,text="Student ", variable=self.select, value=1)
        self.radio1.grid(column=0, row=0)
        
        self.radio2=tk.Radiobutton(self.window1,text="Teacher ", variable=self.select, value=2)
        self.radio2.grid(column=0, row=1)
        
        self.button1=tk.Button(self.window1, text="Show selected", command=self.showselected)
        self.button1.grid(column=0, row=2)
        
        self.button2=tk.Button(self.window1, text="Reset", command=self.resetFields)
        self.button2.grid(column=0, row=3)
       
        self.label1=tk.Label(self.window1,text="Option selected ")
        self.label1.grid(column=0, row=4)
        
        self.window1.mainloop()   
         
    def showselected(self):
        
        if self.select.get()==1:
            self.label1.configure(text="Option selected=Student")
        if self.select.get()==2:
            self.label1.configure(text="Option selected=Teacher")
            
    def resetFields(self):
        
          self.select.set(None)
          self.label1.config(text= f"")
        

aplication1=Aplication() 