package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
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
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
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
     * Форма контрола
     */
    val shape: CornerBasedShape

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
    @Deprecated("Use colorValues")
    val colors: CheckBoxColors

    /**
     * Цвета компонента
     * @see CheckBoxColorValues
     */
    val colorValues: CheckBoxColorValues

    /**
     * Размеры и отступы контента
     * @see CheckBoxDimensions
     */
    @Deprecated("Use dimensionValues")
    val dimensions: CheckBoxDimensions

    /**
     * Размеры и отступы контента
     * @see CheckBoxDimensionValues
     */
    val dimensionValues: CheckBoxDimensionValues

    /**
     * Длительность анимации переключения контрола
     */
    @Deprecated("Don't use")
    val animationDuration: Int

    /**
     * Альфа в состоянии disabled
     */
    val disableAlpha: Float

    companion object {

        /**
         * Возвращает экземпляр [CheckBoxStyleBuilder]
         */
        fun builder(receiver: Any? = null): CheckBoxStyleBuilder = DefaultCheckBoxStyle.Builder()
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
    @Deprecated("Use colors with CheckBoxColorValuesBuilder")
    @Composable
    fun colors(builder: @Composable CheckBoxColorsBuilder.() -> Unit): CheckBoxStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see CheckBoxStyle.colorValues
     * @see [CheckBoxColorValuesBuilder]
     */
    @Composable
    fun colorValues(builder: @Composable CheckBoxColorValuesBuilder.() -> Unit): CheckBoxStyleBuilder

    /**
     * Устанавливает размеры и отступы контента [dimensions]
     * @see CheckBoxStyle.dimensions
     * @see CheckBoxDimensions
     */
    @Deprecated("Use dimensions with builder")
    fun dimensions(dimensions: CheckBoxDimensions): CheckBoxStyleBuilder

    /**
     * Устанавливает размеры и отступы контента [dimensions]
     * @see CheckBoxStyle.dimensionValues
     * @see CheckBoxDimensionValues
     */
    @Composable
    fun dimensionValues(builder: @Composable CheckBoxDimensionsBuilder.() -> Unit): CheckBoxStyleBuilder

    /**
     * Устанавливает длительность анимации переключения контрола [animationDuration]
     * @see CheckBoxStyle.animationDuration
     */
    @Deprecated("Dont't use")
    fun animationDuration(animationDuration: Int): CheckBoxStyleBuilder

    /**
     * Устанавливает альфу в состоянии disabled [disableAlpha]
     * @see CheckBoxStyle.disableAlpha
     */
    fun disableAlpha(disableAlpha: Float): CheckBoxStyleBuilder

    /**
     * Устанавливает форму контрола [shape]
     * @see CheckBoxStyle.shape
     */
    fun shape(shape: CornerBasedShape): CheckBoxStyleBuilder
}

/**
 * Цвета компонента [CheckBox]
 */
@Stable
@Deprecated("Use CheckBoxColorValues")
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
@Deprecated("Use CheckBoxColorValuesBuilder")
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

/**
 * Цвета компонента [CheckBox]
 */
@Stable
interface CheckBoxColorValues {

    /**
     * Цвет основного текста
     */
    val labelColor: InteractiveColor

    /**
     * Цвет дополнительного текста
     */
    val descriptionColor: InteractiveColor

    /**
     * Цвет контрола
     */
    val toggleColor: InteractiveColor

    /**
     * Цвет центральной иконки
     */
    val toggleIconColor: InteractiveColor

    /**
     * Цвет бордера
     */
    val toggleBorderColor: InteractiveColor

    companion object {

        /**
         * Возвращает экземпляр [CheckBoxColorValuesBuilder]
         */
        fun builder(): CheckBoxColorValuesBuilder = DefaultCheckBoxColorValues.Builder()
    }
}

/**
 * Builder для [CheckBoxColors].
 */
@Stable
interface CheckBoxColorValuesBuilder {

    /**
     * Устанавливает цвет основного текста [labelColor]
     * @see CheckBoxColorValuesBuilder.labelColor
     */
    fun labelColor(labelColor: InteractiveColor): CheckBoxColorValuesBuilder

