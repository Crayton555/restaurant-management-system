package mk.ukim.finki.restaurantmanagementsystem.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@Repository
public class FunctionProcedureRepository {
    private final JdbcTemplate jdbcTemplate;

    public FunctionProcedureRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void updateMenuItemPrice(int menuItemId, int newPrice) {
        String callStatement = "CALL update_menu_item_price(?, ?)";
        jdbcTemplate.update(callStatement, menuItemId, newPrice);
    }

    public boolean checkIngredientAvailability(int menuItemId) {
        String sql = "SELECT check_ingredient_availability(?)";
        return jdbcTemplate.queryForObject(sql, Boolean.class, menuItemId);
    }

    public Map<String, Object> getTopRatedWaiter() {
        String sql = "SELECT * FROM get_top_rated_waiter()";
        return jdbcTemplate.queryForMap(sql);
    }

    public List<Map<String, Object>> getAvailableTables(LocalDate reservationDate, LocalTime reservationTime) {
        String sql = "SELECT * FROM get_available_tables(?, ?) limit 1000";
        return jdbcTemplate.queryForList(sql, reservationDate, reservationTime);
    }

    public void updateTableReservationStatus(int reservationId, String newStatus) {
        String callStatement = "CALL update_table_reservation_status(?, ?)";
        jdbcTemplate.update(callStatement, reservationId, newStatus);
    }

    public double getWaiterAverageGrade(int waiterId) {
        String sql = "SELECT get_waiter_average_grade(?)";
        Double averageGrade = jdbcTemplate.queryForObject(sql, Double.class, waiterId);
        return averageGrade != null ? averageGrade : 0.0;
    }

    public double getAverageOrderPrice(String startDate, String endDate) {
        String sql = "SELECT * FROM get_average_order_price(?, ?);";
        return jdbcTemplate.queryForObject(sql, Double.class, LocalDate.parse(startDate), LocalDate.parse(endDate));
    }

    public double calculateTotalPaymentShift(int employeeId) {
        String sql = "SELECT calculate_total_payment_shift(?)";
        return jdbcTemplate.queryForObject(sql, Double.class, employeeId);
    }

    public double calculateTotalPayment(int empId, String startTime, String endTime) {
        String sql = "SELECT calculate_total_payment(?, ?, ?)";
        Timestamp startTimestamp = Timestamp.valueOf(startTime);
        Timestamp endTimestamp = Timestamp.valueOf(endTime);
        return jdbcTemplate.queryForObject(sql, Double.class, empId, startTimestamp, endTimestamp);
    }
}
