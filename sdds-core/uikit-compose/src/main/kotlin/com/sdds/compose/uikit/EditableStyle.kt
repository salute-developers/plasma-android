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
     * Значения прозрачности в неактивном состоянии
     */
    val disableAlpha: Float

    /**
     * Стиль текста
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
     * Устанавливает значение прозрачности в неактивном состоянии
     */
    fun disableAlpha(disableAlpha: Float): EditableStyleBuilder

    /**
     * Устанавливает стиль текста
     */
    fun textStyle(textStyle: TextStyle): EditableStyleBuilder

    /**
     * Устанавливает цвета с помощью [builder]
     */
    @Composable
    fun colors(builder: @Composable EditableColorsBuilder.() -> Unit): EditableStyleBuilder

    /**
     * Устанавливает размеры и отступы с помощью [builder]
     */
    @Composable
    fun dimensions(builder: @Composable EditableDimensionsBuilder.() -> Unit): EditableStyleBuilder
}

private data class DefaultEditableStyle(
    override val textStyle: TextStyle,
    override val colors: EditableColors,
    override val dimensions: EditableDimensions,
    override val disableAlpha: Float,
) : EditableStyle {
    class Builder : EditableStyleBuilder {
        private var disableAlpha: Float? = null
        private var textStyle: TextStyle? = null
        private val colorsBuilder: EditableColorsBuilder = EditableColors.builder()
        private val dimensionsBuilder: EditableDimensionsBuilder = EditableDimensions.builder()

        override fun disableAlpha(disableAlpha: Float) = apply {
            this.disableAlpha = disableAlpha
        }

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
            disableAlpha = disableAlpha ?: 0.4f,
        )
    }
}

/**
 * Цвета компонента
 */
@Immutable
interface EditableColors {
    /**
     * Цвет текста
     */
    val textColor: StatefulValue<Color>

    /**
     * Цвет иконки
     */
    val iconColor: StatefulValue<Color>

    /**
     * Цвет курсора
     */
    val cursorColor: StatefulValue<Color>

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
    fun textColor(textColor: StatefulValue<Color>): EditableColorsBuilder

    /**
     * Устанавливает цвет [textColor]
     */
    fun textColor(textColor: Color): EditableColorsBuilder =
        textColor(textColor.asStatefulValue())

    /**
     * Устанавливает цвет [iconColor]
     */
    fun iconColor(iconColor: StatefulValue<Color>): EditableColorsBuilder

    /**
     * Устанавливает цвет [iconColor]
     */
    fun iconColor(iconColor: Color): EditableColorsBuilder =
        iconColor(iconColor.asStatefulValue())

    /**
     * Устанавливает цвет [cursorColor]
     */
    fun cursorColor(cursorColor: StatefulValue<Color>): EditableColorsBuilder

    /**
     * Устанавливает цвет [cursorColor]
     */
    fun cursorColor(cursorColor: Color): EditableColorsBuilder =
        cursorColor(cursorColor.asStatefulValue())

    /**
     * Вернёт [EditableColors]
     */
    fun build(): EditableColors
}

private data class DefaultEditableColors(
    override val textColor: StatefulValue<Color>,
    override val iconColor: StatefulValue<Color>,
    override val cursorColor: StatefulValue<Color>,
) : EditableColors {
    class Builder : EditableColorsBuilder {
        private var textColor: StatefulValue<Color>? = null
        private var iconColor: StatefulValue<Color>? = null
        private var cursorColor: StatefulValue<Color>? = null

        override fun textColor(textColor: StatefulValue<Color>): EditableColorsBuilder = apply {
            this.textColor = textColor
        }

        override fun iconColor(iconColor: StatefulValue<Color>): EditableColorsBuilder = apply {
            this.iconColor = iconColor
        }

        override fun cursorColor(cursorColor: StatefulValue<Color>) = apply {
            this.cursorColor = cursorColor
        }

        override fun build(): EditableColors = DefaultEditableColors(
            textColor = textColor ?: Color.Black.asStatefulValue(),
            iconColor = iconColor ?: Color.DarkGray.asStatefulValue(),
            cursorColor = cursorColor ?: Color.DarkGray.asStatefulValue(),
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