    /**
     * Устанавливает цвет основного текста [labelColor]
     * @see CheckBoxColorValuesBuilder.labelColor
     */
    fun labelColor(labelColor: Color): CheckBoxColorValuesBuilder =
        labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет дополнительного текста [descriptionColor]
     * @see CheckBoxColorValuesBuilder.descriptionColor
     */
    fun descriptionColor(descriptionColor: InteractiveColor): CheckBoxColorValuesBuilder

    /**
     * Устанавливает цвет дополнительного текста [descriptionColor]
     * @see CheckBoxColorValuesBuilder.descriptionColor
     */
    fun descriptionColor(descriptionColor: Color): CheckBoxColorValuesBuilder =
        descriptionColor(descriptionColor.asInteractive())

    /**
     * Устанавливает цвет бордера [toggleBorderColor]
     * @see CheckBoxColorValuesBuilder.toggleBorderColor
     */
    fun toggleBorderColor(toggleBorderColor: InteractiveColor): CheckBoxColorValuesBuilder

    /**
     * Устанавливает цвет бордера [toggleBorderColor]
     * @see CheckBoxColorValuesBuilder.toggleBorderColor
     */
    fun toggleBorderColor(toggleBorderColor: Color): CheckBoxColorValuesBuilder =
        toggleBorderColor(toggleBorderColor.asInteractive())

    /**
     * Устанавливает цвет бордера [toggleColor]
     * @see CheckBoxColorValuesBuilder.toggleColor
     */
    fun toggleColor(toggleColor: InteractiveColor): CheckBoxColorValuesBuilder

    /**
     * Устанавливает цвет бордера [toggleColor]
     * @see CheckBoxColorValuesBuilder.toggleColor
     */
    fun toggleColor(toggleColor: Color): CheckBoxColorValuesBuilder =
        toggleColor(toggleColor.asInteractive())

    /**
     * Устанавливает цвет иконки [toggleIconColor]
     * @see CheckBoxColorValuesBuilder.toggleIconColor
     */
    fun toggleIconColor(toggleIconColor: InteractiveColor): CheckBoxColorValuesBuilder

    /**
     * Устанавливает цвет иконки [toggleIconColor]
     * @see CheckBoxColorValuesBuilder.toggleIconColor
     */
    fun toggleIconColor(toggleIconColor: Color): CheckBoxColorValuesBuilder =
        toggleIconColor(toggleIconColor.asInteractive())

    /**
     * Возвращает экземпляр [CheckBoxColors]
     */
    fun build(): CheckBoxColorValues
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
@Deprecated("Use CheckBoxDimensionValues")
data class CheckBoxDimensions(
    val controlSize: Dp = 24.dp,
    val controlRadius: Dp = 6.dp,
    val verticalSpacing: Dp = 2.dp,
    val horizontalSpacing: Dp = 10.dp,
    val strokeWidth: Dp = 2.dp,
    val checkedStrokeWidth: Dp = 1.dp,
    val innerCheckBoxPadding: Dp = 2.dp,
)

/**
 * Размеры и отступы [CheckBox]
 */
@Immutable
interface CheckBoxDimensionValues {

    /**
     * Ширина тоггла
     */
    val toggleWidth: Dp

    /**
     * Высота тоггла
     */
    val toggleHeight: Dp

    /**
     * Отступ вокруг тоггла
     */
    val togglePadding: Dp

    /**
     * Высота иконки
     */
    val toggleIconHeight: StatefulValue<Dp>

    /**
     * Ширина иконки
     */
    val toggleIconWidth: StatefulValue<Dp>

    /**
     * Отступ текста
     */
    val textPadding: Dp

    /**
     * Отступ между лэйблом и описанием
     */
    val descriptionPadding: Dp

    /**
     * Толщина бордера
     */
    val toggleBorderWidth: StatefulValue<Dp>

    /**
     * Смещение размера бордера относительно контура тоггла
     */
    val toggleBorderOffset: StatefulValue<Dp>

    companion object {
        /**
         * Возвращает билдер [CheckBoxDimensionsBuilder]
         */
        fun builder(): CheckBoxDimensionsBuilder = DefaultCheckBoxDimensions.Builder()
    }
}

/**
 * Размеры и отступы [CheckBox]
 */
interface CheckBoxDimensionsBuilder {

    /**
     * Устанавливает ширину тоггла
     */
    fun toggleWidth(toggleWidth: Dp): CheckBoxDimensionsBuilder

    /**
     * Устанавливает высоту тоггла
     */
    fun toggleHeight(toggleHeight: Dp): CheckBoxDimensionsBuilder

