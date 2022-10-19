package pl.sda.copywykopy.rest.mapper;

import pl.sda.copywykopy.model.Post;
import pl.sda.copywykopy.rest.dto.PostDTO;

public class PostMapper {

    public static PostDTO toDTO(Post post) {
        return PostDTO.builder().
                id(post.getId()).
                title(post.getTitle()).
                link(post.getLink()).
                content(post.getContent()).
                creationTime(post.getCreationTime()).
                creator(UserMapper.toDTO(post.getCreator())).
                postType(post.getPostType()).
                build();
    }
}
