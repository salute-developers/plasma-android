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
val LocalIconButtonStyle = compositionLocalOf { ButtonStyle.iconButtonBuilder().style() }

/**
 * Возвращает экземпляр [IconButtonStyleBuilder]
 */
fun ButtonStyle.Companion.iconButtonBuilder(receiver: Any? = null): IconButtonStyleBuilder =
    DefaultIconButtonStyle.Builder(receiver)

/**
 * Builder стиля кнопки c иконкой
 */
@Stable
@ApiInfo(builderFunName = "iconButtonBuilder")
interface IconButtonStyleBuilder : StyleBuilder<ButtonStyle> {

    /**
     * Устанавливает форму кнопки [shape]
     * @see ButtonStyle.shape
     */
    fun shape(shape: CornerBasedShape): IconButtonStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает формы кнопки [shape]
     * @see ButtonStyle.shape
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): IconButtonStyleBuilder

    /**
     * Устанавливает цвета кнопки при помощи [builder]
     * @see ButtonStyle.colors
     * @see [IconButtonColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable IconButtonColorsBuilder.() -> Unit): IconButtonStyleBuilder

    /**
     * Устанавливает размеры и отступы контента кнопки [dimensions]
     * @see ButtonStyle.dimensions
     * @see ButtonDimensions
     */
    @Deprecated("Use dimensions() with builder instead")
    fun dimensions(dimensions: ButtonDimensions): IconButtonStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable IconButtonDimensionsBuilder.() -> Unit): IconButtonStyleBuilder

    /**
     * Устанавливает значение прозрачности выключенной кнопки [disableAlpha]
     * @see ButtonStyle.disableAlpha
     */
    fun disableAlpha(disableAlpha: Float): IconButtonStyleBuilder

    /**
     * Устанавливает значение прозрачности кнопки в состоянии загрузки [loadingAlpha]
     * @see ButtonStyle.loadingAlpha
     */
    fun loadingAlpha(loadingAlpha: Float): IconButtonStyleBuilder
}

/**
 * Builder для [ButtonColors].
 */
interface IconButtonColorsBuilder {

    /**
     * Устанавливает цвет контента кнопки [contentColor]
     * @see InteractiveColor
     */
    fun contentColor(contentColor: InteractiveColor): IconButtonColorsBuilder =
        contentColor(contentColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента кнопки [contentColor]
     * @see IconButtonColorsBuilder.contentColor
     */
    fun contentColor(contentColor: Color): IconButtonColorsBuilder =
        contentColor(contentColor.asStatefulBrush())

    /**
     * Устанавливает кисть контента кнопки [contentColor]
     */
    fun contentColor(contentColor: Brush): IconButtonColorsBuilder =
        contentColor(contentColor.asStatefulValue())

    /**
     * Устанавливает кисти контента кнопки [contentColor]
     */
    fun contentColor(contentColor: StatefulValue<Brush>): IconButtonColorsBuilder

    /**
     * Устанавливает цвет фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): IconButtonColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): IconButtonColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисть фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Brush): IconButtonColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает кисти фона кнопки [backgroundColor]
     * @see ButtonColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): IconButtonColorsBuilder

    /**
     * Устанавливает цвет иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     * @see InteractiveColor
     */
    fun iconColor(iconColor: InteractiveColor): IconButtonColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     */
    fun iconColor(iconColor: Color): IconButtonColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает кисть иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     */
    fun iconColor(iconColor: Brush): IconButtonColorsBuilder =
        iconColor(iconColor.asStatefulValue())

    /**
     * Устанавливает кисти иконки кнопки [iconColor]
     * @see ButtonColors.iconColor
     */
    fun iconColor(iconColor: StatefulValue<Brush>): IconButtonColorsBuilder

    /**
     * Устанавливает цвет индикатора загрузки кнопки [spinnerColor]
     * @see ButtonColors.spinnerColor
     * @see InteractiveColor
     */
    fun spinnerColor(spinnerColor: InteractiveColor): IconButtonColorsBuilder

    /**
     * Устанавливает цвет индикатора загрузки кнопки [spinnerColor]
     * @see ButtonColors.spinnerColor
     */
    fun spinnerColor(spinnerColor: Color): IconButtonColorsBuilder =
        spinnerColor(spinnerColor.asInteractive())

    /**
     * Возвращает готовый экземпляр [ButtonColors]
     */
    fun build(): ButtonColors

    companion object {
        /**
         * Возвращает экземпляр [IconButtonColorsBuilder]
         */
        fun builder(): IconButtonColorsBuilder = DefaultIconButtonColors.Builder()
    }
}

/**
 * Билдер размеров для IconButton
 */
interface IconButtonDimensionsBuilder {

