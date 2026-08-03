package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ChipStyle] для компонента [Chip]
 */
val LocalChipStyle = compositionLocalOf { ChipStyle.builder().style() }

/**
 * Builder для [ChipColors].
 */
interface ChipColorsBuilder {

    /**
     * Устанавливает цвет контента компонента [contentColor]
     * @see ChipColorsBuilder.contentColor
     * @see InteractiveColor
     */
    fun contentColor(contentColor: InteractiveColor): ChipColorsBuilder =
        contentColor(contentColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента компонента [contentColor]
     * @see ChipColorsBuilder.contentColor
     */
    fun contentColor(contentColor: Color): ChipColorsBuilder =
        contentColor(contentColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента компонента [contentColor]
     * @see ChipColorsBuilder.contentColor
     */
    fun contentColor(contentColor: Brush): ChipColorsBuilder =
        contentColor(contentColor.asStatefulValue())

    /**
     * Устанавливает цвет контента компонента [contentColor]
     * @see ChipColors.contentBrush
     */
    fun contentColor(contentColor: StatefulValue<Brush>): ChipColorsBuilder

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     * @see ChipColorsBuilder.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): ChipColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     * @see ChipColorsBuilder.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): ChipColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     * @see ChipColorsBuilder.backgroundColor
     */
    fun backgroundColor(backgroundColor: Brush): ChipColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает цвет фона компонента [backgroundColor]
     * @see ChipColors.backgroundBrush
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): ChipColorsBuilder

    /**
     * Устанавливает цвет основного текста компонента [labelColor]
     * @see ChipColorsBuilder.labelColor
     * @see InteractiveColor
     */
    fun labelColor(labelColor: InteractiveColor): ChipColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает цвет основного текста компонента [labelColor]
     * @see ChipColorsBuilder.labelColor
     */
    fun labelColor(labelColor: Color): ChipColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает цвет основного текста компонента [labelColor]
     * @see ChipColorsBuilder.labelColor
     */
    fun labelColor(labelColor: Brush): ChipColorsBuilder =
        labelColor(labelColor.asStatefulValue())

    /**
     * Устанавливает цвет основного текста компонента [labelColor]
     * @see ChipColors.labelBrush
     */
    fun labelColor(labelColor: StatefulValue<Brush>): ChipColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста компонента [contentStartColor]
     * @see ChipColorsBuilder.contentStartColor
     * @see InteractiveColor
     */
    fun contentStartColor(contentStartColor: InteractiveColor): ChipColorsBuilder =
        contentStartColor(contentStartColor.asStatefulBrush())

    /**
     * Устанавливает цвет дополнительного текста компонента [valueColor]
     * @see ChipColorsBuilder.contentStartColor
     */
    fun contentStartColor(valueColor: Color): ChipColorsBuilder =
        contentStartColor(valueColor.asStatefulBrush())

    /**
     * Устанавливает цвет дополнительного текста компонента [contentStartColor]
     * @see ChipColorsBuilder.contentStartColor
     */
    fun contentStartColor(contentStartColor: Brush): ChipColorsBuilder =
        contentStartColor(contentStartColor.asStatefulValue())

    /**
     * Устанавливает цвет дополнительного текста компонента [contentStartColor]
     * @see ChipColors.contentStartBrush
     */
    fun contentStartColor(contentStartColor: StatefulValue<Brush>): ChipColorsBuilder

    /**
     * Устанавливает цвет иконки компонента [contentEndColor]
     * @see ChipColorsBuilder.contentEndColor
     */
    fun contentEndColor(contentEndColor: InteractiveColor): ChipColorsBuilder =
        contentEndColor(contentEndColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки компонента [contentEndColor]
     * @see ChipColorsBuilder.contentEndColor
     */
    fun contentEndColor(contentEndColor: Color): ChipColorsBuilder =
        contentEndColor(contentEndColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки компонента [contentEndColor]
     * @see ChipColorsBuilder.contentEndColor
     */
    fun contentEndColor(contentEndColor: Brush): ChipColorsBuilder =
        contentEndColor(contentEndColor.asStatefulValue())

    /**
     * Устанавливает цвет иконки компонента [contentEndColor]
     * @see ChipColors.contentEndBrush
     */
    fun contentEndColor(contentEndColor: StatefulValue<Brush>): ChipColorsBuilder

    /**
     * Возвращает готовый экземпляр [ChipColors]
     */
    fun build(): ChipColors
}

/**
 * Builder стиля [Chip].
 */
@Stable
@ApiInfo
interface ChipStyleBuilder : StyleBuilder<ChipStyle> {

    /**
     * Устанавливает форму компонента [shape]
     * @see ChipStyleBuilder.shape
     */
    fun shape(shape: CornerBasedShape): ChipStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает формы компонента [shape]
     * @see ChipStyle.shape
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): ChipStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see ChipStyle.colors
     * @see [ChipColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable ChipColorsBuilder.() -> Unit): ChipStyleBuilder

    /**
     * Устанавливает стиль основного текста компонента [labelStyle]
     * @see ChipStyleBuilder.labelStyle
     */
    fun labelStyle(labelStyle: TextStyle): ChipStyleBuilder =
        labelStyle(labelStyle.asStatefulValue())

    /**
     * Устанавливает стили основного текста компонента [labelStyle]
     * @see ChipStyle.labelStyle
     */
    fun labelStyle(labelStyle: StatefulValue<TextStyle>): ChipStyleBuilder

    /**
     * Устанавливает размеры и отступы контента компонента при помощи [builder]
     * @see ChipStyle.dimensions
     * @see ChipDimensions
     */
    @Composable
    fun dimensions(builder: @Composable ChipDimensionsBuilder.() -> Unit): ChipStyleBuilder

    /**
     * Устанавливает значение прозрачности выключенной компонента [disableAlpha]
     * @see ChipStyle.disableAlpha
     */
    fun disableAlpha(disableAlpha: Float): ChipStyleBuilder
}

