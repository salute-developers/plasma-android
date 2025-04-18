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
    val colors: RadioBoxColors

    /**
     * Цвета компонента
     * @see ButtonColors
     */
    val colorValues: RadioBoxColorValues

    /**
     * Размеры и отступы контента
     * @see RadioBoxDimensions
     */
    @Deprecated("Use dimensionValues")
    val dimensions: RadioBoxDimensions

    /**
     * Размеры и отступы контента
     * @see RadioBoxDimensionValues
     */
    val dimensionValues: RadioBoxDimensionValues

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
         * Возвращает экземпляр [RadioBoxStyleBuilder]
         */
        fun builder(receiver: Any? = null): RadioBoxStyleBuilder = DefaultRadioBoxStyle.Builder()
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
    @Deprecated("Use colors with RadioBoxColorValuesBuilder")
    @Composable
    fun colors(builder: @Composable RadioBoxColorsBuilder.() -> Unit): RadioBoxStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see RadioBoxStyle.colors
     * @see [RadioBoxColorValuesBuilder]
     */
    @Composable
    fun colorValues(builder: @Composable RadioBoxColorValuesBuilder.() -> Unit): RadioBoxStyleBuilder

    /**
     * Устанавливает размеры и отступы контента [dimensions]
     * @see RadioBoxStyle.dimensions
     * @see RadioBoxDimensions
     */
    @Deprecated("Use dimensions with builder")
    fun dimensions(dimensions: RadioBoxDimensions): RadioBoxStyleBuilder

    /**
     * Устанавливает размеры и отступы контента [dimensions]
     * @see RadioBoxStyle.dimensions
     * @see RadioBoxDimensions
     */
    @Composable
    fun dimensionValues(builder: @Composable RadioBoxDimensionsBuilder.() -> Unit): RadioBoxStyleBuilder

    /**
     * Устанавливает длительность анимации переключения контрола [animationDuration]
     * @see RadioBoxStyle.animationDuration
     */
    @Deprecated("Dont't use")
    fun animationDuration(animationDuration: Int): RadioBoxStyleBuilder

    /**
     * Устанавливает альфу в состоянии disabled [disableAlpha]
     * @see RadioBoxStyle.disableAlpha
     */
    fun disableAlpha(disableAlpha: Float): RadioBoxStyleBuilder

    /**
     * Устанавливает форму контрола [shape]
     * @see RadioBoxStyle.disableAlpha
     */
    fun shape(shape: CornerBasedShape): RadioBoxStyleBuilder
}

/**
 * Цвета компонента [RadioBox]
 */
@Stable
@Deprecated("Use RadioBoxColorValues")
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
@Deprecated("Use RadioBoxColorValuesBuilder")
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

/**
 * Цвета компонента [RadioBox]
 */
@Stable
interface RadioBoxColorValues {

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
         * Возвращает экземпляр [RadioBoxColorValuesBuilder]
         */
        fun builder(): RadioBoxColorValuesBuilder = DefaultRadioBoxColorValues.Builder()
    }
}

/**
 * Builder для [RadioBoxColors].
 */
@Stable
interface RadioBoxColorValuesBuilder {

    /**
     * Устанавливает цвет основного текста [labelColor]
     * @see RadioBoxColorValuesBuilder.labelColor
     */
    fun labelColor(labelColor: InteractiveColor): RadioBoxColorValuesBuilder

    /**
     * Устанавливает цвет основного текста [labelColor]
     * @see RadioBoxColorValuesBuilder.labelColor
     */
    fun labelColor(labelColor: Color): RadioBoxColorValuesBuilder =
        labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет дополнительного текста [descriptionColor]
     * @see RadioBoxColorValuesBuilder.descriptionColor
     */
    fun descriptionColor(descriptionColor: InteractiveColor): RadioBoxColorValuesBuilder

