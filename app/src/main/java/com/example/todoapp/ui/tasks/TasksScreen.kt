package com.example.todoapp.ui.tasks

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todoapp.ui.theme.TodoAppTheme

@Composable
fun TaskScreen(
    modifier: Modifier = Modifier,
    tasksViewModel: TasksViewModel = viewModel()
) {
    Text(text = "HOla", modifier = modifier)
}

@Preview(showBackground = true)
@Composable
private fun TaskScreenPreview() {
    TodoAppTheme {
        TaskScreen()
    }

}