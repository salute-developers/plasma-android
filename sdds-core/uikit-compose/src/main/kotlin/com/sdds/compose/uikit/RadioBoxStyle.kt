package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [RadioBoxStyle] для компонента [RadioBox]
 */
val LocalRadioBoxStyle = compositionLocalOf { RadioBoxStyle.builder().style() }

/**
 * Стиль компонента [RadioBox]
 * @author Малышев Александр on 24.10.2024
 */
@Stable
interface RadioBoxStyle : Style {

    /**
     * Стиль основного текста
     * @see TextStyle
     */
    val labelStyle: TextStyle

    /**
     * Стиль дополнительного текста
     * @see TextStyle
     */
    val descriptionStyle: TextStyle

    /**
     * Цвета компонента
     * @see ButtonColors
     */
    val colors: RadioBoxColors

    /**
     * Размеры и отступы контента
     * @see RadioBoxDimensions
     */
    val dimensions: RadioBoxDimensions

    /**
     * Длительность анимации переключения контрола
     */
    val animationDuration: Int

    companion object {

        /**
         * Возвращает экземпляр [RadioBoxStyleBuilder]
         */
        fun builder(): RadioBoxStyleBuilder = DefaultRadioBoxStyle.Builder()
    }
}

/**
 * Builder стиля [RadioBox].
 */
@Stable
interface RadioBoxStyleBuilder : StyleBuilder<RadioBoxStyle> {

    /**
     * Устанавливает стиль основного текста [labelStyle]
     * @see RadioBoxStyle.labelStyle
     */
    fun labelStyle(labelStyle: TextStyle): RadioBoxStyleBuilder

    /**
     * Устанавливает стиль дополнительного текста [descriptionStyle]
     * @see RadioBoxStyle.descriptionStyle
     */
    fun descriptionStyle(descriptionStyle: TextStyle): RadioBoxStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see RadioBoxStyle.colors
     * @see [RadioBoxColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable RadioBoxColorsBuilder.() -> Unit): RadioBoxStyleBuilder

    /**
     * Устанавливает размеры и отступы контента [dimensions]
     * @see RadioBoxStyle.dimensions
     * @see RadioBoxDimensions
     */
    fun dimensions(dimensions: RadioBoxDimensions): RadioBoxStyleBuilder

    /**
     * Устанавливает длительность анимации переключения контрола [animationDuration]
     * @see RadioBoxStyle.animationDuration
     */
    fun animationDuration(animationDuration: Int): RadioBoxStyleBuilder
}

/**
 * Цвета компонента [RadioBox]
 */
@Stable
interface RadioBoxColors {

    /**
     * Цвет основного текста
     */
    val labelColor: Color

    /**
     * Цвет дополнительного текста
     */
    val descriptionColor: Color

    /**
     * Цвет бордера контрола, когда checked = false и focused = false
     */
    val idleColor: Color

    /**
     * Цвет заполняющего прямоугольника контрола, когда checked = true
     */
    val checkedColor: Color

    /**
     * Цвет бордера контрола, когда focused = true
     */
    val focusedColor: Color

    /**
     * Цвет отметки-индикатора контрола, когда checked = true
     */
    val baseColor: Color

    /**
     * Цвет бордера контрола в зависимости от состояния
     */
    @Composable
    fun controlBorderColor(checked: Boolean, focused: Boolean): State<Color>

    companion object {

        /**
         * Возвращает экземпляр [RadioBoxColorsBuilder]
         */
        fun builder(): RadioBoxColorsBuilder = DefaultRadioBoxColors.Builder()
    }
}

/**
 * Builder для [RadioBoxColors].
 */
@Stable
interface RadioBoxColorsBuilder {

    /**
     * Устанавливает цвет основного текста [labelColor]
     * @see RadioBoxColors.labelColor
     */
    fun labelColor(labelColor: Color): RadioBoxColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста [descriptionColor]
     * @see RadioBoxColors.descriptionColor
     */
    fun descriptionColor(descriptionColor: Color): RadioBoxColorsBuilder

    /**
     * Устанавливает цвет бордера контрола [idleColor], когда checked = false и focused = false
     * @see RadioBoxColors.idleColor
     */
    fun idleColor(idleColor: Color): RadioBoxColorsBuilder

    /**
     * Устанавливает цвет заполняющего прямоугольника контрола [checkedColor], когда checked = true
     * @see RadioBoxColors.checkedColor
     */
    fun checkedColor(checkedColor: Color): RadioBoxColorsBuilder

    /**
     * Устанавливает цвет бордера контрола [focusedColor], когда focused = true
     * @see RadioBoxColors.focusedColor
     */
    fun focusedColor(focusedColor: Color): RadioBoxColorsBuilder

