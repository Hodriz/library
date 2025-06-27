package com.example.library.entity

import jakarta.persistence.*

@Entity
@Table(name="publishers")
data class Publisher (
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    val id:Long,
    val name:String,
    val cnpj:String
)