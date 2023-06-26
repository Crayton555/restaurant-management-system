package mk.ukim.finki.restaurantmanagementsystem.web;

import mk.ukim.finki.restaurantmanagementsystem.repository.GenerateDataRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = {"/generateData"})
public class GenerateDataController {
    private final GenerateDataRepository generateDataRepository;

    public GenerateDataController(GenerateDataRepository generateDataRepository) {
        this.generateDataRepository = generateDataRepository;
    }

    @GetMapping()
    public String generateDataLinks(Model model) {
        model.addAttribute("bodyContent", "generateData/generate_data_links");
        return "master-template";
    }

    @GetMapping("/insertClients")
    public String showInsertClients(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_clients");
        return "master-template";
    }

    @PostMapping("/insertClients")
    public String insertClients(@RequestParam("numClients") int numClients, Model model) {
        generateDataRepository.insertClients(numClients);
        model.addAttribute("successMessage", "Clients inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_clients");
        return "master-template";
    }

    @GetMapping("/insertLoyaltyPrograms")
    public String showInsertLoyaltyPrograms(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_loyalty_programs");
        return "master-template";
    }

    @PostMapping("/insertLoyaltyPrograms")
    public String insertLoyaltyPrograms(@RequestParam("numPrograms") int numPrograms, Model model) {
        generateDataRepository.insertLoyaltyPrograms(numPrograms);
        model.addAttribute("successMessage", "Loyalty programs inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_loyalty_programs");
        return "master-template";
    }

    @GetMapping("/insertReviews")
    public String showInsertReviews(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_reviews");
        return "master-template";
    }

    @PostMapping("/insertReviews")
    public String insertReviews(@RequestParam("numReviews") int numReviews, Model model) {
        generateDataRepository.insertReviews(numReviews);
        model.addAttribute("successMessage", "Reviews inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_reviews");
        return "master-template";
    }

    @GetMapping("/insertMenuItems")
    public String showInsertMenuItems(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_menu_items");
        return "master-template";
    }

    @PostMapping("/insertMenuItems")
    public String insertMenuItems(@RequestParam("numMenuItems") int numMenuItems, Model model) {
        generateDataRepository.insertMenuItems(numMenuItems);
        model.addAttribute("successMessage", "Menu items inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_menu_items");
        return "master-template";
    }

    @GetMapping("/insertIngredients")
    public String showInsertIngredients(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_ingredients");
        return "master-template";
    }

    @PostMapping("/insertIngredients")
    public String insertIngredients(@RequestParam("numIngredients") int numIngredients, Model model) {
        generateDataRepository.insertIngredients(numIngredients);
        model.addAttribute("successMessage", "Ingredients inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_ingredients");
        return "master-template";
    }

    @GetMapping("/insertIngredientsMenuItems")
    public String showInsertIngredientsMenuItems(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_ingredients_menu_items");
        return "master-template";
    }

    @PostMapping("/insertIngredientsMenuItems")
    public String insertIngredientsMenuItems(@RequestParam("numEntries") int numEntries, Model model) {
        generateDataRepository.insertIngredientsMenuItems(numEntries);
        model.addAttribute("successMessage", "Ingredients-Menu Items entries inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_ingredients_menu_items");
        return "master-template";
    }

    @GetMapping("/insertSuppliers")
    public String showInsertSuppliers(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_suppliers");
        return "master-template";
    }

    @PostMapping("/insertSuppliers")
    public String insertSuppliers(@RequestParam("numSuppliers") int numSuppliers, Model model) {
        generateDataRepository.insertSuppliers(numSuppliers);
        model.addAttribute("successMessage", "Suppliers inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_suppliers");
        return "master-template";
    }

    @GetMapping("/insertIngredientsSupplier")
    public String showInsertIngredientsSupplier(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_ingredients_supplier");
        return "master-template";
    }

    @PostMapping("/insertIngredientsSupplier")
    public String insertIngredientsSupplier(@RequestParam("numIngredientsSupplier") int numIngredientsSupplier, Model model) {
        generateDataRepository.insertIngredientsSupplier(numIngredientsSupplier);
        model.addAttribute("successMessage", "Ingredients Supplier inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_ingredients_supplier");
        return "master-template";
    }

    @GetMapping("/insertIngredientsPriceHistory")
    public String showInsertIngredientsPriceHistory(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_ingredients_price_history");
        return "master-template";
    }

