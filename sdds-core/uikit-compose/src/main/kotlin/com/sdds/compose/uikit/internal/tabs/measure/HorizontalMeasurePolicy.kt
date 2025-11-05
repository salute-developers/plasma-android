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

internal class HorizontalMeasurePolicy : MeasurePolicy {

    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        // Сначала измеряем кнопки, чтобы знать их фиксированные размеры
        val startButtonPlaceable = measurables
            .firstOrNull { it.layoutId == Tabs.START_BUTTON_LAYOUT_ID }
            ?.measure(constraints.copy(minWidth = 0, maxWidth = Constraints.Infinity))
        val endButtonPlaceable = measurables
            .firstOrNull { it.layoutId == Tabs.END_BUTTON_LAYOUT_ID }
            ?.measure(constraints.copy(minWidth = 0, maxWidth = Constraints.Infinity))

        // Вычисляем доступное пространство для контента
        val buttonsWidth = startButtonPlaceable.widthOrZero() + endButtonPlaceable.widthOrZero()
        val availableWidth = constraints.maxWidth - buttonsWidth

        // Измеряем контент с учетом доступного пространства
        val contentConstraints = constraints.copy(
            minWidth = 0,
            maxWidth = maxOf(0, availableWidth),
            minHeight = 0,
        )
        val contentPlaceable = measurables
            .firstOrNull { it.layoutId == Tabs.TABS_CONTAINER_LAYOUT_ID }
            ?.measure(contentConstraints)

        // Измеряем разделитель с учетом доступной ширины
        val dividerConstraints = constraints.copy(
            minWidth = 0,
            maxWidth = contentPlaceable.widthOrZero(),
            minHeight = 0,
        )
        val dividerPlaceable = measurables
            .firstOrNull { it.layoutId == Tabs.DIVIDER_LAYOUT_ID }
            ?.measure(dividerConstraints)

        val desiredWidth = startButtonPlaceable.widthOrZero() +
            endButtonPlaceable.widthOrZero() +
            contentPlaceable.widthOrZero()
        val height = maxOf(
            startButtonPlaceable.heightOrZero(),
            contentPlaceable.heightOrZero(),
            endButtonPlaceable.heightOrZero(),
            constraints.minHeight,
        )

        return layout(desiredWidth, height) {
            // Размещаем левую кнопку
            val startButtonY = (height - startButtonPlaceable.heightOrZero()) / 2
            startButtonPlaceable?.placeRelative(0, startButtonY)

            // Размещаем центральный контент
            val contentX = startButtonPlaceable.widthOrZero()
            val contentY = (height - contentPlaceable.heightOrZero()) / 2
            contentPlaceable?.placeRelative(contentX, contentY)

            // Размещаем правую кнопку
            val endButtonX = desiredWidth - endButtonPlaceable.widthOrZero()
            val endButtonY = (height - endButtonPlaceable.heightOrZero()) / 2
            endButtonPlaceable?.placeRelative(endButtonX, endButtonY)

            // Размещаем разделитель
            val dividerY = height - dividerPlaceable.heightOrZero()
            dividerPlaceable?.placeRelative(startButtonPlaceable.widthOrZero(), dividerY)
        }
    }
}
