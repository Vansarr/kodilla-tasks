package cmd.crud.tasks.service;

import cmd.crud.tasks.controller.TaskNotFoundException;
import cmd.crud.tasks.domain.Task;
import cmd.crud.tasks.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbService {

    private final TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTask(final Long id) throws TaskNotFoundException {
        return repository.findById(id).orElseThrow(TaskNotFoundException::new);
    }

    public Task saveTask(final Task task) {
        return repository.save(task);
    }

    public void deleteTask(Long taskId) {
        repository.deleteById(taskId);
    }
}
