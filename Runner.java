package edu.dmacc.codedsm.hw15;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Task> newTasks = new ArrayList<>();
        Task task1 = new Task(1,"VLANS", LocalDateTime.of(2019, 4, 9,07,00,00), LocalDateTime.of(2019, 4, 9, 9,00),"running",1,"Computer Networks");
        Task task2 = new Task(2,"Data analysis",LocalDateTime.of(2019, 4, 9,9,00,00), LocalDateTime.of(2019, 4, 9,11,00,00), "coming",2,"Database");
        Task task3 = new Task(3,"web configuration",LocalDateTime.of(2019, 4, 9,11,00,00), LocalDateTime.of(2019, 4, 9,13,00,00), "coming",3,"website");
        TaskManager taskManager = new TaskManager();
        User user1 = new TaskManager("James"," IP Engineer",newTasks,true);
        taskManager.addNewTasks(newTasks,task1);
        taskManager.addNewTasks(newTasks,task2);
        taskManager.addNewTasks(newTasks,task3);
        taskManager.giveTaskPriorityAndType(newTasks,2, "website update",2);
        // Print the list objects in tabular format.
                System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%5s %15s %25s %25s %10s %10s %20s", "TASK ID", "NAME", "START TIME", "END TIME", "STATE", "PRIORITY","TYPE");
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        for(Task task: newTasks){
            System.out.format("%5s %15s %25s %25s %10s %10d %20s",
                    task.getId(), task.getName(), task.getStartDateTime(), task.getEndDateTime(), task.getState(), task.getPriorityLevel(), task.getType());
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");

        List<Task> assignedTasks = new ArrayList<>();
        assignedTasks.add(task1);
        taskManager.assignTaskToUser(user1,assignedTasks);
        System.out.println("Show the user's tasks : " + user1.toString());
    }
}




