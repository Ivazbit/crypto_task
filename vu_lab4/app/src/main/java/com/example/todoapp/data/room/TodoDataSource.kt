package com.example.todoapp.data.room

import com.example.todoapp.data.Todo
import kotlinx.coroutines.Dispatchers

class TodoDataSource(private val todoDao: TodoDao) {
    val selectAll = todoDao.selectAll()

    suspend fun insertTodo(todo: Todo){
        Dispatchers.IO.apply {
            todoDao.insert(todo)
        }
    }

    suspend fun deleteTodo(todo: Todo){
        Dispatchers.IO.apply {
            todoDao.delete(todo.id)
        }
    }

    suspend fun updateTodo(isCompleted: Boolean, id: Long){
        Dispatchers.IO.apply {
            todoDao.updateTodo(isCompleted, id)
        }
    }

//    suspend fun deleteAllTodo(){
//        Dispatchers.IO.apply {
//            todoDao.insert()
//        }
//    }
}