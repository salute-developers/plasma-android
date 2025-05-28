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
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ToastStyle] для компонента [Toast]
 */
val LocalToastStyle = compositionLocalOf { ToastStyle.builder().style() }

/**
 * Стиль компонента Toast
 */
@Immutable
interface ToastStyle : Style {

    /**
     * Форма компонента
     */
    val shape: CornerBasedShape

    /**
     * Стиль текста
     */
    val textStyle: TextStyle

    /**
     * Размеры и отступы компонента
     */
    val dimensions: ToastDimensions

    /**
     * Цвета компонента
     */
    val colors: ToastColors

    companion object {
        /**
         * Возвращает экземпляр [ToastStyleBuilder]
         */
        fun builder(receiver: Any? = null): ToastStyleBuilder = DefaultToastStyle.Builder()
    }
}

/**
 * Билдер стиля [ToastStyle]
 */
interface ToastStyleBuilder : StyleBuilder<ToastStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): ToastStyleBuilder

    /**
     * Устанавливает стиль текста
     */
    fun textStyle(textStyle: TextStyle): ToastStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(builder: @Composable ToastColorsBuilder.() -> Unit): ToastStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(builder: @Composable ToastDimensionsBuilder.() -> Unit): ToastStyleBuilder
}

private class DefaultToastStyle(
    override val shape: CornerBasedShape,
    override val textStyle: TextStyle,
    override val dimensions: ToastDimensions,
    override val colors: ToastColors,
) : ToastStyle {

    class Builder : ToastStyleBuilder {
        private var shape: CornerBasedShape? = null
        private val colorsBuilder = ToastColors.builder()
        private val dimensionsBuilder = ToastDimensions.builder()
        private var textStyle: TextStyle? = null

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun textStyle(textStyle: TextStyle) = apply {
            this.textStyle = textStyle
        }

        @Composable
        override fun colors(builder: @Composable (ToastColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (ToastDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun style(): ToastStyle {
            return DefaultToastStyle(
                shape = shape ?: RoundedCornerShape(15),
                textStyle = textStyle ?: TextStyle.Default,
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
            )
        }
    }
}

/**
 * Цвета компонента Toast
 */
@Immutable
interface ToastColors {

    /**
     * Цвет фона
     */
    val backgroundColor: StatefulValue<Brush>

    /**
     * Цвет текста
     */
    val textColor: InteractiveColor

    /**
     * Цвет контента в начале
     */
    val contentStartColor: InteractiveColor

    /**
     * Цвет контента в конце
     */
    val contentEndColor: InteractiveColor

    companion object {

        /**
         * Создает экземпляр [ToastColorsBuilder]
         */
        fun builder(): ToastColorsBuilder = DefaultToastColors.Builder()
    }
}

/**
 * Builder для [ToastColors]
 */
interface ToastColorsBuilder {
    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Brush): ToastColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): ToastColorsBuilder

    /**
     * Устанавливает цвет текста [textColor].
     */
    fun textColor(textColor: Color): ToastColorsBuilder =
        textColor(textColor.asInteractive())

    /**
     * Устанавливает цвет текста [textColor].
     */
    fun textColor(textColor: InteractiveColor): ToastColorsBuilder

    /**
     * Устанавливает цвет контента в начале [contentStartColor].
     */
    fun contentStartColor(contentStartColor: Color): ToastColorsBuilder =
        contentStartColor(contentStartColor.asInteractive())

    /**
     * Устанавливает цвет контента в начале [contentStartColor].
     */
    fun contentStartColor(contentStartColor: InteractiveColor): ToastColorsBuilder

    /**
     * Устанавливает цвет контента в конце [contentEndColor].
     */
    fun contentEndColor(contentEndColor: Color): ToastColorsBuilder =
        contentEndColor(contentEndColor.asInteractive())

    /**
     * Устанавливает цвет контента в конце [contentEndColor].
     */
    fun contentEndColor(contentEndColor: InteractiveColor): ToastColorsBuilder

    /**
     * Создает экземпляр [ToastColors]
     */
    fun build(): ToastColors
}

@Immutable
private data class DefaultToastColors(
    override val backgroundColor: StatefulValue<Brush>,
    override val textColor: InteractiveColor,
    override val contentStartColor: InteractiveColor,
    override val contentEndColor: InteractiveColor,
) : ToastColors {

    class Builder : ToastColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var textColor: InteractiveColor? = null
        private var contentStartColor: InteractiveColor? = null
        private var contentEndColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun textColor(textColor: InteractiveColor) = apply {
            this.textColor = textColor
        }

        override fun contentStartColor(contentStartColor: InteractiveColor) = apply {
            this.contentStartColor = contentStartColor
        }

        override fun contentEndColor(contentEndColor: InteractiveColor) = apply {
            this.contentEndColor = contentEndColor
        }

        override fun build(): ToastColors {
            return DefaultToastColors(
                backgroundColor = backgroundColor ?: SolidColor(Color.LightGray).asStatefulValue(),
                textColor = textColor ?: Color.Black.asInteractive(),
                contentStartColor = contentStartColor ?: Color.DarkGray.asInteractive(),
                contentEndColor = contentEndColor ?: Color.DarkGray.asInteractive(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface ToastDimensions {

    /**
     * Размер контента в начале
     */
    val contentStartSize: Dp

    /**
     *  Отступа контента в начале
     */
    val contentStartPadding: Dp

    /**
     * Размер контента в конце
     */
    val contentEndSize: Dp

    /**
     *  Отступа контента в конце
     */
    val contentEndPadding: Dp

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
         * Создает экземпляр [ToastDimensionsBuilder]
         */
        fun builder(): ToastDimensionsBuilder = DefaultToastDimensions.Builder()
    }
}

/**
 * Builder для [ToastDimensions]
 */
interface ToastDimensionsBuilder {
    /**
     * Устанавливает размер контента в начале [contentStartSize]
     */
    fun contentStartSize(contentStartSize: Dp): ToastDimensionsBuilder

    /**
     * Устанавливает отступ контента в начале [contentStartPadding]
     */
    fun contentStartPadding(contentStartPadding: Dp): ToastDimensionsBuilder

    /**
     * Устанавливает размер контента в конце [contentEndSize]
     */
    fun contentEndSize(contentEndSize: Dp): ToastDimensionsBuilder

    /**
     * Устанавливает отступ контента в конце [contentEndPadding]
     */
    fun contentEndPadding(contentEndPadding: Dp): ToastDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): ToastDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): ToastDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): ToastDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): ToastDimensionsBuilder

    /**
     * Создает экземпляр [ToastDimensions]
     */
    fun build(): ToastDimensions
}

