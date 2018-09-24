package me.covicake.blog.Services;

import me.covicake.blog.Entities.Author;
import me.covicake.blog.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public void registerAuthor(Author author) {
        authorRepository.save(author);
    }

    public List<Author> getAuthors() {
        return authorRepository.findAll().stream().collect(Collectors.toList());
    }
}
