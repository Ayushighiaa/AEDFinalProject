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

public class DonationService {
    private List<Donation> donations;

    public DonationService() {
        this.donations = new ArrayList<>();
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
}

