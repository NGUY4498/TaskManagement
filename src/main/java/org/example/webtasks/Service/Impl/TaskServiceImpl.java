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
    List<TaskDto> taskDtos = new ArrayList<>();

    @Override
    public List<TaskDto> findAllTasks(){
        List<Tasks> tasks = taskRepository.findAll();
        for(Tasks task : tasks){
            taskDtos.add(mapToTaskDto(task));
        }
        return taskDtos;
    }

    private TaskDto mapToTaskDto(Tasks task){
        return TaskDto.builder()
                .id(task.getId())
                .taskName(task.getTaskName())
                .date(task.getDate())
                .isCompleted(task.getIsCompleted())
                .build();
    }
}
