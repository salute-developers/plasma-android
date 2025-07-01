package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [AccordionItemStyle] для компонента [AccordionItem]
 */
val LocalAccordionItemStyle: ProvidableCompositionLocal<AccordionItemStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { AccordionItemStyle.builder().style() }

/**
 * Стиль компонента
 */
@Immutable
interface AccordionItemStyle : Style {
    /**
     * Стиль надписи
     */
    val titleStyle: TextStyle

    /**
     * Стиль текста контента
     */
    val contentTextStyle: TextStyle

    /**
     * Форма компонента
     */
    val shape: Shape

    /**
     * Значение угла поворота при смене состояния
     */
    val iconRotation: Float

    /**
     * Расположение иконки
     */
    val iconPlacement: AccordionIconPlacement

    /**
     * Иконка в закрытом состоянии
     */
    val iconClosed: Painter?

    /**
     * Иконка в открытом состоянии
     */
    val iconOpened: Painter?

    /**
     * Цвета компонента
     */
    val colors: AccordionItemColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: AccordionItemDimensions

    companion object {
        /**
         * Возвращает экземпляр [AccordionItemStyleBuilder]
         */
        fun builder(receiver: Any? = null): AccordionItemStyleBuilder =
            DefaultAccordionItemStyle.Builder()
    }
}

/**
 * Билдер стиля компонента
 */
interface AccordionItemStyleBuilder : StyleBuilder<AccordionItemStyle> {
    /**
     * Устанавливает форму компонента [shape]
     */
    fun shape(shape: Shape): AccordionItemStyleBuilder

    /**
     * Устанавливает стиль текста надписи [titleStyle]
     */
    fun titleStyle(titleStyle: TextStyle): AccordionItemStyleBuilder

    /**
     * Устанавливает стиль текста контента [contentTextStyle]
     */
    fun contentTextStyle(contentTextStyle: TextStyle): AccordionItemStyleBuilder

    /**
     * Устанавливает иконку в закрытом состоянии [iconClosed]
     */
    fun iconClosed(iconClosed: Painter?): AccordionItemStyleBuilder

    /**
     * Устанавливает иконку в открытом состоянии [iconOpened]
     */
    fun iconOpened(iconOpened: Painter?): AccordionItemStyleBuilder

    /**
     * Устанавливает угол поворота иконки при смене состояния
     */
    fun iconRotation(iconRotation: Float): AccordionItemStyleBuilder

    /**
     * Устанавливает угол поворота иконки при смене состояния
     */
    fun iconPlacement(iconPlacement: AccordionIconPlacement): AccordionItemStyleBuilder

    /**
     * Устанавливает цвета компонента с помощью [builder]
     */
    @Composable
    fun colors(builder: @Composable AccordionItemColorsBuilder.() -> Unit): AccordionItemStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента c помощью [builder]
     */
    @Composable
    fun dimensions(builder: @Composable AccordionItemDimensionsBuilder.() -> Unit): AccordionItemStyleBuilder
}

private data class DefaultAccordionItemStyle(
    override val titleStyle: TextStyle,
    override val contentTextStyle: TextStyle,
    override val shape: Shape,
    override val iconRotation: Float,
    override val colors: AccordionItemColors,
    override val dimensions: AccordionItemDimensions,
    override val iconPlacement: AccordionIconPlacement,
    override val iconClosed: Painter?,
    override val iconOpened: Painter?,
) : AccordionItemStyle {

    class Builder : AccordionItemStyleBuilder {
        private var titleStyle: TextStyle? = null

        private var contentTextStyle: TextStyle? = null

        private var shape: Shape? = null

        private var iconRotation: Float? = null

        private var iconClosed: Painter? = null

        private var iconOpened: Painter? = null

        private var iconPlacement: AccordionIconPlacement? = null

        private val colorsBuilder: AccordionItemColorsBuilder = AccordionItemColors.builder()

        private val dimensionsBuilder: AccordionItemDimensionsBuilder = AccordionItemDimensions.builder()

        override fun shape(shape: Shape): AccordionItemStyleBuilder =
            apply { this.shape = shape }

        override fun titleStyle(titleStyle: TextStyle): AccordionItemStyleBuilder = apply {
            this.titleStyle = titleStyle
        }

        override fun contentTextStyle(contentTextStyle: TextStyle): AccordionItemStyleBuilder =
            apply { this.contentTextStyle = contentTextStyle }

        override fun iconClosed(iconClosed: Painter?): AccordionItemStyleBuilder =
            apply { this.iconClosed = iconClosed }

        override fun iconOpened(iconOpened: Painter?): AccordionItemStyleBuilder =
            apply { this.iconOpened = iconOpened }

        override fun iconRotation(iconRotation: Float): AccordionItemStyleBuilder =
            apply { this.iconRotation = iconRotation }

        override fun iconPlacement(iconPlacement: AccordionIconPlacement): AccordionItemStyleBuilder =
            apply { this.iconPlacement = iconPlacement }

        @Composable
        override fun colors(builder: @Composable AccordionItemColorsBuilder.() -> Unit):
            AccordionItemStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable AccordionItemDimensionsBuilder.() -> Unit):
            AccordionItemStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): AccordionItemStyle = DefaultAccordionItemStyle(
            shape = shape ?: RectangleShape,
            titleStyle = titleStyle ?: TextStyle.Default,
            contentTextStyle = contentTextStyle ?: TextStyle.Default,
            iconRotation = iconRotation ?: 180f,
            iconPlacement = iconPlacement ?: AccordionIconPlacement.Start,
            iconClosed = iconClosed,
            iconOpened = iconOpened,
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
        )
    }
}

