package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [TooltipStyle] для компонента [Tooltip]
 */
val LocalTooltipStyle = compositionLocalOf { TooltipStyle.builder().style() }

/**
 * Стиль компонента Tooltip
 */
@Immutable
interface TooltipStyle : Style {

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
     * Стиль текста
     */
    @Deprecated("use textStyles", replaceWith = ReplaceWith("textStyles"))
    val textStyle: TextStyle

    /**
     * Стиль текста
     */
    val textStyles: StatefulValue<TextStyle>

    /**
     * Размеры и отступы компонента
     */
    val dimensions: TooltipDimensions

    /**
     * Цвета компонента
     */
    val colors: TooltipColors

    companion object {
        /**
         * Возвращает экземпляр [TooltipStyleBuilder]
         */
        fun builder(receiver: Any? = null): TooltipStyleBuilder = DefaultTooltipStyle.Builder()
    }
}

/**
 * Билдер стиля [TooltipStyle]
 */
@ApiInfo
interface TooltipStyleBuilder : StyleBuilder<TooltipStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): TooltipStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает формы [shape] компонента
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): TooltipStyleBuilder

    /**
     * Устанавливает тень [shadow] компонента
     */
    fun shadow(shadow: ShadowAppearance): TooltipStyleBuilder

    /**
     * Устанавливает стиль текста
     */
    fun textStyle(textStyle: TextStyle): TooltipStyleBuilder = textStyle(textStyle.asStatefulValue())

    /**
     * Устанавливает стили текста
     */
    fun textStyle(textStyle: StatefulValue<TextStyle>): TooltipStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(builder: @Composable TooltipColorsBuilder.() -> Unit): TooltipStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(builder: @Composable TooltipDimensionsBuilder.() -> Unit): TooltipStyleBuilder
}

