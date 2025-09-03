package com.sdds.testing.compose.drawer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.CloseIconAlignment
import com.sdds.compose.uikit.CloseIconPlacement
import com.sdds.compose.uikit.Drawer
import com.sdds.compose.uikit.DrawerAlignment
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.DrawerValue
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.compose.uikit.rememberDrawerState
import com.sdds.icons.R
import kotlinx.coroutines.launch

/**
 * Тест-кейсы для [Drawer]
 */

/**
 * PLASMA-T2236
 */
@Composable
fun DrawerCloseInnerMStartHeader(
    style: DrawerStyle,
    listItemStyle: ListItemStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val drawerState = rememberDrawerState(
            initialValue = DrawerValue.Closed,
            alignment = DrawerAlignment.Start,
        )
        val scope = rememberCoroutineScope()
        Drawer(
            drawerState = drawerState,
            style = style,
            gesturesEnabled = true,
            overlayEnabled = false,
            moveContentEnabled = true,
            drawerHeader = { Header() },
            drawerContent = { Body(style = listItemStyle) },
            drawerFooter = null,
            closeIconPlacement = CloseIconPlacement.Inner,
            closeIconAlignment = CloseIconAlignment.Start,
            closeIconAbsolute = false,
            closeIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_close_24),
                    "",
                )
            },
            content = {
                Box(modifier = Modifier.align(Alignment.Center)) {
                    ButtonDrawer(
                        buttonStyle = buttonStyle,
                        onClick = {
                            scope.launch {
                                drawerState.open()
                            }
                        },
                    )
                }
            },
        )
    }
}

/**
 * PLASMA-T2237
 */
@Composable
fun DrawerCloseOuterMShadowTopEndFooterHasOverlay(
    style: DrawerStyle,
    listItemStyle: ListItemStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val drawerState = rememberDrawerState(
            initialValue = DrawerValue.Closed,
            alignment = DrawerAlignment.Top,
        )
        val scope = rememberCoroutineScope()
        Drawer(
            modifier = Modifier.testTag("Drawer"),
            drawerState = drawerState,
            style = style,
            gesturesEnabled = true,
            peekOffset = 56.dp,
            overlayEnabled = true,
            moveContentEnabled = false,
            drawerHeader = {},
            drawerContent = { Body(style = listItemStyle) },
            drawerFooter = { Footer() },
            closeIconPlacement = CloseIconPlacement.Outer,
            closeIconAlignment = CloseIconAlignment.End,
            closeIconAbsolute = false,
            closeIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_close_24),
                    "",
                )
            },
            content = {
                Box(modifier = Modifier.align(Alignment.Center)) {
                    ButtonDrawer(
                        buttonStyle = buttonStyle,
                        onClick = {
                            scope.launch {
                                drawerState.open()
                            }
                        },
                    )
                }
            },
        )
    }
}

/**
 * PLASMA-T2238
 */
@Composable
fun DrawerCloseNoneEndStartHeaderFooter(
    style: DrawerStyle,
    listItemStyle: ListItemStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val drawerState = rememberDrawerState(
            initialValue = DrawerValue.Closed,
            alignment = DrawerAlignment.End,
        )
        val scope = rememberCoroutineScope()
        Drawer(
            drawerState = drawerState,
            style = style,
            gesturesEnabled = true,
            overlayEnabled = false,
            moveContentEnabled = false,
            drawerHeader = { Header() },
            drawerContent = { Body(style = listItemStyle) },
            drawerFooter = { Footer() },
            closeIconPlacement = CloseIconPlacement.None,
            closeIconAbsolute = false,
            closeIcon = null,
            content = {
                Box(modifier = Modifier.align(Alignment.Center)) {
                    ButtonDrawer(
                        buttonStyle = buttonStyle,
                        onClick = {
                            scope.launch {
                                drawerState.open()
                            }
                        },
                    )
                }
            },
        )
    }
}

/**
 * PLASMA-T2239
 */
