package com.CarCompany;

import java.util.List;

//Method declaration that should you use:

public interface CarsCRUD {
    
    void save(Car car);

    
    List<Car> findAll();
        

    void delete(Car car);
}
