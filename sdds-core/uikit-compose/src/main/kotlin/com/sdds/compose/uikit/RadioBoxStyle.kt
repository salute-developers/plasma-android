package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.internal.common.asBrush
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
    @Deprecated("Use shapes", ReplaceWith("shapes"))
    val shape: CornerBasedShape

    /**
     * Формы контрола
     */
    val shapes: StatefulValue<CornerBasedShape>

    /**
     * Стиль основного текста
     * @see TextStyle
     */
    @Deprecated("Use labelStyles", ReplaceWith("labelStyles"))
    val labelStyle: TextStyle

    /**
     * Стили основного текста
     * @see TextStyle
     */
    val labelStyles: StatefulValue<TextStyle>

    /**
     * Стиль дополнительного текста
     * @see TextStyle
     */
    @Deprecated("Use descriptionStyles", ReplaceWith("descriptionStyles"))
    val descriptionStyle: TextStyle

    /**
     * Стили дополнительного текста
     * @see TextStyle
     */
    val descriptionStyles: StatefulValue<TextStyle>

    /**
     * Цвета компонента
     * @see ButtonColors
     */
    @Deprecated("Use colorValues")
    val colors: RadioBoxColors

    /**
     * Цвета компонента
     * @see RadioBoxColorValues
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

    /**
     * Форма фона
     */
    @Deprecated("Use backgroundShapes", ReplaceWith("backgroundShapes"))
    val backgroundShape: Shape

    /**
     * Формы фона
     */
    val backgroundShapes: StatefulValue<Shape>

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
@ApiInfo
interface RadioBoxStyleBuilder : StyleBuilder<RadioBoxStyle> {

    /**
     * Устанавливает стиль основного текста [labelStyle]
     * @see RadioBoxStyle.labelStyle
     */
    fun labelStyle(labelStyle: TextStyle): RadioBoxStyleBuilder =
        labelStyle(labelStyle.asStatefulValue())

    /**
     * Устанавливает стили основного текста [labelStyle]
     * @see RadioBoxStyle.labelStyle
     */
    fun labelStyle(labelStyle: StatefulValue<TextStyle>): RadioBoxStyleBuilder

    /**
     * Устанавливает стиль дополнительного текста [descriptionStyle]
     * @see RadioBoxStyle.descriptionStyle
     */
    fun descriptionStyle(descriptionStyle: TextStyle): RadioBoxStyleBuilder =
        descriptionStyle(descriptionStyle.asStatefulValue())

