package com.sdds.plasma.giga.components.productmodal

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ProductModalStyle] для компонента [ProductModal]
 */
val LocalProductModalStyle =
    compositionLocalOf { ProductModalStyle.builder().style() }

/**
 * Стиль компонента [ProductModal]
 */
@Stable
interface ProductModalStyle : Style {

    /**
     * Стили текста в header
     */
    val headerTextStyle: StatefulValue<TextStyle>

    /**
     * Стили текста в footer
     */
    val footerTextStyle: StatefulValue<TextStyle>

    /**
     * Стиль компонента [Modal]
     * @see ModalStyle
     */
    val modalStyle: ModalStyle

    /**
     * Стиль компонента [ButtonGroup]
     * @see ButtonGroupStyle
     */
    val buttonGroupStyle: ButtonGroupStyle

    /**
     * Стиль кнопки закрытия (IconButton)
     */
    val iconButtonStyle: ButtonStyle

    /**
     * Размеры и отступы
     * @see ProductModalDimensions
     */
    val dimensions: ProductModalDimensions

    /**
     * Цвета компонента
     */
    val colors: ProductModalColors

    companion object {

        /**
         * Возвращает экземпляр [ProductModalStyleBuilder]
         */
        fun builder(receiver: Any? = null): ProductModalStyleBuilder = DefaultProductModalStyle.Builder()
    }
}

/**
 * Размеры и отступы
 */
@Immutable
interface ProductModalDimensions {

    /**
     * Отступ контента в header от края в начале
     */
    val headerPaddingStart: StatefulValue<Dp>

    /**
     * Отступ контента в header от края в конце
     */
    val headerPaddingEnd: StatefulValue<Dp>

    /**
     * Отступ контента в header от верхнего края
     */
    val headerPaddingTop: StatefulValue<Dp>

    /**
     * Отступ контента в header от нижнего края
     */
    val headerPaddingBottom: StatefulValue<Dp>

    /**
     * Отступ контента в footer от края в начале
     */
    val footerPaddingStart: StatefulValue<Dp>

    /**
     * Отступ контента в footer от края в конце
     */
    val footerPaddingEnd: StatefulValue<Dp>

    /**
     * Отступ контента в footer от верхнего края
     */
    val footerPaddingTop: StatefulValue<Dp>

    /**
     * Отступ контента в footer от нижнего края
     */
    val footerPaddingBottom: StatefulValue<Dp>

    /**
     * Отступ контента в extra от края в начале
     */
    val extraPaddingStart: StatefulValue<Dp>

    /**
     * Отступ контента в extra от края в конце
     */
    val extraPaddingEnd: StatefulValue<Dp>

    /**
     * Отступ контента в extra от верхнего края
     */
    val extraPaddingTop: StatefulValue<Dp>

    /**
     * Отступ контента в extra от нижнего края
     */
    val extraPaddingBottom: StatefulValue<Dp>

    /**
     * Отступ текста от контента в footer
     */
    val footerTextPadding: StatefulValue<Dp>

    /**
     * Отступ иконки закрытия от верхнего края
     */
    val closePaddingTop: StatefulValue<Dp>

    /**
     * Отступ иконки закрытия от края в конце
     */
    val closePaddingEnd: StatefulValue<Dp>
}

/**
 * Builder для [ProductModalDimensions]
 */
interface ProductModalDimensionsBuilder {

    /**
     * Устанавливает отступ контента в header от верхнего края
     */
    fun headerPaddingTop(pTop: Dp): ProductModalDimensionsBuilder =
        headerPaddingTop(pTop.asStatefulValue())

    /**
     * Устанавливает отступ контента в header от верхнего края
     */
    fun headerPaddingTop(pTop: StatefulValue<Dp>): ProductModalDimensionsBuilder

    /**
     * Устанавливает отступ контента в header от края в начале
     */
    fun headerPaddingStart(pStart: Dp): ProductModalDimensionsBuilder =
        headerPaddingStart(pStart.asStatefulValue())

