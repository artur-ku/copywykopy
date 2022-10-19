package pl.sda.copywykopy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.copywykopy.model.Post;
import pl.sda.copywykopy.repository.PostRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post find(long id) {
        return postRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Post with id=" + id + " not found!"));
    }

    public Post create(Post post) {
        return postRepository.save(post);
    }
}