    /**
     * Устанавливает стили дополнительного текста [descriptionStyle]
     * @see RadioBoxStyle.descriptionStyle
     */
    fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>): RadioBoxStyleBuilder

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
     * @see RadioBoxStyle.colorValues
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
     * @see RadioBoxStyle.dimensionValues
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
     * @see RadioBoxStyle.shape
     */
    fun shape(shape: CornerBasedShape): RadioBoxStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает формы контрола [shape]
     * @see RadioBoxStyle.shape
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): RadioBoxStyleBuilder

    /**
     * Устанавливает форму фона [backgroundShape]
     * @see RadioBoxStyle.shape
     */
    fun backgroundShape(backgroundShape: Shape): RadioBoxStyleBuilder =
        backgroundShape(backgroundShape.asStatefulValue())

    /**
     * Устанавливает формы фона [backgroundShape]
     * @see RadioBoxStyle.shape
     */
    fun backgroundShape(backgroundShape: StatefulValue<Shape>): RadioBoxStyleBuilder
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
    @Deprecated("Use labelBrush", ReplaceWith("labelBrush"))
    val labelColor: InteractiveColor

    /**
     * Кисти основного текста
     */
    val labelBrush: StatefulValue<Brush>

    /**
     * Цвет дополнительного текста
     */
    @Deprecated("Use descriptionBrush", ReplaceWith("descriptionBrush"))
    val descriptionColor: InteractiveColor

    /**
     * Кисти дополнительного текста
     */
    val descriptionBrush: StatefulValue<Brush>

    /**
     * Цвет контрола
     */
    @Deprecated("Use toggleBrush", ReplaceWith("toggleBrush"))
    val toggleColor: InteractiveColor

    /**
     * Кисти контрола
     */
    val toggleBrush: StatefulValue<Brush>

    /**
     * Цвет центральной иконки
     */
    @Deprecated("Use toggleIconBrush", ReplaceWith("toggleIconBrush"))
    val toggleIconColor: InteractiveColor

    /**
     * Кисти центральной иконки
     */
    val toggleIconBrush: StatefulValue<Brush>

    /**
     * Цвет бордера
     */
    @Deprecated("Use toggleBorderBrush", ReplaceWith("toggleBorderBrush"))
    val toggleBorderColor: InteractiveColor

    /**
     * Кисти бордера
     */
    val toggleBorderBrush: StatefulValue<Brush>

    /**
     * Цвет фона
     */
    val backgroundColor: StatefulValue<Brush>

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
    fun labelColor(labelColor: InteractiveColor): RadioBoxColorValuesBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает цвет основного текста [labelColor]
     * @see RadioBoxColorValuesBuilder.labelColor
     */
    fun labelColor(labelColor: Color): RadioBoxColorValuesBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает кисть основного текста [labelColor]
     * @see RadioBoxColorValuesBuilder.labelColor
     */
    fun labelColor(labelColor: Brush): RadioBoxColorValuesBuilder =
        labelColor(labelColor.asStatefulValue())

    /**
     * Устанавливает кисти основного текста [labelColor]
     * @see RadioBoxColorValuesBuilder.labelColor
     */
    fun labelColor(labelColor: StatefulValue<Brush>): RadioBoxColorValuesBuilder

    /**
     * Устанавливает цвет дополнительного текста [descriptionColor]
     * @see RadioBoxColorValuesBuilder.descriptionColor
     */
    fun descriptionColor(descriptionColor: InteractiveColor): RadioBoxColorValuesBuilder =
        descriptionColor(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает цвет дополнительного текста [descriptionColor]
     * @see RadioBoxColorValuesBuilder.descriptionColor
     */
    fun descriptionColor(descriptionColor: Color): RadioBoxColorValuesBuilder =
        descriptionColor(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает кисть дополнительного текста [descriptionColor]
     * @see RadioBoxColorValuesBuilder.descriptionColor
     */
    fun descriptionColor(descriptionColor: Brush): RadioBoxColorValuesBuilder =
        descriptionColor(descriptionColor.asStatefulValue())

    /**
     * Устанавливает кисти дополнительного текста [descriptionColor]
     * @see RadioBoxColorValuesBuilder.descriptionColor
     */
    fun descriptionColor(descriptionColor: StatefulValue<Brush>): RadioBoxColorValuesBuilder

    /**
     * Устанавливает кисть бордера [toggleBorderColor]
     * @see RadioBoxColorValuesBuilder.toggleBorderColor
     */
    fun toggleBorderColor(toggleBorderColor: StatefulValue<Brush>): RadioBoxColorValuesBuilder

    /**
     * Устанавливает кисти бордера [toggleBorderColor]
     * @see RadioBoxColorValuesBuilder.toggleBorderColor
     */
    fun toggleBorderColor(toggleBorderColor: Brush): RadioBoxColorValuesBuilder =
        toggleBorderColor(toggleBorderColor.asStatefulValue())

    /**
     * Устанавливает цвет бордера [toggleBorderColor]
     * @see RadioBoxColorValuesBuilder.toggleBorderColor
     */
    fun toggleBorderColor(toggleBorderColor: InteractiveColor): RadioBoxColorValuesBuilder =
        toggleBorderColor(toggleBorderColor.asStatefulBrush())

    /**
     * Устанавливает цвет бордера [toggleBorderColor]
     * @see RadioBoxColorValuesBuilder.toggleBorderColor
     */
    fun toggleBorderColor(toggleBorderColor: Color): RadioBoxColorValuesBuilder =
        toggleBorderColor(toggleBorderColor.asStatefulBrush())

    /**
     * Устанавливает цвет бордера [toggleColor]
     * @see RadioBoxColorValuesBuilder.toggleColor
     */
    fun toggleColor(toggleColor: InteractiveColor): RadioBoxColorValuesBuilder =
        toggleColor(toggleColor.asStatefulBrush())

    /**
     * Устанавливает цвет бордера [toggleColor]
     * @see RadioBoxColorValuesBuilder.toggleColor
     */
    fun toggleColor(toggleColor: Color): RadioBoxColorValuesBuilder =
        toggleColor(toggleColor.asStatefulBrush())

    /**
     * Устанавливает кисть бордера [toggleColor]
     * @see RadioBoxColorValuesBuilder.toggleColor
     */
    fun toggleColor(toggleColor: Brush): RadioBoxColorValuesBuilder =
        toggleColor(toggleColor.asStatefulValue())

    /**
     * Устанавливает кисти бордера [toggleColor]
     * @see RadioBoxColorValuesBuilder.toggleColor
     */
    fun toggleColor(toggleColor: StatefulValue<Brush>): RadioBoxColorValuesBuilder

    /**
     * Устанавливает цвет иконки [toggleIconColor]
     * @see RadioBoxColorValuesBuilder.toggleIconColor
     */
    fun toggleIconColor(toggleIconColor: InteractiveColor): RadioBoxColorValuesBuilder =
        toggleIconColor(toggleIconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки [toggleIconColor]
     * @see RadioBoxColorValuesBuilder.toggleIconColor
     */
    fun toggleIconColor(toggleIconColor: Color): RadioBoxColorValuesBuilder =
        toggleIconColor(toggleIconColor.asStatefulBrush())

    /**
     * Устанавливает кисть иконки [toggleIconColor]
     * @see RadioBoxColorValuesBuilder.toggleIconColor
     */
    fun toggleIconColor(toggleIconColor: Brush): RadioBoxColorValuesBuilder =
        toggleIconColor(toggleIconColor.asStatefulValue())

    /**
     * Устанавливает кисти иконки [toggleIconColor]
     * @see RadioBoxColorValuesBuilder.toggleIconColor
     */
    fun toggleIconColor(toggleIconColor: StatefulValue<Brush>): RadioBoxColorValuesBuilder

    /**
     * Устанавливает кисти фона [backgroundColor]
     * @see RadioBoxColorValues.backgroundColor
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): RadioBoxColorValuesBuilder

    /**
     * Устанавливает цвет фона [backgroundColor]
     * @see RadioBoxColorValuesBuilder.backgroundColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): RadioBoxColorValuesBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисть фона [backgroundColor]
     * @see RadioBoxColorValuesBuilder.backgroundColor
     */
    fun backgroundColor(backgroundColor: Brush): RadioBoxColorValuesBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает цвет фона [backgroundColor]
     * @see RadioBoxColorValuesBuilder.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): RadioBoxColorValuesBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

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
    @Deprecated("Use toggleWidthValues", ReplaceWith("toggleTtoggleWidthValueshumbBrush"))
    val toggleWidth: Dp

    /**
     * Ширина тоггла
     */
    val toggleWidthValues: StatefulValue<Dp>

    /**
     * Высота тоггла
     */
    @Deprecated("Use toggleHeightValues", ReplaceWith("toggleHeightValues"))
    val toggleHeight: Dp

    /**
     * Высота тоггла
     */
    val toggleHeightValues: StatefulValue<Dp>

    /**
     * Отступ вокруг тоггла
     */
    @Deprecated("Use togglePaddingValues", ReplaceWith("togglePaddingValues"))
    val togglePadding: Dp

    /**
     * Отступ вокруг тоггла
     */
    val togglePaddingValues: StatefulValue<Dp>

    /**
     * Высота иконки
     */
    @Deprecated("Use toggleIconHeightValues", ReplaceWith("toggleIconHeightValues"))
    val toggleIconHeight: Dp

    /**
     * Высота иконки
     */
    val toggleIconHeightValues: StatefulValue<Dp>

    /**
     * Ширина иконки
     */
    @Deprecated("Use toggleIconWidthValues", ReplaceWith("toggleIconWidthValues"))
    val toggleIconWidth: Dp

    /**
     * Ширина иконки
     */
    val toggleIconWidthValues: StatefulValue<Dp>

    /**
     * Отступ текста
     */
    @Deprecated("Use textPaddingValues", ReplaceWith("textPaddingValues"))
    val textPadding: Dp

    /**
     * Отступ текста
     */
    val textPaddingValues: StatefulValue<Dp>

    /**
     * Отступ между лэйблом и описанием
     */
    @Deprecated("Use descriptionPaddingValues", ReplaceWith("descriptionPaddingValues"))
    val descriptionPadding: Dp

    /**
     * Отступ между лэйблом и описанием
     */
    val descriptionPaddingValues: StatefulValue<Dp>

    /**
     * Толщина бордера
     */
    val toggleBorderWidth: StatefulValue<Dp>

    /**
     * Смещение размера бордера относительно контура тоггла
     */
    val toggleBorderOffset: StatefulValue<Dp>

    /**
     * Отступ сверху
     */
    @Deprecated("Use paddingTopValues", ReplaceWith("paddingTopValues"))
    val paddingTop: Dp

    /**
     * Отступ сверху
     */
    val paddingTopValues: StatefulValue<Dp>

    /**
     * Отступ вначале
     */
    @Deprecated("Use paddingStartValues", ReplaceWith("paddingStartValues"))
    val paddingStart: Dp

    /**
     * Отступ вначале
     */
    val paddingStartValues: StatefulValue<Dp>

    /**
     * Отступ вконце
     */
    @Deprecated("Use paddingEndValues", ReplaceWith("paddingEndValues"))
    val paddingEnd: Dp

    /**
     * Отступ вконце
     */
    val paddingEndValues: StatefulValue<Dp>

    /**
     * Отступ снизу
     */
    @Deprecated("Use paddingBottomValues", ReplaceWith("paddingBottomValues"))
    val paddingBottom: Dp

    /**
     * Отступ снизу
     */
    val paddingBottomValues: StatefulValue<Dp>

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
    fun toggleWidth(toggleWidth: Dp): RadioBoxDimensionsBuilder =
        toggleWidth(toggleWidth.asStatefulValue())

    /**
     * Устанавливает ширину тоггла
     */
    fun toggleWidth(toggleWidth: StatefulValue<Dp>): RadioBoxDimensionsBuilder

    /**
     * Устанавливает высоту тоггла
     */
    fun toggleHeight(toggleHeight: Dp): RadioBoxDimensionsBuilder =
        toggleHeight(toggleHeight.asStatefulValue())

    /**
     * Устанавливает высоту тоггла
     */
    fun toggleHeight(toggleHeight: StatefulValue<Dp>): RadioBoxDimensionsBuilder

    /**
     * Устанавливает отступ вокруг тоггла
     */
    fun togglePadding(togglePadding: Dp): RadioBoxDimensionsBuilder =
        togglePadding(togglePadding.asStatefulValue())

    /**
     * Устанавливает отступ вокруг тоггла
     */
    fun togglePadding(togglePadding: StatefulValue<Dp>): RadioBoxDimensionsBuilder

    /**
     * Устанавливает высоту иконки
     */
    fun toggleIconHeight(toggleIconHeight: Dp): RadioBoxDimensionsBuilder =
        toggleIconHeight(toggleIconHeight.asStatefulValue())

    /**
     * Устанавливает высоту иконки
     */
    fun toggleIconHeight(toggleIconHeight: StatefulValue<Dp>): RadioBoxDimensionsBuilder

    /**
     * Устанавливает ширину иконки
     */
    fun toggleIconWidth(toggleIconWidth: Dp): RadioBoxDimensionsBuilder =
        toggleIconWidth(toggleIconWidth.asStatefulValue())

    /**
     * Устанавливает ширину иконки
     */
    fun toggleIconWidth(toggleIconWidth: StatefulValue<Dp>): RadioBoxDimensionsBuilder

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
    fun textPadding(textPadding: Dp): RadioBoxDimensionsBuilder =
        textPadding(textPadding.asStatefulValue())

    /**
     * Устанавливает отступ текста
     */
    fun textPadding(textPadding: StatefulValue<Dp>): RadioBoxDimensionsBuilder

    /**
     * Устанавливает отступ между лэйблом и описанием
     */
    fun descriptionPadding(descriptionPadding: Dp): RadioBoxDimensionsBuilder =
        descriptionPadding(descriptionPadding.asStatefulValue())

    /**
     * Устанавливает отступ между лэйблом и описанием
     */
    fun descriptionPadding(descriptionPadding: StatefulValue<Dp>): RadioBoxDimensionsBuilder

    /**
     * Устанавливает отступ вначале
     */
    fun paddingStart(paddingStart: Dp): RadioBoxDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступ вначале
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): RadioBoxDimensionsBuilder

    /**
     * Устанавливает отступ сверху
     */
    fun paddingTop(paddingTop: Dp): RadioBoxDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступ сверху
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): RadioBoxDimensionsBuilder

    /**
     * Устанавливает отступ вконце
     */
    fun paddingEnd(paddingEnd: Dp): RadioBoxDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ вконце
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): RadioBoxDimensionsBuilder

    /**
     * Устанавливает отступ снизу
     */
    fun paddingBottom(paddingBottom: Dp): RadioBoxDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступ снизу
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): RadioBoxDimensionsBuilder

    /**
     * Возвращает экземпляр [RadioBoxDimensions]
     */
    fun build(): RadioBoxDimensionValues
}

