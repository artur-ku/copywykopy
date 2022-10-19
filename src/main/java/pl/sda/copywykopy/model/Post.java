package pl.sda.copywykopy.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Calendar;

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "posts")

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Setter
    @Column(nullable = false)
    private String title;

    @Setter
    private String link;

    @Setter
    private String content;

    @Setter
    @Column(name = "creation_time")
    private LocalDateTime creationTime;

    @Setter
    @Column(name = "creator_id")
    @ManyToOne
    private User creator;

    @Setter
    @Column(name = "post_type")
    @Enumerated(EnumType.STRING)
    private PostType postType;

    @Setter
    @Column(name = "post_status")
    @Enumerated(EnumType.STRING)
    private PostStatus postStatus;

    @Setter
    @Column(name = "was_edited")
    private boolean wasEdited;
}
