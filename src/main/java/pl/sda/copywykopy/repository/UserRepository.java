package pl.sda.copywykopy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.copywykopy.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
