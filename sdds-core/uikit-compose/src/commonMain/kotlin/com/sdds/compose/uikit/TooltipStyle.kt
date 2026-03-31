package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [TooltipStyle] для компонента [Tooltip]
 */
val LocalTooltipStyle = compositionLocalOf { TooltipStyle.builder().style() }

/**
 * Стиль компонента Tooltip
 */
@Immutable
interface TooltipStyle : Style {

    /**
     * Форма компонента
     */
    val shape: CornerBasedShape

    /**
     * Тень компонента
     */
    val shadow: ShadowAppearance

    /**
     * Стиль текста
     */
    val textStyle: TextStyle

    /**
     * Размеры и отступы компонента
     */
    val dimensions: TooltipDimensions

    /**
     * Цвета компонента
     */
    val colors: TooltipColors

    companion object {
        /**
         * Возвращает экземпляр [TooltipStyleBuilder]
         */
        fun builder(receiver: Any? = null): TooltipStyleBuilder = DefaultTooltipStyle.Builder()
    }
}

/**
 * Билдер стиля [TooltipStyle]
 */
interface TooltipStyleBuilder : StyleBuilder<TooltipStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): TooltipStyleBuilder

    /**
     * Устанавливает тень [shadow] компонента
     */
    fun shadow(shadow: ShadowAppearance): TooltipStyleBuilder

    /**
     * Устанавливает стиль текста
     */
    fun textStyle(textStyle: TextStyle): TooltipStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(builder: @Composable TooltipColorsBuilder.() -> Unit): TooltipStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(builder: @Composable TooltipDimensionsBuilder.() -> Unit): TooltipStyleBuilder
}

private class DefaultTooltipStyle(
    override val shape: CornerBasedShape,
    override val shadow: ShadowAppearance,
    override val textStyle: TextStyle,
    override val dimensions: TooltipDimensions,
    override val colors: TooltipColors,
) : TooltipStyle {

    class Builder : TooltipStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var shadow: ShadowAppearance? = null
        private val colorsBuilder = TooltipColors.builder()
        private val dimensionsBuilder = TooltipDimensions.builder()
        private var textStyle: TextStyle? = null

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun shadow(shadow: ShadowAppearance) = apply {
            this.shadow = shadow
        }

        override fun textStyle(textStyle: TextStyle) = apply {
            this.textStyle = textStyle
        }

        @Composable
        override fun colors(builder: @Composable (TooltipColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (TooltipDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun style(): TooltipStyle {
            return DefaultTooltipStyle(
                shape = shape ?: RoundedCornerShape(15),
                shadow = shadow ?: ShadowAppearance(),
                textStyle = textStyle ?: TextStyle.Default,
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
            )
        }
    }
}

/**
 * Цвета компонента Tooltip
 */
@Immutable
interface TooltipColors {

    /**
     * Цвет фона
     */
    val backgroundColor: StatefulValue<Brush>

    /**
     * Цвет текста
     */
    val textColor: StatefulValue<Brush>

    /**
     * Цвет контента в начале
     */
    val contentStartColor: InteractiveColor

    companion object {

        /**
         * Создает экземпляр [TooltipColorsBuilder]
         */
        fun builder(): TooltipColorsBuilder = DefaultTooltipColors.Builder()
    }
}

/**
 * Builder для [TooltipColors]
 */
interface TooltipColorsBuilder {
    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Brush): TooltipColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): TooltipColorsBuilder

    /**
     * Устанавливает цвет текста [textColor].
     */
    fun textColor(textColor: Brush): TooltipColorsBuilder =
        textColor(textColor.asStatefulValue())

    /**
     * Устанавливает цвет текста [textColor].
     */
    fun textColor(textColor: StatefulValue<Brush>): TooltipColorsBuilder

    /**
     * Устанавливает цвет контента в начале [contentStartColor].
     */
    fun contentStartColor(contentStartColor: Color): TooltipColorsBuilder =
        contentStartColor(contentStartColor.asInteractive())

    /**
     * Устанавливает цвет контента в начале [contentStartColor].
     */
    fun contentStartColor(contentStartColor: InteractiveColor): TooltipColorsBuilder

    /**
     * Создает экземпляр [TooltipColors]
     */
    fun build(): TooltipColors
}

