package com.sdds.compose.uikit

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ChipGroupStyle] для компонента [ChipGroup]
 */
val LocalChipGroupStyle = compositionLocalOf { ChipGroupStyle.builder().style() }

/**
 * Стиль компонента [ChipGroup]
 */
@Stable
interface ChipGroupStyle : Style {

    /**
     * Размеры и отступы компонента
     * @see ChipGroupDimensions
     */
    val dimensions: ChipGroupDimensions

    companion object {

        /**
         * Возвращает экземпляр [ChipGroupStyleBuilder]
         */
        fun builder(): ChipGroupStyleBuilder = DefaultChipGroupStyle.Builder()
    }
}

/**
 * Builder для [ChipGroupStyle]
 */
@Stable
interface ChipGroupStyleBuilder : StyleBuilder<ChipGroupStyle> {

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     * @see ChipGroupStyle.dimensions
     * @see ChipGroupDimensions
     */
    fun dimensions(dimensions: ChipGroupDimensions): ChipGroupStyleBuilder
}

/**
 * Размеры и отступы компонента [ChipGroup]
 * @property horizontalSpacing горизонтальный отступ между элементами
 * @property verticalSpacing вертикальный отступ между элементами
 */
@Immutable
data class ChipGroupDimensions(
    val horizontalSpacing: Dp = 2.dp,
    val verticalSpacing: Dp = 2.dp,
)

@Immutable
private data class DefaultChipGroupStyle(
    override val dimensions: ChipGroupDimensions,
) : ChipGroupStyle {

    class Builder : ChipGroupStyleBuilder {

        private var dimensions: ChipGroupDimensions? = null

        override fun dimensions(dimensions: ChipGroupDimensions) = apply {
            this.dimensions = dimensions
        }

        override fun style(): ChipGroupStyle =
            DefaultChipGroupStyle(
                dimensions = dimensions ?: ChipGroupDimensions(),
            )
    }
}
