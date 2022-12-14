package cmd.crud.tasks.scheduler;

import cmd.crud.tasks.config.AdminConfig;
import cmd.crud.tasks.domain.Mail;
import cmd.crud.tasks.repository.TaskRepository;
import cmd.crud.tasks.service.SimpleEmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailScheduler {

    private static final String SUBJECT = "Tasks: Once a day email";

    private final SimpleEmailService simpleEmailService;
    private final TaskRepository taskRepository;
    private final AdminConfig adminConfig;

    // @Scheduled(cron = "0 0 10 * * *")
    // @Scheduled(fixedDelay = 10000)
    public void sendInformationEmail() {
        long size = taskRepository.count();
        String message = "Currently in database you got: " + size + ((size >1L) ? "tasks" : "task");

        simpleEmailService.send(
                new Mail(
                        adminConfig.getAdminMail(),
                        SUBJECT,
                        message,
                        null
                )
        );
    }
}
