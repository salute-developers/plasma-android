package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
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
 * CompositionLocal, предоставляющий текущий [NavigationDrawerItemStyle].
 */
val LocalNavigationDrawerItemStyle = compositionLocalOf(structuralEqualityPolicy()) {
    NavigationDrawerItemStyle.builder().style()
}

/**
 * Стиль [NavigationDrawerItem].
 */
@Stable
interface NavigationDrawerItemStyle : Style {
    /**
     * Форма item-а.
     */
    val shape: StatefulValue<Shape>

    /**
     * Цвета item-а.
     */
    val colors: NavigationDrawerItemColors

    /**
     * Размеры item-а.
     */
    val dimensions: NavigationDrawerItemDimensions

    /**
     * Стили тайтла.
     */
    val titleStyles: StatefulValue<TextStyle>

    /**
     * Стили текста disclosure.
     */
    val disclosureTextStyles: StatefulValue<TextStyle>

    /**
     * Стиль [Badge], используемых в [NavigationDrawerItem].
     */
    val badgeStyle: BadgeStyle

    /**
     * Стиль [Counter], используемых в [NavigationDrawerItem].
     */
    val counterStyle: CounterStyle

    companion object {
        /**
         * Возвращает builder для [NavigationDrawerItemStyle].
         */
        fun builder(receiver: Any? = null): NavigationDrawerItemStyleBuilder =
            DefaultNavigationDrawerItemStyle.Builder(receiver)
    }
}

/**
 * Цвета [NavigationDrawerItem].
 */
@Stable
interface NavigationDrawerItemColors {
    /**
     * Фон элемента.
     */
    val background: StatefulValue<Brush>

    /**
     * Цвет заголовка.
     */
    val title: StatefulValue<Brush>

    /**
     * Цвет иконки вначале.
     */
    val icon: StatefulValue<Brush>
}

/**
 * Размеры [NavigationDrawerItem].
 */
@Stable
interface NavigationDrawerItemDimensions {
    /**
     * Минимальная высота item-а.
     */
    val minHeight: StatefulValue<Dp>

    /**
     * Размер icon/start зоны.
     */
    val iconSize: StatefulValue<Dp>

    /**
     * Отступ по горизонтали indicator-а в collapsed состоянии.
     */
    val indicatorOffsetX: StatefulValue<Dp>

    /**
     * Отступ по вертикали indicator-а в collapsed состоянии.
     */
    val indicatorOffsetY: StatefulValue<Dp>

    /**
     * Внутренний отступ слева.
     */
    val paddingStart: StatefulValue<Dp>

    /**
     * Внутренний отступ справа.
     */
    val paddingEnd: StatefulValue<Dp>

    /**
     * Внутренний отступ сверху.
     */
    val paddingTop: StatefulValue<Dp>

    /**
     * Внутренний отступ снизу.
     */
    val paddingBottom: StatefulValue<Dp>

    /**
     * Отступ между start и center контентом.
     */
    val contentPaddingStart: StatefulValue<Dp>

    /**
     * Отступ между center и end контентом.
     */
    val contentPaddingEnd: StatefulValue<Dp>
}

/**
 * Builder [NavigationDrawerItemStyle].
 */
@ApiInfo
interface NavigationDrawerItemStyleBuilder : StyleBuilder<NavigationDrawerItemStyle> {
    /**
     * Устанавливает стиль тайтла.
     */
    fun titleStyle(titleStyle: TextStyle): NavigationDrawerItemStyleBuilder =
        titleStyle(titleStyle.asStatefulValue())

    /**
     * Устанавливает стили тайтла.
     */
    fun titleStyle(titleStyle: StatefulValue<TextStyle>): NavigationDrawerItemStyleBuilder

    /**
     * Устанавливает стиль текста disclosure.
     */
    fun disclosureTextStyle(disclosureStyle: TextStyle): NavigationDrawerItemStyleBuilder =
        disclosureTextStyle(disclosureStyle.asStatefulValue())

    /**
     * Устанавливает стили текста disclosure.
     */
    fun disclosureTextStyle(disclosureStyle: StatefulValue<TextStyle>): NavigationDrawerItemStyleBuilder

    /**
     * Устанавливает цвета item-а.
     */
    @Composable
    fun colors(builder: @Composable NavigationDrawerItemColorsBuilder.() -> Unit): NavigationDrawerItemStyleBuilder

    /**
     * Устанавливает размеры item-а.
     */
    @Composable
    fun dimensions(
        builder: @Composable NavigationDrawerItemDimensionsBuilder.() -> Unit,
    ): NavigationDrawerItemStyleBuilder

