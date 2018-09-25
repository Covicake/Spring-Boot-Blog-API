package me.covicake.blog.Controllers;

import me.covicake.blog.Entities.Author;
import me.covicake.blog.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/sign-up")
    public void registerUser(@RequestBody Author author) {
        authorService.registerAuthor(author);
    }

    @GetMapping("/")
    public List<Author> getAuthors() {
        return authorService.getAuthors();
    }

}
