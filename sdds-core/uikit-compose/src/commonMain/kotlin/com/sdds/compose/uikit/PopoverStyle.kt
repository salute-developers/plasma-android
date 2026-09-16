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
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulBrush
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
    @Deprecated("use shapes", replaceWith = ReplaceWith("shapes"))
    val shape: CornerBasedShape

    /**
     * Формы компонента
     */
    val shapes: StatefulValue<CornerBasedShape>

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
@ApiInfo
interface PopoverStyleBuilder : StyleBuilder<PopoverStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): PopoverStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): PopoverStyleBuilder

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
    override val shapes: StatefulValue<CornerBasedShape>,
    override val shadow: ShadowAppearance,
    override val dimensions: PopoverDimensions,
    override val colors: PopoverColors,
) : PopoverStyle {

    @Deprecated("use shapes", replaceWith = ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()
    class Builder : PopoverStyleBuilder {
        private var shapes: StatefulValue<CornerBasedShape>? = null
        private var shadow: ShadowAppearance? = null
        private val colorsBuilder = PopoverColors.builder()
        private val dimensionsBuilder = PopoverDimensions.builder()

        override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
            this.shapes = shape
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
                shapes = shapes ?: RoundedCornerShape(15).asStatefulValue(),
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
    fun backgroundColor(backgroundColor: Color): PopoverColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: InteractiveColor): PopoverColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

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
    @Deprecated("use widthValues", replaceWith = ReplaceWith("widthValues"))
    val width: Dp

    /**
     * Минимальная ширина компонента
     */
    val widthValues: StatefulValue<Dp>

    /**
     * Отступ до компонента
     */
    @Deprecated("use offsetValues", replaceWith = ReplaceWith("offsetValues"))
    val offset: Dp

    /**
     * Отступ до компонента
     */
    val offsetValues: StatefulValue<Dp>

    /**
     * Ширина указателя
     */
    @Deprecated("use tailWidthValues", replaceWith = ReplaceWith("tailWidthValues"))
    val tailWidth: Dp

    /**
     * Ширина указателя
     */
    val tailWidthValues: StatefulValue<Dp>

    /**
     * Высота указателя
     */
    @Deprecated("use tailHeightValues", replaceWith = ReplaceWith("tailHeightValues"))
    val tailHeight: Dp

    /**
     * Высота указателя
     */
    val tailHeightValues: StatefulValue<Dp>

    /**
     * Отступ указателя
     */
    @Deprecated("use tailPaddingValues", replaceWith = ReplaceWith("tailPaddingValues"))
    val tailPadding: Dp

    /**
     * Отступ указателя
     */
    val tailPaddingValues: StatefulValue<Dp>

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
    fun width(width: Dp): PopoverDimensionsBuilder = width(width.asStatefulValue())

    /**
     * Устанавливает минимальную ширину [width] компонента.
     */
    fun width(width: StatefulValue<Dp>): PopoverDimensionsBuilder

    /**
     * Устанавливает смещение [offset] компонента относительно триггера.
     */
    fun offset(offset: Dp): PopoverDimensionsBuilder = offset(offset.asStatefulValue())

    /**
     * Устанавливает смещение [offset] компонента относительно триггера.
     */
    fun offset(offset: StatefulValue<Dp>): PopoverDimensionsBuilder

    /**
     * Устанавливает ширину [tailWidth] указателя.
     */
    fun tailWidth(tailWidth: Dp): PopoverDimensionsBuilder = tailWidth(tailWidth.asStatefulValue())

    /**
     * Устанавливает ширину [tailWidth] указателя.
     */
    fun tailWidth(tailWidth: StatefulValue<Dp>): PopoverDimensionsBuilder

    /**
     * Устанавливает высоту [tailHeight] указателя.
     */
    fun tailHeight(tailHeight: Dp): PopoverDimensionsBuilder = tailHeight(tailHeight.asStatefulValue())

    /**
     * Устанавливает высоту [tailHeight] указателя.
     */
    fun tailHeight(tailHeight: StatefulValue<Dp>): PopoverDimensionsBuilder

    /**
     * Устанавливает отступ [tailPadding] указателя относительно края компонента.
     */
    fun tailPadding(tailPadding: Dp): PopoverDimensionsBuilder = tailPadding(tailPadding.asStatefulValue())

    /**
     * Устанавливает отступ [tailPadding] указателя относительно края компонента.
     */
    fun tailPadding(tailPadding: StatefulValue<Dp>): PopoverDimensionsBuilder

    /**
     * Создает экземпляр [PopoverDimensions]
     */
    fun build(): PopoverDimensions
}

private class DefaultPopoverDimensions(
    override val widthValues: StatefulValue<Dp>,
    override val offsetValues: StatefulValue<Dp>,
    override val tailWidthValues: StatefulValue<Dp>,
    override val tailHeightValues: StatefulValue<Dp>,
    override val tailPaddingValues: StatefulValue<Dp>,

) : PopoverDimensions {
    @Deprecated("use widthValues", replaceWith = ReplaceWith("widthValues"))
    override val width: Dp = widthValues.getDefaultValue()

    @Deprecated("use offsetValues", replaceWith = ReplaceWith("offsetValues"))
    override val offset: Dp = offsetValues.getDefaultValue()

    @Deprecated("use tailWidthValues", replaceWith = ReplaceWith("tailWidthValues"))
    override val tailWidth: Dp = tailWidthValues.getDefaultValue()

    @Deprecated("use tailHeightValues", replaceWith = ReplaceWith("tailHeightValues"))
    override val tailHeight: Dp = tailHeightValues.getDefaultValue()

    @Deprecated("use tailPaddingValues", replaceWith = ReplaceWith("tailPaddingValues"))
    override val tailPadding: Dp = tailPaddingValues.getDefaultValue()

    class Builder : PopoverDimensionsBuilder {

        private var width: StatefulValue<Dp>? = null
        private var offset: StatefulValue<Dp>? = null
        private var tailWidth: StatefulValue<Dp>? = null
        private var tailHeight: StatefulValue<Dp>? = null
        private var tailPadding: StatefulValue<Dp>? = null

        override fun width(width: StatefulValue<Dp>) = apply {
            this.width = width
        }

        override fun offset(offset: StatefulValue<Dp>) = apply {
            this.offset = offset
        }

        override fun tailWidth(tailWidth: StatefulValue<Dp>) = apply {
            this.tailWidth = tailWidth
        }

        override fun tailHeight(tailHeight: StatefulValue<Dp>) = apply {
            this.tailHeight = tailHeight
        }

        override fun tailPadding(tailPadding: StatefulValue<Dp>) = apply {
            this.tailPadding = tailPadding
        }

        override fun build(): PopoverDimensions {
            return DefaultPopoverDimensions(
                widthValues = width ?: 40.dp.asStatefulValue(),
                offsetValues = offset ?: 0.dp.asStatefulValue(),
                tailWidthValues = tailWidth ?: 20.dp.asStatefulValue(),
                tailHeightValues = tailHeight ?: 8.dp.asStatefulValue(),
                tailPaddingValues = tailPadding ?: 10.dp.asStatefulValue(),
            )
        }
    }
}
