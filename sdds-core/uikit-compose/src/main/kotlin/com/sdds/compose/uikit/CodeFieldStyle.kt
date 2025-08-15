package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [CodeFieldStyle] для компонента [CodeField]
 */
val LocalCodeFieldStyle: ProvidableCompositionLocal<CodeFieldStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { CodeFieldStyle.builder().style() }

/**
 * Стиль компонента [CodeField]
 */
@Immutable
interface CodeFieldStyle : Style {
    /**
     * Стиль кода
     */
    val valueStyle: TextStyle

    /**
     * Стиль надписи
     */
    val captionStyle: TextStyle

    /**
     * Форма элементов
     */
    val itemShape: CornerBasedShape

    /**
     * Форма группы элементов
     */
    val groupShape: CornerBasedShape

    /**
     * Цвета компонента
     */
    val colors: CodeFieldColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: CodeFieldDimensions

    companion object {
        /**
         * Возвращает экземпляр [CodeFieldStyleBuilder]
         */
        fun builder(receiver: Any? = null): CodeFieldStyleBuilder =
            DefaultCodeFieldStyle.Builder()
    }
}

/**
 * Билдер стиля компонента
 */
interface CodeFieldStyleBuilder : StyleBuilder<CodeFieldStyle> {
    /**
     * Устанавливает форму элемента [itemShape]
     */
    fun itemShape(itemShape: CornerBasedShape): CodeFieldStyleBuilder

    /**
     * Устанавливает форму группы элементов [groupShape]
     */
    fun groupShape(groupShape: CornerBasedShape): CodeFieldStyleBuilder

    /**
     * Устанавливает стиль кода [valueStyle]
     */
    fun valueStyle(valueStyle: TextStyle): CodeFieldStyleBuilder

    /**
     * Устанавливает стиль надписи [captionStyle]
     */
    fun captionStyle(captionStyle: TextStyle): CodeFieldStyleBuilder

    /**
     * Устанавливает цвета компонента с помощью [builder]
     */
    @Composable
    fun colors(builder: @Composable CodeFieldColorsBuilder.() -> Unit): CodeFieldStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента с помощью [builder]
     */
    @Composable
    fun dimensions(builder: @Composable CodeFieldDimensionsBuilder.() -> Unit): CodeFieldStyleBuilder
}

private data class DefaultCodeFieldStyle(
    override val valueStyle: TextStyle,
    override val captionStyle: TextStyle,
    override val itemShape: CornerBasedShape,
    override val groupShape: CornerBasedShape,
    override val colors: CodeFieldColors,
    override val dimensions: CodeFieldDimensions,
) : CodeFieldStyle {
    class Builder : CodeFieldStyleBuilder {
        private var valueStyle: TextStyle? = null

        private var captionStyle: TextStyle? = null

        private var itemShape: CornerBasedShape? = null

        private var groupShape: CornerBasedShape? = null

        private val colorsBuilder: CodeFieldColorsBuilder = CodeFieldColors.builder()

        private val dimensionsBuilder: CodeFieldDimensionsBuilder = CodeFieldDimensions.builder()

        override fun itemShape(itemShape: CornerBasedShape): CodeFieldStyleBuilder =
            apply { this.itemShape = itemShape }

        override fun groupShape(groupShape: CornerBasedShape): CodeFieldStyleBuilder = apply {
            this.groupShape = groupShape
        }

        override fun valueStyle(valueStyle: TextStyle): CodeFieldStyleBuilder = apply {
            this.valueStyle = valueStyle
        }

        override fun captionStyle(captionStyle: TextStyle): CodeFieldStyleBuilder = apply {
            this.captionStyle = captionStyle
        }

        @Composable
        override fun colors(builder: @Composable CodeFieldColorsBuilder.() -> Unit):
            CodeFieldStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable CodeFieldDimensionsBuilder.() -> Unit):
            CodeFieldStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): CodeFieldStyle = DefaultCodeFieldStyle(
            itemShape = itemShape ?: RoundedCornerShape(0),
            groupShape = groupShape ?: itemShape ?: RoundedCornerShape(0),
            valueStyle = valueStyle ?: TextStyle.Default,
            captionStyle = captionStyle ?: TextStyle.Default,
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
        )
    }
}

