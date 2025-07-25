package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [TabBarItemStyle] для компонента [TabBarItem]
 */
val LocalTabBarItemStyle: ProvidableCompositionLocal<TabBarItemStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { TabBarItemStyle.builder().style() }

/**
 * Стиль компонента
 */
@Immutable
interface TabBarItemStyle : Style {
    /**
     * Стиль лэйбла
     */
    val labelStyle: TextStyle

    /**
     * Размещение лэйбла
     */
    val labelPlacement: TabBarLabelPlacement

    /**
     * Форма компонента
     */
    val shape: Shape

    /**
     * Цвета компонента
     */
    val colors: TabBarItemColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: TabBarItemDimensions

    /**
     * Стиль счетчика
     */
    val counterStyle: CounterStyle

    /**
     * Стиль бэйджа
     */
    val badgeStyle: BadgeStyle

    /**
     * Стиль индикатора
     */
    val indicatorStyle: IndicatorStyle

    companion object {
        /**
         * Возвращает экземпляр [TabBarItemStyleBuilder]
         */
        fun builder(receiver: Any? = null): TabBarItemStyleBuilder =
            DefaultTabBarItemStyle.Builder()
    }
}

/**
 * Билдер стиля компонента
 */
interface TabBarItemStyleBuilder : StyleBuilder<TabBarItemStyle> {
    /**
     * Устанавливает форму [shape]
     */
    fun shape(shape: Shape): TabBarItemStyleBuilder

    /**
     * Устанавливает стиль текста лэйбла [labelStyle]
     */
    fun labelStyle(labelStyle: TextStyle): TabBarItemStyleBuilder

    /**
     * Устанавливает размещение лэйбла [labelPlacement]
     */
    fun labelPlacement(labelPlacement: TabBarLabelPlacement): TabBarItemStyleBuilder

    /**
     * Устанавливает цвета компонента с помощью [builder]
     */
    @Composable
    fun colors(builder: @Composable TabBarItemColorsBuilder.() -> Unit): TabBarItemStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента с помощью [builder]
     */
    @Composable
    fun dimensions(builder: @Composable TabBarItemDimensionsBuilder.() -> Unit): TabBarItemStyleBuilder

    /**
     * Устанавливает стиль счетчика [counterStyle]
     */
    fun counterStyle(counterStyle: CounterStyle): TabBarItemStyleBuilder

    /**
     * Устанавливает стиль бэйджа [badgeStyle]
     */
    fun badgeStyle(badgeStyle: BadgeStyle): TabBarItemStyleBuilder

    /**
     * Устанавливает стиль индикатора [indicatorStyle]
     */
    fun indicatorStyle(indicatorStyle: IndicatorStyle): TabBarItemStyleBuilder
}

private data class DefaultTabBarItemStyle(
    override val labelStyle: TextStyle,
    override val shape: Shape,
    override val colors: TabBarItemColors,
    override val dimensions: TabBarItemDimensions,
    override val counterStyle: CounterStyle,
    override val badgeStyle: BadgeStyle,
    override val indicatorStyle: IndicatorStyle,
    override val labelPlacement: TabBarLabelPlacement,
) : TabBarItemStyle {
    class Builder : TabBarItemStyleBuilder {
        private var labelStyle: TextStyle? = null
        private var shape: Shape? = null
        private val colorsBuilder: TabBarItemColorsBuilder = TabBarItemColors.builder()
        private val dimensionsBuilder: TabBarItemDimensionsBuilder = TabBarItemDimensions.builder()
        private var counterStyle: CounterStyle? = null
        private var badgeStyle: BadgeStyle? = null
        private var indicatorStyle: IndicatorStyle? = null
        private var labelPlacement: TabBarLabelPlacement? = null

        override fun shape(shape: Shape): TabBarItemStyleBuilder = apply { this.shape = shape }

        override fun labelStyle(labelStyle: TextStyle): TabBarItemStyleBuilder = apply {
            this.labelStyle = labelStyle
        }

        override fun labelPlacement(labelPlacement: TabBarLabelPlacement) = apply {
            this.labelPlacement = labelPlacement
        }

        @Composable
        override fun colors(builder: @Composable TabBarItemColorsBuilder.() -> Unit):
            TabBarItemStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable TabBarItemDimensionsBuilder.() -> Unit):
            TabBarItemStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun counterStyle(counterStyle: CounterStyle) = apply {
            this.counterStyle = counterStyle
        }

        override fun badgeStyle(badgeStyle: BadgeStyle) = apply {
            this.badgeStyle = badgeStyle
        }

        override fun indicatorStyle(indicatorStyle: IndicatorStyle) = apply {
            this.indicatorStyle = indicatorStyle
        }

        override fun style(): TabBarItemStyle = DefaultTabBarItemStyle(
            shape = shape ?: RectangleShape,
            labelStyle = labelStyle ?: TextStyle.Default,
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
            counterStyle = counterStyle ?: CounterStyle.builder().style(),
            badgeStyle = badgeStyle ?: BadgeStyle.badgeBuilder().style(),
            indicatorStyle = indicatorStyle ?: IndicatorStyle.builder().style(),
            labelPlacement = labelPlacement ?: TabBarLabelPlacement.None,
        )
    }
}

/**
 * Цвета компонента
 */
@Immutable
interface TabBarItemColors {
    /**
     * Цвет фона
     */
    val backgroundColor: StatefulValue<Color>

    /**
     * Цвет лэйбла
     */
    val labelColor: StatefulValue<Color>

    /**
     * Цвет иконки
     */
    val iconColor: StatefulValue<Color>

