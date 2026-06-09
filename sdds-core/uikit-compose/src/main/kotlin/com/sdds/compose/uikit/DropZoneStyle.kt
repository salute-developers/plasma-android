package com.sdds.compose.uikit

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal, предоставляющий текущий [DropZoneStyle] для потомков.
 */
val LocalDropZoneStyle = compositionLocalOf { DropZoneStyle.builder().style() }

/**
 * Стиль выезжающей панели (DropZone), включающий форму, цвета, размеры и другие параметры.
 */
@Immutable
interface DropZoneStyle : Style {

    /**
     * Формы DropZone с поддержкой состояний.
     */
    val shape: StatefulValue<Shape>

    /**
     * Стили текста для title с поддержкой состояний.
     */
    val titleStyle: StatefulValue<TextStyle>

    /**
     * Стили текста для description с поддержкой состояний.
     */
    val descriptionStyle: StatefulValue<TextStyle>

    /**
     * Цветовая схема панели.
     */
    val colors: DropZoneColors

    /**
     * Размеры и отступы панели.
     */
    val dimensions: DropZoneDimensions

    /**
     * Расположение иконки
     * @see DropZoneIconPlacement
     */
    val iconPlacement: DropZoneIconPlacement

    /**
     * Расположение иконки
     * @see DropZoneBorderType
     */
    val borderType: DropZoneBorderType

    /**
     * Стиль [Overlay]
     */
    val overlayStyle: OverlayStyle

    /**
     * Значение прозрачности в состоянии Disabled
     */
    val disableAlpha: Float

    companion object {
        /**
         * Возвращает новый [DropZoneStyleBuilder] для создания стиля DropZone.
         *
         * @param receiver необязательный объект для связывания с билдром.
         */
        fun builder(receiver: Any? = null): DropZoneStyleBuilder =
            DefaultDropZoneStyle.Builder(receiver)
    }
}

/**
 * Цвета DropZone.
 */
@Immutable
interface DropZoneColors {

    /**
     * Фон в виде кисти с поддержкой состояний.
     */
    val background: StatefulValue<Brush>

    /**
     * Цвет бордера DropZone в виде кисти с поддержкой состояний.
     */
    val borderColor: StatefulValue<Brush>

    /**
     *  Цвет иконки DropZone в виде кисти с поддержкой состояний.
     */
    val iconColor: StatefulValue<Brush>

    /**
     * Цвет текста в title DropZone в виде кисти с поддержкой состояний.
     */
    val titleColor: StatefulValue<Brush>

    /**
     * Цвет текста в description DropZone в виде кисти с поддержкой состояний.
     */
    val descriptionColor: StatefulValue<Brush>
}

/**
 * Билдер для [DropZoneStyle].
 */
@ApiInfo
interface DropZoneStyleBuilder : StyleBuilder<DropZoneStyle> {

    /**
     * Устанавливает цвета DropZone.
     *
     * @param builder конфигурация цветов.
     */
    @Composable
    fun colors(builder: @Composable DropZoneColorsBuilder.() -> Unit): DropZoneStyleBuilder

    /**
     * Устанавливает формы DropZone.
     *
     * @param shape формы.
     */
    fun shape(shape: StatefulValue<Shape>): DropZoneStyleBuilder

    /**
     * Устанавливает формы DropZone.
     *
     * @param shape формы.
     */
    fun shape(shape: Shape): DropZoneStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает размеры и отступы панели.
     *
     * @param builder конфигурация размеров.
     */
    @Composable
    fun dimensions(builder: @Composable DropZoneDimensionsBuilder.() -> Unit): DropZoneStyleBuilder

    /**
     * Устанавливает расположение иконки [DropZoneIconPlacement]
     *
     * @param iconPlacement расположение иконки
     */
    fun iconPlacement(iconPlacement: DropZoneIconPlacement): DropZoneStyleBuilder

    /**
     * Устанавливает тип бордера [DropZoneBorderType]
     *
     * @param borderType выравнивание иконки
     */
    fun borderType(borderType: DropZoneBorderType): DropZoneStyleBuilder

    /**
     * Устанавливает стиль текста title в DropZone [titleStyle]
     * @see DropZoneStyle.titleStyle
     */
    fun titleStyle(titleStyle: TextStyle): DropZoneStyleBuilder =
        titleStyle(titleStyle.asStatefulValue())

