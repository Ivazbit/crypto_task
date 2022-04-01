package com.example.todoapp.ui.theme

import com.example.todoapp.data.Todo

data class HomeViewState (
    val todoList: List<Todo> = listOf(),
    var searchValue: String = "",
    val selected: Boolean = false
){
    val filteredTodoList: List<Todo>
        get() =  todoList.filter {it.todo.contains(searchValue,true)}
}