@Composable
fun DrawerCloseInnerNoShadowBottomEnd(
    style: DrawerStyle,
    listItemStyle: ListItemStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val drawerState = rememberDrawerState(
            initialValue = DrawerValue.Closed,
            alignment = DrawerAlignment.Bottom,
        )
        val scope = rememberCoroutineScope()
        Drawer(
            modifier = Modifier.testTag("Drawer"),
            drawerState = drawerState,
            style = style,
            gesturesEnabled = false,
            overlayEnabled = false,
            moveContentEnabled = false,
            drawerHeader = {},
            drawerContent = { Body(style = listItemStyle) },
            drawerFooter = {},
            closeIconPlacement = CloseIconPlacement.Inner,
            closeIconAlignment = CloseIconAlignment.End,
            closeIconAbsolute = false,
            closeIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_close_24),
                    "",
                )
            },
            content = {
                Box(modifier = Modifier.align(Alignment.Center)) {
                    ButtonDrawer(
                        buttonStyle = buttonStyle,
                        onClick = {
                            scope.launch {
                                drawerState.open()
                            }
                        },
                    )
                }
            },
        )
    }
}

/**
 * PLASMA-T2242
 */
@Composable
fun DrawerCloseInnerPeakOffSet(
    style: DrawerStyle,
    listItemStyle: ListItemStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val drawerState = rememberDrawerState(
            initialValue = DrawerValue.Closed,
            alignment = DrawerAlignment.End,
        )
        val scope = rememberCoroutineScope()
        Drawer(
            drawerState = drawerState,
            style = style,
            gesturesEnabled = true,
            peekOffset = 56.dp,
            overlayEnabled = true,
            moveContentEnabled = true,
            drawerHeader = { Header() },
            drawerContent = { Body(style = listItemStyle) },
            drawerFooter = {},
            closeIconPlacement = CloseIconPlacement.Inner,
            closeIconAlignment = CloseIconAlignment.Start,
            closeIconAbsolute = false,
            closeIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_close_24),
                    "",
                )
            },
            content = {
                Box(modifier = Modifier.align(Alignment.Center)) {
                    ButtonDrawer(
                        buttonStyle = buttonStyle,
                        onClick = {
                            scope.launch {
                                drawerState.open()
                            }
                        },
                    )
                }
            },
        )
    }
}

/**
 * PLASMA-T2260
 */
@Composable
fun DrawerCloseIconAbsolute(
    style: DrawerStyle,
    listItemStyle: ListItemStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val drawerState = rememberDrawerState(
            initialValue = DrawerValue.Closed,
            alignment = DrawerAlignment.Start,
        )
        val scope = rememberCoroutineScope()
        Drawer(
            drawerState = drawerState,
            style = style,
            gesturesEnabled = true,
            overlayEnabled = false,
            moveContentEnabled = true,
            drawerHeader = null,
            drawerContent = { Body(style = listItemStyle) },
            drawerFooter = null,
            closeIconPlacement = CloseIconPlacement.Inner,
            closeIconAlignment = CloseIconAlignment.Start,
            closeIconAbsolute = true,
            closeIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_close_24),
                    "",
                )
            },
            content = {
                Box(modifier = Modifier.align(Alignment.Center)) {
                    ButtonDrawer(
                        buttonStyle = buttonStyle,
                        onClick = {
                            scope.launch {
                                drawerState.open()
                            }
                        },
                    )
                }
            },
        )
    }
}

@Composable
private fun ButtonDrawer(buttonStyle: ButtonStyle, onClick: () -> Unit) {
    Button(
        style = buttonStyle,
        label = "Показать Drawer",
        modifier = Modifier
            .testTag("DrawerButton"),
        onClick = onClick,
    )
}

@Composable
private fun Header() {
    Box(
        Modifier
            .fillMaxWidth()
            .heightIn(min = 30.dp),
    ) {
        Text("Header", modifier = Modifier.align(Alignment.CenterStart))
    }
}

@Composable
private fun Footer() {
    Box(
        Modifier
            .fillMaxWidth()
            .heightIn(min = 30.dp),
    ) {
        Text("Footer", modifier = Modifier.align(Alignment.CenterStart))
    }
}

@Composable
private fun Body(style: ListItemStyle) {
    com.sdds.compose.uikit.List {
        items(20) {
            var isFocused by remember { mutableStateOf(false) }
            ListItem(
                text = "item $it",
                style = style,
                modifier = Modifier
                    .focusSelector(
                        settings = LocalFocusSelectorSettings.current,
                        isFocused = { isFocused },
                    ),
            )
        }
    }
}
