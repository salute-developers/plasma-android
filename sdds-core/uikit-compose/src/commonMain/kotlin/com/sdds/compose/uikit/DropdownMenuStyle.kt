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

    /**
     * Стиль пустого состояния
     */
    val emptyStateStyle: DropdownEmptyStateStyle

    /**
     * Стиль прокрутки
     */
    val scrollBarStyle: ScrollBarStyle

    /**
     * Стиль overlay
     */
    val overlayStyle: OverlayStyle

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
@ApiInfo
interface DropdownMenuStyleBuilder : StyleBuilder<DropdownMenuStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): DropdownMenuStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): DropdownMenuStyleBuilder

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

    /**
     * Устанавливает стиль покрутки [scrollBarStyle]
     */
    fun scrollBarStyle(scrollBarStyle: ScrollBarStyle): DropdownMenuStyleBuilder

    /**
     * Устанавливает стиль пустого состояния [emptyStateStyle]
     */
    fun emptyStateStyle(emptyStateStyle: DropdownEmptyStateStyle): DropdownMenuStyleBuilder

    /**
     * Устанавливает стиль [overlayStyle]
     */
    fun overlayStyle(overlayStyle: OverlayStyle): DropdownMenuStyleBuilder
}

@Immutable
private class DefaultDropdownMenuStyle(
    override val shadow: ShadowAppearance,
    override val dimensions: DropdownMenuDimensions,
    override val colors: DropdownMenuColors,
    override val listStyle: ListStyle,
    override val dividerStyle: DividerStyle,
    override val emptyStateStyle: DropdownEmptyStateStyle,
    override val scrollBarStyle: ScrollBarStyle,
    override val overlayStyle: OverlayStyle,
    override val shapes: StatefulValue<CornerBasedShape>,
) : DropdownMenuStyle {
    @Deprecated("use shapes", replaceWith = ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()

    class Builder : DropdownMenuStyleBuilder {
        private var shape: StatefulValue<CornerBasedShape>? = null
        private var shadow: ShadowAppearance? = null
        private val colorsBuilder = DropdownMenuColors.builder()
        private val dimensionsBuilder = DropdownMenuDimensions.builder()
        private var listStyle: ListStyle? = null
        private var dividerStyle: DividerStyle? = null
        private var emptyStateStyle: DropdownEmptyStateStyle? = null
        private var scrollBarStyle: ScrollBarStyle? = null
        private var overlayStyle: OverlayStyle? = null

        override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
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

        override fun scrollBarStyle(scrollBarStyle: ScrollBarStyle) = apply {
            this.scrollBarStyle = scrollBarStyle
        }

        override fun emptyStateStyle(emptyStateStyle: DropdownEmptyStateStyle) = apply {
            this.emptyStateStyle = emptyStateStyle
        }

        override fun overlayStyle(overlayStyle: OverlayStyle) = apply {
            this.overlayStyle = overlayStyle
        }

        override fun style(): DropdownMenuStyle {
            return DefaultDropdownMenuStyle(
                shapes = shape ?: RoundedCornerShape(15).asStatefulValue(),
                shadow = shadow ?: ShadowAppearance(),
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                listStyle = listStyle ?: ListStyle.builder().style(),
                dividerStyle = dividerStyle ?: DividerStyle.builder().style(),
                scrollBarStyle = scrollBarStyle ?: ScrollBarStyle.builder().style(),
                emptyStateStyle = emptyStateStyle ?: DropdownEmptyStateStyle.builder().style(),
                overlayStyle = overlayStyle ?: OverlayStyle.builder().style(),
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
    fun backgroundColor(backgroundColor: Color): DropdownMenuColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: InteractiveColor): DropdownMenuColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

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
    fun strokeColor(strokeColor: Color): DropdownMenuColorsBuilder =
        strokeColor(strokeColor.asStatefulBrush())

    /**
     * Устанавливает цвет обводки [strokeColor] компонента.
     */
    fun strokeColor(strokeColor: InteractiveColor): DropdownMenuColorsBuilder =
        strokeColor(strokeColor.asStatefulBrush())

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
     * Толщина обводки
     */
    @Deprecated("use strokeWidthValues", replaceWith = ReplaceWith("strokeWidthValues"))
    val strokeWidth: Dp

    /**
     * Толщина обводки
     */
    val strokeWidthValues: StatefulValue<Dp>

    /**
     * Отступ в начале
     */
    @Deprecated("use paddingStartValues", replaceWith = ReplaceWith("paddingStartValues"))
    val paddingStart: Dp

    /**
     * Отступ в начале
     */
    val paddingStartValues: StatefulValue<Dp>

    /**
     * Отступ в конце
     */
    @Deprecated("use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
    val paddingEnd: Dp

    /**
     * Отступ в конце
     */
    val paddingEndValues: StatefulValue<Dp>

    /**
     * Отступ сверху
     */
    @Deprecated("use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
    val paddingTop: Dp

    /**
     * Отступ сверху
     */
    val paddingTopValues: StatefulValue<Dp>

    /**
     * Отступ снизу
     */
    @Deprecated("use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
    val paddingBottom: Dp

    /**
     * Отступ снизу
     */
    val paddingBottomValues: StatefulValue<Dp>

    /**
     * Отступ прокрутки сверху
     */
    @Deprecated("use scrollBarPaddingTopValues", replaceWith = ReplaceWith("scrollBarPaddingTopValues"))
    val scrollBarPaddingTop: Dp

    /**
     * Отступ прокрутки сверху
     */
    val scrollBarPaddingTopValues: StatefulValue<Dp>

    /**
     * Отступ прокрутки снизу
     */
    @Deprecated("use scrollBarPaddingBottomValues", replaceWith = ReplaceWith("scrollBarPaddingBottomValues"))
    val scrollBarPaddingBottom: Dp

    /**
     * Отступ прокрутки снизу
     */
    val scrollBarPaddingBottomValues: StatefulValue<Dp>

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
    fun width(width: Dp): DropdownMenuDimensionsBuilder = width(width.asStatefulValue())

    /**
     * Устанавливает минимальную ширину [width] компонента.
     */
    fun width(width: StatefulValue<Dp>): DropdownMenuDimensionsBuilder

    /**
     * Устанавливает смещение [offset] компонента относительно триггера.
     */
    fun offset(offset: Dp): DropdownMenuDimensionsBuilder = offset(offset.asStatefulValue())

    /**
     * Устанавливает смещение [offset] компонента относительно триггера.
     */
    fun offset(offset: StatefulValue<Dp>): DropdownMenuDimensionsBuilder

    /**
     * Устанавливает толщину обводки [strokeWidth]
     */
    fun strokeWidth(strokeWidth: Dp): DropdownMenuDimensionsBuilder = strokeWidth(strokeWidth.asStatefulValue())

    /**
     * Устанавливает толщину обводки [strokeWidth]
     */
    fun strokeWidth(strokeWidth: StatefulValue<Dp>): DropdownMenuDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): DropdownMenuDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступы в начале [paddingStart]
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): DropdownMenuDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): DropdownMenuDimensionsBuilder = paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступы в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): DropdownMenuDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): DropdownMenuDimensionsBuilder = paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступы сверху [paddingTop]
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): DropdownMenuDimensionsBuilder

    /**
     * Устанавливает отступ cнизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): DropdownMenuDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступы cнизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): DropdownMenuDimensionsBuilder

    /**
     * Устанавливает отступ прокрутки сверху [paddingBottom]
     */
    fun scrollBarPaddingTop(scrollBarPaddingTop: Dp): DropdownMenuDimensionsBuilder =
        scrollBarPaddingTop(scrollBarPaddingTop.asStatefulValue())

    /**
     * Устанавливает отступы прокрутки сверху [paddingBottom]
     */
    fun scrollBarPaddingTop(scrollBarPaddingTop: StatefulValue<Dp>): DropdownMenuDimensionsBuilder

    /**
     * Устанавливает отступ прокрутки cнизу [paddingBottom]
     */
    fun scrollBarPaddingBottom(scrollBarPaddingBottom: Dp): DropdownMenuDimensionsBuilder =
        scrollBarPaddingBottom(scrollBarPaddingBottom.asStatefulValue())

    /**
     * Устанавливает отступы прокрутки cнизу [paddingBottom]
     */
    fun scrollBarPaddingBottom(scrollBarPaddingBottom: StatefulValue<Dp>): DropdownMenuDimensionsBuilder

    /**
     * Создает экземпляр [DropdownMenuDimensions]
     */
    fun build(): DropdownMenuDimensions
}

