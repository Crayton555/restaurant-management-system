package mk.ukim.finki.restaurantmanagementsystem.web;

import mk.ukim.finki.restaurantmanagementsystem.repository.CRUDRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Map;

@Controller
@RequestMapping(value = {"/crud"})
public class CRUDController {
    private final CRUDRepository crudRepository;

    public CRUDController(CRUDRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    @GetMapping("/waiters")
    public String getAllWaiters(Model model) {
        model.addAttribute("waiters", crudRepository.getAllWaiters());
        model.addAttribute("bodyContent", "crud/waiters");
        return "master-template";
    }

    @GetMapping("/waiters/{id}")
    public String getWaiterById(@PathVariable int id, Model model) {
        model.addAttribute("waiter", crudRepository.getWaiterById(id));
        model.addAttribute("bodyContent", "crud/waiter-details");
        return "master-template";
    }

    @GetMapping("/waiters/{id}/delete")
    public String deleteWaiter(@PathVariable int id) {
        crudRepository.deleteWaiter(id);
        return "redirect:/crud/waiters";
    }

    @GetMapping("/managers")
    public String getAllManagers(Model model) {
        model.addAttribute("managers", crudRepository.getAllManagers());
        model.addAttribute("bodyContent", "crud/managers");
        return "master-template";
    }

    @GetMapping("/managers/{id}")
    public String getManagerById(@PathVariable int id, Model model) {
        model.addAttribute("manager", crudRepository.getManagerById(id));
        model.addAttribute("bodyContent", "crud/manager-details");
        return "master-template";
    }

    @GetMapping("/managers/{id}/delete")
    public String deleteManager(@PathVariable int id) {
        crudRepository.deleteManager(id);
        return "redirect:/crud/managers";
    }

    @GetMapping("/chefs")
    public String getAllChefs(Model model) {
        model.addAttribute("chefs", crudRepository.getAllChefs());
        model.addAttribute("bodyContent", "crud/chefs");
        return "master-template";
    }

    @GetMapping("/chefs/{id}")
    public String getChefById(@PathVariable int id, Model model) {
        model.addAttribute("chef", crudRepository.getChefById(id));
        model.addAttribute("bodyContent", "crud/chef-details");
        return "master-template";
    }

    @GetMapping("/chefs/{id}/delete")
    public String deleteChef(@PathVariable int id) {
        crudRepository.deleteChef(id);
        return "redirect:/crud/chefs";
    }

    @GetMapping("/employees")
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", crudRepository.getAllEmployees());
        model.addAttribute("bodyContent", "crud/employees");
        return "master-template";
    }

    @GetMapping("/employees/{id}")
    public String getEmployeeById(@PathVariable int id, Model model) {
        model.addAttribute("employee", crudRepository.getEmployeeById(id));
        model.addAttribute("bodyContent", "crud/employee-details");
        return "master-template";
    }

    @GetMapping("/employees/create")
    public String getCreateEmployeePage(Model model) {
        // Add any necessary data to the model if needed
        model.addAttribute("bodyContent", "crud/create-employee");
        return "master-template";
    }

    @PostMapping("/employees")
    public String createEmployee(@RequestParam("name") String name,
                                 @RequestParam("contactInfo") String contactInfo,
                                 @RequestParam("payment") double payment,
                                 @RequestParam("startShift") String startShift,
                                 @RequestParam("endShift") String endShift,
                                 @RequestParam("managerId") int managerId,
                                 @RequestParam("chefId") int chefId,
                                 @RequestParam("waiterId") int waiterId) {
        crudRepository.createEmployee(name, contactInfo, payment, Timestamp.valueOf(startShift), Timestamp.valueOf(endShift), managerId, chefId, waiterId);
        return "redirect:/crud/employees";
    }

    @GetMapping("/employees/{id}/update")
    public String getUpdateEmployeePage(@PathVariable int id, Model model) {
        model.addAttribute("employee", crudRepository.getEmployeeById(id));
        model.addAttribute("bodyContent", "crud/update-employee");
        return "master-template";
    }

    @PostMapping("/employees/{id}/update")
    public String updateEmployee(@PathVariable int id,
                                 @RequestParam("name") String name,
                                 @RequestParam("contactInfo") String contactInfo,
                                 @RequestParam("payment") double payment,
                                 @RequestParam("startShift") String startShift,
                                 @RequestParam("endShift") String endShift,
                                 @RequestParam("managerId") int managerId,
                                 @RequestParam("chefId") int chefId,
                                 @RequestParam("waiterId") int waiterId) {
        crudRepository.updateEmployee(id, name, contactInfo, payment, Timestamp.valueOf(startShift), Timestamp.valueOf(endShift), managerId, chefId, waiterId);
        return "redirect:/crud/employees";
    }

    @GetMapping("/employees/{id}/delete")
    public String deleteEmployee(@PathVariable int id) {
        crudRepository.deleteEmployee(id);
        return "redirect:/crud/employees";
    }

    @GetMapping("/clients")
    public String getAllClients(Model model) {
        model.addAttribute("clients", crudRepository.getAllClients());
        model.addAttribute("bodyContent", "crud/clients");
        return "master-template";
    }

    @GetMapping("/clients/{id}")
    public String getClientById(@PathVariable int id, Model model) {
        model.addAttribute("client", crudRepository.getClientById(id));
        model.addAttribute("bodyContent", "crud/client-details");
        return "master-template";
    }

