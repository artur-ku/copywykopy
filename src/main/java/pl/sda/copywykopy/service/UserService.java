package pl.sda.copywykopy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.copywykopy.model.User;
import pl.sda.copywykopy.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User find(long id) {
        return userRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Post with id=" + id + " not found!"));
    }

    public User create(User user) {
        return userRepository.save(user);
    }
}
