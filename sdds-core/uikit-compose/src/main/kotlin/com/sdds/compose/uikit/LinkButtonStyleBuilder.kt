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
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal с [ButtonStyle]  для компонента [IconButton]
 */
val LocalLinkButtonStyle = compositionLocalOf { ButtonStyle.iconButtonBuilder().style() }

/**
 * Возвращает экземпляр [LinkButtonStyleBuilder]
 */
fun ButtonStyle.Companion.linkButtonBuilder(receiver: Any? = null): LinkButtonStyleBuilder =
    DefaultLinkButtonStyle.Builder(receiver)

/**
 * Builder стиля кнопки.
 */
@Stable
@ApiInfo(builderFunName = "linkButtonBuilder")
interface LinkButtonStyleBuilder : StyleBuilder<ButtonStyle> {

    /**
     * Устанавливает форму кнопки [shape]
     * @see ButtonStyle.shape
     */
    fun shape(shape: CornerBasedShape): LinkButtonStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает формы кнопки [shape]
     * @see ButtonStyle.shape
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): LinkButtonStyleBuilder

    /**
     * Устанавливает цвета кнопки при помощи [builder]
     * @see ButtonStyle.colors
     * @see [LinkButtonColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable LinkButtonColorsBuilder.() -> Unit): LinkButtonStyleBuilder

    /**
     * Устанавливает стиль основного текста кнопки [labelStyle]
     * @see ButtonStyle.labelStyle
     */
    fun labelStyle(labelStyle: TextStyle): LinkButtonStyleBuilder =
        labelStyle(labelStyle.asStatefulValue())

    /**
     * Устанавливает стили основного текста кнопки [labelStyle]
     * @see ButtonStyle.labelStyle
     */
    fun labelStyle(labelStyle: StatefulValue<TextStyle>): LinkButtonStyleBuilder

    /**
     * Устанавливает стиль дополнительного текста кнопки [valueStyle]
     * @see ButtonStyle.valueStyle
     */
    fun valueStyle(valueStyle: TextStyle): LinkButtonStyleBuilder =
        valueStyle(valueStyle.asStatefulValue())

    /**
     * Устанавливает стили дополнительного текста кнопки [valueStyle]
     * @see ButtonStyle.valueStyle
     */
    fun valueStyle(valueStyle: StatefulValue<TextStyle>): LinkButtonStyleBuilder

    /**
     * Устанавливает размеры и отступы контента кнопки [dimensions]
     * @see ButtonStyle.dimensions
     * @see ButtonDimensions
     */
    @Deprecated("Use dimensions() with builder instead")
    fun dimensions(dimensions: ButtonDimensions): LinkButtonStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable LinkButtonDimensionsBuilder.() -> Unit): LinkButtonStyleBuilder

    /**
     * Устанавливает значение прозрачности выключенной кнопки [disableAlpha]
     * @see ButtonStyle.disableAlpha
     */
    fun disableAlpha(disableAlpha: Float): LinkButtonStyleBuilder

    /**
     * Устанавливает значение прозрачности кнопки в состоянии загрузки [loadingAlpha]
     * @see ButtonStyle.loadingAlpha
     */
    fun loadingAlpha(loadingAlpha: Float): LinkButtonStyleBuilder
}

/**
 * Builder для [ButtonColors].
 */
interface LinkButtonColorsBuilder {