    /**
     * Устанавливает высоту кнопки
     */
    fun height(height: Dp): IconButtonDimensionsBuilder =
        height(height.asStatefulValue())

    /**
     * Устанавливает высоту кнопки
     */
    fun height(height: StatefulValue<Dp>): IconButtonDimensionsBuilder

    /**
     * Устанавливает отступ кнопки в начале
     */
    fun paddingStart(paddingStart: Dp): IconButtonDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступы кнопки в начале
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): IconButtonDimensionsBuilder

    /**
     * Устанавливает отступ кнопки в конце
     */
    fun paddingEnd(paddingEnd: Dp): IconButtonDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступы кнопки в конце
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): IconButtonDimensionsBuilder

    /**
     * Устанавливает минимальную ширину кнопки
     */
    fun minWidth(minWidth: Dp): IconButtonDimensionsBuilder =
        minWidth(minWidth.asStatefulValue())

    /**
     * Устанавливает минимальную ширину кнопки
     */
    fun minWidth(minWidth: StatefulValue<Dp>): IconButtonDimensionsBuilder

    /**
     * Устанавливает размер иконки
     */
    fun iconSize(iconSize: Dp): IconButtonDimensionsBuilder =
        iconSize(iconSize.asStatefulValue())

    /**
     * Устанавливает размеры иконки
     */
    fun iconSize(iconSize: StatefulValue<Dp>): IconButtonDimensionsBuilder

    /**
     * Устанавливает размер спиннера
     */
    fun spinnerSize(spinnerSize: Dp): IconButtonDimensionsBuilder =
        spinnerSize(spinnerSize.asStatefulValue())

    /**
     * Устанавливает размеры спиннера
     */
    fun spinnerSize(spinnerSize: StatefulValue<Dp>): IconButtonDimensionsBuilder

    /**
     * Устанавливает толщину спиннера
     */
    fun spinnerStrokeWidth(spinnerStrokeWidth: Dp): IconButtonDimensionsBuilder =
        spinnerStrokeWidth(spinnerStrokeWidth.asStatefulValue())

    /**
     * Устанавливает толщину спиннера
     */
    fun spinnerStrokeWidth(spinnerStrokeWidth: StatefulValue<Dp>): IconButtonDimensionsBuilder

    /**
     * Возвращает [ButtonDimensions]
     */
    fun build(): ButtonDimension

    companion object {
        /**
         * Вернет экземпляр билдера [IconButtonDimensionsBuilder]
         */
        fun builder(): IconButtonDimensionsBuilder = DefaultIconButtonDimensions.Builder()
    }
}

