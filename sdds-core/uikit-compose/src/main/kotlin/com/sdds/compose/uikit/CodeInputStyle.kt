package com.sdds.compose.uikit

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
 * CompositionLocal c [CodeInputStyle] для компонента [CodeInput]
 */
val LocalCodeInputStyle: ProvidableCompositionLocal<CodeInputStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { CodeInputStyle.builder().style() }

/**
 * Стиль компонента
 */
@Immutable
interface CodeInputStyle : Style {
    /**
     * Стиль кода
     */
    val codeStyle: TextStyle

    /**
     * Стиль надписи
     */
    val captionStyle: TextStyle

    /**
     * Цвета компонента
     */
    val colors: CodeInputColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: CodeInputDimensions

    companion object {
        /**
         * Возвращает экземпляр [CodeInputStyleBuilder]
         */
        fun builder(receiver: Any? = null): CodeInputStyleBuilder =
            DefaultCodeInputStyle.Builder()
    }
}

/**
 * Билдер стиля компонента
 */
interface CodeInputStyleBuilder : StyleBuilder<CodeInputStyle> {
    /**
     * Устанавливает стиль кода [codeStyle]
     */
    fun codeStyle(codeStyle: TextStyle): CodeInputStyleBuilder

    /**
     * Устанавливает стиль текста надписи [captionStyle]
     */
    fun captionStyle(captionStyle: TextStyle): CodeInputStyleBuilder

    /**
     * Устанавливает цвета с помощью [builder]
     */
    @Composable
    fun colors(builder: @Composable CodeInputColorsBuilder.() -> Unit): CodeInputStyleBuilder

    /**
     * Устанавливает размеры и отступы с помощью [builder]
     */
    @Composable
    fun dimensions(builder: @Composable CodeInputDimensionsBuilder.() -> Unit): CodeInputStyleBuilder
}

private data class DefaultCodeInputStyle(
    override val codeStyle: TextStyle,
    override val captionStyle: TextStyle,
    override val colors: CodeInputColors,
    override val dimensions: CodeInputDimensions,
) : CodeInputStyle {
    class Builder : CodeInputStyleBuilder {
        private var codeStyle: TextStyle? = null

        private var captionStyle: TextStyle? = null

        private val colorsBuilder: CodeInputColorsBuilder = CodeInputColors.builder()

        private val dimensionsBuilder: CodeInputDimensionsBuilder = CodeInputDimensions.builder()

        override fun codeStyle(codeStyle: TextStyle): CodeInputStyleBuilder = apply {
            this.codeStyle = codeStyle
        }

        override fun captionStyle(captionStyle: TextStyle): CodeInputStyleBuilder = apply {
            this.captionStyle = captionStyle
        }

        @Composable
        override fun colors(builder: @Composable CodeInputColorsBuilder.() -> Unit):
            CodeInputStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable CodeInputDimensionsBuilder.() -> Unit):
            CodeInputStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): CodeInputStyle = DefaultCodeInputStyle(
            codeStyle = codeStyle ?: TextStyle.Default,
            captionStyle = captionStyle ?: TextStyle.Default,
            colors =
            colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
        )
    }
}

/**
 * Цвета компонента
 */
@Immutable
interface CodeInputColors {
    /**
     * Цвет кода
     */
    val codeColor: StatefulValue<Color>

    /**
     * Цвет надписи
     */
    val captionColor: StatefulValue<Color>

    /**
     * Цвет обводки точки
     */
    val strokeColor: StatefulValue<Color>

    /**
     * Цвет фона точки
     */
    val fillColor: StatefulValue<Color>

    companion object {
        /**
         * Возвращает экземпляр [CodeInputColorsBuilder]
         */
        fun builder(): CodeInputColorsBuilder = DefaultCodeInputColors.Builder()
    }
}

/**
 * Билдер для [CodeInputColors]
 */
interface CodeInputColorsBuilder {
    /**
     * Устанавливает цвет кода [codeColor]
     */
    fun codeColor(codeColor: StatefulValue<Color>): CodeInputColorsBuilder