    /**
     * Устанавливает цвет отметки-индикатора контрола [baseColor], когда checked = true
     * @see RadioBoxColors.baseColor
     */
    fun baseColor(baseColor: Color): RadioBoxColorsBuilder

    /**
     * Возвращает экземпляр [RadioBoxColors]
     */
    fun build(): RadioBoxColors
}

/**
 * Размеры и отступы [RadioBox]
 * @property controlSize размер заполняющего круга контрола
 * @property innerDiameter размер базового круга контрола
 * @property verticalSpacing расстояние между названием и описанием
 * @property horizontalSpacing расстояние между контролом и текстом
 * @property strokeWidth ширина линии в состоянии checked = false
 * @property checkedStrokeWidth ширина линии в состоянии checked = true
 * @property checkedPadding отступ в состоянии checked = true
 */
@Immutable
data class RadioBoxDimensions(
    val controlSize: Dp = 24.dp,
    val innerDiameter: Dp = 10.dp,
    val verticalSpacing: Dp = 2.dp,
    val horizontalSpacing: Dp = 10.dp,
    val strokeWidth: Dp = 2.dp,
    val checkedStrokeWidth: Dp = 1.dp,
    val checkedPadding: Dp = 1.dp,
)

@Immutable
private class DefaultRadioBoxStyle(
    override val labelStyle: TextStyle,
    override val descriptionStyle: TextStyle,
    override val colors: RadioBoxColors,
    override val dimensions: RadioBoxDimensions,
    override val animationDuration: Int,
) : RadioBoxStyle {

    class Builder : RadioBoxStyleBuilder {
        private var labelStyle: TextStyle? = null
        private var descriptionStyle: TextStyle? = null
        private var colorsBuilder: RadioBoxColorsBuilder = RadioBoxColors.builder()
        private var dimensions: RadioBoxDimensions? = null
        private var animationDuration: Int? = null

        override fun labelStyle(labelStyle: TextStyle) = apply {
            this.labelStyle = labelStyle
        }

        override fun descriptionStyle(descriptionStyle: TextStyle) = apply {
            this.descriptionStyle = descriptionStyle
        }

        @Composable
        override fun colors(
            builder:
            @Composable()
            (RadioBoxColorsBuilder.() -> Unit),
        ) = apply {
            this.colorsBuilder.builder()
        }

        override fun dimensions(dimensions: RadioBoxDimensions) = apply {
            this.dimensions = dimensions
        }

        override fun animationDuration(animationDuration: Int) = apply {
            this.animationDuration = animationDuration
        }

        override fun style(): RadioBoxStyle {
            return DefaultRadioBoxStyle(
                labelStyle = labelStyle ?: TextStyle.Default,
                descriptionStyle = descriptionStyle ?: TextStyle.Default,
                colors = colorsBuilder.build(),
                dimensions = dimensions ?: RadioBoxDimensions(),
                animationDuration = animationDuration ?: DEFAULT_ANIMATION_DURATION,
            )
        }
    }
}

@Immutable
private class DefaultRadioBoxColors(
    override val labelColor: Color,
    override val descriptionColor: Color,
    override val idleColor: Color,
    override val checkedColor: Color,
    override val focusedColor: Color,
    override val baseColor: Color,
) : RadioBoxColors {

    @Composable
    override fun controlBorderColor(checked: Boolean, focused: Boolean): State<Color> {
        val color = when {
            checked || focused -> focusedColor
            else -> idleColor
        }
        return rememberUpdatedState(color)
    }

    class Builder : RadioBoxColorsBuilder {
        private var labelColor: Color? = null
        private var descriptionColor: Color? = null
        private var idleColor: Color? = null
        private var checkedColor: Color? = null
        private var focusedColor: Color? = null
        private var baseColor: Color? = null

        override fun labelColor(labelColor: Color) = apply {
            this.labelColor = labelColor
        }

        override fun descriptionColor(descriptionColor: Color) = apply {
            this.descriptionColor = descriptionColor
        }

        override fun idleColor(idleColor: Color) = apply {
            this.idleColor = idleColor
        }

        override fun checkedColor(checkedColor: Color) = apply {
            this.checkedColor = checkedColor
        }

        override fun focusedColor(focusedColor: Color) = apply {
            this.focusedColor = focusedColor
        }

        override fun baseColor(baseColor: Color) = apply {
            this.baseColor = baseColor
        }

        override fun build(): RadioBoxColors {
            return DefaultRadioBoxColors(
                labelColor = labelColor ?: Color.Black,
                descriptionColor = descriptionColor ?: Color.Black,
                idleColor = idleColor ?: Color.Black,
                checkedColor = checkedColor ?: Color.Gray,
                focusedColor = focusedColor ?: Color.Green,
                baseColor = baseColor ?: Color.Green,
            )
        }
    }
}

private const val DEFAULT_ANIMATION_DURATION = 100
