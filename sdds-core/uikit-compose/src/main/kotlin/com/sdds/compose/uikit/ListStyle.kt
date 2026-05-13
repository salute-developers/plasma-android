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
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ListStyle] для компонента [List]
 */
val LocalListStyle =
    compositionLocalOf(structuralEqualityPolicy()) { ListStyle.builder().style() }

/**
 * Стиль компонента [List]
 */
@Immutable
interface ListStyle : Style {

    /**
     * Стиль [ListItem]
     */
    val listItemStyle: ListItemStyle

    /**
     * Стиль [Divider]
     */
    val dividerStyle: DividerStyle

    /**
     * Отступы и размеры
     */
    val dimensions: ListDimensions

    /**
     * Цвета
     */
    val colors: ListColors

    /**
     * Форма
     */
    val shape: Shape

    companion object {
        /**
         * Возвращает экземпляр [ListStyleBuilder]
         */
        fun builder(receiver: Any? = null): ListStyleBuilder = DefaultListStyle.Builder()
    }
}

/**
 * Билдер стиля [ListStyle]
 */
interface ListStyleBuilder : StyleBuilder<ListStyle> {

    /**
     * Устанавливает стиль элементов списка [listItemStyle]
     */
    fun listItemStyle(listItemStyle: ListItemStyle): ListStyleBuilder

    /**
     * Устанавливает стили разделителей [dividerStyle]
     */
    fun dividerStyle(dividerStyle: DividerStyle): ListStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder]
     */
    @Composable
    fun dimensions(builder: @Composable ListDimensionsBuilder.() -> Unit): ListStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     */
    @Composable
    fun colors(builder: @Composable ListColorsBuilder.() -> Unit): ListStyleBuilder

    /**
     * Устанавливает форму компонента
     */
    fun shape(shape: Shape): ListStyleBuilder
}

/**
 * Цвета компонента [ListItem]
 */
@Stable
interface ListColors {

    /**
     * Цвет фона
     */
    @Deprecated("use backgroundBrush", replaceWith = ReplaceWith("backgroundBrush"))
    val backgroundColor: InteractiveColor

    /**
     * Кисти фона
     */
    val backgroundBrush: StatefulValue<Brush>

    companion object {

        /**
         * Возвращает экземпляр [ListColorsBuilder]
         */
        fun builder(): ListColorsBuilder = DefaultListColors.Builder()
    }
}

/**
 * Размеры и отступы компонента [List]
 */
@Stable
interface ListDimensions {

    /**
     * Отступ между контентом вначале и контентом в конце
     */
    val gap: Dp

    /**
     * Отступы между контентом вначале и контентом в конце
     */
    val gapValues: StatefulValue<Dp>

    /**
     * Отступ в начале
     */
    val paddingStart: Dp

    /**
     * Отступы в начале
     */
    val paddingStartValues: StatefulValue<Dp>

    /**
     * Отступ в конце
     */
    val paddingEnd: Dp

    /**
     * Отступы в конце
     */
    val paddingEndValues: StatefulValue<Dp>

    /**
     * Отступ сверху
     */
    val paddingTop: Dp

    /**
     * Отступы сверху
     */
    val paddingTopValues: StatefulValue<Dp>

    /**
     * Оступ снизу
     */
    val paddingBottom: Dp

    /**
     * Оступы снизу
     */
    val paddingBottomValues: StatefulValue<Dp>

    companion object {

        /**
         * Возвращает экземпляр [ListDimensionsBuilder]
         */
        fun builder(): ListDimensionsBuilder = DefaultListDimensions.Builder()
    }
}

/**
 * Билдер для [ListItemDimensions]
 */
interface ListDimensionsBuilder {

    /**
     * Устанавливает отступ между элементами
     */
    fun gap(gap: Dp): ListDimensionsBuilder =
        gap(gap.asStatefulValue())

    /**
     * Устанавливает отступы между элементами
     */
    fun gap(gap: StatefulValue<Dp>): ListDimensionsBuilder

    /**
     * Устанавливает отступ в начале
     */
    fun paddingStart(paddingStart: Dp): ListDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступы в начале
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): ListDimensionsBuilder

    /**
     * Устанавливает отступ в конце
     */
    fun paddingEnd(paddingEnd: Dp): ListDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступы в конце
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): ListDimensionsBuilder

    /**
     * Устанавливает отступ сверху
     */
    fun paddingTop(paddingTop: Dp): ListDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступы сверху
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): ListDimensionsBuilder

    /**
     * Устанавливает отступ снизу
     */
    fun paddingBottom(paddingBottom: Dp): ListDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступы снизу
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): ListDimensionsBuilder

    /**
     * Создаёт экземпляр [ListDimensions]
     */
    fun build(): ListDimensions
}