    /**
     * Устанавливает стиль компонентов [Badge].
     */
    fun badgeStyle(badgeStyle: BadgeStyle): NavigationDrawerItemStyleBuilder

    /**
     * Устанавливает стиль компонентов [Counter].
     */
    fun counterStyle(counterStyle: CounterStyle): NavigationDrawerItemStyleBuilder

    /**
     * Устанавливает форму item-а.
     */
    fun shape(shape: StatefulValue<Shape>): NavigationDrawerItemStyleBuilder

    /**
     * Устанавливает форму item-а.
     */
    fun shape(shape: Shape): NavigationDrawerItemStyleBuilder = shape(shape.asStatefulValue())
}

/**
 * Builder цветов [NavigationDrawerItem].
 */
interface NavigationDrawerItemColorsBuilder {
    /**
     * Устанавливает фон item-а.
     */
    fun backgroundColor(background: StatefulValue<Brush>): NavigationDrawerItemColorsBuilder

    /**
     * Устанавливает фон item-а.
     */
    fun backgroundColor(background: InteractiveColor): NavigationDrawerItemColorsBuilder =
        backgroundColor(background.asStatefulBrush())

    /**
     * Устанавливает фон item-а.
     */
    fun backgroundColor(background: Color): NavigationDrawerItemColorsBuilder =
        backgroundColor(background.asStatefulBrush())

    /**
     * Устанавливает фон item-а.
     */
    fun backgroundColor(background: Brush): NavigationDrawerItemColorsBuilder =
        backgroundColor(background.asStatefulValue())

    /**
     * Устанавливает цвет тайтла.
     */
    fun titleColor(titleColor: StatefulValue<Brush>): NavigationDrawerItemColorsBuilder

    /**
     * Устанавливает цвет тайтла.
     */
    fun titleColor(titleColor: InteractiveColor): NavigationDrawerItemColorsBuilder =
        titleColor(titleColor.asStatefulBrush())

    /**
     * Устанавливает цвет тайтла.
     */
    fun titleColor(titleColor: Color): NavigationDrawerItemColorsBuilder =
        titleColor(titleColor.asInteractive())

    /**
     * Устанавливает цвет тайтла.
     */
    fun titleColor(titleColor: Brush): NavigationDrawerItemColorsBuilder =
        titleColor(titleColor.asStatefulValue())

    /**
     * Устанавливает цвет icon/start контента.
     */
    fun iconColor(icon: StatefulValue<Brush>): NavigationDrawerItemColorsBuilder

    /**
     * Устанавливает цвет icon/start контента.
     */
    fun iconColor(icon: InteractiveColor): NavigationDrawerItemColorsBuilder = iconColor(icon.asStatefulBrush())

    /**
     * Устанавливает цвет icon/start контента.
     */
    fun iconColor(icon: Color): NavigationDrawerItemColorsBuilder = iconColor(icon.asStatefulBrush())

    /**
     * Устанавливает цвет icon/start контента.
     */
    fun iconColor(icon: Brush): NavigationDrawerItemColorsBuilder = iconColor(icon.asStatefulValue())

    /**
     * Возвращает готовые цвета.
     */
    fun build(): NavigationDrawerItemColors
}

/**
 * Builder размеров [NavigationDrawerItem].
 */
interface NavigationDrawerItemDimensionsBuilder {
    /**
     * Устанавливает минимальную высоту item-а.
     */
    fun minHeight(minHeight: StatefulValue<Dp>): NavigationDrawerItemDimensionsBuilder

    /**
     * Устанавливает минимальную высоту item-а.
     */
    fun minHeight(minHeight: Dp): NavigationDrawerItemDimensionsBuilder = minHeight(minHeight.asStatefulValue())

    /**
     * Устанавливает размер icon/start зоны.
     */
    fun iconSize(iconSize: StatefulValue<Dp>): NavigationDrawerItemDimensionsBuilder

    /**
     * Устанавливает размер icon/start зоны.
     */
    fun iconSize(iconSize: Dp): NavigationDrawerItemDimensionsBuilder = iconSize(iconSize.asStatefulValue())

    /**
     * Устанавливает отступ indicator-а в collapsed состоянии.
     */
    fun indicatorOffsetX(indicatorOffset: StatefulValue<Dp>): NavigationDrawerItemDimensionsBuilder

    /**
     * Устанавливает отступ indicator-а в collapsed состоянии.
     */
    fun indicatorOffsetX(indicatorOffset: Dp): NavigationDrawerItemDimensionsBuilder =
        indicatorOffsetX(indicatorOffset.asStatefulValue())

    /**
     * Устанавливает отступ indicator-а в collapsed состоянии.
     */
    fun indicatorOffsetY(indicatorOffset: StatefulValue<Dp>): NavigationDrawerItemDimensionsBuilder

