#You will import this module into a python file and call the created functions.
# You have to show the results by console.

import operations

def main():
  resSum = operations.sum(2, 2)
  resSubt = operations.subtraction(4, 1)
  resMulti = operations.multiplication(3, 4)
  resDivi = operations.division(10, 2)
  
  print("hello", resSum, resSubt, resMulti, resDivi)
  
if __name__ == '__main__' :
    main()