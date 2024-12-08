package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Service for managing logistics routes.
 */
public class LogisticsService {
    private Map<String, String> routes; // Map<ScheduleDate, Route>

    public LogisticsService() {
        this.routes = new HashMap<>();
        addDummyData(); // Initialize with dummy data
    }

    // Save a new route
    public void saveRoute(String route, String scheduleDate) {
        routes.put(scheduleDate, route);
    }

    // Fetch a route by date
    public String getRouteByDate(String date) {
        return routes.get(date);
    }

    // Delete a route by date
    public boolean deleteRoute(String date) {
        return routes.remove(date) != null;
    }

    // View all routes
    public String viewAllRoutes() {
        StringBuilder allRoutes = new StringBuilder();
        Set<Map.Entry<String, String>> entrySet = routes.entrySet();

        if (entrySet.isEmpty()) {
            return "No routes available.";
        }

        for (Map.Entry<String, String> entry : entrySet) {
            allRoutes.append("Date: ").append(entry.getKey())
                     .append(" - Route: ").append(entry.getValue())
                     .append("\n");
        }
        return allRoutes.toString();
    }

    // Add dummy data
    private void addDummyData() {
        routes.put("2024-12-10", "Route A: Warehouse A to NGO 1");
        routes.put("2024-12-11", "Route B: Warehouse B to Community Kitchen 1");
        routes.put("2024-12-12", "Route C: Warehouse C to NGO 2");
        routes.put("2024-12-13", "Route D: Warehouse A to NGO 3");
        routes.put("2024-12-14", "Route E: Warehouse B to NGO 4");
        routes.put("2024-12-15", "Route F: Warehouse C to NGO 5");
        routes.put("2024-12-16", "Route G: Warehouse A to Community Kitchen 2");
        routes.put("2024-12-17", "Route H: Warehouse B to NGO 6");
        routes.put("2024-12-18", "Route I: Warehouse C to Community Kitchen 3");
        routes.put("2024-12-19", "Route J: Warehouse A to NGO 7");
    }
}
