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
 * CompositionLocal c [BadgeStyle] для компонента [BadgeSolid]
 */
val LocalBadgeStyle = compositionLocalOf { BadgeStyle.badgeSolidBuilder().style() }

/**
 * Возвращает экземпляр [BadgeStyleBuilder] для Solid
 */
fun BadgeStyle.Companion.badgeSolidBuilder(receiver: Any? = null): BadgeStyleBuilder =
    BadgeStyleBuilderImpl(receiver)

/**
 * Возвращает экземпляр [BadgeStyleBuilder] для Clear
 */
fun BadgeStyle.Companion.badgeClearBuilder(receiver: Any? = null): BadgeStyleBuilder =
    BadgeStyleBuilderImpl(receiver)

/**
 * Возвращает экземпляр [BadgeStyleBuilder] для Transparent
 */
fun BadgeStyle.Companion.badgeTransparentBuilder(receiver: Any? = null): BadgeStyleBuilder =
    BadgeStyleBuilderImpl(receiver)

/**
 * Builder стиля [BadgeSolid]
 */
interface BadgeStyleBuilder : StyleBuilder<BadgeStyle> {

    /**
     * Устанавливает форму компонента [shape]
     * @see BadgeStyle.shape
     */
    fun shape(shape: CornerBasedShape): BadgeStyleBuilder

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
    fun labelStyle(labelStyle: TextStyle): BadgeStyleBuilder

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
    fun height(height: Dp): BadgeDimensionsBuilder

    /**
     * Устанавливает размер иконки в конце
     */
    fun endContentSize(endContentSize: Dp): BadgeDimensionsBuilder

    /**
     * Устанавливает  размер иконки в начале
     */
    fun startContentSize(startContentSize: Dp): BadgeDimensionsBuilder

    /**
     * Устанавливает отступы контента в начале
     */
    fun startContentMargin(startContentMargin: Dp): BadgeDimensionsBuilder

    /**
     * Устанавливает отступы контента в конце
     */
    fun endContentMargin(endContentMargin: Dp): BadgeDimensionsBuilder

    /**
     * Устанавливает отступ от начала компонента до контента
     */
    fun startPadding(startPadding: Dp): BadgeDimensionsBuilder

    /**
     * Устанавливает отступ от контента до конца компонента
     */
    fun endPadding(endPadding: Dp): BadgeDimensionsBuilder

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
    fun contentColor(contentColor: InteractiveColor): BadgeColorsBuilder

    /**
     * Устанавливает цвет контента компонента [contentColor]
     * @see BadgeColorsBuilder.contentColor
     * @see BadgeColors.contentColor
     * @see InteractiveColor
     */
    fun contentColor(contentColor: Color): BadgeColorsBuilder =
        contentColor(contentColor.asInteractive())

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     * @see BadgeColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): BadgeColorsBuilder

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     * @see BadgeColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): BadgeColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет основного текста компонента [labelColor]
     * @see BadgeColors.labelColor
     * @see InteractiveColor
     */
    fun labelColor(labelColor: InteractiveColor): BadgeColorsBuilder

    /**
     * Устанавливает цвет основного текста компонента [labelColor]
     * @see BadgeColors.labelColor
     * @see InteractiveColor
     */
    fun labelColor(labelColor: Color): BadgeColorsBuilder =
        labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет дополнительного текста компонента [startContentColor]
     * @see BadgeColors.startContentColor
     * @see InteractiveColor
     */
    fun startContentColor(startContentColor: InteractiveColor): BadgeColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста компонента [valueColor]
     * @see BadgeColors.startContentColor
     * @see InteractiveColor
     */
    fun startContentColor(valueColor: Color): BadgeColorsBuilder =
        startContentColor(valueColor.asInteractive())

    /**
     * Устанавливает цвет иконки компонента [endContentColor]
     * @see BadgeColors.endContentColor
     * @see InteractiveColor
     */
    fun endContentColor(endContentColor: InteractiveColor): BadgeColorsBuilder

    /**
     * Устанавливает цвет иконки компонента [endContentColor]
     * @see BadgeColors.endContentColor
     * @see InteractiveColor
     */
    fun endContentColor(endContentColor: Color): BadgeColorsBuilder =
        endContentColor(endContentColor.asInteractive())

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
    override val shape: CornerBasedShape,
    override val labelStyle: TextStyle,
    override val disableAlpha: Float,
) : BadgeStyle

