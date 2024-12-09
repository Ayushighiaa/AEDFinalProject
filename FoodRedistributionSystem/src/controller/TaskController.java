package controller;

import model.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Controller for managing tasks assigned to volunteers.
 */
public class TaskController {

    private List<Task> taskList;

    /**
     * Constructor for TaskController.
     */
    public TaskController() {
        // Initialize taskList with dummy tasks
        this.taskList = Task.getDummyTasks();
    }

    /**
     * Retrieves all tasks.
     *
     * @return A list of all tasks.
     */
    public List<Task> getAllTasks() {
        return taskList;
    }

    /**
     * Assigns a task to a volunteer.
     *
     * @param taskId The ID of the task to assign.
     * @param volunteerId The ID of the volunteer to assign the task to.
     * @return A message indicating the result of the operation.
     */
    public String assignTask(int taskId, int volunteerId) {
        for (Task task : taskList) {
            if (task.getTaskId() == taskId) {
                if (task.getStatus().equalsIgnoreCase("Pending")) {
                    task.setAssignedTo(volunteerId);
                    task.setStatus("Assigned");
                    return "Success";
                } else {
                    return "Task is already assigned or completed.";
                }
            }
        }
        return "Task not found.";
    }

    /**
     * Updates the completion status of a task.
     *
     * @param taskId The ID of the task to update.
     * @param details The completion details of the task.
     * @return A message indicating the result of the operation.
     */
    public String completeTask(int taskId, String details) {
        for (Task task : taskList) {
            if (task.getTaskId() == taskId) {
                if (task.getStatus().equalsIgnoreCase("Assigned")) {
                    task.setStatus("Completed");
                    task.setCompletionDetails(details);
                    return "Success";
                } else {
                    return "Task must be assigned before it can be completed.";
                }
            }
        }
        return "Task not found.";
    }

    /**
     * Retrieves all tasks assigned to a specific volunteer.
     *
     * @param volunteerId The ID of the volunteer.
     * @return A list of tasks assigned to the given volunteer.
     */
    public List<Task> getTasksForVolunteer(int volunteerId) {
        List<Task> assignedTasks = new ArrayList<>();
        for (Task task : taskList) {
            if (volunteerId == task.getAssignedTo()) {
                assignedTasks.add(task);
            }
        }
        return assignedTasks;
    }
}
