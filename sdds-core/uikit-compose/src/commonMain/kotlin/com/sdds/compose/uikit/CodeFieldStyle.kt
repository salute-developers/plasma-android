package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.sdds.compose.uikit.interactions.transform
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
    @Deprecated("use valueStyles", replaceWith = ReplaceWith("valueStyles"))
    val valueStyle: TextStyle

    /**
     * Стили кода
     */
    val valueStyles: StatefulValue<TextStyle>

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
     * Форма элементов
     */
    @Deprecated("use itemShapes", replaceWith = ReplaceWith("itemShapes"))
    val itemShape: CornerBasedShape

    /**
     * Формы элементов
     */
    val itemShapes: StatefulValue<CornerBasedShape>

    /**
     * Форма группы элементов
     */
    @Deprecated("use groupShapes", replaceWith = ReplaceWith("groupShapes"))
    val groupShape: CornerBasedShape

    /**
     * Формы группы элементов
     */
    val groupShapes: StatefulValue<CornerBasedShape>

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
@ApiInfo
interface CodeFieldStyleBuilder : StyleBuilder<CodeFieldStyle> {
    /**
     * Устанавливает форму элемента [itemShape]
     */
    fun itemShape(itemShape: StatefulValue<CornerBasedShape>): CodeFieldStyleBuilder

    /**
     * Устанавливает формы элемента [itemShape]
     */
    fun itemShape(itemShape: CornerBasedShape): CodeFieldStyleBuilder =
        itemShape(itemShape.asStatefulValue())

    /**
     * Устанавливает форму группы элементов [groupShape]
     */
    fun groupShape(groupShape: StatefulValue<CornerBasedShape>): CodeFieldStyleBuilder

    /**
     * Устанавливает формы группы элементов [groupShape]
     */
    fun groupShape(groupShape: CornerBasedShape): CodeFieldStyleBuilder =
        groupShape(groupShape.asStatefulValue())

    /**
     * Устанавливает стиль кода [valueStyle]
     */
    fun valueStyle(valueStyle: StatefulValue<TextStyle>): CodeFieldStyleBuilder

    /**
     * Устанавливает стили кода [valueStyle]
     */
    fun valueStyle(valueStyle: TextStyle): CodeFieldStyleBuilder =
        valueStyle(valueStyle.asStatefulValue())

    /**
     * Устанавливает стиль надписи [captionStyle]
     */
    fun captionStyle(captionStyle: StatefulValue<TextStyle>): CodeFieldStyleBuilder

