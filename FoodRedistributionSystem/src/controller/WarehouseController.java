package controller;

import model.FoodItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Controller for managing warehouse operations.
 */
public class WarehouseController {

    private List<FoodItem> inventory;

    public WarehouseController(List<FoodItem> inventory) {
        this.inventory = inventory;
        addDummyData();
    }

   

    /**
     * Retrieves the inventory list.
     *
     * @return List of food items in the inventory.
     */
    public List<FoodItem> getInventory() {
        return inventory;
    }

    /**
     * Updates the details of a specific food item.
     *
     * @param itemId  The ID of the food item to update.
     * @param details The updated details of the food item.
     * @return True if the update was successful, false otherwise.
     */
    public boolean updateItemDetails(int itemId, String details) {
        for (FoodItem item : inventory) {
            if (item.getItemId() == itemId) {
                item.setDetails(details);
                return true;
            }
        }
        return false;
    }

    /**
     * Adds dummy data to the inventory.
     */
    private void addDummyData() {
        inventory.add(new FoodItem(1, "Rice", 100, "2024-12-15"));
        inventory.add(new FoodItem(2, "Wheat Flour", 50, "2024-12-20"));
        inventory.add(new FoodItem(3, "Canned Beans", 200, "2025-01-10"));
        inventory.add(new FoodItem(4, "Pasta", 80, "2024-11-30"));
        inventory.add(new FoodItem(5, "Milk Powder", 60, "2024-12-05"));
        inventory.add(new FoodItem(6, "Lentils", 150, "2024-12-25"));
        inventory.add(new FoodItem(7, "Vegetable Oil", 90, "2025-01-05"));
        inventory.add(new FoodItem(8, "Sugar", 120, "2024-12-18"));
        inventory.add(new FoodItem(9, "Salt", 300, "2025-02-15"));
        inventory.add(new FoodItem(10, "Tea Bags", 75, "2024-12-12"));
    }
    
    public void addItemToInventory(String itemName, int quantity, String expiryDate) {
    int newId = inventory.size() + 1; // Generate a new unique ID
    inventory.add(new FoodItem(newId, itemName, quantity, expiryDate));
}

    public boolean updateItemQuantity(int itemId, int newQuantity) {
        for (FoodItem item : inventory) {
            if (item.getItemId() == itemId) {
                item.setQuantity(newQuantity);
                return true;
            }
        }
        return false;
    }

}
