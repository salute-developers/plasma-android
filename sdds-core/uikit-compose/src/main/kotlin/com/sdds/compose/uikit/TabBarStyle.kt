package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [TabBarStyle] для компонента [TabBar]
 */
val LocalTabBarStyle: ProvidableCompositionLocal<TabBarStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { TabBarStyle.builder().style() }

/**
 * Стиль компонента TabBar
 */
@Immutable
interface TabBarStyle : Style {
    /**
     * Форма скруглений верхних углов TabBar
     */
    val topShape: CornerBasedShape

    /**
     * Форма скруглений нижних углов TabBar
     */
    val bottomShape: CornerBasedShape

    /**
     * Тень TabBar
     */
    val shadow: ShadowAppearance

    /**
     * Цвета компонента
     */
    val colors: TabBarColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: TabBarDimensions

    /**
     * Стиль элемента TabBar
     */
    val tabBarItemStyle: TabBarItemStyle

    companion object {
        /**
         * Возвращает экземпляр [TabBarStyleBuilder]
         */
        fun builder(receiver: Any? = null): TabBarStyleBuilder = DefaultTabBarStyle.Builder()
    }
}

/**
 * Билдер стиля компонента
 */
interface TabBarStyleBuilder : StyleBuilder<TabBarStyle> {
    /**
     * Устанавливает форму верхних скруглений
     */
    fun topShape(topShape: CornerBasedShape): TabBarStyleBuilder

    /**
     * Устанавливает форму нижний скруглений
     */
    fun bottomShape(bottomShape: CornerBasedShape): TabBarStyleBuilder

    /**
     * Устанавливает тень компонента
     */
    fun shadow(shadow: ShadowAppearance): TabBarStyleBuilder

    /**
     * Устанавливает цвета компоненты
     */
    @Composable
    fun colors(builder: @Composable TabBarColorsBuilder.() -> Unit): TabBarStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента
     */
    @Composable
    fun dimensions(builder: @Composable TabBarDimensionsBuilder.() -> Unit): TabBarStyleBuilder

    /**
     * Устанавливает стиль элемента TabBar [tabBarItemStyle]
     */
    fun tabBarItemStyle(tabBarItemStyle: TabBarItemStyle): TabBarStyleBuilder
}

private data class DefaultTabBarStyle(
    override val topShape: CornerBasedShape,
    override val bottomShape: CornerBasedShape,
    override val shadow: ShadowAppearance,
    override val colors: TabBarColors,
    override val dimensions: TabBarDimensions,
    override val tabBarItemStyle: TabBarItemStyle,
) : TabBarStyle {
    class Builder : TabBarStyleBuilder {
        private var topShape: CornerBasedShape? = null
        private var bottomShape: CornerBasedShape? = null
        private var shadow: ShadowAppearance? = null
        private val colorsBuilder: TabBarColorsBuilder = TabBarColors.builder()
        private val dimensionsBuilder: TabBarDimensionsBuilder = TabBarDimensions.builder()
        private var tabBarItemStyle: TabBarItemStyle? = null

        override fun topShape(topShape: CornerBasedShape): TabBarStyleBuilder = apply {
            this.topShape = topShape
        }

        override fun bottomShape(bottomShape: CornerBasedShape): TabBarStyleBuilder = apply {
            this.bottomShape = bottomShape
        }

        override fun shadow(shadow: ShadowAppearance): TabBarStyleBuilder = apply {
            this.shadow = shadow
        }

        @Composable
        override fun colors(builder: @Composable TabBarColorsBuilder.() -> Unit):
            TabBarStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable TabBarDimensionsBuilder.() -> Unit):
            TabBarStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun tabBarItemStyle(tabBarItemStyle: TabBarItemStyle) = apply {
            this.tabBarItemStyle = tabBarItemStyle
        }

        override fun style(): TabBarStyle = DefaultTabBarStyle(
            topShape = topShape ?: RoundedCornerShape(0),
            bottomShape = bottomShape ?: RoundedCornerShape(0),
            shadow = shadow ?: ShadowAppearance(),
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
            tabBarItemStyle = tabBarItemStyle ?: TabBarItemStyle.builder().style(),
        )
    }
}

