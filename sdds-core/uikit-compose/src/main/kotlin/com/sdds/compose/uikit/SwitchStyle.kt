package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal для стиля компонента [Switch]
 */
val LocalSwitchStyle = compositionLocalOf { SwitchStyle.builder().style() }

/**
 * Стиль компонента [Switch]
 */
@Stable
interface SwitchStyle : Style {

    /**
     * Форма компонента
     */
    val shape: Shape

    /**
     * Форма неподвижной части компонента
     */
    val toggleTrackShape: CornerBasedShape

    /**
     * Форма подвижной части компонента
     */
    val toggleThumbShape: CornerBasedShape

    /**
     * Размеры и отступы
     */
    @Deprecated("Use dimensionValues instead")
    val dimensions: SwitchDimensions

    /**
     * Размеры и отступы
     */
    val dimensionValues: SwitchDimensionValues

    /**
     * Цвета
     */
    @Deprecated("Use colorValues instead")
    val colors: SwitchColors

    /**
     * Цвета
     */
    val colorValues: SwitchColorValues

    /**
     * Стиль основного текста
     */
    val labelStyle: TextStyle

    /**
     * Стиль дополнительного текста
     */
    val descriptionStyle: TextStyle

    /**
     * Длительность анимации в миллисекундах
     */
    @Deprecated("Don't use")
    val animationDurationMillis: Int

    /**
     * Альфа в состоянии disabled
     */
    val disableAlpha: Float

    companion object {

        /**
         * Возвращает экземпляр [SwitchStyleBuilder]
         */
        fun builder(receiver: Any? = null): SwitchStyleBuilder = DefaultSwitchStyle.Builder()
    }
}

/**
 * Builder стиля [SwitchStyle]
 */
interface SwitchStyleBuilder : StyleBuilder<SwitchStyle> {

    /**
     * Устанавливает размеры и отступы контента [dimensions].
     * @see SwitchDimensions
     */
    @Deprecated("Use dimensionValues instead")
    fun dimensions(dimensions: SwitchDimensions): SwitchStyleBuilder

    /**
     * Устанавливает размеры и отступы контента при помощи [builder].
     * @see SwitchDimensions
     */
    @Composable
    fun dimensionValues(builder: @Composable SwitchDimensionValuesBuilder.() -> Unit): SwitchStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see SwitchStyle.colors
     * @see [SwitchColorsBuilder]
     */
    @Composable
    @Deprecated("Use colorValues instead")
    fun colors(builder: @Composable SwitchColorsBuilder.() -> Unit): SwitchStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see SwitchStyle.colors
     * @see [SwitchColorsBuilder]
     */
    @Composable
    fun colorValues(builder: @Composable SwitchColorValuesBuilder.() -> Unit): SwitchStyleBuilder

    /**
     * Устанавливает стиль основного текста [labelStyle]
     * @see SwitchStyle.labelStyle
     */
    fun labelStyle(labelStyle: TextStyle): SwitchStyleBuilder

    /**
     * Устанавливает стиль дополнительного текста [descriptionStyle]
     * @see SwitchStyle.descriptionStyle
     */
    fun descriptionStyle(descriptionStyle: TextStyle): SwitchStyleBuilder

    /**
     * Устанавливает длительность анимации переключения контрола [animationDuration]
     * @see SwitchStyle.animationDurationMillis
     */
    @Deprecated("Don't use")
    fun animationDuration(durationMillis: Int): SwitchStyleBuilder

    /**
     * Устанавливает форму неподвижной части [toggleTrackShape]
     */
    fun toggleTrackShape(toggleTrackShape: CornerBasedShape): SwitchStyleBuilder

    /**
     * Устанавливает форму подвижной части [toggleThumbShape]
     */
    fun toggleThumbShape(toggleThumbShape: CornerBasedShape): SwitchStyleBuilder

    /**
     * Устанавливает альфу [disableAlpha] в состоянии disabled
     */
    fun disableAlpha(disableAlpha: Float): SwitchStyleBuilder

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): SwitchStyleBuilder
}

/**
 * Цветовая схема компонента [Switch]
 */
@Stable
@Deprecated("Use SwitchColorValues instead")
interface SwitchColors {

