package dev.gorj00.project.repository;

import dev.gorj00.project.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // unnecessary, only due to IntelliJ error
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
