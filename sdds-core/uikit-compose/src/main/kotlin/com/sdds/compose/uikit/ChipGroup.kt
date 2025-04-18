package com.sdds.compose.uikit

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.internal.common.FlowRowLayout
import com.sdds.compose.uikit.internal.common.FlowRowScope

/**
 * Компонент предназначен для группировки chip в строку с возможностью переноса или скролла
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param overflowMode режим переполнения контейнера (см. [ChipGroupOverflowMode])
 * @param content контент (элементы группы)
 */
@Composable
@NonRestartableComposable
@Deprecated(
    "Use ChipGroup() without overflowMode",
    ReplaceWith("ChipGroup(modifier, style, content)"),
)
fun ChipGroup(
    modifier: Modifier = Modifier,
    style: ChipGroupStyle = LocalChipGroupStyle.current,
    overflowMode: ChipGroupOverflowMode = ChipGroupOverflowMode.Wrap,
    content: @Composable FlowRowScope.() -> Unit,
) {
    val chipGroupModifier = when (overflowMode) {
        ChipGroupOverflowMode.Wrap -> modifier
        ChipGroupOverflowMode.Scrollable ->
            Modifier
                .horizontalScroll(rememberScrollState())
                .then(modifier)
        ChipGroupOverflowMode.Unlimited -> modifier
    }
    ChipGroup(
        modifier = chipGroupModifier,
        style = style,
        content = content,
    )
}

/**
 * Компонент предназначен для группировки chip в строку с возможностью переноса или скролла
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param content контент (элементы группы)
 */
@Composable
@NonRestartableComposable
fun ChipGroup(
    modifier: Modifier = Modifier,
    style: ChipGroupStyle = LocalChipGroupStyle.current,
    content: @Composable FlowRowScope.() -> Unit,
) {
    CompositionLocalProvider(
        LocalChipStyle provides style.chipStyle,
    ) {
        FlowRowLayout(
            modifier = modifier,
            horizontalSpacing = style.dimensions.gap,
            verticalSpacing = style.dimensions.lineSpacing,
            mode = FlowRowLayout.Mode.Wrap,
            content = content,
        )
    }
}

/**
 * Режим переполнения контейнера с чипами
 */
@Deprecated("Don't use")
enum class ChipGroupOverflowMode {
    /**
     * Чипы будут переноситься на другую строку
     */
    Wrap,

    /**
     * Чипы будут добавляться в одну строку без ограничений с возможностью скролла
     */
    Scrollable,

    /**
     * Чипы будут добавляться в одну строку без ограничений
     */
    Unlimited,
    ;

    internal companion object {
        fun ChipGroupOverflowMode.toFlowRowLayoutMode(): FlowRowLayout.Mode =
            when (this) {
                Wrap -> FlowRowLayout.Mode.Wrap
                Scrollable -> FlowRowLayout.Mode.Scrollable
                Unlimited -> FlowRowLayout.Mode.Unlimited
            }
    }
}
