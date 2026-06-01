package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
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
    @Deprecated("Use labelStyleValue instead")
    val labelStyle: TextStyle

    /**
     * Стиль лэйбла с поддержкой состояний
     */
    val labelStyleValue: StatefulValue<TextStyle>

    /**
     * Размещение лэйбла
     */
    val labelPlacement: TabBarLabelPlacement

    /**
     * Форма компонента
     */
    @Deprecated("Use shapeValue instead")
    val shape: Shape

    /**
     * Форма компонента с поддержкой состояний
     */
    val shapeValue: StatefulValue<Shape>

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
    fun shape(shape: StatefulValue<Shape>): TabBarItemStyleBuilder

    /**
     * Устанавливает форму [shape]
     */
    fun shape(shape: Shape): TabBarItemStyleBuilder = shape(shape.asStatefulValue())

    /**
     * Устанавливает стиль текста лэйбла [labelStyle]
     */
    fun labelStyle(labelStyle: StatefulValue<TextStyle>): TabBarItemStyleBuilder

    /**
     * Устанавливает стиль текста лэйбла [labelStyle]
     */
    fun labelStyle(labelStyle: TextStyle): TabBarItemStyleBuilder = labelStyle(labelStyle.asStatefulValue())

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
    override val labelStyleValue: StatefulValue<TextStyle>,
    override val shapeValue: StatefulValue<Shape>,
    override val colors: TabBarItemColors,
    override val dimensions: TabBarItemDimensions,
    override val counterStyle: CounterStyle,
    override val badgeStyle: BadgeStyle,
    override val indicatorStyle: IndicatorStyle,
    override val labelPlacement: TabBarLabelPlacement,
) : TabBarItemStyle {
    @Deprecated("Use labelStyleValue instead")
    override val labelStyle: TextStyle = labelStyleValue.getDefaultValue()

    @Deprecated("Use shapeValue instead")
    override val shape: Shape = shapeValue.getDefaultValue()

    class Builder : TabBarItemStyleBuilder {
        private var labelStyle: StatefulValue<TextStyle>? = null
        private var shape: StatefulValue<Shape>? = null
        private val colorsBuilder: TabBarItemColorsBuilder = TabBarItemColors.builder()
        private val dimensionsBuilder: TabBarItemDimensionsBuilder = TabBarItemDimensions.builder()
        private var counterStyle: CounterStyle? = null
        private var badgeStyle: BadgeStyle? = null
        private var indicatorStyle: IndicatorStyle? = null
        private var labelPlacement: TabBarLabelPlacement? = null

        override fun shape(shape: StatefulValue<Shape>): TabBarItemStyleBuilder = apply { this.shape = shape }

        override fun labelStyle(labelStyle: StatefulValue<TextStyle>): TabBarItemStyleBuilder = apply {
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
            shapeValue = shape ?: RectangleShape.asStatefulValue(),
            labelStyleValue = labelStyle ?: TextStyle.Default.asStatefulValue(),
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
    @Deprecated("Use background instead")
    val backgroundColor: InteractiveColor

    /**
     * Цвет фона
     */
    val background: StatefulValue<Brush>

    /**
     * Цвет лэйбла
     */
    @Deprecated("Use label instead")
    val labelColor: InteractiveColor

    /**
     * Цвет лэйбла
     */
    val label: StatefulValue<Brush>

    /**
     * Цвет иконки
     */
    @Deprecated("Use icon instead")
    val iconColor: InteractiveColor

    /**
     * Цвет иконки
     */
    val icon: StatefulValue<Brush>

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
    fun backgroundColor(backgroundColor: InteractiveColor): TabBarItemColorsBuilder =
        background(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона [backgroundColor]
     */
    fun backgroundColor(backgroundColor: Color): TabBarItemColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет фона [backgroundColor]
     */
    @Deprecated(
        message = "Use backgroundColor(InteractiveColor) instead",
        replaceWith = ReplaceWith(
            expression = "backgroundColor(backgroundColor.getDefaultValue().asInteractive())",
            imports = ["com.sdds.compose.uikit.interactions.asInteractive"],
        ),
    )
    fun backgroundColor(backgroundColor: StatefulValue<Color>): TabBarItemColorsBuilder =
        background(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает фон [background].
     */
    fun background(background: Brush): TabBarItemColorsBuilder =
        background(background.asStatefulValue())

    /**
     * Устанавливает фон [background].
     */
    fun background(background: StatefulValue<Brush>): TabBarItemColorsBuilder

    /**
     * Устанавливает цвет лэйбла [labelColor]
     */
    fun labelColor(labelColor: InteractiveColor): TabBarItemColorsBuilder =
        label(labelColor.asStatefulBrush())

    /**
     * Устанавливает цвет лэйбла [labelColor]
     */
    fun labelColor(labelColor: Color): TabBarItemColorsBuilder =
        labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет лэйбла [labelColor]
     */
    @Deprecated(
        message = "Use labelColor(InteractiveColor) instead",
        replaceWith = ReplaceWith(
            expression = "labelColor(labelColor.getDefaultValue().asInteractive())",
            imports = ["com.sdds.compose.uikit.interactions.asInteractive"],
        ),
    )
    fun labelColor(labelColor: StatefulValue<Color>): TabBarItemColorsBuilder =
        label(labelColor.asStatefulBrush())

    /**
     * Устанавливает цвет лэйбла [label].
     */
    fun label(label: Brush): TabBarItemColorsBuilder =
        label(label.asStatefulValue())

    /**
     * Устанавливает цвет лэйбла [label].
     */
    fun label(label: StatefulValue<Brush>): TabBarItemColorsBuilder

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: InteractiveColor): TabBarItemColorsBuilder =
        icon(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: Color): TabBarItemColorsBuilder =
        iconColor(iconColor.asInteractive())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    @Deprecated(
        message = "Use iconColor(InteractiveColor) instead",
        replaceWith = ReplaceWith(
            expression = "iconColor(iconColor.getDefaultValue().asInteractive())",
            imports = ["com.sdds.compose.uikit.interactions.asInteractive"],
        ),
    )
    fun iconColor(iconColor: StatefulValue<Color>): TabBarItemColorsBuilder =
        icon(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки [icon].
     */
    fun icon(icon: Brush): TabBarItemColorsBuilder =
        icon(icon.asStatefulValue())

    /**
     * Устанавливает цвет иконки [icon].
     */
    fun icon(icon: StatefulValue<Brush>): TabBarItemColorsBuilder

    /**
     * Вернёт [TabBarItemColors]
     */
    fun build(): TabBarItemColors
}

private data class DefaultTabBarItemColors(
    @Deprecated("Use background instead")
    override val backgroundColor: InteractiveColor,
    @Deprecated("Use label instead")
    override val labelColor: InteractiveColor,
    @Deprecated("Use icon instead")
    override val iconColor: InteractiveColor,
    override val background: StatefulValue<Brush>,
    override val label: StatefulValue<Brush>,
    override val icon: StatefulValue<Brush>,
) : TabBarItemColors {
    class Builder : TabBarItemColorsBuilder {
        private var background: StatefulValue<Brush>? = null

        private var label: StatefulValue<Brush>? = null

        private var icon: StatefulValue<Brush>? = null

        override fun background(background: StatefulValue<Brush>): TabBarItemColorsBuilder =
            apply { this.background = background }

        override fun label(label: StatefulValue<Brush>): TabBarItemColorsBuilder = apply {
            this.label = label
        }

        override fun icon(icon: StatefulValue<Brush>): TabBarItemColorsBuilder = apply {
            this.icon = icon
        }

        override fun build(): TabBarItemColors {
            val background = background ?: Color.White.asStatefulBrush()
            val label = label ?: Color.Black.asStatefulBrush()
            val icon = icon ?: Color.Black.asStatefulBrush()
            return DefaultTabBarItemColors(
                backgroundColor = background.defaultInteractiveColor(),
                labelColor = label.defaultInteractiveColor(),
                iconColor = icon.defaultInteractiveColor(),
                background = background,
                label = label,
                icon = icon,
            )
        }
    }
}

private fun StatefulValue<Brush>.defaultInteractiveColor(): InteractiveColor {
    return ((getDefaultValue() as? SolidColor)?.value ?: Color.Unspecified).asInteractive()
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface TabBarItemDimensions {
    /**
     * Отступ в начале
     */
    @Deprecated("Use paddingStartValue instead")
    val paddingStart: Dp

    /**
     * Отступ в начале с поддержкой состояний
     */
    val paddingStartValue: StatefulValue<Dp>

    /**
     * Отступ в конце
     */
    @Deprecated("Use paddingEndValue instead")
    val paddingEnd: Dp

    /**
     * Отступ в конце с поддержкой состояний
     */
    val paddingEndValue: StatefulValue<Dp>

    /**
     * Отступ сверху
     */
    @Deprecated("Use paddingTopValue instead")
    val paddingTop: Dp

    /**
     * Отступ сверху с поддержкой состояний
     */
    val paddingTopValue: StatefulValue<Dp>

    /**
     * Отступ снизу
     */
    @Deprecated("Use paddingBottomValue instead")
    val paddingBottom: Dp

    /**
     * Отступ снизу с поддержкой состояний
     */
    val paddingBottomValue: StatefulValue<Dp>

    /**
     * Отступ лэйбла
     */
    @Deprecated("Use labelPaddingValue instead")
    val labelPadding: Dp

    /**
     * Отступ лэйбла с поддержкой состояний
     */
    val labelPaddingValue: StatefulValue<Dp>

    /**
     * Размер иконки
     */
    @Deprecated("Use iconSizeValue instead")
    val iconSize: Dp

    /**
     * Размер иконки с поддержкой состояний
     */
    val iconSizeValue: StatefulValue<Dp>

    /**
     * Минимальная высота элемента
     */
    @Deprecated("Use minHeightValue instead")
    val minHeight: Dp

    /**
     * Минимальная высота элемента с поддержкой состояний
     */
    val minHeightValue: StatefulValue<Dp>

    /**
     * Горизонтальное смещение extra-слота
     */
    val extraOffsetX: StatefulValue<Dp>

    /**
     * Вертикальное смещение extra-слота
     */
    val extraOffsetY: StatefulValue<Dp>

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
    fun paddingStart(paddingStart: Dp): TabBarItemDimensionsBuilder = paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): TabBarItemDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): TabBarItemDimensionsBuilder = paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): TabBarItemDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): TabBarItemDimensionsBuilder = paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): TabBarItemDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): TabBarItemDimensionsBuilder = paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): TabBarItemDimensionsBuilder

    /**
     * Устанавливает отступ лэйбла [labelPadding]
     */
    fun labelPadding(labelPadding: Dp): TabBarItemDimensionsBuilder = labelPadding(labelPadding.asStatefulValue())

    /**
     * Устанавливает отступ лэйбла [labelPadding]
     */
    fun labelPadding(labelPadding: StatefulValue<Dp>): TabBarItemDimensionsBuilder

    /**
     * Устанавливает размер иконки [iconSize]
     */
    fun iconSize(iconSize: Dp): TabBarItemDimensionsBuilder = iconSize(iconSize.asStatefulValue())

    /**
     * Устанавливает размер иконки [iconSize]
     */
    fun iconSize(iconSize: StatefulValue<Dp>): TabBarItemDimensionsBuilder

    /**
     * Устанавливает минимальную высоту элемента [minHeight]
     */
    fun minHeight(minHeight: Dp): TabBarItemDimensionsBuilder = minHeight(minHeight.asStatefulValue())

    /**
     * Устанавливает минимальную высоту элемента [minHeight]
     */
    fun minHeight(minHeight: StatefulValue<Dp>): TabBarItemDimensionsBuilder

    /**
     * Устанавливает горизонтальное смещение extra-слота [extraOffsetX]
     */
    fun extraOffsetX(extraOffsetX: Dp): TabBarItemDimensionsBuilder =
        extraOffsetX(extraOffsetX.asStatefulValue())

    /**
     * Устанавливает горизонтальное смещение extra-слота [extraOffsetX]
     */
    fun extraOffsetX(extraOffsetX: StatefulValue<Dp>): TabBarItemDimensionsBuilder

    /**
     * Устанавливает вертикальное смещение extra-слота [extraOffsetY]
     */
    fun extraOffsetY(extraOffsetY: Dp): TabBarItemDimensionsBuilder =
        extraOffsetY(extraOffsetY.asStatefulValue())

    /**
     * Устанавливает вертикальное смещение extra-слота [extraOffsetY]
     */
    fun extraOffsetY(extraOffsetY: StatefulValue<Dp>): TabBarItemDimensionsBuilder

    /**
     * Вернёт [TabBarItemDimensions]
     */
    fun build(): TabBarItemDimensions
}

