package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.Service.CarService;

@Controller
public class CarController {

    @Autowired
    private CarService cars;

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(name = "count", defaultValue = "5") int pcsCar, ModelMap model) {
        model.addAttribute("carList", cars.returnCarsQnty(pcsCar));
        return "cars";
    }

}