@Immutable
private class DefaultRadioBoxDimensions(
    override val toggleBorderWidth: StatefulValue<Dp>,
    override val toggleBorderOffset: StatefulValue<Dp>,
    override val toggleWidthValues: StatefulValue<Dp>,
    override val toggleHeightValues: StatefulValue<Dp>,
    override val togglePaddingValues: StatefulValue<Dp>,
    override val toggleIconHeightValues: StatefulValue<Dp>,
    override val toggleIconWidthValues: StatefulValue<Dp>,
    override val textPaddingValues: StatefulValue<Dp>,
    override val descriptionPaddingValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,
) : RadioBoxDimensionValues {
    @Deprecated("Use toggleWidthValues", ReplaceWith("toggleWidthValues"))
    override val toggleWidth: Dp = toggleWidthValues.getDefaultValue()

    @Deprecated("Use toggleHeightValues", ReplaceWith("toggleHeightValues"))
    override val toggleHeight: Dp = toggleHeightValues.getDefaultValue()

    @Deprecated("Use togglePaddingValues", ReplaceWith("togglePaddingValues"))
    override val togglePadding: Dp = togglePaddingValues.getDefaultValue()

    @Deprecated("Use toggleIconHeightValues", ReplaceWith("toggleIconHeightValues"))
    override val toggleIconHeight: Dp = toggleIconHeightValues.getDefaultValue()

    @Deprecated("Use toggleIconWidthValues", ReplaceWith("toggleIconWidthValues"))
    override val toggleIconWidth: Dp = toggleIconWidthValues.getDefaultValue()

    @Deprecated("Use textPaddingValues", ReplaceWith("textPaddingValues"))
    override val textPadding: Dp = textPaddingValues.getDefaultValue()

    @Deprecated("Use descriptionPaddingValues", ReplaceWith("descriptionPaddingValues"))
    override val descriptionPadding: Dp = descriptionPaddingValues.getDefaultValue()

    @Deprecated("Use paddingTopValues", ReplaceWith("paddingTopValues"))
    override val paddingTop: Dp = paddingTopValues.getDefaultValue()

    @Deprecated("Use paddingStartValues", ReplaceWith("paddingStartValues"))
    override val paddingStart: Dp = paddingStartValues.getDefaultValue()

    @Deprecated("Use paddingEndValues", ReplaceWith("paddingEndValues"))
    override val paddingEnd: Dp = paddingEndValues.getDefaultValue()

    @Deprecated("Use paddingBottomValues", ReplaceWith("paddingBottomValues"))
    override val paddingBottom: Dp = paddingBottomValues.getDefaultValue()
    class Builder : RadioBoxDimensionsBuilder {
        private var toggleWidthValues: StatefulValue<Dp>? = null
        private var toggleHeightValues: StatefulValue<Dp>? = null
        private var togglePaddingValues: StatefulValue<Dp>? = null
        private var toggleIconHeightValues: StatefulValue<Dp>? = null
        private var toggleIconWidthValues: StatefulValue<Dp>? = null
        private var toggleBorderWidth: StatefulValue<Dp>? = null
        private var toggleBorderOffset: StatefulValue<Dp>? = null
        private var textPaddingValues: StatefulValue<Dp>? = null
        private var descriptionPaddingValues: StatefulValue<Dp>? = null
        private var paddingTopValues: StatefulValue<Dp>? = null
        private var paddingStartValues: StatefulValue<Dp>? = null
        private var paddingEndValues: StatefulValue<Dp>? = null
        private var paddingBottomValues: StatefulValue<Dp>? = null

        override fun toggleWidth(toggleWidth: StatefulValue<Dp>) = apply {
            this.toggleWidthValues = toggleWidth
        }

        override fun toggleHeight(toggleHeight: StatefulValue<Dp>) = apply {
            this.toggleHeightValues = toggleHeight
        }

        override fun togglePadding(togglePadding: StatefulValue<Dp>) = apply {
            this.togglePaddingValues = togglePadding
        }

        override fun toggleIconHeight(toggleIconHeight: StatefulValue<Dp>) = apply {
            this.toggleIconHeightValues = toggleIconHeight
        }

        override fun toggleIconWidth(toggleIconWidth: StatefulValue<Dp>) = apply {
            this.toggleIconWidthValues = toggleIconWidth
        }

        override fun toggleBorderWidth(toggleBorderWidth: StatefulValue<Dp>) = apply {
            this.toggleBorderWidth = toggleBorderWidth
        }

        override fun toggleBorderOffset(toggleBorderOffset: StatefulValue<Dp>) = apply {
            this.toggleBorderOffset = toggleBorderOffset
        }

        override fun textPadding(textPadding: StatefulValue<Dp>) = apply {
            this.textPaddingValues = textPadding
        }

        override fun descriptionPadding(descriptionPadding: StatefulValue<Dp>) = apply {
            this.descriptionPaddingValues = descriptionPadding
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>) = apply {
            this.paddingStartValues = paddingStart
        }

        override fun paddingTop(paddingTop: StatefulValue<Dp>) = apply {
            this.paddingTopValues = paddingTop
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>) = apply {
            this.paddingEndValues = paddingEnd
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>) = apply {
            this.paddingBottomValues = paddingBottom
        }

        override fun build(): RadioBoxDimensionValues {
            return DefaultRadioBoxDimensions(
                toggleWidthValues = toggleWidthValues ?: 22.dp.asStatefulValue(),
                toggleHeightValues = toggleHeightValues ?: 22.dp.asStatefulValue(),
                togglePaddingValues = togglePaddingValues ?: 1.dp.asStatefulValue(),
                toggleIconHeightValues = toggleIconHeightValues ?: 10.dp.asStatefulValue(),
                toggleIconWidthValues = toggleIconWidthValues ?: 10.dp.asStatefulValue(),
                toggleBorderWidth = toggleBorderWidth ?: 2.dp.asStatefulValue(
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to 1.dp,
                    setOf(InteractiveState.Focused) to 2.dp,
                ),
                toggleBorderOffset = toggleBorderOffset ?: 0.dp.asStatefulValue(
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to 3.dp,
                    setOf(InteractiveState.Focused) to 3.dp,
                ),
                textPaddingValues = textPaddingValues ?: 12.dp.asStatefulValue(),
                descriptionPaddingValues = descriptionPaddingValues ?: 2.dp.asStatefulValue(),
                paddingStartValues = this.paddingStartValues ?: 0.dp.asStatefulValue(),
                paddingTopValues = this.paddingTopValues ?: 0.dp.asStatefulValue(),
                paddingEndValues = this.paddingEndValues ?: 0.dp.asStatefulValue(),
                paddingBottomValues = this.paddingBottomValues ?: 0.dp.asStatefulValue(),
            )
        }
    }
}

