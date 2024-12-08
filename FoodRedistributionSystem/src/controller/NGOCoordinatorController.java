package controller;

import model.Distribution;
import model.Workshop;

import java.util.List;

/**
 * Controller for NGO Coordinator operations.
 */
public class NGOCoordinatorController {

    private List<Distribution> foodDistributions;
    private List<Workshop> workshops;

    public NGOCoordinatorController(List<Distribution> foodDistributions, List<Workshop> workshops) {
        this.foodDistributions = foodDistributions;
        this.workshops = workshops;
    }

    /**
     * Returns the list of food distributions.
     *
     * @return List of food distributions.
     */
    public List<Distribution> getFoodDistributionList() {
        return foodDistributions;
    }

    /**
     * Returns the workshop schedule.
     *
     * @return List of workshops.
     */
    public List<Workshop> getWorkshopSchedule() {
        return workshops;
    }

    /**
     * Assigns a food distribution to an NGO.
     *
     * @param distributionId The ID of the distribution to assign.
     */
    public void assignDistribution(int distributionId) {
        foodDistributions.stream()
            .filter(distribution -> distribution.getId() == distributionId)
            .findFirst()
            .ifPresent(distribution -> distribution.setStatus("Assigned"));
    }
}
