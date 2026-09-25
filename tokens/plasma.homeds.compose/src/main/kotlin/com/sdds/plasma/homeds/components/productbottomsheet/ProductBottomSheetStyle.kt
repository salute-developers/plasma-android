package com.sdds.plasma.homeds.components.productbottomsheet

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ProductBottomSheetStyle] для компонента [ProductBottomSheet]
 */
val LocalProductBottomSheetStyle =
    compositionLocalOf { ProductBottomSheetStyle.builder().style() }

/**
 * Стиль компонента [ProductBottomSheet]
 */
@Stable
interface ProductBottomSheetStyle : Style {

    /**
     * Стиль компонента [ModalBottomSheetStyle]
     * @see ModalBottomSheetStyle
     */
    val bottomSheetStyle: ModalBottomSheetStyle

    /**
     * Стиль компонента [ButtonGroupStyle]
     * @see ButtonGroupStyle
     */
    val buttonGroupStyle: ButtonGroupStyle

    /**
     * Стиль текста заголовка.
     */
    public val titleStyle: StatefulValue<TextStyle>

    /**
     * Стиль текста подзаголовка.
     */
    public val subTitleStyle: StatefulValue<TextStyle>

    /**
     * Размеры и отступы
     * @see ProductBottomSheetDimensions
     */
    val dimensions: ProductBottomSheetDimensions

    companion object {

        /**
         * Возвращает экземпляр [ProductBottomSheetStyleBuilder]
         */
        fun builder(receiver: Any? = null): ProductBottomSheetStyleBuilder = DefaultProductBottomSheetStyle.Builder()
    }
}

/**
 * Размеры и отступы
 */
@Immutable
interface ProductBottomSheetDimensions {

    /**
     * Отступ контента внутри блока header от края в начале
     */
    val headerPaddingStart: StatefulValue<Dp>

    /**
     * Отступ контента внутри блока header от края в конце
     */
    val headerPaddingEnd: StatefulValue<Dp>

    /**
     * Отступ контента внутри блока header от верхнего края
     */
    val headerPaddingTop: StatefulValue<Dp>

    /**
     * Отступ контента внутри блока header от нижнего края
     */
    val headerPaddingBottom: StatefulValue<Dp>

    /**
     * Отступ контента внутри блока body от края в начале
     */
    val bodyPaddingStart: StatefulValue<Dp>

    /**
     * Отступ контента внутри блока body от края в конце
     */
    val bodyPaddingEnd: StatefulValue<Dp>

    /**
     * Отступ контента внутри блока body от верхнего края
     */
    val bodyPaddingTop: StatefulValue<Dp>

    /**
     * Отступ контента внутри блока body от нижнего края
     */
    val bodyPaddingBottom: StatefulValue<Dp>

    /**
     * Отступ контента внутри блока footer от края в начале
     */
    val footerPaddingStart: StatefulValue<Dp>

    /**
     * Отступ контента внутри блока footer от края в конце
     */
    val footerPaddingEnd: StatefulValue<Dp>

    /**
     * Отступ контента внутри блока footer от верхнего края
     */
    val footerPaddingTop: StatefulValue<Dp>

    /**
     * Отступ контента внутри блока footer от нижнего края
     */
    val footerPaddingBottom: StatefulValue<Dp>

    /**
     * Отступ между title и subtitle внутри блока header
     */
    val subtitleGap: StatefulValue<Dp>
}

/**
 * Builder для [ProductBottomSheetDimensions]
 */
interface ProductBottomSheetDimensionsBuilder {

    /**
     * Устанавливает отступ контента внутри блока header от верхнего края
     */
    fun headerPaddingTop(pTop: Dp): ProductBottomSheetDimensionsBuilder =
        headerPaddingTop(pTop.asStatefulValue())

