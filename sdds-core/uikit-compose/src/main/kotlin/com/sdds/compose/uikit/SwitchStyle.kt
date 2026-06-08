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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
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
    @Deprecated("Use shapes", ReplaceWith("shapes"))
    val shape: Shape

    /**
     * Формы компонента
     */
    val shapes: StatefulValue<Shape>

    /**
     * Форма неподвижной части компонента
     */
    @Deprecated("Use toggleTrackShapes", ReplaceWith("toggleTrackShapes"))
    val toggleTrackShape: CornerBasedShape

    /**
     * Формы неподвижной части компонента
     */
    val toggleTrackShapes: StatefulValue<CornerBasedShape>

    /**
     * Форма подвижной части компонента
     */
    @Deprecated("Use toggleThumbShapes", ReplaceWith("toggleThumbShapes"))
    val toggleThumbShape: CornerBasedShape

    /**
     * Формы подвижной части компонента
     */
    val toggleThumbShapes: StatefulValue<CornerBasedShape>

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
    @Deprecated("Use labelStyles", ReplaceWith("labelStyles"))
    val labelStyle: TextStyle

    /**
     * Стили основоного текста
     */
    val labelStyles: StatefulValue<TextStyle>

    /**
     * Стиль дополнительного текста
     */
    @Deprecated("Use descriptionStyles", ReplaceWith("descriptionStyles"))
    val descriptionStyle: TextStyle

    /**
     * Стили дополнительного текста
     */
    val descriptionStyles: StatefulValue<TextStyle>

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
    fun labelStyle(labelStyle: TextStyle): SwitchStyleBuilder =
        labelStyle(labelStyle.asStatefulValue())

    /**
     * Устанавливает стили лейбла [labelStyle]
     */
    fun labelStyle(labelStyle: StatefulValue<TextStyle>): SwitchStyleBuilder

    /**
     * Устанавливает стиль дополнительного текста [descriptionStyle]
     * @see SwitchStyle.descriptionStyle
     */
    fun descriptionStyle(descriptionStyle: TextStyle): SwitchStyleBuilder =
        descriptionStyle(descriptionStyle.asStatefulValue())

    /**
     * Устанавливает стили дополнительного текста [descriptionStyle]
     */
    fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>): SwitchStyleBuilder

    /**
     * Устанавливает длительность анимации переключения контрола [animationDuration]
     * @see SwitchStyle.animationDurationMillis
     */
    @Deprecated("Don't use")
    fun animationDuration(durationMillis: Int): SwitchStyleBuilder

    /**
     * Устанавливает форму неподвижной части [toggleTrackShape]
     */
    fun toggleTrackShape(toggleTrackShape: CornerBasedShape): SwitchStyleBuilder =
        toggleTrackShape(toggleTrackShape.asStatefulValue())

    /**
     * Устанавливает формы неподвижной части [toggleTrackShape]
     */
    fun toggleTrackShape(toggleTrackShape: StatefulValue<CornerBasedShape>): SwitchStyleBuilder

    /**
     * Устанавливает форму подвижной части [toggleThumbShape]
     */
    fun toggleThumbShape(toggleThumbShape: CornerBasedShape): SwitchStyleBuilder =
        toggleThumbShape(toggleThumbShape.asStatefulValue())

    /**
     * Устанавливает формы подвижной части [toggleThumbShape]
     */
    fun toggleThumbShape(toggleThumbShape: StatefulValue<CornerBasedShape>): SwitchStyleBuilder

    /**
     * Устанавливает альфу [disableAlpha] в состоянии disabled
     */
    fun disableAlpha(disableAlpha: Float): SwitchStyleBuilder

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): SwitchStyleBuilder =
        shape((shape.asStatefulValue()))

    /**
     * Устанавливает формы [shape] компонента
     */
    fun shape(shape: StatefulValue<Shape>): SwitchStyleBuilder
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
    @Deprecated("Use labelBrush", ReplaceWith("labelBrush"))
    val labelColor: InteractiveColor

    /**
     * Кисти основного текста.
     */
    val labelBrush: StatefulValue<Brush>

    /**
     * Цвет дополнительного текста.
     */
    @Deprecated("Use descriptionBrush", ReplaceWith("descriptionBrush"))
    val descriptionColor: InteractiveColor

    /**
     * Кисти дополнительного текста.
     */
    val descriptionBrush: StatefulValue<Brush>

    /**
     * Цвет подвижного элемента переключателя (thumb).
     */
    @Deprecated("Use toggleThumbBrush", ReplaceWith("toggleThumbBrush"))
    val toggleThumbColor: InteractiveColor

    /**
     * Кисти подвижного элемента переключателя (thumb).
     */
    val toggleThumbBrush: StatefulValue<Brush>

    /**
     * Цвет неподвижного элемента переключателя (track).
     */
    @Deprecated("Use toggleTrackBrush", ReplaceWith("toggleTrackBrush"))
    val toggleTrackColor: InteractiveColor

    /**
     * Кисти неподвижного элемента переключателя (track).
     */
    val toggleTrackBrush: StatefulValue<Brush>

    /**
     * Цвет бордера неподвижной части
     */
    @Deprecated("Use toggleTrackBorderBrush", ReplaceWith("toggleTrackBorderBrush"))
    val toggleTrackBorderColor: InteractiveColor

    /**
     * Кисти бордера неподвижной части
     */
    val toggleTrackBorderBrush: StatefulValue<Brush>

    /**
     * Цвет фона
     */
    @Deprecated("Use backgroundBrush", ReplaceWith("backgroundBrush"))
    val backgroundColor: InteractiveColor

    /**
     * Кисти фона.
     */
    val backgroundBrush: StatefulValue<Brush>

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
    fun labelColor(labelColor: InteractiveColor): SwitchColorValuesBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает цвет надписи [labelColor]
     */
    fun labelColor(labelColor: Color): SwitchColorValuesBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает кисть надписи [labelColor]
     */
    fun labelColor(labelColor: Brush): SwitchColorValuesBuilder =
        labelColor(labelColor.asStatefulValue())

    /**
     * Устанавливает кисти надписи [labelColor]
     */
    fun labelColor(labelColor: StatefulValue<Brush>): SwitchColorValuesBuilder

    /**
     * Устанавливает цвет дополнительной надписи [descriptionColor]
     */
    fun descriptionColor(descriptionColor: InteractiveColor): SwitchColorValuesBuilder =
        descriptionColor(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает цвет дополнительной надписи [descriptionColor]
     */
    fun descriptionColor(descriptionColor: Color): SwitchColorValuesBuilder =
        descriptionColor(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает кисть дополнительной надписи [descriptionColor]
     */
    fun descriptionColor(descriptionColor: Brush): SwitchColorValuesBuilder =
        descriptionColor(descriptionColor.asStatefulValue())

    /**
     * Устанавливает кисти дополнительной надписи [descriptionColor]
     */
    fun descriptionColor(descriptionColor: StatefulValue<Brush>): SwitchColorValuesBuilder

    /**
     * Устанавливает цвет подвижной части [toggleThumbColor]
     */
    fun toggleThumbColor(toggleThumbColor: InteractiveColor): SwitchColorValuesBuilder =
        toggleThumbColor(toggleThumbColor.asStatefulBrush())

    /**
     * Устанавливает цвет подвижной части [toggleThumbColor]
     */
    fun toggleThumbColor(toggleThumbColor: Color): SwitchColorValuesBuilder =
        toggleThumbColor(toggleThumbColor.asStatefulBrush())

    /**
     * Устанавливает кисть подвижной части [toggleThumbColor]
     */
    fun toggleThumbColor(toggleThumbColor: Brush): SwitchColorValuesBuilder =
        toggleThumbColor(toggleThumbColor.asStatefulValue())

    /**
     * Устанавливает кисти подвижной части [toggleThumbColor]
     */
    fun toggleThumbColor(toggleThumbColor: StatefulValue<Brush>): SwitchColorValuesBuilder

    /**
     * Устанавливает цвет неподвижной части [toggleTrackColor]
     */
    fun toggleTrackColor(toggleTrackColor: InteractiveColor): SwitchColorValuesBuilder =
        toggleTrackColor(toggleTrackColor.asStatefulBrush())

    /**
     * Устанавливает цвет неподвижной части [toggleTrackColor]
     */
    fun toggleTrackColor(toggleTrackColor: Color): SwitchColorValuesBuilder =
        toggleTrackColor(toggleTrackColor.asStatefulBrush())

    /**
     * Устанавливает кисть неподвижной части [toggleTrackColor]
     */
    fun toggleTrackColor(toggleTrackColor: Brush): SwitchColorValuesBuilder =
        toggleTrackColor(toggleTrackColor.asStatefulValue())

    /**
     * Устанавливает кисти неподвижной части [toggleTrackColor]
     */
    fun toggleTrackColor(toggleTrackColor: StatefulValue<Brush>): SwitchColorValuesBuilder

    /**
     * Устанавливает цвет бордера неподвижной части [toggleTrackBorderColor]
     */
    fun toggleTrackBorderColor(toggleTrackBorderColor: InteractiveColor): SwitchColorValuesBuilder =
        toggleTrackBorderColor(toggleTrackBorderColor.asStatefulBrush())

    /**
     * Устанавливает цвет бордера неподвижной части [toggleTrackBorderColor]
     */
    fun toggleTrackBorderColor(toggleTrackBorderColor: Color): SwitchColorValuesBuilder =
        toggleTrackBorderColor(toggleTrackBorderColor.asStatefulBrush())

    /**
     * Устанавливает кисть бордера неподвижной части [toggleTrackBorderColor]
     */
    fun toggleTrackBorderColor(toggleTrackBorderColor: Brush): SwitchColorValuesBuilder =
        toggleTrackBorderColor(toggleTrackBorderColor.asStatefulValue())

    /**
     * Устанавливает кисти бордера неподвижной части [toggleTrackBorderColor]
     */
    fun toggleTrackBorderColor(toggleTrackBorderColor: StatefulValue<Brush>): SwitchColorValuesBuilder

    /**
     * Устанавливает цвет фона [backgroundColor]
     */
    fun backgroundColor(backgroundColor: InteractiveColor): SwitchColorValuesBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона [backgroundColor]
     */
    fun backgroundColor(backgroundColor: Color): SwitchColorValuesBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисть фона [backgroundColor]
     */
    fun backgroundColor(backgroundColor: Brush): SwitchColorValuesBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает кисти фона [backgroundColor]
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): SwitchColorValuesBuilder

    /**
     * Возвращает экземпляр [SwitchColorValues]
     */
    fun build(): SwitchColorValues
}