private data class DefaultTabBarItemDimensions(
    override val paddingStartValue: StatefulValue<Dp>,
    override val paddingEndValue: StatefulValue<Dp>,
    override val paddingTopValue: StatefulValue<Dp>,
    override val paddingBottomValue: StatefulValue<Dp>,
    override val labelPaddingValue: StatefulValue<Dp>,
    override val iconSizeValue: StatefulValue<Dp>,
    override val minHeightValue: StatefulValue<Dp>,
    override val extraOffsetX: StatefulValue<Dp>,
    override val extraOffsetY: StatefulValue<Dp>,
) : TabBarItemDimensions {
    @Deprecated("Use paddingStartValue instead")
    override val paddingStart: Dp = paddingStartValue.getDefaultValue()

    @Deprecated("Use paddingEndValue instead")
    override val paddingEnd: Dp = paddingEndValue.getDefaultValue()

    @Deprecated("Use paddingTopValue instead")
    override val paddingTop: Dp = paddingTopValue.getDefaultValue()

    @Deprecated("Use paddingBottomValue instead")
    override val paddingBottom: Dp = paddingBottomValue.getDefaultValue()

    @Deprecated("Use labelPaddingValue instead")
    override val labelPadding: Dp = labelPaddingValue.getDefaultValue()

    @Deprecated("Use iconSizeValue instead")
    override val iconSize: Dp = iconSizeValue.getDefaultValue()

    @Deprecated("Use minHeightValue instead")
    override val minHeight: Dp = minHeightValue.getDefaultValue()

    class Builder : TabBarItemDimensionsBuilder {
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null
        private var labelPadding: StatefulValue<Dp>? = null
        private var iconSize: StatefulValue<Dp>? = null
        private var minHeight: StatefulValue<Dp>? = null
        private var extraOffsetX: StatefulValue<Dp>? = null
        private var extraOffsetY: StatefulValue<Dp>? = null

        override fun paddingStart(paddingStart: StatefulValue<Dp>): TabBarItemDimensionsBuilder = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>): TabBarItemDimensionsBuilder = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: StatefulValue<Dp>): TabBarItemDimensionsBuilder = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>): TabBarItemDimensionsBuilder = apply {
            this.paddingBottom = paddingBottom
        }

        override fun labelPadding(labelPadding: StatefulValue<Dp>): TabBarItemDimensionsBuilder = apply {
            this.labelPadding = labelPadding
        }

        override fun iconSize(iconSize: StatefulValue<Dp>): TabBarItemDimensionsBuilder = apply {
            this.iconSize = iconSize
        }

        override fun minHeight(minHeight: StatefulValue<Dp>): TabBarItemDimensionsBuilder = apply {
            this.minHeight = minHeight
        }

        override fun extraOffsetX(extraOffsetX: StatefulValue<Dp>): TabBarItemDimensionsBuilder = apply {
            this.extraOffsetX = extraOffsetX
        }

        override fun extraOffsetY(extraOffsetY: StatefulValue<Dp>): TabBarItemDimensionsBuilder = apply {
            this.extraOffsetY = extraOffsetY
        }

        override fun build(): TabBarItemDimensions = DefaultTabBarItemDimensions(
            paddingStartValue = paddingStart ?: 0.dp.asStatefulValue(),
            paddingEndValue = paddingEnd ?: 0.dp.asStatefulValue(),
            paddingTopValue = paddingTop ?: 0.dp.asStatefulValue(),
            paddingBottomValue = paddingBottom ?: 0.dp.asStatefulValue(),
            labelPaddingValue = labelPadding ?: 0.dp.asStatefulValue(),
            iconSizeValue = iconSize ?: 32.dp.asStatefulValue(),
            minHeightValue = minHeight ?: 48.dp.asStatefulValue(),
            extraOffsetX = extraOffsetX ?: Dp.Unspecified.asStatefulValue(),
            extraOffsetY = extraOffsetY ?: Dp.Unspecified.asStatefulValue(),
        )
    }
}
