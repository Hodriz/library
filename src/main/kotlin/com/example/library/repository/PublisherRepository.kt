package com.example.library.repository

import com.example.library.entity.Publisher
import org.springframework.data.jpa.repository.JpaRepository

interface PublisherRepository:JpaRepository <Publisher,Long> {
}