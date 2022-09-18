public class ExcercisesCar {
  
   //Create a car class, inside the car class, A numeric variable that stores the number of doors it has, A function that increments the number of doors the car has, Create a myCar object in main and add a door to it, Show the number of doors the object has//
    public static void main(String[] args) {
        Car myCar = new Car();
     
     
     myCar.PutDoors();
     myCar.PutDoors();

     System.out.println(myCar.doors);
    }
}
    class Car {
        public int doors = 0;
        
    
        public void PutDoors () {
          this.doors++;
        }
      }