    /**
     * Цвет основного текста.
     */
    val labelColor: Color

    /**
     * Цвет дополнительного текста.
     */
    val descriptionColor: Color

    /**
     * Цвет подвижного элемента переключателя (thumb).
     */
    val thumbColor: Color

    /**
     * Цвет неподвижного элемента переключателя (track) в активном состоянии.
     */
    val activeTrackColor: Color

    /**
     * Цвет неподвижного элемента переключателя (track) в выключенном состоянии.
     */
    val inactiveTrackColor: Color

    /**
     * Цвет неподвижного элемента переключателя (track) в зависимости от состояния.
     * @param enabled доступен ли переключатель
     * @param active активен ли переключатель
     * @param interactionSource [InteractionSource]
     */
    @Composable
    fun trackColor(
        enabled: Boolean,
        active: Boolean,
        interactionSource: InteractionSource,
    ): State<Color>

    companion object {

        /**
         * Создает экземпляр [SwitchColorsBuilder].
         */
        fun builder(): SwitchColorsBuilder = DefaultSwitchColors.Builder()
    }
}

/**
 * Цветовая схема компонента [Switch]
 */
@Immutable
interface SwitchColorValues {

    /**
     * Цвет основного текста.
     */
    val labelColor: InteractiveColor

    /**
     * Цвет дополнительного текста.
     */
    val descriptionColor: InteractiveColor

    /**
     * Цвет подвижного элемента переключателя (thumb).
     */
    val toggleThumbColor: InteractiveColor

    /**
     * Цвет неподвижного элемента переключателя (track).
     */
    val toggleTrackColor: InteractiveColor

    /**
     * Цвет бордера неподвижной части
     */
    val toggleTrackBorderColor: InteractiveColor

    /**
     * Цвет фона
     */
    val backgroundColor: InteractiveColor

    companion object {

        /**
         * Создает экземпляр [SwitchColorsBuilder].
         */
        fun builder(): SwitchColorValuesBuilder = DefaultSwitchColorValues.Builder()
    }
}

/**
 * Builder цветов [SwitchColorValues]
 */
interface SwitchColorValuesBuilder {
    /**
     * Устанавливает цвет надписи [labelColor]
     */
    fun labelColor(labelColor: InteractiveColor): SwitchColorValuesBuilder

    /**
     * Устанавливает цвет надписи [labelColor]
     */
    fun labelColor(labelColor: Color): SwitchColorValuesBuilder =
        labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет дополнительной надписи [descriptionColor]
     */
    fun descriptionColor(descriptionColor: InteractiveColor): SwitchColorValuesBuilder

    /**
     * Устанавливает цвет дополнительной надписи [descriptionColor]
     */
    fun descriptionColor(descriptionColor: Color): SwitchColorValuesBuilder =
        descriptionColor(descriptionColor.asInteractive())

    /**
     * Устанавливает цвет подвижной части [toggleThumbColor]
     */
    fun toggleThumbColor(toggleThumbColor: InteractiveColor): SwitchColorValuesBuilder

    /**
     * Устанавливает цвет подвижной части [toggleThumbColor]
     */
    fun toggleThumbColor(toggleThumbColor: Color): SwitchColorValuesBuilder =
        toggleThumbColor(toggleThumbColor.asInteractive())

    /**
     * Устанавливает цвет неподвижной части [toggleTrackColor]
     */
    fun toggleTrackColor(toggleTrackColor: InteractiveColor): SwitchColorValuesBuilder

    /**
     * Устанавливает цвет неподвижной части [toggleTrackColor]
     */
    fun toggleTrackColor(toggleTrackColor: Color): SwitchColorValuesBuilder =
        toggleTrackColor(toggleTrackColor.asInteractive())

    /**
     * Устанавливает цвет бордера неподвижной части [toggleTrackBorderColor]
     */
    fun toggleTrackBorderColor(toggleTrackBorderColor: InteractiveColor): SwitchColorValuesBuilder

    /**
     * Устанавливает цвет бордера неподвижной части [toggleTrackBorderColor]
     */
    fun toggleTrackBorderColor(toggleTrackBorderColor: Color): SwitchColorValuesBuilder =
        toggleTrackBorderColor(toggleTrackBorderColor.asInteractive())

