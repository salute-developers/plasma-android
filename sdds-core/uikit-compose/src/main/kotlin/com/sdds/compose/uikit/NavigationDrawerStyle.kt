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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal, предоставляющий текущий [NavigationDrawerStyle].
 */
val LocalNavigationDrawerStyle = compositionLocalOf(structuralEqualityPolicy()) {
    NavigationDrawerStyle.builder().style()
}

/**
 * Стиль [NavigationDrawer].
 */
@Stable
interface NavigationDrawerStyle : Style {
    /**
     * Форма контейнера с поддержкой состояний [NavigationDrawerValue.Expanded] и [NavigationDrawerValue.Collapsed].
     */
    val shape: StatefulValue<Shape>

    /**
     * Форма selector-a
     */
    val selectorShape: StatefulValue<Shape>

    /**
     * Тень контейнера с поддержкой состояний.
     */
    val shadow: StatefulValue<ShadowAppearance>

    /**
     * Цвета контейнера и selector-а.
     */
    val colors: NavigationDrawerColors

    /**
     * Размеры контейнера и selector-а.
     */
    val dimensions: NavigationDrawerDimensions

    /**
     * Стиль item-ов, который [NavigationDrawer] предоставляет потомкам.
     */
    val itemStyle: NavigationDrawerItemStyle

    companion object {
        /**
         * Возвращает builder для [NavigationDrawerStyle].
         */
        fun builder(receiver: Any? = null): NavigationDrawerStyleBuilder =
            DefaultNavigationDrawerStyle.Builder(receiver)
    }
}

/**
 * Цвета [NavigationDrawer].
 */
@Stable
interface NavigationDrawerColors {
    /**
     * Фон контейнера.
     */
    val background: StatefulValue<Brush>

    /**
     * Цвет selector-а выбранного item-а.
     */
    val selector: StatefulValue<Brush>
}

/**
 * Размеры [NavigationDrawer].
 */
@Stable
interface NavigationDrawerDimensions {
    /**
     * Ширина контейнера в состоянии [NavigationDrawerValue.Expanded].
     */
    val width: StatefulValue<Dp>

    /**
     * Внутренний отступ сверху.
     */
    val paddingTop: StatefulValue<Dp>

    /**
     * Внутренний отступ снизу.
     */
    val paddingBottom: StatefulValue<Dp>

    /**
     * Внутренний отступ слева.
     */
    val paddingStart: StatefulValue<Dp>

    /**
     * Внутренний отступ справа.
     */
    val paddingEnd: StatefulValue<Dp>

    /**
     * Отступ между item-ами в body/content области.
     */
    val itemSpacing: StatefulValue<Dp>

    /**
     * Отступ после header перед body/content областью.
     */
    val headerSpacing: StatefulValue<Dp>

    /**
     * Отступ перед footer после body/content области.
     */
    val footerSpacing: StatefulValue<Dp>

    /**
     * Горизонтальный inset selector-а относительно item-а.
     */
    val selectorPaddingStart: StatefulValue<Dp>

    /**
     * Горизонтальный inset selector-а относительно item-а.
     */
    val selectorPaddingEnd: StatefulValue<Dp>
}

/**
 * Builder [NavigationDrawerStyle].
 */
@ApiInfo
interface NavigationDrawerStyleBuilder : StyleBuilder<NavigationDrawerStyle> {
    /**
     * Устанавливает форму контейнера.
     */
    fun shape(shape: StatefulValue<Shape>): NavigationDrawerStyleBuilder

    /**
     * Устанавливает форму контейнера.
     */
    fun shape(shape: Shape): NavigationDrawerStyleBuilder = shape(shape.asStatefulValue())

    /**
     * Устанавливает форму selector-a.
     */
    fun selectorShape(shape: StatefulValue<Shape>): NavigationDrawerStyleBuilder

    /**
     * Устанавливает форму selector-a.
     */
    fun selectorShape(shape: Shape): NavigationDrawerStyleBuilder = selectorShape(shape.asStatefulValue())

    /**
     * Устанавливает тень контейнера.
     */
    fun shadow(shadow: StatefulValue<ShadowAppearance>): NavigationDrawerStyleBuilder