    companion object {
        /**
         * Возвращает экземпляр [TabBarItemColorsBuilder]
         */
        fun builder(): TabBarItemColorsBuilder = DefaultTabBarItemColors.Builder()
    }
}

/**
 * Билдер для [TabBarItemColors]
 */
interface TabBarItemColorsBuilder {
    /**
     * Устанавливает цвет фона [backgroundColor]
     */
    fun backgroundColor(backgroundColor: StatefulValue<Color>): TabBarItemColorsBuilder

    /**
     * Устанавливает цвет фона [backgroundColor]
     */
    fun backgroundColor(backgroundColor: Color): TabBarItemColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает цвет лэйбла [labelColor]
     */
    fun labelColor(labelColor: StatefulValue<Color>): TabBarItemColorsBuilder

    /**
     * Устанавливает цвет лэйбла [labelColor]
     */
    fun labelColor(labelColor: Color): TabBarItemColorsBuilder =
        labelColor(labelColor.asStatefulValue())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: StatefulValue<Color>): TabBarItemColorsBuilder

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: Color): TabBarItemColorsBuilder =
        iconColor(iconColor.asStatefulValue())

    /**
     * Вернёт [TabBarItemColors]
     */
    fun build(): TabBarItemColors
}

private data class DefaultTabBarItemColors(
    override val backgroundColor: StatefulValue<Color>,
    override val labelColor: StatefulValue<Color>,
    override val iconColor: StatefulValue<Color>,
) : TabBarItemColors {
    class Builder : TabBarItemColorsBuilder {
        private var backgroundColor: StatefulValue<Color>? = null

        private var labelColor: StatefulValue<Color>? = null

        private var iconColor: StatefulValue<Color>? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Color>): TabBarItemColorsBuilder =
            apply { this.backgroundColor = backgroundColor }

        override fun labelColor(labelColor: StatefulValue<Color>): TabBarItemColorsBuilder = apply {
            this.labelColor = labelColor
        }

        override fun iconColor(iconColor: StatefulValue<Color>): TabBarItemColorsBuilder = apply {
            this.iconColor = iconColor
        }

        override fun build(): TabBarItemColors = DefaultTabBarItemColors(
            backgroundColor = backgroundColor ?: Color.White.asStatefulValue(),
            labelColor = labelColor ?: Color.Black.asStatefulValue(),
            iconColor = iconColor ?: Color.Black.asStatefulValue(),
        )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface TabBarItemDimensions {
    /**
     * Отступ в начале
     */
    val paddingStart: Dp

    /**
     * Отступ в конце
     */
    val paddingEnd: Dp

    /**
     * Отступ сверху
     */
    val paddingTop: Dp

    /**
     * Отступ снизу
     */
    val paddingBottom: Dp

    /**
     * Отступ лэйбла
     */
    val labelPadding: Dp

    /**
     * Размер иконки
     */
    val iconSize: Dp

    /**
     * Минимальная высота элемента
     */
    val minHeight: Dp

    companion object {
        /**
         * Возвращает экземпляр [TabBarItemDimensionsBuilder]
         */
        fun builder(): TabBarItemDimensionsBuilder = DefaultTabBarItemDimensions.Builder()
    }
}

/**
 * Билдер для [TabBarItemDimensions]
 */
interface TabBarItemDimensionsBuilder {
    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): TabBarItemDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): TabBarItemDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): TabBarItemDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): TabBarItemDimensionsBuilder

    /**
     * Устанавливает отступ лэйбла [labelPadding]
     */
    fun labelPadding(labelPadding: Dp): TabBarItemDimensionsBuilder

    /**
     * Устанавливает размер иконки [iconSize]
     */
    fun iconSize(iconSize: Dp): TabBarItemDimensionsBuilder

    /**
     * Устанавливает минимальную высоту элемента [minHeight]
     */
    fun minHeight(minHeight: Dp): TabBarItemDimensionsBuilder

    /**
     * Вернёт [TabBarItemDimensions]
     */
    fun build(): TabBarItemDimensions
}

private data class DefaultTabBarItemDimensions(
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val labelPadding: Dp,
    override val iconSize: Dp,
    override val minHeight: Dp,
) : TabBarItemDimensions {
    class Builder : TabBarItemDimensionsBuilder {
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var paddingTop: Dp? = null
        private var paddingBottom: Dp? = null
        private var labelPadding: Dp? = null
        private var iconSize: Dp? = null
        private var minHeight: Dp? = null

        override fun paddingStart(paddingStart: Dp): TabBarItemDimensionsBuilder = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: Dp): TabBarItemDimensionsBuilder = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: Dp): TabBarItemDimensionsBuilder = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: Dp): TabBarItemDimensionsBuilder = apply {
            this.paddingBottom = paddingBottom
        }

        override fun labelPadding(labelPadding: Dp): TabBarItemDimensionsBuilder = apply {
            this.labelPadding = labelPadding
        }

        override fun iconSize(iconSize: Dp): TabBarItemDimensionsBuilder = apply {
            this.iconSize = iconSize
        }

        override fun minHeight(minHeight: Dp): TabBarItemDimensionsBuilder = apply {
            this.minHeight = minHeight
        }

        override fun build(): TabBarItemDimensions = DefaultTabBarItemDimensions(
            paddingStart = paddingStart ?: 0.dp,
            paddingEnd = paddingEnd ?: 0.dp,
            paddingTop = paddingTop ?: 0.dp,
            paddingBottom = paddingBottom ?: 0.dp,
            labelPadding = labelPadding ?: 0.dp,
            iconSize = iconSize ?: 32.dp,
            minHeight = minHeight ?: 48.dp,
        )
    }
}
