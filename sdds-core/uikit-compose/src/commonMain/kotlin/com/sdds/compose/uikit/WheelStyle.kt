package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
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
) : WheelStyle {

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
) : WheelColors {

    class Builder : WheelColorsBuilder {
        private var itemTextColor: InteractiveColor? = null
        private var itemTextAfterColor: InteractiveColor? = null
        private var descriptionColor: InteractiveColor? = null
        private var controlIconUpColor: InteractiveColor? = null
        private var controlIconDownColor: InteractiveColor? = null
        private var separatorColor: InteractiveColor? = null

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

        override fun build(): WheelColors {
            return DefaultWheelColors(
                itemTextColor = itemTextColor ?: Color.Black.asInteractive(),
                itemTextAfterColor = itemTextAfterColor ?: Color.DarkGray.asInteractive(),
                descriptionColor = descriptionColor ?: Color.Gray.asInteractive(),
                controlIconUpColor = controlIconUpColor ?: Color.DarkGray.asInteractive(),
                controlIconDownColor = controlIconDownColor ?: Color.DarkGray.asInteractive(),
                separatorColor = separatorColor ?: Color.Black.asInteractive(),
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
     * Создает экземпляр [WheelDimensions]
     */
    fun build(): WheelDimensions
}

private class DefaultWheelDimensions(
    override val itemTextAfterPadding: Dp,
    override val descriptionPadding: Dp,
    override val separatorSpacing: Dp,
    override val itemMinSpacing: Dp,
) : WheelDimensions {

    class Builder : WheelDimensionsBuilder {

        private var itemTextAfterPadding: Dp? = null
        private var descriptionPadding: Dp? = null
        private var separatorSpacing: Dp? = null
        private var itemMinSpacing: Dp? = null

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

        override fun build(): WheelDimensions {
            return DefaultWheelDimensions(
                itemTextAfterPadding = itemTextAfterPadding ?: 2.dp,
                descriptionPadding = descriptionPadding ?: 2.dp,
                separatorSpacing = separatorSpacing ?: 20.dp,
                itemMinSpacing = itemMinSpacing ?: 4.dp,
            )
        }
    }
}