    /**
     * Устанавливает цвет дополнительного текста [descriptionColor]
     * @see RadioBoxColorValuesBuilder.descriptionColor
     */
    fun descriptionColor(descriptionColor: Color): RadioBoxColorValuesBuilder =
        descriptionColor(descriptionColor.asInteractive())

    /**
     * Устанавливает цвет бордера [toggleBorderColor]
     * @see RadioBoxColorValuesBuilder.toggleBorderColor
     */
    fun toggleBorderColor(toggleBorderColor: InteractiveColor): RadioBoxColorValuesBuilder

    /**
     * Устанавливает цвет бордера [toggleBorderColor]
     * @see RadioBoxColorValuesBuilder.toggleBorderColor
     */
    fun toggleBorderColor(toggleBorderColor: Color): RadioBoxColorValuesBuilder =
        toggleBorderColor(toggleBorderColor.asInteractive())

    /**
     * Устанавливает цвет бордера [toggleColor]
     * @see RadioBoxColorValuesBuilder.toggleColor
     */
    fun toggleColor(toggleColor: InteractiveColor): RadioBoxColorValuesBuilder

    /**
     * Устанавливает цвет бордера [toggleColor]
     * @see RadioBoxColorValuesBuilder.toggleColor
     */
    fun toggleColor(toggleColor: Color): RadioBoxColorValuesBuilder =
        toggleColor(toggleColor.asInteractive())

    /**
     * Устанавливает цвет иконки [toggleIconColor]
     * @see RadioBoxColorValuesBuilder.toggleIconColor
     */
    fun toggleIconColor(toggleIconColor: InteractiveColor): RadioBoxColorValuesBuilder

    /**
     * Устанавливает цвет иконки [toggleIconColor]
     * @see RadioBoxColorValuesBuilder.toggleIconColor
     */
    fun toggleIconColor(toggleIconColor: Color): RadioBoxColorValuesBuilder =
        toggleIconColor(toggleIconColor.asInteractive())

    /**
     * Возвращает экземпляр [RadioBoxColors]
     */
    fun build(): RadioBoxColorValues
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
@Deprecated("Use RadioBoxDimensionValues")
data class RadioBoxDimensions(
    val controlSize: Dp = 24.dp,
    val innerDiameter: Dp = 10.dp,
    val verticalSpacing: Dp = 2.dp,
    val horizontalSpacing: Dp = 10.dp,
    val strokeWidth: Dp = 2.dp,
    val checkedStrokeWidth: Dp = 1.dp,
    val checkedPadding: Dp = 1.dp,
)

/**
 * Размеры и отступы [RadioBox]
 */
@Immutable
interface RadioBoxDimensionValues {

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
    val toggleIconHeight: Dp

    /**
     * Ширина иконки
     */
    val toggleIconWidth: Dp

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
         * Возвращает билдер [RadioBoxDimensionsBuilder]
         */
        fun builder(): RadioBoxDimensionsBuilder = DefaultRadioBoxDimensions.Builder()
    }
}

/**
 * Размеры и отступы [RadioBox]
 */
interface RadioBoxDimensionsBuilder {

    /**
     * Устанавливает ширину тоггла
     */
    fun toggleWidth(toggleWidth: Dp): RadioBoxDimensionsBuilder

    /**
     * Устанавливает высоту тоггла
     */
    fun toggleHeight(toggleHeight: Dp): RadioBoxDimensionsBuilder

    /**
     * Устанавливает отступ вокруг тоггла
     */
    fun togglePadding(togglePadding: Dp): RadioBoxDimensionsBuilder

    /**
     * Устанавливает высоту иконки
     */
    fun toggleIconHeight(toggleIconHeight: Dp): RadioBoxDimensionsBuilder

    /**
     * Устанавливает ширину иконки
     */
    fun toggleIconWidth(toggleIconWidth: Dp): RadioBoxDimensionsBuilder

    /**
     * Устанавливает толщину бордера
     */
    fun toggleBorderWidth(toggleBorderWidth: Dp): RadioBoxDimensionsBuilder =
        toggleBorderWidth(toggleBorderWidth.asStatefulValue())