    /**
     * Устанавливает отступ indicator-а в collapsed состоянии.
     */
    fun indicatorOffsetY(indicatorOffset: Dp): NavigationDrawerItemDimensionsBuilder =
        indicatorOffsetY(indicatorOffset.asStatefulValue())

    /**
     * Устанавливает внутренний отступ слева.
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): NavigationDrawerItemDimensionsBuilder

    /**
     * Устанавливает внутренний отступ слева.
     */
    fun paddingStart(paddingStart: Dp): NavigationDrawerItemDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает внутренний отступ справа.
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): NavigationDrawerItemDimensionsBuilder

    /**
     * Устанавливает внутренний отступ справа.
     */
    fun paddingEnd(paddingEnd: Dp): NavigationDrawerItemDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает внутренний отступ сверху.
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): NavigationDrawerItemDimensionsBuilder

    /**
     * Устанавливает внутренний отступ сверху.
     */
    fun paddingTop(paddingTop: Dp): NavigationDrawerItemDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает внутренний отступ снизу.
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): NavigationDrawerItemDimensionsBuilder

    /**
     * Устанавливает внутренний отступ снизу.
     */
    fun paddingBottom(paddingBottom: Dp): NavigationDrawerItemDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступ между start и center контентом.
     */
    fun contentPaddingStart(contentPaddingStart: StatefulValue<Dp>): NavigationDrawerItemDimensionsBuilder

    /**
     * Устанавливает отступ между start и center контентом.
     */
    fun contentPaddingStart(contentPaddingStart: Dp): NavigationDrawerItemDimensionsBuilder =
        contentPaddingStart(contentPaddingStart.asStatefulValue())

    /**
     * Устанавливает отступ между center и end контентом.
     */
    fun contentPaddingEnd(contentPaddingEnd: StatefulValue<Dp>): NavigationDrawerItemDimensionsBuilder

    /**
     * Устанавливает отступ между center и end контентом.
     */
    fun contentPaddingEnd(contentPaddingEnd: Dp): NavigationDrawerItemDimensionsBuilder =
        contentPaddingEnd(contentPaddingEnd.asStatefulValue())

    /**
     * Возвращает готовые размеры.
     */
    fun build(): NavigationDrawerItemDimensions
}

@Immutable
private data class DefaultNavigationDrawerItemStyle(
    override val shape: StatefulValue<Shape>,
    override val colors: NavigationDrawerItemColors,
    override val dimensions: NavigationDrawerItemDimensions,
    override val titleStyles: StatefulValue<TextStyle>,
    override val disclosureTextStyles: StatefulValue<TextStyle>,
    override val badgeStyle: BadgeStyle,
    override val counterStyle: CounterStyle,
) : NavigationDrawerItemStyle {
    class Builder(receiver: Any?) : NavigationDrawerItemStyleBuilder {
        private var shape: StatefulValue<Shape>? = null
        private var titleStyle: StatefulValue<TextStyle>? = null
        private var disclosureTextStyle: StatefulValue<TextStyle>? = null
        private var badgeStyle: BadgeStyle? = null
        private var counterStyle: CounterStyle? = null
        private var colorsBuilder: NavigationDrawerItemColorsBuilder = DefaultNavigationDrawerItemColors.Builder()
        private var dimensionsBuilder: NavigationDrawerItemDimensionsBuilder =
            DefaultNavigationDrawerItemDimensions.Builder()

        override fun titleStyle(titleStyle: TextStyle) = apply {
            this.titleStyle = titleStyle.asStatefulValue()
        }

        override fun titleStyle(titleStyle: StatefulValue<TextStyle>) = apply {
            this.titleStyle = titleStyle
        }

        override fun disclosureTextStyle(disclosureStyle: TextStyle) = apply {
            this.disclosureTextStyle = disclosureStyle.asStatefulValue()
        }

        override fun disclosureTextStyle(disclosureStyle: StatefulValue<TextStyle>) = apply {
            this.disclosureTextStyle = disclosureStyle
        }

        @Composable
        override fun colors(builder: @Composable NavigationDrawerItemColorsBuilder.() -> Unit) = apply {
            colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable NavigationDrawerItemDimensionsBuilder.() -> Unit) = apply {
            dimensionsBuilder.builder()
        }

        override fun counterStyle(counterStyle: CounterStyle) = apply {
            this.counterStyle = counterStyle
        }

        override fun badgeStyle(badgeStyle: BadgeStyle) = apply {
            this.badgeStyle = badgeStyle
        }

        override fun shape(shape: StatefulValue<Shape>) = apply {
            this.shape = shape
        }

        override fun style(): NavigationDrawerItemStyle {
            return DefaultNavigationDrawerItemStyle(
                shape = shape ?: RectangleShape.asStatefulValue(),
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                titleStyles = titleStyle ?: TextStyle.Default.asStatefulValue(),
                disclosureTextStyles = disclosureTextStyle ?: TextStyle.Default.asStatefulValue(),
                badgeStyle = badgeStyle ?: BadgeStyle.badgeBuilder().style(),
                counterStyle = counterStyle ?: CounterStyle.builder().style(),
            )
        }
    }
}

