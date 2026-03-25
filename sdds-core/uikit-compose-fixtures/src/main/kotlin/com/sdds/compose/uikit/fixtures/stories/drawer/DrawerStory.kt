package com.sdds.compose.uikit.fixtures.stories.drawer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
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
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.sandbox.internal.focusableItem
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.CloseIconAlignment
import com.sdds.compose.uikit.Drawer
import com.sdds.compose.uikit.DrawerAlignment
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.DrawerValue
import com.sdds.compose.uikit.List
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.LocalListItemStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.DrawerUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.DrawerUiStateTransformer
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.compose.uikit.rememberDrawerState
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState
import kotlinx.coroutines.launch

/**
 * Состояние BottomSheet
 */
@StoryUiState
data class DrawerUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val alignment: DrawerAlignment = DrawerAlignment.Bottom,
    val closeIconAlignment: CloseIconAlignment = CloseIconAlignment.End,
    val closeIconAbsolute: Boolean = false,
    val header: Boolean = false,
    val footer: Boolean = false,
    val hasOverlay: Boolean = true,
    val hasPeekOffset: Boolean = false,
    val gesturesEnabled: Boolean = true,
    val moveContentEnabled: Boolean = false,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object DrawerStory : ComposeBaseStory<DrawerUiState, DrawerStyle>(
    ComponentKey.Drawer,
    DrawerUiState(),
    DrawerUiStatePropertiesProducer,
    DrawerUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: DrawerStyle,
        state: DrawerUiState,
    ) {
        val drawerState = rememberDrawerState(
            initialValue = DrawerValue.Closed,
            alignment = state.alignment,
        )
        val scope = rememberCoroutineScope()

        Drawer(
            drawerState = drawerState,
            style = style,
            closeIconAlignment = state.closeIconAlignment,
            closeIconAbsolute = state.closeIconAbsolute,
            peekOffset = (56.dp).takeIf { state.hasPeekOffset } ?: 0.dp,
            overlayEnabled = state.hasOverlay,
            gesturesEnabled = state.gesturesEnabled,
            moveContentEnabled = state.moveContentEnabled,
            drawerHeader = if (state.header) {
                { Header() }
            } else {
                null
            },
            drawerFooter = if (state.footer) {
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
    }

    @Composable
    override fun Preview(
        style: DrawerStyle,
        key: ComponentKey,
    ) {
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