@Immutable
private class DefaultBadgeDimensions(
    override val height: Dp,
    override val startContentSize: Dp,
    override val endContentSize: Dp,
    override val startContentMargin: Dp,
    override val endContentMargin: Dp,
    override val startPadding: Dp,
    override val endPadding: Dp,
) : BadgeDimensions {

    class Builder : BadgeDimensionsBuilder {
        private var height: Dp? = null
        private var endContentSize: Dp? = null
        private var startContentSize: Dp? = null
        private var startContentMargin: Dp? = null
        private var endContentMargin: Dp? = null
        private var startPadding: Dp? = null
        private var endPadding: Dp? = null
        override fun height(height: Dp): BadgeDimensionsBuilder = apply {
            this.height = height
        }

        override fun endContentSize(endContentSize: Dp): BadgeDimensionsBuilder = apply {
            this.endContentSize = endContentSize
        }

        override fun startContentSize(startContentSize: Dp): BadgeDimensionsBuilder = apply {
            this.startContentSize = startContentSize
        }

        override fun startContentMargin(startContentMargin: Dp): BadgeDimensionsBuilder = apply {
            this.startContentMargin = startContentMargin
        }

        override fun endContentMargin(endContentMargin: Dp): BadgeDimensionsBuilder = apply {
            this.endContentMargin = endContentMargin
        }

        override fun startPadding(startPadding: Dp): BadgeDimensionsBuilder = apply {
            this.startPadding = startPadding
        }

        override fun endPadding(endPadding: Dp): BadgeDimensionsBuilder = apply {
            this.endPadding = endPadding
        }

        override fun build(): BadgeDimensions {
            return DefaultBadgeDimensions(
                height = height ?: 28.dp,
                startContentSize = startContentSize ?: 16.dp,
                endContentSize = endContentSize ?: 16.dp,
                startContentMargin = startContentMargin ?: 4.dp,
                endContentMargin = endContentMargin ?: 4.dp,
                startPadding = startPadding ?: 10.dp,
                endPadding = endPadding ?: 10.dp,
            )
        }
    }
}

@Immutable
private class DefaultBadgeColors(
    override val contentColor: InteractiveColor,
    override val backgroundColor: InteractiveColor,
    override val labelColor: InteractiveColor,
    override val startContentColor: InteractiveColor,
    override val endContentColor: InteractiveColor,
) : BadgeColors {
    class Builder : BadgeColorsBuilder {
        private var contentColor: InteractiveColor? = null
        private var backgroundColor: InteractiveColor? = null
        private var labelColor: InteractiveColor? = null
        private var startContentColor: InteractiveColor? = null
        private var endContentColor: InteractiveColor? = null
        override fun contentColor(contentColor: InteractiveColor): BadgeColorsBuilder = apply {
            this.contentColor = contentColor
        }

        override fun backgroundColor(backgroundColor: InteractiveColor): BadgeColorsBuilder =
            apply {
                this.backgroundColor = backgroundColor
            }

        override fun labelColor(labelColor: InteractiveColor): BadgeColorsBuilder = apply {
            this.labelColor = labelColor
        }

        override fun startContentColor(startContentColor: InteractiveColor): BadgeColorsBuilder =
            apply {
                this.startContentColor = startContentColor
            }

        override fun endContentColor(endContentColor: InteractiveColor): BadgeColorsBuilder =
            apply {
                this.endContentColor = endContentColor
            }

        override fun build(): BadgeColors {
            return DefaultBadgeColors(
                contentColor = contentColor ?: Color.White.asInteractive(),
                backgroundColor = backgroundColor ?: Color.Black.asInteractive(),
                labelColor = labelColor ?: Color.Black.asInteractive(),
                startContentColor = startContentColor ?: Color.Black.asInteractive(),
                endContentColor = endContentColor ?: Color.Black.asInteractive(),
            )
        }
    }
}

private class BadgeStyleBuilderImpl(receiver: Any?) : BadgeStyleBuilder {
    private var shape: CornerBasedShape? = null
    private var colorsBuilder: BadgeColorsBuilder = BadgeColorsBuilder.builder()
    private var labelStyle: TextStyle? = null
    private var dimensionsBuilder: BadgeDimensionsBuilder = BadgeDimensionsBuilder.builder()
    private var disableAlpha: Float? = null

    override fun shape(shape: CornerBasedShape): BadgeStyleBuilder = apply {
        this.shape = shape
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

    override fun labelStyle(labelStyle: TextStyle): BadgeStyleBuilder = apply {
        this.labelStyle = labelStyle
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
            shape = shape ?: RoundedCornerShape(25),
            labelStyle = labelStyle ?: TextStyle.Default,
            disableAlpha = disableAlpha ?: DISABLE_BADGE_ALPHA,
        )
    }
}

private const val DISABLE_BADGE_ALPHA = 0.4f
