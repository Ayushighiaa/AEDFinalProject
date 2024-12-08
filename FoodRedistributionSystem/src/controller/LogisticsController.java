package controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Controller for managing logistics operations.
 */
public class LogisticsController {

    private Map<String, String> routeMap; // Maps schedule date to delivery route

    public LogisticsController() {
        this.routeMap = new HashMap<>();
    }

    /**
     * Saves a delivery route with a specific schedule date.
     *
     * @param route        The delivery route details.
     * @param scheduleDate The schedule date.
     */
    public void saveRoute(String route, String scheduleDate) {
        routeMap.put(scheduleDate, route);
    }

    /**
     * Retrieves the delivery route for a specific schedule date.
     *
     * @param scheduleDate The schedule date.
     * @return The delivery route, or null if no route exists for the given date.
     */
    public String getDeliveryRoute(String scheduleDate) {
        return routeMap.get(scheduleDate);
    }
}