    /**
     * Устанавливает цвет фона [backgroundColor]
     */
    fun backgroundColor(backgroundColor: InteractiveColor): SwitchColorValuesBuilder

    /**
     * Устанавливает цвет фона [backgroundColor]
     */
    fun backgroundColor(backgroundColor: Color): SwitchColorValuesBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Возвращает экземпляр [SwitchColorValues]
     */
    fun build(): SwitchColorValues
}

@Immutable
private class DefaultSwitchColorValues(
    override val labelColor: InteractiveColor,
    override val descriptionColor: InteractiveColor,
    override val toggleThumbColor: InteractiveColor,
    override val toggleTrackColor: InteractiveColor,
    override val toggleTrackBorderColor: InteractiveColor,
    override val backgroundColor: InteractiveColor,
) : SwitchColorValues {

    class Builder : SwitchColorValuesBuilder {
        private var labelColor: InteractiveColor? = null
        private var descriptionColor: InteractiveColor? = null
        private var toggleThumbColor: InteractiveColor? = null
        private var toggleTrackColor: InteractiveColor? = null
        private var toggleTrackBorderColor: InteractiveColor? = null
        private var backgroundColor: InteractiveColor? = null

        override fun labelColor(labelColor: InteractiveColor) = apply {
            this.labelColor = labelColor
        }

        override fun descriptionColor(descriptionColor: InteractiveColor) = apply {
            this.descriptionColor = descriptionColor
        }

        override fun toggleThumbColor(toggleThumbColor: InteractiveColor) = apply {
            this.toggleThumbColor = toggleThumbColor
        }

        override fun toggleTrackColor(toggleTrackColor: InteractiveColor) = apply {
            this.toggleTrackColor = toggleTrackColor
        }

        override fun toggleTrackBorderColor(toggleTrackBorderColor: InteractiveColor) = apply {
            this.toggleTrackBorderColor = toggleTrackBorderColor
        }

        override fun backgroundColor(backgroundColor: InteractiveColor) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun build(): SwitchColorValues {
            return DefaultSwitchColorValues(
                labelColor = labelColor ?: Color.Black.asInteractive(),
                descriptionColor = descriptionColor ?: Color.Black.asInteractive(),
                toggleThumbColor = toggleThumbColor ?: Color.White.asInteractive(),
                toggleTrackColor = toggleTrackColor ?: Color.Gray.asInteractive(
                    setOf(SwitchStates.Checked) to Color.Green,
                ),
                toggleTrackBorderColor = toggleTrackBorderColor ?: Color.Transparent.asInteractive(),
                backgroundColor = backgroundColor ?: Color.Transparent.asInteractive(),
            )
        }
    }
}

/**
 * Builder для [SwitchColors].
 */
interface SwitchColorsBuilder {

    /**
     * Устанавливает цвет основного текста [labelColor]
     * @see SwitchColors.labelColor
     */
    fun labelColor(labelColor: Color): SwitchColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста [descriptionColor]
     * @see SwitchColors.descriptionColor
     */
    fun descriptionColor(descriptionColor: Color): SwitchColorsBuilder

    /**
     * Устанавливает цвет подвижного элемента переключателя (thumb)
     * @see SwitchColors.thumbColor
     */
    fun thumbColor(thumbColor: Color): SwitchColorsBuilder

    /**
     * Устанавливает цвет неподвижного элемента переключателя (track) в активном состоянии
     * @see SwitchColors.activeTrackColor
     */
    fun activeTrackColor(activeTrackColor: Color): SwitchColorsBuilder

    /**
     * Устанавливает цвет неподвижного элемента переключателя (track) в выключенном состоянии.
     * @see SwitchColors.inactiveTrackColor
     */
    fun inactiveTrackColor(inactiveTrackColor: Color): SwitchColorsBuilder

    /**
     * Возвращает экземпляр [SwitchColors]
     */
    fun build(): SwitchColors
}

