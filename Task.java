package edu.dmacc.codedsm.hw15;

import java.time.LocalDateTime;


public class Task {

    private int id;
    private String name;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String state;
    private int priorityLevel;
    private String type;

    public Task(int id, String name, LocalDateTime startDateTime, LocalDateTime endDateTime, String state, int priorityLevel, String type) {
        this.id = id;
        this.name = name;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.state = state;
        this.priorityLevel = priorityLevel;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                ", state='" + state + '\'' +
                ", priorityLevel=" + priorityLevel +
                ", type='" + type + '\'' +
                '}';
    }
}
