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
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.interactions.transform
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
    @Deprecated("use textStyles", replaceWith = ReplaceWith("textStyles"))
    val textStyle: TextStyle

    /**
     * Стиль текста
     */
    val textStyles: StatefulValue<TextStyle>

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
@ApiInfo
interface EditableStyleBuilder : StyleBuilder<EditableStyle> {
    /**
     * Устанавливает значение прозрачности в неактивном состоянии
     */
    fun disableAlpha(disableAlpha: Float): EditableStyleBuilder

    /**
     * Устанавливает стиль текста
     */
    fun textStyle(textStyle: TextStyle): EditableStyleBuilder = textStyle(textStyle.asStatefulValue())

    /**
     * Устанавливает стили текста
     */
    fun textStyle(textStyle: StatefulValue<TextStyle>): EditableStyleBuilder

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
    override val colors: EditableColors,
    override val dimensions: EditableDimensions,
    override val disableAlpha: Float,
    override val textStyles: StatefulValue<TextStyle>,
) : EditableStyle {

    @Deprecated("use textStyles", replaceWith = ReplaceWith("textStyles"))
    override val textStyle: TextStyle = textStyles.getDefaultValue()

    class Builder : EditableStyleBuilder {
        private var disableAlpha: Float? = null
        private var textStyle: StatefulValue<TextStyle>? = null
        private val colorsBuilder: EditableColorsBuilder = EditableColors.builder()
        private val dimensionsBuilder: EditableDimensionsBuilder = EditableDimensions.builder()

        override fun disableAlpha(disableAlpha: Float) = apply {
            this.disableAlpha = disableAlpha
        }

        override fun textStyle(textStyle: StatefulValue<TextStyle>): EditableStyleBuilder = apply {
            this.textStyle = textStyle
        }

        @Composable
        override fun colors(builder: @Composable EditableColorsBuilder.() -> Unit):
            EditableStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable EditableDimensionsBuilder.() -> Unit):
            EditableStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): EditableStyle = DefaultEditableStyle(
            textStyles = textStyle ?: TextStyle.Default.asStatefulValue(),
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
    @Deprecated("use textBrush", replaceWith = ReplaceWith("textBrush"))
    val textColor: StatefulValue<Color>

    /**
     * Цвет текста
     */
    val textBrush: StatefulValue<Brush>

    /**
     * Цвет иконки
     */
    @Deprecated("use iconBrush", replaceWith = ReplaceWith("iconBrush"))
    val iconColor: StatefulValue<Color>

    /**
     * Цвет иконки
     */
    val iconBrush: StatefulValue<Brush>

    /**
     * Цвет курсора
     */
    @Deprecated("use cursorBrush", replaceWith = ReplaceWith("cursorBrush"))
    val cursorColor: StatefulValue<Color>

    /**
     * Цвет курсора
     */
    val cursorBrush: StatefulValue<Brush>

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
    fun textColor(textColor: StatefulValue<Color>): EditableColorsBuilder =
        textBrush(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет [textColor]
     */
    fun textColor(textColor: Color): EditableColorsBuilder =
        textBrush(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет [textColor]
     */
    fun textColor(textColor: InteractiveColor): EditableColorsBuilder =
        textBrush(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет [textColor]
     */
    fun textColor(textColor: Brush): EditableColorsBuilder =
        textBrush(textColor.asStatefulValue())

    /**
     * Устанавливает цвет [textBrush]
     */
    fun textBrush(textColor: StatefulValue<Brush>): EditableColorsBuilder

    /**
     * Устанавливает цвет [iconColor]
     */
    fun iconColor(iconColor: StatefulValue<Color>): EditableColorsBuilder =
        iconBrush(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет [iconColor]
     */
    fun iconColor(iconColor: Color): EditableColorsBuilder =
        iconBrush(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет [iconColor]
     */
    fun iconColor(iconColor: InteractiveColor): EditableColorsBuilder =
        iconBrush(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет [iconColor]
     */
    fun iconColor(iconColor: Brush): EditableColorsBuilder =
        iconBrush(iconColor.asStatefulValue())

    /**
     * Устанавливает цвет [iconBrush]
     */
    fun iconBrush(iconColor: StatefulValue<Brush>): EditableColorsBuilder

    /**
     * Устанавливает цвет [cursorColor]
     */
    fun cursorColor(cursorColor: StatefulValue<Color>): EditableColorsBuilder =
        cursorBrush(cursorColor.asStatefulBrush())

    /**
     * Устанавливает цвет [cursorColor]
     */
    fun cursorColor(cursorColor: Color): EditableColorsBuilder =
        cursorBrush(cursorColor.asStatefulBrush())

    /**
     * Устанавливает цвет [cursorColor]
     */
    fun cursorColor(cursorColor: InteractiveColor): EditableColorsBuilder =
        cursorBrush(cursorColor.asStatefulBrush())

    /**
     * Устанавливает цвет [cursorColor]
     */
    fun cursorColor(cursorColor: Brush): EditableColorsBuilder =
        cursorBrush(cursorColor.asStatefulValue())

    /**
     * Устанавливает цвет [cursorBrush]
     */
    fun cursorBrush(cursorColor: StatefulValue<Brush>): EditableColorsBuilder

    /**
     * Вернёт [EditableColors]
     */
    fun build(): EditableColors
}

private data class DefaultEditableColors(
    override val textBrush: StatefulValue<Brush>,
    override val iconBrush: StatefulValue<Brush>,
    override val cursorBrush: StatefulValue<Brush>,

) : EditableColors {
    @Deprecated("use textBrush", replaceWith = ReplaceWith("textBrush"))
    override val textColor: StatefulValue<Color> = textBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    @Deprecated("use iconBrush", replaceWith = ReplaceWith("iconBrush"))
    override val iconColor: StatefulValue<Color> = iconBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    @Deprecated("use cursorBrush", replaceWith = ReplaceWith("cursorBrush"))
    override val cursorColor: StatefulValue<Color> = cursorBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    class Builder : EditableColorsBuilder {
        private var textColor: StatefulValue<Brush>? = null
        private var iconColor: StatefulValue<Brush>? = null
        private var cursorColor: StatefulValue<Brush>? = null

        override fun textBrush(textColor: StatefulValue<Brush>): EditableColorsBuilder = apply {
            this.textColor = textColor
        }

        override fun iconBrush(iconColor: StatefulValue<Brush>): EditableColorsBuilder = apply {
            this.iconColor = iconColor
        }

        override fun cursorBrush(cursorColor: StatefulValue<Brush>) = apply {
            this.cursorColor = cursorColor
        }

        override fun build(): EditableColors = DefaultEditableColors(
            textBrush = textColor ?: Color.Black.asStatefulBrush(),
            iconBrush = iconColor ?: Color.DarkGray.asStatefulBrush(),
            cursorBrush = cursorColor ?: Color.DarkGray.asStatefulBrush(),
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
    @Deprecated("use iconMarginValues", replaceWith = ReplaceWith("iconMarginValues"))
    val iconMargin: Dp

    /**
     * Отступ
     */
    val iconMarginValues: StatefulValue<Dp>

    /**
     * Отступ
     */
    @Deprecated("use iconSizeValues", replaceWith = ReplaceWith("iconSizeValues"))
    val iconSize: Dp

    /**
     * Отступ
     */
    val iconSizeValues: StatefulValue<Dp>

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
    fun iconMargin(iconMargin: Dp): EditableDimensionsBuilder =
        iconMargin(iconMargin.asStatefulValue())

    /**
     * Устанавливает [iconMargin]
     */
    fun iconMargin(iconMargin: StatefulValue<Dp>): EditableDimensionsBuilder

    /**
     * Устанавливает [iconSize]
     */
    fun iconSize(iconSize: Dp): EditableDimensionsBuilder =
        iconSize(iconSize.asStatefulValue())

    /**
     * Устанавливает [iconSize]
     */
    fun iconSize(iconSize: StatefulValue<Dp>): EditableDimensionsBuilder

    /**
     * Вернёт [EditableDimensions]
     */
    fun build(): EditableDimensions
}

private data class DefaultEditableDimensions(
    override val iconMarginValues: StatefulValue<Dp>,
    override val iconSizeValues: StatefulValue<Dp>,
) : EditableDimensions {

    @Deprecated("use iconMarginValues", replaceWith = ReplaceWith("iconMarginValues"))
    override val iconMargin: Dp = iconMarginValues.getDefaultValue()

    @Deprecated("use iconSizeValues", replaceWith = ReplaceWith("iconSizeValues"))
    override val iconSize: Dp = iconSizeValues.getDefaultValue()
    class Builder : EditableDimensionsBuilder {
        private var iconMargin: StatefulValue<Dp>? = null

        private var iconSize: StatefulValue<Dp>? = null

        override fun iconMargin(iconMargin: StatefulValue<Dp>): EditableDimensionsBuilder = apply {
            this.iconMargin = iconMargin
        }

        override fun iconSize(iconSize: StatefulValue<Dp>): EditableDimensionsBuilder = apply {
            this.iconSize = iconSize
        }

        override fun build(): EditableDimensions = DefaultEditableDimensions(
            iconMarginValues = iconMargin ?: 8.dp.asStatefulValue(),
            iconSizeValues = iconSize ?: 16.dp.asStatefulValue(),
        )
    }
}