private class DefaultTooltipStyle(
    override val shadow: ShadowAppearance,
    override val dimensions: TooltipDimensions,
    override val colors: TooltipColors,
    override val shapes: StatefulValue<CornerBasedShape>,
    override val textStyles: StatefulValue<TextStyle>,
) : TooltipStyle {

    @Deprecated("use shapes", replaceWith = ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()

    @Deprecated("use textStyles", replaceWith = ReplaceWith("textStyles"))
    override val textStyle: TextStyle = textStyles.getDefaultValue()
    class Builder : TooltipStyleBuilder {
        private var shape: StatefulValue<CornerBasedShape>? = null
        private var shadow: ShadowAppearance? = null
        private val colorsBuilder = TooltipColors.builder()
        private val dimensionsBuilder = TooltipDimensions.builder()
        private var textStyle: StatefulValue<TextStyle>? = null

        override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
            this.shape = shape
        }

        override fun shadow(shadow: ShadowAppearance) = apply {
            this.shadow = shadow
        }

        override fun textStyle(textStyle: StatefulValue<TextStyle>) = apply {
            this.textStyle = textStyle
        }

        @Composable
        override fun colors(builder: @Composable (TooltipColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (TooltipDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun style(): TooltipStyle {
            return DefaultTooltipStyle(
                shapes = shape ?: RoundedCornerShape(15).asStatefulValue(),
                shadow = shadow ?: ShadowAppearance(),
                textStyles = textStyle ?: TextStyle.Default.asStatefulValue(),
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
            )
        }
    }
}

/**
 * Цвета компонента Tooltip
 */
@Immutable
interface TooltipColors {

    /**
     * Цвет фона
     */
    val backgroundColor: StatefulValue<Brush>

    /**
     * Цвет текста
     */
    val textColor: StatefulValue<Brush>

    /**
     * Цвет контента в начале
     */
    @Deprecated("use contentStartBrush", replaceWith = ReplaceWith("contentStartBrush"))
    val contentStartColor: InteractiveColor

    /**
     * Цвет контента в начале
     */
    val contentStartBrush: StatefulValue<Brush>

    companion object {

        /**
         * Создает экземпляр [TooltipColorsBuilder]
         */
        fun builder(): TooltipColorsBuilder = DefaultTooltipColors.Builder()
    }
}

/**
 * Builder для [TooltipColors]
 */
interface TooltipColorsBuilder {

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Color): TooltipColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: InteractiveColor): TooltipColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Brush): TooltipColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): TooltipColorsBuilder

    /**
     * Устанавливает цвет текста [textColor].
     */
    fun textColor(textColor: Color): TooltipColorsBuilder =
        textColor(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста [textColor].
     */
    fun textColor(textColor: InteractiveColor): TooltipColorsBuilder =
        textColor(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста [textColor].
     */
    fun textColor(textColor: Brush): TooltipColorsBuilder =
        textColor(textColor.asStatefulValue())

    /**
     * Устанавливает цвет текста [textColor].
     */
    fun textColor(textColor: StatefulValue<Brush>): TooltipColorsBuilder

    /**
     * Устанавливает цвет контента в начале [contentStartColor].
     */
    fun contentStartColor(contentStartColor: Color): TooltipColorsBuilder =
        contentStartColor(contentStartColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента в начале [contentStartColor].
     */
    fun contentStartColor(contentStartColor: InteractiveColor): TooltipColorsBuilder =
        contentStartColor(contentStartColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента в начале [contentStartColor].
     */
    fun contentStartColor(contentStartColor: Brush): TooltipColorsBuilder =
        contentStartColor(contentStartColor.asStatefulValue())

    /**
     * Устанавливает цвет контента в начале [contentStartColor].
     */
    fun contentStartColor(contentStartColor: StatefulValue<Brush>): TooltipColorsBuilder

    /**
     * Создает экземпляр [TooltipColors]
     */
    fun build(): TooltipColors
}

@Immutable
private data class DefaultTooltipColors(
    override val backgroundColor: StatefulValue<Brush>,
    override val textColor: StatefulValue<Brush>,
    override val contentStartBrush: StatefulValue<Brush>,
) : TooltipColors {

    @Deprecated("use contentStartBrush", replaceWith = ReplaceWith("contentStartBrush"))
    override val contentStartColor: InteractiveColor = Color.Transparent.asInteractive()

    class Builder : TooltipColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var textColor: StatefulValue<Brush>? = null
        private var contentStartColor: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun textColor(textColor: StatefulValue<Brush>) = apply {
            this.textColor = textColor
        }

        override fun contentStartColor(contentStartColor: StatefulValue<Brush>) = apply {
            this.contentStartColor = contentStartColor
        }

        override fun build(): TooltipColors {
            return DefaultTooltipColors(
                backgroundColor = backgroundColor ?: SolidColor(Color.LightGray).asStatefulValue(),
                textColor = textColor ?: SolidColor(Color.Black).asStatefulValue(),
                contentStartBrush = Color.DarkGray.asStatefulBrush(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface TooltipDimensions {

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

    /**
     * Размер контента в начале
     */
    @Deprecated("use contentStartSizeValues", replaceWith = ReplaceWith("contentStartSizeValues"))
    val contentStartSize: Dp

    /**
     * Размер контента в начале
     */
    val contentStartSizeValues: StatefulValue<Dp>

    /**
     *  Отступа контента в начале
     */
    @Deprecated("use contentStartPaddingValues", replaceWith = ReplaceWith("contentStartPaddingValues"))
    val contentStartPadding: Dp

    /**
     *  Отступа контента в начале
     */
    val contentStartPaddingValues: StatefulValue<Dp>

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

    companion object {
        /**
         * Создает экземпляр [TooltipDimensionsBuilder]
         */
        fun builder(): TooltipDimensionsBuilder = DefaultTooltipDimensions.Builder()
    }
}

/**
 * Builder для [TooltipDimensions]
 */
interface TooltipDimensionsBuilder {
    /**
     * Устанавливает смещение [offset] компонента относительно триггера.
     */
    fun offset(offset: Dp): TooltipDimensionsBuilder = offset(offset.asStatefulValue())

    /**
     * Устанавливает смещение [offset] компонента относительно триггера.
     */
    fun offset(offset: StatefulValue<Dp>): TooltipDimensionsBuilder

    /**
     * Устанавливает ширину [tailWidth] указателя.
     */
    fun tailWidth(tailWidth: Dp): TooltipDimensionsBuilder = tailWidth(tailWidth.asStatefulValue())

    /**
     * Устанавливает ширину [tailWidth] указателя.
     */
    fun tailWidth(tailWidth: StatefulValue<Dp>): TooltipDimensionsBuilder

    /**
     * Устанавливает высоту [tailHeight] указателя.
     */
    fun tailHeight(tailHeight: Dp): TooltipDimensionsBuilder = tailHeight(tailHeight.asStatefulValue())

    /**
     * Устанавливает высоту [tailHeight] указателя.
     */
    fun tailHeight(tailHeight: StatefulValue<Dp>): TooltipDimensionsBuilder

    /**
     * Устанавливает отступ [tailPadding] указателя относительно края компонента.
     */
    fun tailPadding(tailPadding: Dp): TooltipDimensionsBuilder = tailPadding(tailPadding.asStatefulValue())

    /**
     * Устанавливает отступ [tailPadding] указателя относительно края компонента.
     */
    fun tailPadding(tailPadding: StatefulValue<Dp>): TooltipDimensionsBuilder

    /**
     * Устанавливает размер контента в начале [contentStartSize]
     */
    fun contentStartSize(contentStartSize: Dp): TooltipDimensionsBuilder =
        contentStartSize(contentStartSize.asStatefulValue())

    /**
     * Устанавливает размер контента в начале [contentStartSize]
     */
    fun contentStartSize(contentStartSize: StatefulValue<Dp>): TooltipDimensionsBuilder

    /**
     * Устанавливает отступ контента в начале [contentStartPadding]
     */
    fun contentStartPadding(contentStartPadding: Dp): TooltipDimensionsBuilder =
        contentStartPadding(contentStartPadding.asStatefulValue())

    /**
     * Устанавливает отступ контента в начале [contentStartPadding]
     */
    fun contentStartPadding(contentStartPadding: StatefulValue<Dp>): TooltipDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): TooltipDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): TooltipDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): TooltipDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): TooltipDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): TooltipDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): TooltipDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): TooltipDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): TooltipDimensionsBuilder

    /**
     * Создает экземпляр [TooltipDimensions]
     */
    fun build(): TooltipDimensions
}