    /**
     * Устанавливает отступ контента  внутри блока header от верхнего края
     */
    fun headerPaddingTop(pTop: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder

    /**
     * Устанавливает отступ контента внутри блока header от края в начале
     */
    fun headerPaddingStart(pStart: Dp): ProductBottomSheetDimensionsBuilder =
        headerPaddingStart(pStart.asStatefulValue())

    /**
     * Устанавливает отступ контента внутри блока header от края в начале
     */
    fun headerPaddingStart(pStart: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder

    /**
     * Устанавливает отступ контента внутри блока header от края в конце
     */
    fun headerPaddingEnd(pEnd: Dp): ProductBottomSheetDimensionsBuilder =
        headerPaddingEnd(pEnd.asStatefulValue())

    /**
     * Устанавливает отступ контента внутри блока header от края в конце
     */
    fun headerPaddingEnd(pEnd: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder

    /**
     * Устанавливает отступ контента внутри блока header от нижнего края
     */
    fun headerPaddingBottom(pBottom: Dp): ProductBottomSheetDimensionsBuilder =
        headerPaddingBottom(pBottom.asStatefulValue())

    /**
     * Устанавливает отступ контента внутри блока header от нижнего края
     */
    fun headerPaddingBottom(pBottom: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder

    /**
     * Устанавливает отступ контента внутри блока body от верхнего края
     */
    fun bodyPaddingTop(pTop: Dp): ProductBottomSheetDimensionsBuilder =
        bodyPaddingTop(pTop.asStatefulValue())

    /**
     * Устанавливает отступ контента внутри блока body от верхнего края
     */
    fun bodyPaddingTop(pTop: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder

    /**
     * Устанавливает отступ контента внутри блока body от края в начале
     */
    fun bodyPaddingStart(pStart: Dp): ProductBottomSheetDimensionsBuilder =
        bodyPaddingStart(pStart.asStatefulValue())

    /**
     * Устанавливает отступ контента внутри блока body от края в начале
     */
    fun bodyPaddingStart(pStart: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder

    /**
     * Устанавливает отступ контента внутри блока body от края в конце
     */
    fun bodyPaddingEnd(pEnd: Dp): ProductBottomSheetDimensionsBuilder =
        bodyPaddingEnd(pEnd.asStatefulValue())

    /**
     * Устанавливает отступ контента внутри блока body от края в конце
     */
    fun bodyPaddingEnd(pEnd: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder

    /**
     * Устанавливает отступ контента внутри блока body от нижнего края
     */
    fun bodyPaddingBottom(pBottom: Dp): ProductBottomSheetDimensionsBuilder =
        bodyPaddingBottom(pBottom.asStatefulValue())

    /**
     * Устанавливает отступ контента внутри блока body от нижнего края
     */
    fun bodyPaddingBottom(pBottom: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder

    /**
     * Устанавливает отступ контента внутри блока footer от верхнего края
     */
    fun footerPaddingTop(pTop: Dp): ProductBottomSheetDimensionsBuilder =
        footerPaddingTop(pTop.asStatefulValue())

    /**
     * Устанавливает отступ контента внутри блока footer от верхнего края
     */
    fun footerPaddingTop(pTop: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder

    /**
     * Устанавливает отступ контента внутри блока footer от края в начале
     */
    fun footerPaddingStart(pStart: Dp): ProductBottomSheetDimensionsBuilder =
        footerPaddingStart(pStart.asStatefulValue())

    /**
     * Устанавливает отступ контента внутри блока footer от края в начале
     */
    fun footerPaddingStart(pStart: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder

    /**
     * Устанавливает отступ контента внутри блока footer от края в конце
     */
    fun footerPaddingEnd(pEnd: Dp): ProductBottomSheetDimensionsBuilder =
        footerPaddingEnd(pEnd.asStatefulValue())

    /**
     * Устанавливает отступ контента внутри блока footer от края в конце
     */
    fun footerPaddingEnd(pEnd: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder

    /**
     * Устанавливает отступ контента внутри блока footer от нижнего края
     */
    fun footerPaddingBottom(pBottom: Dp): ProductBottomSheetDimensionsBuilder =
        footerPaddingBottom(pBottom.asStatefulValue())

    /**
     * Устанавливает отступ контента внутри блока footer от нижнего края
     */
    fun footerPaddingBottom(pBottom: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder

    /**
     * Устанавливает отступ контента внутри блока footer от нижнего края
     */
    fun subtitleGap(gap: Dp): ProductBottomSheetDimensionsBuilder =
        subtitleGap(gap.asStatefulValue())

    /**
     * Устанавливает отступ контента внутри блока footer от нижнего края
     */
    fun subtitleGap(gap: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder

    /**
     * Возвращает готовый экземпляр [ProductBottomSheetDimensions]
     */
    fun build(): ProductBottomSheetDimensions

    companion object {
        /**
         * Возвращает экземпляр [ ProductBottomSheetDimensionsBuilder]
         */
        fun builder(): ProductBottomSheetDimensionsBuilder = DefaultProductBottomSheetDimensions.Builder()
    }
}

@Immutable
private class DefaultProductBottomSheetDimensions(
    override val headerPaddingStart: StatefulValue<Dp>,
    override val headerPaddingEnd: StatefulValue<Dp>,
    override val headerPaddingTop: StatefulValue<Dp>,
    override val headerPaddingBottom: StatefulValue<Dp>,
    override val bodyPaddingStart: StatefulValue<Dp>,
    override val bodyPaddingEnd: StatefulValue<Dp>,
    override val bodyPaddingTop: StatefulValue<Dp>,
    override val bodyPaddingBottom: StatefulValue<Dp>,
    override val footerPaddingStart: StatefulValue<Dp>,
    override val footerPaddingEnd: StatefulValue<Dp>,
    override val footerPaddingTop: StatefulValue<Dp>,
    override val footerPaddingBottom: StatefulValue<Dp>,
    override val subtitleGap: StatefulValue<Dp>,
) : ProductBottomSheetDimensions {
    class Builder : ProductBottomSheetDimensionsBuilder {
        private var headerPaddingStart: StatefulValue<Dp>? = null
        private var headerPaddingEnd: StatefulValue<Dp>? = null
        private var headerPaddingTop: StatefulValue<Dp>? = null
        private var headerPaddingBottom: StatefulValue<Dp>? = null

        private var bodyPaddingStart: StatefulValue<Dp>? = null
        private var bodyPaddingEnd: StatefulValue<Dp>? = null
        private var bodyPaddingTop: StatefulValue<Dp>? = null
        private var bodyPaddingBottom: StatefulValue<Dp>? = null

        private var footerPaddingStart: StatefulValue<Dp>? = null
        private var footerPaddingEnd: StatefulValue<Dp>? = null
        private var footerPaddingTop: StatefulValue<Dp>? = null
        private var footerPaddingBottom: StatefulValue<Dp>? = null
        private var subtitleGap: StatefulValue<Dp>? = null

        override fun headerPaddingStart(pStart: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder = apply {
            this.headerPaddingStart = pStart
        }

        override fun headerPaddingEnd(pEnd: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder = apply {
            this.headerPaddingEnd = pEnd
        }

        override fun headerPaddingTop(pTop: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder = apply {
            this.headerPaddingTop = pTop
        }

        override fun headerPaddingBottom(pBottom: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder = apply {
            this.headerPaddingBottom = pBottom
        }

        override fun bodyPaddingStart(pStart: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder = apply {
            this.bodyPaddingStart = pStart
        }

        override fun bodyPaddingEnd(pEnd: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder = apply {
            this.bodyPaddingEnd = pEnd
        }

        override fun bodyPaddingTop(pTop: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder = apply {
            this.bodyPaddingTop = pTop
        }

        override fun bodyPaddingBottom(pBottom: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder = apply {
            this.bodyPaddingBottom = pBottom
        }

        override fun footerPaddingStart(pStart: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder = apply {
            this.footerPaddingStart = pStart
        }

        override fun footerPaddingEnd(pEnd: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder = apply {
            this.footerPaddingEnd = pEnd
        }

        override fun footerPaddingTop(pTop: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder = apply {
            this.footerPaddingTop = pTop
        }

        override fun footerPaddingBottom(pBottom: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder = apply {
            this.footerPaddingBottom = pBottom
        }

        override fun subtitleGap(gap: StatefulValue<Dp>): ProductBottomSheetDimensionsBuilder = apply {
            this.subtitleGap = gap
        }

        @Suppress("CyclomaticComplexMethod")
        override fun build(): ProductBottomSheetDimensions {
            return DefaultProductBottomSheetDimensions(
                headerPaddingStart = headerPaddingStart ?: 0.dp.asStatefulValue(),
                headerPaddingEnd = headerPaddingEnd ?: 0.dp.asStatefulValue(),
                headerPaddingTop = headerPaddingTop ?: 0.dp.asStatefulValue(),
                headerPaddingBottom = headerPaddingBottom ?: 0.dp.asStatefulValue(),
                bodyPaddingStart = bodyPaddingStart ?: 0.dp.asStatefulValue(),
                bodyPaddingEnd = bodyPaddingEnd ?: 0.dp.asStatefulValue(),
                bodyPaddingTop = bodyPaddingTop ?: 0.dp.asStatefulValue(),
                bodyPaddingBottom = bodyPaddingBottom ?: 0.dp.asStatefulValue(),
                footerPaddingStart = footerPaddingStart ?: 0.dp.asStatefulValue(),
                footerPaddingEnd = footerPaddingEnd ?: 0.dp.asStatefulValue(),
                footerPaddingTop = footerPaddingTop ?: 0.dp.asStatefulValue(),
                footerPaddingBottom = footerPaddingBottom ?: 0.dp.asStatefulValue(),
                subtitleGap = subtitleGap ?: 0.dp.asStatefulValue(),
            )
        }
    }
}

/**
 * Builder стиля [ProductBottomSheet].
 */
@Stable
interface ProductBottomSheetStyleBuilder : StyleBuilder<ProductBottomSheetStyle> {

    /**
     * Устанавливает стиль компонента [ModalBottomSheetStyle]
     */
    fun bottomSheetStyle(style: ModalBottomSheetStyle): ProductBottomSheetStyleBuilder

    /**
     * Устанавливает стиль компонента [ButtonGroupStyle]
     */
    fun buttonGroupStyle(style: ButtonGroupStyle): ProductBottomSheetStyleBuilder

    /**
     * Устанавливает стиль текста [style] целой части числа компонента.
     * @see ProductBottomSheetStyleBuilder.titleStyle
     */
    fun titleStyle(style: TextStyle): ProductBottomSheetStyleBuilder =
        titleStyle(style.asStatefulValue())

    /**
     * Устанавливает стили текста [style] целой части числа компонента.
     * @see ProductBottomSheetStyleBuilder.titleStyle
     */
    fun titleStyle(style: StatefulValue<TextStyle>): ProductBottomSheetStyleBuilder

    /**
     * Устанавливает стиль текста [style] целой части числа компонента.
     * @see ProductBottomSheetStyleBuilder.subTitleStyle
     */
    fun subTitleStyle(style: TextStyle): ProductBottomSheetStyleBuilder =
        subTitleStyle(style.asStatefulValue())

    /**
     * Устанавливает стили текста [style] целой части числа компонента.
     * @see ProductBottomSheetStyleBuilder.subTitleStyle
     */
    fun subTitleStyle(style: StatefulValue<TextStyle>): ProductBottomSheetStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable ProductBottomSheetDimensionsBuilder.() -> Unit): ProductBottomSheetStyleBuilder
}

@Immutable
internal class DefaultProductBottomSheetStyle(
    override val dimensions: ProductBottomSheetDimensions,
    override val buttonGroupStyle: ButtonGroupStyle,
    override val bottomSheetStyle: ModalBottomSheetStyle,
    override val titleStyle: StatefulValue<TextStyle>,
    override val subTitleStyle: StatefulValue<TextStyle>,
) : ProductBottomSheetStyle {
    @Stable
    class Builder : ProductBottomSheetStyleBuilder {

        private var bottomSheetStyle: ModalBottomSheetStyle? = null
        private var buttonGroupStyle: ButtonGroupStyle? = null
        private var titleStyle: StatefulValue<TextStyle>? = null
        private var subTitleStyle: StatefulValue<TextStyle>? = null

        private var dimensionsBuilder: ProductBottomSheetDimensionsBuilder =
            ProductBottomSheetDimensionsBuilder.builder()

        override fun bottomSheetStyle(style: ModalBottomSheetStyle): ProductBottomSheetStyleBuilder = apply {
            this.bottomSheetStyle = style
        }

        override fun buttonGroupStyle(style: ButtonGroupStyle): ProductBottomSheetStyleBuilder = apply {
            this.buttonGroupStyle = style
        }

        override fun titleStyle(style: StatefulValue<TextStyle>): ProductBottomSheetStyleBuilder = apply {
            this.titleStyle = style
        }

        override fun subTitleStyle(style: StatefulValue<TextStyle>): ProductBottomSheetStyleBuilder = apply {
            this.subTitleStyle = style
        }

        @Composable
        override fun dimensions(
            builder: @Composable (ProductBottomSheetDimensionsBuilder.() -> Unit),
        ): ProductBottomSheetStyleBuilder = apply {
            this.dimensionsBuilder.builder()
        }

        override fun style(): ProductBottomSheetStyle {
            return DefaultProductBottomSheetStyle(
                bottomSheetStyle = bottomSheetStyle ?: ModalBottomSheetStyle.builder().style(),
                titleStyle = titleStyle ?: TextStyle.Default.asStatefulValue(),
                subTitleStyle = subTitleStyle ?: TextStyle.Default.asStatefulValue(),
                dimensions = dimensionsBuilder.build(),
                buttonGroupStyle = buttonGroupStyle ?: ButtonGroupStyle.builder().style(),
            )
        }
    }
}
