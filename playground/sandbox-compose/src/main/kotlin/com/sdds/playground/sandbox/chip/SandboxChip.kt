package com.sdds.playground.sandbox.chip

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Text
import com.sdds.playground.sandbox.chip.SandboxChipSettingsProvider.backgroundColor
import com.sdds.playground.sandbox.chip.SandboxChipSettingsProvider.contentColor
import com.sdds.playground.sandbox.chip.SandboxChipSettingsProvider.contentMargin
import com.sdds.playground.sandbox.chip.SandboxChipSettingsProvider.endPadding
import com.sdds.playground.sandbox.chip.SandboxChipSettingsProvider.iconSize
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
    startContent: (@Composable (contentColor: Color) -> Unit)? = null,
    endContent: (@Composable (contentColor: Color) -> Unit)? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Chip(
        modifier = modifier.height(size.height),
        onClick = onClick,
        startPadding = startPadding(size, startContent != null),
        endPadding = endPadding(size, endContent != null),
        shape = shape(shape, size),
        backgroundColor = backgroundColor(state),
        enabled = enabled,
        interactionSource = interactionSource,
    ) {
        startContent?.let {
            Box(modifier = Modifier.size(iconSize(size))) {
                startContent(contentColor(state))
            }
            Spacer(modifier = Modifier.size(contentMargin(size)))
        }
        if (label.isNotEmpty()) {
            Text(text = label, style = style(size, state))
        }
        endContent?.let {
            Spacer(modifier = Modifier.size(contentMargin(size)))
            Box(modifier = Modifier.size(iconSize(size))) {
                endContent(contentColor(state))
            }
        }
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