/**
 * Стиль компонента [Chip]
 */
@Stable
interface ChipStyle : Style {

    /**
     * Форма компонента
     * @see CornerBasedShape
     */
    @Deprecated("Use shapes", ReplaceWith("shapes"))
    val shape: CornerBasedShape

    /**
     * Формы компонента
     * @see CornerBasedShape
     */
    val shapes: StatefulValue<CornerBasedShape>

    /**
     * Цвета компонента
     * @see ChipColors
     */
    val colors: ChipColors

    /**
     * Стиль основного текста компонента
     * @see TextStyle
     */
    @Deprecated("Use labelStyles", ReplaceWith("labelStyles"))
    val labelStyle: TextStyle

    /**
     * Стили основного текста компонента
     * @see TextStyle
     */
    val labelStyles: StatefulValue<TextStyle>

    /**
     * Размеры и отступы контента компонента
     * @see ChipDimensions
     */
    val dimensions: ChipDimensions

    /**
     * Значение прозрачности выключенного компонента
     */
    val disableAlpha: Float

    companion object {

        /**
         * Возвращает экземпляр [ChipStyleBuilder]
         */
        fun builder(receiver: Any? = null): ChipStyleBuilder = DefaultChipStyle.Builder()
    }
}

/**
 * Размеры и отступы компонента Chip
 */
@Stable
interface ChipDimensions {

    /**
     * Высота компонента
     */
    @Deprecated("Use heightValues", ReplaceWith("heightValues"))
    val height: Dp

    /**
     * Высота компонента
     */
    val heightValues: StatefulValue<Dp>

    /**
     * Размер контента в начале
     */
    @Deprecated("Use contentStartSizeValues", ReplaceWith("contentStartSizeValues"))
    val contentStartSize: Dp

    /**
     * Размер контента в начале
     */
    val contentStartSizeValues: StatefulValue<Dp>

    /**
     * Размер контента в окнце
     */
    @Deprecated("Use contentEndSizeValues", ReplaceWith("contentEndSizeValues"))
    val contentEndSize: Dp

    /**
     * Размер контента в окнце
     */
    val contentEndSizeValues: StatefulValue<Dp>

    /**
     * Отступ от контента в начале
     */
    @Deprecated("Use contentStartPaddings", ReplaceWith("contentStartPaddings"))
    val contentStartPadding: Dp

    /**
     * Отступ от контента в начале
     */
    val contentStartPaddings: StatefulValue<Dp>

    /**
     * Отступ от контента в конце
     */
    @Deprecated("Use contentEndPaddings", ReplaceWith("contentEndPaddings"))
    val contentEndPadding: Dp

    /**
     * Отступ от контента в конце
     */
    val contentEndPaddings: StatefulValue<Dp>

    /**
     * Отступ в начале
     */
    @Deprecated("Use startPaddings", replaceWith = ReplaceWith("startPaddings"))
    val paddingStart: Dp

    /**
     * Отступы в начале
     */
    val startPaddings: StatefulValue<Dp>

    /**
     * Отступ в конце
     */
    @Deprecated("Use endPaddings", replaceWith = ReplaceWith("endPaddings"))
    val paddingEnd: Dp

