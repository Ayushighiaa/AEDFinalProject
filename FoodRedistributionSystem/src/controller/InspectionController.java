package controller;

import model.Donation;

import java.util.ArrayList;
import java.util.List;

/**
 * Controller for handling food safety inspections.
 */
public class InspectionController {

    private List<Donation> donationList;

    public InspectionController(List<Donation> donationList) {
        this.donationList = donationList;
    }

    public List<Donation> getPendingInspections() {
        List<Donation> pending = new ArrayList<>();
        for (Donation donation : donationList) {
            if ("Pending".equalsIgnoreCase(donation.getStatus())) {
                pending.add(donation);
            }
        }
        return pending;
    }

    public void updateInspectionStatus(int donationId, String status, String details) {
        for (Donation donation : donationList) {
            if (donation.getDonationId() == donationId) {
                donation.setStatus(status + " - " + details);
                break;
            }
        }
    }
}
