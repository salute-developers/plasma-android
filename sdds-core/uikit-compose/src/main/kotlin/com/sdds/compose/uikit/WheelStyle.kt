package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
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
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [WheelStyle] для компонента [Wheel]
 */
val LocalWheelStyle = compositionLocalOf { WheelStyle.builder().style() }

/**
 * Стиль компонента Wheel
 */
@Immutable
interface WheelStyle : Style {

    /**
     * Стиль текста элемента
     */
    val itemTextStyle: TextStyle

    /**
     * Стиль дополнительного текста элемента
     */
    val itemTextAfterStyle: TextStyle

    /**
     * Стиль описания
     */
    val descriptionStyle: TextStyle

    /**
     * Размеры и отступы компонента
     */
    val dimensions: WheelDimensions

    /**
     * Цвета компонента
     */
    val colors: WheelColors

    /**
     * Режим выравнивания
     */
    val itemAlignment: WheelAlignment

    /**
     * Количество колёс
     */
    val wheelCount: Int

    /**
     * Количество видимых элементов в колесе
     */
    val visibleItemsCount: Int

    /**
     * Иконка верхнего контрола
     */
    @get:DrawableRes
    val controlIconUp: Int?

    /**
     * Иконка нижнего контрола
     */
    @get:DrawableRes
    val controlIconDown: Int?

    /**
     * Стиль разделителя
     */
    val dividerStyle: DividerStyle

    /**
     * Режим отображения дополнительного текста
     */
    val textAfterMode: TextAfterMode

    /**
     * Включён ли индикатор выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorEnabled",
        replaceWith = ReplaceWith("selectionIndicatorEnabled"),
    )
    val itemSelectorEnabled: Boolean

    /**
     * Включён ли индикатор выбранного элемента
     */
    val selectionIndicatorEnabled: Boolean

    /**
     * Форма индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorShape",
        replaceWith = ReplaceWith("selectionIndicatorShape"),
    )
    val itemSelectorShape: StatefulValue<Shape>

    /**
     * Форма индикатора выбранного элемента
     */
    val selectionIndicatorShape: StatefulValue<Shape>

    companion object {
        /**
         * Возвращает экземпляр [WheelStyleBuilder]
         */
        fun builder(receiver: Any? = null): WheelStyleBuilder = DefaultWheelStyle.Builder()
    }
}

/**
 * Билдер стиля [WheelStyle]
 */
@ApiInfo
interface WheelStyleBuilder : StyleBuilder<WheelStyle> {

    /**
     * Устанавливает стиль текста [itemTextStyle]
     */
    fun itemTextStyle(itemTextStyle: TextStyle): WheelStyleBuilder

    /**
     * Устанавливает стиль дполнительного текста [itemTextStyle]
     */
    fun itemTextAfterStyle(itemTextAfterStyle: TextStyle): WheelStyleBuilder

    /**
     * Устанавливает стиль описания
     */
    fun descriptionStyle(descriptionStyle: TextStyle): WheelStyleBuilder

    /**
     * Устанавливает выравнивание [itemAlignment]
     */
    fun itemAlignment(itemAlignment: WheelAlignment): WheelStyleBuilder

    /**
     * Устанавливает количество колёс [wheelCount]
     */
    fun wheelCount(wheelCount: Int): WheelStyleBuilder

    /**
     * Устанавливает количество видимых элементов в колесе [wheelCount]
     */
    fun visibleItemsCount(visibleItemsCount: Int): WheelStyleBuilder

    /**
     * Устанавливает иконка верхнего контрола [controlIconUp]
     */
    fun controlIconUp(@DrawableRes controlIconUp: Int): WheelStyleBuilder

    /**
     * Устанавливает иконка нижнего контрола [controlIconUp]
     */
    fun controlIconDown(@DrawableRes controlIconDown: Int): WheelStyleBuilder

    /**
     * Устанавливает стиль разделителя [dividerStyle]
     */
    fun dividerStyle(dividerStyle: DividerStyle): WheelStyleBuilder

    /**
     * Устанавливает режим отображения дополнительного текста [textAfterMode]
     */
    fun textAfterMode(mode: TextAfterMode): WheelStyleBuilder

