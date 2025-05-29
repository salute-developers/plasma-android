package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [PopoverStyle] для компонента [Popover]
 */
val LocalPopoverStyle = compositionLocalOf { PopoverStyle.builder().style() }

/**
 * Стиль компонента Popover
 */
@Immutable
interface PopoverStyle : Style {

    /**
     * Форма компонента
     */
    val shape: CornerBasedShape

    /**
     * Тень компонента
     */
    val shadow: ShadowAppearance

    /**
     * Размеры и отступы компонента
     */
    val dimensions: PopoverDimensions

    /**
     * Цвета компонента
     */
    val colors: PopoverColors

    companion object {
        /**
         * Возвращает экземпляр [PopoverStyleBuilder]
         */
        fun builder(receiver: Any? = null): PopoverStyleBuilder = DefaultPopoverStyle.Builder()
    }
}

/**
 * Билдер стиля [PopoverStyle]
 */
interface PopoverStyleBuilder : StyleBuilder<PopoverStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): PopoverStyleBuilder

    /**
     * Устанавливает тень [shadow] компонента
     */
    fun shadow(shadow: ShadowAppearance): PopoverStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(builder: @Composable PopoverColorsBuilder.() -> Unit): PopoverStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(builder: @Composable PopoverDimensionsBuilder.() -> Unit): PopoverStyleBuilder
}

private class DefaultPopoverStyle(
    override val shape: CornerBasedShape,
    override val shadow: ShadowAppearance,
    override val dimensions: PopoverDimensions,
    override val colors: PopoverColors,
) : PopoverStyle {

    class Builder : PopoverStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var shadow: ShadowAppearance? = null
        private val colorsBuilder = PopoverColors.builder()
        private val dimensionsBuilder = PopoverDimensions.builder()

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun shadow(shadow: ShadowAppearance) = apply {
            this.shadow = shadow
        }

        @Composable
        override fun colors(builder: @Composable (PopoverColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (PopoverDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun style(): PopoverStyle {
            return DefaultPopoverStyle(
                shape = shape ?: RoundedCornerShape(15),
                shadow = shadow ?: ShadowAppearance(),
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
            )
        }
    }
}

/**
 * Цвета компонента Popover
 */
@Immutable
interface PopoverColors {

    /**
     * Цвет фона
     */
    val backgroundColor: StatefulValue<Brush>

    companion object {

        /**
         * Создает экземпляр [PopoverColorsBuilder]
         */
        fun builder(): PopoverColorsBuilder = DefaultPopoverColors.Builder()
    }
}

/**
 * Builder для [PopoverColors]
 */
interface PopoverColorsBuilder {
    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Brush): PopoverColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): PopoverColorsBuilder

    /**
     * Создает экземпляр [PopoverColors]
     */
    fun build(): PopoverColors
}

@Immutable
private data class DefaultPopoverColors(
    override val backgroundColor: StatefulValue<Brush>,
) : PopoverColors {

    class Builder : PopoverColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun build(): PopoverColors {
            return DefaultPopoverColors(
                backgroundColor = backgroundColor ?: SolidColor(Color.LightGray).asStatefulValue(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface PopoverDimensions {

    /**
     * Минимальная ширина компонента
     */
    val width: Dp

    /**
     * Отступ до компонента
     */
    val offset: Dp

    /**
     * Ширина указателя
     */
    val tailWidth: Dp

    /**
     * Высота указателя
     */
    val tailHeight: Dp

    /**
     * Отступ указателя
     */
    val tailPadding: Dp

    companion object {
        /**
         * Создает экземпляр [PopoverDimensionsBuilder]
         */
        fun builder(): PopoverDimensionsBuilder = DefaultPopoverDimensions.Builder()
    }
}

/**
 * Builder для [PopoverDimensions]
 */
interface PopoverDimensionsBuilder {
    /**
     * Устанавливает минимальную ширину [width] компонента.
     */
    fun width(width: Dp): PopoverDimensionsBuilder

    /**
     * Устанавливает смещение [offset] компонента относительно триггера.
     */
    fun offset(offset: Dp): PopoverDimensionsBuilder

    /**
     * Устанавливает ширину [tailWidth] указателя.
     */
    fun tailWidth(tailWidth: Dp): PopoverDimensionsBuilder

    /**
     * Устанавливает высоту [tailHeight] указателя.
     */
    fun tailHeight(tailHeight: Dp): PopoverDimensionsBuilder

    /**
     * Устанавливает отступ [tailPadding] указателя относительно края компонента.
     */
    fun tailPadding(tailPadding: Dp): PopoverDimensionsBuilder

    /**
     * Создает экземпляр [PopoverDimensions]
     */
    fun build(): PopoverDimensions
}

private class DefaultPopoverDimensions(
    override val width: Dp,
    override val offset: Dp,
    override val tailWidth: Dp,
    override val tailHeight: Dp,
    override val tailPadding: Dp,
) : PopoverDimensions {

    class Builder : PopoverDimensionsBuilder {

        private var width: Dp? = null
        private var offset: Dp? = null
        private var tailWidth: Dp? = null
        private var tailHeight: Dp? = null
        private var tailPadding: Dp? = null

        override fun width(width: Dp) = apply {
            this.width = width
        }

        override fun offset(offset: Dp) = apply {
            this.offset = offset
        }

        override fun tailWidth(tailWidth: Dp) = apply {
            this.tailWidth = tailWidth
        }

        override fun tailHeight(tailHeight: Dp) = apply {
            this.tailHeight = tailHeight
        }

        override fun tailPadding(tailPadding: Dp) = apply {
            this.tailPadding = tailPadding
        }

        override fun build(): PopoverDimensions {
            return DefaultPopoverDimensions(
                width = width ?: 40.dp,
                offset = offset ?: 0.dp,
                tailWidth = tailWidth ?: 20.dp,
                tailHeight = tailHeight ?: 8.dp,
                tailPadding = tailPadding ?: 10.dp,
            )
        }
    }
}
