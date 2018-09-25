package me.covicake.blog.Services;

import me.covicake.blog.Entities.Author;
import me.covicake.blog.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void registerAuthor(Author author) {
        author.setPassword(bCryptPasswordEncoder.encode(author.getPassword()));
        authorRepository.save(author);
    }

    public Author findAuthorByUsername(String username) {
        return authorRepository.findByUsername(username);
    }

    public List<Author> getAuthors() {
        List<Author> authors = new ArrayList<>();
        authorRepository.findAll().forEach(author -> {
            author.setPassword("");
            authors.add(author);
        });
        return authors;
    }
}