    /**
     * Устанавливает тень контейнера.
     */
    fun shadow(shadow: ShadowAppearance): NavigationDrawerStyleBuilder = shadow(shadow.asStatefulValue())

    /**
     * Устанавливает цвета контейнера.
     */
    @Composable
    fun colors(builder: @Composable NavigationDrawerColorsBuilder.() -> Unit): NavigationDrawerStyleBuilder

    /**
     * Устанавливает размеры контейнера.
     */
    @Composable
    fun dimensions(builder: @Composable NavigationDrawerDimensionsBuilder.() -> Unit): NavigationDrawerStyleBuilder

    /**
     * Устанавливает стиль item-ов.
     */
    fun itemStyle(itemStyle: NavigationDrawerItemStyle): NavigationDrawerStyleBuilder
}

/**
 * Builder цветов [NavigationDrawer].
 */
interface NavigationDrawerColorsBuilder {
    /**
     * Устанавливает фон контейнера.
     */
    fun backgroundColor(background: StatefulValue<Brush>): NavigationDrawerColorsBuilder

    /**
     * Устанавливает фон контейнера.
     */
    fun backgroundColor(background: InteractiveColor): NavigationDrawerColorsBuilder =
        backgroundColor(background.asStatefulBrush())

    /**
     * Устанавливает фон контейнера.
     */
    fun backgroundColor(background: Color): NavigationDrawerColorsBuilder =
        backgroundColor(background.asStatefulBrush())

    /**
     * Устанавливает фон контейнера.
     */
    fun backgroundColor(background: Brush): NavigationDrawerColorsBuilder =
        backgroundColor(background.asStatefulValue())

    /**
     * Устанавливает цвет selector-а.
     */
    fun selectorColor(selector: StatefulValue<Brush>): NavigationDrawerColorsBuilder

    /**
     * Устанавливает цвет selector-а.
     */
    fun selectorColor(selector: InteractiveColor): NavigationDrawerColorsBuilder =
        selectorColor(selector.asStatefulBrush())

    /**
     * Устанавливает цвет selector-а.
     */
    fun selectorColor(selector: Color): NavigationDrawerColorsBuilder =
        selectorColor(selector.asStatefulBrush())

    /**
     * Устанавливает цвет selector-а.
     */
    fun selectorColor(selector: Brush): NavigationDrawerColorsBuilder =
        selectorColor(selector.asStatefulValue())

    /**
     * Возвращает готовый [NavigationDrawerColors].
     */
    fun build(): NavigationDrawerColors
}

/**
 * Builder размеров [NavigationDrawer].
 */
interface NavigationDrawerDimensionsBuilder {
    /**
     * Устанавливает ширину контейнера.
     */
    fun width(width: StatefulValue<Dp>): NavigationDrawerDimensionsBuilder

    /**
     * Устанавливает ширину контейнера.
     */
    fun width(width: Dp): NavigationDrawerDimensionsBuilder = width(width.asStatefulValue())

