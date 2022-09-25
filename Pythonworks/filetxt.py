#In this exercise, you will have to create a py file where you create a txt file,
# open it and write inside the file.
# To do this, you will have to access the created file twice.

f =open ("filedata.txt", "w")
f.write("Hello people!\n")
f.close()

f =open ("filedata.txt", "a")
f.write("I am here\n")
print(f.readlines)
f.close()

