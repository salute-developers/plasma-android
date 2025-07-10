package com.sdds.compose.uikit

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
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
}

@Immutable
private class DefaultListStyle(
    override val listItemStyle: ListItemStyle,
    override val dividerStyle: DividerStyle,
) : ListStyle {

    class Builder : ListStyleBuilder {
        private var listItemStyle: ListItemStyle? = null
        private var dividerStyle: DividerStyle? = null

        override fun dividerStyle(dividerStyle: DividerStyle) = apply {
            this.dividerStyle = dividerStyle
        }

        override fun listItemStyle(listItemStyle: ListItemStyle) = apply {
            this.listItemStyle = listItemStyle
        }

        override fun style(): ListStyle {
            return DefaultListStyle(
                listItemStyle = listItemStyle ?: ListItemStyle.builder().style(),
                dividerStyle = dividerStyle ?: DividerStyle.builder().style(),
            )
        }
    }
}