    /**
     * Включает или выключает индикатор выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorEnabled",
        replaceWith = ReplaceWith("selectionIndicatorEnabled(enabled)"),
    )
    fun itemSelectorEnabled(enabled: Boolean): WheelStyleBuilder = selectionIndicatorEnabled(enabled)

    /**
     * Включает или выключает индикатор выбранного элемента
     */
    fun selectionIndicatorEnabled(enabled: Boolean): WheelStyleBuilder

    /**
     * Устанавливает форму индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorShape",
        replaceWith = ReplaceWith("selectionIndicatorShape(shape)"),
    )
    fun itemSelectorShape(shape: StatefulValue<Shape>): WheelStyleBuilder = selectionIndicatorShape(shape)

    /**
     * Устанавливает форму индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorShape",
        replaceWith = ReplaceWith("selectionIndicatorShape(shape)"),
    )
    fun itemSelectorShape(shape: Shape): WheelStyleBuilder = selectionIndicatorShape(shape)

    /**
     * Устанавливает форму индикатора выбранного элемента
     */
    fun selectionIndicatorShape(shape: StatefulValue<Shape>): WheelStyleBuilder

    /**
     * Устанавливает форму индикатора выбранного элемента
     */
    fun selectionIndicatorShape(shape: Shape): WheelStyleBuilder =
        selectionIndicatorShape(shape.asStatefulValue())

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(builder: @Composable WheelColorsBuilder.() -> Unit): WheelStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(builder: @Composable WheelDimensionsBuilder.() -> Unit): WheelStyleBuilder
}

