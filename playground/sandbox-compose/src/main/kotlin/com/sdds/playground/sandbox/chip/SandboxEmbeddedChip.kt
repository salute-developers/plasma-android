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
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChipSettingsProvider.backgroundColor
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChipSettingsProvider.contentColor
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChipSettingsProvider.contentMargin
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChipSettingsProvider.endPadding
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChipSettingsProvider.iconSize
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChipSettingsProvider.shape
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChipSettingsProvider.startPadding
import com.sdds.playground.sandbox.chip.SandboxEmbeddedChipSettingsProvider.style

@Composable
internal fun SandboxEmbeddedChip(
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    onSelectedChange: ((Boolean) -> Unit)? = null,
    label: String = "",
    size: SandboxEmbeddedChip.Size = SandboxEmbeddedChip.Size.M,
    state: SandboxEmbeddedChip.State = SandboxEmbeddedChip.State.Default,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Chip(
        modifier = modifier.height(size.height),
        isSelected = isSelected,
        onSelectedChange = onSelectedChange,
        shape = shape(size),
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

internal object SandboxEmbeddedChip {

    enum class State {
        Default,
        Secondary,
        Accent,
    }

    enum class Size(val height: Dp) {
        L(44.dp),
        M(36.dp),
        S(28.dp),
        XS(20.dp),
    }
}

@Preview(showBackground = true)
@Composable
internal fun SandboxEmbeddedChipPreview() {
    SandboxEmbeddedChip(
        label = "label",
        startContent = {
            Icon(
                painter = painterResource(id = com.sdds.icons.R.drawable.ic_accessibility_24),
                contentDescription = "",
            )
        },
    )
}
