package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService{
    private final CarDao dao;

    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.dao = carDao;
    }

    @Override
    public List<Car> getListOfCars(int count){
        return dao.getListOfCars(count);
    }
}