/**
 * Цвета компонента
 */
@Immutable
interface CodeFieldColors {
    /**
     * Цвет кода
     */
    val valueColor: StatefulValue<Color>

    /**
     * Цвет курсора
     */
    val cursorColor: StatefulValue<Color>

    /**
     * Цвет точки
     */
    val dotColor: StatefulValue<Color>

    /**
     * Цвет надписи
     */
    val captionColor: StatefulValue<Color>

    /**
     * Цвет фона элемента
     */
    val backgroundColor: StatefulValue<Color>

    companion object {
        /**
         * Возвращает экземпляр [CodeFieldColorsBuilder]
         */
        fun builder(): CodeFieldColorsBuilder = DefaultCodeFieldColors.Builder()
    }
}

/**
 * Билдер для [CodeFieldColors]
 */
interface CodeFieldColorsBuilder {
    /**
     * Устанавливает цвет кода [valueColor]
     */
    fun valueColor(valueColor: StatefulValue<Color>): CodeFieldColorsBuilder

    /**
     * Устанавливает цвет кода [valueColor]
     */
    fun valueColor(valueColor: Color): CodeFieldColorsBuilder =
        valueColor(valueColor.asStatefulValue())

    /**
     * Устанавливает цвет курсора [cursorColor]
     */
    fun cursorColor(cursorColor: StatefulValue<Color>): CodeFieldColorsBuilder

    /**
     * Устанавливает цвет курсора [cursorColor]
     */
    fun cursorColor(cursorColor: Color): CodeFieldColorsBuilder =
        cursorColor(cursorColor.asStatefulValue())

    /**
     * Устанавливает цвет точки [dotColor]
     */
    fun dotColor(dotColor: StatefulValue<Color>): CodeFieldColorsBuilder

    /**
     * Устанавливает цвет точки [dotColor]
     */
    fun dotColor(dotColor: Color): CodeFieldColorsBuilder =
        dotColor(dotColor.asStatefulValue())

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: StatefulValue<Color>): CodeFieldColorsBuilder

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: Color): CodeFieldColorsBuilder =
        captionColor(captionColor.asStatefulValue())

    /**
     * Устанавливает цвет фона элемента [backgroundColor]
     */
    fun backgroundColor(backgroundColor: StatefulValue<Color>): CodeFieldColorsBuilder

    /**
     * Устанавливает цвет фона элемента [backgroundColor]
     */
    fun backgroundColor(backgroundColor: Color): CodeFieldColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Вернёт [CodeFieldColors]
     */
    fun build(): CodeFieldColors
}

