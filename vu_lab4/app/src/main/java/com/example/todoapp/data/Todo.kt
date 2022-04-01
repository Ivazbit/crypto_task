package com.example.todoapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    val todo: String,
    val description: String,
    val isCompleted:Boolean = false,
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0
)