    /**
     * Устанавливает цвет контента кнопки [contentColor]
     * @see InteractiveColor
     */
    fun contentColor(contentColor: InteractiveColor): LinkButtonColorsBuilder =
        contentColor(contentColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента кнопки [contentColor]
     * @see LinkButtonColorsBuilder.contentColor
     */
    fun contentColor(contentColor: Color): LinkButtonColorsBuilder =
        contentColor(contentColor.asStatefulBrush())

    /**
     * Устанавливает кисть контента кнопки [contentColor]
     */
    fun contentColor(contentColor: Brush): LinkButtonColorsBuilder =
        contentColor(contentColor.asStatefulValue())

    /**
     * Устанавливает кисти контента кнопки [contentColor]
     */
    fun contentColor(contentColor: StatefulValue<Brush>): LinkButtonColorsBuilder

    /**
     * Устанавливает цвет фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): LinkButtonColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): LinkButtonColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисть фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Brush): LinkButtonColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает кисти фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): LinkButtonColorsBuilder

    /**
     * Устанавливает цвет основного текста кнопки [labelColor]
     * @see ButtonColors.labelColor
     * @see InteractiveColor
     */
    fun labelColor(labelColor: InteractiveColor): LinkButtonColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает цвет основного текста кнопки [labelColor]
     * @see ButtonColors.labelColor
     */
    fun labelColor(labelColor: Color): LinkButtonColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает кисть основного текста кнопки [labelColor]
     * @see ButtonColors.labelColor
     */
    fun labelColor(labelColor: Brush): LinkButtonColorsBuilder =
        labelColor(labelColor.asStatefulValue())

    /**
     * Устанавливает кисти основного текста кнопки [labelColor]
     * @see ButtonColors.labelColor
     */
    fun labelColor(labelColor: StatefulValue<Brush>): LinkButtonColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста кнопки [valueColor]
     * @see ButtonColors.valueColor
     * @see InteractiveColor
     */
    fun valueColor(valueColor: InteractiveColor): LinkButtonColorsBuilder =
        valueColor(valueColor.asStatefulBrush())

    /**
     * Устанавливает цвет дополнительного текста кнопки [valueColor]
     * @see ButtonColors.valueColor
     */
    fun valueColor(valueColor: Color): LinkButtonColorsBuilder =
        valueColor(valueColor.asStatefulBrush())

    /**
     * Устанавливает кисть дополнительного текста кнопки [valueColor]
     * @see ButtonColors.valueColor
     */
    fun valueColor(valueColor: Brush): LinkButtonColorsBuilder =
        valueColor(valueColor.asStatefulValue())

    /**
     * Устанавливает кисти дополнительного текста кнопки [valueColor]
     * @see ButtonColors.valueColor
     */
    fun valueColor(valueColor: StatefulValue<Brush>): LinkButtonColorsBuilder

    /**
     * Устанавливает цвет иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     * @see InteractiveColor
     */
    fun iconColor(iconColor: InteractiveColor): LinkButtonColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     */
    fun iconColor(iconColor: Color): LinkButtonColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает кисть иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     */
    fun iconColor(iconColor: Brush): LinkButtonColorsBuilder =
        iconColor(iconColor.asStatefulValue())

    /**
     * Устанавливает кисти иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     */
    fun iconColor(iconColor: StatefulValue<Brush>): LinkButtonColorsBuilder

    /**
     * Устанавливает цвет индикатора загрузки кнопки [spinnerColor]
     * @see ButtonColors.spinnerColor
     * @see InteractiveColor
     */
    fun spinnerColor(spinnerColor: InteractiveColor): LinkButtonColorsBuilder

    /**
     * Устанавливает цвет индикатора загрузки кнопки [spinnerColor]
     * @see ButtonColors.spinnerColor
     */
    fun spinnerColor(spinnerColor: Color): LinkButtonColorsBuilder =
        spinnerColor(spinnerColor.asInteractive())

    /**
     * Возвращает готовый экземпляр [ButtonColors]
     */
    fun build(): ButtonColors

    companion object {
        /**
         * Возвращает экземпляр [LinkButtonColorsBuilder]
         */
        fun builder(): LinkButtonColorsBuilder = DefaultLinkButtonColors.Builder()
    }
}

/**
 * Билдер размеров для LinkButton
 */
interface LinkButtonDimensionsBuilder {

    /**
     * Устанавливает высоту кнопки
     */
    fun height(height: Dp): LinkButtonDimensionsBuilder =
        height(height.asStatefulValue())