/**
 * Размеры и отступы [Switch]
 * @property toggleWidth ширина переключателя
 * @property toggleHeight высота переключателя
 * @property thumbDiameter диаметр подвижного элемента
 * @property trackCornerRadius радиус закругления
 * @property togglePadding внутренний отступ тоггла
 * @param verticalSpacing расстояние между названием и описанием
 * @param horizontalSpacing расстояние между переключателем и текстом
 */
@Immutable
@Deprecated("Use SwitchDimensionValues instead")
data class SwitchDimensions(
    val toggleWidth: Dp = 44.dp,
    val toggleHeight: Dp = 28.dp,
    val thumbDiameter: Dp = 24.dp,
    val trackCornerRadius: Dp = 14.dp,
    val togglePadding: Dp = 2.dp,
    val verticalSpacing: Dp = 2.dp,
    val horizontalSpacing: Dp = 12.dp,
)

/**
 * Размеры и отступы Switch
 */
@Immutable
interface SwitchDimensionValues {

    /**
     * Ширина неподвижной части
     */
    val toggleTrackWidth: Dp

    /**
     * Высота неподвижной части
     */
    val toggleTrackHeight: Dp

    /**
     * Ширина подвижной части
     */
    val toggleThumbWidth: Dp

    /**
     * Высота подвижной части
     */
    val toggleThumbHeight: Dp

    /**
     * Горизонтальный отступ подвижной части
     */
    val toggleThumbPadding: Dp

    /**
     * Отступ до текста
     */
    val textPadding: Dp

    /**
     * Отступ дополнительного текста
     */
    val descriptionPadding: Dp

    /**
     * Отступ сверху
     */
    val paddingTop: Dp

    /**
     * Отступ вначале
     */
    val paddingStart: Dp

    /**
     * Отступ вконце
     */
    val paddingEnd: Dp

    /**
     * Отступ снизу
     */
    val paddingBottom: Dp

    companion object {

        /**
         * Возвращает экземпляр [SwitchDimensionValuesBuilder]
         */
        fun builder(): SwitchDimensionValuesBuilder = DefaultSwitchDimensionValues.Builder()
    }
}

/**
 * Билдер размеров и отступов [SwitchDimensionValues]
 */
interface SwitchDimensionValuesBuilder {

    /**
     * Устанавливает ширину неподвижной части
     */
    fun toggleTrackWidth(toggleTrackWidth: Dp): SwitchDimensionValuesBuilder

    /**
     * Устанавливает высоту неподвижной части
     */
    fun toggleTrackHeight(toggleTrackHeight: Dp): SwitchDimensionValuesBuilder

    /**
     * Устанавливает ширину подвижной части
     */
    fun toggleThumbWidth(toggleThumbWidth: Dp): SwitchDimensionValuesBuilder

    /**
     * Устанавливает высоту подвижной части
     */
    fun toggleThumbHeight(toggleThumbHeight: Dp): SwitchDimensionValuesBuilder

    /**
     * Устанавливает горизонтальный отступ до подвижной части
     */
    fun toggleThumbPadding(toggleThumbPadding: Dp): SwitchDimensionValuesBuilder

    /**
     * Устанавливает отступ до текста
     */
    fun textPadding(textPadding: Dp): SwitchDimensionValuesBuilder

    /**
     * Устанавливает отступ дополнительного текста
     */
    fun descriptionPadding(descriptionPadding: Dp): SwitchDimensionValuesBuilder

    /**
     * Устанавливает отступ вначале
     */
    fun paddingStart(paddingStart: Dp): SwitchDimensionValuesBuilder

    /**
     * Устанавливает отступ сверху
     */
    fun paddingTop(paddingTop: Dp): SwitchDimensionValuesBuilder

    /**
     * Устанавливает отступ вконце
     */
    fun paddingEnd(paddingEnd: Dp): SwitchDimensionValuesBuilder

    /**
     * Устанавливает отступ снизу
     */
    fun paddingBottom(paddingBottom: Dp): SwitchDimensionValuesBuilder

    /**
     * Возвращает экземпляр [SwitchDimensionValues]
     */
    fun build(): SwitchDimensionValues
}

