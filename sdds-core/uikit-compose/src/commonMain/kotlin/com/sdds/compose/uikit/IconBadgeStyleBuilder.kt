package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
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
    fun height(height: Dp): IconBadgeDimensionsBuilder

    /**
     * Устанавливает  размер иконки в начале
     */
    fun startContentSize(startContentSize: Dp): IconBadgeDimensionsBuilder

    /**
     * Устанавливает отступ от начала компонента до контента
     */
    fun startPadding(startPadding: Dp): IconBadgeDimensionsBuilder

    /**
     * Устанавливает отступ от контента до конца компонента
     */
    fun endPadding(endPadding: Dp): IconBadgeDimensionsBuilder

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
    fun backgroundColor(backgroundColor: InteractiveColor): IconBadgeColorsBuilder

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     * @see BadgeColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): IconBadgeColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет дополнительного текста компонента [startContentColor]
     * @see BadgeColors.startContentColor
     * @see InteractiveColor
     */
    fun startContentColor(startContentColor: InteractiveColor): IconBadgeColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста компонента [valueColor]
     * @see BadgeColors.startContentColor
     * @see InteractiveColor
     */
    fun startContentColor(valueColor: Color): IconBadgeColorsBuilder =
        startContentColor(valueColor.asInteractive())

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
) : BadgeStyle

@Immutable
private class DefaultIconBadgeDimensions(
    override val height: Dp,
    override val startContentSize: Dp,
    override val endContentSize: Dp,
    override val startContentMargin: Dp,
    override val endContentMargin: Dp,
    override val startPadding: Dp,
    override val endPadding: Dp,
) : BadgeDimensions {

    class Builder : IconBadgeDimensionsBuilder {
        private var height: Dp? = null
        private var endContentSize: Dp? = null
        private var startContentSize: Dp? = null
        private var startContentMargin: Dp? = null
        private var endContentMargin: Dp? = null
        private var startPadding: Dp? = null
        private var endPadding: Dp? = null
        override fun height(height: Dp): IconBadgeDimensionsBuilder = apply {
            this.height = height
        }

        override fun startContentSize(startContentSize: Dp): IconBadgeDimensionsBuilder = apply {
            this.startContentSize = startContentSize
        }

        override fun startPadding(startPadding: Dp): IconBadgeDimensionsBuilder = apply {
            this.startPadding = startPadding
        }

        override fun endPadding(endPadding: Dp): IconBadgeDimensionsBuilder = apply {
            this.endPadding = endPadding
        }

        override fun build(): BadgeDimensions {
            return DefaultIconBadgeDimensions(
                height = height ?: 28.dp,
                startContentSize = startContentSize ?: 16.dp,
                endContentSize = endContentSize ?: 0.dp,
                startContentMargin = startContentMargin ?: 0.dp,
                endContentMargin = endContentMargin ?: 0.dp,
                startPadding = startPadding ?: 6.dp,
                endPadding = endPadding ?: 6.dp,
            )
        }
    }
}

@Immutable
private class DefaultIconBadgeColors(
    override val contentColor: InteractiveColor,
    override val backgroundColor: InteractiveColor,
    override val labelColor: InteractiveColor,
    override val startContentColor: InteractiveColor,
    override val endContentColor: InteractiveColor,
) : BadgeColors {
    class Builder : IconBadgeColorsBuilder {
        private var contentColor: InteractiveColor? = null
        private var backgroundColor: InteractiveColor? = null
        private var labelColor: InteractiveColor? = null
        private var startContentColor: InteractiveColor? = null
        private var endContentColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: InteractiveColor): IconBadgeColorsBuilder =
            apply {
                this.backgroundColor = backgroundColor
            }

        override fun startContentColor(startContentColor: InteractiveColor): IconBadgeColorsBuilder =
            apply {
                this.startContentColor = startContentColor
            }

        override fun build(): BadgeColors {
            return DefaultIconBadgeColors(
                contentColor = contentColor ?: Color.White.asInteractive(),
                backgroundColor = backgroundColor ?: Color.Black.asInteractive(),
                labelColor = labelColor ?: Color.Black.asInteractive(),
                startContentColor = startContentColor ?: Color.Black.asInteractive(),
                endContentColor = endContentColor ?: Color.Black.asInteractive(),
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
        )
    }
}

private const val DISABLE_BADGE_ALPHA = 0f
