package mk.ukim.finki.restaurantmanagementsystem.web;

import mk.ukim.finki.restaurantmanagementsystem.repository.RestaurantViewRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = {"/home"})
public class HomeController {

    private final RestaurantViewRepository restaurantViewRepository;

    public HomeController(RestaurantViewRepository restaurantViewRepository) {
        this.restaurantViewRepository = restaurantViewRepository;
    }


}
