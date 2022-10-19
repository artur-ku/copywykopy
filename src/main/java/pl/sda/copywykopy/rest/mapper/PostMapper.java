package pl.sda.copywykopy.rest.mapper;

import pl.sda.copywykopy.model.Post;
import pl.sda.copywykopy.rest.dto.PostDTO;
import pl.sda.copywykopy.service.UserService;

public class PostMapper {

    //private static final UserService userService;

    public static PostDTO toDTO(Post post) {
        return PostDTO.builder().
                id(post.getId()).
                title(post.getTitle()).
                link(post.getLink()).
                content(post.getContent()).
                creationTime(post.getCreationTime()).
                creatorId(post.getCreator() == null ? null : post.getCreator().getId()).
                postType(post.getPostType()).
                build();
    }

    public static Post toEntity(PostDTO postDTO,UserService userService) {
        return Post.builder().
                id(postDTO.getId()).
                title(postDTO.getTitle()).
                link(postDTO.getLink()).
                content(postDTO.getContent()).
                creationTime(postDTO.getCreationTime()).
                creator(postDTO.getCreatorId() == null ? null : userService.find(postDTO.getCreatorId())
                ).
                postType(postDTO.getPostType()).
                build();
    }
}
