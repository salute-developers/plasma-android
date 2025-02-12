package com.sdds.playground.sandbox.indicator.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Indicator
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.indicator.Accent
import com.sdds.serv.styles.indicator.Black
import com.sdds.serv.styles.indicator.Dark
import com.sdds.serv.styles.indicator.Default
import com.sdds.serv.styles.indicator.Inactive
import com.sdds.serv.styles.indicator.L
import com.sdds.serv.styles.indicator.M
import com.sdds.serv.styles.indicator.Negative
import com.sdds.serv.styles.indicator.Positive
import com.sdds.serv.styles.indicator.S
import com.sdds.serv.styles.indicator.Warning
import com.sdds.serv.styles.indicator.White
import com.sdds.serv.styles.indicator.WrapperIndicatorView

/**
 * Состояние компонента Indicator
 * @property state состояние компонента
 * @property size размер компонента
 */
internal data class IndicatorUiState(
    val state: State = State.Default,
    val size: Size = Size.L,
)

internal enum class State {
    Default,
    Accent,
    Inactive,
    Positive,
    Warning,
    Negative,
    Dark,
    Black,
    White,
}

internal enum class Size {
    L, M, S,
}

@Composable
private fun WrapperIndicatorView.applyState(state: State): IndicatorStyle {
    return when (state) {
        State.Default -> Default
        State.Accent -> Accent
        State.Inactive -> Inactive
        State.Positive -> Positive
        State.Negative -> Negative
        State.Warning -> Warning
        State.Dark -> Dark
        State.Black -> Black
        State.White -> White
    }.style()
}

@Composable
internal fun IndicatorUiState.indicatorStyle(): IndicatorStyle {
    return when (size) {
        Size.L -> Indicator.L
        Size.M -> Indicator.M
        Size.S -> Indicator.S
    }
        .applyState(state)
}