@Immutable
private class DefaultSwitchDimensionValues(
    override val toggleTrackWidth: Dp,
    override val toggleTrackHeight: Dp,
    override val toggleThumbWidth: Dp,
    override val toggleThumbPadding: Dp,
    override val toggleThumbHeight: Dp,
    override val textPadding: Dp,
    override val descriptionPadding: Dp,
    override val paddingTop: Dp,
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingBottom: Dp,
) : SwitchDimensionValues {

    class Builder : SwitchDimensionValuesBuilder {
        private var toggleTrackWidth: Dp? = null
        private var toggleTrackHeight: Dp? = null
        private var toggleThumbWidth: Dp? = null
        private var toggleThumbHeight: Dp? = null
        private var toggleThumbPadding: Dp? = null
        private var textPadding: Dp? = null
        private var descriptionPadding: Dp? = null
        private var paddingTop: Dp? = null
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var paddingBottom: Dp? = null

        override fun toggleTrackWidth(toggleTrackWidth: Dp) = apply {
            this.toggleTrackWidth = toggleTrackWidth
        }

        override fun toggleTrackHeight(toggleTrackHeight: Dp) = apply {
            this.toggleTrackHeight = toggleTrackHeight
        }

        override fun toggleThumbWidth(toggleThumbWidth: Dp) = apply {
            this.toggleThumbWidth = toggleThumbWidth
        }

        override fun toggleThumbHeight(toggleThumbHeight: Dp) = apply {
            this.toggleThumbHeight = toggleThumbHeight
        }

        override fun toggleThumbPadding(toggleThumbPadding: Dp) = apply {
            this.toggleThumbPadding = toggleThumbPadding
        }

        override fun textPadding(textPadding: Dp) = apply {
            this.textPadding = textPadding
        }

        override fun descriptionPadding(descriptionPadding: Dp) = apply {
            this.descriptionPadding = descriptionPadding
        }

        override fun paddingStart(paddingStart: Dp) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingTop(paddingTop: Dp) = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingEnd(paddingEnd: Dp) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingBottom(paddingBottom: Dp) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun build(): SwitchDimensionValues {
            return DefaultSwitchDimensionValues(
                toggleTrackWidth = toggleTrackWidth ?: 44.dp,
                toggleTrackHeight = toggleTrackHeight ?: 28.dp,
                toggleThumbWidth = toggleThumbWidth ?: 24.dp,
                toggleThumbHeight = toggleThumbHeight ?: 24.dp,
                toggleThumbPadding = toggleThumbPadding ?: 2.dp,
                textPadding = textPadding ?: 12.dp,
                descriptionPadding = descriptionPadding ?: 2.dp,
                paddingStart = this.paddingStart ?: 0.dp,
                paddingTop = this.paddingTop ?: 0.dp,
                paddingEnd = this.paddingEnd ?: 0.dp,
                paddingBottom = this.paddingBottom ?: 0.dp,
            )
        }
    }
}

