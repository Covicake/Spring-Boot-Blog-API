package me.covicake.blog.Services;

import me.covicake.blog.Entities.Post;
import me.covicake.blog.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> findAllPosts() {
        return postRepository.findAll().stream().collect(Collectors.toList());
    }

    public void createPost(Post post) {
        postRepository.save(post);
    }
}
