package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [TabItemStyle] для компонента [TabItem]
 */
val LocalTabItemStyle =
    compositionLocalOf(structuralEqualityPolicy()) { TabItemStyle.builder().style() }

/**
 * Стиль компонента [TabItem]
 */
@Immutable
interface TabItemStyle : Style {

    /**
     * Форма компонента
     */
    val shape: CornerBasedShape

    /**
     * Стиль основного текста
     */
    val labelStyle: TextStyle

    /**
     * Стиль дополнительного текста
     */
    val valueStyle: TextStyle

    /**
     * Цвета компонента [TabItem]
     */
    val colors: TabItemColors

    /**
     * Размеры и отступы компонента [TabItem]
     */
    val dimensions: TabItemDimensions

    /**
     * Иконка действия
     */
    @get:DrawableRes
    val actionIcon: Int?

    /**
     * Стиль каунтера [Counter]
     */
    val counterStyle: CounterStyle

    /**
     * Значение альфы в состоянии disabled
     */
    val disableAlpha: Float

    companion object {
        /**
         * Возвращает экземпляр [TabItemStyleBuilder]
         */
        fun builder(receiver: Any? = null): TabItemStyleBuilder =
            DefaultTabItemStyle.Builder()
    }
}

/**
 * Билдер стиля [TabItemStyle]
 */
interface TabItemStyleBuilder : StyleBuilder<TabItemStyle> {

    /**
     * Устанавливает форму компонента
     */
    fun shape(shape: CornerBasedShape): TabItemStyleBuilder

    /**
     * Устанавливает альфу [disabledAlpha] в состоянии disabled
     */
    fun disableAlpha(disabledAlpha: Float): TabItemStyleBuilder

    /**
     * Устанавливает стиль основного текста
     */
    fun labelStyle(labelStyle: TextStyle): TabItemStyleBuilder

    /**
     * Устанавливает стиль дополнительного текста
     */
    fun valueStyle(valueStyle: TextStyle): TabItemStyleBuilder

    /**
     * Устанавливает цвета компонента [TabItem]
     */
    @Composable
    fun colors(builder: @Composable TabItemColorsBuilder.() -> Unit): TabItemStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [TabItem]
     */
    @Composable
    fun dimensions(builder: @Composable TabItemDimensionsBuilder.() -> Unit): TabItemStyleBuilder

    /**
     * Устанавливает иконку действия [actionIcon]
     */
    fun actionIcon(@DrawableRes actionIcon: Int): TabItemStyleBuilder

    /**
     * Устанавливает стиль [Counter]
     */
    fun counterStyle(counterStyle: CounterStyle): TabItemStyleBuilder
}