    /**
     * Отступы в конце
     */
    val endPaddings: StatefulValue<Dp>

    companion object {

        /**
         * Возвращает экземпляр [ChipDimensionsBuilder]
         */
        fun builder(): ChipDimensionsBuilder = DefaultChipDimensions.Builder()
    }
}

/**
 * Билдер размеров для Chip
 */
interface ChipDimensionsBuilder {

    /**
     * Устанавливает высоту компонента [height]
     * @see ChipDimensionsBuilder.height
     */
    fun height(height: Dp): ChipDimensionsBuilder =
        height(height.asStatefulValue())

    /**
     * Устанавливает высоту компонента [height]
     * @see ChipDimensions.heightValues
     */
    fun height(height: StatefulValue<Dp>): ChipDimensionsBuilder

    /**
     * Устанавливает размер контента в начале [contentStartSize]
     * @see ChipDimensionsBuilder.contentStartSize
     */
    fun contentStartSize(contentStartSize: Dp): ChipDimensionsBuilder =
        contentStartSize(contentStartSize.asStatefulValue())

    /**
     * Устанавливает размер контента в начале [contentStartSize]
     * @see ChipDimensions.contentStartSizeValues
     */
    fun contentStartSize(contentStartSize: StatefulValue<Dp>): ChipDimensionsBuilder

    /**
     * Устанавливает размер контента в конце [contentEndSize]
     * @see ChipDimensionsBuilder.contentEndSize
     */
    fun contentEndSize(contentEndSize: Dp): ChipDimensionsBuilder =
        contentEndSize(contentEndSize.asStatefulValue())

    /**
     * Устанавливает размер контента в конце [contentEndSize]
     * @see ChipDimensions.contentEndSizeValues
     */
    fun contentEndSize(contentEndSize: StatefulValue<Dp>): ChipDimensionsBuilder

    /**
     * Устанавливает отступ от контента в начале [contentStartPadding]
     * @see ChipDimensionsBuilder.contentStartPadding
     */
    fun contentStartPadding(contentStartPadding: Dp): ChipDimensionsBuilder =
        contentStartPadding(contentStartPadding.asStatefulValue())

    /**
     * Устанавливает отступ от контента в начале [contentStartPadding]
     * @see ChipDimensions.contentStartPaddings
     */
    fun contentStartPadding(contentStartPadding: StatefulValue<Dp>): ChipDimensionsBuilder

    /**
     * Устанавливает отступ от контента в конце [contentEndPadding]
     * @see ChipDimensionsBuilder.contentEndPadding
     */
    fun contentEndPadding(contentEndPadding: Dp): ChipDimensionsBuilder =
        contentEndPadding(contentEndPadding.asStatefulValue())

    /**
     * Устанавливает отступ от контента в конце [contentEndPadding]
     * @see ChipDimensions.contentEndPaddings
     */
    fun contentEndPadding(contentEndPadding: StatefulValue<Dp>): ChipDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     * @see ChipDimensionsBuilder.paddingStart
     */
    fun paddingStart(paddingStart: Dp): ChipDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступы в начале [paddingStart]
     * @see ChipDimensions.startPaddings
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): ChipDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     * @see ChipDimensionsBuilder.paddingEnd
     */
    fun paddingEnd(paddingEnd: Dp): ChipDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступы в конце [paddingEnd]
     * @see ChipDimensions.endPaddings
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): ChipDimensionsBuilder

    /**
     * Возвращает экземпляр [ChipDimensions]
     */
    fun build(): ChipDimensions
}

