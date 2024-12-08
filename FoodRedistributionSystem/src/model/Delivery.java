package model;

/**
 * Represents a delivery entry.
 */
public class Delivery {
    private int deliveryId;
    private String route;
    private String status;
    private String details;

    /**
     * Constructor for Delivery.
     *
     * @param deliveryId The unique ID of the delivery.
     * @param route      The delivery route.
     * @param status     The current status of the delivery.
     * @param details    Additional delivery details.
     */
    public Delivery(int deliveryId, String route, String status, String details) {
        this.deliveryId = deliveryId;
        this.route = route;
        this.status = status;
        this.details = details;
    }

    // Getters and Setters

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryId=" + deliveryId +
                ", route='" + route + '\'' +
                ", status='" + status + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
