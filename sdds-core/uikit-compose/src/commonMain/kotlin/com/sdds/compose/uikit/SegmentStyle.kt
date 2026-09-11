package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.internal.segment.asLegacyColor
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
    @Deprecated("Use shapes", ReplaceWith("shapes"))
    val shape: CornerBasedShape

    /**
     * Значения [shape] для состояний компонента.
     */
    val shapes: StatefulValue<CornerBasedShape>

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

    /**
     * Стиль [Divider]
     */
    val dividerStyle: DividerStyle

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
@ApiInfo
interface SegmentStyleBuilder : StyleBuilder<SegmentStyle> {

    /**
     * Устанавливает форму компонента
     */
    fun shape(shape: CornerBasedShape): SegmentStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает значения [shape] для состояний компонента.
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): SegmentStyleBuilder

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
     * Устанавливает стиль [SegmentItemStyle]
     */
    fun segmentItemStyle(segmentItemStyle: SegmentItemStyle): SegmentStyleBuilder

    /**
     * Устанавливает стиль [Divider]
     */
    fun dividerStyle(dividerStyle: DividerStyle): SegmentStyleBuilder
}

@Immutable
private class DefaultSegmentStyle(
    override val shapes: StatefulValue<CornerBasedShape>,
    override val colors: SegmentColors,
    override val dimensions: SegmentDimensions,
    override val segmentItemStyle: SegmentItemStyle,
    override val dividerStyle: DividerStyle,
) : SegmentStyle {

    @Deprecated("Use shapes", ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()

    class Builder : SegmentStyleBuilder {
        private var shape: StatefulValue<CornerBasedShape>? = null
        private var colorsBuilder: SegmentColorsBuilder = SegmentColors.builder()
        private var dimensionsBuilder: SegmentDimensionsBuilder =
            SegmentDimensions.builder()
        private var segmentItemStyle: SegmentItemStyle? = null
        private var dividerStyle: DividerStyle? = null

        override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
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

        override fun dividerStyle(dividerStyle: DividerStyle) = apply {
            this.dividerStyle = dividerStyle
        }

        override fun style(): SegmentStyle {
            return DefaultSegmentStyle(
                shapes = shape ?: CircleShape.asStatefulValue(),
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                segmentItemStyle = segmentItemStyle ?: SegmentItemStyle.builder()
                    .style(),
                dividerStyle = dividerStyle ?: DividerStyle.builder().style(),
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
    @Deprecated("Use backgroundBrush", ReplaceWith("backgroundBrush"))
    val backgroundColor: InteractiveColor

    /**
     * Значения [backgroundColor] для состояний компонента.
     */
    val backgroundBrush: StatefulValue<Brush>

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
    fun backgroundColor(backgroundColor: InteractiveColor): SegmentColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает значения [backgroundColor] для состояний компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): SegmentColorsBuilder

    /**
     * Устанавливает заливку [backgroundColor].
     */
    fun backgroundColor(backgroundColor: Brush): SegmentColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Возвращает [SegmentColors]
     */
    fun build(): SegmentColors
}

@Immutable
private class DefaultSegmentColors(
    override val backgroundBrush: StatefulValue<Brush>,
) : SegmentColors {

    @Deprecated("Use backgroundBrush", ReplaceWith("backgroundBrush"))
    override val backgroundColor: InteractiveColor = backgroundBrush.asLegacyColor()

    class Builder : SegmentColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun build(): SegmentColors {
            return DefaultSegmentColors(
                backgroundBrush = backgroundColor ?: Color.White.asInteractive().asStatefulBrush(),
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
    @Deprecated("Use paddingStartValues", ReplaceWith("paddingStartValues"))
    val paddingStart: Dp

    /**
     * Значения [paddingStart] для состояний компонента.
     */
    val paddingStartValues: StatefulValue<Dp>

    /**
     * Отступ в конце
     */
    @Deprecated("Use paddingEndValues", ReplaceWith("paddingEndValues"))
    val paddingEnd: Dp

    /**
     * Значения [paddingEnd] для состояний компонента.
     */
    val paddingEndValues: StatefulValue<Dp>

    /**
     * Отступ сверху
     */
    @Deprecated("Use paddingTopValues", ReplaceWith("paddingTopValues"))
    val paddingTop: Dp

    /**
     * Значения [paddingTop] для состояний компонента.
     */
    val paddingTopValues: StatefulValue<Dp>

    /**
     * Отступ снизу
     */
    @Deprecated("Use paddingBottomValues", ReplaceWith("paddingBottomValues"))
    val paddingBottom: Dp

    /**
     * Значения [paddingBottom] для состояний компонента.
     */
    val paddingBottomValues: StatefulValue<Dp>

    /**
     * Отступ между элементами
     */
    @Deprecated("Use gapValues", ReplaceWith("gapValues"))
    val gap: Dp

    /**
     * Значения [gap] для состояний компонента.
     */
    val gapValues: StatefulValue<Dp>

    /**
     * Отступ разделителя вначале
     */
    @Deprecated("Use dividerPaddingStartValues", ReplaceWith("dividerPaddingStartValues"))
    val dividerPaddingStart: Dp

    /**
     * Значения [dividerPaddingStart] для состояний компонента.
     */
    val dividerPaddingStartValues: StatefulValue<Dp>

    /**
     * Отступ разделителя вконце
     */
    @Deprecated("Use dividerPaddingEndValues", ReplaceWith("dividerPaddingEndValues"))
    val dividerPaddingEnd: Dp

    /**
     * Значения [dividerPaddingEnd] для состояний компонента.
     */
    val dividerPaddingEndValues: StatefulValue<Dp>

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
    fun paddingStart(paddingStart: Dp): SegmentDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает значения [paddingStart] для состояний компонента.
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): SegmentDimensionsBuilder

    /**
     * Устанавливает отступ в конце
     */
    fun paddingEnd(paddingEnd: Dp): SegmentDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает значения [paddingEnd] для состояний компонента.
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): SegmentDimensionsBuilder

    /**
     * Устанавливает отступ сверху
     */
    fun paddingTop(paddingTop: Dp): SegmentDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает значения [paddingTop] для состояний компонента.
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): SegmentDimensionsBuilder

    /**
     * Устанавливает отступ снизу
     */
    fun paddingBottom(paddingBottom: Dp): SegmentDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает значения [paddingBottom] для состояний компонента.
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): SegmentDimensionsBuilder

    /**
     * Устанавливает отступ разделителя вначале
     */
    fun dividerPaddingStart(paddingStart: Dp): SegmentDimensionsBuilder =
        dividerPaddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает значения [dividerPaddingStart] для состояний компонента.
     */
    fun dividerPaddingStart(paddingStart: StatefulValue<Dp>): SegmentDimensionsBuilder

    /**
     * Устанавливает отступ разделителя вконце
     */
    fun dividerPaddingEnd(paddingEnd: Dp): SegmentDimensionsBuilder =
        dividerPaddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает значения [dividerPaddingEnd] для состояний компонента.
     */
    fun dividerPaddingEnd(paddingEnd: StatefulValue<Dp>): SegmentDimensionsBuilder

    /**
     * Устанавливает отступ между элементами
     */
    fun gap(gap: Dp): SegmentDimensionsBuilder =
        gap(gap.asStatefulValue())

    /**
     * Устанавливает значения [gap] для состояний компонента.
     */
    fun gap(gap: StatefulValue<Dp>): SegmentDimensionsBuilder

    /**
     * Вернет [SegmentDimensions]
     */
    fun build(): SegmentDimensions
}

@Immutable
private class DefaultSegmentDimensions(
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,
    override val gapValues: StatefulValue<Dp>,
    override val dividerPaddingStartValues: StatefulValue<Dp>,
    override val dividerPaddingEndValues: StatefulValue<Dp>,
) : SegmentDimensions {

    @Deprecated("Use paddingStartValues", ReplaceWith("paddingStartValues"))
    override val paddingStart: Dp = paddingStartValues.getDefaultValue()

    @Deprecated("Use paddingEndValues", ReplaceWith("paddingEndValues"))
    override val paddingEnd: Dp = paddingEndValues.getDefaultValue()

    @Deprecated("Use paddingTopValues", ReplaceWith("paddingTopValues"))
    override val paddingTop: Dp = paddingTopValues.getDefaultValue()

    @Deprecated("Use paddingBottomValues", ReplaceWith("paddingBottomValues"))
    override val paddingBottom: Dp = paddingBottomValues.getDefaultValue()

    @Deprecated("Use gapValues", ReplaceWith("gapValues"))
    override val gap: Dp = gapValues.getDefaultValue()

    @Deprecated("Use dividerPaddingStartValues", ReplaceWith("dividerPaddingStartValues"))
    override val dividerPaddingStart: Dp = dividerPaddingStartValues.getDefaultValue()

    @Deprecated("Use dividerPaddingEndValues", ReplaceWith("dividerPaddingEndValues"))
    override val dividerPaddingEnd: Dp = dividerPaddingEndValues.getDefaultValue()

    class Builder : SegmentDimensionsBuilder {
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null
        private var gap: StatefulValue<Dp>? = null
        private var dividerPaddingStart: StatefulValue<Dp>? = null
        private var dividerPaddingEnd: StatefulValue<Dp>? = null

        override fun paddingStart(paddingStart: StatefulValue<Dp>) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: StatefulValue<Dp>) = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun dividerPaddingStart(paddingStart: StatefulValue<Dp>) = apply {
            this.dividerPaddingStart = paddingStart
        }

        override fun dividerPaddingEnd(paddingEnd: StatefulValue<Dp>) = apply {
            this.dividerPaddingEnd = paddingEnd
        }

        override fun gap(gap: StatefulValue<Dp>) = apply {
            this.gap = gap
        }

        override fun build(): SegmentDimensions {
            return DefaultSegmentDimensions(
                paddingStartValues = paddingStart ?: 4.dp.asStatefulValue(),
                paddingEndValues = paddingEnd ?: 4.dp.asStatefulValue(),
                paddingTopValues = paddingTop ?: 4.dp.asStatefulValue(),
                paddingBottomValues = paddingBottom ?: 4.dp.asStatefulValue(),
                gapValues = gap ?: Dp.Unspecified.asStatefulValue(),
                dividerPaddingStartValues = dividerPaddingStart ?: Dp.Unspecified.asStatefulValue(),
                dividerPaddingEndValues = dividerPaddingEnd ?: Dp.Unspecified.asStatefulValue(),
            )
        }
    }
}