private class DefaultChipDimensions(
    override val startPaddings: StatefulValue<Dp>,
    override val endPaddings: StatefulValue<Dp>,
    override val heightValues: StatefulValue<Dp>,
    override val contentStartSizeValues: StatefulValue<Dp>,
    override val contentEndSizeValues: StatefulValue<Dp>,
    override val contentStartPaddings: StatefulValue<Dp>,
    override val contentEndPaddings: StatefulValue<Dp>,
) : ChipDimensions {
    @Deprecated("Use heightValues", replaceWith = ReplaceWith("heightValues"))
    override val height: Dp = heightValues.getDefaultValue()

    @Deprecated("Use contentStartSizeValues", replaceWith = ReplaceWith("contentStartSizeValues"))
    override val contentStartSize: Dp = contentStartSizeValues.getDefaultValue()

    @Deprecated("Use contentEndSizeValues", replaceWith = ReplaceWith("contentEndSizeValues"))
    override val contentEndSize: Dp = contentEndSizeValues.getDefaultValue()

    @Deprecated("Use contentStartPaddings", replaceWith = ReplaceWith("contentStartPaddings"))
    override val contentStartPadding: Dp = contentStartPaddings.getDefaultValue()

    @Deprecated("Use contentEndPaddings", replaceWith = ReplaceWith("contentEndPaddings"))
    override val contentEndPadding: Dp = contentEndPaddings.getDefaultValue()

    @Deprecated("Use startPaddings", replaceWith = ReplaceWith("startPaddings"))
    override val paddingStart: Dp = startPaddings.getDefaultValue()

    @Deprecated("Use endPaddings", replaceWith = ReplaceWith("endPaddings"))
    override val paddingEnd: Dp = endPaddings.getDefaultValue()

    class Builder : ChipDimensionsBuilder {
        private var heightValues: StatefulValue<Dp>? = null
        private var contentStartSizeValues: StatefulValue<Dp>? = null
        private var contentEndSizeValues: StatefulValue<Dp>? = null
        private var contentStartPaddings: StatefulValue<Dp>? = null
        private var contentEndPaddings: StatefulValue<Dp>? = null
        private var startPaddings: StatefulValue<Dp>? = null
        private var endPaddings: StatefulValue<Dp>? = null
        override fun height(height: StatefulValue<Dp>): ChipDimensionsBuilder = apply {
            this.heightValues = height
        }

        override fun contentStartSize(contentStartSize: StatefulValue<Dp>): ChipDimensionsBuilder = apply {
            this.contentStartSizeValues = contentStartSize
        }

        override fun contentEndSize(contentEndSize: StatefulValue<Dp>): ChipDimensionsBuilder = apply {
            this.contentEndSizeValues = contentEndSize
        }

        override fun contentStartPadding(contentStartPadding: StatefulValue<Dp>): ChipDimensionsBuilder = apply {
            this.contentStartPaddings = contentStartPadding
        }

        override fun contentEndPadding(contentEndPadding: StatefulValue<Dp>): ChipDimensionsBuilder = apply {
            this.contentEndPaddings = contentEndPadding
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>): ChipDimensionsBuilder = apply {
            this.startPaddings = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>): ChipDimensionsBuilder = apply {
            this.endPaddings = paddingEnd
        }

        override fun build(): ChipDimensions {
            return DefaultChipDimensions(
                startPaddings = startPaddings ?: 16.dp.asStatefulValue(),
                endPaddings = endPaddings ?: 16.dp.asStatefulValue(),
                heightValues = heightValues ?: 48.dp.asStatefulValue(),
                contentStartSizeValues = contentStartSizeValues ?: 24.dp.asStatefulValue(),
                contentEndSizeValues = contentEndSizeValues ?: 16.dp.asStatefulValue(),
                contentStartPaddings = contentStartPaddings ?: 16.dp.asStatefulValue(),
                contentEndPaddings = contentEndPaddings ?: 16.dp.asStatefulValue(),
            )
        }
    }
}

/**
 * Цвета компонента [Chip]
 */
@Stable
interface ChipColors {

    /**
     * Цвет контента
     * @see InteractiveColor
     */
    @Deprecated("Use contentBrush", ReplaceWith("contentBrush"))
    val contentColor: InteractiveColor

    /**
     * Кисти контента
     */
    val contentBrush: StatefulValue<Brush>

    /**
     * Цвет фона
     * @see InteractiveColor
     */
    @Deprecated("Use backgroundBrush", ReplaceWith("backgroundBrush"))
    val backgroundColor: InteractiveColor

    /**
     * Кисти фона
     */
    val backgroundBrush: StatefulValue<Brush>

    /**
     * Цвет текста
     * @see InteractiveColor
     */
    @Deprecated("Use labelBrush", ReplaceWith("labelBrush"))
    val labelColor: InteractiveColor

    /**
     * Кисти текста
     */
    val labelBrush: StatefulValue<Brush>

    /**
     * Цвет контента в начале (например, иконки)
     * @see InteractiveColor
     */
    @Deprecated("Use contentStartBrush", ReplaceWith("contentStartBrush"))
    val contentStartColor: InteractiveColor

    /**
     * Кисти контента в начале (например, иконки)
     */
    val contentStartBrush: StatefulValue<Brush>

    /**
     * Цвет контента в конце (например, иконки)
     * @see InteractiveColor
     */
    @Deprecated("Use contentEndBrush", ReplaceWith("contentEndBrush"))
    val contentEndColor: InteractiveColor

    /**
     * Кисти контента в конце (например, иконки)
     */
    val contentEndBrush: StatefulValue<Brush>

