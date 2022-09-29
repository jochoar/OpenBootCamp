package javaExcercises;

public class priceIva {
    public static void main(String[] args) {
        //For this exercise you will have to create a function that 
        //receives a price and returns the price including IVA.

        System.out.println("The cost including IVA is: " + totalCost());}

        public static double totalCost(){  
            double price =1500;
            double iva = 1.19;
            System.out.println("Product price: " + price);
            return price * iva ;
               
    }

     
    

}