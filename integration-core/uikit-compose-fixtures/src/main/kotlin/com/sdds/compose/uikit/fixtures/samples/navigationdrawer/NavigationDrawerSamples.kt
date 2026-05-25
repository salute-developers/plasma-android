package com.sdds.compose.uikit.fixtures.samples.navigationdrawer

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.NavigationDrawer
import com.sdds.compose.uikit.NavigationDrawerItem
import com.sdds.compose.uikit.NavigationDrawerValue
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.rememberNavigationDrawerState
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.docs.DocSample
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = true)
fun NavigationDrawer_Expanded() {
    composableCodeSnippet {
        val state = rememberNavigationDrawerState(NavigationDrawerValue.Expanded)
        NavigationDrawer(
            state = state,
            header = {
                NavigationDrawerItem(
                    modifier = Modifier.fillMaxWidth(),
                    selected = false,
                    onClick = { },
                    icon = {
                        Icon(
                            source = resourceImageSource(R.drawable.ic_menu_24),
                            contentDescription = "Menu",
                        )
                    },
                    titleContent = { Text("Menu") },
                )
            },
            footer = {
                NavigationDrawerItem(
                    modifier = Modifier.fillMaxWidth(),
                    selected = false,
                    icon = {
                        Avatar(
                            placeholder = AvatarPlaceholder.Name("Michael Scot"),
                        ) {
                            AsyncImage(
                                modifier = Modifier.matchParentSize(),
                                contentScale = ContentScale.Crop,
                                model = "https://cdn.costumewall.com/wp-content/uploads/2018/09/michael-scott.jpg",
                                contentDescription = "AsyncAvatar",
                            )
                        }
                    },
                    titleContent = { Text("User") },
                )
            },
        ) {
            NavigationDrawerItem(
                selected = true,
                icon = { Icon(painterResource(R.drawable.ic_mail_outline_24), "") },
                titleContent = { Text("Inbox") },
                indicator = { Counter(count = "5") },
                onClick = {},
            )
            NavigationDrawerItem(
                icon = { Icon(painterResource(R.drawable.ic_settings_outline_24), "") },
                titleContent = { Text("Settings") },
                onClick = {},
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun NavigationDrawer_Collapsed() {
    composableCodeSnippet {
        val state = rememberNavigationDrawerState(NavigationDrawerValue.Collapsed)
        placeholder(Unit, "...")
    }
    NavigationDrawer(
        state = rememberNavigationDrawerState(NavigationDrawerValue.Collapsed),
        header = {
            NavigationDrawerItem(
                modifier = Modifier.fillMaxWidth(),
                selected = false,
                onClick = { },
                icon = {
                    Icon(
                        source = resourceImageSource(R.drawable.ic_menu_24),
                        contentDescription = "Menu",
                    )
                },
                titleContent = { Text("Menu") },
            )
        },
        footer = {
            NavigationDrawerItem(
                modifier = Modifier.fillMaxWidth(),
                selected = false,
                icon = {
                    Avatar(
                        placeholder = AvatarPlaceholder.Name("Michael Scot"),
                    ) {
                        AsyncImage(
                            modifier = Modifier.matchParentSize(),
                            contentScale = ContentScale.Crop,
                            model = "https://cdn.costumewall.com/wp-content/uploads/2018/09/michael-scott.jpg",
                            contentDescription = "AsyncAvatar",
                        )
                    }
                },
                titleContent = { Text("User") },
            )
        },
    ) {
        NavigationDrawerItem(
            selected = true,
            icon = { Icon(painterResource(R.drawable.ic_mail_outline_24), "") },
            titleContent = { Text("Inbox") },
            indicator = { Counter(count = "5") },
            onClick = {},
        )
        NavigationDrawerItem(
            icon = { Icon(painterResource(R.drawable.ic_settings_outline_24), "") },
            titleContent = { Text("Settings") },
            onClick = {},
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun NavigationDrawer_LazyList() {
    composableCodeSnippet {
        val selectedIndex = remember { mutableIntStateOf(0) }
        val state = rememberNavigationDrawerState(NavigationDrawerValue.Expanded)

        NavigationDrawer(
            state = state,
            lazyContent = {
                items(count = 50) { index ->
                    NavigationDrawerItem(
                        selected = selectedIndex.intValue == index,
                        icon = { Icon(painterResource(R.drawable.ic_mail_outline_24), "") },
                        titleContent = { Text("Item $index") },
                        onClick = { selectedIndex.intValue = index },
                    )
                }
            },
        )
    }
}
