package org.example.webtasks.Service;
import java.util.List;
import org.example.webtasks.DTO.TaskDto;

public interface TaskService {
    List<TaskDto> findAllTasks();
}
