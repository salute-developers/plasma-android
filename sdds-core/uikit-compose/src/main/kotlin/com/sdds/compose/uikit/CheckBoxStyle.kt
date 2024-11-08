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
 * CompositionLocal c [CheckBoxStyle] для компонента [CheckBox]
 */
val LocalCheckBoxStyle = compositionLocalOf { CheckBoxStyle.builder().style() }

/**
 * Стиль компонента [CheckBox]
 * @author Малышев Александр on 24.10.2024
 */
@Stable
interface CheckBoxStyle : Style {

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
    val colors: CheckBoxColors

    /**
     * Размеры и отступы контента
     * @see CheckBoxDimensions
     */
    val dimensions: CheckBoxDimensions

    /**
     * Длительность анимации переключения контрола
     */
    val animationDuration: Int

    companion object {

        /**
         * Возвращает экземпляр [CheckBoxStyleBuilder]
         */
        fun builder(): CheckBoxStyleBuilder = DefaultCheckBoxStyle.Builder()
    }
}

/**
 * Builder стиля [CheckBox].
 */
@Stable
interface CheckBoxStyleBuilder : StyleBuilder<CheckBoxStyle> {

    /**
     * Устанавливает стиль основного текста [labelStyle]
     * @see CheckBoxStyle.labelStyle
     */
    fun labelStyle(labelStyle: TextStyle): CheckBoxStyleBuilder

    /**
     * Устанавливает стиль дополнительного текста [descriptionStyle]
     * @see CheckBoxStyle.descriptionStyle
     */
    fun descriptionStyle(descriptionStyle: TextStyle): CheckBoxStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see CheckBoxStyle.colors
     * @see [CheckBoxColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable CheckBoxColorsBuilder.() -> Unit): CheckBoxStyleBuilder

    /**
     * Устанавливает размеры и отступы контента [dimensions]
     * @see CheckBoxStyle.dimensions
     * @see CheckBoxDimensions
     */
    fun dimensions(dimensions: CheckBoxDimensions): CheckBoxStyleBuilder

    /**
     * Устанавливает длительность анимации переключения контрола [animationDuration]
     * @see CheckBoxStyle.animationDuration
     */
    fun animationDuration(animationDuration: Int): CheckBoxStyleBuilder
}

/**
 * Цвета компонента [CheckBox]
 */
@Stable
interface CheckBoxColors {

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
         * Возвращает экземпляр [CheckBoxColorsBuilder]
         */
        fun builder(): CheckBoxColorsBuilder = DefaultCheckBoxColors.Builder()
    }
}

/**
 * Builder для [CheckBoxColors].
 */
@Stable
interface CheckBoxColorsBuilder {

    /**
     * Устанавливает цвет основного текста [labelColor]
     * @see CheckBoxColors.labelColor
     */
    fun labelColor(labelColor: Color): CheckBoxColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста [descriptionColor]
     * @see CheckBoxColors.descriptionColor
     */
    fun descriptionColor(descriptionColor: Color): CheckBoxColorsBuilder

    /**
     * Устанавливает цвет бордера контрола [idleColor], когда checked = false и focused = false
     * @see CheckBoxColors.idleColor
     */
    fun idleColor(idleColor: Color): CheckBoxColorsBuilder

    /**
     * Устанавливает цвет заполняющего прямоугольника контрола [checkedColor], когда checked = true
     * @see CheckBoxColors.checkedColor
     */
    fun checkedColor(checkedColor: Color): CheckBoxColorsBuilder

    /**
     * Устанавливает цвет бордера контрола [focusedColor], когда focused = true
     * @see CheckBoxColors.focusedColor
     */
    fun focusedColor(focusedColor: Color): CheckBoxColorsBuilder

    /**
     * Устанавливает цвет отметки-индикатора контрола [baseColor], когда checked = true
     * @see CheckBoxColors.baseColor
     */
    fun baseColor(baseColor: Color): CheckBoxColorsBuilder

    /**
     * Возвращает экземпляр [CheckBoxColors]
     */
    fun build(): CheckBoxColors
}

/**
 * Размеры и отступы [CheckBox]
 * @property controlSize размер заполняющего круга контрола
 * @property controlRadius радиус скруглений контрола
 * @property verticalSpacing расстояние между названием и описанием
 * @property horizontalSpacing расстояние между контролом и текстом ([label] или [description])
 * @property strokeWidth ширина линий
 * @property checkedStrokeWidth ширина линий границ в состоянии checked
 * @property innerCheckBoxPadding внутренний отступ между фокусной границей и контролом
 */
@Immutable
data class CheckBoxDimensions(
    val controlSize: Dp = 24.dp,
    val controlRadius: Dp = 6.dp,
    val verticalSpacing: Dp = 2.dp,
    val horizontalSpacing: Dp = 10.dp,
    val strokeWidth: Dp = 2.dp,
    val checkedStrokeWidth: Dp = 1.dp,
    val innerCheckBoxPadding: Dp = 2.dp,
)

@Immutable
private class DefaultCheckBoxStyle(
    override val labelStyle: TextStyle,
    override val descriptionStyle: TextStyle,
    override val colors: CheckBoxColors,
    override val dimensions: CheckBoxDimensions,
    override val animationDuration: Int,
) : CheckBoxStyle {

    class Builder : CheckBoxStyleBuilder {
        private var labelStyle: TextStyle? = null
        private var descriptionStyle: TextStyle? = null
        private var colorsBuilder: CheckBoxColorsBuilder = CheckBoxColors.builder()
        private var dimensions: CheckBoxDimensions? = null
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
            (CheckBoxColorsBuilder.() -> Unit),
        ) = apply {
            this.colorsBuilder.builder()
        }

        override fun dimensions(dimensions: CheckBoxDimensions) = apply {
            this.dimensions = dimensions
        }

        override fun animationDuration(animationDuration: Int) = apply {
            this.animationDuration = animationDuration
        }

        override fun style(): CheckBoxStyle {
            return DefaultCheckBoxStyle(
                labelStyle = labelStyle ?: TextStyle.Default,
                descriptionStyle = descriptionStyle ?: TextStyle.Default,
                colors = colorsBuilder.build(),
                dimensions = dimensions ?: CheckBoxDimensions(),
                animationDuration = animationDuration ?: DEFAULT_ANIMATION_DURATION,
            )
        }
    }
}

@Immutable
private class DefaultCheckBoxColors(
    override val labelColor: Color,
    override val descriptionColor: Color,
    override val idleColor: Color,
    override val checkedColor: Color,
    override val focusedColor: Color,
    override val baseColor: Color,
) : CheckBoxColors {

    @Composable
    override fun controlBorderColor(checked: Boolean, focused: Boolean): State<Color> {
        val color = when {
            checked || focused -> focusedColor
            else -> idleColor
        }
        return rememberUpdatedState(color)
    }

    class Builder : CheckBoxColorsBuilder {
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

        override fun build(): CheckBoxColors {
            return DefaultCheckBoxColors(
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
