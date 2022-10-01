package com.CarCompany;

import java.util.List;
public class carCRUDimpl implements CarsCRUD{

    @Override
    public void save(Car car) {
       System.out.println("Saving car");
       //code 
    }

    @Override
    public void delete(Car car) {
        System.out.println("Deleting car");
        //code
    }

    @Override
    public List<Car> findAll() {
        return null;
        //code
    }
     
    
   
}