@Immutable
private class DefaultSwitchColorValues(
    override val labelBrush: StatefulValue<Brush>,
    override val descriptionBrush: StatefulValue<Brush>,
    override val toggleThumbBrush: StatefulValue<Brush>,
    override val toggleTrackBrush: StatefulValue<Brush>,
    override val toggleTrackBorderBrush: StatefulValue<Brush>,
    override val backgroundBrush: StatefulValue<Brush>,
) : SwitchColorValues {

    @Deprecated("Use labelBrush", ReplaceWith("labelBrush"))
    override val labelColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use descriptionBrush", ReplaceWith("descriptionBrush"))
    override val descriptionColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use toggleThumbBrush", ReplaceWith("toggleThumbBrush"))
    override val toggleThumbColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use toggleTrackBrush", ReplaceWith("toggleTrackBrush"))
    override val toggleTrackColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use toggleTrackBorderBrush", ReplaceWith("toggleTrackBorderBrush"))
    override val toggleTrackBorderColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use backgroundBrush", ReplaceWith("backgroundBrush"))
    override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()

    class Builder : SwitchColorValuesBuilder {
        private var labelBrush: StatefulValue<Brush>? = null
        private var descriptionBrush: StatefulValue<Brush>? = null
        private var toggleThumbBrush: StatefulValue<Brush>? = null
        private var toggleTrackBrush: StatefulValue<Brush>? = null
        private var toggleTrackBorderBrush: StatefulValue<Brush>? = null
        private var backgroundBrush: StatefulValue<Brush>? = null

        override fun labelColor(labelColor: StatefulValue<Brush>) = apply {
            this.labelBrush = labelColor
        }

        override fun descriptionColor(descriptionColor: StatefulValue<Brush>) = apply {
            this.descriptionBrush = descriptionColor
        }

        override fun toggleThumbColor(toggleThumbColor: StatefulValue<Brush>) = apply {
            this.toggleThumbBrush = toggleThumbColor
        }

        override fun toggleTrackColor(toggleTrackColor: StatefulValue<Brush>) = apply {
            this.toggleTrackBrush = toggleTrackColor
        }

        override fun toggleTrackBorderColor(toggleTrackBorderColor: StatefulValue<Brush>) = apply {
            this.toggleTrackBorderBrush = toggleTrackBorderColor
        }

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundBrush = backgroundColor
        }

        override fun build(): SwitchColorValues {
            return DefaultSwitchColorValues(
                labelBrush = labelBrush ?: Color.Black.asStatefulBrush(),
                descriptionBrush = descriptionBrush ?: Color.Black.asStatefulBrush(),
                toggleThumbBrush = toggleThumbBrush ?: Color.White.asStatefulBrush(),
                toggleTrackBrush = toggleTrackBrush ?: Color.Gray.asStatefulBrush(
                    setOf(SwitchStates.Checked) to Color.Green,
                ),
                toggleTrackBorderBrush = toggleTrackBorderBrush ?: Color.Transparent.asStatefulBrush(),
                backgroundBrush = backgroundBrush ?: Color.Transparent.asStatefulBrush(),
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
    @Deprecated("Use toggleTrackWidthValues", ReplaceWith("toggleTrackWidthValues"))
    val toggleTrackWidth: Dp

    /**
     * Ширина неподвижной части
     */
    val toggleTrackWidthValues: StatefulValue<Dp>

    /**
     * Высота неподвижной части
     */
    @Deprecated("Use toggleTrackHeightValues", ReplaceWith("toggleTrackHeightValues"))
    val toggleTrackHeight: Dp

    /**
     * Высота неподвижной части
     */
    val toggleTrackHeightValues: StatefulValue<Dp>

    /**
     * Ширина подвижной части
     */
    @Deprecated("Use toggleThumbWidth", ReplaceWith("toggleThumbWidths"))
    val toggleThumbWidth: Dp

    /**
     * Ширины подвижной части
     */
    val toggleThumbWidths: StatefulValue<Dp>

    /**
     * Высота подвижной части
     */
    @Deprecated("Use toggleThumbHeights", ReplaceWith("toggleThumbHeights"))
    val toggleThumbHeight: Dp

    /**
     * Высоты подвижной части
     */
    val toggleThumbHeights: StatefulValue<Dp>

    /**
     * Горизонтальный отступ подвижной части
     */
    @Deprecated("Use toggleThumbPaddings", ReplaceWith("toggleThumbPaddings"))
    val toggleThumbPadding: Dp

    /**
     * Горизонтальный отступ подвижной части
     */
    val toggleThumbPaddings: StatefulValue<Dp>

    /**
     * Отступ до текста
     */
    @Deprecated("Use textPaddingValues", ReplaceWith("textPaddingValues"))
    val textPadding: Dp

    /**
     * Отступ до текста
     */
    val textPaddingValues: StatefulValue<Dp>

    /**
     * Отступ дополнительного текста
     */
    @Deprecated("Use descriptionPaddingValues", ReplaceWith("descriptionPaddingValues"))
    val descriptionPadding: Dp

    /**
     * Отступ дополнительного текста
     */
    val descriptionPaddingValues: StatefulValue<Dp>

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

    /**
     * Толщина рамки неподвижной части переключателя
     */
    val toggleTrackBorderWidth: StatefulValue<Dp>

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
    fun toggleTrackWidth(toggleTrackWidth: Dp): SwitchDimensionValuesBuilder =
        toggleTrackWidth(toggleTrackWidth.asStatefulValue())

    /**
     * Устанавливает ширину неподвижной части
     */
    fun toggleTrackWidth(toggleTrackWidth: StatefulValue<Dp>): SwitchDimensionValuesBuilder

    /**
     * Устанавливает высоту неподвижной части
     */
    fun toggleTrackHeight(toggleTrackHeight: Dp): SwitchDimensionValuesBuilder =
        toggleTrackHeight(toggleTrackHeight.asStatefulValue())

    /**
     * Устанавливает высоту неподвижной части
     */
    fun toggleTrackHeight(toggleTrackHeight: StatefulValue<Dp>): SwitchDimensionValuesBuilder

    /**
     * Устанавливает ширину подвижной части
     */
    fun toggleThumbWidth(toggleThumbWidth: Dp): SwitchDimensionValuesBuilder =
        toggleThumbWidth(toggleThumbWidth.asStatefulValue())

    /**
     * Устанавливает ширины подвижной части
     */
    fun toggleThumbWidth(toggleThumbWidth: StatefulValue<Dp>): SwitchDimensionValuesBuilder

    /**
     * Устанавливает высоту подвижной части
     */
    fun toggleThumbHeight(toggleThumbHeight: Dp): SwitchDimensionValuesBuilder =
        toggleThumbHeight(toggleThumbHeight.asStatefulValue())

    /**
     * Устанавливает высоты подвижной части
     */
    fun toggleThumbHeight(toggleThumbHeight: StatefulValue<Dp>): SwitchDimensionValuesBuilder

    /**
     * Устанавливает горизонтальный отступ до подвижной части
     */
    fun toggleThumbPadding(toggleThumbPadding: Dp): SwitchDimensionValuesBuilder =
        toggleThumbPadding(toggleThumbPadding.asStatefulValue())

    /**
     * Устанавливает горизонтальный отступ до подвижной части
     */
    fun toggleThumbPadding(toggleThumbPadding: StatefulValue<Dp>): SwitchDimensionValuesBuilder

    /**
     * Устанавливает отступ до текста
     */
    fun textPadding(textPadding: Dp): SwitchDimensionValuesBuilder =
        textPadding(textPadding.asStatefulValue())

    /**
     * Устанавливает отступ до текста
     */
    fun textPadding(textPadding: StatefulValue<Dp>): SwitchDimensionValuesBuilder

    /**
     * Устанавливает отступ дополнительного текста
     */
    fun descriptionPadding(descriptionPadding: Dp): SwitchDimensionValuesBuilder =
        descriptionPadding(descriptionPadding.asStatefulValue())

    /**
     * Устанавливает отступ дополнительного текста
     */
    fun descriptionPadding(descriptionPadding: StatefulValue<Dp>): SwitchDimensionValuesBuilder

    /**
     * Устанавливает отступ вначале
     */
    fun paddingStart(paddingStart: Dp): SwitchDimensionValuesBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступ вначале
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): SwitchDimensionValuesBuilder

    /**
     * Устанавливает отступ сверху
     */
    fun paddingTop(paddingTop: Dp): SwitchDimensionValuesBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступ сверху
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): SwitchDimensionValuesBuilder

    /**
     * Устанавливает отступ вконце
     */
    fun paddingEnd(paddingEnd: Dp): SwitchDimensionValuesBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ вконце
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): SwitchDimensionValuesBuilder

    /**
     * Устанавливает отступ снизу
     */
    fun paddingBottom(paddingBottom: Dp): SwitchDimensionValuesBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступ снизу
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): SwitchDimensionValuesBuilder

    /**
     * Устанавливает толщину рамки неподвижной части переключателя
     */
    fun toggleTrackBorderWidth(borderWidth: Dp): SwitchDimensionValuesBuilder =
        toggleTrackBorderWidth(borderWidth.asStatefulValue())

    /**
     * Устанавливает толщину рамки неподвижной части переключателя
     */
    fun toggleTrackBorderWidth(borderWidth: StatefulValue<Dp>): SwitchDimensionValuesBuilder

    /**
     * Возвращает экземпляр [SwitchDimensionValues]
     */
    fun build(): SwitchDimensionValues
}

