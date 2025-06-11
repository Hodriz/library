package com.example.library.controller

import com.example.library.dto.BookDto
import com.example.library.entity.Book
import com.example.library.repository.AuthorRepository
import com.example.library.repository.BookRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/book")
class BookController (private val repository: BookRepository){


    @PostMapping
    fun insertBook(@RequestBody book: BookDto): ResponseEntity<Any>{

        val author=
    }

    @GetMapping
    fun getAll():List<Book> = repository.findAll()

}