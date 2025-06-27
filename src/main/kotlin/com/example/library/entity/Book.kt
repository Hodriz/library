package com.example.library.entity

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name="books")
data class Book (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    var title: String,
    var isbn: String,
    var price:BigDecimal,
    @ManyToOne
    @JoinColumn(name = "id_author")
    var author:Author,
    @ManyToOne
    @JoinColumn(name ="id_publisher")
    var publisher: Publisher
)