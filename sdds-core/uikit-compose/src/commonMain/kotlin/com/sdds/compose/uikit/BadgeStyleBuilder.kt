package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [BadgeStyle] для компонента [BadgeSolid]
 */
val LocalBadgeStyle = compositionLocalOf { BadgeStyle.badgeBuilder().style() }

/**
 * Возвращает экземпляр [BadgeStyleBuilder] для Transparent
 */
fun BadgeStyle.Companion.badgeBuilder(receiver: Any? = null): BadgeStyleBuilder =
    BadgeStyleBuilderImpl(receiver)

/**
 * Builder стиля [BadgeSolid]
 */
@ApiInfo(builderFunName = "badgeBuilder")
interface BadgeStyleBuilder : StyleBuilder<BadgeStyle> {

    /**
     * Устанавливает форму компонента [shape]
     * @see BadgeStyle.shape
     */
    fun shape(shape: CornerBasedShape): BadgeStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает формы компонента [shape]
     * @see BadgeStyle.shape
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): BadgeStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see BadgeStyle.colors
     * @see [BadgeColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable BadgeColorsBuilder.() -> Unit): BadgeStyleBuilder

    /**
     * Устанавливает стиль основного текста компонента [labelStyle]
     * @see BadgeStyle.labelStyle
     */
    fun labelStyle(labelStyle: TextStyle): BadgeStyleBuilder =
        labelStyle(labelStyle.asStatefulValue())

    /**
     * Устанавливает стиль основного текста компонента [labelStyle]
     */
    fun labelStyle(labelStyle: StatefulValue<TextStyle>): BadgeStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable BadgeDimensionsBuilder.() -> Unit): BadgeStyleBuilder
}

/**
 * Builder для [BadgeDimensions].
 */
interface BadgeDimensionsBuilder {

    /**
     * Устанавливает высоту Badge
     */
    fun height(height: Dp): BadgeDimensionsBuilder =
        height(height.asStatefulValue())

    /**
     * Устанавливает высоту Badge
     */
    fun height(values: StatefulValue<Dp>): BadgeDimensionsBuilder

    /**
     * Устанавливает размер иконки в конце
     */
    fun endContentSize(endContentSize: Dp): BadgeDimensionsBuilder =
        endContentSize(endContentSize.asStatefulValue())

    /**
     * Устанавливает размер иконки в конце
     */
    fun endContentSize(values: StatefulValue<Dp>): BadgeDimensionsBuilder

    /**
     * Устанавливает  размер иконки в начале
     */
    fun startContentSize(startContentSize: Dp): BadgeDimensionsBuilder =
        startContentSize(startContentSize.asStatefulValue())

    /**
     * Устанавливает  размер иконки в начале
     */
    fun startContentSize(values: StatefulValue<Dp>): BadgeDimensionsBuilder

    /**
     * Устанавливает отступы контента в начале
     */
    fun startContentMargin(startContentMargin: Dp): BadgeDimensionsBuilder =
        startContentMargin(startContentMargin.asStatefulValue())

    /**
     * Устанавливает отступы контента в начале
     */
    fun startContentMargin(values: StatefulValue<Dp>): BadgeDimensionsBuilder

    /**
     * Устанавливает отступы контента в конце
     */
    fun endContentMargin(endContentMargin: Dp): BadgeDimensionsBuilder =
        endContentMargin(endContentMargin.asStatefulValue())

    /**
     * Устанавливает отступы контента в конце
     */
    fun endContentMargin(values: StatefulValue<Dp>): BadgeDimensionsBuilder

    /**
     * Устанавливает отступ от начала компонента до контента
     */
    fun startPadding(startPadding: Dp): BadgeDimensionsBuilder =
        startPadding(startPadding.asStatefulValue())

    /**
     * Устанавливает отступ от начала компонента до контента
     */
    fun startPadding(values: StatefulValue<Dp>): BadgeDimensionsBuilder

    /**
     * Устанавливает отступ от контента до конца компонента
     */
    fun endPadding(endPadding: Dp): BadgeDimensionsBuilder =
        endPadding(endPadding.asStatefulValue())

    /**
     * Устанавливает отступ от контента до конца компонента
     */
    fun endPadding(values: StatefulValue<Dp>): BadgeDimensionsBuilder

    /**
     * Возвращает готовый экземпляр [BadgeDimensions]
     */
    fun build(): BadgeDimensions

