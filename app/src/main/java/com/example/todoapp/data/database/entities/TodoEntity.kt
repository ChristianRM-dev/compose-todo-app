package com.example.todoapp.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.todoapp.core.config.Constants
import org.jetbrains.annotations.NotNull
import java.sql.Date

@Entity(tableName = TodoEntity.TABLE_NAME)
data class TodoEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "title") @NotNull val title: String,
    @ColumnInfo(name = "description")  val description: String,

) {

    companion object {
        const val TABLE_NAME = Constants.TODO_TABLE
    }
}