package com.example.todoapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lcom/example/todoapp/Graph;", "", "()V", "<set-?>", "Lcom/example/todoapp/data/room/TodoDatabase;", "database", "getDatabase", "()Lcom/example/todoapp/data/room/TodoDatabase;", "todoRepo", "Lcom/example/todoapp/data/room/TodoDataSource;", "getTodoRepo", "()Lcom/example/todoapp/data/room/TodoDataSource;", "todoRepo$delegate", "Lkotlin/Lazy;", "provide", "", "context", "Landroid/content/Context;", "app_debug"})
public final class Graph {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.todoapp.Graph INSTANCE = null;
    private static com.example.todoapp.data.room.TodoDatabase database;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy todoRepo$delegate = null;
    
    private Graph() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.todoapp.data.room.TodoDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.todoapp.data.room.TodoDataSource getTodoRepo() {
        return null;
    }
    
    public final void provide(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}