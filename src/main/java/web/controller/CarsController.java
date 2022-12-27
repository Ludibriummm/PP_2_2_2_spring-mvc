package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {
    private final CarService service;

    @Autowired
    public CarsController(CarService service) {
        this.service = service;
    }

    @GetMapping(value = "/cars")
    public String carsPage(ModelMap model,
                           @RequestParam(value = "count", defaultValue = "5", required = false) Integer count){
        model.addAttribute("messages", service.getListOfCars(count));
        return "car/cars";
    }
}
