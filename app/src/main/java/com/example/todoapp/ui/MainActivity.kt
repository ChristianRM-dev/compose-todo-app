package com.example.todoapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.todoapp.ui.core.TodoAppFAB
import com.example.todoapp.ui.core.TodoTopAppBar
import com.example.todoapp.ui.tasks.TaskScreen
import com.example.todoapp.ui.theme.TodoAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodoAppTheme {
                TodoApp()
            }
        }
    }
}

@Composable
private fun TodoApp() {
    Scaffold(
        topBar = { TodoTopAppBar(modifier = Modifier) },
        floatingActionButton = {
            TodoAppFAB(modifier = Modifier)
        }
    ) { padding ->
        TaskScreen(modifier = Modifier.padding(padding))
    }
}

@Preview(device = Devices.PHONE, showSystemUi = true)
@Composable
private fun TaskAppPreview() {
    TodoAppTheme {
        TodoApp()
    }
}