    /**
     * Устанавливает отступ контента в header от края в начале
     */
    fun headerPaddingStart(pStart: StatefulValue<Dp>): ProductModalDimensionsBuilder

    /**
     * Устанавливает отступ контента в header от края в конце
     */
    fun headerPaddingEnd(pEnd: Dp): ProductModalDimensionsBuilder =
        headerPaddingEnd(pEnd.asStatefulValue())

    /**
     * Устанавливает отступ контента в header от края в конце
     */
    fun headerPaddingEnd(pEnd: StatefulValue<Dp>): ProductModalDimensionsBuilder

    /**
     * Устанавливает отступ контента в header от нижнего края
     */
    fun headerPaddingBottom(pBottom: Dp): ProductModalDimensionsBuilder =
        headerPaddingBottom(pBottom.asStatefulValue())

    /**
     * Устанавливает отступ контента в header от нижнего края
     */
    fun headerPaddingBottom(pBottom: StatefulValue<Dp>): ProductModalDimensionsBuilder

    /**
     * Устанавливает отступ контента в footer от верхнего края
     */
    fun footerPaddingTop(pTop: Dp): ProductModalDimensionsBuilder =
        footerPaddingTop(pTop.asStatefulValue())

    /**
     * Устанавливает отступ контента в footer от верхнего края
     */
    fun footerPaddingTop(pTop: StatefulValue<Dp>): ProductModalDimensionsBuilder

    /**
     * Устанавливает отступ контента в footer от края в начале
     */
    fun footerPaddingStart(pStart: Dp): ProductModalDimensionsBuilder =
        footerPaddingStart(pStart.asStatefulValue())

    /**
     * Устанавливает отступ контента в footer от края в начале
     */
    fun footerPaddingStart(pStart: StatefulValue<Dp>): ProductModalDimensionsBuilder

    /**
     * Устанавливает отступ контента в footer от края в конце
     */
    fun footerPaddingEnd(pEnd: Dp): ProductModalDimensionsBuilder =
        footerPaddingEnd(pEnd.asStatefulValue())

    /**
     * Устанавливает отступ контента в footer от края в конце
     */
    fun footerPaddingEnd(pEnd: StatefulValue<Dp>): ProductModalDimensionsBuilder

    /**
     * Устанавливает отступ контента в footer от нижнего края
     */
    fun footerPaddingBottom(pBottom: Dp): ProductModalDimensionsBuilder =
        footerPaddingBottom(pBottom.asStatefulValue())

    /**
     * Устанавливает отступ контента в footer от нижнего края
     */
    fun footerPaddingBottom(pBottom: StatefulValue<Dp>): ProductModalDimensionsBuilder

    /**
     * Устанавливает отступ контента в extra от верхнего края
     */
    fun extraPaddingTop(pTop: Dp): ProductModalDimensionsBuilder =
        extraPaddingTop(pTop.asStatefulValue())

    /**
     * Устанавливает отступ контента в extra от верхнего края
     */
    fun extraPaddingTop(pTop: StatefulValue<Dp>): ProductModalDimensionsBuilder

    /**
     * Устанавливает отступ контента в extra от края в начале
     */
    fun extraPaddingStart(pStart: Dp): ProductModalDimensionsBuilder =
        extraPaddingStart(pStart.asStatefulValue())

    /**
     * Устанавливает отступ контента в extra от края в начале
     */
    fun extraPaddingStart(pStart: StatefulValue<Dp>): ProductModalDimensionsBuilder

    /**
     * Устанавливает отступ контента в extra от края в конце
     */
    fun extraPaddingEnd(pEnd: Dp): ProductModalDimensionsBuilder =
        extraPaddingEnd(pEnd.asStatefulValue())

    /**
     * Устанавливает отступ контента в extra от края в конце
     */
    fun extraPaddingEnd(pEnd: StatefulValue<Dp>): ProductModalDimensionsBuilder

