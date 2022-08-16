package cmd.crud.tasks.service;

import cmd.crud.tasks.domain.Task;
import cmd.crud.tasks.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DbService {

    private final TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTaskById(Long id) {
        return repository.findAll().get(Math.toIntExact(id)-1);
    }
}
