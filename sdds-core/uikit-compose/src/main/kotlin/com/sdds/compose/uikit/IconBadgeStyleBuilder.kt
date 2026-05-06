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
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [BadgeStyle] для компонента [IconBadgeSolid]
 */
val LocalIconBadgeStyle = compositionLocalOf { BadgeStyle.iconBadgeBuilder().style() }

/**
 * Возвращает экземпляр [IconBadgeStyleBuilder] для Solid
 */
fun BadgeStyle.Companion.iconBadgeBuilder(receiver: Any? = null): IconBadgeStyleBuilder =
    IconBadgeStyleBuilderImpl(receiver)

/**
 * Builder стиля Badge с иконкой.
 */
interface IconBadgeStyleBuilder : StyleBuilder<BadgeStyle> {

    /**
     * Устанавливает форму компонента [shape]
     * @see BadgeStyle.shape
     */
    fun shape(shape: CornerBasedShape): IconBadgeStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see BadgeStyle.colors
     * @see [BadgeColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable IconBadgeColorsBuilder.() -> Unit): IconBadgeStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable IconBadgeDimensionsBuilder.() -> Unit): IconBadgeStyleBuilder
}

/**
 * Builder для [BadgeDimensions].
 */
interface IconBadgeDimensionsBuilder {

    /**
     * Устанавливает высоту Badge
     */
    fun height(height: Dp): IconBadgeDimensionsBuilder =
        height(height.asStatefulValue())

    /**
     * Устанавливает высоту Badge
     */
    fun height(values: StatefulValue<Dp>): IconBadgeDimensionsBuilder

    /**
     * Устанавливает  размер иконки в начале
     */
    fun startContentSize(startContentSize: Dp): IconBadgeDimensionsBuilder =
        startContentSize(startContentSize.asStatefulValue())

    /**
     * Устанавливает  размер иконки в начале
     */
    fun startContentSize(values: StatefulValue<Dp>): IconBadgeDimensionsBuilder

    /**
     * Устанавливает отступ от начала компонента до контента
     */
    fun startPadding(startPadding: Dp): IconBadgeDimensionsBuilder =
        startPadding(startPadding.asStatefulValue())

    /**
     * Устанавливает отступ от начала компонента до контента
     */
    fun startPadding(values: StatefulValue<Dp>): IconBadgeDimensionsBuilder

    /**
     * Устанавливает отступ от контента до конца компонента
     */
    fun endPadding(endPadding: Dp): IconBadgeDimensionsBuilder =
        endPadding(endPadding.asStatefulValue())

    /**
     * Устанавливает отступ от контента до конца компонента
     */
    fun endPadding(values: StatefulValue<Dp>): IconBadgeDimensionsBuilder

    /**
     * Возвращает готовый экземпляр [BadgeDimensions]
     */
    fun build(): BadgeDimensions

    companion object {
        /**
         * Вернет экземпляр билдера [IconBadgeDimensionsBuilder]
         */
        fun builder(): IconBadgeDimensionsBuilder = DefaultIconBadgeDimensions.Builder()
    }
}

/**
 * Builder для [BadgeColors].
 */
