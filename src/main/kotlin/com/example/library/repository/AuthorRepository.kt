package com.example.library.repository

import com.example.library.entity.Author
import org.springframework.data.jpa.repository.JpaRepository

interface AuthorRepository:JpaRepository <Author, Long>  {
}