private data class DefaultCodeFieldColors(
    override val valueColor: StatefulValue<Color>,
    override val cursorColor: StatefulValue<Color>,
    override val dotColor: StatefulValue<Color>,
    override val captionColor: StatefulValue<Color>,
    override val backgroundColor: StatefulValue<Color>,
) : CodeFieldColors {
    class Builder : CodeFieldColorsBuilder {
        private var valueColor: StatefulValue<Color>? = null
        private var cursorColor: StatefulValue<Color>? = null
        private var dotColor: StatefulValue<Color>? = null
        private var captionColor: StatefulValue<Color>? = null
        private var backgroundColor: StatefulValue<Color>? = null

        override fun valueColor(valueColor: StatefulValue<Color>): CodeFieldColorsBuilder =
            apply {
                this.valueColor = valueColor
            }

        override fun cursorColor(cursorColor: StatefulValue<Color>): CodeFieldColorsBuilder =
            apply {
                this.cursorColor = cursorColor
            }

        override fun dotColor(dotColor: StatefulValue<Color>): CodeFieldColorsBuilder = apply {
            this.dotColor = dotColor
        }

        override fun captionColor(captionColor: StatefulValue<Color>): CodeFieldColorsBuilder =
            apply { this.captionColor = captionColor }

        override fun backgroundColor(backgroundColor: StatefulValue<Color>): CodeFieldColorsBuilder =
            apply { this.backgroundColor = backgroundColor }

        override fun build(): CodeFieldColors = DefaultCodeFieldColors(
            valueColor = valueColor ?: Color.Black.asStatefulValue(),
            cursorColor = cursorColor ?: Color.Green.asStatefulValue(),
            dotColor = dotColor ?: Color.Black.asStatefulValue(),
            captionColor = captionColor ?: Color.Black.asStatefulValue(),
            backgroundColor = backgroundColor ?: Color.LightGray.asStatefulValue(),
        )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface CodeFieldDimensions {
    /**
     * Высота элемента
     */
    val height: Dp

    /**
     * Ширина элемента
     */
    val width: Dp

    /**
     * Размер точки
     */
    val dotSize: Dp

    /**
     * Расстояние между элементами
     */
    val itemSpacing: Dp

    /**
     * Расстояние между группами элементов
     */
    val groupSpacing: Dp

    /**
     * Отступ надписи
     */
    val captionSpacing: Dp

    companion object {
        /**
         * Возвращает экземпляр [CodeFieldDimensionsBuilder]
         */
        fun builder(): CodeFieldDimensionsBuilder = DefaultCodeFieldDimensions.Builder()
    }
}

/**
 * Билдер для [CodeFieldDimensions]
 */
interface CodeFieldDimensionsBuilder {
    /**
     * Устанавливает высоту элемента [height]
     */
    fun height(height: Dp): CodeFieldDimensionsBuilder

    /**
     * Устанавливает ширину элемента [width]
     */
    fun width(width: Dp): CodeFieldDimensionsBuilder

    /**
     * Устанавливает размер точки [dotSize]
     */
    fun dotSize(dotSize: Dp): CodeFieldDimensionsBuilder

    /**
     * Устанавливает расстояние между элементами [itemSpacing]
     */
    fun itemSpacing(itemSpacing: Dp): CodeFieldDimensionsBuilder

    /**
     * Устанавливает расстояние между группами элементов [groupSpacing]
     */
    fun groupSpacing(groupSpacing: Dp): CodeFieldDimensionsBuilder

    /**
     * Устанавливает отступ надписи [captionSpacing]
     */
    fun captionSpacing(captionSpacing: Dp): CodeFieldDimensionsBuilder

    /**
     * Вернёт [CodeFieldDimensions]
     */
    fun build(): CodeFieldDimensions
}

private data class DefaultCodeFieldDimensions(
    override val height: Dp,
    override val width: Dp,
    override val dotSize: Dp,
    override val itemSpacing: Dp,
    override val groupSpacing: Dp,
    override val captionSpacing: Dp,
) : CodeFieldDimensions {
    class Builder : CodeFieldDimensionsBuilder {
        private var height: Dp? = null

        private var width: Dp? = null

        private var dotSize: Dp? = null

        private var itemSpacing: Dp? = null

        private var groupSpacing: Dp? = null

        private var captionSpacing: Dp? = null

        override fun height(height: Dp): CodeFieldDimensionsBuilder = apply {
            this.height =
                height
        }

        override fun width(width: Dp): CodeFieldDimensionsBuilder =
            apply { this.width = width }

        override fun dotSize(dotSize: Dp): CodeFieldDimensionsBuilder = apply {
            this.dotSize =
                dotSize
        }

        override fun itemSpacing(itemSpacing: Dp): CodeFieldDimensionsBuilder = apply {
            this.itemSpacing = itemSpacing
        }

        override fun groupSpacing(groupSpacing: Dp): CodeFieldDimensionsBuilder = apply {
            this.groupSpacing = groupSpacing
        }

        override fun captionSpacing(captionSpacing: Dp): CodeFieldDimensionsBuilder = apply {
            this.captionSpacing = captionSpacing
        }

        override fun build(): CodeFieldDimensions = DefaultCodeFieldDimensions(
            height = height ?: 56.dp,
            width = width ?: 44.dp,
            dotSize = dotSize ?: 10.dp,
            itemSpacing = itemSpacing ?: 2.dp,
            groupSpacing = groupSpacing ?: 8.dp,
            captionSpacing = captionSpacing ?: 14.dp,
        )
    }
}
