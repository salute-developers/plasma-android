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
import com.sdds.compose.uikit.graphics.brush.asBrush
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
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
         * Возвращает экземпляр [CheckBoxStyleBuilder]
         */
        fun builder(receiver: Any? = null): CheckBoxStyleBuilder = DefaultCheckBoxStyle.Builder()
    }
}

/**
 * Builder стиля [CheckBox].
 */
@Stable
@ApiInfo
interface CheckBoxStyleBuilder : StyleBuilder<CheckBoxStyle> {

    /**
     * Устанавливает стиль основного текста [labelStyle]
     * @see CheckBoxStyle.labelStyle
     */
    fun labelStyle(labelStyle: TextStyle): CheckBoxStyleBuilder =
        labelStyle(labelStyle.asStatefulValue())

    /**
     * Устанавливает стили основного текста [labelStyle]
     * @see CheckBoxStyle.labelStyle
     */
    fun labelStyle(labelStyle: StatefulValue<TextStyle>): CheckBoxStyleBuilder

    /**
     * Устанавливает стиль дополнительного текста [descriptionStyle]
     * @see CheckBoxStyle.descriptionStyle
     */
    fun descriptionStyle(descriptionStyle: TextStyle): CheckBoxStyleBuilder =
        descriptionStyle(descriptionStyle.asStatefulValue())

