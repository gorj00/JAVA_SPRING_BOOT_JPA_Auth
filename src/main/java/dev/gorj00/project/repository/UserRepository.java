package dev.gorj00.project.repository;

import dev.gorj00.project.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // unnecessary, only due to IntelliJ error
public interface UserRepository extends CrudRepository<User, Long> {
}
