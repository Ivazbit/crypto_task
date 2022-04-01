package com.example.todoapp.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0010R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/todoapp/ui/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "todoDataSource", "Lcom/example/todoapp/data/room/TodoDataSource;", "id", "", "(Lcom/example/todoapp/data/room/TodoDataSource;J)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/todoapp/ui/detail/DetailViewState;", "selectId", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "todoText", "", "todoTime", "insert", "Lkotlinx/coroutines/Job;", "todo", "Lcom/example/todoapp/data/Todo;", "onTextChange", "", "newText", "onTimeChange", "newTime", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.todoapp.data.room.TodoDataSource todoDataSource = null;
    private final long id = 0L;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> todoText = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> todoTime = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Long> selectId = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.todoapp.ui.detail.DetailViewState> _state = null;
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.todoapp.data.room.TodoDataSource todoDataSource, long id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.todoapp.ui.detail.DetailViewState> getState() {
        return null;
    }
    
    public final void onTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.String newText) {
    }
    
    public final void onTimeChange(@org.jetbrains.annotations.NotNull()
    java.lang.String newTime) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull()
    com.example.todoapp.data.Todo todo) {
        return null;
    }
}