package com.sdds.plasma.sd.service.sandbox.chip

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.plasma.sd.service.styles.Accent
import com.sdds.plasma.sd.service.styles.Default
import com.sdds.plasma.sd.service.styles.L
import com.sdds.plasma.sd.service.styles.M
import com.sdds.plasma.sd.service.styles.Pilled
import com.sdds.plasma.sd.service.styles.S
import com.sdds.plasma.sd.service.styles.Secondary
import com.sdds.plasma.sd.service.styles.Xs

internal data class ChipUiState(
    val state: State = State.Default,
    val size: Size = Size.M,
    val shape: Shape = Shape.Default,
    val isClickable: Boolean = true,
    val label: String = "Label",
    val hasStartIcon: Boolean = true,
    val hasEndIcon: Boolean = true,
    val enabled: Boolean = true,
)

internal enum class State {
    Default,
    Secondary,
    Accent,
}

internal enum class Shape {
    Default,
    Pilled,
}

internal enum class Size {
    L, M, S, XS,
}

@Composable
internal fun Size.chipStyleBuilder(): ChipStyleBuilder =
    when (this) {
        Size.L -> Chip.L
        Size.M -> Chip.M
        Size.S -> Chip.S
        Size.XS -> Chip.Xs
    }

@Composable
internal fun ChipUiState.chipStyle(): ChipStyle {
    var builder = size.chipStyleBuilder()
    builder = when (shape) {
        Shape.Default -> builder
        Shape.Pilled -> builder.Pilled
    }

    builder = when (state) {
        State.Default -> builder.Default
        State.Secondary -> builder.Secondary
        State.Accent -> builder.Accent
    }
    return builder.style()
}