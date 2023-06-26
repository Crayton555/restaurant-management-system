package mk.ukim.finki.restaurantmanagementsystem.web;

import mk.ukim.finki.restaurantmanagementsystem.repository.FunctionProcedureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = {"/functionProcedures"})
public class FunctionProcedureController {
    private final FunctionProcedureRepository functionProcedureRepository;

    public FunctionProcedureController(FunctionProcedureRepository functionProcedureRepository) {
        this.functionProcedureRepository = functionProcedureRepository;
    }

    @GetMapping()
    public String showFunctionProcedures(Model model) {
        model.addAttribute("bodyContent", "functionProcedures/functionProcedures");

        return "master-template";
    }

    @GetMapping("/updateMenuItemPrice")
    public String showUpdateMenuItemPriceForm(Model model) {
        model.addAttribute("bodyContent", "functionProcedures/update_menu_item_price");

        return "master-template";
    }

    @PostMapping("/updateMenuItemPrice")
    public String updateMenuItemPrice(
            @RequestParam("menuItemId") int menuItemId,
            @RequestParam("newPrice") int newPrice,
            Model model
    ) {
        this.functionProcedureRepository.updateMenuItemPrice(menuItemId, newPrice);
        model.addAttribute("successMessage", "Menu item price updated successfully!");
        model.addAttribute("bodyContent", "functionProcedures/update_menu_item_price");

        return "master-template";
    }

    @GetMapping("/checkIngredientAvailability")
    public String showIngredientAvailabilityForm(Model model) {
        model.addAttribute("bodyContent", "functionProcedures/check_ingredient_availability");

        return "master-template";
    }

    @PostMapping("/checkIngredientAvailability")
    public String checkIngredientAvailability(
            @RequestParam("ingredientId") int ingredientId,
            Model model
    ) {
        boolean availability = this.functionProcedureRepository.checkIngredientAvailability(ingredientId);
        model.addAttribute("ingredientId", ingredientId);
        model.addAttribute("availability", availability);
        model.addAttribute("bodyContent", "functionProcedures/check_ingredient_availability");

        return "master-template";
    }

    @GetMapping("/getTopRatedWaiter")
    public String getTopRatedWaiter(Model model) {
        Map<String, Object> topRatedWaiter = functionProcedureRepository.getTopRatedWaiter();
        model.addAttribute("waiter", topRatedWaiter);
        model.addAttribute("bodyContent", "functionProcedures/get_top_rated_waiter");
        return "master-template";
    }

    @GetMapping("/getAvailableTables")
    public String showAvailableTablesForm(Model model) {
        model.addAttribute("bodyContent", "functionProcedures/get_available_tables");
        return "master-template";
    }

    @PostMapping("/getAvailableTables")
    public String getAvailableTables(
            @RequestParam("reservationDate") String reservationDate,
            @RequestParam("reservationTime") String reservationTime,
            Model model
    ) {
        LocalDate date = LocalDate.parse(reservationDate);
        LocalTime time = LocalTime.parse(reservationTime);
        List<Map<String, Object>> availableTables = functionProcedureRepository.getAvailableTables(date, time);

        model.addAttribute("availableTables", availableTables);
        model.addAttribute("bodyContent", "functionProcedures/get_available_tables");
        return "master-template";
    }

    @GetMapping("/updateTableReservationStatus")
    public String showUpdateTableReservationStatusForm(Model model) {
        model.addAttribute("bodyContent", "functionProcedures/update_table_reservation_status");
        return "master-template";
    }

    @PostMapping("/updateTableReservationStatus")
    public String updateTableReservationStatus(
            @RequestParam("reservationId") int reservationId,
            @RequestParam("newStatus") String newStatus,
            Model model
    ) {
        functionProcedureRepository.updateTableReservationStatus(reservationId, newStatus);
        model.addAttribute("successMessage", "Table reservation status updated successfully!");
        model.addAttribute("bodyContent", "functionProcedures/update_table_reservation_status");

        return "master-template";
    }

    @GetMapping("/getWaiterAverageGrade")
    public String showWaiterAverageGradeForm(Model model) {
        model.addAttribute("bodyContent", "functionProcedures/get_waiter_average_grade");
        return "master-template";
    }

    @PostMapping("/getWaiterAverageGrade")
    public String getWaiterAverageGrade(@RequestParam("waiterId") int waiterId, Model model) {
        double averageGrade = functionProcedureRepository.getWaiterAverageGrade(waiterId);
        model.addAttribute("waiterId", waiterId);

        if (averageGrade != 0.0) {
            model.addAttribute("averageGrade", averageGrade);
        }

        model.addAttribute("bodyContent", "functionProcedures/get_waiter_average_grade");
        return "master-template";
    }

    @GetMapping("/getAverageOrderPrice")
    public String getAverageOrderPrice(Model model) {
        model.addAttribute("bodyContent", "functionProcedures/get_average_order_price");
        return "master-template";
    }

    @PostMapping("/getAverageOrderPrice")
    public String getAverageOrderPrice(@RequestParam("startDate") String startDate,
                                       @RequestParam("endDate") String endDate,
                                       Model model) {
        double averagePrice = functionProcedureRepository.getAverageOrderPrice(startDate, endDate);
        model.addAttribute("startDate", startDate);
        model.addAttribute("endDate", endDate);
        model.addAttribute("averagePrice", averagePrice);
        model.addAttribute("bodyContent", "functionProcedures/get_average_order_price");
        return "master-template";
    }

    @GetMapping("/calculateTotalPaymentShift")
    public String calculateTotalPaymentShiftForm(Model model) {
        model.addAttribute("bodyContent", "functionProcedures/calculate_total_payment_shift");
        return "master-template";
    }

    @PostMapping("/calculateTotalPaymentShift")
    public String calculateTotalPaymentShift(
            @RequestParam("empId") int empId,
            Model model
    ) {
        double totalPayment = functionProcedureRepository.calculateTotalPaymentShift(empId);
        model.addAttribute("empId", empId);
        model.addAttribute("totalPayment", totalPayment);
        model.addAttribute("bodyContent", "functionProcedures/calculate_total_payment_shift");
        return "master-template";
    }

    @GetMapping("/calculateTotalPayment")
    public String calculateTotalPayment(Model model) {
        model.addAttribute("bodyContent", "functionProcedures/calculate_total_payment");
        return "master-template";
    }

    @PostMapping("/calculateTotalPayment")
    public String calculateTotalPayment(
            @RequestParam("empId") int empId,
            @RequestParam("startTime") String startTime,
            @RequestParam("endTime") String endTime,
            Model model
    ) {
        double totalPayment = functionProcedureRepository.calculateTotalPayment(empId, startTime, endTime);
        model.addAttribute("empId", empId);
        model.addAttribute("totalPayment", totalPayment);
        model.addAttribute("bodyContent", "functionProcedures/calculate_total_payment");
        return "master-template";
    }
}