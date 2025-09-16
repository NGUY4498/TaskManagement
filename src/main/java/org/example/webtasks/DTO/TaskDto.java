package org.example.webtasks.DTO;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDate;

public class TaskDto {
    private Long id;
    private LocalDate date;
    private String taskName;
    private Boolean isCompleted;

    public TaskDto() {}

    // Getters
    public Long getId() { return id; }
    public LocalDate getDate() { return date; }
    public String getTaskName() { return taskName; }
    public Boolean getIsCompleted() { return isCompleted; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setDate(LocalDate date) { this.date = date; }
    public void setTaskName(String taskName) { this.taskName = taskName; }
    public void setIsCompleted(Boolean isCompleted) { this.isCompleted = isCompleted; }
}
