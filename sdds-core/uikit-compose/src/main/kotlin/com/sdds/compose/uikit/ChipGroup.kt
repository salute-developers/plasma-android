package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.common.FlowRowLayout
import com.sdds.compose.uikit.internal.common.FlowRowScope

/**
 * Компонент предназначен для группировки chip в строку с возможностью переноса или скролла
 *
 * @param modifier модификатор
 * @param horizontalSpacing горизонтальный отступ между элементами
 * @param verticalSpacing вертикальный отступ между элементами
 * @param shouldWrap должны ли элементы переноситься на следующую строку
 * @param content контент (элементы группы)
 */
@Composable
@NonRestartableComposable
fun ChipGroup(
    modifier: Modifier = Modifier,
    horizontalSpacing: Dp = 2.dp,
    verticalSpacing: Dp = 2.dp,
    shouldWrap: Boolean = true,
    content: @Composable FlowRowScope.() -> Unit,
) {
    FlowRowLayout(
        modifier = modifier,
        horizontalSpacing = horizontalSpacing,
        verticalSpacing = verticalSpacing,
        shouldWrap = shouldWrap,
        content = content,
    )
}
