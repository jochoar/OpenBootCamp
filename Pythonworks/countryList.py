#Create a script that prompts the user for a list of countries (separated by commas).
# These must be stored in a list. There should be no repeated countries (make use of set).
# Finally, it shows by console the list of countries ordered alphabetically and separated by commas.

listC = input ("Enter list of countries separated by commas: ")

conList = set(listC.split())
conList = sorted(conList)

print ("The list is: ", conList)