package com.example.noteapp_mvvm
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel:ViewModel() {
    private val repository = TodoRepository()

    private val _todoItems = MutableLiveData<List<TodoItem>>()

    val todoItems: LiveData<List<TodoItem>> = _todoItems

    init {
        _todoItems.value = repository.getTodoItems()
    }

    fun markItemAsCompleted(id: Int) {
        val updatedList = todoItems.value?.map {
            if (it.id == id) {
                it.copy(isComplete = true)
            } else {
                it
            }
        }
        _todoItems.value = updatedList
    }
}