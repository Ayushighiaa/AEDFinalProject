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
}
