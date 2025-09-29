package com.sdds.testing.compose.list

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector

/**
 * Тест кейсы для List
 */

/**
 * List с тремя элементами и disclosure
 */
@Composable
fun ListAmountThreeHasDisclosure(style: ListStyle) {
    com.sdds.compose.uikit.List(
        modifier = Modifier.fillMaxWidth(),
        style = style,
    ) {
        items(3) {
            val interactionSource = remember { MutableInteractionSource() }
            val isFocused = interactionSource.collectIsFocusedAsState()
            ListItem(
                modifier = Modifier
                    .fillMaxWidth()
                    .focusable(interactionSource = interactionSource)
                    .focusSelector(
                        settings = LocalFocusSelectorSettings.current,
                    ) { isFocused.value },
                text = "Title",
                disclosureEnabled = true,
                interactionSource = interactionSource,
            )
        }
    }
}

/**
 * List without disclosure
 */
@Composable
fun ListAmountThreeNoDisclosure(style: ListStyle) {
    com.sdds.compose.uikit.List(
        modifier = Modifier.fillMaxWidth(),
        style = style,
    ) {
        items(3) {
            val interactionSource = remember { MutableInteractionSource() }
            val isFocused = interactionSource.collectIsFocusedAsState()
            ListItem(
                modifier = Modifier
                    .focusable(interactionSource = interactionSource)
                    .focusSelector(
                        settings = LocalFocusSelectorSettings.current,
                    ) { isFocused.value },
                text = "Title",
                disclosureEnabled = false,
                interactionSource = interactionSource,
            )
        }
    }
}

/**
 * List с двадцатью элементами
 */
@Composable
fun ListAmountTwenty(style: ListStyle) {
    com.sdds.compose.uikit.List(
        modifier = Modifier.fillMaxWidth(),
        style = style,
    ) {
        items(20) {
            val interactionSource = remember { MutableInteractionSource() }
            val isFocused = interactionSource.collectIsFocusedAsState()
            ListItem(
                modifier = Modifier
                    .focusable(interactionSource = interactionSource)
                    .focusSelector(
                        settings = LocalFocusSelectorSettings.current,
                    ) { isFocused.value },
                text = "Title",
                disclosureEnabled = false,
                interactionSource = interactionSource,
            )
        }
    }
}

/**
 * Preview для меню песочницы
 */
@Composable
fun ListForSandbox(style: ListStyle) {
    com.sdds.compose.uikit.List(
        modifier = Modifier.fillMaxWidth(),
        style = style,
    ) {
        items(3) {
            val interactionSource = remember { MutableInteractionSource() }
            val isFocused = interactionSource.collectIsFocusedAsState()
            ListItem(
                modifier = Modifier
                    .fillMaxWidth()
                    .focusable(interactionSource = interactionSource)
                    .focusSelector(
                        settings = LocalFocusSelectorSettings.current,
                    ) { isFocused.value },
                text = "Title $it",
                disclosureEnabled = true,
                interactionSource = interactionSource,
            )
        }
    }
}