    /**
     * Устанавливает отступ контента в extra от нижнего края
     */
    fun extraPaddingBottom(pBottom: Dp): ProductModalDimensionsBuilder =
        extraPaddingBottom(pBottom.asStatefulValue())

    /**
     * Устанавливает отступ контента в extra от нижнего края
     */
    fun extraPaddingBottom(pBottom: StatefulValue<Dp>): ProductModalDimensionsBuilder

    /**
     * Устанавливает отступ текста от контента в footer
     */
    fun footerTextPadding(pBottom: Dp): ProductModalDimensionsBuilder =
        footerTextPadding(pBottom.asStatefulValue())

    /**
     * Устанавливает отступ текста от контента в footer
     */
    fun footerTextPadding(padding: StatefulValue<Dp>): ProductModalDimensionsBuilder

    /**
     * Устанавливает отступ иконки закрытия от верхнего края
     */
    fun closePaddingTop(pTop: Dp): ProductModalDimensionsBuilder =
        closePaddingTop(pTop.asStatefulValue())

    /**
     * Устанавливает отступ иконки закрытия от верхнего края
     */
    fun closePaddingTop(pTop: StatefulValue<Dp>): ProductModalDimensionsBuilder

    /**
     * Устанавливает отступ иконки закрытия от края в конце
     */
    fun closePaddingEnd(pEnd: Dp): ProductModalDimensionsBuilder =
        closePaddingEnd(pEnd.asStatefulValue())

    /**
     * Устанавливает отступ иконки закрытия от края в конце
     */
    fun closePaddingEnd(pEnd: StatefulValue<Dp>): ProductModalDimensionsBuilder

    /**
     * Возвращает готовый экземпляр [ProductModalDimensions]
     */
    fun build(): ProductModalDimensions

    companion object {
        /**
         * Возвращает экземпляр [ ProductModalDimensionsBuilder]
         */
        fun builder(): ProductModalDimensionsBuilder = DefaultProductModalDimensions.Builder()
    }
}

/**
 * Цвета компонента [ProductModal]
 */
@Stable
interface ProductModalColors {

    /**
     * Кисть текста в header
     */
    val headerTextColor: StatefulValue<Brush>

    /**
     * Кисть текста в footer
     */
    val footerTextColor: StatefulValue<Brush>
}

/**
 * Билдер для [ProductModalColors]
 */
interface ProductModalColorsBuilder {

    /**
     * Устанавливает цвет текста в header
     */
    fun headerTextColor(color: Color): ProductModalColorsBuilder =
        headerTextColor(color.asStatefulBrush())

    /**
     * Устанавливает цвет текста в header
     */
    fun headerTextColor(color: InteractiveColor): ProductModalColorsBuilder =
        headerTextColor(color.asStatefulBrush())

    /**
     * Устанавливает кисть текста в header [brush]
     */
    fun headerTextColor(brush: Brush): ProductModalColorsBuilder =
        headerTextColor(brush.asStatefulValue())

    /**
     * Устанавливает кисти текста в header [brush]
     */
    fun headerTextColor(brush: StatefulValue<Brush>): ProductModalColorsBuilder

    /**
     * Устанавливает цвет текста в footer
     */
    fun footerTextColor(color: Color): ProductModalColorsBuilder =
        footerTextColor(color.asStatefulBrush())

    /**
     * Устанавливает цвет текста в footer
     */
    fun footerTextColor(color: InteractiveColor): ProductModalColorsBuilder =
        footerTextColor(color.asStatefulBrush())

    /**
     * Устанавливает кисть текста в footer [brush]
     */
    fun footerTextColor(brush: Brush): ProductModalColorsBuilder =
        footerTextColor(brush.asStatefulValue())

    /**
     * Устанавливает кисти текста в footer [brush]
     */
    fun footerTextColor(brush: StatefulValue<Brush>): ProductModalColorsBuilder

    /**
     * Возвращает готовый экземпляр [ProductModalColors]
     */
    fun build(): ProductModalColors

