package com.sdds.playground.sandbox.navigationbar.collapsing

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.MediumTopAppBar
import com.sdds.compose.uikit.Text

@Composable
@Preview(showBackground = true)
fun CollapsingNavBarPreview() {
    Column {
        MediumTopAppBar(
            title = { Text(text = "Title")}
        )
        LazyColumn {
            items(20) {
                Text(text = "Label text $it")
            }
        }
    }
}