interface IconBadgeColorsBuilder {

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     * @see BadgeColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): IconBadgeColorsBuilder =
        backgroundBrush(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     * @see BadgeColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): IconBadgeColorsBuilder =
        backgroundBrush(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     */
    fun backgroundColor(backgroundColor: StatefulValue<Color>): IconBadgeColorsBuilder =
        backgroundBrush(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисть фона компонента [backgroundBrush]
     */
    fun backgroundBrush(backgroundBrush: StatefulValue<Brush>): IconBadgeColorsBuilder

    /**
     * Устанавливает цвет контента [startContentColor]
     * @see BadgeColors.startContentColor
     * @see InteractiveColor
     */
    fun startContentColor(startContentColor: InteractiveColor): IconBadgeColorsBuilder =
        startContentBrush(startContentColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента [valueColor]
     * @see BadgeColors.startContentColor
     */
    fun startContentColor(valueColor: Color): IconBadgeColorsBuilder =
        startContentBrush(valueColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента [startContentColor]
     */
    fun startContentColor(startContentColor: StatefulValue<Color>): IconBadgeColorsBuilder =
        startContentBrush(startContentColor.asStatefulBrush())

    /**
     * Устанавливает кисть контента [startContentBrush]
     */
    fun startContentBrush(startContentBrush: StatefulValue<Brush>): IconBadgeColorsBuilder

    /**
     * Возвращает готовый экземпляр [BadgeColors]
     */
    fun build(): BadgeColors

    companion object {

        /**
         * Вернет экземпляр билдера [IconBadgeColorsBuilder]
         */
        fun builder(): IconBadgeColorsBuilder = DefaultIconBadgeColors.Builder()
    }
}

@Immutable
private class DefaultIconBadgeStyle(
    override val dimensions: BadgeDimensions,
    override val colors: BadgeColors,
    override val shape: CornerBasedShape,
    override val labelStyle: TextStyle,
    override val disableAlpha: Float,
    override val labelStyles: StatefulValue<TextStyle>,
) : BadgeStyle

@Immutable
private class DefaultIconBadgeDimensions(
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
    override val endContentSize: Dp = 0.dp

    @Deprecated(
        "Use startContentMarginValues",
        replaceWith = ReplaceWith("startContentMarginValues"),
    )
    override val startContentMargin: Dp = 0.dp

    @Deprecated(
        "Use endContentMarginValues",
        replaceWith = ReplaceWith("endContentMarginValues"),
    )
    override val endContentMargin: Dp = 0.dp

    @Deprecated(
        "Use startPaddingValues",
        replaceWith = ReplaceWith("startPaddingValues"),
    )
    override val startPadding: Dp = 6.dp

    @Deprecated(
        "Use endPaddingValues",
        replaceWith = ReplaceWith("endPaddingValues"),
    )
    override val endPadding: Dp = 6.dp

    class Builder : IconBadgeDimensionsBuilder {
        private var heightValues: StatefulValue<Dp>? = null
        private var endContentSizeValues: StatefulValue<Dp>? = null
        private var startContentSizeValues: StatefulValue<Dp>? = null
        private var startContentMarginValues: StatefulValue<Dp>? = null
        private var endContentMarginValues: StatefulValue<Dp>? = null
        private var startPaddingValues: StatefulValue<Dp>? = null
        private var endPaddingValues: StatefulValue<Dp>? = null

        override fun height(values: StatefulValue<Dp>): IconBadgeDimensionsBuilder = apply {
            this.heightValues = values
        }

        override fun startContentSize(values: StatefulValue<Dp>): IconBadgeDimensionsBuilder = apply {
            this.startContentSizeValues = values
        }

        override fun startPadding(values: StatefulValue<Dp>): IconBadgeDimensionsBuilder = apply {
            this.startPaddingValues = values
        }

        override fun endPadding(values: StatefulValue<Dp>): IconBadgeDimensionsBuilder = apply {
            this.endPaddingValues = values
        }

        override fun build(): BadgeDimensions {
            return DefaultIconBadgeDimensions(
                heightValues = heightValues ?: 28.dp.asStatefulValue(),
                startContentSizeValues = startContentSizeValues ?: 16.dp.asStatefulValue(),
                endContentSizeValues = endContentSizeValues ?: 0.dp.asStatefulValue(),
                startContentMarginValues = startContentMarginValues ?: 0.dp.asStatefulValue(),
                endContentMarginValues = endContentMarginValues ?: 0.dp.asStatefulValue(),
                startPaddingValues = startPaddingValues ?: 6.dp.asStatefulValue(),
                endPaddingValues = endPaddingValues ?: 6.dp.asStatefulValue(),
            )
        }
    }
}

@Immutable
private class DefaultIconBadgeColors(
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

    class Builder : IconBadgeColorsBuilder {
        private var contentBrush: StatefulValue<Brush>? = null
        private var backgroundBrush: StatefulValue<Brush>? = null
        private var labelBrush: StatefulValue<Brush>? = null
        private var startContentBrush: StatefulValue<Brush>? = null
        private var endContentBrush: StatefulValue<Brush>? = null

        override fun backgroundBrush(backgroundBrush: StatefulValue<Brush>): IconBadgeColorsBuilder = apply {
            this.backgroundBrush = backgroundBrush
        }

        override fun startContentBrush(startContentBrush: StatefulValue<Brush>): IconBadgeColorsBuilder = apply {
            this.startContentBrush = startContentBrush
        }

        override fun build(): BadgeColors {
            return DefaultIconBadgeColors(
                contentBrush = contentBrush ?: Color.White.asStatefulBrush(),
                backgroundBrush = backgroundBrush ?: Color.Black.asStatefulBrush(),
                labelBrush = labelBrush ?: Color.Black.asStatefulBrush(),
                startContentBrush = startContentBrush ?: Color.Black.asStatefulBrush(),
                endContentBrush = endContentBrush ?: Color.Black.asStatefulBrush(),
            )
        }
    }
}

private class IconBadgeStyleBuilderImpl(receiver: Any?) : IconBadgeStyleBuilder {
    private var shape: CornerBasedShape? = null
    private var colorsBuilder: IconBadgeColorsBuilder = IconBadgeColorsBuilder.builder()
    private var labelStyle: TextStyle? = null
    private var dimensionsBuilder: IconBadgeDimensionsBuilder = IconBadgeDimensionsBuilder.builder()
    private var disableAlpha: Float? = null
    private var labelStyles: StatefulValue<TextStyle>? = null

    override fun shape(shape: CornerBasedShape): IconBadgeStyleBuilder = apply {
        this.shape = shape
    }

    @Composable
    override fun colors(
        builder:
        @Composable()
        (IconBadgeColorsBuilder.() -> Unit),
    ): IconBadgeStyleBuilder =
        apply {
            this.colorsBuilder.builder()
        }

    @Composable
    override fun dimensions(
        builder:
        @Composable()
        (IconBadgeDimensionsBuilder.() -> Unit),
    ): IconBadgeStyleBuilder =
        apply {
            this.dimensionsBuilder.builder()
        }

    override fun style(): BadgeStyle {
        return DefaultIconBadgeStyle(
            dimensions = dimensionsBuilder.build(),
            colors = colorsBuilder.build(),
            shape = shape ?: RoundedCornerShape(25),
            labelStyle = labelStyle ?: TextStyle.Default,
            disableAlpha = disableAlpha ?: DISABLE_BADGE_ALPHA,
            labelStyles = labelStyles ?: TextStyle.Default.asStatefulValue(),
        )
    }
}

private const val DISABLE_BADGE_ALPHA = 0f
