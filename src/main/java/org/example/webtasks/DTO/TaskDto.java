package org.example.webtasks.DTO;
import jakarta.persistence.Column;
import lombok.Builder;
import java.time.LocalDate;

@Builder
public class TaskDto {
    private Long id;
    private LocalDate date;
    private String taskName;
    private Boolean isCompleted = false;
}
