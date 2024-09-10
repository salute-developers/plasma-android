package com.sdds.playground.sandbox.chip

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
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
        label = label,
        labelStyle = style(size, state),
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
        label = label,
        labelStyle = style(size, state),
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
@Preview(showBackground = true)
internal fun SandboxChipPreview() {
    SandboxTheme {
        SandboxChip(
            size = SandboxChip.Size.M,
            label = "label",
            isSelected = true,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_accessibility_24),
                    contentDescription = "",
                )
            },
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_close_24),
                    contentDescription = "",
                )
            },
        )
    }
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

@Composable
@Preview
internal fun SandboxChipPreviewSizeLDefault() {
    SandboxTheme {
        SandboxChip(
            size = SandboxChip.Size.L,
            shape = SandboxChip.Shape.Default,
            state = SandboxChip.State.Default,
            label = "Label",
            onClick = {},
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plasma_24),
                    contentDescription = null,
                )
            },
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_close_24),
                    contentDescription = null,
                )
            },
            enabled = true,
        )
    }
}

@Composable
@Preview
internal fun SandboxChipPreviewSizeXsSecondary() {
    SandboxTheme(darkTheme = true) {
        SandboxChip(
            size = SandboxChip.Size.XS,
            shape = SandboxChip.Shape.Default,
            state = SandboxChip.State.Secondary,
            label = "Label",
            onClick = {},
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plasma_24),
                    contentDescription = null,
                )
            },
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_close_24),
                    contentDescription = null,
                )
            },
            enabled = true,
        )
    }
}

@Composable
@Preview
internal fun SandboxChipPreviewSizeMAccent() {
    SandboxTheme {
        SandboxChip(
            size = SandboxChip.Size.M,
            shape = SandboxChip.Shape.Pilled,
            state = SandboxChip.State.Accent,
            label = "Label",
            onClick = {},
            enabled = true,
        )
    }
}

@Composable
@Preview
internal fun SandboxChipPreviewSizeSDisabled() {
    SandboxTheme {
        SandboxChip(
            size = SandboxChip.Size.S,
            shape = SandboxChip.Shape.Default,
            state = SandboxChip.State.Default,
            label = "Label",
            onClick = {},
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plasma_24),
                    contentDescription = null,
                )
            },
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_close_24),
                    contentDescription = null,
                )
            },
            enabled = false,
        )
    }
}