    /**
     * Устанавливает стили дополнительного текста [descriptionStyle]
     * @see CheckBoxStyle.descriptionStyle
     */
    fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>): CheckBoxStyleBuilder

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
    fun shape(shape: CornerBasedShape): CheckBoxStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает формы контрола [shape]
     * @see CheckBoxStyle.shape
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): CheckBoxStyleBuilder

    /**
     * Устанавливает форму фона [backgroundShape]
     * @see CheckBoxStyle.shape
     */
    fun backgroundShape(backgroundShape: Shape): CheckBoxStyleBuilder =
        backgroundShape(backgroundShape.asStatefulValue())

    /**
     * Устанавливает формы фона [backgroundShape]
     * @see CheckBoxStyle.shape
     */
    fun backgroundShape(backgroundShape: StatefulValue<Shape>): CheckBoxStyleBuilder
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
    fun labelColor(labelColor: InteractiveColor): CheckBoxColorValuesBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает цвет основного текста [labelColor]
     * @see CheckBoxColorValuesBuilder.labelColor
     */
    fun labelColor(labelColor: Color): CheckBoxColorValuesBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает кисть основного текста [labelColor]
     * @see CheckBoxColorValuesBuilder.labelColor
     */
    fun labelColor(labelColor: Brush): CheckBoxColorValuesBuilder =
        labelColor(labelColor.asStatefulValue())

    /**
     * Устанавливает кисти основного текста [labelColor]
     * @see CheckBoxColorValuesBuilder.labelColor
     */
    fun labelColor(labelColor: StatefulValue<Brush>): CheckBoxColorValuesBuilder

    /**
     * Устанавливает цвет дополнительного текста [descriptionColor]
     * @see CheckBoxColorValuesBuilder.descriptionColor
     */
    fun descriptionColor(descriptionColor: InteractiveColor): CheckBoxColorValuesBuilder =
        descriptionColor(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает цвет дополнительного текста [descriptionColor]
     * @see CheckBoxColorValuesBuilder.descriptionColor
     */
    fun descriptionColor(descriptionColor: Color): CheckBoxColorValuesBuilder =
        descriptionColor(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает кисть дополнительного текста [descriptionColor]
     * @see CheckBoxColorValuesBuilder.descriptionColor
     */
    fun descriptionColor(descriptionColor: Brush): CheckBoxColorValuesBuilder =
        descriptionColor(descriptionColor.asStatefulValue())

    /**
     * Устанавливает кисти дополнительного текста [descriptionColor]
     * @see CheckBoxColorValuesBuilder.descriptionColor
     */
    fun descriptionColor(descriptionColor: StatefulValue<Brush>): CheckBoxColorValuesBuilder

    /**
     * Устанавливает кисть бордера [toggleBorderColor]
     * @see CheckBoxColorValuesBuilder.toggleBorderColor
     */
    fun toggleBorderColor(toggleBorderColor: StatefulValue<Brush>): CheckBoxColorValuesBuilder

    /**
     * Устанавливает кисти бордера [toggleBorderColor]
     * @see CheckBoxColorValuesBuilder.toggleBorderColor
     */
    fun toggleBorderColor(toggleBorderColor: Brush): CheckBoxColorValuesBuilder =
        toggleBorderColor(toggleBorderColor.asStatefulValue())

    /**
     * Устанавливает цвет бордера [toggleBorderColor]
     * @see CheckBoxColorValuesBuilder.toggleBorderColor
     */
    fun toggleBorderColor(toggleBorderColor: InteractiveColor): CheckBoxColorValuesBuilder =
        toggleBorderColor(toggleBorderColor.asStatefulBrush())

    /**
     * Устанавливает цвет бордера [toggleBorderColor]
     * @see CheckBoxColorValuesBuilder.toggleBorderColor
     */
    fun toggleBorderColor(toggleBorderColor: Color): CheckBoxColorValuesBuilder =
        toggleBorderColor(toggleBorderColor.asStatefulBrush())

    /**
     * Устанавливает цвет бордера [toggleColor]
     * @see CheckBoxColorValuesBuilder.toggleColor
     */
    fun toggleColor(toggleColor: InteractiveColor): CheckBoxColorValuesBuilder =
        toggleColor(toggleColor.asStatefulBrush())

    /**
     * Устанавливает цвет бордера [toggleColor]
     * @see CheckBoxColorValuesBuilder.toggleColor
     */
    fun toggleColor(toggleColor: Color): CheckBoxColorValuesBuilder =
        toggleColor(toggleColor.asStatefulBrush())

    /**
     * Устанавливает кисть бордера [toggleColor]
     * @see CheckBoxColorValuesBuilder.toggleColor
     */
    fun toggleColor(toggleColor: Brush): CheckBoxColorValuesBuilder =
        toggleColor(toggleColor.asStatefulValue())

    /**
     * Устанавливает кисти бордера [toggleColor]
     * @see CheckBoxColorValuesBuilder.toggleColor
     */
    fun toggleColor(toggleColor: StatefulValue<Brush>): CheckBoxColorValuesBuilder

    /**
     * Устанавливает цвет иконки [toggleIconColor]
     * @see CheckBoxColorValuesBuilder.toggleIconColor
     */
    fun toggleIconColor(toggleIconColor: InteractiveColor): CheckBoxColorValuesBuilder =
        toggleIconColor(toggleIconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки [toggleIconColor]
     * @see CheckBoxColorValuesBuilder.toggleIconColor
     */
    fun toggleIconColor(toggleIconColor: Color): CheckBoxColorValuesBuilder =
        toggleIconColor(toggleIconColor.asStatefulBrush())

    /**
     * Устанавливает кисть иконки [toggleIconColor]
     * @see CheckBoxColorValuesBuilder.toggleIconColor
     */
    fun toggleIconColor(toggleIconColor: Brush): CheckBoxColorValuesBuilder =
        toggleIconColor(toggleIconColor.asStatefulValue())

    /**
     * Устанавливает кисти иконки [toggleIconColor]
     * @see CheckBoxColorValuesBuilder.toggleIconColor
     */
    fun toggleIconColor(toggleIconColor: StatefulValue<Brush>): CheckBoxColorValuesBuilder

    /**
     * Устанавливает кисти фона [backgroundColor]
     * @see CheckBoxColorValues.backgroundColor
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): CheckBoxColorValuesBuilder

    /**
     * Устанавливает цвет фона [backgroundColor]
     * @see CheckBoxColorValuesBuilder.backgroundColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): CheckBoxColorValuesBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисть фона [backgroundColor]
     * @see CheckBoxColorValuesBuilder.backgroundColor
     */
    fun backgroundColor(backgroundColor: Brush): CheckBoxColorValuesBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает цвет фона [backgroundColor]
     * @see CheckBoxColorValuesBuilder.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): CheckBoxColorValuesBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

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
    val toggleIconHeight: StatefulValue<Dp>

    /**
     * Ширина иконки
     */
    val toggleIconWidth: StatefulValue<Dp>

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
    fun toggleWidth(toggleWidth: Dp): CheckBoxDimensionsBuilder =
        toggleWidth(toggleWidth.asStatefulValue())

    /**
     * Устанавливает ширину тоггла
     */
    fun toggleWidth(toggleWidth: StatefulValue<Dp>): CheckBoxDimensionsBuilder

    /**
     * Устанавливает высоту тоггла
     */
    fun toggleHeight(toggleHeight: Dp): CheckBoxDimensionsBuilder =
        toggleHeight(toggleHeight.asStatefulValue())

    /**
     * Устанавливает высоту тоггла
     */
    fun toggleHeight(toggleHeight: StatefulValue<Dp>): CheckBoxDimensionsBuilder

    /**
     * Устанавливает отступ вокруг тоггла
     */
    fun togglePadding(togglePadding: Dp): CheckBoxDimensionsBuilder =
        togglePadding(togglePadding.asStatefulValue())

    /**
     * Устанавливает отступ вокруг тоггла
     */
    fun togglePadding(togglePadding: StatefulValue<Dp>): CheckBoxDimensionsBuilder

    /**
     * Устанавливает высоту иконки
     */
    fun toggleIconHeight(toggleIconHeight: Dp): CheckBoxDimensionsBuilder =
        toggleIconHeight(toggleIconHeight.asStatefulValue())

    /**
     * Устанавливает высоту иконки
     */
    fun toggleIconHeight(toggleIconHeight: StatefulValue<Dp>): CheckBoxDimensionsBuilder

    /**
     * Устанавливает ширину иконки
     */
    fun toggleIconWidth(toggleIconWidth: Dp): CheckBoxDimensionsBuilder =
        toggleIconWidth(toggleIconWidth.asStatefulValue())

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
    fun textPadding(textPadding: Dp): CheckBoxDimensionsBuilder =
        textPadding(textPadding.asStatefulValue())

    /**
     * Устанавливает отступ текста
     */
    fun textPadding(textPadding: StatefulValue<Dp>): CheckBoxDimensionsBuilder

    /**
     * Устанавливает отступ между лэйблом и описанием
     */
    fun descriptionPadding(descriptionPadding: Dp): CheckBoxDimensionsBuilder =
        descriptionPadding(descriptionPadding.asStatefulValue())

    /**
     * Устанавливает отступ между лэйблом и описанием
     */
    fun descriptionPadding(descriptionPadding: StatefulValue<Dp>): CheckBoxDimensionsBuilder

    /**
     * Устанавливает отступ вначале
     */
    fun paddingStart(paddingStart: Dp): CheckBoxDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступ вначале
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): CheckBoxDimensionsBuilder

    /**
     * Устанавливает отступ сверху
     */
    fun paddingTop(paddingTop: Dp): CheckBoxDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступ сверху
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): CheckBoxDimensionsBuilder

    /**
     * Устанавливает отступ вконце
     */
    fun paddingEnd(paddingEnd: Dp): CheckBoxDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ вконце
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): CheckBoxDimensionsBuilder

    /**
     * Устанавливает отступ снизу
     */
    fun paddingBottom(paddingBottom: Dp): CheckBoxDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступ снизу
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): CheckBoxDimensionsBuilder

    /**
     * Возвращает экземпляр [CheckBoxDimensions]
     */
    fun build(): CheckBoxDimensionValues
}

