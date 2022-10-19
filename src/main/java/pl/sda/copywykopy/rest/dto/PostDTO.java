package pl.sda.copywykopy.rest.dto;

import lombok.Builder;
import lombok.Getter;
import pl.sda.copywykopy.model.PostType;

import java.time.LocalDateTime;

@Getter
@Builder
public class PostDTO {
    private long id;
    private String title;
    private String link;
    private String content;
    private LocalDateTime creationTime;
    private UserDTO creator; //deleted users? zwracac tylko id czy caly user
    private PostType postType;
    private boolean wasEdited;
    //post status - jezeli usuniety to nie bedziemy go zwracac przy normalnym zapytaniu,
    //admini beda mieli inne zawolania restowe
}
