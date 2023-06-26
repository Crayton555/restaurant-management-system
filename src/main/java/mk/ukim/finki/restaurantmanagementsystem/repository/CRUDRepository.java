package mk.ukim.finki.restaurantmanagementsystem.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Repository
public class CRUDRepository {
    private final JdbcTemplate jdbcTemplate;

    public CRUDRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> getAllWaiters() {
        String sql = "SELECT * FROM get_all_waiters();";
        return jdbcTemplate.queryForList(sql);
    }

    public Map<String, Object> getWaiterById(int waiterId) {
        String sql = "SELECT * FROM get_waiter_by_id(?)";
        return jdbcTemplate.queryForMap(sql, waiterId);
    }

    public void deleteWaiter(int waiterId) {
        String sql = "CALL delete_waiter(?)";
        jdbcTemplate.update(sql, waiterId);
    }

    public List<Map<String, Object>> getAllManagers() {
        String sql = "SELECT * FROM get_all_managers()";
        return jdbcTemplate.queryForList(sql);
    }

    public Map<String, Object> getManagerById(int managerId) {
        String sql = "SELECT * FROM get_manager_by_id(?)";
        return jdbcTemplate.queryForMap(sql, managerId);
    }

    public void deleteManager(int managerId) {
        String sql = "CALL delete_manager(?)";
        jdbcTemplate.update(sql, managerId);
    }

    public List<Map<String, Object>> getAllChefs() {
        String sql = "SELECT * FROM get_all_chefs()";
        return jdbcTemplate.queryForList(sql);
    }

    public Map<String, Object> getChefById(int chefId) {
        String sql = "SELECT * FROM get_chef_by_id(?)";
        return jdbcTemplate.queryForMap(sql, chefId);
    }

    public void deleteChef(int chefId) {
        String sql = "CALL delete_chef(?)";
        jdbcTemplate.update(sql, chefId);
    }

    public void createEmployee(String empName, String contactInfo, double payment, Timestamp startShift,
                               Timestamp endShift, int managerId, int chefId, int waiterId) {
        String sql = "SELECT create_employee(?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, empName, contactInfo, payment, startShift, endShift, managerId, chefId, waiterId);
    }

    public Map<String, Object> getEmployeeById(int employeeId) {
        String sql = "SELECT * FROM get_employee_by_id(?)";
        return jdbcTemplate.queryForMap(sql, employeeId);
    }

    public void updateEmployee(int employeeId, String empName, String contactInfo, double payment,
                               Timestamp startShift, Timestamp endShift, int managerId, int chefId, int waiterId) {
        String sql = "SELECT update_employee(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, employeeId, empName, contactInfo, payment, startShift, endShift, managerId, chefId, waiterId);
    }

    public void deleteEmployee(int employeeId) {
        String sql = "SELECT delete_employee(?)";
        jdbcTemplate.update(sql, employeeId);
    }

    public List<Map<String, Object>> getAllEmployees() {
        String sql = "SELECT * FROM get_all_employees()";
        return jdbcTemplate.queryForList(sql);
    }

    public void createClient(String name, String email, String telephoneNumber) {
        String sql = "CALL create_client(?, ?, ?)";
        jdbcTemplate.update(sql, name, email, telephoneNumber);
    }

    public Map<String, Object> getClientById(int clientId) {
        String sql = "SELECT * FROM get_client_by_id(?)";
        return jdbcTemplate.queryForMap(sql, clientId);
    }

    public void updateClient(int clientId, String name, String email, String telephoneNumber) {
        String sql = "CALL update_client(?, ?, ?, ?)";
        int id_client = clientId;
        String telephone_number = telephoneNumber;
        jdbcTemplate.update(sql, id_client, name, email, telephone_number);
    }

    public void deleteClient(int clientId) {
        String sql = "CALL delete_client(?)";
        jdbcTemplate.update(sql, clientId);
    }

    public List<Map<String, Object>> getAllClients() {
        String sql = "SELECT * FROM get_all_clients()";
        return jdbcTemplate.queryForList(sql);
    }

    public void createSupplier(String name, String contactInfo) {
        String sql = "CALL create_supplier(?, ?)";
        jdbcTemplate.update(sql, name, contactInfo);
    }

    public Map<String, Object> getSupplierById(int supplierId) {
        String sql = "SELECT * FROM get_supplier_by_id(?)";
        return jdbcTemplate.queryForMap(sql, supplierId);
    }

    public void updateSupplier(int supplierId, String name, String contactInfo) {
        String sql = "CALL update_supplier(?, ?, ?)";
        jdbcTemplate.update(sql, supplierId, name, contactInfo);
    }

    public void deleteSupplier(int supplierId) {
        String sql = "CALL delete_supplier(?)";
        jdbcTemplate.update(sql, supplierId);
    }

    public List<Map<String, Object>> getAllSuppliers() {
        String sql = "SELECT * FROM get_all_suppliers()";
        return jdbcTemplate.queryForList(sql);
    }

    public void createIngredient(String name, int supplies) {
        String sql = "CALL create_ingredient(?, ?)";
        jdbcTemplate.update(sql, name, supplies);
    }

    public Map<String, Object> getIngredientById(int ingredientId) {
        String sql = "SELECT * FROM get_ingredient_by_id(?)";
        return jdbcTemplate.queryForMap(sql, ingredientId);
    }

    public void updateIngredient(int ingredientId, String name, int supplies) {
        String sql = "CALL update_ingredient(?, ?, ?)";
        jdbcTemplate.update(sql, ingredientId, name, supplies);
    }

    public void deleteIngredient(int ingredientId) {
        String sql = "CALL delete_ingredient(?)";
        jdbcTemplate.update(sql, ingredientId);
    }

    public List<Map<String, Object>> getAllIngredients() {
        String sql = "SELECT * FROM get_all_ingredients()";
        return jdbcTemplate.queryForList(sql);
    }

    public void createIngredientsPriceHistory(int price, String priceFrom, String priceTo, int ingredientsId) {
        String sql = "CALL create_ingredients_price_history(?, ?, ?, ?)";
        Date startTimestamp = Date.valueOf(LocalDate.parse(priceFrom));
        Date endTimestamp = Date.valueOf(LocalDate.parse(priceTo));
        jdbcTemplate.update(sql, price, startTimestamp, endTimestamp, ingredientsId);
    }

    public Map<String, Object> getIngredientsPriceHistoryById(int ingredientsPriceHistoryId) {
        String sql = "SELECT * FROM read_ingredients_price_history(?)";
        return jdbcTemplate.queryForMap(sql, ingredientsPriceHistoryId);
    }

    public void updateIngredientsPriceHistory(int ingredientsPriceHistoryId, int price, String priceFrom, String priceTo, int ingredientsId) {
        String sql = "CALL update_ingredients_price_history(?, ?, ?, ?, ?)";
        Date startTimestamp = Date.valueOf(LocalDate.parse(priceFrom));
        Date endTimestamp = Date.valueOf(LocalDate.parse(priceTo));
        jdbcTemplate.update(sql, ingredientsPriceHistoryId, price, startTimestamp, endTimestamp, ingredientsId);
    }

    public void deleteIngredientsPriceHistory(int ingredientsPriceHistoryId) {
        String sql = "CALL delete_ingredients_price_history(?)";
        jdbcTemplate.update(sql, ingredientsPriceHistoryId);
    }

    public List<Map<String, Object>> getAllIngredientsPriceHistory() {
        String sql = "SELECT * FROM get_all_ingredients_price_history()";
        return jdbcTemplate.queryForList(sql);
    }

}