@Immutable
private class DefaultCheckBoxDimensions(
    override val toggleIconHeight: StatefulValue<Dp>,
    override val toggleIconWidth: StatefulValue<Dp>,
    override val toggleBorderWidth: StatefulValue<Dp>,
    override val toggleBorderOffset: StatefulValue<Dp>,
    override val toggleWidthValues: StatefulValue<Dp>,
    override val toggleHeightValues: StatefulValue<Dp>,
    override val togglePaddingValues: StatefulValue<Dp>,
    override val textPaddingValues: StatefulValue<Dp>,
    override val descriptionPaddingValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,
) : CheckBoxDimensionValues {

    @Deprecated("Use toggleWidthValues", ReplaceWith("toggleWidthValues"))
    override val toggleWidth: Dp = toggleWidthValues.getDefaultValue()

    @Deprecated("Use toggleHeightValues", ReplaceWith("toggleHeightValues"))
    override val toggleHeight: Dp = toggleHeightValues.getDefaultValue()

    @Deprecated("Use togglePaddingValues", ReplaceWith("togglePaddingValues"))
    override val togglePadding: Dp = togglePaddingValues.getDefaultValue()

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

    class Builder : CheckBoxDimensionsBuilder {
        private var toggleIconHeight: StatefulValue<Dp>? = null
        private var toggleIconWidth: StatefulValue<Dp>? = null
        private var toggleBorderWidth: StatefulValue<Dp>? = null
        private var toggleBorderOffset: StatefulValue<Dp>? = null
        private var toggleWidthValues: StatefulValue<Dp>? = null
        private var toggleHeightValues: StatefulValue<Dp>? = null
        private var togglePaddingValues: StatefulValue<Dp>? = null
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

        override fun build(): CheckBoxDimensionValues {
            return DefaultCheckBoxDimensions(
                toggleWidthValues = toggleWidthValues ?: 22.dp.asStatefulValue(),
                toggleHeightValues = toggleHeightValues ?: 22.dp.asStatefulValue(),
                togglePaddingValues = togglePaddingValues ?: 1.dp.asStatefulValue(),
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
                textPaddingValues = textPaddingValues ?: 12.dp.asStatefulValue(),
                descriptionPaddingValues = descriptionPaddingValues ?: 2.dp.asStatefulValue(),
                paddingStartValues = paddingStartValues ?: 0.dp.asStatefulValue(),
                paddingEndValues = paddingEndValues ?: 0.dp.asStatefulValue(),
                paddingTopValues = paddingTopValues ?: 0.dp.asStatefulValue(),
                paddingBottomValues = paddingBottomValues ?: 0.dp.asStatefulValue(),
            )
        }
    }
}