    /**
     * Устанавливает верхний отступ.
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): NavigationDrawerDimensionsBuilder

    /**
     * Устанавливает верхний отступ.
     */
    fun paddingTop(paddingTop: Dp): NavigationDrawerDimensionsBuilder = paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает нижний отступ.
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): NavigationDrawerDimensionsBuilder

    /**
     * Устанавливает нижний отступ.
     */
    fun paddingBottom(paddingBottom: Dp): NavigationDrawerDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает начальный отступ.
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): NavigationDrawerDimensionsBuilder

    /**
     * Устанавливает начальный отступ.
     */
    fun paddingStart(paddingStart: Dp): NavigationDrawerDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает конечный отступ.
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): NavigationDrawerDimensionsBuilder

    /**
     * Устанавливает конечный отступ.
     */
    fun paddingEnd(paddingEnd: Dp): NavigationDrawerDimensionsBuilder = paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ между item-ами.
     */
    fun itemSpacing(itemSpacing: StatefulValue<Dp>): NavigationDrawerDimensionsBuilder

    /**
     * Устанавливает отступ между item-ами.
     */
    fun itemSpacing(itemSpacing: Dp): NavigationDrawerDimensionsBuilder = itemSpacing(itemSpacing.asStatefulValue())

    /**
     * Устанавливает отступ после header перед body/content областью.
     */
    fun headerSpacing(headerSpacing: StatefulValue<Dp>): NavigationDrawerDimensionsBuilder

    /**
     * Устанавливает отступ после header перед body/content областью.
     */
    fun headerSpacing(headerSpacing: Dp): NavigationDrawerDimensionsBuilder =
        headerSpacing(headerSpacing.asStatefulValue())

    /**
     * Устанавливает отступ перед footer после body/content области.
     */
    fun footerSpacing(footerSpacing: StatefulValue<Dp>): NavigationDrawerDimensionsBuilder

    /**
     * Устанавливает отступ перед footer после body/content области.
     */
    fun footerSpacing(footerSpacing: Dp): NavigationDrawerDimensionsBuilder =
        footerSpacing(footerSpacing.asStatefulValue())

    /**
     * Устанавливает начальный inset selector-а.
     */
    fun selectorPaddingStart(selectorPaddingStart: StatefulValue<Dp>): NavigationDrawerDimensionsBuilder

    /**
     * Устанавливает начальный inset selector-а.
     */
    fun selectorPaddingStart(selectorPaddingStart: Dp): NavigationDrawerDimensionsBuilder =
        selectorPaddingStart(selectorPaddingStart.asStatefulValue())

    /**
     * Устанавливает конечный inset selector-а.
     */
    fun selectorPaddingEnd(selectorPaddingEnd: StatefulValue<Dp>): NavigationDrawerDimensionsBuilder

    /**
     * Устанавливает конечный inset selector-а.
     */
    fun selectorPaddingEnd(selectorPaddingEnd: Dp): NavigationDrawerDimensionsBuilder =
        selectorPaddingEnd(selectorPaddingEnd.asStatefulValue())

    /**
     * Возвращает готовые размеры.
     */
    fun build(): NavigationDrawerDimensions
}

@Immutable
private data class DefaultNavigationDrawerStyle(
    override val shape: StatefulValue<Shape>,
    override val shadow: StatefulValue<ShadowAppearance>,
    override val colors: NavigationDrawerColors,
    override val dimensions: NavigationDrawerDimensions,
    override val itemStyle: NavigationDrawerItemStyle,
    override val selectorShape: StatefulValue<Shape>,
) : NavigationDrawerStyle {
    class Builder(receiver: Any?) : NavigationDrawerStyleBuilder {
        private var shape: StatefulValue<Shape>? = null
        private var selectorShape: StatefulValue<Shape>? = null
        private var shadow: StatefulValue<ShadowAppearance>? = null
        private var colorsBuilder: NavigationDrawerColorsBuilder = DefaultNavigationDrawerColors.Builder()
        private var dimensionsBuilder: NavigationDrawerDimensionsBuilder = DefaultNavigationDrawerDimensions.Builder()
        private var itemStyle: NavigationDrawerItemStyle? = null

        override fun shape(shape: StatefulValue<Shape>) = apply {
            this.shape = shape
        }

        override fun selectorShape(shape: StatefulValue<Shape>) = apply {
            this.selectorShape = shape
        }

        override fun shadow(shadow: StatefulValue<ShadowAppearance>) = apply {
            this.shadow = shadow
        }

        @Composable
        override fun colors(builder: @Composable NavigationDrawerColorsBuilder.() -> Unit) = apply {
            colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable NavigationDrawerDimensionsBuilder.() -> Unit) = apply {
            dimensionsBuilder.builder()
        }

        override fun itemStyle(itemStyle: NavigationDrawerItemStyle) = apply {
            this.itemStyle = itemStyle
        }

        override fun style(): NavigationDrawerStyle {
            return DefaultNavigationDrawerStyle(
                shape = shape ?: RectangleShape.asStatefulValue(),
                selectorShape = selectorShape ?: RectangleShape.asStatefulValue(),
                shadow = shadow ?: ShadowAppearance().asStatefulValue(),
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                itemStyle = itemStyle ?: NavigationDrawerItemStyle.builder().style(),
            )
        }
    }
}

