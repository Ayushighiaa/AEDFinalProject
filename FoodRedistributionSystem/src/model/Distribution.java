package model;

/**
 * Represents a food distribution entry.
 */
public class Distribution {
    private int id;
    private String foodItem;
    private String NGO;
    private String status;

    /**
     * Constructor for Distribution.
     *
     * @param id       The unique ID of the distribution.
     * @param foodItem The name of the food item.
     * @param NGO      The NGO assigned to the distribution.
     * @param status   The current status of the distribution.
     */
    public Distribution(int id, String foodItem, String NGO, String status) {
        this.id = id;
        this.foodItem = foodItem;
        this.NGO = NGO;
        this.status = status;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public String getNGO() {
        return NGO;
    }

    public void setNGO(String NGO) {
        this.NGO = NGO;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Distribution{" +
                "id=" + id +
                ", foodItem='" + foodItem + '\'' +
                ", NGO='" + NGO + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
