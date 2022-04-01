package com.example.todoapp.data.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/todoapp/data/room/TodoDataSource;", "", "todoDao", "Lcom/example/todoapp/data/room/TodoDao;", "(Lcom/example/todoapp/data/room/TodoDao;)V", "selectAll", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/todoapp/data/Todo;", "getSelectAll", "()Lkotlinx/coroutines/flow/Flow;", "deleteTodo", "", "todo", "(Lcom/example/todoapp/data/Todo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTodo", "updateTodo", "isCompleted", "", "id", "", "(ZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TodoDataSource {
    private final com.example.todoapp.data.room.TodoDao todoDao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.todoapp.data.Todo>> selectAll = null;
    
    public TodoDataSource(@org.jetbrains.annotations.NotNull()
    com.example.todoapp.data.room.TodoDao todoDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.todoapp.data.Todo>> getSelectAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTodo(@org.jetbrains.annotations.NotNull()
    com.example.todoapp.data.Todo todo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteTodo(@org.jetbrains.annotations.NotNull()
    com.example.todoapp.data.Todo todo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateTodo(boolean isCompleted, long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}