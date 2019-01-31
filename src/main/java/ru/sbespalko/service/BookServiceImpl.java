package ru.sbespalko.service;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.sbespalko.model.Book;
import ru.sbespalko.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Mono<Book> findById(String id) {
		return bookRepository.findById(id);
	}

	@Override
	public Flux<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Mono<Book> save(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return bookRepository.deleteById(id);
	}
}