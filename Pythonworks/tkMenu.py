#In this second exercise, you will have to create a simple interface
# which must contain a list of selectable elements,
# it must also have a label with the text that you want.

import tkinter as tk
from tkinter import ttk


class windowMenu(ttk.Frame):
    
    def __init__(self, main_window):
        super().__init__(main_window)
        main_window.title("What do you want to learn?: ")
        
        self.checkbox1 = ttk.Checkbutton(self, text="Java")
        self.checkbox1.place(x=40, y=40)
        
        self.checkbox2 = ttk.Checkbutton(self, text="Javascript")
        self.checkbox2.place(x=40, y=70)
        
        self.checkbox3 = ttk.Checkbutton(self, text="Python")
        self.checkbox3.place(x=40, y=100)
        
        self.checkbox4 = ttk.Checkbutton(self, text="Frameworks")
        self.checkbox4.place(x=40, y=130)
        
        self.label1=ttk.Label(self,text="Enjoy and learn! ", background="Cyan")
        self.label1.place( x=50, y=160)
        
        self.place(width=1300, height=1200)
        
main_window = tk.Tk()
app = windowMenu(main_window)
app.mainloop()