@Immutable
private class DefaultTabItemStyle(
    override val shape: CornerBasedShape,
    override val labelStyle: TextStyle,
    override val valueStyle: TextStyle,
    override val colors: TabItemColors,
    override val dimensions: TabItemDimensions,
    override val counterStyle: CounterStyle,
    override val actionIcon: Int?,
    override val disableAlpha: Float,
) : TabItemStyle {

    class Builder : TabItemStyleBuilder {
        private var disabledAlpha: Float? = null
        private var shape: CornerBasedShape? = null
        private var labelStyle: TextStyle? = null
        private var valueStyle: TextStyle? = null
        private var colorsBuilder: TabItemColorsBuilder = TabItemColors.builder()
        private var dimensionsBuilder: TabItemDimensionsBuilder =
            TabItemDimensions.builder()
        private var actionIcon: Int? = null
        private var counterStyle: CounterStyle? = null

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun disableAlpha(disabledAlpha: Float) = apply {
            this.disabledAlpha = disabledAlpha
        }

        override fun labelStyle(labelStyle: TextStyle) = apply {
            this.labelStyle = labelStyle
        }

        override fun valueStyle(valueStyle: TextStyle) = apply {
            this.valueStyle = valueStyle
        }

        @Composable
        override fun colors(builder: @Composable (TabItemColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (TabItemDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun actionIcon(actionIcon: Int) = apply {
            this.actionIcon = actionIcon
        }

        override fun counterStyle(counterStyle: CounterStyle) = apply {
            this.counterStyle = counterStyle
        }

        override fun style(): TabItemStyle {
            return DefaultTabItemStyle(
                shape = shape ?: RoundedCornerShape(25),
                labelStyle = labelStyle ?: TextStyle.Default,
                valueStyle = valueStyle ?: TextStyle.Default,
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                actionIcon = actionIcon,
                counterStyle = counterStyle ?: CounterStyle.builder().style(),
                disableAlpha = disabledAlpha ?: 0.4F,
            )
        }
    }
}

/**
 * Цвета компонента [TabItem]
 */
@Immutable
interface TabItemColors {

    /**
     * Цвет фона
     */
    @Deprecated(
        "Use backgroundFillStyle",
        replaceWith = ReplaceWith("backgroundFillStyle"),
    )
    val backgroundColor: StatefulValue<Color>

    /**
     * Кисть фона
     */
    val backgroundBrush: StatefulValue<Brush>

    /**
     * Цвет основного текста
     */
    @Deprecated(
        "Use labelFillStyle",
        replaceWith = ReplaceWith("labelFillStyle"),
    )
    val labelColor: StatefulValue<Color>

    /**
     * Кисть основного текста
     */
    val labelBrush: StatefulValue<Brush>

    /**
     * Цвет дополнительного текста
     */
    @Deprecated(
        "Use valueFillStyle",
        replaceWith = ReplaceWith("valueFillStyle"),
    )
    val valueColor: StatefulValue<Color>

    /**
     * Кисть дополнительного текста
     */
    val valueBrush: StatefulValue<Brush>

    /**
     * Цвет контента в начале
     */
    @Deprecated(
        "Use startContentFillStyle",
        replaceWith = ReplaceWith("startContentFillStyle"),
    )
    val startContentColor: StatefulValue<Color>

    /**
     * Кисть контента в начале
     */
    val startContentBrush: StatefulValue<Brush>

    /**
     * Цвет контента в конце
     */
    @Deprecated(
        "Use endContentFillStyle",
        replaceWith = ReplaceWith("endContentFillStyle"),
    )
    val endContentColor: StatefulValue<Color>

    /**
     * Кисть контента в конце
     */
    val endContentBrush: StatefulValue<Brush>

    /**
     * Цвет иконки действия
     */
    @Deprecated(
        "Use actionFillStyle",
        replaceWith = ReplaceWith("actionFillStyle"),
    )
    val actionColor: StatefulValue<Color>

    /**
     * Кисть иконки действия
     */
    val actionBrush: StatefulValue<Brush>

    companion object {

        /**
         * Возвращает экземпляр [TabItemColorsBuilder]
         */
        fun builder(): TabItemColorsBuilder = DefaultTabItemColors.Builder()
    }
}

/**
 * Билдер для [TabItemColors]
 */
interface TabItemColorsBuilder {

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(backgroundColor: Color): TabItemColorsBuilder =
        backgroundBrush(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(backgroundColor: StatefulValue<Color>): TabItemColorsBuilder =
        backgroundBrush(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисть фона
     */
    fun backgroundBrush(backgroundBrush: StatefulValue<Brush>): TabItemColorsBuilder

    /**
     * Устанавливает цвет основного текста
     */
    fun labelColor(labelColor: Color): TabItemColorsBuilder =
        labelBrush(labelColor.asStatefulBrush())

    /**
     * Устанавливает цвет основного текста
     */
    fun labelColor(labelColor: StatefulValue<Color>): TabItemColorsBuilder =
        labelBrush(labelColor.asStatefulBrush())

    /**
     * Устанавливает кисть основного текста
     */
    fun labelBrush(labelBrush: StatefulValue<Brush>): TabItemColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста
     */
    fun valueColor(valueColor: Color): TabItemColorsBuilder =
        valueBrush(valueColor.asStatefulBrush())

    /**
     * Устанавливает цвет дополнительного текста
     */
    fun valueColor(valueColor: StatefulValue<Color>): TabItemColorsBuilder =
        valueBrush(valueColor.asStatefulBrush())

    /**
     * Устанавливает кисть дополнительного текста
     */
    fun valueBrush(valueBrush: StatefulValue<Brush>): TabItemColorsBuilder

    /**
     * Устанавливает цвет контента в начале
     */
    fun startContentColor(startContentColor: Color): TabItemColorsBuilder =
        startContentBrush(startContentColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента в начале
     */
    fun startContentColor(startContentColor: StatefulValue<Color>): TabItemColorsBuilder =
        startContentBrush(startContentColor.asStatefulBrush())

    /**
     * Устанавливает кисть контента в начале
     */
    fun startContentBrush(startContentBrush: StatefulValue<Brush>): TabItemColorsBuilder

    /**
     * Устанавливает цвет контента в конце
     */
    fun endContentColor(endContentColor: Color): TabItemColorsBuilder =
        endContentBrush(endContentColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента в конце
     */
    fun endContentColor(endContentColor: StatefulValue<Color>): TabItemColorsBuilder =
        endContentBrush(endContentColor.asStatefulBrush())

    /**
     * Устанавливает кисть контента в конце
     */
    fun endContentBrush(endContentBrush: StatefulValue<Brush>): TabItemColorsBuilder

    /**
     * Устанавливает цвет иконки действия
     */
    fun actionColor(actionColor: Color): TabItemColorsBuilder =
        actionBrush(actionColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки действия
     */
    fun actionColor(actionColor: StatefulValue<Color>): TabItemColorsBuilder =
        actionBrush(actionColor.asStatefulBrush())

    /**
     * Устанавливает кисть иконки действия
     */
    fun actionBrush(actionBrush: StatefulValue<Brush>): TabItemColorsBuilder

    /**
     * Возвращает [TabItemColors]
     */
    fun build(): TabItemColors
}

@Immutable
private class DefaultTabItemColors(
    override val backgroundBrush: StatefulValue<Brush>,
    override val labelBrush: StatefulValue<Brush>,
    override val valueBrush: StatefulValue<Brush>,
    override val startContentBrush: StatefulValue<Brush>,
    override val endContentBrush: StatefulValue<Brush>,
    override val actionBrush: StatefulValue<Brush>,
) : TabItemColors {

    @Deprecated("Use backgroundFillStyle", replaceWith = ReplaceWith("backgroundFillStyle"))
    override val backgroundColor: StatefulValue<Color> = Color.Transparent.asStatefulValue()

    @Deprecated("Use labelFillStyle", replaceWith = ReplaceWith("labelFillStyle"))
    override val labelColor: StatefulValue<Color> = Color.Transparent.asStatefulValue()

    @Deprecated("Use valueFillStyle", replaceWith = ReplaceWith("valueFillStyle"))
    override val valueColor: StatefulValue<Color> = Color.Transparent.asStatefulValue()

    @Deprecated("Use startContentFillStyle", replaceWith = ReplaceWith("startContentFillStyle"))
    override val startContentColor: StatefulValue<Color> = Color.Transparent.asStatefulValue()

    @Deprecated("Use endContentFillStyle", replaceWith = ReplaceWith("endContentFillStyle"))
    override val endContentColor: StatefulValue<Color> = Color.Transparent.asStatefulValue()

    @Deprecated("Use actionFillStyle", replaceWith = ReplaceWith("actionFillStyle"))
    override val actionColor: StatefulValue<Color> = Color.Transparent.asStatefulValue()

    class Builder : TabItemColorsBuilder {
        private var backgroundBrush: StatefulValue<Brush>? = null
        private var labelBrush: StatefulValue<Brush>? = null
        private var valueBrush: StatefulValue<Brush>? = null
        private var startContentBrush: StatefulValue<Brush>? = null
        private var endContentBrush: StatefulValue<Brush>? = null
        private var actionBrush: StatefulValue<Brush>? = null

        override fun backgroundBrush(backgroundBrush: StatefulValue<Brush>) = apply {
            this.backgroundBrush = backgroundBrush
        }

        override fun labelBrush(labelBrush: StatefulValue<Brush>) = apply {
            this.labelBrush = labelBrush
        }

        override fun valueBrush(valueBrush: StatefulValue<Brush>) = apply {
            this.valueBrush = valueBrush
        }

        override fun startContentBrush(startContentBrush: StatefulValue<Brush>) = apply {
            this.startContentBrush = startContentBrush
        }

        override fun endContentBrush(endContentBrush: StatefulValue<Brush>) = apply {
            this.endContentBrush = endContentBrush
        }

        override fun actionBrush(actionBrush: StatefulValue<Brush>) = apply {
            this.actionBrush = actionBrush
        }

        override fun build(): TabItemColors {
            return DefaultTabItemColors(
                backgroundBrush = backgroundBrush ?: Color.Transparent.asStatefulBrush(),
                labelBrush = labelBrush ?: Color.Transparent.asStatefulBrush(),
                valueBrush = valueBrush ?: Color.Transparent.asStatefulBrush(),
                startContentBrush = startContentBrush ?: Color.Transparent.asStatefulBrush(),
                endContentBrush = endContentBrush ?: Color.Transparent.asStatefulBrush(),
                actionBrush = actionBrush ?: Color.Transparent.asStatefulBrush(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента [TabItem]
 */
@Immutable
interface TabItemDimensions {

    /**
     * Минимальная высота
     */
    val minHeight: Dp

    /**
     * Минимальная ширина
     */
    val minWidth: Dp

    /**
     * Отступ в начале
     */
    val paddingStart: Dp

    /**
     * Отступ в конце
     */
    val paddingEnd: Dp

    /**
     * Размер контента в начале
     */
    val startContentSize: Dp

    /**
     * Размер контента в конце
     */
    val endContentSize: Dp

    /**
     * Отступ иконки
     */
    val iconPadding: Dp

    /**
     * Отступ счетчика [Counter]
     */
    val counterPadding: Dp

    /**
     * Отступ дополнительного текста
     */
    val valuePadding: Dp

    /**
     * Отступ иконки действия
     */
    val actionPadding: Dp

    /**
     * Размер иконки действия
     */
    val actionSize: Dp

    /**
     * Горизонтальное смещение счетчика вправо
     */
    val counterOffsetX: Dp

    /**
     * Вертикальное смещение счетчика вверх
     */
    val counterOffsetY: Dp

    companion object {

        /**
         * Возвращает экземпляр [TabItemDimensionsBuilder]
         */
        fun builder(): TabItemDimensionsBuilder = DefaultTabItemDimensions.Builder()
    }
}

/**
 * Билдер для [TabItemDimensions]
 */
interface TabItemDimensionsBuilder {

    /**
     * Устанавливает минимальную высоту
     */
    fun minHeight(minHeight: Dp): TabItemDimensionsBuilder

    /**
     * Устанавливает минимальную ширину
     */
    fun minWidth(minWidth: Dp): TabItemDimensionsBuilder

    /**
     * Устанавливает отступ в начале
     */
    fun paddingStart(paddingStart: Dp): TabItemDimensionsBuilder

    /**
     * Устанавливает отступ в конце
     */
    fun paddingEnd(paddingEnd: Dp): TabItemDimensionsBuilder

    /**
     * Устанавливает размер контента в начале
     */
    fun startContentSize(startContentSize: Dp): TabItemDimensionsBuilder

    /**
     * Устанавливает размер контента в конце
     */
    fun endContentSize(endContentSize: Dp): TabItemDimensionsBuilder

    /**
     * Устанавливает отступ иконки
     */
    fun iconPadding(iconPadding: Dp): TabItemDimensionsBuilder

    /**
     * Устанавливает отступ счетчика
     */
    fun counterPadding(counterPadding: Dp): TabItemDimensionsBuilder

    /**
     * Устанавливает отступ дополнительного текста
     */
    fun valuePadding(valuePadding: Dp): TabItemDimensionsBuilder

    /**
     * Устанавливает отступ иконки действия
     */
    fun actionPadding(actionPadding: Dp): TabItemDimensionsBuilder

    /**
     * Устанавливает размер иконки действия
     */
    fun actionSize(actionSize: Dp): TabItemDimensionsBuilder

    /**
     * Устанавливает горизонтальное смещение счетчика вправо
     */
    fun counterOffsetX(counterOffsetX: Dp): TabItemDimensionsBuilder

    /**
     * Устанавливает вертикальное смещение счетчика вправо
     */
    fun counterOffsetY(counterOffsetY: Dp): TabItemDimensionsBuilder

    /**
     * Вернет [TabItemDimensions]
     */
    fun build(): TabItemDimensions
}

@Immutable
private class DefaultTabItemDimensions(
    override val minHeight: Dp,
    override val minWidth: Dp,
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val startContentSize: Dp,
    override val endContentSize: Dp,
    override val iconPadding: Dp,
    override val counterPadding: Dp,
    override val valuePadding: Dp,
    override val actionPadding: Dp,
    override val actionSize: Dp,
    override val counterOffsetX: Dp,
    override val counterOffsetY: Dp,
) : TabItemDimensions {

    class Builder : TabItemDimensionsBuilder {
        private var minHeight: Dp? = null
        private var minWidth: Dp? = null
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var startContentSize: Dp? = null
        private var endContentSize: Dp? = null
        private var iconPadding: Dp? = null
        private var counterPadding: Dp? = null
        private var valuePadding: Dp? = null
        private var actionPadding: Dp? = null
        private var actionSize: Dp? = null
        private var counterOffsetX: Dp? = null
        private var counterOffsetY: Dp? = null

        override fun minHeight(minHeight: Dp) = apply {
            this.minHeight = minHeight
        }

        override fun minWidth(minWidth: Dp) = apply {
            this.minWidth = minWidth
        }

        override fun paddingStart(paddingStart: Dp) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: Dp) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun startContentSize(startContentSize: Dp) = apply {
            this.startContentSize = startContentSize
        }

        override fun endContentSize(endContentSize: Dp) = apply {
            this.endContentSize = endContentSize
        }

        override fun iconPadding(iconPadding: Dp) = apply {
            this.iconPadding = iconPadding
        }

        override fun counterPadding(counterPadding: Dp) = apply {
            this.counterPadding = counterPadding
        }

        override fun valuePadding(valuePadding: Dp) = apply {
            this.valuePadding = valuePadding
        }

        override fun actionPadding(actionPadding: Dp) = apply {
            this.actionPadding = actionPadding
        }

        override fun actionSize(actionSize: Dp) = apply {
            this.actionSize = actionSize
        }

        override fun counterOffsetX(counterOffsetX: Dp) = apply {
            this.counterOffsetX = counterOffsetX
        }

        override fun counterOffsetY(counterOffsetY: Dp) = apply {
            this.counterOffsetY = counterOffsetY
        }

        override fun build(): TabItemDimensions {
            return DefaultTabItemDimensions(
                minHeight = minHeight ?: 32.dp,
                minWidth = minWidth ?: 32.dp,
                paddingStart = paddingStart ?: 0.dp,
                paddingEnd = paddingEnd ?: 0.dp,
                startContentSize = startContentSize ?: 24.dp,
                endContentSize = endContentSize ?: 24.dp,
                iconPadding = iconPadding ?: 4.dp,
                counterPadding = counterPadding ?: 8.dp,
                valuePadding = valuePadding ?: 4.dp,
                actionPadding = actionPadding ?: 4.dp,
                actionSize = actionSize ?: Dp.Unspecified,
                counterOffsetX = counterOffsetX ?: 0.dp,
                counterOffsetY = counterOffsetY ?: 0.dp,
            )
        }
    }
}
