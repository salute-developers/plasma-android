package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [TabsStyle] для компонента [Tabs]
 */
val LocalTabsStyle =
    compositionLocalOf(structuralEqualityPolicy()) { TabsStyle.builder().style() }

/**
 * Стиль компонента [Tabs]
 */
@Immutable
interface TabsStyle : Style {

    /**
     * Иконка disclosure
     */
    @get:DrawableRes
    val disclosureIcon: Int?

    /**
     * Иконка кнопки перемотки вправо
     */
    @get:DrawableRes
    val overflowNextIcon: Int?

    /**
     * Иконка кнопки перемотки влево
     */
    @get:DrawableRes
    val overflowPrevIcon: Int?

    /**
     * Ориентация табов [TabsOrientation]
     */
    val orientation: TabsOrientation

    /**
     * Включает разделитель [Divider]
     */
    val dividerEnabled: Boolean

    /**
     * Включает индикатор выбранного таба
     */
    val indicatorEnabled: Boolean

    /**
     * Форма компонента
     */
    val shape: CornerBasedShape

    /**
     * Стиль текста disclosure
     */
    val disclosureTextStyle: TextStyle

    /**
     * Цвета компонента [Tabs]
     */
    val colors: TabsColors

    /**
     * Размеры и отступы компонента [Tabs]
     */
    val dimensions: TabsDimensions

    /**
     * Стиль таба [TabItem]
     */
    val tabItemStyle: TabItemStyle

    /**
     * Стиль разделителя [Divider]
     */
    val dividerStyle: DividerStyle

    /**
     * Стиль меню [DropdownMenu], содержащего табы, которые не поместились, в режиме clips == TabsClip.ShowMore
     */
    val dropdownMenuStyle: DropdownMenuStyle

    companion object {
        /**
         * Возвращает экземпляр [TabsStyleBuilder]
         */
        fun builder(receiver: Any? = null): TabsStyleBuilder = DefaultTabsStyle.Builder()
    }
}

/**
 * Билдер стиля [TabsStyle]
 */
interface TabsStyleBuilder : StyleBuilder<TabsStyle> {

    /**
     * Устанавливает форму компонента
     */
    fun shape(shape: CornerBasedShape): TabsStyleBuilder

    /**
     * Устанавливает цвета компонента [Tabs]
     */
    @Composable
    fun colors(builder: @Composable TabsColorsBuilder.() -> Unit): TabsStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [Tabs]
     */
    @Composable
    fun dimensions(builder: @Composable TabsDimensionsBuilder.() -> Unit): TabsStyleBuilder

    /**
     * Устанавливает стиль таба [tabItemStyle]
     */
    fun tabItemStyle(tabItemStyle: TabItemStyle): TabsStyleBuilder

    /**
     * Устанавливает стиль разделителя [dividerStyle]
     */
    fun dividerStyle(dividerStyle: DividerStyle): TabsStyleBuilder

    /**
     * Устанавливает стиль меню [dropdownMenuStyle]
     */
    fun dropdownMenuStyle(dropdownMenuStyle: DropdownMenuStyle): TabsStyleBuilder

    /**
     * Устанавливает выключатель [dividerEnabled]
     */
    fun dividerEnabled(dividerEnabled: Boolean): TabsStyleBuilder

    /**
     * Устанавливает выключатель [indicatorEnabled]
     */
    fun indicatorEnabled(indicatorEnabled: Boolean): TabsStyleBuilder

    /**
     * Устанавливает оиентацию табов [orientation]
     */
    fun orientation(orientation: TabsOrientation): TabsStyleBuilder

    /**
     * Устанавливает стиль текста disclosure [disclosureTextStyle]
     */
    fun disclosureTextStyle(disclosureTextStyle: TextStyle): TabsStyleBuilder

    /**
     * Устанавливает иконку кнопки перемотки вправо [overflowNextIcon]
     */
    fun overflowNextIcon(@DrawableRes overflowNextIcon: Int): TabsStyleBuilder

    /**
     * Устанавливает иконку кнопки перемотки влево [overflowNextIcon]
     */
    fun overflowPrevIcon(@DrawableRes overflowPrevIcon: Int): TabsStyleBuilder

    /**
     * Устанавливает diclosure иконку [disclosureIcon]
     */
    fun disclosureIcon(@DrawableRes disclosureIcon: Int): TabsStyleBuilder
}

