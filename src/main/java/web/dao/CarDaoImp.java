package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    @Autowired
    private List<Car> allCar;

    @Override
    public List<Car> getListOfCars(int count){
        if (count <= 0) return allCar;
        return allCar.stream().limit(count).toList();
    }
}
