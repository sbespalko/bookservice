package ru.sbespalko.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import ru.sbespalko.model.Book;

public interface BookRepository extends ReactiveMongoRepository<Book, String> {
}
