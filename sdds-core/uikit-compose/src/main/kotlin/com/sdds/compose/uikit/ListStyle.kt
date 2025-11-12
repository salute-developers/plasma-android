package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
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
     * Устанавливает стиль разделителей [dividerStyle]
     */
    fun dividerStyle(dividerStyle: DividerStyle): ListStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder]
     */
    @Composable
    fun dimensions(builder: @Composable ListDimensionsBuilder.() -> Unit): ListStyleBuilder
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
     * Оступ снизу
     */
    val paddingBottom: Dp

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
    fun gap(gap: Dp): ListDimensionsBuilder

    /**
     * Устанавливает отступ в начале
     */
    fun paddingStart(paddingStart: Dp): ListDimensionsBuilder

    /**
     * Устанавливает отступ в конце
     */
    fun paddingEnd(paddingEnd: Dp): ListDimensionsBuilder

    /**
     * Устанавливает отступ сверху
     */
    fun paddingTop(paddingTop: Dp): ListDimensionsBuilder

    /**
     * Устанавливает отступ снизу
     */
    fun paddingBottom(paddingBottom: Dp): ListDimensionsBuilder

    /**
     * Создаёт экземпляр [ListDimensions]
     */
    fun build(): ListDimensions
}

@Immutable
private class DefaultListStyle(
    override val listItemStyle: ListItemStyle,
    override val dividerStyle: DividerStyle,
    override val dimensions: ListDimensions,
) : ListStyle {

    class Builder : ListStyleBuilder {
        private var listItemStyle: ListItemStyle? = null
        private var dividerStyle: DividerStyle? = null
        private var dimensionsBuilder: ListDimensionsBuilder = ListDimensions.builder()

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

        override fun listItemStyle(listItemStyle: ListItemStyle) = apply {
            this.listItemStyle = listItemStyle
        }

        override fun style(): ListStyle {
            return DefaultListStyle(
                listItemStyle = listItemStyle ?: ListItemStyle.builder().style(),
                dividerStyle = dividerStyle ?: DividerStyle.builder().style(),
                dimensions = dimensionsBuilder.build(),
            )
        }
    }
}

@Immutable
private class DefaultListDimensions(
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val gap: Dp,
) : ListDimensions {

    class Builder : ListDimensionsBuilder {
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var paddingTop: Dp? = null
        private var paddingBottom: Dp? = null
        private var gap: Dp? = null

        override fun paddingStart(paddingStart: Dp) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: Dp) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: Dp) = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: Dp) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun gap(gap: Dp) = apply {
            this.gap = gap
        }

        override fun build(): ListDimensions {
            return DefaultListDimensions(
                paddingStart = paddingStart ?: 0.dp,
                paddingEnd = paddingEnd ?: 0.dp,
                paddingTop = paddingTop ?: 0.dp,
                paddingBottom = paddingBottom ?: 0.dp,
                gap = gap ?: Dp.Unspecified,
            )
        }
    }
}