@Immutable
private data class DefaultNavigationDrawerItemColors(
    override val background: StatefulValue<Brush>,
    override val title: StatefulValue<Brush>,
    override val icon: StatefulValue<Brush>,
) : NavigationDrawerItemColors {
    class Builder : NavigationDrawerItemColorsBuilder {
        private var background: StatefulValue<Brush>? = null
        private var titleColor: StatefulValue<Brush>? = null
        private var icon: StatefulValue<Brush>? = null

        override fun backgroundColor(background: StatefulValue<Brush>) = apply {
            this.background = background
        }

        override fun titleColor(titleColor: StatefulValue<Brush>) = apply {
            this.titleColor = titleColor
        }

        override fun iconColor(icon: StatefulValue<Brush>) = apply {
            this.icon = icon
        }

        override fun build(): NavigationDrawerItemColors {
            return DefaultNavigationDrawerItemColors(
                background = background ?: Color.Transparent.asStatefulBrush(),
                title = titleColor ?: Color.Black.asStatefulBrush(),
                icon = icon ?: Color.Black.asStatefulBrush(),
            )
        }
    }
}

@Immutable
private data class DefaultNavigationDrawerItemDimensions(
    override val minHeight: StatefulValue<Dp>,
    override val iconSize: StatefulValue<Dp>,
    override val indicatorOffsetX: StatefulValue<Dp>,
    override val indicatorOffsetY: StatefulValue<Dp>,
    override val paddingStart: StatefulValue<Dp>,
    override val paddingEnd: StatefulValue<Dp>,
    override val paddingTop: StatefulValue<Dp>,
    override val paddingBottom: StatefulValue<Dp>,
    override val contentPaddingStart: StatefulValue<Dp>,
    override val contentPaddingEnd: StatefulValue<Dp>,
) : NavigationDrawerItemDimensions {
    class Builder : NavigationDrawerItemDimensionsBuilder {
        private var minHeight: StatefulValue<Dp>? = null
        private var iconSize: StatefulValue<Dp>? = null
        private var indicatorOffsetX: StatefulValue<Dp>? = null
        private var indicatorOffsetY: StatefulValue<Dp>? = null
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null
        private var contentPaddingStart: StatefulValue<Dp>? = null
        private var contentPaddingEnd: StatefulValue<Dp>? = null

        override fun minHeight(minHeight: StatefulValue<Dp>) = apply {
            this.minHeight = minHeight
        }

        override fun iconSize(iconSize: StatefulValue<Dp>) = apply {
            this.iconSize = iconSize
        }

        override fun indicatorOffsetX(indicatorOffset: StatefulValue<Dp>) = apply {
            this.indicatorOffsetX = indicatorOffset
        }

        override fun indicatorOffsetY(indicatorOffset: StatefulValue<Dp>) = apply {
            this.indicatorOffsetY = indicatorOffset
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: StatefulValue<Dp>) = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun contentPaddingStart(contentPaddingStart: StatefulValue<Dp>) = apply {
            this.contentPaddingStart = contentPaddingStart
        }

        override fun contentPaddingEnd(contentPaddingEnd: StatefulValue<Dp>) = apply {
            this.contentPaddingEnd = contentPaddingEnd
        }

        override fun build(): NavigationDrawerItemDimensions {
            return DefaultNavigationDrawerItemDimensions(
                minHeight = minHeight ?: 48.dp.asStatefulValue(),
                iconSize = iconSize ?: 24.dp.asStatefulValue(),
                indicatorOffsetX = indicatorOffsetX ?: 0.dp.asStatefulValue(),
                indicatorOffsetY = indicatorOffsetY ?: 0.dp.asStatefulValue(),
                paddingStart = paddingStart ?: 0.dp.asStatefulValue(),
                paddingEnd = paddingEnd ?: 0.dp.asStatefulValue(),
                paddingTop = paddingTop ?: 0.dp.asStatefulValue(),
                paddingBottom = paddingBottom ?: 0.dp.asStatefulValue(),
                contentPaddingStart = contentPaddingStart ?: 16.dp.asStatefulValue(),
                contentPaddingEnd = contentPaddingEnd ?: 16.dp.asStatefulValue(),
            )
        }
    }
}
