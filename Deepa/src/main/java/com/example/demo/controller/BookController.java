package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // Render the HTML page for adding books
    @GetMapping("/add")
    public String showAddBookForm() {
        return "add-book"; // Points to add-book.html in templates
    }

    // Add a new book
    @PostMapping("/add")
    public String addBook(@ModelAttribute Book book) {
        bookService.addBook(book);
        return "redirect:/books/list"; // Redirect to the list of books
    }

    // Render the HTML page to list all books
    @GetMapping("/list")
    public String listBooks(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books); // Pass books to the HTML page
        return "list-books"; // Points to list-books.html in templates
    }

    // Delete a book by ID
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable String id) { // Change id type to String for MongoDB
        bookService.deleteBookById(id);
        return "redirect:/books/list"; // Redirect to the list of books after deletion
    }
}
