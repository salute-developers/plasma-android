package com.sdds.compose.uikit.internal.tabs.measure

import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.Constraints
import com.sdds.compose.uikit.Tabs
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero

internal class VerticalMeasurePolicy : MeasurePolicy {

    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        // Сначала измеряем кнопки, чтобы знать их фиксированные размеры
        val startButtonPlaceable = measurables
            .firstOrNull { it.layoutId == Tabs.START_BUTTON_LAYOUT_ID }
            ?.measure(constraints.copy(minHeight = 0, maxHeight = Constraints.Infinity))
        val endButtonPlaceable = measurables
            .firstOrNull { it.layoutId == Tabs.END_BUTTON_LAYOUT_ID }
            ?.measure(constraints.copy(minHeight = 0, maxHeight = Constraints.Infinity))

        // Вычисляем доступное пространство для контента
        val buttonsHeight = startButtonPlaceable.heightOrZero() + endButtonPlaceable.heightOrZero()
        val availableHeight = constraints.maxHeight - buttonsHeight

        // Измеряем контент с учетом доступного пространства
        val contentConstraints = constraints.copy(
            minWidth = 0,
            maxHeight = maxOf(0, availableHeight),
            minHeight = 0,
        )
        val contentPlaceable = measurables
            .firstOrNull { it.layoutId == Tabs.TABS_CONTAINER_LAYOUT_ID }
            ?.measure(contentConstraints)

        // Измеряем разделитель с учетом доступной ширины
        val dividerConstraints = constraints.copy(
            minWidth = 0,
            maxHeight = contentPlaceable.heightOrZero(),
            minHeight = 0,
        )
        val dividerPlaceable = measurables
            .firstOrNull { it.layoutId == Tabs.DIVIDER_LAYOUT_ID }
            ?.measure(dividerConstraints)

        val desiredHeight = startButtonPlaceable.heightOrZero() +
            endButtonPlaceable.heightOrZero() +
            contentPlaceable.heightOrZero()
        val height = minOf(constraints.maxHeight, desiredHeight)
        val width = maxOf(
            startButtonPlaceable.widthOrZero(),
            contentPlaceable.widthOrZero(),
            endButtonPlaceable.widthOrZero(),
            constraints.minWidth,
        )

        return layout(width, height) {
            // Размещаем левую кнопку
            val startButtonX = (width - startButtonPlaceable.widthOrZero()) / 2
            startButtonPlaceable?.placeRelative(startButtonX, 0)

            // Размещаем центральный контент
            val contentY = startButtonPlaceable.heightOrZero()
            val contentX = (width - contentPlaceable.widthOrZero()) / 2
            contentPlaceable?.placeRelative(contentX, contentY)

            // Размещаем правую кнопку
            val endButtonY = height - endButtonPlaceable.heightOrZero()
            val endButtonX = (width - endButtonPlaceable.widthOrZero()) / 2
            endButtonPlaceable?.placeRelative(endButtonX, endButtonY)

            // Размешаем разделитель
            dividerPlaceable?.placeRelative(0, startButtonPlaceable.heightOrZero())
        }
    }
}
