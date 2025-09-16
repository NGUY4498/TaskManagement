package org.example.webtasks.Model;
import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "task_name")
    private String taskName;

    @Column(name = "is_completed")
    private Boolean isCompleted = false;

    public Tasks() {

    }


    public Tasks(Long id, LocalDate date, String taskName, Boolean isCompleted) {
        this.id = id;
        this.date = date;
        this.taskName = taskName;
        this.isCompleted = isCompleted;
    }

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
