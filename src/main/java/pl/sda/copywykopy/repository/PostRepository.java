package pl.sda.copywykopy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.copywykopy.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

}
