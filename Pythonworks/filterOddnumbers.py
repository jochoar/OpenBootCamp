#In this second exercise, you have to create an application that will obtain the odd elements of a list 
# passed by parameter with filter and will make a sum of all these elements obtained by means of reduce.

def filterOdd(numbers):
    odd = []
    
    for n in numbers:
        if n % 2 == 1:
                odd.append(n)
    
    return odd

listNumbers = list(range(1,100))
print(type(listNumbers))
results = filterOdd(listNumbers)
print(results)            