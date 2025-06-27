package com.example.library.controller

import com.example.library.entity.Author
import com.example.library.entity.Publisher
import com.example.library.repository.PublisherRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/publisher")
class PublisherController (private val publisherRepository: PublisherRepository) {

    @PostMapping
    fun insertPublisher(@RequestBody publisher: Publisher):Publisher=publisherRepository.save(publisher)
    @GetMapping
    fun getAll():List<Publisher> = publisherRepository.findAll()

}