    companion object {

        /**
         * Возвращает экземпляр [ChipColorsBuilder]
         */
        fun builder(): ChipColorsBuilder = DefaultChipColors.Builder()
    }
}

@Immutable
private class DefaultChipColors(
    override val contentBrush: StatefulValue<Brush>,
    override val backgroundBrush: StatefulValue<Brush>,
    override val labelBrush: StatefulValue<Brush>,
    override val contentStartBrush: StatefulValue<Brush>,
    override val contentEndBrush: StatefulValue<Brush>,

) : ChipColors {
    @Deprecated("Use contentBrush", ReplaceWith("contentBrush"))
    override val contentColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use backgroundBrush", ReplaceWith("backgroundBrush"))
    override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use labelBrush", ReplaceWith("labelBrush"))
    override val labelColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use contentStartBrush", ReplaceWith("contentStartBrush"))
    override val contentStartColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use contentEndBrush", ReplaceWith("contentEndBrush"))
    override val contentEndColor: InteractiveColor = Color.Transparent.asInteractive()
    class Builder : ChipColorsBuilder {
        private var contentBrush: StatefulValue<Brush>? = null
        private var backgroundBrush: StatefulValue<Brush>? = null
        private var labelBrush: StatefulValue<Brush>? = null
        private var contentStartBrush: StatefulValue<Brush>? = null
        private var contentEndBrush: StatefulValue<Brush>? = null

        override fun contentColor(contentColor: StatefulValue<Brush>) = apply {
            this.contentBrush = contentColor
        }

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundBrush = backgroundColor
        }

        override fun labelColor(labelColor: StatefulValue<Brush>) = apply {
            this.labelBrush = labelColor
        }

        override fun contentStartColor(contentStartColor: StatefulValue<Brush>) = apply {
            this.contentStartBrush = contentStartColor
        }

        override fun contentEndColor(contentEndColor: StatefulValue<Brush>) = apply {
            this.contentEndBrush = contentEndColor
        }

        override fun build(): ChipColors {
            val defaultBrush = contentBrush ?: Color.Black.asStatefulBrush()
            return DefaultChipColors(
                contentBrush = defaultBrush,
                backgroundBrush = backgroundBrush ?: Color.White.asStatefulBrush(),
                labelBrush = labelBrush ?: defaultBrush,
                contentStartBrush = contentStartBrush ?: defaultBrush,
                contentEndBrush = contentEndBrush ?: defaultBrush,
            )
        }
    }
}

@Immutable
internal class DefaultChipStyle(
    override val colors: ChipColors,
    override val dimensions: ChipDimensions,
    override val disableAlpha: Float,
    override val shapes: StatefulValue<CornerBasedShape>,
    override val labelStyles: StatefulValue<TextStyle>,
) : ChipStyle {

    @Deprecated("Use shapes", ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()

    @Deprecated("Use labelStyles", ReplaceWith("labelStyles"))
    override val labelStyle: TextStyle = labelStyles.getDefaultValue()

    @Stable
    class Builder : ChipStyleBuilder {
        private var shapes: StatefulValue<CornerBasedShape>? = null
        private var colorsBuilder: ChipColorsBuilder = ChipColors.builder()
        private var labelStyles: StatefulValue<TextStyle>? = null
        private var dimensionsBuilder: ChipDimensionsBuilder = ChipDimensions.builder()
        private var disableAlpha: Float? = null

        override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
            this.shapes = shape
        }

        @Composable
        override fun colors(builder: @Composable ChipColorsBuilder.() -> Unit): ChipStyleBuilder = apply {
            this.colorsBuilder.builder()
        }

        override fun labelStyle(labelStyle: StatefulValue<TextStyle>) = apply {
            this.labelStyles = labelStyle
        }

        @Composable
        override fun dimensions(builder: @Composable ChipDimensionsBuilder.() -> Unit) = apply {
            this.dimensionsBuilder.builder()
        }

        override fun disableAlpha(disableAlpha: Float) = apply {
            this.disableAlpha = disableAlpha
        }

        override fun style(): ChipStyle {
            return DefaultChipStyle(
                shapes = shapes ?: RoundedCornerShape(25).asStatefulValue(),
                colors = colorsBuilder.build(),
                labelStyles = labelStyles ?: TextStyle.Default.asStatefulValue(),
                dimensions = dimensionsBuilder.build(),
                disableAlpha = disableAlpha ?: DISABLED_BUTTON_ALPHA,
            )
        }
    }
}

private const val DISABLED_BUTTON_ALPHA = 0.4f
