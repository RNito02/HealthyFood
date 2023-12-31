package com.example.healthyfood.data.repositories

import androidx.lifecycle.LiveData
import com.example.healthyfood.data.persistence.DaoTask
import com.example.healthyfood.data.persistence.Task
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class TaskRepository(private val daoTask: DaoTask) {

    private val coroutineScope =
        CoroutineScope(Dispatchers.Main)

    val allTask: LiveData<List<Task>>
        = daoTask.getAllTask()

    fun createTask(task: Task){
        coroutineScope.launch(Dispatchers.IO) {
            daoTask.insert(task)
        }
    }

    fun updateTask(task: Task){
        coroutineScope.launch(Dispatchers.IO) {
            daoTask.update(task)
        }
    }

    fun deleteTask(task: Task){
        coroutineScope.launch(Dispatchers.IO) {
            daoTask.delete(task)
        }
    }
}