    /**
     * Устанавливает цвет кода [codeColor]
     */
    fun codeColor(codeColor: Color): CodeInputColorsBuilder =
        codeColor(codeColor.asStatefulValue())

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: StatefulValue<Color>): CodeInputColorsBuilder

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: Color): CodeInputColorsBuilder =
        captionColor(captionColor.asStatefulValue())

    /**
     * Устанавливает цвет обводки точки [strokeColor]
     */
    fun strokeColor(strokeColor: StatefulValue<Color>): CodeInputColorsBuilder

    /**
     * Устанавливает цвет обводки точки [strokeColor]
     */
    fun strokeColor(strokeColor: Color): CodeInputColorsBuilder =
        strokeColor(strokeColor.asStatefulValue())

    /**
     * Устанавливает цвет фона точки [fillColor]
     */
    fun fillColor(fillColor: StatefulValue<Color>): CodeInputColorsBuilder

    /**
     * Устанавливает цвет фона точки [fillColor]
     */
    fun fillColor(fillColor: Color): CodeInputColorsBuilder =
        fillColor(fillColor.asStatefulValue())

    /**
     * Вернёт [CodeInputColors]
     */
    fun build(): CodeInputColors
}

private data class DefaultCodeInputColors(
    override val codeColor: StatefulValue<Color>,
    override val captionColor: StatefulValue<Color>,
    override val strokeColor: StatefulValue<Color>,
    override val fillColor: StatefulValue<Color>,
) : CodeInputColors {
    class Builder : CodeInputColorsBuilder {
        private var codeColor: StatefulValue<Color>? = null
        private var captionColor: StatefulValue<Color>? = null
        private var strokeColor: StatefulValue<Color>? = null
        private var fillColor: StatefulValue<Color>? = null

        override fun codeColor(codeColor: StatefulValue<Color>): CodeInputColorsBuilder =
            apply {
                this.codeColor = codeColor
            }

        override fun captionColor(captionColor: StatefulValue<Color>): CodeInputColorsBuilder =
            apply {
                this.captionColor = captionColor
            }

        override fun strokeColor(strokeColor: StatefulValue<Color>): CodeInputColorsBuilder =
            apply {
                this.strokeColor = strokeColor
            }

        override fun fillColor(fillColor: StatefulValue<Color>): CodeInputColorsBuilder =
            apply {
                this.fillColor = fillColor
            }

        override fun build(): CodeInputColors = DefaultCodeInputColors(
            codeColor = codeColor ?: Color.Black.asStatefulValue(
                setOf(CodeInputStates.Error) to Color.Red,
            ),
            captionColor = captionColor ?: Color.DarkGray.asStatefulValue(
                setOf(CodeInputStates.Error) to Color.Red,
            ),
            strokeColor = strokeColor ?: Color.Black.asStatefulValue(
                setOf(CodeInputStates.Error) to Color.Red,
            ),
            fillColor = fillColor ?: Color.Black.asStatefulValue(
                setOf(CodeInputStates.Error) to Color.Red,
            ),
        )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface CodeInputDimensions {
    /**
     * Размер точки
     */
    val dotSize: Dp

    /**
     * Ширина обводки точки
     */
    val strokeWidth: Dp

    /**
     * Высота элемента с символом
     */
    val itemHeight: StatefulValue<Dp>

    /**
     * Ширина элемента с символом
     */
    val itemWidth: StatefulValue<Dp>

    /**
     * Расстояние между элементами в пределах одной группы
     */
    val itemSpacing: Dp

    /**
     * Расстояние между группами
     */
    val groupSpacing: Dp

    /**
     * Отступ надписи
     */
    val captionPadding: Dp

    companion object {
        /**
         * Возвращает экземпляр [CodeInputDimensionsBuilder]
         */
        fun builder(): CodeInputDimensionsBuilder = DefaultCodeInputDimensions.Builder()
    }
}

/**
 * Билдер для [CodeInputDimensions]
 */
interface CodeInputDimensionsBuilder {
    /**
     * Устанавливает размер точки [dotSize]
     */
    fun dotSize(dotSize: Dp): CodeInputDimensionsBuilder

    /**
     * Устанавливает ширину обводки точки [strokeWidth]
     */
    fun strokeWidth(strokeWidth: Dp): CodeInputDimensionsBuilder

    /**
     * Устанавливает высоту элемента с символом [itemHeight]
     */
    fun itemHeight(itemHeight: StatefulValue<Dp>): CodeInputDimensionsBuilder

    /**
     * Устанавливает высоту элемента с символом [itemHeight]
     */
    fun itemHeight(itemHeight: Dp): CodeInputDimensionsBuilder =
        itemHeight(itemHeight.asStatefulValue())

    /**
     * Устанавливает ширину элемента с символом [itemWidth]
     */
    fun itemWidth(itemWidth: StatefulValue<Dp>): CodeInputDimensionsBuilder

    /**
     * Устанавливает ширину элемента с символом [itemWidth]
     */
    fun itemWidth(itemWidth: Dp): CodeInputDimensionsBuilder =
        itemWidth(itemWidth.asStatefulValue())

    /**
     * Устанавливает расстояние между элементами в пределах одной группы [itemSpacing]
     */
    fun itemSpacing(itemSpacing: Dp): CodeInputDimensionsBuilder

    /**
     * Устанавливает расстояние между группами [groupSpacing]
     */
    fun groupSpacing(groupSpacing: Dp): CodeInputDimensionsBuilder

    /**
     * Устанавливает отступ надписи [captionPadding]
     */
    fun captionPadding(captionPadding: Dp): CodeInputDimensionsBuilder

    /**
     * Вернёт [CodeInputDimensions]
     */
    fun build(): CodeInputDimensions
}

private data class DefaultCodeInputDimensions(
    override val dotSize: Dp,
    override val strokeWidth: Dp,
    override val itemHeight: StatefulValue<Dp>,
    override val itemWidth: StatefulValue<Dp>,
    override val itemSpacing: Dp,
    override val groupSpacing: Dp,
    override val captionPadding: Dp,
) : CodeInputDimensions {
    class Builder : CodeInputDimensionsBuilder {
        private var dotSize: Dp? = null
        private var strokeWidth: Dp? = null
        private var itemHeight: StatefulValue<Dp>? = null
        private var itemWidth: StatefulValue<Dp>? = null
        private var itemSpacing: Dp? = null
        private var groupSpacing: Dp? = null
        private var captionPadding: Dp? = null

        override fun dotSize(dotSize: Dp): CodeInputDimensionsBuilder = apply {
            this.dotSize =
                dotSize
        }

        override fun strokeWidth(strokeWidth: Dp): CodeInputDimensionsBuilder = apply {
            this.strokeWidth = strokeWidth
        }

        override fun itemHeight(itemHeight: StatefulValue<Dp>): CodeInputDimensionsBuilder = apply {
            this.itemHeight = itemHeight
        }

        override fun itemWidth(itemWidth: StatefulValue<Dp>): CodeInputDimensionsBuilder = apply {
            this.itemWidth = itemWidth
        }

        override fun itemSpacing(itemSpacing: Dp): CodeInputDimensionsBuilder = apply {
            this.itemSpacing = itemSpacing
        }

        override fun groupSpacing(groupSpacing: Dp): CodeInputDimensionsBuilder = apply {
            this.groupSpacing = groupSpacing
        }

        override fun captionPadding(captionPadding: Dp): CodeInputDimensionsBuilder = apply {
            this.captionPadding = captionPadding
        }

        override fun build(): CodeInputDimensions = DefaultCodeInputDimensions(
            dotSize = dotSize ?: 12.dp,
            strokeWidth = strokeWidth ?: 1.dp,
            itemHeight = itemHeight ?: 44.dp.asStatefulValue(),
            itemWidth = itemWidth ?: 26.dp.asStatefulValue(),
            itemSpacing = itemSpacing ?: 4.dp,
            groupSpacing = groupSpacing ?: 16.dp,
            captionPadding = captionPadding ?: 24.dp,
        )
    }
}