    /**
     * Устанавливает отступ вокруг тоггла
     */
    fun togglePadding(togglePadding: Dp): CheckBoxDimensionsBuilder

    /**
     * Устанавливает высоту иконки
     */
    fun toggleIconHeight(toggleIconHeight: Dp): CheckBoxDimensionsBuilder =
        toggleIconHeight(toggleIconHeight.asStatefulValue())

    /**
     * Устанавливает ширину иконки
     */
    fun toggleIconWidth(toggleIconWidth: Dp): CheckBoxDimensionsBuilder =
        toggleIconWidth(toggleIconWidth.asStatefulValue())

    /**
     * Устанавливает высоту иконки
     */
    fun toggleIconHeight(toggleIconHeight: StatefulValue<Dp>): CheckBoxDimensionsBuilder

    /**
     * Устанавливает ширину иконки
     */
    fun toggleIconWidth(toggleIconWidth: StatefulValue<Dp>): CheckBoxDimensionsBuilder

    /**
     * Устанавливает толщину бордера
     */
    fun toggleBorderWidth(toggleBorderWidth: Dp): CheckBoxDimensionsBuilder =
        toggleBorderWidth(toggleBorderWidth.asStatefulValue())

    /**
     * Устанавливает толщину бордера
     */
    fun toggleBorderWidth(toggleBorderWidth: StatefulValue<Dp>): CheckBoxDimensionsBuilder

    /**
     * Устанавливает смещение размера бордера относительно контура тоггла
     */
    fun toggleBorderOffset(toggleBorderOffset: Dp): CheckBoxDimensionsBuilder =
        toggleBorderOffset(toggleBorderOffset.asStatefulValue())

    /**
     * Устанавливает смещение размера бордера относительно контура тоггла
     */
    fun toggleBorderOffset(toggleBorderOffset: StatefulValue<Dp>): CheckBoxDimensionsBuilder

    /**
     * Устанавливает отступ текста
     */
    fun textPadding(textPadding: Dp): CheckBoxDimensionsBuilder

    /**
     * Устанавливает отступ между лэйблом и описанием
     */
    fun descriptionPadding(descriptionPadding: Dp): CheckBoxDimensionsBuilder