    /**
     * Устанавливает высоту кнопки
     */
    fun height(height: StatefulValue<Dp>): LinkButtonDimensionsBuilder

    /**
     * Устанавливает отступ кнопки в начале
     */
    fun paddingStart(paddingStart: Dp): LinkButtonDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступы кнопки в начале
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): LinkButtonDimensionsBuilder

    /**
     * Устанавливает отступ кнопки в конце
     */
    fun paddingEnd(paddingEnd: Dp): LinkButtonDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступы кнопки в конце
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): LinkButtonDimensionsBuilder

    /**
     * Устанавливает минимальную ширину кнопки
     */
    fun minWidth(minWidth: Dp): LinkButtonDimensionsBuilder =
        minWidth(minWidth.asStatefulValue())

    /**
     * Устанавливает минимальную ширину кнопки
     */
    fun minWidth(minWidth: StatefulValue<Dp>): LinkButtonDimensionsBuilder

    /**
     * Устанавливает размер иконки
     */
    fun iconSize(iconSize: Dp): LinkButtonDimensionsBuilder =
        iconSize(iconSize.asStatefulValue())

    /**
     * Устанавливает размеры иконки
     */
    fun iconSize(iconSize: StatefulValue<Dp>): LinkButtonDimensionsBuilder

    /**
     * Устанавливает размер спиннера
     */
    fun spinnerSize(spinnerSize: Dp): LinkButtonDimensionsBuilder =
        spinnerSize(spinnerSize.asStatefulValue())

    /**
     * Устанавливает размеры спиннера
     */
    fun spinnerSize(spinnerSize: StatefulValue<Dp>): LinkButtonDimensionsBuilder

    /**
     * Устанавливает толщину спиннера
     */
    fun spinnerStrokeWidth(spinnerStrokeWidth: Dp): LinkButtonDimensionsBuilder =
        spinnerStrokeWidth(spinnerStrokeWidth.asStatefulValue())

    /**
     * Устанавливает толщину спиннера
     */
    fun spinnerStrokeWidth(spinnerStrokeWidth: StatefulValue<Dp>): LinkButtonDimensionsBuilder

    /**
     * Устанавливает отступ иконки
     */
    fun iconMargin(iconMargin: Dp): LinkButtonDimensionsBuilder =
        iconMargin(iconMargin.asStatefulValue())

    /**
     * Устанавливает отступы иконки
     */
    fun iconMargin(iconMargin: StatefulValue<Dp>): LinkButtonDimensionsBuilder

    /**
     * Возвращает [ButtonDimensions]
     */
    fun build(): ButtonDimension

    companion object {
        /**
         * Вернет экземпляр билдера [TextFieldDimensionsBuilder]
         */
        fun builder(): LinkButtonDimensionsBuilder = DefaultLinkButtonDimensions.Builder()
    }
}