@Immutable
private class DefaultSwitchDimensionValues(

    override val toggleThumbWidths: StatefulValue<Dp>,
    override val toggleThumbHeights: StatefulValue<Dp>,
    override val toggleTrackBorderWidth: StatefulValue<Dp>,
    override val toggleThumbPaddings: StatefulValue<Dp>,
    override val toggleTrackWidthValues: StatefulValue<Dp>,
    override val toggleTrackHeightValues: StatefulValue<Dp>,
    override val textPaddingValues: StatefulValue<Dp>,
    override val descriptionPaddingValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,
) : SwitchDimensionValues {

    @Deprecated("Use toggleThumbWidths", replaceWith = ReplaceWith("toggleThumbWidths"))
    override val toggleThumbWidth: Dp = toggleThumbWidths.getDefaultValue()

    @Deprecated("Use toggleThumbHeights", replaceWith = ReplaceWith("toggleThumbHeights"))
    override val toggleThumbHeight: Dp = toggleThumbHeights.getDefaultValue()

    @Deprecated("Use toggleThumbPaddings", replaceWith = ReplaceWith("toggleThumbPaddings"))
    override val toggleThumbPadding: Dp = toggleThumbPaddings.getDefaultValue()

    @Deprecated("Use toggleTrackWidthValues", replaceWith = ReplaceWith("toggleTrackWidthValues"))
    override val toggleTrackWidth: Dp = toggleTrackWidthValues.getDefaultValue()

    @Deprecated("Use toggleTrackHeightValues", replaceWith = ReplaceWith("toggleTrackHeightValues"))
    override val toggleTrackHeight: Dp = toggleTrackHeightValues.getDefaultValue()

    @Deprecated("Use textPaddingValues", replaceWith = ReplaceWith("textPaddingValues"))
    override val textPadding: Dp = textPaddingValues.getDefaultValue()

    @Deprecated("Use descriptionPaddingValues", replaceWith = ReplaceWith("descriptionPaddingValues"))
    override val descriptionPadding: Dp = descriptionPaddingValues.getDefaultValue()

    @Deprecated("Use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
    override val paddingTop: Dp = paddingTopValues.getDefaultValue()

    @Deprecated("Use paddingStartValues", replaceWith = ReplaceWith("paddingStartValues"))
    override val paddingStart: Dp = paddingStartValues.getDefaultValue()

    @Deprecated("Use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
    override val paddingEnd: Dp = paddingEndValues.getDefaultValue()

    @Deprecated("Use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
    override val paddingBottom: Dp = paddingBottomValues.getDefaultValue()

    class Builder : SwitchDimensionValuesBuilder {
        private var toggleTrackWidthValues: StatefulValue<Dp>? = null
        private var toggleTrackHeightValues: StatefulValue<Dp>? = null
        private var toggleThumbWidthValues: StatefulValue<Dp>? = null
        private var toggleThumbHeightValues: StatefulValue<Dp>? = null
        private var toggleThumbPaddingValues: StatefulValue<Dp>? = null
        private var textPaddingValues: StatefulValue<Dp>? = null
        private var descriptionPaddingValues: StatefulValue<Dp>? = null
        private var paddingTopValues: StatefulValue<Dp>? = null
        private var paddingStartValues: StatefulValue<Dp>? = null
        private var paddingEndValues: StatefulValue<Dp>? = null
        private var paddingBottomValues: StatefulValue<Dp>? = null
        private var toggleTrackBorderWidthValues: StatefulValue<Dp>? = null

        override fun toggleTrackWidth(toggleTrackWidth: StatefulValue<Dp>) = apply {
            this.toggleTrackWidthValues = toggleTrackWidth
        }

        override fun toggleTrackHeight(toggleTrackHeight: StatefulValue<Dp>) = apply {
            this.toggleTrackHeightValues = toggleTrackHeight
        }

        override fun toggleThumbWidth(toggleThumbWidth: StatefulValue<Dp>) = apply {
            this.toggleThumbWidthValues = toggleThumbWidth
        }

        override fun toggleThumbHeight(toggleThumbHeight: StatefulValue<Dp>) = apply {
            this.toggleThumbHeightValues = toggleThumbHeight
        }

        override fun toggleThumbPadding(toggleThumbPadding: StatefulValue<Dp>) = apply {
            this.toggleThumbPaddingValues = toggleThumbPadding
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

        override fun toggleTrackBorderWidth(borderWidth: StatefulValue<Dp>) = apply {
            this.toggleTrackBorderWidthValues = borderWidth
        }

        override fun build(): SwitchDimensionValues {
            return DefaultSwitchDimensionValues(
                toggleTrackWidthValues = toggleTrackWidthValues ?: 44.dp.asStatefulValue(),
                toggleTrackHeightValues = toggleTrackHeightValues ?: 28.dp.asStatefulValue(),
                toggleThumbWidths = toggleThumbWidthValues ?: 24.dp.asStatefulValue(),
                toggleThumbHeights = toggleThumbHeightValues ?: 24.dp.asStatefulValue(),
                toggleThumbPaddings = toggleThumbPaddingValues ?: 2.dp.asStatefulValue(),
                textPaddingValues = textPaddingValues ?: 12.dp.asStatefulValue(),
                descriptionPaddingValues = descriptionPaddingValues ?: 2.dp.asStatefulValue(),
                paddingStartValues = paddingStartValues ?: 0.dp.asStatefulValue(),
                paddingTopValues = paddingTopValues ?: 0.dp.asStatefulValue(),
                paddingEndValues = paddingEndValues ?: 0.dp.asStatefulValue(),
                paddingBottomValues = paddingBottomValues ?: 0.dp.asStatefulValue(),
                toggleTrackBorderWidth = toggleTrackBorderWidthValues ?: 0.dp.asStatefulValue(),
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
    override val labelStyles: StatefulValue<TextStyle>,
    override val descriptionStyles: StatefulValue<TextStyle>,
    @Deprecated("Don't use")
    override val animationDurationMillis: Int,
    override val dimensionValues: SwitchDimensionValues,
    override val colorValues: SwitchColorValues,
    override val disableAlpha: Float,
    override val shapes: StatefulValue<Shape>,
    override val toggleTrackShapes: StatefulValue<CornerBasedShape>,
    override val toggleThumbShapes: StatefulValue<CornerBasedShape>,
) : SwitchStyle {
    @Deprecated("Use labelStyles", ReplaceWith("labelStyles"))
    override val labelStyle: TextStyle = labelStyles.getDefaultValue()

    @Deprecated("Use descriptionStyles", ReplaceWith("descriptionStyles"))
    override val descriptionStyle: TextStyle = descriptionStyles.getDefaultValue()

    @Deprecated("Use shapes", ReplaceWith("shapes"))
    override val shape: Shape = shapes.getDefaultValue()

    @Deprecated("Use toggleTrackShapes", ReplaceWith("toggleTrackShapes"))
    override val toggleTrackShape: CornerBasedShape = toggleTrackShapes.getDefaultValue()

    @Deprecated("Use toggleThumbShapes", ReplaceWith("toggleThumbShapes"))
    override val toggleThumbShape: CornerBasedShape = toggleThumbShapes.getDefaultValue()
    class Builder : SwitchStyleBuilder {

        private val colorsBuilder: SwitchColorsBuilder = SwitchColors.builder()
        private val colorValuesBuilder = SwitchColorValues.builder()
        private var dimensions: SwitchDimensions? = null
        private val dimensionsBuilder = SwitchDimensionValues.builder()
        private var labelStyle: StatefulValue<TextStyle>? = null
        private var descriptionStyle: StatefulValue<TextStyle>? = null
        private var animationDurationMillis: Int? = null
        private var toggleTrackShapes: StatefulValue<CornerBasedShape>? = null
        private var toggleThumbShapes: StatefulValue<CornerBasedShape>? = null
        private var shapes: StatefulValue<Shape>? = null
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
            labelStyle(labelStyle.asStatefulValue())
        }

        override fun labelStyle(labelStyle: StatefulValue<TextStyle>) = apply {
            this.labelStyle = labelStyle
        }

        override fun descriptionStyle(descriptionStyle: TextStyle) = apply {
            descriptionStyle(descriptionStyle.asStatefulValue())
        }

        override fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>) = apply {
            this.descriptionStyle = descriptionStyle
        }

        @Deprecated("Don't use")
        override fun animationDuration(durationMillis: Int) = apply {
            animationDurationMillis = durationMillis
        }

        override fun toggleTrackShape(toggleTrackShape: StatefulValue<CornerBasedShape>) = apply {
            this.toggleTrackShapes = toggleTrackShape
        }

        override fun toggleThumbShape(toggleThumbShape: StatefulValue<CornerBasedShape>) = apply {
            this.toggleThumbShapes = toggleThumbShape
        }

        override fun disableAlpha(disableAlpha: Float) = apply {
            this.disableAlpha = disableAlpha
        }

        override fun shape(shape: StatefulValue<Shape>) = apply {
            this.shapes = shape
        }

        override fun style(): SwitchStyle {
            return DefaultSwitchStyle(
                colors = colorsBuilder.build(),
                dimensions = dimensions ?: SwitchDimensions(),
                labelStyles = labelStyle ?: TextStyle.Default.asStatefulValue(),
                descriptionStyles = descriptionStyle ?: TextStyle.Default.asStatefulValue(),
                animationDurationMillis = animationDurationMillis ?: DEFAULT_ANIMATION_DURATION,
                toggleTrackShapes = toggleTrackShapes ?: CircleShape.asStatefulValue(),
                toggleThumbShapes = toggleThumbShapes ?: CircleShape.asStatefulValue(),
                colorValues = colorValuesBuilder.build(),
                dimensionValues = dimensionsBuilder.build(),
                disableAlpha = disableAlpha ?: 0.4f,
                shapes = shapes ?: RectangleShape.asStatefulValue(),
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
