package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [SegmentStyle] для компонента [Segment]
 */
val LocalSegmentStyle =
    compositionLocalOf(structuralEqualityPolicy()) { SegmentStyle.builder().style() }

/**
 * Стиль компонента [Segment]
 */
@Immutable
interface SegmentStyle : Style {

    /**
     * Форма компонента
     */
    val shape: CornerBasedShape

    /**
     * Цвета компонента [Segment]
     */
    val colors: SegmentColors

    /**
     * Размеры и отступы компонента [Segment]
     */
    val dimensions: SegmentDimensions

    /**
     * Стиль [SegmentItem]
     */
    val segmentItemStyle: SegmentItemStyle

    companion object {
        /**
         * Возвращает экземпляр [SegmentStyleBuilder]
         */
        fun builder(receiver: Any? = null): SegmentStyleBuilder = DefaultSegmentStyle.Builder()
    }
}

/**
 * Билдер стиля [SegmentStyle]
 */
interface SegmentStyleBuilder : StyleBuilder<SegmentStyle> {

    /**
     * Устанавливает форму компонента
     */
    fun shape(shape: CornerBasedShape): SegmentStyleBuilder

    /**
     * Устанавливает цвета компонента [Segment]
     */
    @Composable
    fun colors(builder: @Composable SegmentColorsBuilder.() -> Unit): SegmentStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [Segment]
     */
    @Composable
    fun dimensions(builder: @Composable SegmentDimensionsBuilder.() -> Unit): SegmentStyleBuilder

    /**
     * Устанавливает стиль [Counter]
     */
    fun segmentItemStyle(segmentItemStyle: SegmentItemStyle): SegmentStyleBuilder
}

@Immutable
private class DefaultSegmentStyle(
    override val shape: CornerBasedShape,
    override val colors: SegmentColors,
    override val dimensions: SegmentDimensions,
    override val segmentItemStyle: SegmentItemStyle,
) : SegmentStyle {

    class Builder : SegmentStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var colorsBuilder: SegmentColorsBuilder = SegmentColors.builder()
        private var dimensionsBuilder: SegmentDimensionsBuilder =
            SegmentDimensions.builder()
        private var segmentItemStyle: SegmentItemStyle? = null

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        @Composable
        override fun colors(builder: @Composable (SegmentColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (SegmentDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun segmentItemStyle(segmentItemStyle: SegmentItemStyle) = apply {
            this.segmentItemStyle = segmentItemStyle
        }

        override fun style(): SegmentStyle {
            return DefaultSegmentStyle(
                shape = shape ?: CircleShape,
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                segmentItemStyle = segmentItemStyle ?: SegmentItemStyle.builder()
                    .style(),
            )
        }
    }
}

/**
 * Цвета компонента [Segment]
 */
@Immutable
interface SegmentColors {

    /**
     * Цвет фона
     */
    val backgroundColor: InteractiveColor

    companion object {

        /**
         * Возвращает экземпляр [SegmentColorsBuilder]
         */
        fun builder(): SegmentColorsBuilder = DefaultSegmentColors.Builder()
    }
}

/**
 * Билдер для [SegmentColors]
 */
interface SegmentColorsBuilder {

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(backgroundColor: Color): SegmentColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(backgroundColor: InteractiveColor): SegmentColorsBuilder

    /**
     * Возвращает [SegmentColors]
     */
    fun build(): SegmentColors
}

@Immutable
private class DefaultSegmentColors(
    override val backgroundColor: InteractiveColor,
) : SegmentColors {

    class Builder : SegmentColorsBuilder {
        private var backgroundColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: InteractiveColor) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun build(): SegmentColors {
            return DefaultSegmentColors(
                backgroundColor = backgroundColor ?: Color.White.asInteractive(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента [Segment]
 */
@Immutable
interface SegmentDimensions {

    /**
     * Отступ в начале
     */
    val paddingStart: Dp

    /**
     * Отступ в конце
     */
    val paddingEnd: Dp

    /**
     * Отступ сверху
     */
    val paddingTop: Dp

    /**
     * Отступ снизу
     */
    val paddingBottom: Dp

    companion object {

        /**
         * Возвращает экземпляр [SegmentDimensionsBuilder]
         */
        fun builder(): SegmentDimensionsBuilder = DefaultSegmentDimensions.Builder()
    }
}

/**
 * Билдер для [SegmentDimensions]
 */
interface SegmentDimensionsBuilder {

    /**
     * Устанавливает отступ в начале
     */
    fun paddingStart(paddingStart: Dp): SegmentDimensionsBuilder

    /**
     * Устанавливает отступ в конце
     */
    fun paddingEnd(paddingEnd: Dp): SegmentDimensionsBuilder

    /**
     * Устанавливает отступ сверху
     */
    fun paddingTop(paddingTop: Dp): SegmentDimensionsBuilder

    /**
     * Устанавливает отступ снизу
     */
    fun paddingBottom(paddingBottom: Dp): SegmentDimensionsBuilder

    /**
     * Вернет [SegmentDimensions]
     */
    fun build(): SegmentDimensions
}

@Immutable
private class DefaultSegmentDimensions(
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
) : SegmentDimensions {

    class Builder : SegmentDimensionsBuilder {
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var paddingTop: Dp? = null
        private var paddingBottom: Dp? = null

        override fun paddingStart(paddingStart: Dp) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: Dp) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: Dp) = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: Dp) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun build(): SegmentDimensions {
            return DefaultSegmentDimensions(
                paddingStart = paddingStart ?: 4.dp,
                paddingEnd = paddingEnd ?: 4.dp,
                paddingTop = paddingTop ?: 4.dp,
                paddingBottom = paddingBottom ?: 4.dp,
            )
        }
    }
}
