package pl.sda.copywykopy.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.sda.copywykopy.model.Post;
import pl.sda.copywykopy.rest.dto.PostDTO;
import pl.sda.copywykopy.rest.mapper.PostMapper;
import pl.sda.copywykopy.service.PostService;

import java.util.List;
import java.util.stream.Collectors;

import static pl.sda.copywykopy.rest.mapper.PostMapper.toDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
@Slf4j
//transactional?

//crossorigin?
//@CrossOrigin(origins = "http://localhost:4200")
//lub seciurity? cors allow all?
//TODO handle deleted users?
public class PostRestController {

    private final PostService postService;

    @GetMapping
    public List<PostDTO> findAll() {
        return postService.findAll().stream()
                .map(PostMapper::toDTO)
                .collect(Collectors.toList());
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post create(@RequestBody Post post) {
        return postService.create(post);
    }

    @GetMapping("/{id}")
    public PostDTO find(@PathVariable("id") long id) {
        return toDTO(postService.find(id));
    }

    //TODO
    //delete mapping
    //put mapping
    //patch mapping?
    //get page

//    @GetMapping("/page")
//    public Page<Post>
    //pagerequest.of(int, int)
    //search params pagination
}
