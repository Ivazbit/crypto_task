package com.example.todoapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0015J\u0016\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/todoapp/ui/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "todoDataSource", "Lcom/example/todoapp/data/room/TodoDataSource;", "(Lcom/example/todoapp/data/room/TodoDataSource;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/todoapp/ui/theme/HomeViewState;", "searchValue", "", "getSearchValue", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setSearchValue", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "selected", "", "state", "getState", "todoList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/todoapp/data/Todo;", "deleteTodo", "Lkotlinx/coroutines/Job;", "todo", "onSearchTextChanged", "onTaskCompleted", "Landroidx/compose/ui/text/style/TextDecoration;", "updateTodo", "id", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.todoapp.data.room.TodoDataSource todoDataSource = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.todoapp.ui.theme.HomeViewState> _state = null;
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.todoapp.data.Todo>> todoList = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> searchValue;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> selected = null;
    
    public HomeViewModel() {
        super();
    }
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.todoapp.data.room.TodoDataSource todoDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.todoapp.ui.theme.HomeViewState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getSearchValue() {
        return null;
    }
    
    public final void setSearchValue(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateTodo(boolean selected, long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.style.TextDecoration onTaskCompleted(@org.jetbrains.annotations.NotNull()
    com.example.todoapp.data.Todo todo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.todoapp.ui.theme.HomeViewState onSearchTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String searchValue) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteTodo(@org.jetbrains.annotations.NotNull()
    com.example.todoapp.data.Todo todo) {
        return null;
    }
}