package cmd.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BadgesDto {

    @JsonProperty("votes")
    private int votes;

    @JsonProperty("attachments")
    private AttachmentsByTypeDto attachments;
}
