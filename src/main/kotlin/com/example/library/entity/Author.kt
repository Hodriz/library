package com.example.library.entity

import jakarta.persistence.*

@Entity
@Table
open class Author (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long? =null,
    val name:String,
    val age: Int,
    )