@Immutable
private class DefaultIconButtonDimensions(
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
    class Builder : IconButtonDimensionsBuilder {
        private var heightValues: StatefulValue<Dp>? = null
        private var paddingStartValues: StatefulValue<Dp>? = null
        private var paddingEndValues: StatefulValue<Dp>? = null
        private var minWidthValues: StatefulValue<Dp>? = null
        private var iconSizeValues: StatefulValue<Dp>? = null
        private var spinnerSizeValues: StatefulValue<Dp>? = null
        private var spinnerStrokeWidthValues: StatefulValue<Dp>? = null

        override fun height(height: StatefulValue<Dp>): IconButtonDimensionsBuilder = apply {
            this.heightValues = height
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>): IconButtonDimensionsBuilder = apply {
            this.paddingStartValues = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>): IconButtonDimensionsBuilder = apply {
            this.paddingEndValues = paddingEnd
        }

        override fun minWidth(minWidth: StatefulValue<Dp>): IconButtonDimensionsBuilder = apply {
            this.minWidthValues = minWidth
        }

        override fun iconSize(iconSize: StatefulValue<Dp>): IconButtonDimensionsBuilder = apply {
            this.iconSizeValues = iconSize
        }

        override fun spinnerSize(spinnerSize: StatefulValue<Dp>): IconButtonDimensionsBuilder = apply {
            this.spinnerSizeValues = spinnerSize
        }

        override fun spinnerStrokeWidth(spinnerStrokeWidth: StatefulValue<Dp>): IconButtonDimensionsBuilder = apply {
            this.spinnerStrokeWidthValues = spinnerStrokeWidth
        }

        override fun build(): ButtonDimension {
            return DefaultIconButtonDimensions(
                heightValues = heightValues ?: 46.dp.asStatefulValue(),
                paddingStartValues = paddingStartValues ?: 0.dp.asStatefulValue(),
                paddingEndValues = paddingEndValues ?: 0.dp.asStatefulValue(),
                minWidthValues = minWidthValues ?: 84.dp.asStatefulValue(),
                iconSizeValues = iconSizeValues ?: 24.dp.asStatefulValue(),
                spinnerSizeValues = spinnerSizeValues ?: 22.dp.asStatefulValue(),
                spinnerStrokeWidthValues = spinnerStrokeWidthValues ?: 2.dp.asStatefulValue(),
                iconMarginValues = 0.dp.asStatefulValue(),
                valueMarginValues = 0.dp.asStatefulValue(),
            )
        }
    }
}

@Immutable
private class DefaultIconButtonStyle(
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

    class Builder(override val receiver: Any?) : IconButtonStyleBuilder {
        private var shapes: StatefulValue<CornerBasedShape>? = null
        private var colorsBuilder: IconButtonColorsBuilder = IconButtonColorsBuilder.builder()
        private var labelStyles: StatefulValue<TextStyle>? = null
        private var valueStyles: StatefulValue<TextStyle>? = null
        private var dimensionsBuilder: IconButtonDimensionsBuilder =
            IconButtonDimensionsBuilder.builder()
        private var disableAlpha: Float? = null
        private var loadingAlpha: Float? = null

        override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
            this.shapes = shape
        }

        @Composable
        override fun colors(builder: @Composable IconButtonColorsBuilder.() -> Unit): IconButtonStyleBuilder =
            apply {
                this.colorsBuilder.builder()
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
            }
        }

        @Composable
        override fun dimensions(builder: @Composable (IconButtonDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun disableAlpha(disableAlpha: Float) = apply {
            this.disableAlpha = disableAlpha
        }

        override fun loadingAlpha(loadingAlpha: Float) = apply {
            this.loadingAlpha = loadingAlpha
        }

        override fun style(): ButtonStyle {
            return DefaultIconButtonStyle(
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
private class DefaultIconButtonColors(
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
    class Builder : IconButtonColorsBuilder {
        private var contentColor: StatefulValue<Brush>? = null
        private var backgroundBrush: StatefulValue<Brush>? = null
        private var iconBrush: StatefulValue<Brush>? = null
        private var spinnerColor: InteractiveColor? = null

        override fun contentColor(contentColor: StatefulValue<Brush>) = apply {
            this.contentColor = contentColor
        }

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundBrush = backgroundColor
        }

        override fun iconColor(iconColor: StatefulValue<Brush>) = apply {
            this.iconBrush = iconColor
        }

        override fun spinnerColor(spinnerColor: InteractiveColor) = apply {
            this.spinnerColor = spinnerColor
        }

        override fun build(): ButtonColors {
            return DefaultIconButtonColors(
                backgroundBrush = backgroundBrush ?: Color.White.asStatefulBrush(),
                labelBrush = Color.Transparent.asStatefulBrush(),
                valueBrush = Color.Transparent.asStatefulBrush(),
                iconBrush = iconBrush ?: Color.Black.asStatefulBrush(),
                spinnerColor = spinnerColor ?: Color.Black.asInteractive(),
            )
        }
    }
}

private const val DISABLED_BUTTON_ALPHA = 0.4f
private const val LOADING_BUTTON_ALPHA = 0f