@Immutable
private class DefaultCheckBoxStyle(
    @Deprecated("Use colorValues")
    override val colors: CheckBoxColors,
    override val colorValues: CheckBoxColorValues,
    @Deprecated("Use dimensionValues")
    override val dimensions: CheckBoxDimensions,
    override val dimensionValues: CheckBoxDimensionValues,
    override val disableAlpha: Float,
    @Deprecated("Don't use")
    override val animationDuration: Int,
    override val labelStyles: StatefulValue<TextStyle>,
    override val descriptionStyles: StatefulValue<TextStyle>,
    override val shapes: StatefulValue<CornerBasedShape>,
    override val backgroundShapes: StatefulValue<Shape>,

) : CheckBoxStyle {

    @Deprecated("Use labelStyles", ReplaceWith("labelStyles"))
    override val labelStyle: TextStyle = labelStyles.getDefaultValue()

    @Deprecated("Use descriptionStyles", ReplaceWith("descriptionStyles"))
    override val descriptionStyle: TextStyle = descriptionStyles.getDefaultValue()

    @Deprecated("Use shapes", ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()

    @Deprecated("Use backgroundShapes", ReplaceWith("backgroundShapes"))
    override val backgroundShape: Shape = backgroundShapes.getDefaultValue()
    class Builder : CheckBoxStyleBuilder {
        private var shapes: StatefulValue<CornerBasedShape>? = null
        private var backgroundShapes: StatefulValue<Shape>? = null
        private var labelStyles: StatefulValue<TextStyle>? = null
        private var descriptionStyles: StatefulValue<TextStyle>? = null
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

        override fun labelStyle(labelStyle: StatefulValue<TextStyle>) = apply {
            this.labelStyles = labelStyle
        }

        override fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>) = apply {
            this.descriptionStyles = descriptionStyle
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

        override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
            this.shapes = shape
        }

        override fun backgroundShape(backgroundShape: StatefulValue<Shape>) = apply {
            this.backgroundShapes = backgroundShape
        }

        override fun style(): CheckBoxStyle {
            return DefaultCheckBoxStyle(
                shapes = shapes ?: CircleShape.asStatefulValue(),
                labelStyles = labelStyles ?: TextStyle.Default.asStatefulValue(),
                descriptionStyles = descriptionStyles ?: TextStyle.Default.asStatefulValue(),
                colors = colorsBuilder.build(),
                colorValues = mapColors(),
                dimensions = dimensions ?: CheckBoxDimensions(),
                dimensionValues = dimensionValuesBuilder.build(),
                animationDuration = animationDuration ?: 200,
                disableAlpha = disableAlpha ?: 0.4f,
                backgroundShapes = backgroundShapes ?: RectangleShape.asStatefulValue(),
            )
        }
    }
}

@Immutable
private class DefaultCheckBoxColorValues(
    override val backgroundColor: StatefulValue<Brush>,
    override val labelBrush: StatefulValue<Brush>,
    override val descriptionBrush: StatefulValue<Brush>,
    override val toggleBrush: StatefulValue<Brush>,
    override val toggleBorderBrush: StatefulValue<Brush>,
    override val toggleIconBrush: StatefulValue<Brush>,
) : CheckBoxColorValues {
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
    class Builder : CheckBoxColorValuesBuilder {
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

        override fun build(): CheckBoxColorValues {
            return DefaultCheckBoxColorValues(
                labelBrush = labelBrush ?: Color.Black.asStatefulBrush(),
                descriptionBrush = descriptionBrush ?: Color.Black.asStatefulBrush(),
                toggleBrush = toggleBrush ?: Color.Transparent
                    .asStatefulBrush(
                        setOf(CheckBoxStates.Checked) to Color.Green,
                        setOf(CheckBoxStates.Indeterminate) to Color.Green,
                        setOf(InteractiveState.Focused, CheckBoxStates.Checked) to Color.Green,
                        setOf(InteractiveState.Focused, CheckBoxStates.Indeterminate) to Color.Green,
                    ),
                toggleIconBrush = toggleIconBrush ?: Color.White.asStatefulBrush(),
                toggleBorderBrush = toggleBorderBrush ?: Color.Gray
                    .asStatefulBrush(
                        setOf(InteractiveState.Focused) to Color.Green,
                        setOf(InteractiveState.Focused, CheckBoxStates.Checked) to Color.Green,
                        setOf(InteractiveState.Focused, CheckBoxStates.Indeterminate) to Color.Green,
                        setOf(CheckBoxStates.Checked) to Color.Green,
                        setOf(CheckBoxStates.Indeterminate) to Color.Green,
                    ),
                backgroundColor = backgroundColor ?: Color.Transparent.asBrush().asStatefulValue(),
            )
        }
    }
}
