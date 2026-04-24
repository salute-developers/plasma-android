package com.sdds.compose.uikit.fixtures.testcases

import android.graphics.drawable.Icon
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.List
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
    List(
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
    List(
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
    List(
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
 * List icon disclosure
 */
@Composable
fun ListIconDisclosure(style: ListStyle) {
    List(style = style) {
        items(3) {
            val interactionSource = remember { MutableInteractionSource() }
            val isFocused = interactionSource.collectIsFocusedAsState()
            ListItem(
                modifier = Modifier
                    .focusable(interactionSource = interactionSource)
                    .focusSelector(
                        settings = LocalFocusSelectorSettings.current,
                    ) { isFocused.value },
                startContent = {
                    Icon(
                        painterResource(com.sdds.icons.R.drawable.ic_plasma_36),
                        contentDescription = "",
                    )
                },
                text = "Title",
                disclosureEnabled = true,
                interactionSource = interactionSource,
            )
        }
    }
}

/**
 * List counter disclosure
 */
@Composable
fun ListCounterDisclosure(style: ListStyle) {
    List(style = style) {
        items(3) {
            val interactionSource = remember { MutableInteractionSource() }
            val isFocused = interactionSource.collectIsFocusedAsState()
            ListItem(
                modifier = Modifier
                    .focusable(interactionSource = interactionSource)
                    .focusSelector(
                        settings = LocalFocusSelectorSettings.current,
                    ) { isFocused.value },
                startContent = {
                    Counter(
                        count = "1",
                    )
                },
                text = "Title",
                disclosureEnabled = true,
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
    List(
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
