package com.example.library.controller

import com.example.library.entity.Author
import com.example.library.repository.AuthorRepository
import com.example.library.repository.BookRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.awt.print.Book

@RestController
@RequestMapping("/author")
class AuthorController(private val repository: AuthorRepository) {

    @PostMapping
    fun insertAuthor(@RequestBody author:Author):Author = repository.save(author)
    @GetMapping
    fun getAll():List<Author> = repository.findAll()
    @GetMapping("/id")
    fun findById(@PathVariable id:Long):Author =repository.findById(id).orElseThrow{ RuntimeException ("Autor não encontrado")}
}