@Immutable
private class DefaultSwitchStyle(
    @Deprecated("Use colorValues instead")
    override val colors: SwitchColors,
    @Deprecated("Use dimensionValues instead")
    override val dimensions: SwitchDimensions,
    override val labelStyle: TextStyle,
    override val descriptionStyle: TextStyle,
    @Deprecated("Don't use")
    override val animationDurationMillis: Int,
    override val toggleTrackShape: CornerBasedShape,
    override val toggleThumbShape: CornerBasedShape,
    override val dimensionValues: SwitchDimensionValues,
    override val colorValues: SwitchColorValues,
    override val disableAlpha: Float,
    override val shape: Shape,
) : SwitchStyle {

    class Builder : SwitchStyleBuilder {

        private val colorsBuilder: SwitchColorsBuilder = SwitchColors.builder()
        private val colorValuesBuilder = SwitchColorValues.builder()
        private var dimensions: SwitchDimensions? = null
        private val dimensionsBuilder = SwitchDimensionValues.builder()
        private var labelStyle: TextStyle? = null
        private var descriptionStyle: TextStyle? = null
        private var animationDurationMillis: Int? = null
        private var toggleTrackShape: CornerBasedShape? = null
        private var toggleThumbShape: CornerBasedShape? = null
        private var shape: Shape? = null
        private var disableAlpha: Float? = null

        @Deprecated("Use dimensionValues instead")
        override fun dimensions(dimensions: SwitchDimensions) = apply {
            this.dimensions = dimensions
        }

        @Composable
        override fun dimensionValues(builder: @Composable (SwitchDimensionValuesBuilder.() -> Unit)) = apply {
            this.dimensionsBuilder.builder()
        }

        @Deprecated("Use colorValues instead")
        @Composable
        override fun colors(
            builder: @Composable (SwitchColorsBuilder.() -> Unit),
        ): SwitchStyleBuilder = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun colorValues(builder: @Composable (SwitchColorValuesBuilder.() -> Unit)) = apply {
            this.colorValuesBuilder.builder()
        }

        override fun labelStyle(labelStyle: TextStyle) = apply {
            this.labelStyle = labelStyle
        }

        override fun descriptionStyle(descriptionStyle: TextStyle) = apply {
            this.descriptionStyle = descriptionStyle
        }

        @Deprecated("Don't use")
        override fun animationDuration(durationMillis: Int) = apply {
            animationDurationMillis = durationMillis
        }

        override fun toggleTrackShape(toggleTrackShape: CornerBasedShape) = apply {
            this.toggleTrackShape = toggleTrackShape
        }

        override fun toggleThumbShape(toggleThumbShape: CornerBasedShape) = apply {
            this.toggleThumbShape = toggleThumbShape
        }

        override fun disableAlpha(disableAlpha: Float) = apply {
            this.disableAlpha = disableAlpha
        }

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun style(): SwitchStyle {
            return DefaultSwitchStyle(
                colors = colorsBuilder.build(),
                dimensions = dimensions ?: SwitchDimensions(),
                labelStyle = labelStyle ?: TextStyle.Default,
                descriptionStyle = descriptionStyle ?: TextStyle.Default,
                animationDurationMillis = animationDurationMillis ?: DEFAULT_ANIMATION_DURATION,
                toggleTrackShape = toggleTrackShape ?: CircleShape,
                toggleThumbShape = toggleThumbShape ?: CircleShape,
                colorValues = colorValuesBuilder.build(),
                dimensionValues = dimensionsBuilder.build(),
                disableAlpha = disableAlpha ?: 0.4f,
                shape = shape ?: RectangleShape,
            )
        }
    }
}

@Immutable
private class DefaultSwitchColors(
    override val labelColor: Color,
    override val descriptionColor: Color,
    override val thumbColor: Color,
    override val activeTrackColor: Color,
    override val inactiveTrackColor: Color,
) : SwitchColors {

    @Composable
    override fun trackColor(
        enabled: Boolean,
        active: Boolean,
        interactionSource: InteractionSource,
    ): State<Color> {
        return rememberUpdatedState(
            if (active) {
                activeTrackColor
            } else {
                inactiveTrackColor
            },
        )
    }

    class Builder : SwitchColorsBuilder {
        private var labelColor: Color? = null
        private var descriptionColor: Color? = null
        private var thumbColor: Color? = null
        private var activeTrackColor: Color? = null
        private var inactiveTrackColor: Color? = null

        override fun labelColor(labelColor: Color) = apply {
            this.labelColor = labelColor
        }

        override fun descriptionColor(descriptionColor: Color) = apply {
            this.descriptionColor = descriptionColor
        }

        override fun thumbColor(thumbColor: Color) = apply {
            this.thumbColor = thumbColor
        }

        override fun activeTrackColor(activeTrackColor: Color) = apply {
            this.activeTrackColor = activeTrackColor
        }

        override fun inactiveTrackColor(inactiveTrackColor: Color) = apply {
            this.inactiveTrackColor = inactiveTrackColor
        }

        override fun build(): SwitchColors {
            return DefaultSwitchColors(
                labelColor = labelColor ?: Color.Black,
                descriptionColor = descriptionColor ?: Color.Black,
                thumbColor = thumbColor ?: Color.White,
                activeTrackColor = activeTrackColor ?: Color.Green,
                inactiveTrackColor = inactiveTrackColor ?: Color.Gray,
            )
        }
    }
}

private const val DEFAULT_ANIMATION_DURATION = 200
