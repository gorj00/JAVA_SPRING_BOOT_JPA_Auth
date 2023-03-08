package dev.gorj00.project.rest;

import dev.gorj00.project.model.Post;
import dev.gorj00.project.repository.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostRepository postsRepo;

    public PostController(PostRepository postsRepo) {
        this.postsRepo = postsRepo;
    }

    @GetMapping
    public Iterable<Post> findAll() {
        return postsRepo.findAll();
    }

    @GetMapping("/{id}")
    public Post findById(@PathVariable("id") Post post) { // automatically
        // looks up the post in the db based on the id column
        return post;
    }
}
