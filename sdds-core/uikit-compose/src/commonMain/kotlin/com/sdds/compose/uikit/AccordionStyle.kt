package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [AccordionStyle] для компонента [Accordion]
 */
val LocalAccordionStyle =
    compositionLocalOf(structuralEqualityPolicy()) { AccordionStyle.builder().style() }

/**
 * Стиль компонента [Accordion]
 */
@Immutable
interface AccordionStyle : Style {

    /**
     * Отступы компонента
     */
    val dimensions: AccordionDimensions

    /**
     * Стиль [Divider]
     */
    val dividerStyle: DividerStyle

    /**
     * Стиль [AccordionItem]
     */
    val accordionItemStyle: AccordionItemStyle

    companion object {
        /**
         * Возвращает экземпляр [AccordionStyleBuilder]
         */
        fun builder(receiver: Any? = null): AccordionStyleBuilder = DefaultAccordionStyle.Builder()
    }
}

@Immutable
private data class DefaultAccordionStyle(
    override val dimensions: AccordionDimensions,
    override val dividerStyle: DividerStyle,
    override val accordionItemStyle: AccordionItemStyle,
) : AccordionStyle {
    class Builder : AccordionStyleBuilder {
        private var dimensionsBuilder: AccordionDimensionsBuilder = AccordionDimensions.builder()
        private var dividerStyle: DividerStyle? = null
        private var accordionItemStyle: AccordionItemStyle? = null

        @Composable
        override fun dimensions(builder: @Composable (AccordionDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun dividerStyle(dividerStyle: DividerStyle) = apply {
            this.dividerStyle = dividerStyle
        }

        override fun accordionItemStyle(accordionItemStyle: AccordionItemStyle) = apply {
            this.accordionItemStyle = accordionItemStyle
        }

        override fun style(): AccordionStyle {
            return DefaultAccordionStyle(
                dimensions = dimensionsBuilder.build(),
                dividerStyle = dividerStyle ?: DividerStyle.builder().style(),
                accordionItemStyle = accordionItemStyle ?: AccordionItemStyle.builder().style(),
            )
        }
    }
}

/**
 * Билдер стиля [AccordionStyle]
 */
interface AccordionStyleBuilder : StyleBuilder<AccordionStyle> {

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder]
     */
    @Composable
    fun dimensions(builder: @Composable AccordionDimensionsBuilder.() -> Unit): AccordionStyleBuilder

    /**
     * Устанавливает стиль компонентов [Divider] в компоненте
     */
    fun dividerStyle(dividerStyle: DividerStyle): AccordionStyleBuilder

    /**
     * Устанавливает стиль компонентов [AccordionItem] в компоненте
     */
    fun accordionItemStyle(accordionItemStyle: AccordionItemStyle): AccordionStyleBuilder
}

/**
 * Размеры и отступы компонента [Accordion]
 */
@Immutable
interface AccordionDimensions {

    /**
     * Отступ между элементами
     */
    val itemSpacing: Dp

    companion object {

        /**
         * Возвращает экземпляр [AccordionDimensionsBuilder]
         */
        fun builder(): AccordionDimensionsBuilder = DefaultAccordionDimensions.Builder()
    }
}

/**
 * Билдер для [AccordionDimensions]
 */
interface AccordionDimensionsBuilder {

    /**
     * Устанавливает отступ между элементами
     */
    fun itemSpacing(itemSpacing: Dp): AccordionDimensionsBuilder

    /**
     * Создаёт экземпляр [AccordionDimensions]
     */
    fun build(): AccordionDimensions
}

@Immutable
private class DefaultAccordionDimensions(
    override val itemSpacing: Dp,
) : AccordionDimensions {
    class Builder : AccordionDimensionsBuilder {
        private var itemSpacing: Dp? = null

        override fun itemSpacing(itemSpacing: Dp) = apply {
            this.itemSpacing = itemSpacing
        }

        override fun build(): AccordionDimensions {
            return DefaultAccordionDimensions(
                itemSpacing = itemSpacing ?: 2.dp,
            )
        }
    }
}