private class DefaultWheelStyle(
    override val dimensions: WheelDimensions,
    override val colors: WheelColors,
    override val itemTextStyle: TextStyle,
    override val itemTextAfterStyle: TextStyle,
    override val descriptionStyle: TextStyle,
    override val itemAlignment: WheelAlignment,
    override val wheelCount: Int,
    override val visibleItemsCount: Int,
    override val controlIconUp: Int?,
    override val controlIconDown: Int?,
    override val dividerStyle: DividerStyle,
    override val textAfterMode: TextAfterMode,
    override val selectionIndicatorEnabled: Boolean,
    override val selectionIndicatorShape: StatefulValue<Shape>,
) : WheelStyle {

    @Deprecated(
        "Не используется, используйте selectionIndicatorEnabled",
        replaceWith = ReplaceWith("selectionIndicatorEnabled"),
    )
    override val itemSelectorEnabled: Boolean = false

    @Deprecated(
        "Не используется, используйте selectionIndicatorShape",
        replaceWith = ReplaceWith("selectionIndicatorShape"),
    )
    override val itemSelectorShape: StatefulValue<Shape> = RectangleShape.asStatefulValue()

    class Builder : WheelStyleBuilder {
        private val colorsBuilder = WheelColors.builder()
        private val dimensionsBuilder = WheelDimensions.builder()
        private var itemTextStyle: TextStyle? = null
        private var itemTextAfterStyle: TextStyle? = null
        private var descriptionStyle: TextStyle? = null
        private var itemAlignment: WheelAlignment? = null
        private var wheelCount: Int? = null
        private var visibleItemsCount: Int? = null
        private var controlIconUp: Int? = null
        private var controlIconDown: Int? = null
        private var dividerStyle: DividerStyle? = null
        private var textAfterMode: TextAfterMode? = null
        private var selectionIndicatorEnabled: Boolean? = null
        private var selectionIndicatorShape: StatefulValue<Shape>? = null

        override fun itemTextStyle(itemTextStyle: TextStyle) = apply {
            this.itemTextStyle = itemTextStyle
        }

        override fun itemTextAfterStyle(itemTextAfterStyle: TextStyle) = apply {
            this.itemTextAfterStyle = itemTextAfterStyle
        }

        override fun descriptionStyle(descriptionStyle: TextStyle) = apply {
            this.descriptionStyle = descriptionStyle
        }

        override fun itemAlignment(itemAlignment: WheelAlignment) = apply {
            this.itemAlignment = itemAlignment
        }

        override fun wheelCount(wheelCount: Int) = apply {
            this.wheelCount = wheelCount
        }

        override fun visibleItemsCount(visibleItemsCount: Int) = apply {
            this.visibleItemsCount = visibleItemsCount
        }

        override fun controlIconUp(controlIconUp: Int) = apply {
            this.controlIconUp = controlIconUp
        }

        override fun controlIconDown(controlIconDown: Int) = apply {
            this.controlIconDown = controlIconDown
        }

        override fun dividerStyle(dividerStyle: DividerStyle) = apply {
            this.dividerStyle = dividerStyle
        }

        override fun textAfterMode(mode: TextAfterMode) = apply {
            this.textAfterMode = mode
        }

        override fun selectionIndicatorEnabled(enabled: Boolean) = apply {
            this.selectionIndicatorEnabled = enabled
        }

        override fun selectionIndicatorShape(shape: StatefulValue<Shape>) = apply {
            this.selectionIndicatorShape = shape
        }

        @Composable
        override fun colors(builder: @Composable (WheelColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (WheelDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun style(): WheelStyle {
            return DefaultWheelStyle(
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                itemTextStyle = itemTextStyle ?: TextStyle.Default,
                itemTextAfterStyle = itemTextAfterStyle ?: TextStyle.Default,
                descriptionStyle = descriptionStyle ?: TextStyle.Default,
                itemAlignment = itemAlignment ?: WheelAlignment.Center,
                wheelCount = wheelCount ?: 3,
                visibleItemsCount = visibleItemsCount ?: 5,
                controlIconUp = controlIconUp,
                controlIconDown = controlIconDown,
                dividerStyle = dividerStyle ?: DividerStyle.builder().style(),
                textAfterMode = textAfterMode ?: TextAfterMode.EachItem,
                selectionIndicatorEnabled = selectionIndicatorEnabled ?: false,
                selectionIndicatorShape = selectionIndicatorShape ?: RectangleShape.asStatefulValue(),
            )
        }
    }
}

/**
 * Цвета компонента Wheel
 */
@Immutable
interface WheelColors {

    /**
     * Цвет текста
     */
    val itemTextColor: InteractiveColor

    /**
     * Цвет дополнительного текста
     */
    val itemTextAfterColor: InteractiveColor

    /**
     * Цвет описания
     */
    val descriptionColor: InteractiveColor

    /**
     * Цвет верхнего контрола
     */
    val controlIconUpColor: InteractiveColor

    /**
     * Цвет нижнего контрола
     */
    val controlIconDownColor: InteractiveColor

    /**
     * Цвет разделителя
     */
    val separatorColor: InteractiveColor

    /**
     * Кисть индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorBrush",
        replaceWith = ReplaceWith("selectionIndicatorBrush"),
    )
    val itemSelectorBrush: StatefulValue<Brush>

    /**
     * Кисть индикатора выбранного элемента
     */
    val selectionIndicatorBrush: StatefulValue<Brush>

    companion object {

        /**
         * Создает экземпляр [WheelColorsBuilder]
         */
        fun builder(): WheelColorsBuilder = DefaultWheelColors.Builder()
    }
}

/**
 * Builder для [WheelColors]
 */
interface WheelColorsBuilder {
    /**
     * Устанавливает цвет текста [itemTextColor].
     */
    fun itemTextColor(itemTextColor: Color): WheelColorsBuilder =
        itemTextColor(itemTextColor.asInteractive())

    /**
     * Устанавливает цвет текста [itemTextColor].
     */
    fun itemTextColor(itemTextColor: InteractiveColor): WheelColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста [itemTextAfterColor].
     */
    fun itemTextAfterColor(itemTextAfterColor: Color): WheelColorsBuilder =
        itemTextAfterColor(itemTextAfterColor.asInteractive())

    /**
     * Устанавливает цвет дополнительного текста [itemTextAfterColor].
     */
    fun itemTextAfterColor(itemTextAfterColor: InteractiveColor): WheelColorsBuilder

    /**
     * Устанавливает цвет описания [descriptionColor].
     */
    fun descriptionColor(descriptionColor: Color): WheelColorsBuilder =
        descriptionColor(descriptionColor.asInteractive())

    /**
     * Устанавливает цвет описания [descriptionColor].
     */
    fun descriptionColor(descriptionColor: InteractiveColor): WheelColorsBuilder

    /**
     * Устанавливает цвет верхнего контрола [controlIconUpColor].
     */
    fun controlIconUpColor(controlIconUpColor: Color): WheelColorsBuilder =
        controlIconUpColor(controlIconUpColor.asInteractive())

    /**
     * Устанавливает цвет верхнего контрола [controlIconUpColor].
     */
    fun controlIconUpColor(controlIconUpColor: InteractiveColor): WheelColorsBuilder

    /**
     * Устанавливает цвет нижнего контрола [controlIconDownColor].
     */
    fun controlIconDownColor(controlIconDownColor: Color): WheelColorsBuilder =
        controlIconDownColor(controlIconDownColor.asInteractive())

    /**
     * Устанавливает цвет нижнего контрола [controlIconDownColor].
     */
    fun controlIconDownColor(controlIconDownColor: InteractiveColor): WheelColorsBuilder

    /**
     * Устанавливает цвет разделителя [separatorColor].
     */
    fun separatorColor(separatorColor: Color): WheelColorsBuilder =
        separatorColor(separatorColor.asInteractive())

    /**
     * Устанавливает цвет разделителя [separatorColor].
     */
    fun separatorColor(separatorColor: InteractiveColor): WheelColorsBuilder

    /**
     * Устанавливает кисть индикатора выбранного элемента [itemSelectorBrush].
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorColor",
        replaceWith = ReplaceWith("selectionIndicatorColor(brush)"),
    )
    fun itemSelectorColor(brush: StatefulValue<Brush>): WheelColorsBuilder =
        selectionIndicatorColor(brush)

    /**
     * Устанавливает кисть индикатора выбранного элемента [itemSelectorBrush].
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorColor",
        replaceWith = ReplaceWith("selectionIndicatorColor(brush)"),
    )
    fun itemSelectorColor(brush: Brush): WheelColorsBuilder =
        selectionIndicatorColor(brush)

    /**
     * Устанавливает кисть индикатора выбранного элемента [itemSelectorBrush].
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorColor",
        replaceWith = ReplaceWith("selectionIndicatorColor(color)"),
    )
    fun itemSelectorColor(color: Color): WheelColorsBuilder =
        selectionIndicatorColor(color)

    /**
     * Устанавливает кисть индикатора выбранного элемента [itemSelectorBrush].
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorColor",
        replaceWith = ReplaceWith("selectionIndicatorColor(color)"),
    )
    fun itemSelectorColor(color: InteractiveColor): WheelColorsBuilder =
        selectionIndicatorColor(color)

    /**
     * Устанавливает кисть индикатора выбранного элемента [selectionIndicatorBrush].
     */
    fun selectionIndicatorColor(brush: StatefulValue<Brush>): WheelColorsBuilder

    /**
     * Устанавливает кисть индикатора выбранного элемента [selectionIndicatorBrush].
     */
    fun selectionIndicatorColor(brush: Brush): WheelColorsBuilder =
        selectionIndicatorColor(brush.asStatefulValue())

    /**
     * Устанавливает кисть индикатора выбранного элемента [selectionIndicatorBrush].
     */
    fun selectionIndicatorColor(color: Color): WheelColorsBuilder =
        selectionIndicatorColor(color.asStatefulBrush())

    /**
     * Устанавливает кисть индикатора выбранного элемента [selectionIndicatorBrush].
     */
    fun selectionIndicatorColor(color: InteractiveColor): WheelColorsBuilder =
        selectionIndicatorColor(color.asStatefulBrush())

    /**
     * Создает экземпляр [WheelColors]
     */
    fun build(): WheelColors
}

@Immutable
private data class DefaultWheelColors(
    override val itemTextColor: InteractiveColor,
    override val itemTextAfterColor: InteractiveColor,
    override val descriptionColor: InteractiveColor,
    override val controlIconUpColor: InteractiveColor,
    override val controlIconDownColor: InteractiveColor,
    override val separatorColor: InteractiveColor,
    override val selectionIndicatorBrush: StatefulValue<Brush>,
) : WheelColors {

    @Deprecated(
        "Не используется, используйте selectionIndicatorBrush",
        replaceWith = ReplaceWith("selectionIndicatorBrush"),
    )
    override val itemSelectorBrush: StatefulValue<Brush> = Color.Transparent.asStatefulBrush()

    class Builder : WheelColorsBuilder {
        private var itemTextColor: InteractiveColor? = null
        private var itemTextAfterColor: InteractiveColor? = null
        private var descriptionColor: InteractiveColor? = null
        private var controlIconUpColor: InteractiveColor? = null
        private var controlIconDownColor: InteractiveColor? = null
        private var separatorColor: InteractiveColor? = null
        private var selectionIndicatorBrush: StatefulValue<Brush>? = null

        override fun itemTextColor(itemTextColor: InteractiveColor) = apply {
            this.itemTextColor = itemTextColor
        }

        override fun itemTextAfterColor(itemTextAfterColor: InteractiveColor) = apply {
            this.itemTextAfterColor = itemTextAfterColor
        }

        override fun descriptionColor(descriptionColor: InteractiveColor) = apply {
            this.descriptionColor = descriptionColor
        }

        override fun controlIconUpColor(controlIconUpColor: InteractiveColor) = apply {
            this.controlIconUpColor = controlIconUpColor
        }

        override fun controlIconDownColor(controlIconDownColor: InteractiveColor) = apply {
            this.controlIconDownColor = controlIconDownColor
        }

        override fun separatorColor(separatorColor: InteractiveColor) = apply {
            this.separatorColor = separatorColor
        }

        override fun selectionIndicatorColor(brush: StatefulValue<Brush>) = apply {
            this.selectionIndicatorBrush = brush
        }

        override fun build(): WheelColors {
            return DefaultWheelColors(
                itemTextColor = itemTextColor ?: Color.Black.asInteractive(),
                itemTextAfterColor = itemTextAfterColor ?: Color.DarkGray.asInteractive(),
                descriptionColor = descriptionColor ?: Color.Gray.asInteractive(),
                controlIconUpColor = controlIconUpColor ?: Color.DarkGray.asInteractive(),
                controlIconDownColor = controlIconDownColor ?: Color.DarkGray.asInteractive(),
                separatorColor = separatorColor ?: Color.Black.asInteractive(),
                selectionIndicatorBrush = selectionIndicatorBrush ?: Color.Transparent.asStatefulBrush(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface WheelDimensions {

    /**
     * Отступ дополнительного текста
     */
    val itemTextAfterPadding: Dp

    /**
     * Отступ описания
     */
    val descriptionPadding: Dp

    /**
     * Ширина разделителя
     */
    val separatorSpacing: Dp

    /**
     * Расстояние между элементами в колесе
     */
    val itemMinSpacing: Dp

    /**
     * Верхний отступ индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingTop",
        replaceWith = ReplaceWith("selectionIndicatorPaddingTop"),
    )
    val itemSelectorPaddingTop: StatefulValue<Dp>

    /**
     * Верхний отступ индикатора выбранного элемента
     */
    val selectionIndicatorPaddingTop: StatefulValue<Dp>

    /**
     * Нижний отступ индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingBottom",
        replaceWith = ReplaceWith("selectionIndicatorPaddingBottom"),
    )
    val itemSelectorPaddingBottom: StatefulValue<Dp>

    /**
     * Нижний отступ индикатора выбранного элемента
     */
    val selectionIndicatorPaddingBottom: StatefulValue<Dp>

    /**
     * Начальный отступ индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingStart",
        replaceWith = ReplaceWith("selectionIndicatorPaddingStart"),
    )
    val itemSelectorPaddingStart: StatefulValue<Dp>

    /**
     * Начальный отступ индикатора выбранного элемента
     */
    val selectionIndicatorPaddingStart: StatefulValue<Dp>

    /**
     * Конечный отступ индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingEnd",
        replaceWith = ReplaceWith("selectionIndicatorPaddingEnd"),
    )
    val itemSelectorPaddingEnd: StatefulValue<Dp>

    /**
     * Конечный отступ индикатора выбранного элемента
     */
    val selectionIndicatorPaddingEnd: StatefulValue<Dp>

    companion object {
        /**
         * Создает экземпляр [WheelDimensionsBuilder]
         */
        fun builder(): WheelDimensionsBuilder = DefaultWheelDimensions.Builder()
    }
}

/**
 * Builder для [WheelDimensions]
 */
interface WheelDimensionsBuilder {
    /**
     * Устанавливает отступ дополнительного текста
     */
    fun itemTextAfterPadding(itemTextAfterPadding: Dp): WheelDimensionsBuilder

    /**
     * Устанавливает отступ описания
     */
    fun descriptionPadding(descriptionPadding: Dp): WheelDimensionsBuilder

    /**
     * Устанавливает ширину разделителя
     */
    fun separatorSpacing(separatorSpacing: Dp): WheelDimensionsBuilder

    /**
     * Устанавливает расстояние между элементами в колесе
     */
    fun itemMinSpacing(itemMinSpacing: Dp): WheelDimensionsBuilder

    /**
     * Устанавливает верхний отступ индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingTop",
        replaceWith = ReplaceWith("selectionIndicatorPaddingTop(padding)"),
    )
    fun itemSelectorPaddingTop(padding: StatefulValue<Dp>): WheelDimensionsBuilder =
        selectionIndicatorPaddingTop(padding)

    /**
     * Устанавливает верхний отступ индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingTop",
        replaceWith = ReplaceWith("selectionIndicatorPaddingTop(padding)"),
    )
    fun itemSelectorPaddingTop(padding: Dp): WheelDimensionsBuilder =
        selectionIndicatorPaddingTop(padding)

    /**
     * Устанавливает нижний отступ индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingBottom",
        replaceWith = ReplaceWith("selectionIndicatorPaddingBottom(padding)"),
    )
    fun itemSelectorPaddingBottom(padding: StatefulValue<Dp>): WheelDimensionsBuilder =
        selectionIndicatorPaddingBottom(padding)

    /**
     * Устанавливает нижний отступ индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingBottom",
        replaceWith = ReplaceWith("selectionIndicatorPaddingBottom(padding)"),
    )
    fun itemSelectorPaddingBottom(padding: Dp): WheelDimensionsBuilder =
        selectionIndicatorPaddingBottom(padding)

    /**
     * Устанавливает начальный отступ индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingStart",
        replaceWith = ReplaceWith("selectionIndicatorPaddingStart(padding)"),
    )
    fun itemSelectorPaddingStart(padding: StatefulValue<Dp>): WheelDimensionsBuilder =
        selectionIndicatorPaddingStart(padding)

    /**
     * Устанавливает начальный отступ индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingStart",
        replaceWith = ReplaceWith("selectionIndicatorPaddingStart(padding)"),
    )
    fun itemSelectorPaddingStart(padding: Dp): WheelDimensionsBuilder =
        selectionIndicatorPaddingStart(padding)

    /**
     * Устанавливает конечный отступ индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingEnd",
        replaceWith = ReplaceWith("selectionIndicatorPaddingEnd(padding)"),
    )
    fun itemSelectorPaddingEnd(padding: StatefulValue<Dp>): WheelDimensionsBuilder =
        selectionIndicatorPaddingEnd(padding)

    /**
     * Устанавливает конечный отступ индикатора выбранного элемента
     */
    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingEnd",
        replaceWith = ReplaceWith("selectionIndicatorPaddingEnd(padding)"),
    )
    fun itemSelectorPaddingEnd(padding: Dp): WheelDimensionsBuilder =
        selectionIndicatorPaddingEnd(padding)

    /**
     * Устанавливает верхний отступ индикатора выбранного элемента
     */
    fun selectionIndicatorPaddingTop(padding: StatefulValue<Dp>): WheelDimensionsBuilder

    /**
     * Устанавливает верхний отступ индикатора выбранного элемента
     */
    fun selectionIndicatorPaddingTop(padding: Dp): WheelDimensionsBuilder =
        selectionIndicatorPaddingTop(padding.asStatefulValue())

    /**
     * Устанавливает нижний отступ индикатора выбранного элемента
     */
    fun selectionIndicatorPaddingBottom(padding: StatefulValue<Dp>): WheelDimensionsBuilder

    /**
     * Устанавливает нижний отступ индикатора выбранного элемента
     */
    fun selectionIndicatorPaddingBottom(padding: Dp): WheelDimensionsBuilder =
        selectionIndicatorPaddingBottom(padding.asStatefulValue())

    /**
     * Устанавливает начальный отступ индикатора выбранного элемента
     */
    fun selectionIndicatorPaddingStart(padding: StatefulValue<Dp>): WheelDimensionsBuilder

    /**
     * Устанавливает начальный отступ индикатора выбранного элемента
     */
    fun selectionIndicatorPaddingStart(padding: Dp): WheelDimensionsBuilder =
        selectionIndicatorPaddingStart(padding.asStatefulValue())

    /**
     * Устанавливает конечный отступ индикатора выбранного элемента
     */
    fun selectionIndicatorPaddingEnd(padding: StatefulValue<Dp>): WheelDimensionsBuilder

    /**
     * Устанавливает конечный отступ индикатора выбранного элемента
     */
    fun selectionIndicatorPaddingEnd(padding: Dp): WheelDimensionsBuilder =
        selectionIndicatorPaddingEnd(padding.asStatefulValue())

    /**
     * Создает экземпляр [WheelDimensions]
     */
    fun build(): WheelDimensions
}

private class DefaultWheelDimensions(
    override val itemTextAfterPadding: Dp,
    override val descriptionPadding: Dp,
    override val separatorSpacing: Dp,
    override val itemMinSpacing: Dp,
    override val selectionIndicatorPaddingTop: StatefulValue<Dp>,
    override val selectionIndicatorPaddingBottom: StatefulValue<Dp>,
    override val selectionIndicatorPaddingStart: StatefulValue<Dp>,
    override val selectionIndicatorPaddingEnd: StatefulValue<Dp>,
) : WheelDimensions {

    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingTop",
        replaceWith = ReplaceWith("selectionIndicatorPaddingTop"),
    )
    override val itemSelectorPaddingTop: StatefulValue<Dp> = 0.dp.asStatefulValue()

    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingBottom",
        replaceWith = ReplaceWith("selectionIndicatorPaddingBottom"),
    )
    override val itemSelectorPaddingBottom: StatefulValue<Dp> = 0.dp.asStatefulValue()

    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingStart",
        replaceWith = ReplaceWith("selectionIndicatorPaddingStart"),
    )
    override val itemSelectorPaddingStart: StatefulValue<Dp> = 0.dp.asStatefulValue()

    @Deprecated(
        "Не используется, используйте selectionIndicatorPaddingEnd",
        replaceWith = ReplaceWith("selectionIndicatorPaddingEnd"),
    )
    override val itemSelectorPaddingEnd: StatefulValue<Dp> = 0.dp.asStatefulValue()

    class Builder : WheelDimensionsBuilder {

        private var itemTextAfterPadding: Dp? = null
        private var descriptionPadding: Dp? = null
        private var separatorSpacing: Dp? = null
        private var itemMinSpacing: Dp? = null
        private var selectionIndicatorPaddingTop: StatefulValue<Dp>? = null
        private var selectionIndicatorPaddingBottom: StatefulValue<Dp>? = null
        private var selectionIndicatorPaddingStart: StatefulValue<Dp>? = null
        private var selectionIndicatorPaddingEnd: StatefulValue<Dp>? = null

        override fun itemTextAfterPadding(itemTextAfterPadding: Dp) = apply {
            this.itemTextAfterPadding = itemTextAfterPadding
        }

        override fun descriptionPadding(descriptionPadding: Dp) = apply {
            this.descriptionPadding = descriptionPadding
        }

        override fun separatorSpacing(separatorSpacing: Dp) = apply {
            this.separatorSpacing = separatorSpacing
        }

        override fun itemMinSpacing(itemMinSpacing: Dp) = apply {
            this.itemMinSpacing = itemMinSpacing
        }

        override fun selectionIndicatorPaddingTop(padding: StatefulValue<Dp>) = apply {
            this.selectionIndicatorPaddingTop = padding
        }

        override fun selectionIndicatorPaddingBottom(padding: StatefulValue<Dp>) = apply {
            this.selectionIndicatorPaddingBottom = padding
        }

        override fun selectionIndicatorPaddingStart(padding: StatefulValue<Dp>) = apply {
            this.selectionIndicatorPaddingStart = padding
        }

        override fun selectionIndicatorPaddingEnd(padding: StatefulValue<Dp>) = apply {
            this.selectionIndicatorPaddingEnd = padding
        }

        override fun build(): WheelDimensions {
            val zeroPadding = 0.dp.asStatefulValue()
            return DefaultWheelDimensions(
                itemTextAfterPadding = itemTextAfterPadding ?: 2.dp,
                descriptionPadding = descriptionPadding ?: 2.dp,
                separatorSpacing = separatorSpacing ?: 20.dp,
                itemMinSpacing = itemMinSpacing ?: 4.dp,
                selectionIndicatorPaddingTop = selectionIndicatorPaddingTop ?: zeroPadding,
                selectionIndicatorPaddingBottom = selectionIndicatorPaddingBottom ?: zeroPadding,
                selectionIndicatorPaddingStart = selectionIndicatorPaddingStart ?: zeroPadding,
                selectionIndicatorPaddingEnd = selectionIndicatorPaddingEnd ?: zeroPadding,
            )
        }
    }
}
