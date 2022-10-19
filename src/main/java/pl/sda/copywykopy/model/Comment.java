package pl.sda.copywykopy.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Setter
    @JoinColumn(name = "creator_id")
    @ManyToOne
    private User creator;

    @Setter
    @JoinColumn(name = "post_id")
    @ManyToOne
    private Post post;

    @Setter
    @JoinColumn(name = "parent_comment_id")
    @ManyToOne
    private Comment parentComment;

    @Setter
    @Enumerated(EnumType.STRING)
    private CommentStatus commentStatus;

    @Setter
    private String content;

    @Setter
    private boolean wasEdited;

}
