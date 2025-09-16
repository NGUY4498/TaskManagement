package org.example.webtasks.Service.Impl;
import org.example.webtasks.DTO.TaskDto;
import org.example.webtasks.Model.Tasks;
import org.example.webtasks.Repository.TaskRepository;
import org.example.webtasks.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

public class TaskServiceImpl implements TaskService{

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<TaskDto> findAllTasks(){
        List<TaskDto> taskDtos = new ArrayList<>();
        List<Tasks> tasks = taskRepository.findAll();
        for(Tasks task : tasks){
            taskDtos.add(mapToTaskDto(task));
        }
        return taskDtos;
    }

    private TaskDto mapToTaskDto(Tasks task) {
        TaskDto dto = new TaskDto();
        dto.setId(task.getId());
        dto.setTaskName(task.getTaskName());
        dto.setDate(task.getDate());
        dto.setIsCompleted(task.getIsCompleted());
        return dto;
    }
}
