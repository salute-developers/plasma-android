package com.sdds.playground.sandbox.chip

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Text
import com.sdds.playground.sandbox.chip.SandboxChipSettingsProvider.backgroundColor
import com.sdds.playground.sandbox.chip.SandboxChipSettingsProvider.contentColor
import com.sdds.playground.sandbox.chip.SandboxChipSettingsProvider.contentMargin
import com.sdds.playground.sandbox.chip.SandboxChipSettingsProvider.endPadding
import com.sdds.playground.sandbox.chip.SandboxChipSettingsProvider.iconSize
import com.sdds.playground.sandbox.chip.SandboxChipSettingsProvider.pressedBackgroundColor
import com.sdds.playground.sandbox.chip.SandboxChipSettingsProvider.shape
import com.sdds.playground.sandbox.chip.SandboxChipSettingsProvider.startPadding
import com.sdds.playground.sandbox.chip.SandboxChipSettingsProvider.style

@Composable
internal fun SandboxChip(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    label: String = "",
    size: SandboxChip.Size = SandboxChip.Size.M,
    shape: SandboxChip.Shape = SandboxChip.Shape.Default,
    state: SandboxChip.State = SandboxChip.State.Default,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Chip(
        modifier = modifier.height(size.height),
        onClick = onClick,
        shape = shape(shape, size),
        backgroundColor = backgroundColor(state),
        pressedBackgroundColor = pressedBackgroundColor(state),
        startContent = startContent,
        textContent = { Text(text = label) },
        textContentStyle = style(size, state),
        endContent = endContent,
        startContentColor = contentColor(state),
        endContentColor = contentColor(state),
        startPadding = startPadding(size, startContent != null),
        endPadding = endPadding(size, endContent != null),
        startContentSize = iconSize(size),
        endContentSize = iconSize(size),
        startContentMargin = contentMargin(size),
        endContentMargin = contentMargin(size),
        enabled = enabled,
        interactionSource = interactionSource,
    )
}

@Composable
internal fun SandboxChip(
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    onSelectedChange: ((Boolean) -> Unit)? = null,
    label: String = "",
    size: SandboxChip.Size = SandboxChip.Size.M,
    shape: SandboxChip.Shape = SandboxChip.Shape.Default,
    state: SandboxChip.State = SandboxChip.State.Default,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Chip(
        modifier = modifier.height(size.height),
        isSelected = isSelected,
        onSelectedChange = onSelectedChange,
        shape = shape(shape, size),
        backgroundColor = backgroundColor(state),
        startContent = startContent,
        textContent = {
            Text(
                text = label,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                softWrap = false,
            )
        },
        textContentStyle = style(size, state),
        endContent = endContent,
        startContentColor = contentColor(state),
        endContentColor = contentColor(state),
        startPadding = startPadding(size, startContent != null),
        endPadding = endPadding(size, endContent != null),
        startContentSize = iconSize(size),
        endContentSize = iconSize(size),
        startContentMargin = contentMargin(size),
        endContentMargin = contentMargin(size),
        enabled = enabled,
        interactionSource = interactionSource,
    )
}

internal object SandboxChip {

    enum class State {
        Default,
        Secondary,
        Accent,
    }

    enum class Shape {
        Default,
        Pilled,
    }

    enum class Size(val height: Dp) {
        L(48.dp),
        M(40.dp),
        S(32.dp),
        XS(24.dp),
    }
}