@Immutable
private class DefaultLinkButtonDimensions(
    override val heightValues: StatefulValue<Dp>,
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val minWidthValues: StatefulValue<Dp>,
    override val iconSizeValues: StatefulValue<Dp>,
    override val spinnerSizeValues: StatefulValue<Dp>,
    override val spinnerStrokeWidthValues: StatefulValue<Dp>,
    override val iconMarginValues: StatefulValue<Dp>,
    override val valueMarginValues: StatefulValue<Dp>,

) : ButtonDimension {

    class Builder : LinkButtonDimensionsBuilder {
        private var heightValues: StatefulValue<Dp>? = null
        private var paddingStartValues: StatefulValue<Dp>? = null
        private var paddingEndValues: StatefulValue<Dp>? = null
        private var minWidthValues: StatefulValue<Dp>? = null
        private var iconSizeValues: StatefulValue<Dp>? = null
        private var spinnerSizeValues: StatefulValue<Dp>? = null
        private var spinnerStrokeWidthValues: StatefulValue<Dp>? = null
        private var iconMarginValues: StatefulValue<Dp>? = null

        override fun height(height: StatefulValue<Dp>): LinkButtonDimensionsBuilder = apply {
            this.heightValues = height
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>): LinkButtonDimensionsBuilder = apply {
            this.paddingStartValues = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>): LinkButtonDimensionsBuilder = apply {
            this.paddingEndValues = paddingEnd
        }

        override fun minWidth(minWidth: StatefulValue<Dp>): LinkButtonDimensionsBuilder = apply {
            this.minWidthValues = minWidth
        }

        override fun iconSize(iconSize: StatefulValue<Dp>): LinkButtonDimensionsBuilder = apply {
            this.iconSizeValues = iconSize
        }

        override fun spinnerSize(spinnerSize: StatefulValue<Dp>): LinkButtonDimensionsBuilder = apply {
            this.spinnerSizeValues = spinnerSize
        }

        override fun spinnerStrokeWidth(spinnerStrokeWidth: StatefulValue<Dp>): LinkButtonDimensionsBuilder = apply {
            this.spinnerStrokeWidthValues = spinnerStrokeWidth
        }

        override fun iconMargin(iconMargin: StatefulValue<Dp>): LinkButtonDimensionsBuilder = apply {
            this.iconMarginValues = iconMargin
        }

        override fun build(): ButtonDimension {
            return DefaultLinkButtonDimensions(
                heightValues = heightValues ?: 46.dp.asStatefulValue(),
                paddingStartValues = paddingStartValues ?: 0.dp.asStatefulValue(),
                paddingEndValues = paddingEndValues ?: 0.dp.asStatefulValue(),
                minWidthValues = minWidthValues ?: 84.dp.asStatefulValue(),
                iconSizeValues = iconSizeValues ?: 24.dp.asStatefulValue(),
                spinnerSizeValues = spinnerSizeValues ?: 22.dp.asStatefulValue(),
                spinnerStrokeWidthValues = spinnerStrokeWidthValues ?: 2.dp.asStatefulValue(),
                iconMarginValues = iconMarginValues ?: 6.dp.asStatefulValue(),
                valueMarginValues = 0.dp.asStatefulValue(),
            )
        }
    }
}

