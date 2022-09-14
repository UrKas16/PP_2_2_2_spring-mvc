package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.CarService;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(name = "count", defaultValue = "5") int pcsCar, ModelMap model) {
        CarService carService = new CarService();
        model.addAttribute("carList", carService.returnCarsQnty(pcsCar));
        return "cars";
    }

}
