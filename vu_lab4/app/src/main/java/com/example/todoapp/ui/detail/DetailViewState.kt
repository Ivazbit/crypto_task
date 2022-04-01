package com.example.todoapp.ui.detail

data class DetailViewState(
    val todo: String = "",
    val time: String = "",
    val selectId: Long = -1L,
)