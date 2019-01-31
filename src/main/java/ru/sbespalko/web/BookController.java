package ru.sbespalko.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.sbespalko.model.Book;
import ru.sbespalko.service.BookService;

@RestController
public class BookController {
	private BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping(value = "/book/{id}")
	public Mono<Book> getBookById(@PathVariable String id) {
		return bookService.findById(id);
	}

	@GetMapping(value = "/books")
	public Flux<Book> getAllBooks() {
		return bookService.findAll();
	}

	@PostMapping(value = "/book")
	public Mono<Book> createBook(@RequestBody Book book) {
		return bookService.save(book);
	}
}