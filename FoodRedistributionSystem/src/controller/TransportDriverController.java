package controller;

import model.Delivery;

import java.util.ArrayList;
import java.util.List;

/**
 * Controller for managing transport driver operations.
 */
public class TransportDriverController {

    private List<Delivery> deliveryList;

    public TransportDriverController(List<Delivery> deliveryList) {
        this.deliveryList = deliveryList;
    }

    /**
     * Retrieves the list of pending deliveries.
     *
     * @return List of deliveries with status "Pending".
     */
    public List<Delivery> getPendingDeliveries() {
        List<Delivery> pendingDeliveries = new ArrayList<>();
        for (Delivery delivery : deliveryList) {
            if ("Pending".equalsIgnoreCase(delivery.getStatus())) {
                pendingDeliveries.add(delivery);
            }
        }
        return pendingDeliveries;
    }

    /**
     * Confirms a delivery and updates its status and details.
     *
     * @param deliveryId     The ID of the delivery to confirm.
     * @param deliveryDetails The details of the completed delivery.
     */
    public void confirmDelivery(int deliveryId, String deliveryDetails) {
        for (Delivery delivery : deliveryList) {
            if (delivery.getDeliveryId() == deliveryId) {
                delivery.setStatus("Confirmed");
                delivery.setDetails(deliveryDetails);
                break;
            }
        }
    }
}
