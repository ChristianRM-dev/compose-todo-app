package com.example.todoapp.ui.core

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.todoapp.R

@Composable
fun TodoAppFAB(modifier: Modifier = Modifier) {
    FloatingActionButton(onClick = { /*TODO*/ }, modifier = Modifier) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = stringResource(id = R.string.add_button_content_description)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TodoAppFABPreview() {
    TodoAppFAB()
}