/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author ayushighia
 */

import model.Task;
import model.Volunteer;
import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks;

    public TaskService() {
        this.tasks = new ArrayList<>();
    }

    // Save a new task
    public void saveTask(Task task) {
        tasks.add(task);
    }

    // Fetch tasks by volunteer
    public List<Task> getTasksByVolunteer(Volunteer volunteer) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getAssignedTo() == volunteer.getUserId()) {
                result.add(task);
            }
        }
        return result;
    }

    // Get task by ID
    public Task getTaskById(int taskId) {
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                return task;
            }
        }
        return null;
    }

    // Update task details
    public void updateTask(Task task) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskId() == task.getTaskId()) {
                tasks.set(i, task);
                return;
            }
        }
    }
}

