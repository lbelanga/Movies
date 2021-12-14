package com.example.movies

data class MovieDetails(
    val imageBackground: Int,
    val favorite: Boolean = false,
    val rating: String,
    val date: String,
    val description: String,
)