    /**
     * Возвращает экземпляр [CheckBoxDimensions]
     */
    fun build(): CheckBoxDimensionValues
}

@Immutable
private class DefaultCheckBoxDimensions(
    override val toggleWidth: Dp,
    override val toggleHeight: Dp,
    override val togglePadding: Dp,
    override val toggleIconHeight: StatefulValue<Dp>,
    override val toggleIconWidth: StatefulValue<Dp>,
    override val toggleBorderWidth: StatefulValue<Dp>,
    override val toggleBorderOffset: StatefulValue<Dp>,
    override val textPadding: Dp,
    override val descriptionPadding: Dp,
) : CheckBoxDimensionValues {

    class Builder : CheckBoxDimensionsBuilder {
        private var toggleWidth: Dp? = null
        private var toggleHeight: Dp? = null
        private var togglePadding: Dp? = null
        private var toggleIconHeight: StatefulValue<Dp>? = null
        private var toggleIconWidth: StatefulValue<Dp>? = null
        private var toggleBorderWidth: StatefulValue<Dp>? = null
        private var toggleBorderOffset: StatefulValue<Dp>? = null
        private var textPadding: Dp? = null
        private var descriptionPadding: Dp? = null

        override fun toggleWidth(toggleWidth: Dp) = apply {
            this.toggleWidth = toggleWidth
        }

        override fun toggleHeight(toggleHeight: Dp) = apply {
            this.toggleHeight = toggleHeight
        }

        override fun togglePadding(togglePadding: Dp) = apply {
            this.togglePadding = togglePadding
        }

        override fun toggleIconHeight(toggleIconHeight: StatefulValue<Dp>) = apply {
            this.toggleIconHeight = toggleIconHeight
        }

        override fun toggleIconWidth(toggleIconWidth: StatefulValue<Dp>) = apply {
            this.toggleIconWidth = toggleIconWidth
        }

        override fun toggleBorderWidth(toggleBorderWidth: StatefulValue<Dp>) = apply {
            this.toggleBorderWidth = toggleBorderWidth
        }

        override fun toggleBorderOffset(toggleBorderOffset: StatefulValue<Dp>) = apply {
            this.toggleBorderOffset = toggleBorderOffset
        }

        override fun textPadding(textPadding: Dp) = apply {
            this.textPadding = textPadding
        }

        override fun descriptionPadding(descriptionPadding: Dp) = apply {
            this.descriptionPadding = descriptionPadding
        }

        override fun build(): CheckBoxDimensionValues {
            return DefaultCheckBoxDimensions(
                toggleWidth = toggleWidth ?: 22.dp,
                toggleHeight = toggleHeight ?: 22.dp,
                togglePadding = togglePadding ?: 1.dp,
                toggleIconHeight = toggleIconHeight ?: 10.dp.asStatefulValue(),
                toggleIconWidth = toggleIconWidth ?: 10.dp.asStatefulValue(),
                toggleBorderWidth = toggleBorderWidth ?: 2.dp.asStatefulValue(
                    setOf(InteractiveState.Focused, CheckBoxStates.Checked) to 1.dp,
                    setOf(InteractiveState.Focused) to 2.dp,
                ),
                toggleBorderOffset = toggleBorderOffset ?: 0.dp.asStatefulValue(
                    setOf(InteractiveState.Focused, CheckBoxStates.Checked) to 3.dp,
                    setOf(InteractiveState.Focused) to 3.dp,
                ),
                textPadding = textPadding ?: 12.dp,
                descriptionPadding = descriptionPadding ?: 2.dp,
            )
        }
    }
}

@Immutable
private class DefaultCheckBoxStyle(
    override val labelStyle: TextStyle,
    override val descriptionStyle: TextStyle,
    @Deprecated("Use colorValues")
    override val colors: CheckBoxColors,
    override val colorValues: CheckBoxColorValues,
    @Deprecated("Use dimensionValues")
    override val dimensions: CheckBoxDimensions,
    override val dimensionValues: CheckBoxDimensionValues,
    override val shape: CornerBasedShape,
    override val disableAlpha: Float,
    @Deprecated("Don't use")
    override val animationDuration: Int,
) : CheckBoxStyle {

    class Builder : CheckBoxStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var labelStyle: TextStyle? = null
        private var descriptionStyle: TextStyle? = null
        private var colorsBuilder: CheckBoxColorsBuilder = CheckBoxColors.builder()
        private var colorValuesBuilder: CheckBoxColorValuesBuilder = CheckBoxColorValues.builder()
        private var dimensions: CheckBoxDimensions? = null
        private var dimensionValuesBuilder: CheckBoxDimensionsBuilder =
            CheckBoxDimensionValues.builder()
        private var disableAlpha: Float? = null
        private var animationDuration: Int? = null

        private var oldColorsBuilderUsed = false

        private fun mapColors(): CheckBoxColorValues {
            return if (!oldColorsBuilderUsed) {
                colorValuesBuilder.build()
            } else {
                val colors = colorsBuilder.build()
                colorValuesBuilder.apply {
                    labelColor(colors.labelColor)
                    descriptionColor(colors.descriptionColor)
                    toggleBorderColor(
                        colors.idleColor.asInteractive(
                            setOf(InteractiveState.Focused) to colors.focusedColor,
                            setOf(
                                InteractiveState.Focused,
                                CheckBoxStates.Checked,
                            ) to colors.focusedColor,
                            setOf(CheckBoxStates.Checked) to Color.Transparent,
                        ),
                    )
                    toggleColor(
                        Color.Transparent.asInteractive(
                            setOf(CheckBoxStates.Checked) to colors.checkedColor,
                            setOf(
                                InteractiveState.Focused,
                                CheckBoxStates.Checked,
                            ) to colors.checkedColor,
                        ),
                    )
                    toggleIconColor(colors.baseColor)
                }.build()
            }
        }

        override fun labelStyle(labelStyle: TextStyle) = apply {
            this.labelStyle = labelStyle
        }

        override fun descriptionStyle(descriptionStyle: TextStyle) = apply {
            this.descriptionStyle = descriptionStyle
        }

        @Deprecated("Use colors with CheckBoxColorValuesBuilder")
        @Composable
        override fun colors(builder: @Composable (CheckBoxColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
            oldColorsBuilderUsed = true
        }

        @Composable
        override fun colorValues(builder: @Composable (CheckBoxColorValuesBuilder.() -> Unit)) = apply {
            this.colorValuesBuilder.builder()
        }

        @Deprecated("Use dimensions with builder")
        override fun dimensions(dimensions: CheckBoxDimensions) = apply {
            this.dimensions = dimensions
            this.dimensionValuesBuilder.apply {
                toggleWidth(dimensions.controlSize)
                toggleHeight(dimensions.controlSize)
                togglePadding(1.dp)
                toggleIconHeight(10.dp)
                toggleIconWidth(10.dp)
                textPadding(dimensions.horizontalSpacing)
                descriptionPadding(dimensions.verticalSpacing)
                toggleBorderWidth(dimensions.strokeWidth)
                toggleBorderOffset(dimensions.innerCheckBoxPadding + dimensions.checkedStrokeWidth)
            }
        }

        @Composable
        override fun dimensionValues(builder: @Composable (CheckBoxDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionValuesBuilder.builder()
            }

        @Deprecated("Dont't use")
        override fun animationDuration(animationDuration: Int) = apply {
            this.animationDuration = animationDuration
        }

        override fun disableAlpha(disableAlpha: Float) = apply {
            this.disableAlpha = disableAlpha
        }

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun style(): CheckBoxStyle {
            return DefaultCheckBoxStyle(
                shape = shape ?: CircleShape,
                labelStyle = labelStyle ?: TextStyle.Default,
                descriptionStyle = descriptionStyle ?: TextStyle.Default,
                colors = colorsBuilder.build(),
                colorValues = mapColors(),
                dimensions = dimensions ?: CheckBoxDimensions(),
                dimensionValues = dimensionValuesBuilder.build(),
                animationDuration = animationDuration ?: 100,
                disableAlpha = disableAlpha ?: 0.4f,
            )
        }
    }
}

@Immutable
private class DefaultCheckBoxColorValues(
    override val labelColor: InteractiveColor,
    override val descriptionColor: InteractiveColor,
    override val toggleColor: InteractiveColor,
    override val toggleBorderColor: InteractiveColor,
    override val toggleIconColor: InteractiveColor,
) : CheckBoxColorValues {

    class Builder : CheckBoxColorValuesBuilder {
        private var labelColor: InteractiveColor? = null
        private var descriptionColor: InteractiveColor? = null
        private var toggleColor: InteractiveColor? = null
        private var toggleBorderColor: InteractiveColor? = null
        private var toggleIconColor: InteractiveColor? = null

        override fun labelColor(labelColor: InteractiveColor) = apply {
            this.labelColor = labelColor
        }

        override fun descriptionColor(descriptionColor: InteractiveColor) = apply {
            this.descriptionColor = descriptionColor
        }

        override fun toggleBorderColor(toggleBorderColor: InteractiveColor) = apply {
            this.toggleBorderColor = toggleBorderColor
        }

        override fun toggleColor(toggleColor: InteractiveColor) = apply {
            this.toggleColor = toggleColor
        }

        override fun toggleIconColor(toggleIconColor: InteractiveColor) = apply {
            this.toggleIconColor = toggleIconColor
        }

        override fun build(): CheckBoxColorValues {
            return DefaultCheckBoxColorValues(
                labelColor = labelColor ?: Color.Black.asInteractive(),
                descriptionColor = descriptionColor ?: Color.Black.asInteractive(),
                toggleColor = toggleColor ?: Color.Transparent
                    .asInteractive(
                        setOf(CheckBoxStates.Checked) to Color.Green,
                        setOf(CheckBoxStates.Indeterminate) to Color.Green,
                        setOf(InteractiveState.Focused, CheckBoxStates.Checked) to Color.Green,
                        setOf(InteractiveState.Focused, CheckBoxStates.Indeterminate) to Color.Green,
                    ),
                toggleIconColor = toggleIconColor ?: Color.White.asInteractive(),
                toggleBorderColor = toggleBorderColor ?: Color.Gray
                    .asInteractive(
                        setOf(InteractiveState.Focused) to Color.Green,
                        setOf(InteractiveState.Focused, CheckBoxStates.Checked) to Color.Green,
                        setOf(InteractiveState.Focused, CheckBoxStates.Indeterminate) to Color.Green,
                        setOf(CheckBoxStates.Checked) to Color.Green,
                        setOf(CheckBoxStates.Indeterminate) to Color.Green,
                    ),
            )
        }
    }
}