/**
 * Цвета компонента
 */
@Immutable
interface AccordionItemColors {
    /**
     * Цвет фона
     */
    val backgroundColor: InteractiveColor

    /**
     * Цвет надписи
     */
    val titleColor: InteractiveColor

    /**
     * Цвет текста контента
     */
    val contentTextColor: InteractiveColor

    /**
     * Цвет иконки
     */
    val iconColor: InteractiveColor

    companion object {
        /**
         * Возвращает экземпляр [AccordionItemColorsBuilder]
         */
        fun builder(): AccordionItemColorsBuilder = DefaultAccordionItemColors.BuilderItem()
    }
}

/**
 * Билдер для [AccordionItemColors]
 */
interface AccordionItemColorsBuilder {
    /**
     * Устанавливает цвет фона [backgroundColor]
     */
    fun backgroundColor(backgroundColor: InteractiveColor): AccordionItemColorsBuilder

    /**
     * Устанавливает цвет фона [backgroundColor]
     */
    fun backgroundColor(backgroundColor: Color): AccordionItemColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет надписи [titleColor]
     */
    fun titleColor(titleColor: InteractiveColor): AccordionItemColorsBuilder

    /**
     * Устанавливает цвет надписи [titleColor]
     */
    fun titleColor(titleColor: Color): AccordionItemColorsBuilder =
        titleColor(titleColor.asInteractive())

    /**
     * Устанавливает цвет текста контента [contentTextColor]
     */
    fun contentTextColor(contentTextColor: InteractiveColor): AccordionItemColorsBuilder

    /**
     * Устанавливает цвет текста контента [contentTextColor]
     */
    fun contentTextColor(contentTextColor: Color): AccordionItemColorsBuilder =
        contentTextColor(contentTextColor.asInteractive())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: InteractiveColor): AccordionItemColorsBuilder

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: Color): AccordionItemColorsBuilder =
        this.iconColor(iconColor.asInteractive())

    /**
     * Вернёт [AccordionItemColors]
     */
    fun build(): AccordionItemColors
}

