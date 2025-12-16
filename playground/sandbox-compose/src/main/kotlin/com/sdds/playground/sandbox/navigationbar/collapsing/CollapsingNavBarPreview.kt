package com.sdds.playground.sandbox.navigationbar.collapsing

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CollapsingNavBar
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.CollapsingNavBarDefaults
import com.sdds.compose.uikit.rememberTopAppBarState

@Composable
@Preview(showBackground = true)
fun CollapsingNavNavBarPreview() {
    val scrollBehavior =
        CollapsingNavBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())
    Column(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection)
    ) {
        CollapsingNavBar(
            title = { Text(text = "Title") },
            description = { Text(text = "Description") },
            navigationIcon = {
                Icon(
                    painter = painterResource(com.sdds.icons.R.drawable.ic_arrow_left_24),
                    contentDescription = ""
                )
            },
            scrollBehavior = scrollBehavior,
            actions = {
                Icon(
                    painter = painterResource(com.sdds.icons.R.drawable.ic_search_24),
                    contentDescription = ""
                )
                Icon(
                    painter = painterResource(com.sdds.icons.R.drawable.ic_menu_24),
                    contentDescription = ""
                )
            }
        )
        LazyColumn {
            items(100) {
                Text(modifier = Modifier.padding(32.dp), text = "Label text $it")
            }
        }
    }
}