    /**
     * Устанавливает толщину бордера
     */
    fun toggleBorderWidth(toggleBorderWidth: StatefulValue<Dp>): RadioBoxDimensionsBuilder

    /**
     * Устанавливает смещение размера бордера относительно контура тоггла
     */
    fun toggleBorderOffset(toggleBorderOffset: Dp): RadioBoxDimensionsBuilder =
        toggleBorderOffset(toggleBorderOffset.asStatefulValue())

    /**
     * Устанавливает смещение размера бордера относительно контура тоггла
     */
    fun toggleBorderOffset(toggleBorderOffset: StatefulValue<Dp>): RadioBoxDimensionsBuilder

    /**
     * Устанавливает отступ текста
     */
    fun textPadding(textPadding: Dp): RadioBoxDimensionsBuilder

    /**
     * Устанавливает отступ между лэйблом и описанием
     */
    fun descriptionPadding(descriptionPadding: Dp): RadioBoxDimensionsBuilder

    /**
     * Возвращает экземпляр [RadioBoxDimensions]
     */
    fun build(): RadioBoxDimensionValues
}

@Immutable
private class DefaultRadioBoxDimensions(
    override val toggleWidth: Dp,
    override val toggleHeight: Dp,
    override val togglePadding: Dp,
    override val toggleIconHeight: Dp,
    override val toggleIconWidth: Dp,
    override val toggleBorderWidth: StatefulValue<Dp>,
    override val toggleBorderOffset: StatefulValue<Dp>,
    override val textPadding: Dp,
    override val descriptionPadding: Dp,
) : RadioBoxDimensionValues {

    class Builder : RadioBoxDimensionsBuilder {
        private var toggleWidth: Dp? = null
        private var toggleHeight: Dp? = null
        private var togglePadding: Dp? = null
        private var toggleIconHeight: Dp? = null
        private var toggleIconWidth: Dp? = null
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

        override fun toggleIconHeight(toggleIconHeight: Dp) = apply {
            this.toggleIconHeight = toggleIconHeight
        }

        override fun toggleIconWidth(toggleIconWidth: Dp) = apply {
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

        override fun build(): RadioBoxDimensionValues {
            return DefaultRadioBoxDimensions(
                toggleWidth = toggleWidth ?: 22.dp,
                toggleHeight = toggleHeight ?: 22.dp,
                togglePadding = togglePadding ?: 1.dp,
                toggleIconHeight = toggleIconHeight ?: 10.dp,
                toggleIconWidth = toggleIconWidth ?: 10.dp,
                toggleBorderWidth = toggleBorderWidth ?: 2.dp.asStatefulValue(
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to 1.dp,
                    setOf(InteractiveState.Focused) to 2.dp,
                ),
                toggleBorderOffset = toggleBorderOffset ?: 0.dp.asStatefulValue(
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to 3.dp,
                    setOf(InteractiveState.Focused) to 3.dp,
                ),
                textPadding = textPadding ?: 12.dp,
                descriptionPadding = descriptionPadding ?: 2.dp,
            )
        }
    }
}

@Immutable
private class DefaultRadioBoxStyle(
    override val labelStyle: TextStyle,
    override val descriptionStyle: TextStyle,
    @Deprecated("Use colorValues")
    override val colors: RadioBoxColors,
    override val colorValues: RadioBoxColorValues,
    @Deprecated("Use dimensionValues")
    override val dimensions: RadioBoxDimensions,
    override val dimensionValues: RadioBoxDimensionValues,
    override val shape: CornerBasedShape,
    override val disableAlpha: Float,
    @Deprecated("Don't use")
    override val animationDuration: Int,
) : RadioBoxStyle {

    class Builder : RadioBoxStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var labelStyle: TextStyle? = null
        private var descriptionStyle: TextStyle? = null
        private var colorsBuilder: RadioBoxColorsBuilder = RadioBoxColors.builder()
        private var colorValuesBuilder: RadioBoxColorValuesBuilder = RadioBoxColorValues.builder()
        private var dimensions: RadioBoxDimensions? = null
        private var dimensionValuesBuilder: RadioBoxDimensionsBuilder =
            RadioBoxDimensionValues.builder()
        private var disableAlpha: Float? = null
        private var animationDuration: Int? = null

        private var oldColorsBuilderUsed = false

        private fun mapColors(): RadioBoxColorValues {
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
                                RadioBoxStates.Checked,
                            ) to colors.focusedColor,
                            setOf(RadioBoxStates.Checked) to Color.Transparent,
                        ),
                    )
                    toggleColor(
                        Color.Transparent.asInteractive(
                            setOf(RadioBoxStates.Checked) to colors.checkedColor,
                            setOf(
                                InteractiveState.Focused,
                                RadioBoxStates.Checked,
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

        @Deprecated("Use colors with RadioBoxColorValuesBuilder")
        @Composable
        override fun colors(builder: @Composable (RadioBoxColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
            oldColorsBuilderUsed = true
        }

        @Composable
        override fun colorValues(builder: @Composable (RadioBoxColorValuesBuilder.() -> Unit)) = apply {
            this.colorValuesBuilder.builder()
        }

        @Deprecated("Use dimensions with builder")
        override fun dimensions(dimensions: RadioBoxDimensions) = apply {
            this.dimensions = dimensions
            this.dimensionValuesBuilder.apply {
                toggleWidth(dimensions.controlSize)
                toggleHeight(dimensions.controlSize)
                togglePadding(dimensions.checkedPadding)
                toggleIconHeight(dimensions.innerDiameter)
                toggleIconWidth(dimensions.innerDiameter)
                textPadding(dimensions.horizontalSpacing)
                descriptionPadding(dimensions.verticalSpacing)
                toggleBorderWidth(dimensions.strokeWidth)
                toggleBorderOffset(3.dp)
            }
        }

        @Composable
        override fun dimensionValues(builder: @Composable (RadioBoxDimensionsBuilder.() -> Unit)) =
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

        override fun style(): RadioBoxStyle {
            return DefaultRadioBoxStyle(
                shape = shape ?: CircleShape,
                labelStyle = labelStyle ?: TextStyle.Default,
                descriptionStyle = descriptionStyle ?: TextStyle.Default,
                colors = colorsBuilder.build(),
                colorValues = mapColors(),
                dimensions = dimensions ?: RadioBoxDimensions(),
                dimensionValues = dimensionValuesBuilder.build(),
                animationDuration = animationDuration ?: 100,
                disableAlpha = disableAlpha ?: 0.4f,
            )
        }
    }
}

@Immutable
private class DefaultRadioBoxColorValues(
    override val labelColor: InteractiveColor,
    override val descriptionColor: InteractiveColor,
    override val toggleColor: InteractiveColor,
    override val toggleBorderColor: InteractiveColor,
    override val toggleIconColor: InteractiveColor,
) : RadioBoxColorValues {

    class Builder : RadioBoxColorValuesBuilder {
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

        override fun build(): RadioBoxColorValues {
            return DefaultRadioBoxColorValues(
                labelColor = labelColor ?: Color.Black.asInteractive(),
                descriptionColor = descriptionColor ?: Color.Black.asInteractive(),
                toggleColor = toggleColor ?: Color.Transparent
                    .asInteractive(
                        setOf(RadioBoxStates.Checked) to Color.Green,
                        setOf(InteractiveState.Focused, RadioBoxStates.Checked) to Color.Green,
                    ),
                toggleIconColor = toggleIconColor ?: Color.White.asInteractive(),
                toggleBorderColor = toggleBorderColor ?: Color.Gray
                    .asInteractive(
                        setOf(InteractiveState.Focused) to Color.Green,
                        setOf(InteractiveState.Focused, RadioBoxStates.Checked) to Color.Green,
                        setOf(RadioBoxStates.Checked) to Color.Green,
                    ),
            )
        }
    }
}
