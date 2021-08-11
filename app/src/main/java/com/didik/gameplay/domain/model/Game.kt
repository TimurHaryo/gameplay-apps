package com.didik.gameplay.domain.model

data class Game(
    val id: Int,
    val name: String,
    val genres: List<String>,
    val rating: Float
)