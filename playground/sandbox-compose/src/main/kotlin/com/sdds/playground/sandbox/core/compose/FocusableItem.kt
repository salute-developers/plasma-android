package com.sdds.playground.sandbox.core.compose

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged

/**
 *
 * @author Малышев Александр on 26.11.2024
 */
@Composable
internal fun Modifier.focusableItem(
    focusRequester: FocusRequester? = remember { FocusRequester() },
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
    onFocusChanged: (FocusState) -> Unit = {},
): Modifier = this
    .onFocusChanged {
        onFocusChanged(it)
    }
    .let { modifier ->
        focusRequester?.let { modifier.focusRequester(it) } ?: modifier
    }
    .focusable(enabled, interactionSource)
