package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
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

    /**
     * Стиль чипа
     * @see ChipStyle
     */
    val chipStyle: ChipStyle

    /**
     * Альфа в состоянии disabled
     */
    val disableAlpha: Float

    companion object {

        /**
         * Возвращает экземпляр [ChipGroupStyleBuilder]
         */
        fun builder(receiver: Any? = null): ChipGroupStyleBuilder = DefaultChipGroupStyle.Builder()
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
    @Composable
    fun dimensions(builder: @Composable ChipGroupDimensionsBuilder.() -> Unit): ChipGroupStyleBuilder

    /**
     * Устанавливает стиль чипа [chipStyle]
     * @see ChipGroupStyle.chipStyle
     * @see ChipStyle
     */
    fun chipStyle(chipStyle: ChipStyle): ChipGroupStyleBuilder

    /**
     * Устанавливает альфу в состоянии disable [disableAlpha]
     * @see ChipGroupStyle.disableAlpha
     */
    fun disableAlpha(disableAlpha: Float): ChipGroupStyleBuilder
}

/**
 * Размеры и отступы компонента [ChipGroup]
 */
@Immutable
interface ChipGroupDimensions {
    /**
     * Горизонтальный отступ между чипами
     */
    val gap: Dp

    /**
     * Вертикальный отступ между чипами
     */
    val lineSpacing: Dp

    companion object {

        /**
         * Возвращает билдер [ChipGroupDimensionsBuilder]
         */
        fun builder(): ChipGroupDimensionsBuilder = DefaultChipGroupDimensions.Builder()
    }
}

@Immutable
private class DefaultChipGroupDimensions(
    override val gap: Dp,
    override val lineSpacing: Dp,
) : ChipGroupDimensions {

    class Builder : ChipGroupDimensionsBuilder {
        private var gap: Dp? = null
        private var lineSpacing: Dp? = null

        override fun gap(gap: Dp) = apply {
            this.gap = gap
        }

        override fun lineSpacing(lineSpacing: Dp) = apply {
            this.lineSpacing = lineSpacing
        }

        override fun build(): ChipGroupDimensions {
            return DefaultChipGroupDimensions(
                gap = gap ?: 2.dp,
                lineSpacing = lineSpacing ?: 2.dp,
            )
        }
    }
}

/**
 * Билдер размеров для ChipGroup
 */
interface ChipGroupDimensionsBuilder {

    /**
     * Устаналивает горизонтальный отступ между чипами [gap]
     */
    fun gap(gap: Dp): ChipGroupDimensionsBuilder

    /**
     * Устаналивает вертикальный отступ между чипами [lineSpacing]
     */
    fun lineSpacing(lineSpacing: Dp): ChipGroupDimensionsBuilder

    /**
     * Вернёт экземпляр [ChipGroupDimensions]
     */
    fun build(): ChipGroupDimensions
}

@Immutable
private data class DefaultChipGroupStyle(
    override val dimensions: ChipGroupDimensions,
    override val chipStyle: ChipStyle,
    override val disableAlpha: Float,
) : ChipGroupStyle {

    class Builder : ChipGroupStyleBuilder {

        private var dimensionsBuilder: ChipGroupDimensionsBuilder = ChipGroupDimensions.builder()
        private var chipStyle: ChipStyle? = null
        private var disableAlpha: Float? = null

        @Composable
        override fun dimensions(builder: @Composable (ChipGroupDimensionsBuilder.() -> Unit)) = apply {
            this.dimensionsBuilder.builder()
        }

        override fun chipStyle(chipStyle: ChipStyle) = apply {
            this.chipStyle = chipStyle
        }

        override fun disableAlpha(disableAlpha: Float) = apply {
            this.disableAlpha = disableAlpha
        }

        override fun style(): ChipGroupStyle =
            DefaultChipGroupStyle(
                dimensions = dimensionsBuilder.build(),
                chipStyle = chipStyle ?: ChipStyle.builder().style(),
                disableAlpha = disableAlpha ?: 0.4f,
            )
    }
}