private class DefaultTooltipDimensions(
    override val offsetValues: StatefulValue<Dp>,
    override val tailWidthValues: StatefulValue<Dp>,
    override val tailHeightValues: StatefulValue<Dp>,
    override val tailPaddingValues: StatefulValue<Dp>,
    override val contentStartSizeValues: StatefulValue<Dp>,
    override val contentStartPaddingValues: StatefulValue<Dp>,
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,

) : TooltipDimensions {
    @Deprecated("use offsetValues", replaceWith = ReplaceWith("offsetValues"))
    override val offset: Dp = offsetValues.getDefaultValue()

    @Deprecated("use tailWidthValues", replaceWith = ReplaceWith("tailWidthValues"))
    override val tailWidth: Dp = tailWidthValues.getDefaultValue()

    @Deprecated("use tailHeightValues", replaceWith = ReplaceWith("tailHeightValues"))
    override val tailHeight: Dp = tailHeightValues.getDefaultValue()

    @Deprecated("use tailPaddingValues", replaceWith = ReplaceWith("tailPaddingValues"))
    override val tailPadding: Dp = tailPaddingValues.getDefaultValue()

    @Deprecated("use contentStartSizeValues", replaceWith = ReplaceWith("contentStartSizeValues"))
    override val contentStartSize: Dp = contentStartSizeValues.getDefaultValue()

    @Deprecated("use contentStartPaddingValues", replaceWith = ReplaceWith("contentStartPaddingValues"))
    override val contentStartPadding: Dp = contentStartPaddingValues.getDefaultValue()

    @Deprecated("use paddingStartValues", replaceWith = ReplaceWith("paddingStartValues"))
    override val paddingStart: Dp = paddingStartValues.getDefaultValue()

    @Deprecated("use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
    override val paddingEnd: Dp = paddingEndValues.getDefaultValue()

    @Deprecated("use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
    override val paddingTop: Dp = paddingTopValues.getDefaultValue()

    @Deprecated("use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
    override val paddingBottom: Dp = paddingBottomValues.getDefaultValue()
    class Builder : TooltipDimensionsBuilder {

        private var offset: StatefulValue<Dp>? = null
        private var tailWidth: StatefulValue<Dp>? = null
        private var tailHeight: StatefulValue<Dp>? = null
        private var tailPadding: StatefulValue<Dp>? = null
        private var contentStartSize: StatefulValue<Dp>? = null
        private var contentStartPadding: StatefulValue<Dp>? = null
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null

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

        override fun contentStartSize(contentStartSize: StatefulValue<Dp>) = apply {
            this.contentStartSize = contentStartSize
        }

        override fun contentStartPadding(contentStartPadding: StatefulValue<Dp>) = apply {
            this.contentStartPadding = contentStartPadding
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

        override fun build(): TooltipDimensions {
            return DefaultTooltipDimensions(
                offsetValues = offset ?: 4.dp.asStatefulValue(),
                tailWidthValues = tailWidth ?: 20.dp.asStatefulValue(),
                tailHeightValues = tailHeight ?: 8.dp.asStatefulValue(),
                tailPaddingValues = tailPadding ?: 10.dp.asStatefulValue(),
                contentStartSizeValues = contentStartSize ?: 16.dp.asStatefulValue(),
                contentStartPaddingValues = contentStartPadding ?: 4.dp.asStatefulValue(),
                paddingStartValues = paddingStart ?: 8.dp.asStatefulValue(),
                paddingEndValues = paddingEnd ?: 8.dp.asStatefulValue(),
                paddingTopValues = paddingTop ?: 10.dp.asStatefulValue(),
                paddingBottomValues = paddingBottom ?: 10.dp.asStatefulValue(),
            )
        }
    }
}
