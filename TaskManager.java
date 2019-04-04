package edu.dmacc.codedsm.hw15;

import java.time.LocalDateTime;
import java.util.List;

public class TaskManager extends User {


    public TaskManager() {
    }

    public TaskManager(String name, String title, List<Task> assignedTasks, boolean active) {
        super(name, title, assignedTasks, active);
    }

    void addNewTasks(List<Task> task, Task toDo) {
        task.add(toDo);

    }


    void giveTaskPriorityAndType(List<Task> task ,int priority, String type, int chosenTask) {

            task.get(chosenTask).setPriorityLevel(priority);
            task.get(chosenTask).setType(type);
    }


    void taskTimeToBeDone(List<Task> task,LocalDateTime completed, int chosenTask) {
        task.get(chosenTask).setEndDateTime(completed);

    }


    void assignTaskToUser(User user, List<Task> task) {
        user.setAssignedTasks(task);

    }
}
