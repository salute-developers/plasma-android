package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.internal.common.asBrush
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
    @Deprecated("Use topShapeValue instead")
    val topShape: CornerBasedShape

    /**
     * Форма скруглений верхних углов TabBar с поддержкой состояний
     */
    val topShapeValue: StatefulValue<CornerBasedShape>

    /**
     * Форма скруглений нижних углов TabBar
     */
    @Deprecated("Use bottomShapeValue instead")
    val bottomShape: CornerBasedShape

    /**
     * Форма скруглений нижних углов TabBar с поддержкой состояний
     */
    val bottomShapeValue: StatefulValue<CornerBasedShape>

    /**
     * Тень TabBar
     */
    @Deprecated("Use shadowValue instead")
    val shadow: ShadowAppearance

    /**
     * Тень TabBar с поддержкой состояний
     */
    val shadowValue: StatefulValue<ShadowAppearance>

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
@ApiInfo
interface TabBarStyleBuilder : StyleBuilder<TabBarStyle> {
    /**
     * Устанавливает форму верхних скруглений
     */
    fun topShape(topShape: StatefulValue<CornerBasedShape>): TabBarStyleBuilder

    /**
     * Устанавливает форму верхних скруглений
     */
    fun topShape(topShape: CornerBasedShape): TabBarStyleBuilder = topShape(topShape.asStatefulValue())

    /**
     * Устанавливает форму нижний скруглений
     */
    fun bottomShape(bottomShape: StatefulValue<CornerBasedShape>): TabBarStyleBuilder

    /**
     * Устанавливает форму нижний скруглений
     */
    fun bottomShape(bottomShape: CornerBasedShape): TabBarStyleBuilder = bottomShape(bottomShape.asStatefulValue())

    /**
     * Устанавливает тень компонента
     */
    fun shadow(shadow: StatefulValue<ShadowAppearance>): TabBarStyleBuilder

