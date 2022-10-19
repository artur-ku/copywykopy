package pl.sda.copywykopy.rest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import pl.sda.copywykopy.model.PostType;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
public class PostDTO {
    private long id;
    private String title;
    private String link;
    private String content;
    private LocalDateTime creationTime;
    private Long creatorId; //deleted users? zwracac tylko id czy caly user
    private PostType postType;
    private boolean wasEdited;
    //post status - jezeli usuniety to nie bedziemy go zwracac przy normalnym zapytaniu,
    //admini beda mieli inne zawolania restowe
}
