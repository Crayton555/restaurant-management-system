package mk.ukim.finki.restaurantmanagementsystem.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

@Repository
public class GenerateDataRepository {
    private final JdbcTemplate jdbcTemplate;

    public GenerateDataRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertClients(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_clients(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertLoyaltyPrograms(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_loyalty_programs(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertReviews(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_reviews(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertMenuItems(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_menu_items(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertIngredients(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_ingredients(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertIngredientsMenuItems(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_ingredients_menu_items(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertSuppliers(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_suppliers(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertIngredientsSupplier(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_ingredients_supplier(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertIngredientsPriceHistory(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_ingredients_price_history(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertMenuItemsPriceHistory(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_menu_items_price_history(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertCookedItems(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_cooked_items(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertTables(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_tables(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertTableReservations(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_table_reservations(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertOrders(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_orders(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertEmployees(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_employees(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertWaiters(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_waiters(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertChefs(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_chefs(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }

    public void insertManagers(int i) {
        for (int j = 1; j <= i; j++) {
            String sql = "SELECT insert_managers(?)";
            jdbcTemplate.execute(sql, (PreparedStatementCallback<Void>) ps -> {
                ps.setInt(1, 1);
                ps.execute();
                return null;
            });
        }
    }
}