    /**
     * Устанавливает тень компонента
     */
    fun shadow(shadow: ShadowAppearance): TabBarStyleBuilder = shadow(shadow.asStatefulValue())

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
    override val topShapeValue: StatefulValue<CornerBasedShape>,
    override val bottomShapeValue: StatefulValue<CornerBasedShape>,
    override val shadowValue: StatefulValue<ShadowAppearance>,
    override val colors: TabBarColors,
    override val dimensions: TabBarDimensions,
    override val tabBarItemStyle: TabBarItemStyle,
) : TabBarStyle {
    override val topShape: CornerBasedShape = topShapeValue.getDefaultValue()
    override val bottomShape: CornerBasedShape = bottomShapeValue.getDefaultValue()
    override val shadow: ShadowAppearance = shadowValue.getDefaultValue()

    class Builder : TabBarStyleBuilder {
        private var topShape: StatefulValue<CornerBasedShape>? = null
        private var bottomShape: StatefulValue<CornerBasedShape>? = null
        private var shadow: StatefulValue<ShadowAppearance>? = null
        private val colorsBuilder: TabBarColorsBuilder = TabBarColors.builder()
        private val dimensionsBuilder: TabBarDimensionsBuilder = TabBarDimensions.builder()
        private var tabBarItemStyle: TabBarItemStyle? = null

        override fun topShape(topShape: StatefulValue<CornerBasedShape>): TabBarStyleBuilder = apply {
            this.topShape = topShape
        }

        override fun bottomShape(bottomShape: StatefulValue<CornerBasedShape>): TabBarStyleBuilder = apply {
            this.bottomShape = bottomShape
        }

        override fun shadow(shadow: StatefulValue<ShadowAppearance>): TabBarStyleBuilder = apply {
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
            topShapeValue = topShape ?: RoundedCornerShape(0).asStatefulValue(),
            bottomShapeValue = bottomShape ?: RoundedCornerShape(0).asStatefulValue(),
            shadowValue = shadow ?: ShadowAppearance().asStatefulValue(),
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
    @Deprecated("Use background instead")
    val backgroundColor: InteractiveColor

    /**
     * Цвет фона
     */
    val background: StatefulValue<Brush>

    /**
     * Цвет разделителя
     */
    @Deprecated("Use divider instead")
    val dividerColor: InteractiveColor

    /**
     * Цвет разделителя
     */
    val divider: StatefulValue<Brush>

    /**
     * Цвет эффекта размытия
     */
    @Deprecated("Use blurTint instead")
    val backgroundBlurTint: InteractiveColor

    /**
     * Цвет эффекта размытия
     */
    val blurTint: StatefulValue<Brush>

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
        backgroundColor(backgroundColor.asBrush().asStatefulValue())

    /**
     * Устанавливает цвет фона [backgroundColor]
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): TabBarColorsBuilder

    /**
     * Устанавливает цвет разделителя [dividerColor]
     */
    fun dividerColor(dividerColor: InteractiveColor): TabBarColorsBuilder = dividerColor(dividerColor.asStatefulBrush())

    /**
     * Устанавливает цвет разделителя [dividerColor]
     */
    fun dividerColor(dividerColor: Color): TabBarColorsBuilder =
        dividerColor(dividerColor.asBrush().asStatefulValue())

    /**
     * Устанавливает цвет разделителя [dividerColor]
     */
    fun dividerColor(dividerColor: Brush): TabBarColorsBuilder =
        dividerColor(dividerColor.asStatefulValue())

    /**
     * Устанавливает цвет разделителя [dividerColor]
     */
    fun dividerColor(dividerColor: StatefulValue<Brush>): TabBarColorsBuilder

    /**
     * Устанавливает цвет [blurTint] для эффекта размытия.
     * Если эффект размытия не поддерживается на устройстве, то будет использован цвет [backgroundColor]
     */
    fun backgroundBlurTint(
        blurTint: InteractiveColor,
    ): TabBarColorsBuilder = backgroundBlurTint(blurTint.asStatefulBrush())

    /**
     * Устанавливает цвет [blurTint] для эффекта размытия.
     * Если эффект размытия не поддерживается на устройстве, то будет использован цвет [backgroundColor]
     */
    fun backgroundBlurTint(blurTint: Color): TabBarColorsBuilder =
        backgroundBlurTint(blurTint.asBrush().asStatefulValue())

    /**
     * Устанавливает цвет [blurTint] для эффекта размытия.
     * Если эффект размытия не поддерживается на устройстве, то будет использован цвет [backgroundColor]
     */
    fun backgroundBlurTint(blurTint: Brush): TabBarColorsBuilder =
        backgroundBlurTint(blurTint.asStatefulValue())

    /**
     * Устанавливает цвет [blurTint] для эффекта размытия.
     * Если эффект размытия не поддерживается на устройстве, то будет использован цвет [backgroundColor]
     */
    fun backgroundBlurTint(blurTint: StatefulValue<Brush>): TabBarColorsBuilder

    /**
     * Вернёт [TabBarColors]
     */
    fun build(): TabBarColors
}

private data class DefaultTabBarColors(
    override val backgroundColor: InteractiveColor,
    override val dividerColor: InteractiveColor,
    override val backgroundBlurTint: InteractiveColor,
    override val background: StatefulValue<Brush>,
    override val divider: StatefulValue<Brush>,
    override val blurTint: StatefulValue<Brush>,
) : TabBarColors {
    class Builder : TabBarColorsBuilder {
        private var backgroundColor: InteractiveColor? = null
        private var background: StatefulValue<Brush>? = null
        private var backgroundBlurTint: StatefulValue<Brush>? = null
        private var dividerColor: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundColor: InteractiveColor): TabBarColorsBuilder =
            apply { this.backgroundColor = backgroundColor }

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>): TabBarColorsBuilder =
            apply { this.background = backgroundColor }

        override fun dividerColor(dividerColor: StatefulValue<Brush>): TabBarColorsBuilder =
            apply {
                this.dividerColor = dividerColor
            }

        override fun backgroundBlurTint(blurTint: StatefulValue<Brush>): TabBarColorsBuilder =
            apply {
                this.backgroundBlurTint = blurTint
            }

        override fun build(): TabBarColors {
            val background = background
                ?: backgroundColor?.asStatefulBrush()
                ?: Color.Transparent.asBrush().asStatefulValue()
            val divider = dividerColor ?: Color.Unspecified.asBrush().asStatefulValue()
            val blurTint = backgroundBlurTint ?: Color.Unspecified.asBrush().asStatefulValue()
            return DefaultTabBarColors(
                backgroundColor = backgroundColor ?: background.defaultInteractiveColor(),
                dividerColor = divider.defaultInteractiveColor(),
                backgroundBlurTint = blurTint.defaultInteractiveColor(),
                background = background,
                divider = divider,
                blurTint = blurTint,
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
interface TabBarDimensions {
    /**
     * Внешний отступ в начале
     */
    @Deprecated("Use paddingStartValue instead")
    val paddingStart: Dp

    /**
     * Внешний отступ в начале с поддержкой состояний
     */
    val paddingStartValue: StatefulValue<Dp>

    /**
     * Внешний отступ в конце
     */
    @Deprecated("Use paddingEndValue instead")
    val paddingEnd: Dp

    /**
     * Внешний отступ в конце с поддержкой состояний
     */
    val paddingEndValue: StatefulValue<Dp>

    /**
     * Внешний отступ сверху
     */
    @Deprecated("Use paddingTopValue instead")
    val paddingTop: Dp

    /**
     * Внешний отступ сверху с поддержкой состояний
     */
    val paddingTopValue: StatefulValue<Dp>

    /**
     * Внешний отступ снизу
     */
    @Deprecated("Use paddingBottomValue instead")
    val paddingBottom: Dp

    /**
     * Внешний отступ снизу с поддержкой состояний
     */
    val paddingBottomValue: StatefulValue<Dp>

    /**
     * Внутренний отступ в начале
     */
    @Deprecated("Use contentPaddingStartValue instead")
    val contentPaddingStart: Dp

    /**
     * Внутренний отступ в начале с поддержкой состояний
     */
    val contentPaddingStartValue: StatefulValue<Dp>

    /**
     * Внутренний отступ в конце
     */
    @Deprecated("Use contentPaddingEndValue instead")
    val contentPaddingEnd: Dp

    /**
     * Внутренний отступ в конце с поддержкой состояний
     */
    val contentPaddingEndValue: StatefulValue<Dp>

    /**
     * Внутренний отступ сверху
     */
    @Deprecated("Use contentPaddingTopValue instead")
    val contentPaddingTop: Dp

    /**
     * Внутренний отступ сверху с поддержкой состояний
     */
    val contentPaddingTopValue: StatefulValue<Dp>

    /**
     * Внутренний отступ снизу
     */
    @Deprecated("Use contentPaddingBottomValue instead")
    val contentPaddingBottom: Dp

    /**
     * Внутренний отступ снизу с поддержкой состояний
     */
    val contentPaddingBottomValue: StatefulValue<Dp>

    /**
     * Расстояние между элементами TabBar
     */
    @Deprecated("Use itemSpacingValue instead")
    val itemSpacing: Dp

    /**
     * Расстояние между элементами TabBar с поддержкой состояний
     */
    val itemSpacingValue: StatefulValue<Dp>

    /**
     * Толщина разделителя
     */
    @Deprecated("Use dividerThicknessValue instead")
    val dividerThickness: Dp

    /**
     * Толщина разделителя с поддержкой состояний
     */
    val dividerThicknessValue: StatefulValue<Dp>

    /**
     * Радиус эффекта размытия для фона
     */
    @Deprecated("Use backgroundBlurRadiusValue instead")
    val backgroundBlurRadius: Dp

    /**
     * Радиус эффекта размытия для фона с поддержкой состояний
     */
    val backgroundBlurRadiusValue: StatefulValue<Dp>

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
    fun paddingStart(paddingStart: Dp): TabBarDimensionsBuilder = paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает внешний отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): TabBarDimensionsBuilder

    /**
     * Устанавливает внешний отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): TabBarDimensionsBuilder = paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает внешний отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): TabBarDimensionsBuilder

    /**
     * Устанавливает внешний отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): TabBarDimensionsBuilder = paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает внешний отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): TabBarDimensionsBuilder

    /**
     * Устанавливает внешний отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): TabBarDimensionsBuilder = paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает внешний отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): TabBarDimensionsBuilder

    /**
     * Устанавливает внутренний отступ в начале [contentPaddingStart]
     */
    fun contentPaddingStart(
        contentPaddingStart: Dp,
    ): TabBarDimensionsBuilder = contentPaddingStart(contentPaddingStart.asStatefulValue())

    /**
     * Устанавливает внутренний отступ в начале [contentPaddingStart]
     */
    fun contentPaddingStart(contentPaddingStart: StatefulValue<Dp>): TabBarDimensionsBuilder

    /**
     * Устанавливает внутрениий отступ в конце [contentPaddingEnd]
     */
    fun contentPaddingEnd(
        contentPaddingEnd: Dp,
    ): TabBarDimensionsBuilder = contentPaddingEnd(contentPaddingEnd.asStatefulValue())

    /**
     * Устанавливает внутрениий отступ в конце [contentPaddingEnd]
     */
    fun contentPaddingEnd(contentPaddingEnd: StatefulValue<Dp>): TabBarDimensionsBuilder

    /**
     * Устанавливает внутренний отступ сверху [contentPaddingTop]
     */
    fun contentPaddingTop(
        contentPaddingTop: Dp,
    ): TabBarDimensionsBuilder = contentPaddingTop(contentPaddingTop.asStatefulValue())

    /**
     * Устанавливает внутренний отступ сверху [contentPaddingTop]
     */
    fun contentPaddingTop(contentPaddingTop: StatefulValue<Dp>): TabBarDimensionsBuilder

    /**
     * Устанавливает внутренний отступ снизу [contentPaddingBottom]
     */
    fun contentPaddingBottom(
        contentPaddingBottom: Dp,
    ): TabBarDimensionsBuilder = contentPaddingBottom(contentPaddingBottom.asStatefulValue())

    /**
     * Устанавливает внутренний отступ снизу [contentPaddingBottom]
     */
    fun contentPaddingBottom(contentPaddingBottom: StatefulValue<Dp>): TabBarDimensionsBuilder

    /**
     * Устанавливает расстояние между элементами [itemSpacing]
     */
    fun itemSpacing(itemSpacing: Dp): TabBarDimensionsBuilder = itemSpacing(itemSpacing.asStatefulValue())

    /**
     * Устанавливает расстояние между элементами [itemSpacing]
     */
    fun itemSpacing(itemSpacing: StatefulValue<Dp>): TabBarDimensionsBuilder

    /**
     * Устанавливает толщину разделителя [dividerThickness]
     */
    fun dividerThickness(
        dividerThickness: Dp,
    ): TabBarDimensionsBuilder = dividerThickness(dividerThickness.asStatefulValue())

    /**
     * Устанавливает толщину разделителя [dividerThickness]
     */
    fun dividerThickness(dividerThickness: StatefulValue<Dp>): TabBarDimensionsBuilder

    /**
     * Устанавливает радиус эффекта размытия для фона окна [radius]
     */
    fun backgroundBlurRadius(radius: Dp): TabBarDimensionsBuilder = backgroundBlurRadius(radius.asStatefulValue())

    /**
     * Устанавливает радиус эффекта размытия для фона окна [radius]
     */
    fun backgroundBlurRadius(radius: StatefulValue<Dp>): TabBarDimensionsBuilder

    /**
     * Вернёт [TabBarDimensions]
     */
    fun build(): TabBarDimensions
}

private data class DefaultTabBarDimensions(
    override val paddingStartValue: StatefulValue<Dp>,
    override val paddingEndValue: StatefulValue<Dp>,
    override val paddingTopValue: StatefulValue<Dp>,
    override val paddingBottomValue: StatefulValue<Dp>,
    override val contentPaddingStartValue: StatefulValue<Dp>,
    override val contentPaddingEndValue: StatefulValue<Dp>,
    override val contentPaddingTopValue: StatefulValue<Dp>,
    override val contentPaddingBottomValue: StatefulValue<Dp>,
    override val itemSpacingValue: StatefulValue<Dp>,
    override val dividerThicknessValue: StatefulValue<Dp>,
    override val backgroundBlurRadiusValue: StatefulValue<Dp>,
) : TabBarDimensions {
    override val paddingStart: Dp = paddingStartValue.getDefaultValue()
    override val paddingEnd: Dp = paddingEndValue.getDefaultValue()
    override val paddingTop: Dp = paddingTopValue.getDefaultValue()
    override val paddingBottom: Dp = paddingBottomValue.getDefaultValue()
    override val contentPaddingStart: Dp = contentPaddingStartValue.getDefaultValue()
    override val contentPaddingEnd: Dp = contentPaddingEndValue.getDefaultValue()
    override val contentPaddingTop: Dp = contentPaddingTopValue.getDefaultValue()
    override val contentPaddingBottom: Dp = contentPaddingBottomValue.getDefaultValue()
    override val itemSpacing: Dp = itemSpacingValue.getDefaultValue()
    override val dividerThickness: Dp = dividerThicknessValue.getDefaultValue()
    override val backgroundBlurRadius: Dp = backgroundBlurRadiusValue.getDefaultValue()

    class Builder : TabBarDimensionsBuilder {
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null
        private var contentPaddingStart: StatefulValue<Dp>? = null
        private var contentPaddingEnd: StatefulValue<Dp>? = null
        private var contentPaddingTop: StatefulValue<Dp>? = null
        private var contentPaddingBottom: StatefulValue<Dp>? = null
        private var itemSpacing: StatefulValue<Dp>? = null
        private var dividerThickness: StatefulValue<Dp>? = null
        private var backgroundBlurRadius: StatefulValue<Dp>? = null

        override fun paddingStart(paddingStart: StatefulValue<Dp>): TabBarDimensionsBuilder = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>): TabBarDimensionsBuilder = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: StatefulValue<Dp>): TabBarDimensionsBuilder = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>): TabBarDimensionsBuilder = apply {
            this.paddingBottom = paddingBottom
        }

        override fun contentPaddingStart(contentPaddingStart: StatefulValue<Dp>): TabBarDimensionsBuilder =
            apply { this.contentPaddingStart = contentPaddingStart }

        override fun contentPaddingEnd(contentPaddingEnd: StatefulValue<Dp>): TabBarDimensionsBuilder =
            apply {
                this.contentPaddingEnd = contentPaddingEnd
            }

        override fun contentPaddingTop(contentPaddingTop: StatefulValue<Dp>): TabBarDimensionsBuilder =
            apply {
                this.contentPaddingTop = contentPaddingTop
            }

        override fun contentPaddingBottom(contentPaddingBottom: StatefulValue<Dp>): TabBarDimensionsBuilder =
            apply { this.contentPaddingBottom = contentPaddingBottom }

        override fun itemSpacing(itemSpacing: StatefulValue<Dp>): TabBarDimensionsBuilder = apply {
            this.itemSpacing = itemSpacing
        }

        override fun dividerThickness(dividerThickness: StatefulValue<Dp>): TabBarDimensionsBuilder =
            apply {
                this.dividerThickness = dividerThickness
            }

        override fun backgroundBlurRadius(radius: StatefulValue<Dp>): TabBarDimensionsBuilder = apply {
            this.backgroundBlurRadius = radius
        }

        override fun build(): TabBarDimensions = DefaultTabBarDimensions(
            paddingStartValue = paddingStart ?: 0.dp.asStatefulValue(),
            paddingEndValue = paddingEnd ?: 0.dp.asStatefulValue(),
            paddingTopValue = paddingTop ?: 0.dp.asStatefulValue(),
            paddingBottomValue = paddingBottom ?: 0.dp.asStatefulValue(),
            contentPaddingStartValue = contentPaddingStart ?: 2.dp.asStatefulValue(),
            contentPaddingEndValue = contentPaddingEnd ?: 2.dp.asStatefulValue(),
            contentPaddingTopValue = contentPaddingTop ?: 2.dp.asStatefulValue(),
            contentPaddingBottomValue = contentPaddingBottom ?: 2.dp.asStatefulValue(),
            itemSpacingValue = itemSpacing ?: 2.dp.asStatefulValue(),
            dividerThicknessValue = dividerThickness ?: 2.dp.asStatefulValue(),
            backgroundBlurRadiusValue = backgroundBlurRadius ?: Dp.Unspecified.asStatefulValue(),
        )
    }
}
