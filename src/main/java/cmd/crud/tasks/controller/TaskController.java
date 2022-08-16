package cmd.crud.tasks.controller;

import cmd.crud.tasks.domain.Task;
import cmd.crud.tasks.domain.TaskDto;
import cmd.crud.tasks.service.DbService;
import lombok.RequiredArgsConstructor;
import cmd.crud.tasks.mapper.TaskMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final DbService service;
    private final TaskMapper taskMapper;

    @GetMapping
    public List<TaskDto> getTasks() {
        List<Task> tasks = service.getAllTasks();
        return taskMapper.mapToTaskDtoList(tasks);
    }

    @GetMapping(value = "{taskId}")
    public TaskDto getTask( @PathVariable Long taskId) {
        Task task = service.getTaskById(taskId);
        return taskMapper.mapToTaskDto(task);
    }

    @DeleteMapping
    public void deleteTask(Long taskId) {

    }

    @PutMapping
    public TaskDto updateTask(TaskDto taskDto) {
        return new TaskDto(1L, "test title", "test_content");
    }

    @PostMapping
    public void createTask(TaskDto taskDto) {

    }
}
