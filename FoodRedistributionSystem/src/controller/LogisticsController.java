package controller;

import service.LogisticsService;

/**
 * Controller for managing logistics operations.
 */
public class LogisticsController {

    private LogisticsService logisticsService;

    public LogisticsController(LogisticsService logisticsService) {
        this.logisticsService = logisticsService;
    }

    /**
     * Saves a delivery route with a specific schedule date.
     *
     * @param route        The delivery route details.
     * @param scheduleDate The schedule date.
     */
    public void saveRoute(String route, String scheduleDate) {
        logisticsService.saveRoute(route, scheduleDate);
    }

    /**
     * Retrieves the delivery route for a specific schedule date.
     *
     * @param scheduleDate The schedule date.
     * @return The delivery route, or null if no route exists for the given date.
     */
    public String getDeliveryRoute(String scheduleDate) {
        return logisticsService.getRouteByDate(scheduleDate);
    }

    /**
     * Deletes a delivery route for a specific schedule date.
     *
     * @param scheduleDate The schedule date.
     * @return true if the route was removed, false otherwise.
     */
    public boolean deleteRoute(String scheduleDate) {
        return logisticsService.deleteRoute(scheduleDate);
    }

    /**
     * Retrieves all delivery routes.
     *
     * @return A string representation of all routes.
     */
    public String viewAllRoutes() {
        return logisticsService.viewAllRoutes();
    }
}
