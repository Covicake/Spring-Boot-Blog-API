package me.covicake.blog.Services;

import me.covicake.blog.Entities.Post;
import me.covicake.blog.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> findAllPosts() {
        return postRepository.findAll().stream().collect(Collectors.toList());
    }
}