@Immutable
private data class DefaultNavigationDrawerColors(
    override val background: StatefulValue<Brush>,
    override val selector: StatefulValue<Brush>,
) : NavigationDrawerColors {
    class Builder : NavigationDrawerColorsBuilder {
        private var background: StatefulValue<Brush>? = null
        private var selector: StatefulValue<Brush>? = null

        override fun backgroundColor(background: StatefulValue<Brush>) = apply {
            this.background = background
        }

        override fun selectorColor(selector: StatefulValue<Brush>) = apply {
            this.selector = selector
        }

        override fun build(): NavigationDrawerColors {
            return DefaultNavigationDrawerColors(
                background = background ?: Color.Transparent.asStatefulBrush(),
                selector = selector ?: Color.Black.copy(alpha = 0.08f).asStatefulBrush(),
            )
        }
    }
}

@Immutable
private data class DefaultNavigationDrawerDimensions(
    override val width: StatefulValue<Dp>,
    override val paddingTop: StatefulValue<Dp>,
    override val paddingBottom: StatefulValue<Dp>,
    override val paddingStart: StatefulValue<Dp>,
    override val paddingEnd: StatefulValue<Dp>,
    override val itemSpacing: StatefulValue<Dp>,
    override val headerSpacing: StatefulValue<Dp>,
    override val footerSpacing: StatefulValue<Dp>,
    override val selectorPaddingStart: StatefulValue<Dp>,
    override val selectorPaddingEnd: StatefulValue<Dp>,
) : NavigationDrawerDimensions {
    class Builder : NavigationDrawerDimensionsBuilder {
        private var width: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var itemSpacing: StatefulValue<Dp>? = null
        private var headerSpacing: StatefulValue<Dp>? = null
        private var footerSpacing: StatefulValue<Dp>? = null
        private var selectorPaddingStart: StatefulValue<Dp>? = null
        private var selectorPaddingEnd: StatefulValue<Dp>? = null

        override fun width(width: StatefulValue<Dp>) = apply {
            this.width = width
        }

        override fun paddingTop(paddingTop: StatefulValue<Dp>) = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun itemSpacing(itemSpacing: StatefulValue<Dp>) = apply {
            this.itemSpacing = itemSpacing
        }

        override fun headerSpacing(headerSpacing: StatefulValue<Dp>) = apply {
            this.headerSpacing = headerSpacing
        }

        override fun footerSpacing(footerSpacing: StatefulValue<Dp>) = apply {
            this.footerSpacing = footerSpacing
        }

        override fun selectorPaddingStart(selectorPaddingStart: StatefulValue<Dp>) = apply {
            this.selectorPaddingStart = selectorPaddingStart
        }

        override fun selectorPaddingEnd(selectorPaddingEnd: StatefulValue<Dp>) = apply {
            this.selectorPaddingEnd = selectorPaddingEnd
        }

        override fun build(): NavigationDrawerDimensions {
            return DefaultNavigationDrawerDimensions(
                width = width ?: 80.dp.asStatefulValue(
                    setOf(NavigationDrawerValue.Expanded) to 300.dp,
                ),
                paddingTop = paddingTop ?: 8.dp.asStatefulValue(),
                paddingBottom = paddingBottom ?: 8.dp.asStatefulValue(),
                paddingStart = paddingStart ?: 8.dp.asStatefulValue(),
                paddingEnd = paddingEnd ?: 8.dp.asStatefulValue(),
                itemSpacing = itemSpacing ?: 0.dp.asStatefulValue(),
                headerSpacing = headerSpacing ?: 0.dp.asStatefulValue(),
                footerSpacing = footerSpacing ?: 0.dp.asStatefulValue(),
                selectorPaddingStart = selectorPaddingStart ?: 0.dp.asStatefulValue(),
                selectorPaddingEnd = selectorPaddingEnd ?: 0.dp.asStatefulValue(),
            )
        }
    }
}
