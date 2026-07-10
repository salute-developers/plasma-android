package com.sdds.compose.uikit.internal.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.layout.Measured
import androidx.compose.foundation.layout.FlowRowScope as FoundationFlowRowScope

internal val LocalFlowRowMaxItemsInEachRow = compositionLocalOf { Int.MAX_VALUE }

/**
 * Контейнер, располагающий элементы в строку с возможностью переноса.
 *
 * @param modifier модификатор
 * @param horizontalArrangement горизонтальное размещение элементов
 * @param verticalArrangement вертикальное размещение элементов
 * @param itemVerticalAlignment вертикальное выравнивание элементов
 * @param maxItemsInEachRow максимальное количество элеменов на строке
 * @param maxLines максимально допустимое число строк
 * @param content контент (элементы группы)
 */
@Composable
internal fun FlowRowLayout(
    modifier: Modifier = Modifier,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    itemVerticalAlignment: Alignment.Vertical = Alignment.Top,
    maxItemsInEachRow: Int = LocalFlowRowMaxItemsInEachRow.current,
    maxLines: Int = Int.MAX_VALUE,
    content: @Composable FlowRowScope.() -> Unit,
) {
    FlowRow(
        modifier = modifier,
        horizontalArrangement = horizontalArrangement,
        verticalArrangement = verticalArrangement,
        itemVerticalAlignment = itemVerticalAlignment,
        maxItemsInEachRow = maxItemsInEachRow,
        maxLines = maxLines,
    ) {
        FlowRowScopeImpl(this).content()
    }
}

internal object FlowRowLayout {
    enum class Mode {
        Wrap,
        Scrollable,
        Unlimited,
    }
}

/**
 * Скоуп горизонтального контейнера
 */
interface FlowRowScope : FoundationFlowRowScope

private class FlowRowScopeImpl(private val wrapped: FoundationFlowRowScope) : FlowRowScope {

    @ExperimentalLayoutApi
    override fun Modifier.fillMaxRowHeight(fraction: Float): Modifier {
        return with(wrapped) {
            this@fillMaxRowHeight.fillMaxRowHeight()
        }
    }

    override fun Modifier.align(alignment: Alignment.Vertical): Modifier {
        return with(wrapped) {
            this@align.align(alignment)
        }
    }

    override fun Modifier.alignBy(alignmentLineBlock: (Measured) -> Int): Modifier {
        return with(wrapped) {
            this@alignBy.alignBy(alignmentLineBlock)
        }
    }

    override fun Modifier.alignBy(alignmentLine: HorizontalAlignmentLine): Modifier {
        return with(wrapped) {
            this@alignBy.alignBy(alignmentLine)
        }
    }

    override fun Modifier.alignByBaseline(): Modifier {
        return with(wrapped) {
            this@alignByBaseline.alignByBaseline()
        }
    }

    override fun Modifier.weight(
        weight: Float,
        fill: Boolean,
    ): Modifier {
        return with(wrapped) {
            this@weight.weight(weight, fill)
        }
    }
}