    /**
     * Устанавливает стили надписи [captionStyle]
     */
    fun captionStyle(captionStyle: TextStyle): CodeFieldStyleBuilder =
        captionStyle(captionStyle.asStatefulValue())

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
    override val colors: CodeFieldColors,
    override val dimensions: CodeFieldDimensions,
    override val valueStyles: StatefulValue<TextStyle>,
    override val captionStyles: StatefulValue<TextStyle>,
    override val itemShapes: StatefulValue<CornerBasedShape>,
    override val groupShapes: StatefulValue<CornerBasedShape>,
) : CodeFieldStyle {

    @Deprecated("use valueStyles", replaceWith = ReplaceWith("valueStyles"))
    override val valueStyle: TextStyle = valueStyles.getDefaultValue()

    @Deprecated("use captionStyles", replaceWith = ReplaceWith("captionStyles"))
    override val captionStyle: TextStyle = captionStyles.getDefaultValue()

    @Deprecated("use itemShapes", replaceWith = ReplaceWith("itemShapes"))
    override val itemShape: CornerBasedShape = itemShapes.getDefaultValue()

    @Deprecated("use groupShapes", replaceWith = ReplaceWith("groupShapes"))
    override val groupShape: CornerBasedShape = groupShapes.getDefaultValue()

    class Builder : CodeFieldStyleBuilder {
        private var valueStyle: StatefulValue<TextStyle>? = null

        private var captionStyle: StatefulValue<TextStyle>? = null

        private var itemShape: StatefulValue<CornerBasedShape>? = null

        private var groupShape: StatefulValue<CornerBasedShape>? = null

        private val colorsBuilder: CodeFieldColorsBuilder = CodeFieldColors.builder()

        private val dimensionsBuilder: CodeFieldDimensionsBuilder = CodeFieldDimensions.builder()

        override fun itemShape(itemShape: StatefulValue<CornerBasedShape>): CodeFieldStyleBuilder =
            apply { this.itemShape = itemShape }

        override fun groupShape(groupShape: StatefulValue<CornerBasedShape>): CodeFieldStyleBuilder = apply {
            this.groupShape = groupShape
        }

        override fun valueStyle(valueStyle: StatefulValue<TextStyle>): CodeFieldStyleBuilder = apply {
            this.valueStyle = valueStyle
        }

        override fun captionStyle(captionStyle: StatefulValue<TextStyle>): CodeFieldStyleBuilder = apply {
            this.captionStyle = captionStyle
        }

        @Composable
        override fun colors(builder: @Composable CodeFieldColorsBuilder.() -> Unit):
            CodeFieldStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable CodeFieldDimensionsBuilder.() -> Unit):
            CodeFieldStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): CodeFieldStyle = DefaultCodeFieldStyle(
            itemShapes = itemShape ?: RoundedCornerShape(0).asStatefulValue(),
            groupShapes = groupShape ?: itemShape ?: RoundedCornerShape(0).asStatefulValue(),
            valueStyles = valueStyle ?: TextStyle.Default.asStatefulValue(),
            captionStyles = captionStyle ?: TextStyle.Default.asStatefulValue(),
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
    @Deprecated("use valueBrush", replaceWith = ReplaceWith("valueBrush"))
    val valueColor: StatefulValue<Color>

    /**
     * Кисть кода
     */
    val valueBrush: StatefulValue<Brush>

    /**
     * Цвет курсора
     */
    @Deprecated("use cursorBrush", replaceWith = ReplaceWith("cursorBrush"))
    val cursorColor: StatefulValue<Color>

    /**
     * Кисть курсора
     */
    val cursorBrush: StatefulValue<Brush>

    /**
     * Цвет точки
     */
    @Deprecated("use dotBrush", replaceWith = ReplaceWith("dotBrush"))
    val dotColor: StatefulValue<Color>

    /**
     * Кисть точки
     */
    val dotBrush: StatefulValue<Brush>

    /**
     * Цвет надписи
     */
    @Deprecated("use captionBrush", replaceWith = ReplaceWith("captionBrush"))
    val captionColor: StatefulValue<Color>

    /**
     * Кисть надписи
     */
    val captionBrush: StatefulValue<Brush>

    /**
     * Цвет фона элемента
     */
    @Deprecated("use backgroundBrush", replaceWith = ReplaceWith("backgroundBrush"))
    val backgroundColor: StatefulValue<Color>

    /**
     * Кисть фона элемента
     */
    val backgroundBrush: StatefulValue<Brush>

    /**
     * Кисть обводки кодовой ячейки
     */
    @ApiName(name = "strokeColor")
    val strokeBrush: StatefulValue<Brush>

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
    fun valueColor(valueColor: StatefulValue<Color>): CodeFieldColorsBuilder =
        valueBrush(valueColor.asStatefulBrush())

    /**
     * Устанавливает цвет кода [valueColor]
     */
    fun valueColor(valueColor: Color): CodeFieldColorsBuilder =
        valueBrush(valueColor.asStatefulBrush())

    /**
     * Устанавливает цвет кода [valueColor]
     */
    fun valueColor(valueColor: InteractiveColor): CodeFieldColorsBuilder =
        valueBrush(valueColor.asStatefulBrush())

    /**
     * Устанавливает цвет кода [valueColor]
     */
    fun valueColor(valueColor: Brush): CodeFieldColorsBuilder =
        valueBrush(valueColor.asStatefulValue())

    /**
     * Устанавливает цвет кода [valueColor]
     */
    fun valueBrush(valueColor: StatefulValue<Brush>): CodeFieldColorsBuilder

    /**
     * Устанавливает цвет курсора [cursorColor]
     */
    fun cursorColor(cursorColor: StatefulValue<Color>): CodeFieldColorsBuilder =
        cursorBrush(cursorColor.asStatefulBrush())

    /**
     * Устанавливает цвет курсора [cursorColor]
     */
    fun cursorColor(cursorColor: Color): CodeFieldColorsBuilder =
        cursorBrush(cursorColor.asStatefulBrush())

    /**
     * Устанавливает цвет курсора [cursorColor]
     */
    fun cursorColor(cursorColor: InteractiveColor): CodeFieldColorsBuilder =
        cursorBrush(cursorColor.asStatefulBrush())

    /**
     * Устанавливает цвет курсора [cursorColor]
     */
    fun cursorColor(cursorColor: Brush): CodeFieldColorsBuilder =
        cursorBrush(cursorColor.asStatefulValue())

    /**
     * Устанавливает цвет курсора [cursorColor]
     */
    fun cursorBrush(cursorColor: StatefulValue<Brush>): CodeFieldColorsBuilder

    /**
     * Устанавливает цвет точки [dotColor]
     */
    fun dotColor(dotColor: StatefulValue<Color>): CodeFieldColorsBuilder =
        dotBrush(dotColor.asStatefulBrush())

    /**
     * Устанавливает цвет точки [dotColor]
     */
    fun dotColor(dotColor: Color): CodeFieldColorsBuilder =
        dotBrush(dotColor.asStatefulBrush())

    /**
     * Устанавливает цвет точки [dotColor]
     */
    fun dotColor(dotColor: InteractiveColor): CodeFieldColorsBuilder =
        dotBrush(dotColor.asStatefulBrush())

    /**
     * Устанавливает цвет точки [dotColor]
     */
    fun dotColor(dotColor: Brush): CodeFieldColorsBuilder =
        dotBrush(dotColor.asStatefulValue())

    /**
     * Устанавливает цвет точки [dotColor]
     */
    fun dotBrush(dotColor: StatefulValue<Brush>): CodeFieldColorsBuilder

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: StatefulValue<Color>): CodeFieldColorsBuilder =
        captionBrush(captionColor.asStatefulBrush())

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: Color): CodeFieldColorsBuilder =
        captionBrush(captionColor.asStatefulBrush())

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: InteractiveColor): CodeFieldColorsBuilder =
        captionBrush(captionColor.asStatefulBrush())

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionColor(captionColor: Brush): CodeFieldColorsBuilder =
        captionBrush(captionColor.asStatefulValue())

    /**
     * Устанавливает цвет надписи [captionColor]
     */
    fun captionBrush(captionColor: StatefulValue<Brush>): CodeFieldColorsBuilder

    /**
     * Устанавливает цвет фона элемента [backgroundColor]
     */
    fun backgroundColor(backgroundColor: StatefulValue<Color>): CodeFieldColorsBuilder =
        backgroundBrush(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона элемента [backgroundColor]
     */
    fun backgroundColor(backgroundColor: Color): CodeFieldColorsBuilder =
        backgroundBrush(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона элемента [backgroundColor]
     */
    fun backgroundColor(backgroundColor: InteractiveColor): CodeFieldColorsBuilder =
        backgroundBrush(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона элемента [backgroundColor]
     */
    fun backgroundColor(backgroundColor: Brush): CodeFieldColorsBuilder =
        backgroundBrush(backgroundColor.asStatefulValue())

    /**
     * Устанавливает цвет фона элемента [backgroundColor]
     */
    fun backgroundBrush(backgroundColor: StatefulValue<Brush>): CodeFieldColorsBuilder

    /**
     * Устанавливает цвет обводки [strokeColor]
     */
    fun strokeBrush(strokeColor: Brush): CodeFieldColorsBuilder =
        strokeBrush(strokeColor.asStatefulValue())

    /**
     * Устанавливает цвет обводки [strokeColor]
     */
    @ApiName(name = "strokeColor")
    fun strokeBrush(strokeColor: StatefulValue<Brush>): CodeFieldColorsBuilder

    /**
     * Устанавливает цвет обводки [strokeColor]
     */
    fun strokeBrush(strokeColor: Color): CodeFieldColorsBuilder =
        strokeBrush(strokeColor.asStatefulBrush())

    /**
     * Устанавливает цвет обводки [strokeColor]
     */
    fun strokeBrush(strokeColor: InteractiveColor): CodeFieldColorsBuilder =
        strokeBrush(strokeColor.asStatefulBrush())

    /**
     * Вернёт [CodeFieldColors]
     */
    fun build(): CodeFieldColors
}

private data class DefaultCodeFieldColors(
    override val valueBrush: StatefulValue<Brush>,
    override val cursorBrush: StatefulValue<Brush>,
    override val dotBrush: StatefulValue<Brush>,
    override val captionBrush: StatefulValue<Brush>,
    override val backgroundBrush: StatefulValue<Brush>,
    override val strokeBrush: StatefulValue<Brush>,
) : CodeFieldColors {
    @Deprecated("use valueBrush", replaceWith = ReplaceWith("valueBrush"))
    override val valueColor: StatefulValue<Color> = valueBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    @Deprecated("use cursorBrush", replaceWith = ReplaceWith("cursorBrush"))
    override val cursorColor: StatefulValue<Color> = cursorBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    @Deprecated("use dotBrush", replaceWith = ReplaceWith("dotBrush"))
    override val dotColor: StatefulValue<Color> = dotBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    @Deprecated("use captionBrush", replaceWith = ReplaceWith("captionBrush"))
    override val captionColor: StatefulValue<Color> = captionBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    @Deprecated("use backgroundBrush", replaceWith = ReplaceWith("backgroundBrush"))
    override val backgroundColor: StatefulValue<Color> = backgroundBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    class Builder : CodeFieldColorsBuilder {
        private var valueColor: StatefulValue<Brush>? = null
        private var cursorColor: StatefulValue<Brush>? = null
        private var dotColor: StatefulValue<Brush>? = null
        private var captionColor: StatefulValue<Brush>? = null
        private var backgroundColor: StatefulValue<Brush>? = null
        private var strokeColor: StatefulValue<Brush>? = null

        override fun valueBrush(valueColor: StatefulValue<Brush>): CodeFieldColorsBuilder =
            apply {
                this.valueColor = valueColor
            }

        override fun cursorBrush(cursorColor: StatefulValue<Brush>): CodeFieldColorsBuilder =
            apply {
                this.cursorColor = cursorColor
            }

        override fun dotBrush(dotColor: StatefulValue<Brush>): CodeFieldColorsBuilder = apply {
            this.dotColor = dotColor
        }

        override fun captionBrush(captionColor: StatefulValue<Brush>): CodeFieldColorsBuilder =
            apply { this.captionColor = captionColor }

        override fun backgroundBrush(backgroundColor: StatefulValue<Brush>): CodeFieldColorsBuilder =
            apply { this.backgroundColor = backgroundColor }

        override fun strokeBrush(strokeColor: StatefulValue<Brush>): CodeFieldColorsBuilder =
            apply { this.strokeColor = strokeColor }

        override fun build(): CodeFieldColors = DefaultCodeFieldColors(
            valueBrush = valueColor ?: Color.Black.asStatefulBrush(),
            cursorBrush = cursorColor ?: Color.Green.asStatefulBrush(),
            dotBrush = dotColor ?: Color.Black.asStatefulBrush(),
            captionBrush = captionColor ?: Color.Black.asStatefulBrush(),
            backgroundBrush = backgroundColor ?: Color.LightGray.asStatefulBrush(),
            strokeBrush = strokeColor ?: Color.Transparent.asStatefulBrush(),
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
    @Deprecated("use heightValues", replaceWith = ReplaceWith("heightValues"))
    val height: Dp

    /**
     * Высота элемента
     */
    val heightValues: StatefulValue<Dp>

    /**
     * Ширина элемента
     */
    @Deprecated("use widthValues", replaceWith = ReplaceWith("widthValues"))
    val width: Dp

    /**
     * Ширина элемента
     */
    val widthValues: StatefulValue<Dp>

    /**
     * Размер точки
     */
    @Deprecated("use dotSizeValues", replaceWith = ReplaceWith("dotSizeValues"))
    val dotSize: Dp

    /**
     * Размер точки
     */
    val dotSizeValues: StatefulValue<Dp>

    /**
     * Расстояние между элементами
     */
    @Deprecated("use itemSpacingValues", replaceWith = ReplaceWith("itemSpacingValues"))
    val itemSpacing: Dp

    /**
     * Расстояние между элементами
     */
    val itemSpacingValues: StatefulValue<Dp>

    /**
     * Расстояние между группами элементов
     */
    @Deprecated("use groupSpacingValues", replaceWith = ReplaceWith("groupSpacingValues"))
    val groupSpacing: Dp

    /**
     * Расстояние между группами элементов
     */
    val groupSpacingValues: StatefulValue<Dp>

    /**
     * Отступ надписи
     */
    @Deprecated("use captionSpacingValues", replaceWith = ReplaceWith("captionSpacingValues"))
    val captionSpacing: Dp

    /**
     * Отступ надписи
     */
    val captionSpacingValues: StatefulValue<Dp>

    /**
     * Ширина обводки кодовой ячейки
     */
    val strokeWidth: StatefulValue<Dp>

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
    fun height(height: StatefulValue<Dp>): CodeFieldDimensionsBuilder

    /**
     * Устанавливает высоту элемента [height]
     */
    fun height(height: Dp): CodeFieldDimensionsBuilder =
        height(height.asStatefulValue())

    /**
     * Устанавливает ширину элемента [width]
     */
    fun width(width: StatefulValue<Dp>): CodeFieldDimensionsBuilder

    /**
     * Устанавливает ширину элемента [width]
     */
    fun width(width: Dp): CodeFieldDimensionsBuilder =
        width(width.asStatefulValue())

    /**
     * Устанавливает размер точки [dotSize]
     */
    fun dotSize(dotSize: StatefulValue<Dp>): CodeFieldDimensionsBuilder

    /**
     * Устанавливает размер точки [dotSize]
     */
    fun dotSize(dotSize: Dp): CodeFieldDimensionsBuilder =
        dotSize(dotSize.asStatefulValue())

    /**
     * Устанавливает расстояние между элементами [itemSpacing]
     */
    fun itemSpacing(itemSpacing: StatefulValue<Dp>): CodeFieldDimensionsBuilder

    /**
     * Устанавливает расстояние между элементами [itemSpacing]
     */
    fun itemSpacing(itemSpacing: Dp): CodeFieldDimensionsBuilder =
        itemSpacing(itemSpacing.asStatefulValue())

    /**
     * Устанавливает расстояние между группами элементов [groupSpacing]
     */
    fun groupSpacing(groupSpacing: StatefulValue<Dp>): CodeFieldDimensionsBuilder

    /**
     * Устанавливает расстояние между группами элементов [groupSpacing]
     */
    fun groupSpacing(groupSpacing: Dp): CodeFieldDimensionsBuilder =
        groupSpacing(groupSpacing.asStatefulValue())

    /**
     * Устанавливает отступ надписи [captionSpacing]
     */
    fun captionSpacing(captionSpacing: StatefulValue<Dp>): CodeFieldDimensionsBuilder

    /**
     * Устанавливает отступ надписи [captionSpacing]
     */
    fun captionSpacing(captionSpacing: Dp): CodeFieldDimensionsBuilder =
        captionSpacing(captionSpacing.asStatefulValue())

    /**
     * Устанавливает ширину обводки кодовой ячейки [strokeWidth]
     */
    fun strokeWidth(strokeWidth: StatefulValue<Dp>): CodeFieldDimensionsBuilder

    /**
     * Устанавливает ширину обводки кодовой ячейки [strokeWidth]
     */
    fun strokeWidth(strokeWidth: Dp): CodeFieldDimensionsBuilder =
        strokeWidth(strokeWidth.asStatefulValue())

    /**
     * Вернёт [CodeFieldDimensions]
     */
    fun build(): CodeFieldDimensions
}

private data class DefaultCodeFieldDimensions(
    override val heightValues: StatefulValue<Dp>,
    override val widthValues: StatefulValue<Dp>,
    override val dotSizeValues: StatefulValue<Dp>,
    override val itemSpacingValues: StatefulValue<Dp>,
    override val groupSpacingValues: StatefulValue<Dp>,
    override val captionSpacingValues: StatefulValue<Dp>,
    override val strokeWidth: StatefulValue<Dp>,

) : CodeFieldDimensions {
    @Deprecated("use heightValues", replaceWith = ReplaceWith("heightValues"))
    override val height: Dp = heightValues.getDefaultValue()

    @Deprecated("use widthValues", replaceWith = ReplaceWith("widthValues"))
    override val width: Dp = widthValues.getDefaultValue()

    @Deprecated("use dotSizeValues", replaceWith = ReplaceWith("dotSizeValues"))
    override val dotSize: Dp = dotSizeValues.getDefaultValue()

    @Deprecated("use itemSpacingValues", replaceWith = ReplaceWith("itemSpacingValues"))
    override val itemSpacing: Dp = itemSpacingValues.getDefaultValue()

    @Deprecated("use groupSpacingValues", replaceWith = ReplaceWith("groupSpacingValues"))
    override val groupSpacing: Dp = groupSpacingValues.getDefaultValue()

    @Deprecated("use captionSpacingValues", replaceWith = ReplaceWith("captionSpacingValues"))
    override val captionSpacing: Dp = captionSpacingValues.getDefaultValue()
    class Builder : CodeFieldDimensionsBuilder {
        private var height: StatefulValue<Dp>? = null

        private var width: StatefulValue<Dp>? = null

        private var dotSize: StatefulValue<Dp>? = null

        private var itemSpacing: StatefulValue<Dp>? = null

        private var groupSpacing: StatefulValue<Dp>? = null

        private var captionSpacing: StatefulValue<Dp>? = null
        private var strokeWidth: StatefulValue<Dp>? = null

        override fun height(height: StatefulValue<Dp>): CodeFieldDimensionsBuilder = apply {
            this.height = height
        }

        override fun width(width: StatefulValue<Dp>): CodeFieldDimensionsBuilder = apply {
            this.width = width
        }

        override fun dotSize(dotSize: StatefulValue<Dp>): CodeFieldDimensionsBuilder = apply {
            this.dotSize = dotSize
        }

        override fun itemSpacing(itemSpacing: StatefulValue<Dp>): CodeFieldDimensionsBuilder = apply {
            this.itemSpacing = itemSpacing
        }

        override fun groupSpacing(groupSpacing: StatefulValue<Dp>): CodeFieldDimensionsBuilder = apply {
            this.groupSpacing = groupSpacing
        }

        override fun captionSpacing(captionSpacing: StatefulValue<Dp>): CodeFieldDimensionsBuilder = apply {
            this.captionSpacing = captionSpacing
        }

        override fun strokeWidth(strokeWidth: StatefulValue<Dp>): CodeFieldDimensionsBuilder = apply {
            this.strokeWidth = strokeWidth
        }

        override fun build(): CodeFieldDimensions = DefaultCodeFieldDimensions(
            heightValues = height ?: 56.dp.asStatefulValue(),
            widthValues = width ?: 44.dp.asStatefulValue(),
            dotSizeValues = dotSize ?: 10.dp.asStatefulValue(),
            itemSpacingValues = itemSpacing ?: 2.dp.asStatefulValue(),
            groupSpacingValues = groupSpacing ?: 8.dp.asStatefulValue(),
            captionSpacingValues = captionSpacing ?: 14.dp.asStatefulValue(),
            strokeWidth = strokeWidth ?: 0.dp.asStatefulValue(),
        )
    }
}
