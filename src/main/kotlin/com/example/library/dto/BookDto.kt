package com.example.library.dto

import java.math.BigDecimal

data class BookDto (
    val title: String,
    val isbn: String,
    val price: BigDecimal,
    val authorId: Long,
    val publisherId: Long,
)