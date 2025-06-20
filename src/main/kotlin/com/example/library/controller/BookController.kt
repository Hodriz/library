package com.example.library.controller

import com.example.library.dto.BookDto
import com.example.library.entity.Book
import com.example.library.repository.AuthorRepository
import com.example.library.repository.BookRepository
import com.example.library.repository.PublisherRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/book")
class BookController (
    private val bookRepository: BookRepository,
    private val authorRepository: AuthorRepository,
    private val publisherRepository: PublisherRepository
){


    @PostMapping
    fun insertBook(@RequestBody bookDto: BookDto): ResponseEntity<Any>{

        val author=authorRepository.findById(bookDto.authorId).orElseThrow{RuntimeException("Autor não encontrado")}
        val publisher=publisherRepository.findById(bookDto.publisherId).orElseThrow{RuntimeException("Editora não encontrada")}
        val book= Book(
            id=0,
            title = bookDto.title,
            isbn = bookDto.isbn,
            price = bookDto.price,
            author = author,
            publisher=publisher
            )

        val savedBook=bookRepository.save(book)
        return  ResponseEntity.ok(savedBook)
    }

    @GetMapping
    fun getAll():List<Book> = bookRepository.findAll()

}