    /**
     * Устанавливает стили текста title в DropZone [titleStyle]
     * @see DropZoneStyle.titleStyle
     */
    fun titleStyle(titleStyle: StatefulValue<TextStyle>): DropZoneStyleBuilder

    /**
     * Устанавливает стиль текста description в DropZone [descriptionStyle]
     * @see DropZoneStyle.descriptionStyle
     */
    fun descriptionStyle(descriptionStyle: TextStyle): DropZoneStyleBuilder =
        descriptionStyle(descriptionStyle.asStatefulValue())

    /**
     * Устанавливает стили текста description в DropZone [descriptionStyle]
     * @see DropZoneStyle.descriptionStyle
     */
    fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>): DropZoneStyleBuilder

    /**
     * Устанавливает значение прозрачности в состоянии Disabled [disableAlpha]
     * @see ButtonStyle.disableAlpha
     */
    fun disableAlpha(disableAlpha: Float): DropZoneStyleBuilder

    /**
     * Устанавливает стиль [overlayStyle]
     */
    fun overlayStyle(overlayStyle: OverlayStyle): DropZoneStyleBuilder
}

/**
 * Билдер для [DropZoneColors].
 */
interface DropZoneColorsBuilder {

    /**
     * Устанавливает кисти [background] фона компонента.
     * @see DropZoneColors.background
     */
    fun background(background: StatefulValue<Brush>): DropZoneColorsBuilder

    /**
     * Устанавливает цвет [background] фона компонента.
     * @see DropZoneColorsBuilder.background
     * @see InteractiveColor
     */
    fun background(background: InteractiveColor): DropZoneColorsBuilder =
        background(background.asStatefulBrush())

    /**
     * Устанавливает цвет [background] фона компонента.
     * @see DropZoneColorsBuilder.background
     */
    fun background(background: Color): DropZoneColorsBuilder =
        background(background.asStatefulBrush())

    /**
     * Устанавливает кисть [background] фона компонента.
     * @see DropZoneColorsBuilder.background
     */
    fun background(background: Brush): DropZoneColorsBuilder =
        background(background.asStatefulValue())

    /**
     * Устанавливает кисти текста title в DropZone [titleColor]
     * @see DropZoneColors.titleColor
     */
    fun titleColor(titleColor: StatefulValue<Brush>): DropZoneColorsBuilder

