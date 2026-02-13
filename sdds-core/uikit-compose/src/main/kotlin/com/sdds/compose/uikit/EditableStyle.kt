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
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [EditableStyle] для компонента [Editable]
 */
val LocalEditableStyle: ProvidableCompositionLocal<EditableStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { EditableStyle.builder().style() }

/**
 * Стиль компонента
 */
@Immutable
interface EditableStyle : Style {
    /**
     * Стиль
     */
    val textStyle: TextStyle

    /**
     * Цвета компонента
     */
    val colors: EditableColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: EditableDimensions

    companion object {
        /**
         * Возвращает экземпляр [EditableStyleBuilder]
         */
        fun builder(receiver: Any? = null): EditableStyleBuilder =
            DefaultEditableStyle.Builder()
    }
}

/**
 * Билдер стиля компонента
 */
interface EditableStyleBuilder : StyleBuilder<EditableStyle> {
    /**
     * Устанавливает стиль текста
     */
    fun textStyle(textStyle: TextStyle): EditableStyleBuilder

    /**
     * Устанавливает цвет
     */
    @Composable
    fun colors(builder: @Composable EditableColorsBuilder.() -> Unit): EditableStyleBuilder

    /**
     * Устанавливает
     */
    @Composable
    fun dimensions(builder: @Composable EditableDimensionsBuilder.() -> Unit): EditableStyleBuilder
}

private data class DefaultEditableStyle(
    override val textStyle: TextStyle,
    override val colors: EditableColors,
    override val dimensions: EditableDimensions,
) : EditableStyle {
    class Builder : EditableStyleBuilder {
        private var textStyle: TextStyle? = null

        private val colorsBuilder: EditableColorsBuilder = EditableColors.builder()

        private val dimensionsBuilder: EditableDimensionsBuilder = EditableDimensions.builder()

        override fun textStyle(textStyle: TextStyle): EditableStyleBuilder = apply {
            this.textStyle = textStyle
        }

        @Composable
        override fun colors(builder: @Composable EditableColorsBuilder.() -> Unit):
            EditableStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable EditableDimensionsBuilder.() -> Unit):
            EditableStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): EditableStyle = DefaultEditableStyle(
            textStyle = textStyle ?: TextStyle.Default,
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
        )
    }
}

/**
 * Цвета компонента
 */
@Immutable
interface EditableColors {
    /**
     * Цвет
     */
    val textColor: InteractiveColor

    /**
     * Цвет
     */
    val iconColor: InteractiveColor

    /**
     * Цвет
     */
    val cursorColor: InteractiveColor

    companion object {
        /**
         * Возвращает экземпляр [EditableColorsBuilder]
         */
        fun builder(): EditableColorsBuilder = DefaultEditableColors.Builder()
    }
}

/**
 * Билдер для [EditableColors]
 */
interface EditableColorsBuilder {
    /**
     * Устанавливает цвет [textColor]
     */
    fun textColor(textColor: InteractiveColor): EditableColorsBuilder

    /**
     * Устанавливает цвет [textColor]
     */
    fun textColor(textColor: Color): EditableColorsBuilder =
        textColor(textColor.asInteractive())

    /**
     * Устанавливает цвет [iconColor]
     */
    fun iconColor(iconColor: InteractiveColor): EditableColorsBuilder

    /**
     * Устанавливает цвет [iconColor]
     */
    fun iconColor(iconColor: Color): EditableColorsBuilder =
        iconColor(iconColor.asInteractive())

    /**
     * Устанавливает цвет [cursorColor]
     */
    fun cursorColor(cursorColor: InteractiveColor): EditableColorsBuilder

    /**
     * Устанавливает цвет [cursorColor]
     */
    fun cursorColor(cursorColor: Color): EditableColorsBuilder =
        cursorColor(cursorColor.asInteractive())

    /**
     * Вернёт [EditableColors]
     */
    fun build(): EditableColors
}

private data class DefaultEditableColors(
    override val textColor: InteractiveColor,
    override val iconColor: InteractiveColor,
    override val cursorColor: InteractiveColor,
) : EditableColors {
    class Builder : EditableColorsBuilder {
        private var textColor: InteractiveColor? = null
        private var iconColor: InteractiveColor? = null
        private var cursorColor: InteractiveColor? = null

        override fun textColor(textColor: InteractiveColor): EditableColorsBuilder = apply {
            this.textColor = textColor
        }

        override fun iconColor(iconColor: InteractiveColor): EditableColorsBuilder = apply {
            this.iconColor = iconColor
        }

        override fun cursorColor(cursorColor: InteractiveColor) = apply {
            this.cursorColor = cursorColor
        }

        override fun build(): EditableColors = DefaultEditableColors(
            textColor = textColor ?: Color.Black.asInteractive(),
            iconColor = iconColor ?: Color.DarkGray.asInteractive(),
            cursorColor = cursorColor ?: Color.DarkGray.asInteractive(),
        )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface EditableDimensions {
    /**
     * Отступ
     */
    val iconMargin: Dp

    /**
     * Отступ
     */
    val iconSize: Dp

    companion object {
        /**
         * Возвращает экземпляр [EditableDimensionsBuilder]
         */
        fun builder(): EditableDimensionsBuilder = DefaultEditableDimensions.Builder()
    }
}

/**
 * Билдер для [EditableDimensions]
 */
interface EditableDimensionsBuilder {
    /**
     * Устанавливает [iconMargin]
     */
    fun iconMargin(iconMargin: Dp): EditableDimensionsBuilder

    /**
     * Устанавливает [iconSize]
     */
    fun iconSize(iconSize: Dp): EditableDimensionsBuilder

    /**
     * Вернёт [EditableDimensions]
     */
    fun build(): EditableDimensions
}

private data class DefaultEditableDimensions(
    override val iconMargin: Dp,
    override val iconSize: Dp,
) : EditableDimensions {
    class Builder : EditableDimensionsBuilder {
        private var iconMargin: Dp? = null

        private var iconSize: Dp? = null

        override fun iconMargin(iconMargin: Dp): EditableDimensionsBuilder = apply {
            this.iconMargin = iconMargin
        }

        override fun iconSize(iconSize: Dp): EditableDimensionsBuilder = apply {
            this.iconSize = iconSize
        }

        override fun build(): EditableDimensions = DefaultEditableDimensions(
            iconMargin = iconMargin ?: 8.dp,
            iconSize = iconSize ?: 16.dp,
        )
    }
}
