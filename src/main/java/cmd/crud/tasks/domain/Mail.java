package cmd.crud.tasks.domain;

import lombok.*;

import java.util.Optional;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Mail {
    private final String mailTo;
    private final String subject;
    private final String message;
    private final Optional<String> toCc;
}