/**
 * Билдер для [ListItemColors]
 */
interface ListColorsBuilder {

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(backgroundColor: Color): ListColorsBuilder =
        backgroundBrush(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(backgroundColor: InteractiveColor): ListColorsBuilder =
        backgroundBrush(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисти фона
     */
    fun backgroundBrush(backgroundBrush: StatefulValue<Brush>): ListColorsBuilder

    /**
     * Возвращает [ListItemColors]
     */
    fun build(): ListColors
}

@Immutable
private class DefaultListStyle(
    override val listItemStyle: ListItemStyle,
    override val dividerStyle: DividerStyle,
    override val dimensions: ListDimensions,
    override val colors: ListColors,
    override val shape: Shape,
) : ListStyle {

    class Builder : ListStyleBuilder {
        private var listItemStyle: ListItemStyle? = null
        private var dividerStyle: DividerStyle? = null
        private var dimensionsBuilder: ListDimensionsBuilder = ListDimensions.builder()
        private var colorsBuilder: ListColorsBuilder = ListColors.builder()
        private var shape: Shape? = null

        override fun dividerStyle(dividerStyle: DividerStyle) = apply {
            this.dividerStyle = dividerStyle
        }

        @Composable
        override fun dimensions(
            builder:
            @Composable()
            (ListDimensionsBuilder.() -> Unit),
        ) = apply {
            this.dimensionsBuilder.builder()
        }

        @Composable
        override fun colors(builder: @Composable (ListColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        override fun shape(shape: Shape) = apply {
            this.shape = shape
        }

        override fun listItemStyle(listItemStyle: ListItemStyle) = apply {
            this.listItemStyle = listItemStyle
        }

        override fun style(): ListStyle {
            return DefaultListStyle(
                listItemStyle = listItemStyle ?: ListItemStyle.builder().style(),
                dividerStyle = dividerStyle ?: DividerStyle.builder().style(),
                dimensions = dimensionsBuilder.build(),
                colors = colorsBuilder.build(),
                shape = shape ?: RectangleShape,
            )
        }
    }
}

@Immutable
private class DefaultListColors(
    override val backgroundBrush: StatefulValue<Brush>,
) : ListColors {
    @Deprecated("use backgroundBrush", replaceWith = ReplaceWith("backgroundBrush"))
    override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()
    class Builder : ListColorsBuilder {

        private var backgroundBrush: StatefulValue<Brush>? = null

        override fun backgroundBrush(backgroundBrush: StatefulValue<Brush>): ListColorsBuilder = apply {
            this.backgroundBrush = backgroundBrush
        }

        override fun build(): ListColors {
            return DefaultListColors(
                backgroundBrush = backgroundBrush ?: Color.Transparent.asStatefulBrush(),
            )
        }
    }
}

@Immutable
private class DefaultListDimensions(
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,
    override val gapValues: StatefulValue<Dp>,

) : ListDimensions {
    override val paddingStart: Dp = 0.dp
    override val paddingEnd: Dp = 0.dp
    override val paddingTop: Dp = 0.dp
    override val paddingBottom: Dp = 0.dp
    override val gap: Dp = Dp.Unspecified
    class Builder : ListDimensionsBuilder {
        private var paddingStartValues: StatefulValue<Dp>? = null
        private var paddingEndValues: StatefulValue<Dp>? = null
        private var paddingTopValues: StatefulValue<Dp>? = null
        private var paddingBottomValues: StatefulValue<Dp>? = null
        private var gapValues: StatefulValue<Dp>? = null
        override fun gap(gap: StatefulValue<Dp>): ListDimensionsBuilder = apply {
            this.gapValues = gap
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>): ListDimensionsBuilder = apply {
            this.paddingStartValues = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>): ListDimensionsBuilder = apply {
            this.paddingEndValues = paddingEnd
        }

        override fun paddingTop(paddingTop: StatefulValue<Dp>): ListDimensionsBuilder = apply {
            this.paddingTopValues = paddingTop
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>): ListDimensionsBuilder = apply {
            this.paddingBottomValues = paddingBottom
        }

        override fun build(): ListDimensions {
            return DefaultListDimensions(
                paddingStartValues = paddingStartValues ?: 0.dp.asStatefulValue(),
                paddingEndValues = paddingEndValues ?: 0.dp.asStatefulValue(),
                paddingTopValues = paddingTopValues ?: 0.dp.asStatefulValue(),
                paddingBottomValues = paddingBottomValues ?: 0.dp.asStatefulValue(),
                gapValues = gapValues ?: Dp.Unspecified.asStatefulValue(),
            )
        }
    }
}
