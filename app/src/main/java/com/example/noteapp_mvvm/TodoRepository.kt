package com.example.noteapp_mvvm

class TodoRepository {
    private val todoList = mutableListOf<TodoItem>()

    init {
        todoList.add(TodoItem(1, "Buy groceries", false))
        todoList.add(TodoItem(2, "Wash the car", true))
        todoList.add(TodoItem(3, "Call the dentist", false))
    }
    fun getTodoItems():List<TodoItem>{
        return todoList
    }
}