package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceCar;
import web.service.ServiceCarImpl;

import java.util.Optional;

@Controller
public class CarController {
    private ServiceCar serviceCar;

    @Autowired
    public CarController() {
        serviceCar = new ServiceCarImpl();
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Optional<Integer> count, Model model) {
        model.addAttribute("messages", serviceCar.getListCar(count.orElse(0)));
        return "cars";
    }
}
