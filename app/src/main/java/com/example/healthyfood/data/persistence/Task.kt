package com.example.healthyfood.data.persistence

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val paso1: String,
    val paso2: String,
    val paso3: String,
    val paso4: String,
    val paso5: String,
    @ColumnInfo(name = "is_completed") val isCompleted: Boolean
)