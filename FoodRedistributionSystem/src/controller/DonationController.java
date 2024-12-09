/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import model.Donation;
import model.FoodItem;
import model.Donor;
import service.DonationService;

import java.util.List;
import java.util.Map;

public class DonationController {
    private DonationService donationService;

    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }

    // Add a new donation
    public void addDonation(Donor donor, FoodItem foodItem) {
        Donation donation = new Donation(0, foodItem, donor, "Pending");
        donationService.saveDonation(donation);
    }

    // Fetch all donations
    public List<Donation> getAllDonations() {
        return donationService.getAllDonations();
    }

    // Update donation status
    public void updateDonationStatus(int donationId, String status) {
        Donation donation = donationService.getDonationById(donationId);
        if (donation != null) {
            donation.setStatus(status);
            donationService.updateDonation(donation);
        }
    }
    
    private Map<Donor, String> donorEnterprises = new HashMap<>();

        public void recordEnterprise(Donor donor, String enterprise) {
            donorEnterprises.put(donor, enterprise);
        }

        // To retrieve the enterprise for a donor
        public String getEnterpriseForDonor(Donor donor) {
            return donorEnterprises.getOrDefault(donor, "Not recorded");
        }
}

