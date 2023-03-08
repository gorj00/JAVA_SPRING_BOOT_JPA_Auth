package dev.gorj00.project.repository;

import dev.gorj00.project.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // unnecessary, only due to IntelliJ error
public interface PostRepository extends CrudRepository<Post, Long> {
}
