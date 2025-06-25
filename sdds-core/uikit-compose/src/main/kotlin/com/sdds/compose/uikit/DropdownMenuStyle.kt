package com.sdds.compose.uikit

import DropdownMenu
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
 * CompositionLocal c [DropdownMenuStyle] для компонента [DropdownMenu]
 */
val LocalDropdownMenuStyle = compositionLocalOf { DropdownMenuStyle.builder().style() }

/**
 * Стиль компонента DropdownMenu
 */
@Immutable
interface DropdownMenuStyle : Style {

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
    val dimensions: DropdownMenuDimensions

    /**
     * Цвета компонента
     */
    val colors: DropdownMenuColors

    /**
     * Стиль списка
     */
    val listStyle: ListStyle

    /**
     * Стиль разделителя
     */
    val dividerStyle: DividerStyle

    companion object {
        /**
         * Возвращает экземпляр [DropdownMenuStyleBuilder]
         */
        fun builder(receiver: Any? = null): DropdownMenuStyleBuilder =
            DefaultDropdownMenuStyle.Builder()
    }
}

/**
 * Билдер стиля [DropdownMenuStyle]
 */
interface DropdownMenuStyleBuilder : StyleBuilder<DropdownMenuStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): DropdownMenuStyleBuilder

    /**
     * Устанавливает тень [shadow] компонента
     */
    fun shadow(shadow: ShadowAppearance): DropdownMenuStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(builder: @Composable DropdownMenuColorsBuilder.() -> Unit): DropdownMenuStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(builder: @Composable DropdownMenuDimensionsBuilder.() -> Unit): DropdownMenuStyleBuilder

    /**
     * Устанавливает стиль списка [listStyle]
     */
    fun listStyle(listStyle: ListStyle): DropdownMenuStyleBuilder

    /**
     * Устанавливает стиль разделителя [dividerStyle]
     */
    fun dividerStyle(dividerStyle: DividerStyle): DropdownMenuStyleBuilder
}

@Immutable
private class DefaultDropdownMenuStyle(
    override val shape: CornerBasedShape,
    override val shadow: ShadowAppearance,
    override val dimensions: DropdownMenuDimensions,
    override val colors: DropdownMenuColors,
    override val listStyle: ListStyle,
    override val dividerStyle: DividerStyle,
) : DropdownMenuStyle {

    class Builder : DropdownMenuStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var shadow: ShadowAppearance? = null
        private val colorsBuilder = DropdownMenuColors.builder()
        private val dimensionsBuilder = DropdownMenuDimensions.builder()
        private var listStyle: ListStyle? = null
        private var dividerStyle: DividerStyle? = null

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun shadow(shadow: ShadowAppearance) = apply {
            this.shadow = shadow
        }

        @Composable
        override fun colors(builder: @Composable (DropdownMenuColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (DropdownMenuDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun listStyle(listStyle: ListStyle) = apply {
            this.listStyle = listStyle
        }

        override fun dividerStyle(dividerStyle: DividerStyle) = apply {
            this.dividerStyle = dividerStyle
        }

        override fun style(): DropdownMenuStyle {
            return DefaultDropdownMenuStyle(
                shape = shape ?: RoundedCornerShape(15),
                shadow = shadow ?: ShadowAppearance(),
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                listStyle = listStyle ?: ListStyle.builder().style(),
                dividerStyle = dividerStyle ?: DividerStyle.builder().style(),
            )
        }
    }
}

/**
 * Цвета компонента DropdownMenu
 */
@Immutable
interface DropdownMenuColors {

    /**
     * Цвет фона
     */
    val backgroundColor: StatefulValue<Brush>

    /**
     * Цвет обводки
     */
    val strokeColor: StatefulValue<Brush>

    companion object {

        /**
         * Создает экземпляр [DropdownMenuColorsBuilder]
         */
        fun builder(): DropdownMenuColorsBuilder = DefaultDropdownMenuColors.Builder()
    }
}

/**
 * Builder для [DropdownMenuColors]
 */
interface DropdownMenuColorsBuilder {
    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Brush): DropdownMenuColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): DropdownMenuColorsBuilder

    /**
     * Устанавливает цвет обводки [strokeColor] компонента.
     */
    fun strokeColor(strokeColor: Brush): DropdownMenuColorsBuilder =
        strokeColor(strokeColor.asStatefulValue())

    /**
     * Устанавливает цает обводки [strokeColor] компонента.
     */
    fun strokeColor(strokeColor: StatefulValue<Brush>): DropdownMenuColorsBuilder

    /**
     * Создает экземпляр [DropdownMenuColors]
     */
    fun build(): DropdownMenuColors
}

@Immutable
private data class DefaultDropdownMenuColors(
    override val backgroundColor: StatefulValue<Brush>,
    override val strokeColor: StatefulValue<Brush>,
) : DropdownMenuColors {

    class Builder : DropdownMenuColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var strokeColor: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun strokeColor(strokeColor: StatefulValue<Brush>) = apply {
            this.strokeColor = strokeColor
        }

        override fun build(): DropdownMenuColors {
            return DefaultDropdownMenuColors(
                backgroundColor = backgroundColor ?: SolidColor(Color.Transparent).asStatefulValue(),
                strokeColor = strokeColor ?: SolidColor(Color.DarkGray).asStatefulValue(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface DropdownMenuDimensions {

    /**
     * Минимальная ширина компонента
     */
    val width: Dp

    /**
     * Отступ до компонента
     */
    val offset: Dp

    /**
     * Толщина обводки
     */
    val strokeWidth: Dp

    companion object {
        /**
         * Создает экземпляр [DropdownMenuDimensionsBuilder]
         */
        fun builder(): DropdownMenuDimensionsBuilder = DefaultDropdownMenuDimensions.Builder()
    }
}

/**
 * Builder для [DropdownMenuDimensions]
 */
interface DropdownMenuDimensionsBuilder {
    /**
     * Устанавливает минимальную ширину [width] компонента.
     */
    fun width(width: Dp): DropdownMenuDimensionsBuilder

    /**
     * Устанавливает смещение [offset] компонента относительно триггера.
     */
    fun offset(offset: Dp): DropdownMenuDimensionsBuilder

    /**
     * Устанавливает толщину обводки [strokeWidth]
     */
    fun strokeWidth(strokeWidth: Dp): DropdownMenuDimensionsBuilder

    /**
     * Создает экземпляр [DropdownMenuDimensions]
     */
    fun build(): DropdownMenuDimensions
}

@Immutable
private class DefaultDropdownMenuDimensions(
    override val width: Dp,
    override val offset: Dp,
    override val strokeWidth: Dp,
) : DropdownMenuDimensions {

    class Builder : DropdownMenuDimensionsBuilder {

        private var width: Dp? = null
        private var strokeWidth: Dp? = null
        private var offset: Dp? = null

        override fun width(width: Dp) = apply {
            this.width = width
        }

        override fun offset(offset: Dp) = apply {
            this.offset = offset
        }

        override fun strokeWidth(strokeWidth: Dp) = apply {
            this.strokeWidth = strokeWidth
        }

        override fun build(): DropdownMenuDimensions {
            return DefaultDropdownMenuDimensions(
                width = width ?: 40.dp,
                offset = offset ?: 0.dp,
                strokeWidth = strokeWidth ?: Dp.Unspecified,
            )
        }
    }
}
