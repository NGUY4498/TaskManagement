package org.example.webtasks.Controller;
import org.example.webtasks.DTO.TaskDto;
import org.example.webtasks.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.List;


public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public String tasks(Model model){
        List<TaskDto> tasks = taskService.findAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks-list";
    }
}
