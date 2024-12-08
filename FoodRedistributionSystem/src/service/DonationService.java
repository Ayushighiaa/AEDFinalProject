/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author ayushighia
 */


import model.Donation;
import java.util.ArrayList;
import java.util.List;
import model.Donor;
import model.FoodItem;

public class DonationService {
    private List<Donation> donations;

    public DonationService() {
        this.donations = new ArrayList<>();
        initializeDummyDonations();
    }

    // Save a donation
    public void saveDonation(Donation donation) {
        donations.add(donation);
    }

    // Fetch all donations
    public List<Donation> getAllDonations() {
        return donations;
    }

    // Get a donation by ID
    public Donation getDonationById(int donationId) {
        for (Donation donation : donations) {
            if (donation.getDonationId() == donationId) {
                return donation;
            }
        }
        return null;
    }

    // Update donation details
    public void updateDonation(Donation donation) {
        for (int i = 0; i < donations.size(); i++) {
            if (donations.get(i).getDonationId() == donation.getDonationId()) {
                donations.set(i, donation);
                return;
            }
        }
    }
    
     private void initializeDummyDonations() {
        Donor donor1 = new Donor(1, "John Doe", "password", "Organization A");
        Donor donor2 = new Donor(2, "Jane Smith", "password", "Organization B");

        FoodItem foodItem1 = new FoodItem(101, "Canned Beans", 20, "2024-12-31");
        FoodItem foodItem2 = new FoodItem(102, "Rice Packets", 50, "2025-01-15");
        FoodItem foodItem3 = new FoodItem(103, "Pasta", 30, "2024-12-15");
        FoodItem foodItem4 = new FoodItem(104, "Milk Cartons", 40, "2024-12-20");
        FoodItem foodItem5 = new FoodItem(105, "Bread Loaves", 25, "2024-12-10");
        FoodItem foodItem6 = new FoodItem(106, "Wheat Flour", 60, "2025-01-05");
        FoodItem foodItem7 = new FoodItem(107, "Eggs", 100, "2024-12-25");
        FoodItem foodItem8 = new FoodItem(108, "Peanut Butter Jars", 15, "2025-02-01");
        FoodItem foodItem9 = new FoodItem(109, "Tomato Sauce", 35, "2025-03-15");
        FoodItem foodItem10 = new FoodItem(110, "Frozen Vegetables", 45, "2024-12-20");

        donations.add(new Donation(1, foodItem1, donor1, "Pending"));
        donations.add(new Donation(2, foodItem2, donor1, "Scheduled: Pickup on 2024-12-15"));
        donations.add(new Donation(3, foodItem3, donor2, "Pending"));
        donations.add(new Donation(4, foodItem4, donor1, "Pending"));
        donations.add(new Donation(5, foodItem5, donor2, "Scheduled: Pickup on 2024-12-10"));
        donations.add(new Donation(6, foodItem6, donor1, "Pending"));
        donations.add(new Donation(7, foodItem7, donor2, "Pending"));
        donations.add(new Donation(8, foodItem8, donor1, "Pending"));
        donations.add(new Donation(9, foodItem9, donor2, "Scheduled: Pickup on 2025-03-10"));
        donations.add(new Donation(10, foodItem10, donor1, "Pending"));
    }

}