@Immutable
private class DefaultLinkButtonStyle(
    override val shapes: StatefulValue<CornerBasedShape>,
    override val colors: ButtonColors,
    override val dimensions: ButtonDimension,
    override val disableAlpha: Float,
    override val loadingAlpha: Float,
    override val labelStyles: StatefulValue<TextStyle>,
    override val valueStyles: StatefulValue<TextStyle>,
) : ButtonStyle {

    @Deprecated("Use labelStyles", replaceWith = ReplaceWith("labelStyles"))
    override val labelStyle: TextStyle = labelStyles.getDefaultValue()

    @Deprecated("Use valueStyles", replaceWith = ReplaceWith("valueStyles"))
    override val valueStyle: TextStyle = valueStyles.getDefaultValue()

    @Deprecated("Use shapes", replaceWith = ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()

    class Builder(override val receiver: Any?) : LinkButtonStyleBuilder {
        private var shapes: StatefulValue<CornerBasedShape>? = null
        private var colorsBuilder: LinkButtonColorsBuilder = LinkButtonColorsBuilder.builder()
        private var labelStyles: StatefulValue<TextStyle>? = null
        private var valueStyles: StatefulValue<TextStyle>? = null
        private var dimensionsBuilder: LinkButtonDimensionsBuilder =
            LinkButtonDimensionsBuilder.builder()
        private var disableAlpha: Float? = null
        private var loadingAlpha: Float? = null

        override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
            this.shapes = shape
        }

        @Composable
        override fun colors(builder: @Composable LinkButtonColorsBuilder.() -> Unit): LinkButtonStyleBuilder =
            apply {
                this.colorsBuilder.builder()
            }

        override fun labelStyle(labelStyle: StatefulValue<TextStyle>) = apply {
            this.labelStyles = labelStyle
        }

        override fun valueStyle(valueStyle: StatefulValue<TextStyle>) = apply {
            this.valueStyles = valueStyle
        }

        @Composable
        override fun dimensions(builder: @Composable (LinkButtonDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        @Deprecated("Use dimensions() with builder instead")
        override fun dimensions(dimensions: ButtonDimensions) = apply {
            this.dimensionsBuilder.apply {
                height(dimensions.height)
                paddingStart(dimensions.paddingStart)
                paddingEnd(dimensions.paddingEnd)
                minWidth(dimensions.minWidth)
                iconSize(dimensions.iconSize)
                spinnerSize(dimensions.spinnerSize)
                iconMargin(dimensions.iconMargin)
            }
        }

        override fun disableAlpha(disableAlpha: Float) = apply {
            this.disableAlpha = disableAlpha
        }

        override fun loadingAlpha(loadingAlpha: Float) = apply {
            this.loadingAlpha = loadingAlpha
        }

        override fun style(): ButtonStyle {
            return DefaultLinkButtonStyle(
                shapes = shapes ?: RoundedCornerShape(25).asStatefulValue(),
                colors = colorsBuilder.build(),
                labelStyles = labelStyles ?: TextStyle.Default.asStatefulValue(),
                valueStyles = valueStyles ?: TextStyle.Default.asStatefulValue(),
                dimensions = dimensionsBuilder.build(),
                disableAlpha = disableAlpha ?: DISABLED_BUTTON_ALPHA,
                loadingAlpha = loadingAlpha ?: LOADING_BUTTON_ALPHA,
            )
        }
    }
}

@Immutable
private class DefaultLinkButtonColors(
    override val backgroundBrush: StatefulValue<Brush>,
    override val labelBrush: StatefulValue<Brush>,
    override val valueBrush: StatefulValue<Brush>,
    override val iconBrush: StatefulValue<Brush>,
    override val spinnerColor: InteractiveColor,
) : ButtonColors {

    @Deprecated("Use backgroundBrush", replaceWith = ReplaceWith("backgroundBrush"))
    override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use labelBrush", replaceWith = ReplaceWith("labelBrush"))
    override val labelColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use valueBrush", replaceWith = ReplaceWith("valueBrush"))
    override val valueColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use iconBrush", replaceWith = ReplaceWith("iconBrush"))
    override val iconColor: InteractiveColor = Color.Transparent.asInteractive()

    class Builder : LinkButtonColorsBuilder {

        private var contentBrush: StatefulValue<Brush>? = null
        private var backgroundBrush: StatefulValue<Brush>? = null
        private var labelBrush: StatefulValue<Brush>? = null
        private var iconBrush: StatefulValue<Brush>? = null
        private var spinnerColor: InteractiveColor? = null
        private var valueBrush: StatefulValue<Brush>? = null

        override fun contentColor(contentColor: StatefulValue<Brush>) = apply {
            this.contentBrush = contentColor
        }

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundBrush = backgroundColor
        }

        override fun labelColor(labelColor: StatefulValue<Brush>) = apply {
            this.labelBrush = labelColor
        }

        override fun valueColor(valueColor: StatefulValue<Brush>) = apply {
            this.valueBrush = valueColor
        }

        override fun iconColor(iconColor: StatefulValue<Brush>) = apply {
            this.iconBrush = iconColor
        }

        override fun spinnerColor(spinnerColor: InteractiveColor) = apply {
            this.spinnerColor = spinnerColor
        }

        override fun build(): ButtonColors {
            return DefaultLinkButtonColors(
                backgroundBrush = backgroundBrush ?: Color.White.asStatefulBrush(),
                labelBrush = labelBrush ?: Color.Black.asStatefulBrush(),
                valueBrush = valueBrush ?: Color.Black.asStatefulBrush(),
                iconBrush = iconBrush ?: Color.Black.asStatefulBrush(),
                spinnerColor = spinnerColor ?: Color.Black.asInteractive(),
            )
        }
    }
}

private const val DISABLED_BUTTON_ALPHA = 0.4f
private const val LOADING_BUTTON_ALPHA = 0f