@Immutable
private class DefaultRadioBoxStyle(
    @Deprecated("Use colorValues")
    override val colors: RadioBoxColors,
    override val colorValues: RadioBoxColorValues,
    @Deprecated("Use dimensionValues")
    override val dimensions: RadioBoxDimensions,
    override val dimensionValues: RadioBoxDimensionValues,
    override val disableAlpha: Float,
    @Deprecated("Don't use")
    override val animationDuration: Int,
    override val labelStyles: StatefulValue<TextStyle>,
    override val descriptionStyles: StatefulValue<TextStyle>,
    override val shapes: StatefulValue<CornerBasedShape>,
    override val backgroundShapes: StatefulValue<Shape>,
) : RadioBoxStyle {

    @Deprecated("Use labelStyles", ReplaceWith("labelStyles"))
    override val labelStyle: TextStyle = labelStyles.getDefaultValue()

    @Deprecated("Use descriptionStyles", ReplaceWith("descriptionStyles"))
    override val descriptionStyle: TextStyle = descriptionStyles.getDefaultValue()

    @Deprecated("Use shapes", ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()

    @Deprecated("Use backgroundShapes", ReplaceWith("backgroundShapes"))
    override val backgroundShape: Shape = backgroundShapes.getDefaultValue()
    class Builder : RadioBoxStyleBuilder {
        private var shapes: StatefulValue<CornerBasedShape>? = null
        private var backgroundShapes: StatefulValue<Shape>? = null
        private var labelStyles: StatefulValue<TextStyle>? = null
        private var descriptionStyles: StatefulValue<TextStyle>? = null
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

        override fun labelStyle(labelStyle: StatefulValue<TextStyle>) = apply {
            this.labelStyles = labelStyle
        }

        override fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>) = apply {
            this.descriptionStyles = descriptionStyle
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

        override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
            this.shapes = shape
        }

        override fun backgroundShape(backgroundShape: StatefulValue<Shape>) = apply {
            this.backgroundShapes = backgroundShape
        }

        override fun style(): RadioBoxStyle {
            return DefaultRadioBoxStyle(
                shapes = shapes ?: CircleShape.asStatefulValue(),
                labelStyles = labelStyles ?: TextStyle.Default.asStatefulValue(),
                descriptionStyles = descriptionStyles ?: TextStyle.Default.asStatefulValue(),
                colors = colorsBuilder.build(),
                colorValues = mapColors(),
                dimensions = dimensions ?: RadioBoxDimensions(),
                dimensionValues = dimensionValuesBuilder.build(),
                animationDuration = animationDuration ?: 200,
                disableAlpha = disableAlpha ?: 0.4f,
                backgroundShapes = backgroundShapes ?: RectangleShape.asStatefulValue(),
            )
        }
    }
}