@Immutable
private class DefaultDropdownMenuDimensions(
    override val widthValues: StatefulValue<Dp>,
    override val offsetValues: StatefulValue<Dp>,
    override val strokeWidthValues: StatefulValue<Dp>,
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,
    override val scrollBarPaddingTopValues: StatefulValue<Dp>,
    override val scrollBarPaddingBottomValues: StatefulValue<Dp>,

) : DropdownMenuDimensions {
    @Deprecated("use widthValues", replaceWith = ReplaceWith("widthValues"))
    override val width: Dp = widthValues.getDefaultValue()

    @Deprecated("use offsetValues", replaceWith = ReplaceWith("offsetValues"))
    override val offset: Dp = offsetValues.getDefaultValue()

    @Deprecated("use strokeWidthValues", replaceWith = ReplaceWith("strokeWidthValues"))
    override val strokeWidth: Dp = strokeWidthValues.getDefaultValue()

    @Deprecated("use paddingStartValues", replaceWith = ReplaceWith("paddingStartValues"))
    override val paddingStart: Dp = paddingStartValues.getDefaultValue()

    @Deprecated("use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
    override val paddingEnd: Dp = paddingEndValues.getDefaultValue()

    @Deprecated("use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
    override val paddingTop: Dp = paddingTopValues.getDefaultValue()

    @Deprecated("use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
    override val paddingBottom: Dp = paddingBottomValues.getDefaultValue()

    @Deprecated("use scrollBarPaddingTopValues", replaceWith = ReplaceWith("scrollBarPaddingTopValues"))
    override val scrollBarPaddingTop: Dp = scrollBarPaddingTopValues.getDefaultValue()

    @Deprecated("use scrollBarPaddingBottomValues", replaceWith = ReplaceWith("scrollBarPaddingBottomValues"))
    override val scrollBarPaddingBottom: Dp = scrollBarPaddingBottomValues.getDefaultValue()
    class Builder : DropdownMenuDimensionsBuilder {

        private var width: StatefulValue<Dp>? = null
        private var strokeWidth: StatefulValue<Dp>? = null
        private var offset: StatefulValue<Dp>? = null
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null
        private var scrollBarPaddingTop: StatefulValue<Dp>? = null
        private var scrollBarPaddingBottom: StatefulValue<Dp>? = null

        override fun width(width: StatefulValue<Dp>) = apply {
            this.width = width
        }

        override fun offset(offset: StatefulValue<Dp>) = apply {
            this.offset = offset
        }

        override fun strokeWidth(strokeWidth: StatefulValue<Dp>) = apply {
            this.strokeWidth = strokeWidth
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: StatefulValue<Dp>) = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun scrollBarPaddingTop(scrollBarPaddingTop: StatefulValue<Dp>) = apply {
            this.scrollBarPaddingTop = scrollBarPaddingTop
        }

        override fun scrollBarPaddingBottom(scrollBarPaddingBottom: StatefulValue<Dp>) = apply {
            this.scrollBarPaddingBottom = scrollBarPaddingBottom
        }

        override fun build(): DropdownMenuDimensions {
            return DefaultDropdownMenuDimensions(
                widthValues = width ?: 40.dp.asStatefulValue(),
                offsetValues = offset ?: 0.dp.asStatefulValue(),
                strokeWidthValues = strokeWidth ?: Dp.Unspecified.asStatefulValue(),
                paddingStartValues = paddingStart ?: Dp.Unspecified.asStatefulValue(),
                paddingEndValues = paddingEnd ?: Dp.Unspecified.asStatefulValue(),
                paddingTopValues = paddingTop ?: Dp.Unspecified.asStatefulValue(),
                paddingBottomValues = paddingBottom ?: Dp.Unspecified.asStatefulValue(),
                scrollBarPaddingTopValues = scrollBarPaddingTop ?: Dp.Unspecified.asStatefulValue(),
                scrollBarPaddingBottomValues = scrollBarPaddingBottom ?: Dp.Unspecified.asStatefulValue(),
            )
        }
    }
}
