package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.NavigationDrawer
import com.sdds.compose.uikit.NavigationDrawerItem
import com.sdds.compose.uikit.NavigationDrawerStyle
import com.sdds.compose.uikit.NavigationDrawerValue
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.rememberNavigationDrawerState
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.icons.R
import kotlinx.coroutines.launch

/**
 * Тест-кейсы для NavigationDrawer
 */

/**
 * PLASMA-T1972
 */
@Composable
fun NavigationDrawerItemOne(style: NavigationDrawerStyle) {
    NavigationDrawerCommon(
        style = style,
        itemCount = 1,
        header = null,
        footer = null,
    )
}

/**
 * PLASMA-T1973
 */
@Composable
fun NavigationDrawerItemFiveNoTitle(style: NavigationDrawerStyle) {
    NavigationDrawerCommon(
        style = style,
        itemCount = 5,
        title = "",
    )
}

/**
 * PLASMA-T1974
 */
@Composable
fun NavigationDrawerCollapsed(style: NavigationDrawerStyle) {
    NavigationDrawerCommon(
        style = style,
        itemCount = 5,
        initialValue = NavigationDrawerValue.Collapsed,
        footer = null,
    )
}

/**
 * PLASMA-T1975
 */
@Composable
fun NavigationDrawerNoHeader(style: NavigationDrawerStyle) {
    NavigationDrawerCommon(
        style = style,
        itemCount = 5,
        header = null,
    )
}

/**
 * PLASMA-T1976
 */
@Composable
fun NavigationDrawerCounter(style: NavigationDrawerStyle) {
    NavigationDrawerCommon(
        style = style,
        itemCount = 5,
        counter = "123",
        counterItemIndex = 2,
        initialValue = NavigationDrawerValue.Collapsed,
    )
}

/**
 * PLASMA-T1977
 */
@Composable
fun NavigationDrawerAmountFifty(style: NavigationDrawerStyle) {
    NavigationDrawerCommon(
        style = style,
        itemCount = 50,
        counter = "123",
        counterItemIndex = 10,
    )
}

/**
 * Общий кейс для NavigationDrawer
 */
@Composable
fun NavigationDrawerCommon(
    style: NavigationDrawerStyle,
    initialValue: NavigationDrawerValue = NavigationDrawerValue.Expanded,
    expandOnFocus: Boolean = true,
    itemCount: Int = 5,
    title: String = "Title",
    counter: String = "",
    counterItemIndex: Int? = null,
    header: (@Composable (onToggle: () -> Unit) -> Unit)? = { onToggle ->
        NavigationDrawerHeader(onToggle)
    },
    footer: (@Composable () -> Unit)? = { NavigationDrawerFooter() },
) {
    val drawerState = rememberNavigationDrawerState(initialValue)
    val scope = rememberCoroutineScope()
    val selectedIndex = remember { mutableIntStateOf(0) }

    val onToggle: () -> Unit = {
        scope.launch {
            drawerState.toggle()
        }
    }

    NavigationDrawer(
        style = style,
        state = drawerState,
        expandOnFocus = expandOnFocus,
        header = header?.let { headerContent ->
            {
                headerContent(onToggle)
            }
        },
        footer = footer?.let { footerContent -> { footerContent() } },
        lazyContent = {
            items(itemCount) { index ->
                NavigationDrawerItem(
                    modifier = Modifier.fillMaxWidth(),
                    selected = selectedIndex.intValue == index,
                    onClick = {
                        selectedIndex.intValue = index
                    },
                    icon = {
                        Icon(
                            source = resourceImageSource(R.drawable.ic_mail_outline_24),
                            contentDescription = null,
                        )
                    },
                    titleContent = if (title.isNotBlank()) {
                        { Text("$title $index") }
                    } else {
                        null
                    },
                    indicator = if (counter.isNotBlank() && counterItemIndex == index) {
                        { Counter(count = counter) }
                    } else {
                        null
                    },
                )
            }
        },
    )
}

@Composable
private fun NavigationDrawerHeader(
    onClick: () -> Unit,
) {
    NavigationDrawerItem(
        modifier = Modifier
            .testTag("NavigationDrawerHeader")
            .fillMaxWidth(),
        selected = false,
        onClick = onClick,
        icon = {
            Icon(
                source = resourceImageSource(R.drawable.ic_menu_24),
                contentDescription = "Menu",
            )
        },
        titleContent = { Text("Menu") },
    )
}

@Composable
private fun NavigationDrawerFooter() {
    NavigationDrawerItem(
        modifier = Modifier.fillMaxWidth(),
        selected = false,
        icon = {
            Avatar(
                painter = painterResource(id = com.sdds.compose.uikit.fixtures.R.drawable.il_avatar_for_test),
                placeholder = AvatarPlaceholder.Name("Michael Scot"),
                contentScale = ContentScale.Fit,
            )
        },
        titleContent = { Text("User") },
    )
}