/**
 * Цвета компонента
 */
@Immutable
interface TabBarColors {
    /**
     * Цвет фона
     */
    val backgroundColor: InteractiveColor

    /**
     * Цвет разделителя
     */
    val dividerColor: InteractiveColor

    companion object {
        /**
         * Возвращает экземпляр [TabBarColorsBuilder]
         */
        fun builder(): TabBarColorsBuilder = DefaultTabBarColors.Builder()
    }
}

/**
 * Билдер для [TabBarColors]
 */
interface TabBarColorsBuilder {
    /**
     * Устанавливает цвет фона [backgroundColor]
     */
    fun backgroundColor(backgroundColor: InteractiveColor): TabBarColorsBuilder

    /**
     * Устанавливает цвет фона [backgroundColor]
     */
    fun backgroundColor(backgroundColor: Color): TabBarColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет разделителя [dividerColor]
     */
    fun dividerColor(dividerColor: InteractiveColor): TabBarColorsBuilder

    /**
     * Устанавливает цвет разделителя [dividerColor]
     */
    fun dividerColor(dividerColor: Color): TabBarColorsBuilder =
        dividerColor(dividerColor.asInteractive())

    /**
     * Вернёт [TabBarColors]
     */
    fun build(): TabBarColors
}

private data class DefaultTabBarColors(
    override val backgroundColor: InteractiveColor,
    override val dividerColor: InteractiveColor,
) : TabBarColors {
    class Builder : TabBarColorsBuilder {
        private var backgroundColor: InteractiveColor? = null

        private var dividerColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: InteractiveColor): TabBarColorsBuilder =
            apply { this.backgroundColor = backgroundColor }

        override fun dividerColor(dividerColor: InteractiveColor): TabBarColorsBuilder =
            apply {
                this.dividerColor = dividerColor
            }

        override fun build(): TabBarColors = DefaultTabBarColors(
            backgroundColor = backgroundColor ?: Color.Transparent.asInteractive(),
            dividerColor = dividerColor ?: Color.Unspecified.asInteractive(),
        )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface TabBarDimensions {
    /**
     * Внешний отступ в начале
     */
    val paddingStart: Dp

    /**
     * Внешний отступ в конце
     */
    val paddingEnd: Dp

    /**
     * Внешний отступ сверху
     */
    val paddingTop: Dp

    /**
     * Внешний отступ снизу
     */
    val paddingBottom: Dp

    /**
     * Внутренний отступ в начале
     */
    val contentPaddingStart: Dp

    /**
     * Внутренний отступ в конце
     */
    val contentPaddingEnd: Dp

    /**
     * Внутренний отступ сверху
     */
    val contentPaddingTop: Dp

    /**
     * Внутренний отступ снизу
     */
    val contentPaddingBottom: Dp

    /**
     * Расстояние между элементами TabBar
     */
    val itemSpacing: Dp

    /**
     * Толщина разделителя
     */
    val dividerThickness: Dp

    companion object {
        /**
         * Возвращает экземпляр [TabBarDimensionsBuilder]
         */
        fun builder(): TabBarDimensionsBuilder = DefaultTabBarDimensions.Builder()
    }
}

/**
 * Билдер для [TabBarDimensions]
 */
interface TabBarDimensionsBuilder {
    /**
     * Устанавливает внешний отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): TabBarDimensionsBuilder

    /**
     * Устанавливает внешний отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): TabBarDimensionsBuilder

    /**
     * Устанавливает внешний отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): TabBarDimensionsBuilder

    /**
     * Устанавливает внешний отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): TabBarDimensionsBuilder

    /**
     * Устанавливает внутренний отступ в начале [contentPaddingStart]
     */
    fun contentPaddingStart(contentPaddingStart: Dp): TabBarDimensionsBuilder

    /**
     * Устанавливает внутрениий отступ в конце [contentPaddingEnd]
     */
    fun contentPaddingEnd(contentPaddingEnd: Dp): TabBarDimensionsBuilder

    /**
     * Устанавливает внутренний отступ сверху [contentPaddingTop]
     */
    fun contentPaddingTop(contentPaddingTop: Dp): TabBarDimensionsBuilder

    /**
     * Устанавливает внутренний отступ снизу [contentPaddingBottom]
     */
    fun contentPaddingBottom(contentPaddingBottom: Dp): TabBarDimensionsBuilder

    /**
     * Устанавливает расстояние между элементами [itemSpacing]
     */
    fun itemSpacing(itemSpacing: Dp): TabBarDimensionsBuilder

    /**
     * Устанавливает толщину разделителя [dividerThickness]
     */
    fun dividerThickness(dividerThickness: Dp): TabBarDimensionsBuilder

    /**
     * Вернёт [TabBarDimensions]
     */
    fun build(): TabBarDimensions
}

private data class DefaultTabBarDimensions(
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val contentPaddingStart: Dp,
    override val contentPaddingEnd: Dp,
    override val contentPaddingTop: Dp,
    override val contentPaddingBottom: Dp,
    override val itemSpacing: Dp,
    override val dividerThickness: Dp,
) : TabBarDimensions {
    class Builder : TabBarDimensionsBuilder {
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var paddingTop: Dp? = null
        private var paddingBottom: Dp? = null
        private var contentPaddingStart: Dp? = null
        private var contentPaddingEnd: Dp? = null
        private var contentPaddingTop: Dp? = null
        private var contentPaddingBottom: Dp? = null
        private var itemSpacing: Dp? = null
        private var dividerThickness: Dp? = null

        override fun paddingStart(paddingStart: Dp): TabBarDimensionsBuilder = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: Dp): TabBarDimensionsBuilder = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: Dp): TabBarDimensionsBuilder = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: Dp): TabBarDimensionsBuilder = apply {
            this.paddingBottom = paddingBottom
        }

        override fun contentPaddingStart(contentPaddingStart: Dp): TabBarDimensionsBuilder =
            apply { this.contentPaddingStart = contentPaddingStart }

        override fun contentPaddingEnd(contentPaddingEnd: Dp): TabBarDimensionsBuilder =
            apply {
                this.contentPaddingEnd = contentPaddingEnd
            }

        override fun contentPaddingTop(contentPaddingTop: Dp): TabBarDimensionsBuilder =
            apply {
                this.contentPaddingTop = contentPaddingTop
            }

        override fun contentPaddingBottom(contentPaddingBottom: Dp): TabBarDimensionsBuilder =
            apply { this.contentPaddingBottom = contentPaddingBottom }

        override fun itemSpacing(itemSpacing: Dp): TabBarDimensionsBuilder = apply {
            this.itemSpacing = itemSpacing
        }

        override fun dividerThickness(dividerThickness: Dp): TabBarDimensionsBuilder =
            apply {
                this.dividerThickness = dividerThickness
            }

        override fun build(): TabBarDimensions = DefaultTabBarDimensions(
            paddingStart = paddingStart ?: 0.dp,
            paddingEnd = paddingEnd ?: 0.dp,
            paddingTop = paddingTop ?: 0.dp,
            paddingBottom = paddingBottom ?: 0.dp,
            contentPaddingStart = contentPaddingStart ?: 2.dp,
            contentPaddingEnd = contentPaddingEnd ?: 2.dp,
            contentPaddingTop = contentPaddingTop ?: 2.dp,
            contentPaddingBottom = contentPaddingBottom ?: 2.dp,
            itemSpacing = itemSpacing ?: 2.dp,
            dividerThickness = dividerThickness ?: 2.dp,
        )
    }
}
