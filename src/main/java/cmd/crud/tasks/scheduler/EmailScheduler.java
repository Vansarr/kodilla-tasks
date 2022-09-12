package cmd.crud.tasks.scheduler;

import cmd.crud.tasks.config.AdminConfig;
import cmd.crud.tasks.repository.TaskRepository;
import cmd.crud.tasks.service.SimpleEmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailScheduler {

    private final SimpleEmailService simpleEmailService;
    private final TaskRepository taskRepository;
    private final AdminConfig adminConfig;
}