private class DefaultToastDimensions(
    override val contentStartSize: Dp,
    override val contentEndSize: Dp,
    override val contentStartPadding: Dp,
    override val contentEndPadding: Dp,
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
) : ToastDimensions {

    class Builder : ToastDimensionsBuilder {

        private var contentStartSize: Dp? = null
        private var contentEndSize: Dp? = null
        private var contentStartPadding: Dp? = null
        private var contentEndPadding: Dp? = null
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var paddingTop: Dp? = null
        private var paddingBottom: Dp? = null

        override fun contentStartSize(contentStartSize: Dp) = apply {
            this.contentStartSize = contentStartSize
        }

        override fun contentStartPadding(contentStartPadding: Dp) = apply {
            this.contentStartPadding = contentStartPadding
        }

        override fun contentEndSize(contentEndSize: Dp) = apply {
            this.contentEndSize = contentEndSize
        }

        override fun contentEndPadding(contentEndPadding: Dp) = apply {
            this.contentEndPadding = contentEndPadding
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

        override fun build(): ToastDimensions {
            return DefaultToastDimensions(
                contentStartSize = contentStartSize ?: 16.dp,
                contentEndSize = contentEndSize ?: 16.dp,
                contentStartPadding = contentStartPadding ?: 4.dp,
                contentEndPadding = contentEndPadding ?: 4.dp,
                paddingStart = paddingStart ?: 8.dp,
                paddingEnd = paddingEnd ?: 8.dp,
                paddingTop = paddingTop ?: 10.dp,
                paddingBottom = paddingBottom ?: 10.dp,
            )
        }
    }
}
