package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a task assigned to volunteers.
 */
public class Task {
    private int taskId;
    private String description;
    private String status;
    private Integer assignedTo; // Volunteer ID
    private String completionDetails;

    /**
     * Constructor for Task.
     *
     * @param taskId      The unique ID of the task.
     * @param description The description of the task.
     * @param status      The current status of the task (e.g., "Pending").
     */
    public Task(int taskId, String description, String status) {
        this.taskId = taskId;
        this.description = description;
        this.status = status;
        this.assignedTo = null;
        this.completionDetails = null;
    }

    // Getters and Setters

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Integer assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getCompletionDetails() {
        return completionDetails;
    }

    public void setCompletionDetails(String completionDetails) {
        this.completionDetails = completionDetails;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", assignedTo=" + assignedTo +
                ", completionDetails='" + completionDetails + '\'' +
                '}';
    }

    /**
     * Generates a list of dummy tasks for testing purposes.
     *
     * @return A list of 10 dummy tasks.
     */
    public static List<Task> getDummyTasks() {
        List<Task> taskList = new ArrayList<>();

        taskList.add(new Task(1, "Distribute food packets to NGO A", "Pending"));
        taskList.add(new Task(2, "Inspect food safety in Community Kitchen", "Pending"));
        taskList.add(new Task(3, "Coordinate logistics for delivery to NGO B", "Assigned"));
        taskList.add(new Task(4, "Arrange educational workshop for volunteers", "Completed"));
        taskList.add(new Task(5, "Prepare inventory report for Warehouse C", "Pending"));
        taskList.add(new Task(6, "Inspect expired food items in Warehouse A", "Completed"));
        taskList.add(new Task(7, "Assist in sorting food donations", "Pending"));
        taskList.add(new Task(8, "Deliver food supplies to Community Kitchen D", "Assigned"));
        taskList.add(new Task(9, "Prepare logistics plan for next delivery cycle", "Pending"));
        taskList.add(new Task(10, "Follow up with NGO E regarding food requirements", "Completed"));

        return taskList;
    }
}
