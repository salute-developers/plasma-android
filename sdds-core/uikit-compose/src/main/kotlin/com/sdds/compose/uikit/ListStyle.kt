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
     * Устанавливает стиль [Counter]
     */
    fun listItemStyle(listItemStyle: ListItemStyle): ListStyleBuilder
}

@Immutable
private class DefaultListStyle(
    override val listItemStyle: ListItemStyle,
) : ListStyle {

    class Builder : ListStyleBuilder {
        private var listItemStyle: ListItemStyle? = null

        override fun listItemStyle(listItemStyle: ListItemStyle) = apply {
            this.listItemStyle = listItemStyle
        }

        override fun style(): ListStyle {
            return DefaultListStyle(
                listItemStyle = listItemStyle ?: ListItemStyle.builder().style(),
            )
        }
    }
}
