package com.sdds.compose.uikit

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
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
     * Размеры и отступы
     */
    val dimensions: SwitchDimensions

    /**
     * Цвета
     */
    val colors: SwitchColors

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
    val animationDurationMillis: Int

    companion object {

        /**
         * Возвращает экземпляр [SwitchStyleBuilder]
         */
        fun builder(): SwitchStyleBuilder = DefaultSwitchStyle.Builder()
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
    fun dimensions(dimensions: SwitchDimensions): SwitchStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see SwitchStyle.colors
     * @see [SwitchColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable SwitchColorsBuilder.() -> Unit): SwitchStyleBuilder

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
    fun animationDuration(durationMillis: Int): SwitchStyleBuilder
}

/**
 * Цветовая схема компонента [Switch]
 */
@Stable
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
data class SwitchDimensions(
    val toggleWidth: Dp = 44.dp,
    val toggleHeight: Dp = 28.dp,
    val thumbDiameter: Dp = 24.dp,
    val trackCornerRadius: Dp = 14.dp,
    val togglePadding: Dp = 2.dp,
    val verticalSpacing: Dp = 2.dp,
    val horizontalSpacing: Dp = 12.dp,
)

@Immutable
private class DefaultSwitchStyle(
    override val colors: SwitchColors,
    override val dimensions: SwitchDimensions,
    override val labelStyle: TextStyle,
    override val descriptionStyle: TextStyle,
    override val animationDurationMillis: Int,
) : SwitchStyle {

    class Builder : SwitchStyleBuilder {

        private var colorsBuilder: SwitchColorsBuilder = SwitchColors.builder()
        private var dimensions: SwitchDimensions? = null
        private var labelStyle: TextStyle? = null
        private var descriptionStyle: TextStyle? = null
        private var animationDurationMillis: Int? = null

        override fun dimensions(dimensions: SwitchDimensions) = apply {
            this.dimensions = dimensions
        }

        @Composable
        override fun colors(
            builder:
            @Composable()
            (SwitchColorsBuilder.() -> Unit),
        ): SwitchStyleBuilder = apply {
            this.colorsBuilder.builder()
        }

        override fun labelStyle(labelStyle: TextStyle) = apply {
            this.labelStyle = labelStyle
        }

        override fun descriptionStyle(descriptionStyle: TextStyle) = apply {
            this.descriptionStyle = descriptionStyle
        }

        override fun animationDuration(durationMillis: Int) = apply {
            animationDurationMillis = durationMillis
        }

        override fun style(): SwitchStyle {
            return DefaultSwitchStyle(
                colors = colorsBuilder.build(),
                dimensions = dimensions ?: SwitchDimensions(),
                labelStyle = labelStyle ?: TextStyle.Default,
                descriptionStyle = descriptionStyle ?: TextStyle.Default,
                animationDurationMillis = animationDurationMillis ?: DEFAULT_ANIMATION_DURATION,
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
    override fun trackColor(enabled: Boolean, active: Boolean, interactionSource: InteractionSource): State<Color> {
        return animateColorAsState(
            if (active) {
                activeTrackColor
            } else {
                inactiveTrackColor
            },
            label = "trackColor",
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