    companion object {

        /**
         * Возвращает экземпляр [ProductModalColorsBuilder]
         */
        fun builder(): ProductModalColorsBuilder = DefaultProductModalColors.Builder()
    }
}

@Immutable
private class DefaultProductModalColors(
    override val headerTextColor: StatefulValue<Brush>,
    override val footerTextColor: StatefulValue<Brush>,
) : ProductModalColors {
    class Builder : ProductModalColorsBuilder {

        private var headerTextColor: StatefulValue<Brush>? = null
        private var footerTextColor: StatefulValue<Brush>? = null

        override fun headerTextColor(brush: StatefulValue<Brush>): ProductModalColorsBuilder = apply {
            this.headerTextColor = brush
        }

        override fun footerTextColor(brush: StatefulValue<Brush>): ProductModalColorsBuilder = apply {
            this.footerTextColor = brush
        }

        override fun build(): ProductModalColors {
            return DefaultProductModalColors(
                headerTextColor = headerTextColor ?: Color.Black.asStatefulBrush(),
                footerTextColor = footerTextColor ?: Color.Black.asStatefulBrush(),
            )
        }
    }
}

@Immutable
private class DefaultProductModalDimensions(
    override val headerPaddingTop: StatefulValue<Dp>,
    override val headerPaddingStart: StatefulValue<Dp>,
    override val headerPaddingEnd: StatefulValue<Dp>,
    override val headerPaddingBottom: StatefulValue<Dp>,
    override val footerPaddingStart: StatefulValue<Dp>,
    override val footerPaddingEnd: StatefulValue<Dp>,
    override val footerPaddingTop: StatefulValue<Dp>,
    override val footerPaddingBottom: StatefulValue<Dp>,
    override val extraPaddingStart: StatefulValue<Dp>,
    override val extraPaddingEnd: StatefulValue<Dp>,
    override val extraPaddingTop: StatefulValue<Dp>,
    override val extraPaddingBottom: StatefulValue<Dp>,
    override val footerTextPadding: StatefulValue<Dp>,
    override val closePaddingTop: StatefulValue<Dp>,
    override val closePaddingEnd: StatefulValue<Dp>,

) : ProductModalDimensions {
    class Builder : ProductModalDimensionsBuilder {
        private var headerPaddingTop: StatefulValue<Dp>? = null
        private var headerPaddingStart: StatefulValue<Dp>? = null
        private var headerPaddingEnd: StatefulValue<Dp>? = null
        private var headerPaddingBottom: StatefulValue<Dp>? = null
        private var footerPaddingTop: StatefulValue<Dp>? = null
        private var footerPaddingStart: StatefulValue<Dp>? = null
        private var footerPaddingEnd: StatefulValue<Dp>? = null
        private var footerPaddingBottom: StatefulValue<Dp>? = null
        private var extraPaddingTop: StatefulValue<Dp>? = null
        private var extraPaddingStart: StatefulValue<Dp>? = null
        private var extraPaddingEnd: StatefulValue<Dp>? = null
        private var extraPaddingBottom: StatefulValue<Dp>? = null
        private var footerTextPadding: StatefulValue<Dp>? = null
        private var closePaddingTop: StatefulValue<Dp>? = null
        private var closePaddingEnd: StatefulValue<Dp>? = null

        override fun headerPaddingTop(pTop: StatefulValue<Dp>): ProductModalDimensionsBuilder = apply {
            this.headerPaddingTop = pTop
        }

        override fun headerPaddingStart(pStart: StatefulValue<Dp>): ProductModalDimensionsBuilder = apply {
            this.headerPaddingStart = pStart
        }

        override fun headerPaddingEnd(pEnd: StatefulValue<Dp>): ProductModalDimensionsBuilder = apply {
            this.headerPaddingEnd = pEnd
        }

        override fun headerPaddingBottom(pBottom: StatefulValue<Dp>): ProductModalDimensionsBuilder = apply {
            this.headerPaddingBottom = pBottom
        }

        override fun footerPaddingTop(pTop: StatefulValue<Dp>): ProductModalDimensionsBuilder = apply {
            this.footerPaddingTop = pTop
        }

        override fun footerPaddingStart(pStart: StatefulValue<Dp>): ProductModalDimensionsBuilder = apply {
            this.footerPaddingStart = pStart
        }

        override fun footerPaddingEnd(pEnd: StatefulValue<Dp>): ProductModalDimensionsBuilder = apply {
            this.footerPaddingEnd = pEnd
        }

        override fun footerPaddingBottom(pBottom: StatefulValue<Dp>): ProductModalDimensionsBuilder = apply {
            this.footerPaddingBottom = pBottom
        }

        override fun extraPaddingTop(pTop: StatefulValue<Dp>): ProductModalDimensionsBuilder = apply {
            this.extraPaddingTop = pTop
        }

        override fun extraPaddingStart(pStart: StatefulValue<Dp>): ProductModalDimensionsBuilder = apply {
            this.extraPaddingStart = pStart
        }

        override fun extraPaddingEnd(pEnd: StatefulValue<Dp>): ProductModalDimensionsBuilder = apply {
            this.extraPaddingEnd = pEnd
        }

        override fun extraPaddingBottom(pBottom: StatefulValue<Dp>): ProductModalDimensionsBuilder = apply {
            this.extraPaddingBottom = pBottom
        }

        override fun footerTextPadding(padding: StatefulValue<Dp>): ProductModalDimensionsBuilder = apply {
            this.footerTextPadding = padding
        }

        override fun closePaddingTop(pTop: StatefulValue<Dp>): ProductModalDimensionsBuilder = apply {
            this.closePaddingTop = pTop
        }

        override fun closePaddingEnd(pEnd: StatefulValue<Dp>): ProductModalDimensionsBuilder = apply {
            this.closePaddingEnd = pEnd
        }

        @Suppress("CyclomaticComplexMethod")
        override fun build(): ProductModalDimensions {
            return DefaultProductModalDimensions(
                headerPaddingTop = headerPaddingTop ?: 0.dp.asStatefulValue(),
                headerPaddingStart = headerPaddingStart ?: 0.dp.asStatefulValue(),
                headerPaddingEnd = headerPaddingEnd ?: 0.dp.asStatefulValue(),
                headerPaddingBottom = headerPaddingBottom ?: 0.dp.asStatefulValue(),
                footerPaddingStart = footerPaddingStart ?: 0.dp.asStatefulValue(),
                footerPaddingEnd = footerPaddingEnd ?: 0.dp.asStatefulValue(),
                footerPaddingTop = footerPaddingTop ?: 0.dp.asStatefulValue(),
                footerPaddingBottom = footerPaddingBottom ?: 0.dp.asStatefulValue(),
                extraPaddingStart = extraPaddingStart ?: 0.dp.asStatefulValue(),
                extraPaddingEnd = extraPaddingEnd ?: 0.dp.asStatefulValue(),
                extraPaddingTop = extraPaddingTop ?: 0.dp.asStatefulValue(),
                extraPaddingBottom = extraPaddingBottom ?: 0.dp.asStatefulValue(),
                footerTextPadding = footerTextPadding ?: 0.dp.asStatefulValue(),
                closePaddingTop = closePaddingTop ?: 0.dp.asStatefulValue(),
                closePaddingEnd = closePaddingEnd ?: 0.dp.asStatefulValue(),
            )
        }
    }
}

