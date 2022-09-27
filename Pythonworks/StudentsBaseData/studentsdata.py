import sqlite3
from sqlite3 import *
conn = sqlite3.connect("studentsDATA.db")
cursor = conn.cursor()

rows = cursor.execute("SELECT * FROM users WHERE username='Carlos'")
for row in rows:
 print(rows)
 



cursor.close()
conn.close()