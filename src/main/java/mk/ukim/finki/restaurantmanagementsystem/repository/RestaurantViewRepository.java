package mk.ukim.finki.restaurantmanagementsystem.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class RestaurantViewRepository {

    private final JdbcTemplate jdbcTemplate;

    public RestaurantViewRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> getEmployeeDetails() {
        String sql = "SELECT * FROM employee_details limit 1000";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getCookedItemDetails() {
        String sql = "SELECT * FROM cooked_item_details limit 1000";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getMenuItemDetails() {
        String sql = "SELECT * FROM menu_item_details limit 1000";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getOrderDetails() {
        String sql = "SELECT * FROM order_details limit 1000";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getViewIngredientsPriceHistory() {
        String sql = "SELECT * FROM view_ingredients_price_history limit 1000";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getViewIngredientsSupplier() {
        String sql = "SELECT * FROM view_ingredients_supplier limit 1000";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getViewLoyaltyProgramPoints() {
        String sql = "SELECT * FROM view_loyalty_program_points limit 1000";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getViewMenu() {
        String sql = "SELECT * FROM view_menu limit 1000";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getViewMenuItemsPriceHistory() {
        String sql = "SELECT * FROM view_menu_items_price_history limit 1000";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getViewReview() {
        String sql = "SELECT * FROM view_review limit 1000";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getViewTableReservations() {
        String sql = "SELECT * FROM view_table_reservations limit 1000";
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getWaiterAvgGrade() {
        String sql = "SELECT * FROM waiter_avg_grade limit 1000";
        return jdbcTemplate.queryForList(sql);
    }
}