    /**
     * Устанавливает цвет текста title в DropZone [titleColor]
     * @see DropZoneColorsBuilder.titleColor
     * @see InteractiveColor
     */
    fun titleColor(titleColor: InteractiveColor): DropZoneColorsBuilder =
        titleColor(titleColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста title в DropZone [titleColor]
     * @see DropZoneColorsBuilder.titleColor
     */
    fun titleColor(titleColor: Color): DropZoneColorsBuilder =
        titleColor(titleColor.asStatefulBrush())

    /**
     * Устанавливает кисть текста title в DropZone [titleColor]
     * @see DropZoneColorsBuilder.titleColor
     */
    fun titleColor(titleColor: Brush): DropZoneColorsBuilder =
        titleColor(titleColor.asStatefulValue())

    /**
     * Устанавливает кисти текста description в DropZone [descriptionColor]
     * @see DropZoneColors.descriptionColor
     */
    fun descriptionColor(descriptionColor: StatefulValue<Brush>): DropZoneColorsBuilder

    /**
     * Устанавливает цвет текста description в DropZone [descriptionColor]
     * @see DropZoneColorsBuilder.descriptionColor
     * @see InteractiveColor
     */
    fun descriptionColor(descriptionColor: InteractiveColor): DropZoneColorsBuilder =
        descriptionColor(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста description в DropZone [descriptionColor]
     * @see DropZoneColorsBuilder.descriptionColor
     */
    fun descriptionColor(descriptionColor: Color): DropZoneColorsBuilder =
        descriptionColor(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает кисть текста description в DropZone [descriptionColor]
     * @see DropZoneColorsBuilder.descriptionColor
     */
    fun descriptionColor(descriptionColor: Brush): DropZoneColorsBuilder =
        descriptionColor(descriptionColor.asStatefulValue())

    /**
     * Устанавливает кисти иконки в DropZone [iconColor]
     * @see DropZoneColors.iconColor
     */
    fun iconColor(iconColor: StatefulValue<Brush>): DropZoneColorsBuilder

    /**
     * Устанавливает цвет иконки в DropZone [iconColor]
     * @see DropZoneColorsBuilder.iconColor
     * @see InteractiveColor
     */
    fun iconColor(iconColor: InteractiveColor): DropZoneColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки в DropZone [iconColor]
     * @see DropZoneColorsBuilder.iconColor
     */
    fun iconColor(iconColor: Color): DropZoneColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает кисть иконки в DropZone [iconColor]
     * @see DropZoneColorsBuilder.iconColor
     */
    fun iconColor(iconColor: Brush): DropZoneColorsBuilder =
        iconColor(iconColor.asStatefulValue())

    /**
     * Устанавливает кисти бордера в DropZone [borderColor]
     * @see DropZoneColors.borderColor
     */
    fun borderColor(borderColor: StatefulValue<Brush>): DropZoneColorsBuilder

    /**
     * Устанавливает цвет бордера в DropZone [borderColor]
     * @see DropZoneColorsBuilder.borderColor
     * @see InteractiveColor
     */
    fun borderColor(borderColor: InteractiveColor): DropZoneColorsBuilder =
        borderColor(borderColor.asStatefulBrush())

    /**
     * Устанавливает цвет бордера в DropZone [borderColor]
     * @see DropZoneColorsBuilder.borderColor
     */
    fun borderColor(borderColor: Color): DropZoneColorsBuilder =
        borderColor(borderColor.asStatefulBrush())

    /**
     * Устанавливает кисть бордера в DropZone [borderColor]
     * @see DropZoneColorsBuilder.borderColor
     */
    fun borderColor(borderColor: Brush): DropZoneColorsBuilder =
        borderColor(borderColor.asStatefulValue())

    /**
     * Возвращает готовый экземпляр [DropZoneColors]
     */
    fun build(): DropZoneColors

    companion object {
        /**
         * Возвращает экземпляр [DropZoneColorsBuilder]
         */
        fun builder(): DropZoneColorsBuilder = DefaultDropZoneColors.Builder()
    }
}

/**
 * Размеры и отступы DropZone.
 */
@Immutable
interface DropZoneDimensions {
    /**
     * Толщина обводки DropZone.
     */
    val borderThickness: StatefulValue<Dp>

    /**
     * Ширина линии пунктира бордера DropZone.
     */
    val borderDashWidth: StatefulValue<Dp>

    /**
     * Интервал линии пунктира бордера DropZone.
     */
    val borderDashGap: StatefulValue<Dp>

    /**
     * Отступы между Title и Description DropZone.
     */
    val gap: StatefulValue<Dp>

    /**
     * Размер иконки DropZone.
     */
    val iconSize: StatefulValue<Dp>

    /**
     * Отступ иконки от title DropZone.
     */
    val iconPadding: StatefulValue<Dp>

    /**
     * Отступ сверху
     */
    val paddingTop: StatefulValue<Dp>

    /**
     * Отступ вначале
     */
    val paddingStart: StatefulValue<Dp>

    /**
     * Отступ вконце
     */
    val paddingEnd: StatefulValue<Dp>

    /**
     * Отступ снизу
     */
    val paddingBottom: StatefulValue<Dp>
}

/**
 * Билдер для [DropZoneDimensions].
 */
interface DropZoneDimensionsBuilder {

    /**
     * Устанавливает внутренний отступ вначале [pStart]
     */
    fun paddingStart(pStart: Dp): DropZoneDimensionsBuilder =
        paddingStart(pStart.asStatefulValue())

    /**
     * Устанавливает внутренний отступ вначале [pStart]
     */
    fun paddingStart(pStart: StatefulValue<Dp>): DropZoneDimensionsBuilder

    /**
     * Устанавливает внутренний отступ вконце [pEnd]
     */
    fun paddingEnd(pEnd: Dp): DropZoneDimensionsBuilder =
        paddingEnd(pEnd.asStatefulValue())

    /**
     * Устанавливает внутренний отступ вконце [pEnd]
     */
    fun paddingEnd(pEnd: StatefulValue<Dp>): DropZoneDimensionsBuilder

    /**
     * Устанавливает внутренний отступ сверху [pTop]
     */
    fun paddingTop(pTop: Dp): DropZoneDimensionsBuilder =
        paddingTop(pTop.asStatefulValue())

    /**
     * Устанавливает внутренний отступ сверху [pTop]
     */
    fun paddingTop(pTop: StatefulValue<Dp>): DropZoneDimensionsBuilder

    /**
     * Устанавливает внутренний отступ снизу [pBottom]
     */
    fun paddingBottom(pBottom: Dp): DropZoneDimensionsBuilder =
        paddingBottom(pBottom.asStatefulValue())

    /**
     * Устанавливает внутренний отступ снизу [pBottom]
     */
    fun paddingBottom(pBottom: StatefulValue<Dp>): DropZoneDimensionsBuilder

    /**
     * Устанавливает толщину бордера [thickness]
     */
    fun borderThickness(thickness: Dp): DropZoneDimensionsBuilder =
        borderThickness(thickness.asStatefulValue())

    /**
     * Устанавливает толщину бордера [thickness]
     */
    fun borderThickness(thickness: StatefulValue<Dp>): DropZoneDimensionsBuilder

    /**
     * Устанавливает ширину линии пунктира бордера [dashWidth]
     */
    fun borderDashWidth(dashWidth: Dp): DropZoneDimensionsBuilder =
        borderDashWidth(dashWidth.asStatefulValue())

    /**
     * Устанавливает ширину линии пунктира бордера [dashWidth]
     */
    fun borderDashWidth(dashWidth: StatefulValue<Dp>): DropZoneDimensionsBuilder

    /**
     * Устанавливает интервал линии пунктира бордера [dashGap]
     */
    fun borderDashGap(dashGap: Dp): DropZoneDimensionsBuilder =
        borderDashGap(dashGap.asStatefulValue())

    /**
     * Устанавливает ширину линии пунктира бордера [dashGap]
     */
    fun borderDashGap(dashGap: StatefulValue<Dp>): DropZoneDimensionsBuilder

    /**
     * Устанавливает размеры иконки [size]
     */
    fun iconSize(size: Dp): DropZoneDimensionsBuilder =
        iconSize(size.asStatefulValue())

    /**
     * Устанавливает размеры иконки [size]
     */
    fun iconSize(size: StatefulValue<Dp>): DropZoneDimensionsBuilder

    /**
     * Устанавливает отступ иконки от текста title [padding]
     */
    fun iconPadding(padding: Dp): DropZoneDimensionsBuilder =
        iconPadding(padding.asStatefulValue())

    /**
     * Устанавливает отступ иконки от текста title [padding]
     */
    fun iconPadding(padding: StatefulValue<Dp>): DropZoneDimensionsBuilder

    /**
     * Устанавливает отступ между Title и Description [gap]
     */
    fun gap(gap: Dp): DropZoneDimensionsBuilder =
        gap(gap.asStatefulValue())

    /**
     * Устанавливает отступы между Title и Description [gap]
     */
    fun gap(gap: StatefulValue<Dp>): DropZoneDimensionsBuilder

    /**
     * Создает [DropZoneDimensions]
     */
    fun build(): DropZoneDimensions

    companion object {
        /**
         * Возвращает экземпляр [DropZoneDimensionsBuilder]
         */
        fun builder(): DropZoneDimensionsBuilder = DefaultDropZoneDimensions.Builder()
    }
}

@Immutable
private class DefaultDropZoneColors(
    override val background: StatefulValue<Brush>,
    override val borderColor: StatefulValue<Brush>,
    override val iconColor: StatefulValue<Brush>,
    override val titleColor: StatefulValue<Brush>,
    override val descriptionColor: StatefulValue<Brush>,
) : DropZoneColors {
    class Builder : DropZoneColorsBuilder {
        private var background: StatefulValue<Brush>? = null
        private var borderColor: StatefulValue<Brush>? = null
        private var iconColor: StatefulValue<Brush>? = null
        private var titleColor: StatefulValue<Brush>? = null
        private var descriptionColor: StatefulValue<Brush>? = null

        override fun background(background: StatefulValue<Brush>): DropZoneColorsBuilder = apply {
            this.background = background
        }

        override fun titleColor(titleColor: StatefulValue<Brush>): DropZoneColorsBuilder = apply {
            this.titleColor = titleColor
        }

        override fun descriptionColor(descriptionColor: StatefulValue<Brush>): DropZoneColorsBuilder = apply {
            this.descriptionColor = descriptionColor
        }

        override fun iconColor(iconColor: StatefulValue<Brush>): DropZoneColorsBuilder = apply {
            this.iconColor = iconColor
        }

        override fun borderColor(borderColor: StatefulValue<Brush>): DropZoneColorsBuilder = apply {
            this.borderColor = borderColor
        }

        override fun build(): DropZoneColors {
            return DefaultDropZoneColors(
                background = background ?: Color.Transparent.asStatefulBrush(
                    setOf(InteractiveState.Focused) to Color.LightGray,
                ),
                borderColor = borderColor ?: Color.Gray.asStatefulBrush(
                    setOf(DropZoneState.DraggingOver) to Color.Green,
                    setOf(InteractiveState.Focused) to Color.LightGray,
                ),
                iconColor = iconColor ?: Color.LightGray.asStatefulBrush(),
                titleColor = titleColor ?: Color.Gray.asStatefulBrush(),
                descriptionColor = descriptionColor ?: Color.LightGray.asStatefulBrush(),
            )
        }
    }
}

@Immutable
private class DefaultDropZoneDimensions(
    override val borderThickness: StatefulValue<Dp>,
    override val iconSize: StatefulValue<Dp>,
    override val paddingTop: StatefulValue<Dp>,
    override val paddingStart: StatefulValue<Dp>,
    override val paddingEnd: StatefulValue<Dp>,
    override val paddingBottom: StatefulValue<Dp>,
    override val gap: StatefulValue<Dp>,
    override val iconPadding: StatefulValue<Dp>,
    override val borderDashWidth: StatefulValue<Dp>,
    override val borderDashGap: StatefulValue<Dp>,

) : DropZoneDimensions {
    class Builder : DropZoneDimensionsBuilder {

        private var borderThickness: StatefulValue<Dp>? = null
        private var borderDashWidth: StatefulValue<Dp>? = null
        private var borderDashGap: StatefulValue<Dp>? = null
        private var iconSize: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null
        private var iconPadding: StatefulValue<Dp>? = null
        private var gap: StatefulValue<Dp>? = null

        override fun paddingStart(pStart: StatefulValue<Dp>): DropZoneDimensionsBuilder = apply {
            this.paddingStart = pStart
        }

        override fun paddingEnd(pEnd: StatefulValue<Dp>): DropZoneDimensionsBuilder = apply {
            this.paddingEnd = pEnd
        }

        override fun paddingTop(pTop: StatefulValue<Dp>): DropZoneDimensionsBuilder = apply {
            this.paddingTop = pTop
        }

        override fun paddingBottom(pBottom: StatefulValue<Dp>): DropZoneDimensionsBuilder = apply {
            this.paddingBottom = pBottom
        }

        override fun borderThickness(thickness: StatefulValue<Dp>): DropZoneDimensionsBuilder = apply {
            this.borderThickness = thickness
        }

        override fun borderDashWidth(dashWidth: StatefulValue<Dp>): DropZoneDimensionsBuilder = apply {
            this.borderDashWidth = dashWidth
        }

        override fun borderDashGap(dashGap: StatefulValue<Dp>): DropZoneDimensionsBuilder = apply {
            this.borderDashWidth = dashGap
        }

        override fun iconSize(size: StatefulValue<Dp>): DropZoneDimensionsBuilder = apply {
            this.iconSize = size
        }

        override fun iconPadding(padding: StatefulValue<Dp>): DropZoneDimensionsBuilder = apply {
            this.iconPadding = padding
        }

        override fun gap(gap: StatefulValue<Dp>): DropZoneDimensionsBuilder = apply {
            this.gap = gap
        }

        override fun build(): DropZoneDimensions {
            return DefaultDropZoneDimensions(
                borderThickness = borderThickness ?: 1.dp.asStatefulValue(),
                iconSize = iconSize ?: Dp.Unspecified.asStatefulValue(),
                paddingTop = paddingTop ?: DefaultDropZonePadding.asStatefulValue(),
                paddingStart = paddingStart ?: DefaultDropZonePadding.asStatefulValue(),
                paddingEnd = paddingEnd ?: DefaultDropZonePadding.asStatefulValue(),
                paddingBottom = paddingBottom ?: DefaultDropZonePadding.asStatefulValue(),
                gap = gap ?: 12.dp.asStatefulValue(),
                iconPadding = iconPadding ?: 8.dp.asStatefulValue(),
                borderDashWidth = borderDashWidth ?: 8.dp.asStatefulValue(),
                borderDashGap = borderDashGap ?: 6.dp.asStatefulValue(),
            )
        }
    }
}

@Immutable
private class DefaultDropZoneStyle(
    override val shape: StatefulValue<Shape>,
    override val colors: DropZoneColors,
    override val dimensions: DropZoneDimensions,
    override val titleStyle: StatefulValue<TextStyle>,
    override val descriptionStyle: StatefulValue<TextStyle>,
    override val iconPlacement: DropZoneIconPlacement,
    override val borderType: DropZoneBorderType,
    override val overlayStyle: OverlayStyle,
    override val disableAlpha: Float,
) : DropZoneStyle {

    class Builder(receiver: Any?) : DropZoneStyleBuilder {
        private var colorsBuilder: DropZoneColorsBuilder = DropZoneColorsBuilder.builder()
        private var shape: StatefulValue<Shape>? = null
        private var dimensionsBuilder: DropZoneDimensionsBuilder = DropZoneDimensionsBuilder.builder()
        private var iconPlacement: DropZoneIconPlacement = DropZoneIconPlacement.Top
        private var borderType: DropZoneBorderType = DropZoneBorderType.Dashes
        private var titleStyle: StatefulValue<TextStyle>? = null
        private var descriptionStyle: StatefulValue<TextStyle>? = null
        private var overlayStyle: OverlayStyle? = null
        private var disableAlpha: Float? = null

        @Composable
        override fun colors(builder: @Composable (DropZoneColorsBuilder.() -> Unit)): DropZoneStyleBuilder = apply {
            this.colorsBuilder.builder()
        }

        override fun shape(shape: StatefulValue<Shape>): DropZoneStyleBuilder = apply {
            this.shape = shape
        }

        @Composable
        override fun dimensions(
            builder:
            @Composable (DropZoneDimensionsBuilder.() -> Unit),
        ): DropZoneStyleBuilder = apply {
            this.dimensionsBuilder.builder()
        }

        override fun iconPlacement(iconPlacement: DropZoneIconPlacement): DropZoneStyleBuilder = apply {
            this.iconPlacement = iconPlacement
        }

        override fun borderType(borderType: DropZoneBorderType): DropZoneStyleBuilder = apply {
            this.borderType = borderType
        }

        override fun titleStyle(titleStyle: StatefulValue<TextStyle>): DropZoneStyleBuilder = apply {
            this.titleStyle = titleStyle
        }

        override fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>): DropZoneStyleBuilder = apply {
            this.descriptionStyle = descriptionStyle
        }

        override fun disableAlpha(disableAlpha: Float): DropZoneStyleBuilder = apply {
            this.disableAlpha = disableAlpha
        }

        override fun overlayStyle(overlayStyle: OverlayStyle): DropZoneStyleBuilder = apply {
            this.overlayStyle = overlayStyle
        }

        override fun style(): DropZoneStyle {
            return DefaultDropZoneStyle(
                colors = colorsBuilder.build(),
                shape = shape ?: DefaultDropZoneShape.asStatefulValue(),
                dimensions = dimensionsBuilder.build(),
                titleStyle = titleStyle ?: TextStyle.Default.asStatefulValue(),
                descriptionStyle = descriptionStyle ?: TextStyle.Default.asStatefulValue(),
                iconPlacement = iconPlacement,
                borderType = borderType,
                disableAlpha = disableAlpha ?: 0.4f,
                overlayStyle = overlayStyle ?: OverlayStyle
                    .builder()
                    .style(),
            )
        }
    }
}

private val DefaultDropZonePadding = 24.dp
private val DefaultDropZoneShape = RoundedCornerShape(10)
