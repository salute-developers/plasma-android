package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.api.info.compose.ApiName
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.transform
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
    @Deprecated("use codeStyles", replaceWith = ReplaceWith("codeStyles"))
    val codeStyle: TextStyle

    /**
     * Стиль кода
     */
    val codeStyles: StatefulValue<TextStyle>

    /**
     * Стиль надписи
     */
    @Deprecated("use captionStyles", replaceWith = ReplaceWith("captionStyles"))
    val captionStyle: TextStyle

    /**
     * Стили надписи
     */
    val captionStyles: StatefulValue<TextStyle>

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
@ApiInfo
interface CodeInputStyleBuilder : StyleBuilder<CodeInputStyle> {

    /**
     * Устанавливает стиль кода [codeStyle]
     */
    fun codeStyle(codeStyle: TextStyle): CodeInputStyleBuilder =
        codeStyle(codeStyle.asStatefulValue())

    /**
     * Устанавливает стили кода [codeStyle]
     */
    fun codeStyle(codeStyle: StatefulValue<TextStyle>): CodeInputStyleBuilder

    /**
     * Устанавливает стиль надписи [captionStyle]
     */
    fun captionStyle(captionStyle: StatefulValue<TextStyle>): CodeInputStyleBuilder

    /**
     * Устанавливает стили надписи [captionStyle]
     */
    fun captionStyle(captionStyle: TextStyle): CodeInputStyleBuilder =
        captionStyle(captionStyle.asStatefulValue())

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
    override val colors: CodeInputColors,
    override val dimensions: CodeInputDimensions,
    override val codeStyles: StatefulValue<TextStyle>,
    override val captionStyles: StatefulValue<TextStyle>,
) : CodeInputStyle {
    @Deprecated("use codeStyles", replaceWith = ReplaceWith("codeStyles"))
    override val codeStyle: TextStyle = codeStyles.getDefaultValue()

    @Deprecated("use captionStyles", replaceWith = ReplaceWith("captionStyles"))
    override val captionStyle: TextStyle = captionStyles.getDefaultValue()
    class Builder : CodeInputStyleBuilder {
        private var codeStyle: StatefulValue<TextStyle>? = null

        private var captionStyle: StatefulValue<TextStyle>? = null

        private val colorsBuilder: CodeInputColorsBuilder = CodeInputColors.builder()

        private val dimensionsBuilder: CodeInputDimensionsBuilder = CodeInputDimensions.builder()

        override fun codeStyle(codeStyle: StatefulValue<TextStyle>): CodeInputStyleBuilder = apply {
            this.codeStyle = codeStyle
        }

        override fun captionStyle(captionStyle: StatefulValue<TextStyle>): CodeInputStyleBuilder = apply {
            this.captionStyle = captionStyle
        }

        @Composable
        override fun colors(builder: @Composable CodeInputColorsBuilder.() -> Unit):
            CodeInputStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable CodeInputDimensionsBuilder.() -> Unit):
            CodeInputStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): CodeInputStyle = DefaultCodeInputStyle(
            codeStyles = codeStyle ?: TextStyle.Default.asStatefulValue(),
            captionStyles = captionStyle ?: TextStyle.Default.asStatefulValue(),
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
    @Deprecated("use codeBrush", replaceWith = ReplaceWith("codeBrush"))
    val codeColor: StatefulValue<Color>

    /**
     * Цвет кода
     */
    val codeBrush: StatefulValue<Brush>

    /**
     * Цвет надписи
     */
    @Deprecated("use captionBrush", replaceWith = ReplaceWith("captionBrush"))
    val captionColor: StatefulValue<Color>

    /**
     * Цвет надписи
     */
    val captionBrush: StatefulValue<Brush>

    /**
     * Цвет обводки точки
     */
    @Deprecated("use strokeBrush", replaceWith = ReplaceWith("strokeBrush"))
    val strokeColor: StatefulValue<Color>

    /**
     * Цвет обводки точки
     */
    val strokeBrush: StatefulValue<Brush>

    /**
     * Цвет фона точки
     */
    @Deprecated("use fillBrush", replaceWith = ReplaceWith("fillBrush"))
    val fillColor: StatefulValue<Color>

    /**
     * Цвет фона точки
     */
    val fillBrush: StatefulValue<Brush>

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
    fun codeColor(codeColor: StatefulValue<Color>): CodeInputColorsBuilder =
        codeBrush(codeColor.asStatefulBrush())

    /**
     * Устанавливает цвет кода [codeColor]
     */
    fun codeBrush(codeColor: StatefulValue<Brush>): CodeInputColorsBuilder

    /**
     * Устанавливает цвет кода [codeColor]
     */
    fun codeColor(codeColor: Brush): CodeInputColorsBuilder =
        codeBrush(codeColor.asStatefulValue())

    /**
     * Устанавливает цвет кода [codeColor]
     */
    fun codeColor(codeColor: Color): CodeInputColorsBuilder =
        codeBrush(codeColor.asStatefulBrush())

    /**
     * Устанавливает цвет кода [codeColor]
     */
    fun codeColor(codeColor: InteractiveColor): CodeInputColorsBuilder =
        codeBrush(codeColor.asStatefulBrush())

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: StatefulValue<Color>): CodeInputColorsBuilder =
        captionBrush(captionColor.asStatefulBrush())

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionBrush(captionColor: StatefulValue<Brush>): CodeInputColorsBuilder

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: Brush): CodeInputColorsBuilder =
        captionBrush(captionColor.asStatefulValue())

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: Color): CodeInputColorsBuilder =
        captionBrush(captionColor.asStatefulBrush())

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: InteractiveColor): CodeInputColorsBuilder =
        captionBrush(captionColor.asStatefulBrush())

    /**
     * Устанавливает цвет обводки точки [strokeColor]
     */
    fun strokeColor(strokeColor: StatefulValue<Color>): CodeInputColorsBuilder =
        strokeBrush(strokeColor.asStatefulBrush())

    /**
     * Устанавливает цвет обводки точки [strokeColor]
     */
    fun strokeBrush(strokeColor: StatefulValue<Brush>): CodeInputColorsBuilder

    /**
     * Устанавливает цвет обводки точки [strokeColor]
     */
    fun strokeColor(strokeColor: Brush): CodeInputColorsBuilder =
        strokeBrush(strokeColor.asStatefulValue())

    /**
     * Устанавливает цвет обводки точки [strokeColor]
     */
    fun strokeColor(strokeColor: Color): CodeInputColorsBuilder =
        strokeBrush(strokeColor.asStatefulBrush())

    /**
     * Устанавливает цвет обводки точки [strokeColor]
     */
    fun strokeColor(strokeColor: InteractiveColor): CodeInputColorsBuilder =
        strokeBrush(strokeColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона точки [fillColor]
     */
    fun fillColor(fillColor: StatefulValue<Color>): CodeInputColorsBuilder =
        fillBrush(fillColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона точки [fillColor]
     */
    fun fillBrush(fillColor: StatefulValue<Brush>): CodeInputColorsBuilder

    /**
     * Устанавливает цвет фона точки [fillColor]
     */
    fun fillColor(fillColor: Brush): CodeInputColorsBuilder =
        fillBrush(fillColor.asStatefulValue())

    /**
     * Устанавливает цвет фона точки [fillColor]
     */
    fun fillColor(fillColor: Color): CodeInputColorsBuilder =
        fillBrush(fillColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона точки [fillColor]
     */
    fun fillColor(fillColor: InteractiveColor): CodeInputColorsBuilder =
        fillBrush(fillColor.asStatefulBrush())

    /**
     * Вернёт [CodeInputColors]
     */
    fun build(): CodeInputColors
}

private data class DefaultCodeInputColors(
    override val codeBrush: StatefulValue<Brush>,
    override val captionBrush: StatefulValue<Brush>,
    override val strokeBrush: StatefulValue<Brush>,
    override val fillBrush: StatefulValue<Brush>,

) : CodeInputColors {
    @Deprecated("use codeBrush", replaceWith = ReplaceWith("codeBrush"))
    override val codeColor: StatefulValue<Color> = codeBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    @Deprecated("use captionBrush", replaceWith = ReplaceWith("captionBrush"))
    override val captionColor: StatefulValue<Color> = captionBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    @Deprecated("use strokeBrush", replaceWith = ReplaceWith("strokeBrush"))
    override val strokeColor: StatefulValue<Color> = strokeBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    @Deprecated("use fillBrush", replaceWith = ReplaceWith("fillBrush"))
    override val fillColor: StatefulValue<Color> = fillBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    class Builder : CodeInputColorsBuilder {
        private var codeColor: StatefulValue<Brush>? = null
        private var captionColor: StatefulValue<Brush>? = null
        private var strokeColor: StatefulValue<Brush>? = null
        private var fillColor: StatefulValue<Brush>? = null

        override fun codeBrush(codeColor: StatefulValue<Brush>): CodeInputColorsBuilder = apply {
            this.codeColor = codeColor
        }

        override fun captionBrush(captionColor: StatefulValue<Brush>): CodeInputColorsBuilder = apply {
            this.captionColor = captionColor
        }

        override fun strokeBrush(strokeColor: StatefulValue<Brush>): CodeInputColorsBuilder = apply {
            this.strokeColor = strokeColor
        }

        override fun fillBrush(fillColor: StatefulValue<Brush>): CodeInputColorsBuilder = apply {
            this.fillColor = fillColor
        }

        override fun build(): CodeInputColors = DefaultCodeInputColors(
            codeBrush = codeColor ?: Color.Black.asStatefulBrush(
                setOf(CodeInputStates.Error) to Color.Red,
            ),
            captionBrush = captionColor ?: Color.DarkGray.asStatefulBrush(
                setOf(CodeInputStates.Error) to Color.Red,
            ),
            strokeBrush = strokeColor ?: Color.Black.asStatefulBrush(
                setOf(CodeInputStates.Error) to Color.Red,
            ),
            fillBrush = fillColor ?: Color.Black.asStatefulBrush(
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
    @Deprecated("use circleSize", replaceWith = ReplaceWith("circleSize"))
    val dotSize: Dp

    /**
     * Размер круга
     */
    val circleSize: StatefulValue<Dp>

    /**
     * Ширина обводки точки
     */
    @Deprecated("use strokeWidthValues", replaceWith = ReplaceWith("strokeWidthValues"))
    val strokeWidth: Dp

    /**
     * Ширина обводки точки
     */
    val strokeWidthValues: StatefulValue<Dp>

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
    @Deprecated("use itemSpacingValues", replaceWith = ReplaceWith("itemSpacingValues"))
    val itemSpacing: Dp

    /**
     * Расстояние между элементами в пределах одной группы
     */
    val itemSpacingValues: StatefulValue<Dp>

    /**
     * Расстояние между группами
     */
    @Deprecated("use groupSpacingValues", replaceWith = ReplaceWith("groupSpacingValues"))
    val groupSpacing: Dp

    /**
     * Расстояние между группами
     */
    val groupSpacingValues: StatefulValue<Dp>

    /**
     * Отступ надписи
     */
    @Deprecated("use captionPaddingValues", replaceWith = ReplaceWith("captionPaddingValues"))
    val captionPadding: Dp

    /**
     * Отступ надписи
     */
    val captionPaddingValues: StatefulValue<Dp>

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
    @Deprecated("Use circleSize() instead")
    fun dotSize(dotSize: Dp): CodeInputDimensionsBuilder

    /**
     * Устанавливает размер круга [circleSize]
     */
    @ApiName(name = "dotSize")
    fun circleSize(circleSize: StatefulValue<Dp>): CodeInputDimensionsBuilder

    /**
     * Устанавливает размер круга [circleSize]
     */
    fun circleSize(circleSize: Dp): CodeInputDimensionsBuilder =
        circleSize(circleSize.asStatefulValue())

    /**
     * Устанавливает ширину обводки точки [strokeWidth]
     */
    fun strokeWidth(strokeWidth: StatefulValue<Dp>): CodeInputDimensionsBuilder

    /**
     * Устанавливает ширину обводки точки [strokeWidth]
     */
    fun strokeWidth(strokeWidth: Dp): CodeInputDimensionsBuilder =
        strokeWidth(strokeWidth.asStatefulValue())

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
    fun itemSpacing(itemSpacing: StatefulValue<Dp>): CodeInputDimensionsBuilder

    /**
     * Устанавливает расстояние между элементами в пределах одной группы [itemSpacing]
     */
    fun itemSpacing(itemSpacing: Dp): CodeInputDimensionsBuilder =
        itemSpacing(itemSpacing.asStatefulValue())

    /**
     * Устанавливает расстояние между группами [groupSpacing]
     */
    fun groupSpacing(groupSpacing: StatefulValue<Dp>): CodeInputDimensionsBuilder

    /**
     * Устанавливает расстояние между группами [groupSpacing]
     */
    fun groupSpacing(groupSpacing: Dp): CodeInputDimensionsBuilder =
        groupSpacing(groupSpacing.asStatefulValue())

    /**
     * Устанавливает отступ надписи [captionPadding]
     */
    fun captionPadding(captionPadding: StatefulValue<Dp>): CodeInputDimensionsBuilder

    /**
     * Устанавливает отступ надписи [captionPadding]
     */
    fun captionPadding(captionPadding: Dp): CodeInputDimensionsBuilder =
        captionPadding(captionPadding.asStatefulValue())

    /**
     * Вернёт [CodeInputDimensions]
     */
    fun build(): CodeInputDimensions
}

private data class DefaultCodeInputDimensions(
    @Deprecated("Use circleSize instead")
    override val dotSize: Dp,
    override val itemHeight: StatefulValue<Dp>,
    override val itemWidth: StatefulValue<Dp>,
    override val circleSize: StatefulValue<Dp>,
    override val strokeWidthValues: StatefulValue<Dp>,
    override val itemSpacingValues: StatefulValue<Dp>,
    override val groupSpacingValues: StatefulValue<Dp>,
    override val captionPaddingValues: StatefulValue<Dp>,
) : CodeInputDimensions {
    @Deprecated("use strokeWidthValues", replaceWith = ReplaceWith("strokeWidthValues"))
    override val strokeWidth: Dp = strokeWidthValues.getDefaultValue()

    @Deprecated("use itemSpacingValues", replaceWith = ReplaceWith("itemSpacingValues"))
    override val itemSpacing: Dp = itemSpacingValues.getDefaultValue()

    @Deprecated("use groupSpacingValues", replaceWith = ReplaceWith("groupSpacingValues"))
    override val groupSpacing: Dp = groupSpacingValues.getDefaultValue()

    @Deprecated("use captionPaddingValues", replaceWith = ReplaceWith("captionPaddingValues"))
    override val captionPadding: Dp = captionPaddingValues.getDefaultValue()
    class Builder : CodeInputDimensionsBuilder {
        private var dotSize: Dp? = null
        private var circleSize: StatefulValue<Dp>? = null
        private var strokeWidth: StatefulValue<Dp>? = null
        private var itemHeight: StatefulValue<Dp>? = null
        private var itemWidth: StatefulValue<Dp>? = null
        private var itemSpacing: StatefulValue<Dp>? = null
        private var groupSpacing: StatefulValue<Dp>? = null
        private var captionPadding: StatefulValue<Dp>? = null

        @Deprecated("Use circleSize() instead")
        override fun dotSize(dotSize: Dp): CodeInputDimensionsBuilder = apply {
            this.dotSize = dotSize
            this.circleSize = dotSize.asStatefulValue()
        }

        override fun circleSize(circleSize: StatefulValue<Dp>) = apply {
            this.dotSize = circleSize.getDefaultValue()
            this.circleSize = circleSize
        }

        override fun strokeWidth(strokeWidth: StatefulValue<Dp>): CodeInputDimensionsBuilder = apply {
            this.strokeWidth = strokeWidth
        }

        override fun itemHeight(itemHeight: StatefulValue<Dp>): CodeInputDimensionsBuilder = apply {
            this.itemHeight = itemHeight
        }

        override fun itemWidth(itemWidth: StatefulValue<Dp>): CodeInputDimensionsBuilder = apply {
            this.itemWidth = itemWidth
        }

        override fun itemSpacing(itemSpacing: StatefulValue<Dp>): CodeInputDimensionsBuilder = apply {
            this.itemSpacing = itemSpacing
        }

        override fun groupSpacing(groupSpacing: StatefulValue<Dp>): CodeInputDimensionsBuilder = apply {
            this.groupSpacing = groupSpacing
        }

        override fun captionPadding(captionPadding: StatefulValue<Dp>): CodeInputDimensionsBuilder = apply {
            this.captionPadding = captionPadding
        }

        override fun build(): CodeInputDimensions = DefaultCodeInputDimensions(
            dotSize = dotSize ?: 12.dp,
            strokeWidthValues = strokeWidth ?: 1.dp.asStatefulValue(),
            itemHeight = itemHeight ?: 44.dp.asStatefulValue(),
            itemWidth = itemWidth ?: 26.dp.asStatefulValue(),
            itemSpacingValues = itemSpacing ?: 4.dp.asStatefulValue(),
            groupSpacingValues = groupSpacing ?: 16.dp.asStatefulValue(),
            captionPaddingValues = captionPadding ?: 24.dp.asStatefulValue(),
            circleSize = circleSize ?: dotSize?.asStatefulValue() ?: 12.dp.asStatefulValue(),
        )
    }
}
