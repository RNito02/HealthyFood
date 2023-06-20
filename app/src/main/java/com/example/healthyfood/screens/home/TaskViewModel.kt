package com.example.healthyfood.screens.home

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.healthyfood.data.persistence.DatabaseTask
import com.example.healthyfood.data.persistence.Task
import com.example.healthyfood.data.repositories.TaskRepository


class TaskViewModel(application: Application): ViewModel() {

    private val taskRepository: TaskRepository
    val allTask: LiveData<List<Task>>

    init{
        val taskDB = DatabaseTask.getInstance(
            application.applicationContext)

        taskRepository = TaskRepository(taskDB.getDaoTask())
        allTask = taskRepository.allTask
    }

    fun createTask(task: Task){
        taskRepository.createTask(task)
    }

    fun updateTask(task: Task){
        taskRepository.updateTask(task)
    }

    fun deleteTask(task: Task){
        taskRepository.deleteTask(task)
    }
    class TaskViewModelFactory(val application: Application):
        ViewModelProvider.Factory{
        override fun <T : ViewModel>
                create(modelClass: Class<T>)
        : T {
            return TaskViewModel(
                application = application) as T
        }
    }
}