/**
 * Builder стиля [ProductModal].
 */
@Stable
interface ProductModalStyleBuilder : StyleBuilder<ProductModalStyle> {

    /**
     * Устанавливает стиль текста в header
     */
    fun headerTextStyle(style: TextStyle): ProductModalStyleBuilder =
        headerTextStyle(style.asStatefulValue())

    /**
     * Устанавливает стили текста в header
     */
    fun headerTextStyle(style: StatefulValue<TextStyle>): ProductModalStyleBuilder

    /**
     * Устанавливает стиль текста в footer
     */
    fun footerTextStyle(style: TextStyle): ProductModalStyleBuilder =
        footerTextStyle(style.asStatefulValue())

    /**
     * Устанавливает стили текста в footer
     */
    fun footerTextStyle(style: StatefulValue<TextStyle>): ProductModalStyleBuilder

    /**
     * Устанавливает стиль компонента [Modal]
     */
    fun modalStyle(modalStyle: ModalStyle): ProductModalStyleBuilder

    /**
     * Устанавливает стиль компонента [ButtonGroup]
     */
    fun buttonGroupStyle(buttonGroupStyle: ButtonGroupStyle): ProductModalStyleBuilder

    /**
     * Устанавливает стиль кнопки закрытия (IconButton)
     */
    fun iconButtonStyle(iconButtonStyle: ButtonStyle): ProductModalStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable ProductModalDimensionsBuilder.() -> Unit): ProductModalStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun colors(builder: @Composable ProductModalColorsBuilder.() -> Unit): ProductModalStyleBuilder
}

