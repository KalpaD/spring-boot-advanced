package com.kds.boot.springbootadvanced.bootstrap;

import com.kds.boot.springbootadvanced.model.Author;
import com.kds.boot.springbootadvanced.model.Book;
import com.kds.boot.springbootadvanced.model.Publisher;
import com.kds.boot.springbootadvanced.repositories.AuthorRepository;
import com.kds.boot.springbootadvanced.repositories.BookRepository;
import com.kds.boot.springbootadvanced.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by kalpasenanayake on 11/8/17.
 */

//@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Publisher agentPublisher = new Publisher();
        agentPublisher.setName("The agent book publishers");

        publisherRepository.save(agentPublisher);

        Publisher cybertronePublisher = new Publisher();
        cybertronePublisher.setName("The Cybertron publishers");

        publisherRepository.save(cybertronePublisher);

        Author neo = new Author("Neo", "Anderson");
        Book matrix = new Book("The Metrix", "1234", agentPublisher);
        neo.getBooks().add(matrix);
        matrix.getAuthors().add(neo);

        authorRepository.save(neo);
        bookRepository.save(matrix);

        Author michel = new Author("Mechel", "Bay");
        Book tranformers = new Book("Transformers", "3456", cybertronePublisher);
        michel.getBooks().add(tranformers);
        tranformers.getAuthors().add(michel);

        authorRepository.save(michel);
        bookRepository.save(tranformers);
    }
}
