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

    @GetMapping("/employeeDetails")
    public String getEmployees(Model model) {
        List<Map<String, Object>> employeeDetails = this.restaurantViewRepository.getEmployeeDetails();

        model.addAttribute("employeeDetails", employeeDetails);
        model.addAttribute("bodyContent", "employee_details");

        return "master-template";
    }
    @GetMapping("/cookedItemDetails")
    public String getCookedItemDetails(Model model) {
        List<Map<String, Object>> cookedItemDetails = this.restaurantViewRepository.getCookedItemDetails();

        model.addAttribute("cookedItemDetails", cookedItemDetails);
        model.addAttribute("bodyContent", "cooked_item_details");

        return "master-template";
    }

    @GetMapping("/menuItemDetails")
    public String getMenuItemDetails(Model model) {
        List<Map<String, Object>> menuItemDetails = this.restaurantViewRepository.getMenuItemDetails();

        model.addAttribute("menuItemDetails", menuItemDetails);
        model.addAttribute("bodyContent", "menu_item_details");

        return "master-template";
    }

    @GetMapping("/orderDetails")
    public String getOrderDetails(Model model) {
        List<Map<String, Object>> orderDetails = this.restaurantViewRepository.getOrderDetails();

        model.addAttribute("orderDetails", orderDetails);
        model.addAttribute("bodyContent", "order_details");

        return "master-template";
    }

    @GetMapping("/viewIngredientsPriceHistory")
    public String getViewIngredientsPriceHistory(Model model) {
        List<Map<String, Object>> viewIngredientsPriceHistory = this.restaurantViewRepository.getViewIngredientsPriceHistory();

        model.addAttribute("viewIngredientsPriceHistory", viewIngredientsPriceHistory);
        model.addAttribute("bodyContent", "view_ingredients_price_history");

        return "master-template";
    }

    @GetMapping("/viewIngredientsSupplier")
    public String getViewIngredientsSupplier(Model model) {
        List<Map<String, Object>> viewIngredientsSupplier = this.restaurantViewRepository.getViewIngredientsSupplier();

        model.addAttribute("viewIngredientsSupplier", viewIngredientsSupplier);
        model.addAttribute("bodyContent", "view_ingredients_supplier");

        return "master-template";
    }
}
