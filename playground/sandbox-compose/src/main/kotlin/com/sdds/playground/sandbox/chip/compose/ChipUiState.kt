package com.sdds.playground.sandbox.chip.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.serv.styles.chip.Accent
import com.sdds.serv.styles.chip.Default
import com.sdds.serv.styles.chip.L
import com.sdds.serv.styles.chip.M
import com.sdds.serv.styles.chip.Pilled
import com.sdds.serv.styles.chip.S
import com.sdds.serv.styles.chip.Secondary
import com.sdds.serv.styles.chip.Xs

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
