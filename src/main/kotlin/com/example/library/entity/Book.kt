package com.example.library.entity

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name="books")
data class Book (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val title: String,
    val isbn: String,
    val price:BigDecimal,
    @ManyToOne
    @JoinColumn(name = "id_author")
    val author:Author,
    @ManyToOne
    @JoinColumn(name ="id_publisher")
    val publisher: Publisher
)