@Immutable
internal class DefaultProductModalStyle(
    override val modalStyle: ModalStyle,
    override val buttonGroupStyle: ButtonGroupStyle,
    override val iconButtonStyle: ButtonStyle,
    override val dimensions: ProductModalDimensions,
    override val colors: ProductModalColors,
    override val headerTextStyle: StatefulValue<TextStyle>,
    override val footerTextStyle: StatefulValue<TextStyle>,
) : ProductModalStyle {
    @Stable
    class Builder : ProductModalStyleBuilder {

        private var headerTextStyle: StatefulValue<TextStyle>? = null
        private var footerTextStyle: StatefulValue<TextStyle>? = null
        private var modalStyle: ModalStyle? = null
        private var buttonGroupStyle: ButtonGroupStyle? = null
        private var iconButtonStyle: ButtonStyle? = null
        private var dimensionsBuilder: ProductModalDimensionsBuilder = ProductModalDimensionsBuilder.builder()

        private var colorsBuilder: ProductModalColorsBuilder = ProductModalColorsBuilder.builder()

        override fun headerTextStyle(style: StatefulValue<TextStyle>): ProductModalStyleBuilder = apply {
            this.headerTextStyle = style
        }

        override fun footerTextStyle(style: StatefulValue<TextStyle>): ProductModalStyleBuilder = apply {
            this.footerTextStyle = style
        }

        override fun modalStyle(modalStyle: ModalStyle): ProductModalStyleBuilder = apply {
            this.modalStyle = modalStyle
        }

        override fun buttonGroupStyle(buttonGroupStyle: ButtonGroupStyle): ProductModalStyleBuilder = apply {
            this.buttonGroupStyle = buttonGroupStyle
        }

        override fun iconButtonStyle(iconButtonStyle: ButtonStyle): ProductModalStyleBuilder = apply {
            this.iconButtonStyle = iconButtonStyle
        }

        @Composable
        override fun dimensions(
            builder: @Composable (ProductModalDimensionsBuilder.() -> Unit),
        ): ProductModalStyleBuilder = apply {
            this.dimensionsBuilder.builder()
        }

        @Composable
        override fun colors(
            builder: @Composable (ProductModalColorsBuilder.() -> Unit),
        ) = apply {
            this.colorsBuilder.builder()
        }

        override fun style(): ProductModalStyle {
            return DefaultProductModalStyle(
                modalStyle = modalStyle ?: ModalStyle.builder().style(),
                buttonGroupStyle = buttonGroupStyle ?: ButtonGroupStyle.builder().style(),
                iconButtonStyle = iconButtonStyle ?: ButtonStyle.iconButtonBuilder().style(),
                dimensions = dimensionsBuilder.build(),
                colors = colorsBuilder.build(),
                headerTextStyle = headerTextStyle ?: TextStyle.Default.asStatefulValue(),
                footerTextStyle = footerTextStyle ?: TextStyle.Default.asStatefulValue(),
            )
        }
    }
}
