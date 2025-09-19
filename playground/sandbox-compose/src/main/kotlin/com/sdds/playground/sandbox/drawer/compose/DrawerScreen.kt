package com.sdds.playground.sandbox.drawer.compose

import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Drawer
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.DrawerValue
import com.sdds.compose.uikit.List
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.LocalListItemStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.compose.uikit.rememberDrawerState
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.compose.focusableItem
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import kotlinx.coroutines.launch

/**
 * Экран с [Drawer]
 */
@Composable
internal fun DrawerScreen(componentKey: ComponentKey = ComponentKey.Drawer) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<DrawerViewModel>(
            factory = DrawerViewModelFactory(DrawerUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { uiState, style ->
            val drawerState = rememberDrawerState(
                initialValue = DrawerValue.Closed,
                alignment = uiState.alignment,
            )
            val scope = rememberCoroutineScope()

            Drawer(
                drawerState = drawerState,
                style = style,
                closeIconAlignment = uiState.closeIconAlignment,
                closeIconAbsolute = uiState.closeIconAbsolute,
                peekOffset = (56.dp).takeIf { uiState.hasPeekOffset } ?: 0.dp,
                overlayEnabled = uiState.hasOverlay,
                gesturesEnabled = uiState.gesturesEnabled,
                moveContentEnabled = uiState.moveContentEnabled,
                drawerHeader = if (uiState.header) {
                    { Header() }
                } else {
                    null
                },
                drawerFooter = if (uiState.footer) {
                    { Footer() }
                } else {
                    null
                },
                drawerContent = { Body() },
            ) {
                Button(
                    label = "Показать Drawer",
                    modifier = Modifier.align(Alignment.Center),
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
private fun Body() {
    List {
        items(20) {
            var isFocused by remember { mutableStateOf(false) }
            ListItem(
                text = "item $it",
                style = DrawerListItemStyle,
                modifier = Modifier
                    .fillMaxWidth()
                    .focusableItem { focus -> isFocused = focus.isFocused }
                    .focusSelector(
                        settings = LocalFocusSelectorSettings.current,
                        isFocused = { isFocused },
                    ),
            )
        }
    }
}

private val DrawerListItemStyle: ListItemStyle
    @Composable
    get() {
        val current = LocalListItemStyle.current
        return ListItemStyle.builder()
            .titleStyle(current.titleStyle)
            .shape(current.shape)
            .apply { current.disclosureIconRes?.let { disclosureIcon(it) } }
            .dimensions {
                paddingStart(0.dp)
                paddingEnd(0.dp)
                paddingTop(current.dimensions.paddingTop)
                paddingBottom(current.dimensions.paddingBottom)
                contentPaddingEnd(current.dimensions.contentPaddingEnd)
                height(current.dimensions.height)
            }
            .colors {
                titleColor(current.colors.titleColor)
                backgroundColor(current.colors.backgroundColor)
            }
            .style()
    }

@Preview(showBackground = true)
@Composable
private fun DrawerScreenPreview() {
    SandboxTheme {
        DrawerScreen()
    }
}

@Composable
internal fun DrawerPreview(style: DrawerStyle) {
    val drawerState = rememberDrawerState(
        initialValue = DrawerValue.Closed,
    )
    val scope = rememberCoroutineScope()

    Drawer(
        drawerState = drawerState,
        style = style,
        drawerContent = {
            List {
                items(3) {
                    ListItem(text = "item $it")
                }
            }
        },
    ) {
        Button(
            label = "Показать Drawer",
            modifier = Modifier.align(Alignment.Center),
            onClick = {
                scope.launch {
                    drawerState.open()
                }
            },
        )
    }
}
