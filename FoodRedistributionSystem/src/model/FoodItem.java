package model;

/**
 * Represents a food item in the warehouse inventory.
 */
public class FoodItem {
    private int itemId;
    private String itemName;
    private int quantity;
    private String expiryDate;
    private String details;

    /**
     * Constructor for FoodItem.
     *
     * @param itemId     The unique ID of the food item.
     * @param itemName   The name of the food item.
     * @param quantity   The quantity of the food item.
     * @param expiryDate The expiry date of the food item.
     */
    public FoodItem(int itemId, String itemName, int quantity, String expiryDate) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.details = "";
    }

    // Getters and Setters

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", expiryDate='" + expiryDate + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
