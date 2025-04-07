package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.ChipGroupOverflowMode.Companion.toFlowRowLayoutMode
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
fun ChipGroup(
    modifier: Modifier = Modifier,
    style: ChipGroupStyle = LocalChipGroupStyle.current,
    overflowMode: ChipGroupOverflowMode = ChipGroupOverflowMode.Wrap,
    content: @Composable FlowRowScope.() -> Unit,
) {
    FlowRowLayout(
        modifier = modifier,
        horizontalSpacing = style.dimensions.horizontalSpacing,
        verticalSpacing = style.dimensions.verticalSpacing,
        mode = overflowMode.toFlowRowLayoutMode(),
        content = content,
    )
}

/**
 * Режим переполнения контейнера с чипами
 */
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