@Immutable
private class DefaultTabsStyle(
    override val shape: CornerBasedShape,
    override val colors: TabsColors,
    override val dimensions: TabsDimensions,
    override val tabItemStyle: TabItemStyle,
    override val disclosureIcon: Int?,
    override val overflowNextIcon: Int?,
    override val overflowPrevIcon: Int?,
    override val orientation: TabsOrientation,
    override val dividerEnabled: Boolean,
    override val indicatorEnabled: Boolean,
    override val disclosureTextStyle: TextStyle,
    override val dividerStyle: DividerStyle,
    override val dropdownMenuStyle: DropdownMenuStyle,
) : TabsStyle {

    class Builder : TabsStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var disclosureIcon: Int? = null
        private var overflowNextIcon: Int? = null
        private var orientation: TabsOrientation? = null
        private var dividerEnabled: Boolean? = null
        private var indicatorEnabled: Boolean? = null
        private var disclosureTextStyle: TextStyle? = null
        private var overflowPrevIcon: Int? = null
        private var colorsBuilder: TabsColorsBuilder = TabsColors.builder()
        private var dimensionsBuilder: TabsDimensionsBuilder =
            TabsDimensions.builder()
        private var tabItemStyle: TabItemStyle? = null
        private var dividerStyle: DividerStyle? = null

        private var dropdownMenuStyle: DropdownMenuStyle? = null

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        @Composable
        override fun colors(builder: @Composable (TabsColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (TabsDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun tabItemStyle(tabItemStyle: TabItemStyle) = apply {
            this.tabItemStyle = tabItemStyle
        }

        override fun dividerStyle(dividerStyle: DividerStyle) = apply {
            this.dividerStyle = dividerStyle
        }

        override fun dropdownMenuStyle(dropdownMenuStyle: DropdownMenuStyle) = apply {
            this.dropdownMenuStyle = dropdownMenuStyle
        }

        override fun dividerEnabled(dividerEnabled: Boolean) = apply {
            this.dividerEnabled = dividerEnabled
        }

        override fun indicatorEnabled(indicatorEnabled: Boolean) = apply {
            this.indicatorEnabled = indicatorEnabled
        }

        override fun orientation(orientation: TabsOrientation) = apply {
            this.orientation = orientation
        }

        override fun disclosureTextStyle(disclosureTextStyle: TextStyle) = apply {
            this.disclosureTextStyle = disclosureTextStyle
        }

        override fun overflowNextIcon(overflowNextIcon: Int) = apply {
            this.overflowNextIcon = overflowNextIcon
        }

        override fun overflowPrevIcon(overflowPrevIcon: Int) = apply {
            this.overflowPrevIcon = overflowPrevIcon
        }

        override fun disclosureIcon(disclosureIcon: Int) = apply {
            this.disclosureIcon = disclosureIcon
        }

        override fun style(): TabsStyle {
            return DefaultTabsStyle(
                shape = shape ?: RoundedCornerShape(0),
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                tabItemStyle = tabItemStyle ?: TabItemStyle.builder().style(),
                disclosureIcon = disclosureIcon,
                overflowNextIcon = overflowNextIcon,
                overflowPrevIcon = overflowPrevIcon,
                orientation = orientation ?: TabsOrientation.Horizontal,
                dividerEnabled = dividerEnabled ?: true,
                indicatorEnabled = indicatorEnabled ?: true,
                disclosureTextStyle = disclosureTextStyle ?: TextStyle.Default,
                dropdownMenuStyle = dropdownMenuStyle ?: DropdownMenuStyle.builder().style(),
                dividerStyle = dividerStyle ?: DividerStyle.builder().style(),
            )
        }
    }
}

/**
 * Цвета компонента [Tabs]
 */
@Immutable
interface TabsColors {

    /**
     * Цвет фона контейнера с табами
     */
    val backgroundColor: InteractiveColor

    /**
     * Цвет индикатора выбранного таба
     */
    val indicatorColor: InteractiveColor

    /**
     * Цвет иконки кнопки перемотки вправо
     */
    val overflowNextIconColor: InteractiveColor

    /**
     * Цвет иконки кнопки перемотки влево
     */
    val overflowPrevIconColor: InteractiveColor

    /**
     * Цвет иконки disclosure
     */
    val disclosureColor: InteractiveColor

    companion object {

        /**
         * Возвращает экземпляр [TabsColorsBuilder]
         */
        fun builder(): TabsColorsBuilder = DefaultTabsColors.Builder()
    }
}

/**
 * Билдер для [TabsColors]
 */
interface TabsColorsBuilder {

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(backgroundColor: Color): TabsColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(backgroundColor: InteractiveColor): TabsColorsBuilder

    /**
     * Устанавливает цвет индикатора выбранного таба
     */
    fun indicatorColor(indicatorColor: Color): TabsColorsBuilder =
        indicatorColor(indicatorColor.asInteractive())

    /**
     * Устанавливает цвет индикатора выбранного таба
     */
    fun indicatorColor(indicatorColor: InteractiveColor): TabsColorsBuilder

    /**
     * Устанавливает цвет иконки кнопки перемотки вправо
     */
    fun overflowNextIconColor(overflowNextIconColor: Color): TabsColorsBuilder =
        overflowNextIconColor(overflowNextIconColor.asInteractive())

    /**
     * Устанавливает цвет иконки кнопки перемотки вправо
     */
    fun overflowNextIconColor(overflowNextIconColor: InteractiveColor): TabsColorsBuilder

    /**
     * Устанавливает цвет иконки кнопки перемотки влево
     */
    fun overflowPrevIconColor(overflowPrevIconColor: Color): TabsColorsBuilder =
        overflowPrevIconColor(overflowPrevIconColor.asInteractive())

    /**
     * Устанавливает цвет иконки кнопки перемотки влево
     */
    fun overflowPrevIconColor(overflowPrevIconColor: InteractiveColor): TabsColorsBuilder

    /**
     * Устанавливает цвет иконки disclosure
     */
    fun disclosureColor(disclosureColor: Color): TabsColorsBuilder =
        disclosureColor(disclosureColor.asInteractive())

    /**
     * Устанавливает цвет иконки disclosure
     */
    fun disclosureColor(disclosureColor: InteractiveColor): TabsColorsBuilder

    /**
     * Возвращает [TabsColors]
     */
    fun build(): TabsColors
}

@Immutable
private class DefaultTabsColors(
    override val backgroundColor: InteractiveColor,
    override val indicatorColor: InteractiveColor,
    override val overflowNextIconColor: InteractiveColor,
    override val overflowPrevIconColor: InteractiveColor,
    override val disclosureColor: InteractiveColor,
) : TabsColors {

    class Builder : TabsColorsBuilder {
        private var backgroundColor: InteractiveColor? = null
        private var indicatorColor: InteractiveColor? = null
        private var overflowNextIconColor: InteractiveColor? = null
        private var overflowPrevIconColor: InteractiveColor? = null
        private var disclosureColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: InteractiveColor) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun indicatorColor(indicatorColor: InteractiveColor) = apply {
            this.indicatorColor = indicatorColor
        }

        override fun overflowNextIconColor(overflowNextIconColor: InteractiveColor) = apply {
            this.overflowNextIconColor = overflowNextIconColor
        }

        override fun overflowPrevIconColor(overflowPrevIconColor: InteractiveColor) = apply {
            this.overflowPrevIconColor = overflowPrevIconColor
        }

        override fun disclosureColor(disclosureColor: InteractiveColor) = apply {
            this.disclosureColor = disclosureColor
        }

        override fun build(): TabsColors {
            return DefaultTabsColors(
                backgroundColor = backgroundColor ?: Color.White.asInteractive(),
                indicatorColor = indicatorColor ?: Color.Black.asInteractive(),
                overflowNextIconColor = overflowNextIconColor ?: Color.Black.asInteractive(),
                overflowPrevIconColor = overflowPrevIconColor ?: Color.Black.asInteractive(),
                disclosureColor = disclosureColor ?: Color.Black.asInteractive(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента [Tabs]
 */
@Immutable
interface TabsDimensions {

    /**
     * Толщина индикатора выбранного таба
     */
    val indicatorThickness: Dp

    /**
     * Минимальное расстояние между табами
     */
    val minSpacing: Dp

    /**
     * Минимальная высота компонента
     */
    val minHeight: Dp

    companion object {

        /**
         * Возвращает экземпляр [TabsDimensionsBuilder]
         */
        fun builder(): TabsDimensionsBuilder = DefaultTabsDimensions.Builder()
    }
}

/**
 * Билдер для [TabsDimensions]
 */
interface TabsDimensionsBuilder {

    /**
     * Устанавливает толщину индикатора выборанного таба
     */
    fun indicatorThickness(indicatorThickness: Dp): TabsDimensionsBuilder

    /**
     * Устанавливает минимальное расстояние между табами
     */
    fun minSpacing(minSpacing: Dp): TabsDimensionsBuilder

    /**
     * Устанавливает минимальную высоту компонента
     */
    fun minHeight(minHeight: Dp): TabsDimensionsBuilder

    /**
     * Вернет [TabsDimensions]
     */
    fun build(): TabsDimensions
}

@Immutable
private class DefaultTabsDimensions(
    override val indicatorThickness: Dp,
    override val minSpacing: Dp,
    override val minHeight: Dp,
) : TabsDimensions {

    class Builder : TabsDimensionsBuilder {
        private var indicatorThickness: Dp? = null
        private var minSpacing: Dp? = null
        private var minHeight: Dp? = null

        override fun indicatorThickness(indicatorThickness: Dp) = apply {
            this.indicatorThickness = indicatorThickness
        }

        override fun minSpacing(minSpacing: Dp) = apply {
            this.minSpacing = minSpacing
        }

        override fun minHeight(minHeight: Dp) = apply {
            this.minHeight = minHeight
        }

        override fun build(): TabsDimensions {
            return DefaultTabsDimensions(
                indicatorThickness = indicatorThickness ?: 2.dp,
                minSpacing = minSpacing ?: 4.dp,
                minHeight = minHeight ?: 32.dp,
            )
        }
    }
}