    @GetMapping("/clients/{id}/delete")
    public String deleteClient(@PathVariable int id) {
        crudRepository.deleteClient(id);
        return "redirect:/crud/clients";
    }

    @GetMapping("/clients/create")
    public String getCreateClientPage(Model model) {
        // Add any necessary data to the model if needed
        model.addAttribute("bodyContent", "crud/create-client");
        return "master-template";
    }

    @PostMapping("/clients")
    public String createClient(@RequestParam("name") String name,
                               @RequestParam("email") String email,
                               @RequestParam("telephoneNumber") String telephoneNumber) {
        crudRepository.createClient(name, email, telephoneNumber);
        return "redirect:/crud/clients";
    }

    @GetMapping("/clients/{id}/update")
    public String getUpdateClientPage(@PathVariable int id, Model model) {
        model.addAttribute("client", crudRepository.getClientById(id));
        model.addAttribute("bodyContent", "crud/update-client");
        return "master-template";
    }

    @PostMapping("/clients/{id}/update")
    public String updateClient(@PathVariable int id,
                               @RequestParam("name") String name,
                               @RequestParam("email") String email,
                               @RequestParam("telephoneNumber") String telephoneNumber) {
        crudRepository.updateClient(id, name, email, telephoneNumber);
        return "redirect:/crud/clients";
    }

    @GetMapping("/suppliers")
    public String getAllSuppliers(Model model) {
        model.addAttribute("suppliers", crudRepository.getAllSuppliers());
        model.addAttribute("bodyContent", "crud/suppliers");
        return "master-template";
    }

    @GetMapping("/suppliers/{id}")
    public String getSupplierById(@PathVariable int id, Model model) {
        Map<String, Object> supplier = crudRepository.getSupplierById(id);
        if (supplier != null) {
            model.addAttribute("supplier", supplier);
            model.addAttribute("bodyContent", "crud/supplier-details");
        } else {
            model.addAttribute("errorMessage", "Supplier not found");
            model.addAttribute("bodyContent", "error");
        }
        return "master-template";
    }

    @GetMapping("/suppliers/{id}/delete")
    public String deleteSupplier(@PathVariable int id) {
        crudRepository.deleteSupplier(id);
        return "redirect:/crud/suppliers";
    }

    @GetMapping("/suppliers/create")
    public String getCreateSupplierPage(Model model) {
        model.addAttribute("bodyContent", "crud/create-supplier");
        return "master-template";
    }

    @PostMapping("/suppliers")
    public String createSupplier(@RequestParam("name") String name,
                                 @RequestParam("contactInfo") String contactInfo) {
        crudRepository.createSupplier(name, contactInfo);
        return "redirect:/crud/suppliers";
    }

    @GetMapping("/suppliers/{id}/update")
    public String getUpdateSupplierPage(@PathVariable int id, Model model) {
        Map<String, Object> supplier = crudRepository.getSupplierById(id);
        if (supplier != null) {
            model.addAttribute("supplier", supplier);
            model.addAttribute("bodyContent", "crud/update-supplier");
        } else {
            model.addAttribute("errorMessage", "Supplier not found");
            model.addAttribute("bodyContent", "error");
        }
        return "master-template";
    }

    @PostMapping("/suppliers/{id}/update")
    public String updateSupplier(@PathVariable int id,
                                 @RequestParam("name") String name,
                                 @RequestParam("contactInfo") String contactInfo) {
        crudRepository.updateSupplier(id, name, contactInfo);
        return "redirect:/crud/suppliers";
    }

    @GetMapping("/ingredients")
    public String getAllIngredients(Model model) {
        model.addAttribute("ingredients", crudRepository.getAllIngredients());
        model.addAttribute("bodyContent", "crud/ingredients");
        return "master-template";
    }

    @GetMapping("/ingredients/{id}")
    public String getIngredientById(@PathVariable int id, Model model) {
        model.addAttribute("ingredient", crudRepository.getIngredientById(id));
        model.addAttribute("bodyContent", "crud/ingredient-details");
        return "master-template";
    }

    @GetMapping("/ingredients/{id}/delete")
    public String deleteIngredient(@PathVariable int id) {
        crudRepository.deleteIngredient(id);
        return "redirect:/crud/ingredients";
    }

    @GetMapping("/ingredients/create")
    public String getCreateIngredientPage(Model model) {
        // Add any necessary data to the model if needed
        model.addAttribute("bodyContent", "crud/create-ingredient");
        return "master-template";
    }

    @PostMapping("/ingredients")
    public String createIngredient(@RequestParam("name") String name,
                                   @RequestParam("supplies") int supplies) {
        crudRepository.createIngredient(name, supplies);
        return "redirect:/crud/ingredients";
    }

    @GetMapping("/ingredients/{id}/update")
    public String getUpdateIngredientPage(@PathVariable int id, Model model) {
        model.addAttribute("ingredient", crudRepository.getIngredientById(id));
        model.addAttribute("bodyContent", "crud/update-ingredient");
        return "master-template";
    }

    @PostMapping("/ingredients/{id}/update")
    public String updateIngredient(@PathVariable int id,
                                   @RequestParam("name") String name,
                                   @RequestParam("supplies") int supplies) {
        crudRepository.updateIngredient(id, name, supplies);
        return "redirect:/crud/ingredients";
    }


}
