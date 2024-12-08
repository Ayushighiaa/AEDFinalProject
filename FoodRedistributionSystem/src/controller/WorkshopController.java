/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;



import java.util.HashMap;
import java.util.Map;

/**
 * Controller for managing workshops.
 */
public class WorkshopController {

    private Map<String, String> workshops;

    public WorkshopController() {
        this.workshops = new HashMap<>();
    }

    public void addWorkshop(String title, String content) {
        workshops.put(title, content);
    }

    public boolean updateWorkshop(String title, String content) {
        if (workshops.containsKey(title)) {
            workshops.put(title, content);
            return true;
        }
        return false;
    }

    public boolean deleteWorkshop(String title) {
        if (workshops.containsKey(title)) {
            workshops.remove(title);
            return true;
        }
        return false;
    }

    public String getWorkshop(String title) {
        return workshops.get(title);
    }

    public Map<String, String> getAllWorkshops() {
        return workshops;
    }
}