    @PostMapping("/insertIngredientsPriceHistory")
    public String insertIngredientsPriceHistory(@RequestParam("numIngredientsPriceHistory") int numIngredientsPriceHistory, Model model) {
        generateDataRepository.insertIngredientsPriceHistory(numIngredientsPriceHistory);
        model.addAttribute("successMessage", "Ingredients Price History inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_ingredients_price_history");
        return "master-template";
    }

    @GetMapping("/insertMenuItemsPriceHistory")
    public String showInsertMenuItemsPriceHistory(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_menu_items_price_history");
        return "master-template";
    }

    @PostMapping("/insertMenuItemsPriceHistory")
    public String insertMenuItemsPriceHistory(@RequestParam("numMenuItemsPriceHistory") int numMenuItemsPriceHistory, Model model) {
        generateDataRepository.insertMenuItemsPriceHistory(numMenuItemsPriceHistory);
        model.addAttribute("successMessage", "Menu Items Price History inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_menu_items_price_history");
        return "master-template";
    }

    @GetMapping("/insertCookedItems")
    public String showInsertCookedItems(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_cooked_items");
        return "master-template";
    }

    @PostMapping("/insertCookedItems")
    public String insertCookedItems(@RequestParam("numCookedItems") int numCookedItems, Model model) {
        generateDataRepository.insertCookedItems(numCookedItems);
        model.addAttribute("successMessage", "Cooked Items inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_cooked_items");
        return "master-template";
    }

    @GetMapping("/insertTables")
    public String showInsertTables(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_tables");
        return "master-template";
    }

    @PostMapping("/insertTables")
    public String insertTables(@RequestParam("numTables") int numTables, Model model) {
        generateDataRepository.insertTables(numTables);
        model.addAttribute("successMessage", "Tables inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_tables");
        return "master-template";
    }

    @GetMapping("/insertTableReservations")
    public String showInsertTableReservations(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_table_reservations");
        return "master-template";
    }

    @PostMapping("/insertTableReservations")
    public String insertTableReservations(@RequestParam("numTableReservations") int numTableReservations, Model model) {
        generateDataRepository.insertTableReservations(numTableReservations);
        model.addAttribute("successMessage", "Table reservations inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_table_reservations");
        return "master-template";
    }

    @GetMapping("/insertOrders")
    public String showInsertOrders(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_orders");
        return "master-template";
    }

    @PostMapping("/insertOrders")
    public String insertOrders(@RequestParam("numOrders") int numOrders, Model model) {
        generateDataRepository.insertOrders(numOrders);
        model.addAttribute("successMessage", "Orders inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_orders");
        return "master-template";
    }

    @GetMapping("/insertEmployees")
    public String showInsertEmployees(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_employees");
        return "master-template";
    }

    @PostMapping("/insertEmployees")
    public String insertEmployees(@RequestParam("numEmployees") int numEmployees, Model model) {
        generateDataRepository.insertEmployees(numEmployees);
        model.addAttribute("successMessage", "Employees inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_employees");
        return "master-template";
    }

    @GetMapping("/insertWaiters")
    public String InsertWaiters(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_waiters");
        return "master-template";
    }

    @PostMapping("/insertWaiters")
    public String insertWaiters(@RequestParam("numWaiters") int numWaiters, Model model) {
        generateDataRepository.insertWaiters(numWaiters);
        model.addAttribute("successMessage", "Waiters inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_waiters");
        return "master-template";
    }

    @GetMapping("/insertChefs")
    public String InsertChefs(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_chefs");
        return "master-template";
    }

    @PostMapping("/insertChefs")
    public String insertChefs(@RequestParam("numChefs") int numChefs, Model model) {
        generateDataRepository.insertChefs(numChefs);
        model.addAttribute("successMessage", "Chefs inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_chefs");
        return "master-template";
    }

    @GetMapping("/insertManagers")
    public String InsertManagers(Model model) {
        model.addAttribute("bodyContent", "generateData/insert_managers");
        return "master-template";
    }

    @PostMapping("/insertManagers")
    public String insertManagers(@RequestParam("numManagers") int numManagers, Model model) {
        generateDataRepository.insertManagers(numManagers);
        model.addAttribute("successMessage", "Managers inserted successfully!");
        model.addAttribute("bodyContent", "generateData/insert_managers");
        return "master-template";
    }
}