@Immutable
private class DefaultRadioBoxColorValues(
    override val backgroundColor: StatefulValue<Brush>,
    override val labelBrush: StatefulValue<Brush>,
    override val descriptionBrush: StatefulValue<Brush>,
    override val toggleBrush: StatefulValue<Brush>,
    override val toggleBorderBrush: StatefulValue<Brush>,
    override val toggleIconBrush: StatefulValue<Brush>,
) : RadioBoxColorValues {
    @Deprecated("Use labelBrush", ReplaceWith("labelBrush"))
    override val labelColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use descriptionBrush", ReplaceWith("descriptionBrush"))
    override val descriptionColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use toggleBrush", ReplaceWith("toggleBrush"))
    override val toggleColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use toggleBorderBrush", ReplaceWith("toggleBorderBrush"))
    override val toggleBorderColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use toggleIconBrush", ReplaceWith("toggleIconBrush"))
    override val toggleIconColor: InteractiveColor = Color.Transparent.asInteractive()
    class Builder : RadioBoxColorValuesBuilder {
        private var labelBrush: StatefulValue<Brush>? = null
        private var descriptionBrush: StatefulValue<Brush>? = null
        private var toggleBrush: StatefulValue<Brush>? = null
        private var toggleBorderBrush: StatefulValue<Brush>? = null
        private var toggleIconBrush: StatefulValue<Brush>? = null
        private var backgroundColor: StatefulValue<Brush>? = null

        override fun labelColor(labelColor: StatefulValue<Brush>) = apply {
            this.labelBrush = labelColor
        }

        override fun descriptionColor(descriptionColor: StatefulValue<Brush>) = apply {
            this.descriptionBrush = descriptionColor
        }

        override fun toggleBorderColor(toggleBorderColor: StatefulValue<Brush>) = apply {
            this.toggleBorderBrush = toggleBorderColor
        }

        override fun toggleColor(toggleColor: StatefulValue<Brush>) = apply {
            this.toggleBrush = toggleColor
        }

        override fun toggleIconColor(toggleIconColor: StatefulValue<Brush>) = apply {
            this.toggleIconBrush = toggleIconColor
        }

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun build(): RadioBoxColorValues {
            return DefaultRadioBoxColorValues(
                labelBrush = labelBrush ?: Color.Black.asStatefulBrush(),
                descriptionBrush = descriptionBrush ?: Color.Black.asStatefulBrush(),
                toggleBrush = toggleBrush ?: Color.Transparent.asStatefulBrush(
                    setOf(RadioBoxStates.Checked) to Color.Green,
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to Color.Green,
                ),
                toggleIconBrush = toggleIconBrush ?: Color.White.asStatefulBrush(),
                toggleBorderBrush = toggleBorderBrush ?: Color.Gray.asStatefulBrush(
                    setOf(InteractiveState.Focused) to Color.Green,
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to Color.Green,
                    setOf(RadioBoxStates.Checked) to Color.Green,
                ),
                backgroundColor = backgroundColor ?: Color.Transparent.asBrush().asStatefulValue(),
            )
        }
    }
}
