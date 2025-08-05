package com.devmaster.lesson08.controller;

import ch.qos.logback.core.util.StringUtil;
import com.devmaster.lesson08.dto.AuthorDTO;
import com.devmaster.lesson08.dto.BookDTO;
import com.devmaster.lesson08.entity.Book;
import com.devmaster.lesson08.service.AuthorService;
import com.devmaster.lesson08.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorService authorService;

    private static final String UPLOAD_DIR = "src/main/resources/static/";
    private static final String UPLOAD_PathFile = "images/products/";

    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "books/book-list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("authors", authorService.findAll());
        return "books/book-form";
    }

    @PostMapping("/new")
    public String saveBook(@ModelAttribute("book") BookDTO book
            , @RequestParam List<Long> authorIds
            , @RequestParam("imageBook") MultipartFile imageFile
    ) {
        if (!imageFile.isEmpty()) {
            try {
                Path uploadPath = Paths.get(UPLOAD_DIR+UPLOAD_PathFile);
                if (!Files.exists(uploadPath)) {
                    Files.createDirectories(uploadPath);
                }

                String originalFileName = StringUtils.cleanPath(imageFile.getOriginalFilename());
                String fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));

                String newFileName = book.getCode() + fileExtension;
                Path filePath = uploadPath.resolve(newFileName);
                Files.copy(imageFile.getInputStream(), filePath);

                book.setImgUrl("/" + UPLOAD_PathFile + newFileName);
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

        List<AuthorDTO> authors = new  ArrayList<>(authorService.findAllById(authorIds));
        book.setAuthors(authors);
        bookService.save(book);
        return "redirect:/books";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteById(id);
        return "redirect:/books";
    }
}
