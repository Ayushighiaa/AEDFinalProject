/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author ayushighia
 */

import java.util.HashMap;
import java.util.Map;

public class LogisticsService {
    private Map<String, String> routes; // Map<ScheduleDate, Route>

    public LogisticsService() {
        this.routes = new HashMap<>();
    }

    // Save a new route
    public void saveRoute(String route, String scheduleDate) {
        routes.put(scheduleDate, route);
    }

    // Fetch a route by date
    public String getRouteByDate(String date) {
        return routes.get(date);
    }
}

