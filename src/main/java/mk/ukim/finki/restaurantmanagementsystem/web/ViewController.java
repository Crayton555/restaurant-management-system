package mk.ukim.finki.restaurantmanagementsystem.web;

import mk.ukim.finki.restaurantmanagementsystem.repository.RestaurantViewRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = {"/views"})
public class ViewController {

    private final RestaurantViewRepository restaurantViewRepository;

    public ViewController(RestaurantViewRepository restaurantViewRepository) {
        this.restaurantViewRepository = restaurantViewRepository;
    }

    @GetMapping()
    public String getViews(Model model) {
        model.addAttribute("bodyContent", "views/views");

        return "master-template";
    }

    @GetMapping("/employeeDetails")
    public String getEmployees(Model model) {
        List<Map<String, Object>> employeeDetails = this.restaurantViewRepository.getEmployeeDetails();

        model.addAttribute("employeeDetails", employeeDetails);
        model.addAttribute("bodyContent", "views/employee_details");

        return "master-template";
    }

    @GetMapping("/cookedItemDetails")
    public String getCookedItemDetails(Model model) {
        List<Map<String, Object>> cookedItemDetails = this.restaurantViewRepository.getCookedItemDetails();

        model.addAttribute("cookedItemDetails", cookedItemDetails);
        model.addAttribute("bodyContent", "views/cooked_item_details");

        return "master-template";
    }

    @GetMapping("/menuItemDetails")
    public String getMenuItemDetails(Model model) {
        List<Map<String, Object>> menuItemDetails = this.restaurantViewRepository.getMenuItemDetails();

        model.addAttribute("menuItemDetails", menuItemDetails);
        model.addAttribute("bodyContent", "views/menu_item_details");

        return "master-template";
    }

    @GetMapping("/orderDetails")
    public String getOrderDetails(Model model) {
        List<Map<String, Object>> orderDetails = this.restaurantViewRepository.getOrderDetails();

        model.addAttribute("orderDetails", orderDetails);
        model.addAttribute("bodyContent", "views/order_details");

        return "master-template";
    }

    @GetMapping("/viewIngredientsPriceHistory")
    public String getViewIngredientsPriceHistory(Model model) {
        List<Map<String, Object>> viewIngredientsPriceHistory = this.restaurantViewRepository.getViewIngredientsPriceHistory();

        model.addAttribute("viewIngredientsPriceHistory", viewIngredientsPriceHistory);
        model.addAttribute("bodyContent", "views/view_ingredients_price_history");

        return "master-template";
    }

    @GetMapping("/viewIngredientsSupplier")
    public String getViewIngredientsSupplier(Model model) {
        List<Map<String, Object>> viewIngredientsSupplier = this.restaurantViewRepository.getViewIngredientsSupplier();

        model.addAttribute("viewIngredientsSupplier", viewIngredientsSupplier);
        model.addAttribute("bodyContent", "views/view_ingredients_supplier");

        return "master-template";
    }

    @GetMapping("/viewLoyaltyProgramPoints")
    public String getViewLoyaltyProgramPoints(Model model) {
        List<Map<String, Object>> viewLoyaltyProgramPoints = this.restaurantViewRepository.getViewLoyaltyProgramPoints();

        model.addAttribute("viewLoyaltyProgramPoints", viewLoyaltyProgramPoints);
        model.addAttribute("bodyContent", "views/view_loyalty_program_points");

        return "master-template";
    }

    @GetMapping("/viewMenu")
    public String getViewMenu(Model model) {
        List<Map<String, Object>> viewMenu = this.restaurantViewRepository.getViewMenu();

        model.addAttribute("viewMenu", viewMenu);
        model.addAttribute("bodyContent", "views/view_menu");

        return "master-template";
    }

    @GetMapping("/viewMenuItemsPriceHistory")
    public String getViewMenuItemsPriceHistory(Model model) {
        List<Map<String, Object>> viewMenuItemsPriceHistory = this.restaurantViewRepository.getViewMenuItemsPriceHistory();

        model.addAttribute("viewMenuItemsPriceHistory", viewMenuItemsPriceHistory);
        model.addAttribute("bodyContent", "views/view_menu_items_price_history");

        return "master-template";
    }

    @GetMapping("/viewReview")
    public String getViewReview(Model model) {
        List<Map<String, Object>> viewReview = this.restaurantViewRepository.getViewReview();

        model.addAttribute("viewReview", viewReview);
        model.addAttribute("bodyContent", "views/view_review");

        return "master-template";
    }

    @GetMapping("/viewTableReservations")
    public String getViewTableReservations(Model model) {
        List<Map<String, Object>> viewTableReservations = this.restaurantViewRepository.getViewTableReservations();

        model.addAttribute("viewTableReservations", viewTableReservations);
        model.addAttribute("bodyContent", "views/view_table_reservations");

        return "master-template";
    }

    @GetMapping("/waiterAvgGrade")
    public String getWaiterAvgGrade(Model model) {
        List<Map<String, Object>> waiterAvgGrade = this.restaurantViewRepository.getWaiterAvgGrade();

        model.addAttribute("waiterAvgGrade", waiterAvgGrade);
        model.addAttribute("bodyContent", "views/waiter_avg_grade");

        return "master-template";
    }
}