@Immutable
private data class DefaultTooltipColors(
    override val backgroundColor: StatefulValue<Brush>,
    override val textColor: StatefulValue<Brush>,
    override val contentStartColor: InteractiveColor,
) : TooltipColors {

    class Builder : TooltipColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var textColor: StatefulValue<Brush>? = null
        private var contentStartColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun textColor(textColor: StatefulValue<Brush>) = apply {
            this.textColor = textColor
        }

        override fun contentStartColor(contentStartColor: InteractiveColor) = apply {
            this.contentStartColor = contentStartColor
        }

        override fun build(): TooltipColors {
            return DefaultTooltipColors(
                backgroundColor = backgroundColor ?: SolidColor(Color.LightGray).asStatefulValue(),
                textColor = textColor ?: SolidColor(Color.Black).asStatefulValue(),
                contentStartColor = Color.DarkGray.asInteractive(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface TooltipDimensions {

    /**
     * Отступ до компонента
     */
    val offset: Dp

    /**
     * Ширина указателя
     */
    val tailWidth: Dp

    /**
     * Высота указателя
     */
    val tailHeight: Dp

    /**
     * Отступ указателя
     */
    val tailPadding: Dp

    /**
     * Размер контента в начале
     */
    val contentStartSize: Dp

    /**
     *  Отступа контента в начале
     */
    val contentStartPadding: Dp

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
         * Создает экземпляр [TooltipDimensionsBuilder]
         */
        fun builder(): TooltipDimensionsBuilder = DefaultTooltipDimensions.Builder()
    }
}

/**
 * Builder для [TooltipDimensions]
 */
interface TooltipDimensionsBuilder {
    /**
     * Устанавливает смещение [offset] компонента относительно триггера.
     */
    fun offset(offset: Dp): TooltipDimensionsBuilder

    /**
     * Устанавливает ширину [tailWidth] указателя.
     */
    fun tailWidth(tailWidth: Dp): TooltipDimensionsBuilder

    /**
     * Устанавливает высоту [tailHeight] указателя.
     */
    fun tailHeight(tailHeight: Dp): TooltipDimensionsBuilder

    /**
     * Устанавливает отступ [tailPadding] указателя относительно края компонента.
     */
    fun tailPadding(tailPadding: Dp): TooltipDimensionsBuilder

    /**
     * Устанавливает размер контента в начале [contentStartSize]
     */
    fun contentStartSize(contentStartSize: Dp): TooltipDimensionsBuilder

    /**
     * Устанавливает отступ контента в начале [contentStartPadding]
     */
    fun contentStartPadding(contentStartPadding: Dp): TooltipDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): TooltipDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): TooltipDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): TooltipDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): TooltipDimensionsBuilder

    /**
     * Создает экземпляр [TooltipDimensions]
     */
    fun build(): TooltipDimensions
}

private class DefaultTooltipDimensions(
    override val offset: Dp,
    override val tailWidth: Dp,
    override val tailHeight: Dp,
    override val tailPadding: Dp,
    override val contentStartSize: Dp,
    override val contentStartPadding: Dp,
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
) : TooltipDimensions {

    class Builder : TooltipDimensionsBuilder {

        private var offset: Dp? = null
        private var tailWidth: Dp? = null
        private var tailHeight: Dp? = null
        private var tailPadding: Dp? = null
        private var contentStartSize: Dp? = null
        private var contentStartPadding: Dp? = null
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var paddingTop: Dp? = null
        private var paddingBottom: Dp? = null

        override fun offset(offset: Dp) = apply {
            this.offset = offset
        }

        override fun tailWidth(tailWidth: Dp) = apply {
            this.tailWidth = tailWidth
        }

        override fun tailHeight(tailHeight: Dp) = apply {
            this.tailHeight = tailHeight
        }

        override fun tailPadding(tailPadding: Dp) = apply {
            this.tailPadding = tailPadding
        }

        override fun contentStartSize(contentStartSize: Dp) = apply {
            this.contentStartSize = contentStartSize
        }

        override fun contentStartPadding(contentStartPadding: Dp) = apply {
            this.contentStartPadding = contentStartPadding
        }

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

        override fun build(): TooltipDimensions {
            return DefaultTooltipDimensions(
                offset = offset ?: 4.dp,
                tailWidth = tailWidth ?: 20.dp,
                tailHeight = tailHeight ?: 8.dp,
                tailPadding = tailPadding ?: 10.dp,
                contentStartSize = contentStartSize ?: 16.dp,
                contentStartPadding = contentStartPadding ?: 4.dp,
                paddingStart = paddingStart ?: 8.dp,
                paddingEnd = paddingEnd ?: 8.dp,
                paddingTop = paddingTop ?: 10.dp,
                paddingBottom = paddingBottom ?: 10.dp,
            )
        }
    }
}