private data class DefaultAccordionItemColors(
    override val backgroundColor: InteractiveColor,
    override val titleColor: InteractiveColor,
    override val contentTextColor: InteractiveColor,
    override val iconColor: InteractiveColor,
) : AccordionItemColors {
    class BuilderItem : AccordionItemColorsBuilder {
        private var backgroundColor: InteractiveColor? = null

        private var titleColor: InteractiveColor? = null

        private var contentTextColor: InteractiveColor? = null

        private var iconColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: InteractiveColor): AccordionItemColorsBuilder =
            apply { this.backgroundColor = backgroundColor }

        override fun titleColor(titleColor: InteractiveColor): AccordionItemColorsBuilder =
            apply {
                this.titleColor = titleColor
            }

        override fun contentTextColor(contentTextColor: InteractiveColor): AccordionItemColorsBuilder =
            apply { this.contentTextColor = contentTextColor }

        override fun iconColor(iconColor: InteractiveColor): AccordionItemColorsBuilder =
            apply {
                this.iconColor = iconColor
            }

        override fun build(): AccordionItemColors = DefaultAccordionItemColors(
            backgroundColor = backgroundColor ?: Color.Transparent.asInteractive(),
            titleColor = titleColor ?: Color.Black.asInteractive(),
            contentTextColor = contentTextColor ?: Color.DarkGray.asInteractive(),
            iconColor = iconColor ?: Color.DarkGray.asInteractive(),
        )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface AccordionItemDimensions {
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

    /**
     * Отступ контента в начале
     */
    val contentPaddingStart: Dp

    /**
     * Отступ контента в конце
     */
    val contentPaddingEnd: Dp

    /**
     * Отступ контента сверху
     */
    val contentPaddingTop: Dp

    /**
     * Отступ контента снизу
     */
    val contentPaddingBottom: Dp

    /**
     * Отступ иконки
     */
    val iconPadding: Dp

    companion object {
        /**
         * Возвращает экземпляр [AccordionItemDimensionsBuilder]
         */
        fun builder(): AccordionItemDimensionsBuilder = DefaultAccordionItemDimensions.BuilderItem()
    }
}

/**
 * Билдер для [AccordionItemDimensions]
 */
interface AccordionItemDimensionsBuilder {
    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): AccordionItemDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): AccordionItemDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): AccordionItemDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): AccordionItemDimensionsBuilder

    /**
     * Устанавливает отступ в начале контента [contentPaddingStart]
     */
    fun contentPaddingStart(contentPaddingStart: Dp): AccordionItemDimensionsBuilder

    /**
     * Устанавливает отступ в конце контента [contentPaddingEnd]
     */
    fun contentPaddingEnd(contentPaddingEnd: Dp): AccordionItemDimensionsBuilder

    /**
     * Устанавливает отступ сверху контента [contentPaddingTop]
     */
    fun contentPaddingTop(contentPaddingTop: Dp): AccordionItemDimensionsBuilder

    /**
     * Устанавливает отступ снизу контента [contentPaddingBottom]
     */
    fun contentPaddingBottom(contentPaddingBottom: Dp): AccordionItemDimensionsBuilder

    /**
     * Устанавливает отступ иконки [iconPadding]
     */
    fun iconPadding(iconPadding: Dp): AccordionItemDimensionsBuilder

    /**
     * Вернёт [AccordionItemDimensions]
     */
    fun build(): AccordionItemDimensions
}

private data class DefaultAccordionItemDimensions(
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val contentPaddingStart: Dp,
    override val contentPaddingEnd: Dp,
    override val contentPaddingTop: Dp,
    override val contentPaddingBottom: Dp,
    override val iconPadding: Dp,
) : AccordionItemDimensions {
    class BuilderItem : AccordionItemDimensionsBuilder {
        private var paddingStart: Dp? = null

        private var paddingEnd: Dp? = null

        private var paddingTop: Dp? = null

        private var paddingBottom: Dp? = null

        private var contentPaddingStart: Dp? = null

        private var contentPaddingEnd: Dp? = null

        private var contentPaddingTop: Dp? = null

        private var contentPaddingBottom: Dp? = null

        private var iconPadding: Dp? = null

        override fun paddingStart(paddingStart: Dp): AccordionItemDimensionsBuilder = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: Dp): AccordionItemDimensionsBuilder = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: Dp): AccordionItemDimensionsBuilder = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: Dp): AccordionItemDimensionsBuilder = apply {
            this.paddingBottom = paddingBottom
        }

        override fun contentPaddingStart(contentPaddingStart: Dp): AccordionItemDimensionsBuilder =
            apply { this.contentPaddingStart = contentPaddingStart }

        override fun contentPaddingEnd(contentPaddingEnd: Dp): AccordionItemDimensionsBuilder =
            apply { this.contentPaddingEnd = contentPaddingEnd }

        override fun contentPaddingTop(contentPaddingTop: Dp): AccordionItemDimensionsBuilder =
            apply { this.contentPaddingTop = contentPaddingTop }

        override fun contentPaddingBottom(contentPaddingBottom: Dp): AccordionItemDimensionsBuilder =
            apply { this.contentPaddingBottom = contentPaddingBottom }

        override fun iconPadding(iconPadding: Dp): AccordionItemDimensionsBuilder = apply {
            this.iconPadding = iconPadding
        }

        override fun build(): AccordionItemDimensions = DefaultAccordionItemDimensions(
            paddingStart = paddingStart ?: 0.dp,
            paddingEnd = paddingEnd ?: 0.dp,
            paddingTop = paddingTop ?: 14.dp,
            paddingBottom = paddingBottom ?: 14.dp,
            contentPaddingStart = contentPaddingStart ?: 0.dp,
            contentPaddingEnd = contentPaddingEnd ?: 0.dp,
            contentPaddingTop = contentPaddingTop ?: 0.dp,
            contentPaddingBottom = contentPaddingBottom ?: 14.dp,
            iconPadding = iconPadding ?: 4.dp,
        )
    }
}
