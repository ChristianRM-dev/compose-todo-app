package com.example.todoapp.ui.core

import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.todoapp.R
import com.example.todoapp.ui.theme.TodoAppTheme

@Composable
fun TodoTopAppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
            Text(text = stringResource(id = R.string.app_name))
        },
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
private fun TodoAppBarPreview() {
    TodoAppTheme {
        TodoTopAppBar()
    }
}