    companion object {
        /**
         * Вернет экземпляр билдера [BadgeDimensionsBuilder]
         */
        fun builder(): BadgeDimensionsBuilder = DefaultBadgeDimensions.Builder()
    }
}

/**
 * Builder для [BadgeColors].
 */
interface BadgeColorsBuilder {

    /**
     * Устанавливает цвет контента компонента [contentColor]
     * @see BadgeColors.contentColor
     * @see InteractiveColor
     */
    fun contentColor(contentColor: InteractiveColor): BadgeColorsBuilder =
        contentColor(contentColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента компонента [contentColor]
     * @see BadgeColorsBuilder.contentColor
     * @see BadgeColors.contentColor
     */
    fun contentColor(contentColor: Color): BadgeColorsBuilder =
        contentColor(contentColor.asStatefulBrush())

    /**
     * Устанавливает кисть контента
     */
    fun contentColor(contentBrush: Brush): BadgeColorsBuilder =
        contentColor(contentBrush.asStatefulValue())

    /**
     * Устанавливает кисти контента
     */
    fun contentColor(contentBrush: StatefulValue<Brush>): BadgeColorsBuilder

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     * @see BadgeColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): BadgeColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     * @see BadgeColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): BadgeColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисть фона компонента [backgroundColor]
     */
    fun backgroundColor(backgroundBrush: Brush): BadgeColorsBuilder =
        backgroundColor(backgroundBrush.asStatefulValue())

    /**
     * Устанавливает кисти фона компонента [backgroundColor]
     */
    fun backgroundColor(backgroundBrush: StatefulValue<Brush>): BadgeColorsBuilder

    /**
     * Устанавливает цвет основного текста компонента [labelColor]
     * @see BadgeColors.labelColor
     * @see InteractiveColor
     */
    fun labelColor(labelColor: InteractiveColor): BadgeColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает цвет основного текста компонента [labelColor]
     * @see BadgeColors.labelColor
     */
    fun labelColor(labelColor: Color): BadgeColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает кисть основного текста [labelColor]
     */
    fun labelColor(labelBrush: Brush): BadgeColorsBuilder =
        labelColor(labelBrush.asStatefulValue())

    /**
     * Устанавливает кисти основного текста [labelColor]
     */
    fun labelColor(labelBrush: StatefulValue<Brush>): BadgeColorsBuilder

    /**
     * Устанавливает цвет контента в начале [startContentColor]
     * @see BadgeColors.startContentColor
     * @see InteractiveColor
     */
    fun startContentColor(startContentColor: InteractiveColor): BadgeColorsBuilder =
        startContentColor(startContentColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента в начале [valueColor]
     * @see BadgeColors.startContentColor
     */
    fun startContentColor(valueColor: Color): BadgeColorsBuilder =
        startContentColor(valueColor.asStatefulBrush())

    /**
     * Устанавливает кисть контента в начале [startContentColor]
     */
    fun startContentColor(startContentBrush: Brush): BadgeColorsBuilder =
        startContentColor(startContentBrush.asStatefulValue())

    /**
     * Устанавливает кисти контента в начале [startContentColor]
     */
    fun startContentColor(startContentBrush: StatefulValue<Brush>): BadgeColorsBuilder

    /**
     * Устанавливает цвет иконки компонента [endContentColor]
     * @see BadgeColors.endContentColor
     * @see InteractiveColor
     */
    fun endContentColor(endContentColor: InteractiveColor): BadgeColorsBuilder =
        endContentColor(endContentColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента в конце [endContentColor]
     * @see BadgeColors.endContentColor
     */
    fun endContentColor(endContentColor: Color): BadgeColorsBuilder =
        endContentColor(endContentColor.asStatefulBrush())

    /**
     * Устанавливает кисть контента в конце [endContentColor]
     */
    fun endContentColor(endContentBrush: Brush): BadgeColorsBuilder =
        endContentColor(endContentBrush.asStatefulValue())

    /**
     * Устанавливает кисти контента в конце [endContentColor]
     */
    fun endContentColor(endContentBrush: StatefulValue<Brush>): BadgeColorsBuilder

    /**
     * Возвращает готовый экземпляр [BadgeColors]
     */
    fun build(): BadgeColors

    companion object {

        /**
         * Вернет экземпляр билдера [BadgeColorsBuilder]
         */
        fun builder(): BadgeColorsBuilder = DefaultBadgeColors.Builder()
    }
}

@Immutable
private class DefaultBadgeStyle(
    override val dimensions: BadgeDimensions,
    override val colors: BadgeColors,
    override val disableAlpha: Float,
    override val labelStyles: StatefulValue<TextStyle>,
    override val shapes: StatefulValue<CornerBasedShape>,
) : BadgeStyle {
    @Deprecated("Use labelStyles", replaceWith = ReplaceWith("labelStyles"))
    override val labelStyle: TextStyle = labelStyles.getDefaultValue()

    @Deprecated("Use shapes", replaceWith = ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()
}

@Immutable
private class DefaultBadgeDimensions(
    override val heightValues: StatefulValue<Dp>,
    override val startContentSizeValues: StatefulValue<Dp>,
    override val endContentSizeValues: StatefulValue<Dp>,
    override val startContentMarginValues: StatefulValue<Dp>,
    override val endContentMarginValues: StatefulValue<Dp>,
    override val startPaddingValues: StatefulValue<Dp>,
    override val endPaddingValues: StatefulValue<Dp>,
) : BadgeDimensions {
    @Deprecated(
        "Use heightValues",
        replaceWith = ReplaceWith("heightValues"),
    )
    override val height: Dp = 28.dp

    @Deprecated(
        "Use startContentSizeValues",
        replaceWith = ReplaceWith("startContentSizeValues"),
    )
    override val startContentSize: Dp = 16.dp

    @Deprecated(
        "Use endContentSizeValues",
        replaceWith = ReplaceWith("endContentSizeValues"),
    )
    override val endContentSize: Dp = 16.dp

    @Deprecated(
        "Use startContentMarginValues",
        replaceWith = ReplaceWith("startContentMarginValues"),
    )
    override val startContentMargin: Dp = 4.dp

    @Deprecated(
        "Use endContentMarginValues",
        replaceWith = ReplaceWith("endContentMarginValues"),
    )
    override val endContentMargin: Dp = 4.dp

    @Deprecated(
        "Use startPaddingValues",
        replaceWith = ReplaceWith("startPaddingValues"),
    )
    override val startPadding: Dp = 10.dp

    @Deprecated(
        "Use endPaddingValues",
        replaceWith = ReplaceWith("endPaddingValues"),
    )
    override val endPadding: Dp = 10.dp

    class Builder : BadgeDimensionsBuilder {
        private var heightValues: StatefulValue<Dp>? = null
        private var endContentSizeValues: StatefulValue<Dp>? = null
        private var startContentSizeValues: StatefulValue<Dp>? = null
        private var startContentMarginValues: StatefulValue<Dp>? = null
        private var endContentMarginValues: StatefulValue<Dp>? = null
        private var startPaddingValues: StatefulValue<Dp>? = null
        private var endPaddingValues: StatefulValue<Dp>? = null

        override fun height(values: StatefulValue<Dp>): BadgeDimensionsBuilder = apply {
            this.heightValues = values
        }

        override fun endContentSize(values: StatefulValue<Dp>): BadgeDimensionsBuilder = apply {
            this.endContentSizeValues = values
        }

        override fun startContentSize(values: StatefulValue<Dp>): BadgeDimensionsBuilder = apply {
            this.startContentSizeValues = values
        }

        override fun startContentMargin(values: StatefulValue<Dp>): BadgeDimensionsBuilder = apply {
            this.startContentMarginValues = values
        }

        override fun endContentMargin(values: StatefulValue<Dp>): BadgeDimensionsBuilder = apply {
            this.endContentMarginValues = values
        }

        override fun startPadding(values: StatefulValue<Dp>): BadgeDimensionsBuilder = apply {
            this.startPaddingValues = values
        }

        override fun endPadding(values: StatefulValue<Dp>): BadgeDimensionsBuilder = apply {
            this.endPaddingValues = values
        }

        override fun build(): BadgeDimensions {
            return DefaultBadgeDimensions(
                heightValues = heightValues ?: 28.dp.asStatefulValue(),
                startContentSizeValues = startContentSizeValues ?: 16.dp.asStatefulValue(),
                endContentSizeValues = endContentSizeValues ?: 16.dp.asStatefulValue(),
                startContentMarginValues = startContentMarginValues ?: 4.dp.asStatefulValue(),
                endContentMarginValues = endContentMarginValues ?: 4.dp.asStatefulValue(),
                startPaddingValues = startPaddingValues ?: 10.dp.asStatefulValue(),
                endPaddingValues = endPaddingValues ?: 10.dp.asStatefulValue(),
            )
        }
    }
}

@Immutable
private class DefaultBadgeColors(
    override val contentBrush: StatefulValue<Brush>,
    override val backgroundBrush: StatefulValue<Brush>,
    override val labelBrush: StatefulValue<Brush>,
    override val startContentBrush: StatefulValue<Brush>,
    override val endContentBrush: StatefulValue<Brush>,
) : BadgeColors {
    @Deprecated(
        "Use contentBrush",
        replaceWith = ReplaceWith("contentBrush"),
    )
    override val contentColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated(
        "Use backgroundBrush",
        replaceWith = ReplaceWith("backgroundBrush"),
    )
    override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated(
        "Use labelBrush",
        replaceWith = ReplaceWith("labelBrush"),
    )
    override val labelColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated(
        "Use startContentBrush",
        replaceWith = ReplaceWith("startContentBrush"),
    )
    override val startContentColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated(
        "Use endContentBrush",
        replaceWith = ReplaceWith("endContentBrush"),
    )
    override val endContentColor: InteractiveColor = Color.Transparent.asInteractive()

    class Builder : BadgeColorsBuilder {
        private var contentBrush: StatefulValue<Brush>? = null
        private var backgroundBrush: StatefulValue<Brush>? = null
        private var labelBrush: StatefulValue<Brush>? = null
        private var startContentBrush: StatefulValue<Brush>? = null
        private var endContentBrush: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundBrush: StatefulValue<Brush>) = apply {
            this.backgroundBrush = backgroundBrush
        }

        override fun labelColor(labelBrush: StatefulValue<Brush>) = apply {
            this.labelBrush = labelBrush
        }

        override fun startContentColor(startContentBrush: StatefulValue<Brush>) = apply {
            this.startContentBrush = startContentBrush
        }

        override fun endContentColor(endContentBrush: StatefulValue<Brush>) = apply {
            this.endContentBrush = endContentBrush
        }

        override fun contentColor(contentBrush: StatefulValue<Brush>) = apply {
            this.contentBrush = contentBrush
        }

        override fun build(): BadgeColors {
            return DefaultBadgeColors(
                contentBrush = contentBrush ?: Color.White.asStatefulBrush(),
                backgroundBrush = backgroundBrush ?: Color.Black.asStatefulBrush(),
                labelBrush = labelBrush ?: Color.Black.asStatefulBrush(),
                startContentBrush = startContentBrush ?: Color.Black.asStatefulBrush(),
                endContentBrush = endContentBrush ?: Color.Black.asStatefulBrush(),
            )
        }
    }
}

internal class BadgeStyleBuilderImpl(receiver: Any?) : BadgeStyleBuilder {
    private var shapes: StatefulValue<CornerBasedShape>? = null
    private var colorsBuilder: BadgeColorsBuilder = BadgeColorsBuilder.builder()
    private var dimensionsBuilder: BadgeDimensionsBuilder = BadgeDimensionsBuilder.builder()
    private var disableAlpha: Float? = null
    private var labelStyles: StatefulValue<TextStyle>? = null

    override fun shape(shape: StatefulValue<CornerBasedShape>): BadgeStyleBuilder = apply {
        this.shapes = shape
    }

    @Composable
    override fun colors(
        builder:
        @Composable()
        (BadgeColorsBuilder.() -> Unit),
    ): BadgeStyleBuilder =
        apply {
            this.colorsBuilder.builder()
        }

    override fun labelStyle(labelStyle: StatefulValue<TextStyle>) = apply {
        this.labelStyles = labelStyle
    }

    @Composable
    override fun dimensions(
        builder:
        @Composable()
        (BadgeDimensionsBuilder.() -> Unit),
    ): BadgeStyleBuilder =
        apply {
            this.dimensionsBuilder.builder()
        }

    override fun style(): BadgeStyle {
        return DefaultBadgeStyle(
            dimensions = dimensionsBuilder.build(),
            colors = colorsBuilder.build(),
            shapes = shapes ?: RoundedCornerShape(25).asStatefulValue(),
            disableAlpha = disableAlpha ?: DISABLE_BADGE_ALPHA,
            labelStyles = labelStyles ?: TextStyle.Default.asStatefulValue(),
        )
    }
}

private const val DISABLE_BADGE_ALPHA = 0.4f
