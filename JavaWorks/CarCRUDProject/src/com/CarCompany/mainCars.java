package com.CarCompany;

public class mainCars {
    static CarsCRUD carshondaCRUD = new carCRUDimpl();//Instantiating objects

  public static void main(String[] args) {
      //Using some methods
      carshondaCRUD.save(null);  
      carshondaCRUD.delete(null);
      carshondaCRUD.findAll();

    }

}




