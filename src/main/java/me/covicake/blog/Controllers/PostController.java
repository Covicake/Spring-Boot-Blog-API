package me.covicake.blog.Controllers;

import me.covicake.blog.Entities.Post;
import me.covicake.blog.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/")
    public void createPost(@RequestBody Post post) {
        postService.createPost(post);
    }

    @GetMapping("/")
    public List<Post> getPostsList() {
        return postService.findAllPosts();
    }
}
