package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
 * CompositionLocal с [ModalBottomSheetStyle] для компонента [ModalBottomSheet]
 */
val LocalModalBottomSheetStyle = compositionLocalOf { ModalBottomSheetStyle.builder().style() }

/**
 * Стиль ModalBottomSheet
 */
@Immutable
interface ModalBottomSheetStyle : Style {

    /**
     * Цвета Компонента ModalBottomSheet
     * @see ModalBottomSheetColors
     */
    val colors: ModalBottomSheetColors

    /**
     * Форма ModalBottomSheet
     * @see CornerBasedShape
     */
    @Deprecated("shapes", replaceWith = ReplaceWith("shapes"))
    val shape: CornerBasedShape

    /**
     * Формы скруглений верхних и нижних углов ModalBottomSheet
     * @see CornerBasedShape
     */
    val shapes: StatefulValue<CornerBasedShape>

    /**
     * Формы скруглений верхних углов ModalBottomSheet
     * @see CornerBasedShape
     */
    val topShape: StatefulValue<CornerBasedShape>

    /**
     * Формы скруглений нижних углов ModalBottomSheet
     * @see CornerBasedShape
     */
    val bottomShape: StatefulValue<CornerBasedShape>

    /**
     * Форма handle
     * @see CornerBasedShape
     */
    @Deprecated("use handleShapes", replaceWith = ReplaceWith("handleShapes"))
    val handleShape: CornerBasedShape

    /**
     * Формы handle
     * @see CornerBasedShape
     */
    val handleShapes: StatefulValue<CornerBasedShape>

    /**
     * Отступы контента внутри ModalBottomSheet
     */
    val dimensions: ModalBottomSheetDimensions

    /**
     * Расположение handle относительно ModalBottomSheet
     * @see BottomSheetHandlePlacement
     */
    val handlePlacement: BottomSheetHandlePlacement

    /**
     * Тень ModalBottomSheet
     */
    val shadow: ShadowAppearance?

    /**
     * Стиль overlay
     */
    val overlayStyle: OverlayStyle

    companion object {
        /**
         * Возвращает экземпляр [ModalBottomSheetStyleBuilder]
         */
        fun builder(receiver: Any? = null): ModalBottomSheetStyleBuilder =
            ModalBottomSheetStyleBuilderImpl(receiver)
    }
}

/**
 * Builder стиля [ModalBottomSheetStyle]
 */
@ApiInfo
interface ModalBottomSheetStyleBuilder : StyleBuilder<ModalBottomSheetStyle> {

    /**
     * Устанавливает цвета компонента [colors]
     */
    @Composable
    fun colors(builder: @Composable ModalBottomSheetColorsBuilder.() -> Unit): ModalBottomSheetStyleBuilder

    /**
     * Устанавливает форму компонента [shape]
     * @see ModalBottomSheetStyle.shape
     */
    fun shape(shape: CornerBasedShape): ModalBottomSheetStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает формы компонента [shape]
     * @see ModalBottomSheetStyle.shapes
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): ModalBottomSheetStyleBuilder

    /**
     * Устанавливает формы скруглений верхних углов компонента [shape]
     * @see ModalBottomSheetStyle.topShape
     */
    fun topShape(shape: StatefulValue<CornerBasedShape>): ModalBottomSheetStyleBuilder

    /**
     * Устанавливает форму скруглений верхних углов компонента [shape]
     * @see ModalBottomSheetStyleBuilder.topShape
     */
    fun topShape(shape: CornerBasedShape): ModalBottomSheetStyleBuilder =
        topShape(shape.asStatefulValue())

    /**
     * Устанавливает формы скруглений нижних углов  компонента [shape]
     * @see ModalBottomSheetStyle.bottomShape
     */
    fun bottomShape(shape: StatefulValue<CornerBasedShape>): ModalBottomSheetStyleBuilder

    /**
     * Устанавливает формы скруглений нижних углов  компонента [shape]
     * @see ModalBottomSheetStyleBuilder.bottomShape
     */
    fun bottomShape(shape: CornerBasedShape): ModalBottomSheetStyleBuilder =
        bottomShape(shape.asStatefulValue())

    /**
     * Устанавливает форму handle [handleShape]
     * @see ModalBottomSheetStyleBuilder.handleShape
     */
    fun handleShape(handleShape: CornerBasedShape): ModalBottomSheetStyleBuilder =
        handleShape(handleShape.asStatefulValue())

    /**
     * Устанавливает формы handle [handleShape]
     * @see ModalBottomSheetStyle.handleShapes
     */
    fun handleShape(handleShape: StatefulValue<CornerBasedShape>): ModalBottomSheetStyleBuilder

    /**
     * Устанавливает отступы внутри компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable ModalBottomSheetDimensionsBuilder.() -> Unit): ModalBottomSheetStyleBuilder

    /**
     * Устанавливает положение handle относительно ModalBottomSheet
     * @see BottomSheetHandlePlacement
     */
    fun handlePlacement(handlePlacement: BottomSheetHandlePlacement): ModalBottomSheetStyleBuilder

    /**
     * Устанавливает тень [ModalBottomSheet]
     */
    fun shadow(shadow: ShadowAppearance): ModalBottomSheetStyleBuilder

    /**
     * Устанавливает стиль компонента Overlay
     */
    fun overlayStyle(overlayStyle: OverlayStyle): ModalBottomSheetStyleBuilder
}

/**
 * Цвета ModalBottomSheet
 */
@Immutable
interface ModalBottomSheetColors {

    /**
     * Цвет фона
     * @see InteractiveColor
     */
    @Deprecated("use backgroundBrush", replaceWith = ReplaceWith("backgroundBrush"))
    val backgroundColor: InteractiveColor

    /**
     * Кисти фона
     */
    val backgroundBrush: StatefulValue<Brush>

    /**
     * Цвет handle
     * @see InteractiveColor
     */
    @Deprecated("use handleBrush", replaceWith = ReplaceWith("handleBrush"))
    val handleColor: InteractiveColor

    /**
     * Кисти ручки (handle)
     */
    val handleBrush: StatefulValue<Brush>
}

/**
 * Builder для [ModalBottomSheetColors]
 */
interface ModalBottomSheetColorsBuilder {

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see ModalBottomSheetColorsBuilder.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): ModalBottomSheetColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see ModalBottomSheetColorsBuilder.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): ModalBottomSheetColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисть [backgroundColor] фона компонента.
     * @see ModalBottomSheetColorsBuilder.backgroundColor
     */
    fun backgroundColor(backgroundColor: Brush): ModalBottomSheetColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает кисти [backgroundColor] фона компонента.
     * @see ModalBottomSheetColors.backgroundBrush
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): ModalBottomSheetColorsBuilder

    /**
     * Устанавливает цвет [handleColor] ручки.
     * @see ModalBottomSheetColorsBuilder.handleColor
     * @see InteractiveColor
     */
    fun handleColor(handleColor: InteractiveColor): ModalBottomSheetColorsBuilder =
        handleColor(handleColor.asStatefulBrush())

    /**
     * Устанавливает цвет [handleColor] ручки.
     * @see ModalBottomSheetColorsBuilder.handleColor
     */
    fun handleColor(handleColor: Color): ModalBottomSheetColorsBuilder =
        handleColor(handleColor.asStatefulBrush())

    /**
     * Устанавливает кисть [handleColor] ручки.
     * @see ModalBottomSheetColorsBuilder.handleColor
     */
    fun handleColor(handleColor: Brush): ModalBottomSheetColorsBuilder =
        handleColor(handleColor.asStatefulValue())

    /**
     * Устанавливает кисти [handleColor] ручки.
     * @see ModalBottomSheetColors.handleBrush
     */
    fun handleColor(handleColor: StatefulValue<Brush>): ModalBottomSheetColorsBuilder

    /**
     * Возвращает готовый экземпляр [ModalBottomSheetColors]
     */
    fun build(): ModalBottomSheetColors

    companion object {
        /**
         * Возвращает экземпляр [ModalBottomSheetColorsBuilder]
         */
        fun builder(): ModalBottomSheetColorsBuilder = DefaultModalBottomSheetColors.Builder()
    }
}

/**
 * Внутренние отступы контента
 */
@Immutable
interface ModalBottomSheetDimensions {

    /**
     * Внутренний отступ вначале
     */
    @Deprecated("use paddingStartValues", replaceWith = ReplaceWith("paddingStartValues"))
    val paddingStart: Dp

    /**
     * Внутренний отступ вначале
     */
    val paddingStartValues: StatefulValue<Dp>

    /**
     * Внутренний отступ вконце
     */
    @Deprecated("use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
    val paddingEnd: Dp

    /**
     * Внутренний отступ вконце
     */
    val paddingEndValues: StatefulValue<Dp>

    /**
     * Внутренний отступ сверху
     */
    @Deprecated("use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
    val paddingTop: Dp

    /**
     * Внутренний отступ сверху
     */
    val paddingTopValues: StatefulValue<Dp>

    /**
     * Внутренний отступ снизу
     */
    @Deprecated("use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
    val paddingBottom: Dp

    /**
     * Внутренний отступ снизу
     */
    val paddingBottomValues: StatefulValue<Dp>

    /**
     *  Oтступ handle от края
     */
    @Deprecated("use handleOffsetValues", replaceWith = ReplaceWith("handleOffsetValues"))
    val handleOffset: Dp

    /**
     *  Oтступ handle от края
     */
    val handleOffsetValues: StatefulValue<Dp>

    /**
     *  Ширина handle
     */
    @Deprecated("use handleWidthValues", replaceWith = ReplaceWith("handleWidthValues"))
    val handleWidth: Dp

    /**
     *  Ширина handle
     */
    val handleWidthValues: StatefulValue<Dp>

    /**
     *  Высота handle
     */
    @Deprecated("use handleHeightValues", replaceWith = ReplaceWith("handleHeightValues"))
    val handleHeight: Dp

    /**
     *  Высота handle
     */
    val handleHeightValues: StatefulValue<Dp>

    /**
     * Радиус эффекта размытия для фона окна
     */
    @Deprecated("use backgroundBlurRadiusValues", replaceWith = ReplaceWith("backgroundBlurRadiusValues"))
    val backgroundBlurRadius: Dp

    /**
     * Радиус эффекта размытия для фона окна
     */
    val backgroundBlurRadiusValues: StatefulValue<Dp>
}

/**
 * Builder для [ModalBottomSheetDimensions]
 */
interface ModalBottomSheetDimensionsBuilder {

    /**
     * Устанавливает внутренний отступ [pStart] в начале
     * @see ModalBottomSheetDimensionsBuilder.paddingStart
     */
    fun paddingStart(pStart: Dp): ModalBottomSheetDimensionsBuilder =
        paddingStart(pStart.asStatefulValue())

    /**
     * Устанавливает внутренний отступ [pStart] в начале
     * @see ModalBottomSheetDimensions.paddingStartValues
     */
    fun paddingStart(pStart: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder

    /**
     * Устанавливает внутренний отступ [pEnd] в конце
     * @see ModalBottomSheetDimensionsBuilder.paddingEnd
     */
    fun paddingEnd(pEnd: Dp): ModalBottomSheetDimensionsBuilder =
        paddingEnd(pEnd.asStatefulValue())

    /**
     * Устанавливает внутренний отступ [pEnd] в конце
     * @see ModalBottomSheetDimensions.paddingEndValues
     */
    fun paddingEnd(pEnd: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder

    /**
     * Устанавливает внутренний отступ [pTop] сверху
     * @see ModalBottomSheetDimensionsBuilder.paddingTop
     */
    fun paddingTop(pTop: Dp): ModalBottomSheetDimensionsBuilder =
        paddingTop(pTop.asStatefulValue())

    /**
     * Устанавливает внутренний отступ [pTop] сверху
     * @see ModalBottomSheetDimensions.paddingTopValues
     */
    fun paddingTop(pTop: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder

    /**
     * Устанавливает внутренний отступ [pBottom] снизу
     * @see ModalBottomSheetDimensionsBuilder.paddingBottom
     */
    fun paddingBottom(pBottom: Dp): ModalBottomSheetDimensionsBuilder =
        paddingBottom(pBottom.asStatefulValue())

    /**
     * Устанавливает внутренний отступ [pBottom] снизу
     * @see ModalBottomSheetDimensions.paddingBottomValues
     */
    fun paddingBottom(pBottom: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder

    /**
     * Устанавливает отступ [hOffset] handle от края
     * @see ModalBottomSheetDimensionsBuilder.handleOffset
     */
    fun handleOffset(hOffset: Dp): ModalBottomSheetDimensionsBuilder =
        handleOffset(hOffset.asStatefulValue())

    /**
     * Устанавливает отступ [hOffset] handle от края
     * @see ModalBottomSheetDimensions.handleOffsetValues
     */
    fun handleOffset(hOffset: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder

    /**
     * Устанавливает ширину [hWidth] handle
     * @see ModalBottomSheetDimensionsBuilder.handleWidth
     */
    fun handleWidth(hWidth: Dp): ModalBottomSheetDimensionsBuilder =
        handleWidth(hWidth.asStatefulValue())

    /**
     * Устанавливает ширину [hWidth] handle
     * @see ModalBottomSheetDimensions.handleWidthValues
     */
    fun handleWidth(hWidth: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder

    /**
     * Устанавливает высоту [hHeight] handle
     * @see ModalBottomSheetDimensionsBuilder.handleHeight
     */
    fun handleHeight(hHeight: Dp): ModalBottomSheetDimensionsBuilder =
        handleHeight(hHeight.asStatefulValue())

    /**
     * Устанавливает высоту [hHeight] handle
     * @see ModalBottomSheetDimensions.handleHeightValues
     */
    fun handleHeight(hHeight: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder

    /**
     * Устанавливает радиус эффекта размытия для фона окна [radius]
     * @see ModalBottomSheetDimensionsBuilder.backgroundBlurRadius
     */
    fun backgroundBlurRadius(radius: Dp): ModalBottomSheetDimensionsBuilder =
        backgroundBlurRadius(radius.asStatefulValue())

    /**
     * Устанавливает радиус эффекта размытия для фона окна [radius]
     * @see ModalBottomSheetDimensions.backgroundBlurRadiusValues
     */
    fun backgroundBlurRadius(radius: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder

    /**
     * Возвращает готовый экземпляр [ModalBottomSheetDimensions]
     */
    fun build(): ModalBottomSheetDimensions

    companion object {
        /**
         * Возвращает экземпляр [ModalBottomSheetDimensionsBuilder]
         */
        fun builder(): ModalBottomSheetDimensionsBuilder = DefaultModalBottomSheetDimensions.Builder()
    }
}

@Immutable
private class DefaultModalBottomSheetDimensions(
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,
    override val handleOffsetValues: StatefulValue<Dp>,
    override val handleWidthValues: StatefulValue<Dp>,
    override val handleHeightValues: StatefulValue<Dp>,
    override val backgroundBlurRadiusValues: StatefulValue<Dp>,
) : ModalBottomSheetDimensions {
    @Deprecated("use paddingStartValues", replaceWith = ReplaceWith("paddingStartValues"))
    override val paddingStart: Dp = paddingStartValues.getDefaultValue()

    @Deprecated("use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
    override val paddingEnd: Dp = paddingEndValues.getDefaultValue()

    @Deprecated("use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
    override val paddingTop: Dp = paddingTopValues.getDefaultValue()

    @Deprecated("use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
    override val paddingBottom: Dp = paddingBottomValues.getDefaultValue()

    @Deprecated("use handleOffsetValues", replaceWith = ReplaceWith("handleOffsetValues"))
    override val handleOffset: Dp = handleOffsetValues.getDefaultValue()

    @Deprecated("use handleWidthValues", replaceWith = ReplaceWith("handleWidthValues"))
    override val handleWidth: Dp = handleWidthValues.getDefaultValue()

    @Deprecated("use handleHeightValues", replaceWith = ReplaceWith("handleHeightValues"))
    override val handleHeight: Dp = handleHeightValues.getDefaultValue()

    @Deprecated("use backgroundBlurRadiusValues", replaceWith = ReplaceWith("backgroundBlurRadiusValues"))
    override val backgroundBlurRadius: Dp = backgroundBlurRadiusValues.getDefaultValue()
    class Builder : ModalBottomSheetDimensionsBuilder {

        private var pStart: StatefulValue<Dp>? = null
        private var pEnd: StatefulValue<Dp>? = null
        private var pTop: StatefulValue<Dp>? = null
        private var pBottom: StatefulValue<Dp>? = null
        private var handleOffset: StatefulValue<Dp>? = null
        private var handleWidth: StatefulValue<Dp>? = null
        private var handleHeight: StatefulValue<Dp>? = null
        private var backgroundBlurRadius: StatefulValue<Dp>? = null

        override fun paddingStart(pStart: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder = apply {
            this.pStart = pStart
        }

        override fun paddingEnd(pEnd: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder = apply {
            this.pEnd = pEnd
        }

        override fun paddingTop(pTop: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder = apply {
            this.pTop = pTop
        }

        override fun paddingBottom(pBottom: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder = apply {
            this.pBottom = pBottom
        }

        override fun handleOffset(hOffset: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder = apply {
            this.handleOffset = hOffset
        }

        override fun handleWidth(hWidth: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder = apply {
            this.handleWidth = hWidth
        }

        override fun handleHeight(hHeight: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder = apply {
            this.handleHeight = hHeight
        }

        override fun backgroundBlurRadius(radius: StatefulValue<Dp>): ModalBottomSheetDimensionsBuilder = apply {
            this.backgroundBlurRadius = radius
        }

        override fun build(): ModalBottomSheetDimensions {
            return DefaultModalBottomSheetDimensions(
                paddingStartValues = pStart ?: 16.dp.asStatefulValue(),
                paddingEndValues = pEnd ?: 16.dp.asStatefulValue(),
                paddingTopValues = pTop ?: 16.dp.asStatefulValue(),
                paddingBottomValues = pBottom ?: 16.dp.asStatefulValue(),
                handleOffsetValues = handleOffset ?: 6.dp.asStatefulValue(),
                handleWidthValues = handleWidth ?: 48.dp.asStatefulValue(),
                handleHeightValues = handleHeight ?: 4.dp.asStatefulValue(),
                backgroundBlurRadiusValues = backgroundBlurRadius ?: Dp.Unspecified.asStatefulValue(),
            )
        }
    }
}

@Immutable
private class DefaultModalBottomSheetColors(
    override val backgroundBrush: StatefulValue<Brush>,
    override val handleBrush: StatefulValue<Brush>,

) : ModalBottomSheetColors {

    @Deprecated("use backgroundBrush", replaceWith = ReplaceWith("backgroundBrush"))
    override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("use handleBrush", replaceWith = ReplaceWith("handleBrush"))
    override val handleColor: InteractiveColor = Color.Transparent.asInteractive()
    class Builder : ModalBottomSheetColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var handleColor: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>): ModalBottomSheetColorsBuilder = apply {
            this.backgroundColor = backgroundColor
        }

        override fun handleColor(handleColor: StatefulValue<Brush>): ModalBottomSheetColorsBuilder = apply {
            this.handleColor = handleColor
        }

        override fun build(): ModalBottomSheetColors {
            return DefaultModalBottomSheetColors(
                backgroundBrush = backgroundColor ?: Color.Transparent.asStatefulBrush(),
                handleBrush = handleColor ?: Color.Gray.asStatefulBrush(),
            )
        }
    }
}

@Immutable
private class DefaultModalBottomSheetStyle(
    override val colors: ModalBottomSheetColors,
    override val dimensions: ModalBottomSheetDimensions,
    override val handlePlacement: BottomSheetHandlePlacement,
    override val shadow: ShadowAppearance?,
    override val overlayStyle: OverlayStyle,
    override val topShape: StatefulValue<CornerBasedShape>,
    override val shapes: StatefulValue<CornerBasedShape>,
    override val bottomShape: StatefulValue<CornerBasedShape>,
    override val handleShapes: StatefulValue<CornerBasedShape>,
) : ModalBottomSheetStyle {

    @Deprecated("use topShape and bottomShape")
    override val shape: CornerBasedShape = shapes.getDefaultValue()

    @Deprecated("use handleShapes", replaceWith = ReplaceWith("handleShapes"))
    override val handleShape: CornerBasedShape = handleShapes.getDefaultValue()
}

private class ModalBottomSheetStyleBuilderImpl(receiver: Any?) : ModalBottomSheetStyleBuilder {
    private var colorsBuilder: ModalBottomSheetColorsBuilder = ModalBottomSheetColorsBuilder.builder()
    private var shapes: StatefulValue<CornerBasedShape>? = null
    private var topShape: StatefulValue<CornerBasedShape>? = null
    private var bottomShape: StatefulValue<CornerBasedShape>? = null
    private var handleShape: StatefulValue<CornerBasedShape>? = null
    private var handlePlacement: BottomSheetHandlePlacement? = null
    private var dimensionsBuilder: ModalBottomSheetDimensionsBuilder = ModalBottomSheetDimensionsBuilder.builder()
    private var shadow: ShadowAppearance? = null
    private var overlayStyle: OverlayStyle? = null

    @Composable
    override fun colors(
        builder:
        @Composable()
        (ModalBottomSheetColorsBuilder.() -> Unit),
    ): ModalBottomSheetStyleBuilder = apply {
        this.colorsBuilder.builder()
    }

    override fun shape(shape: StatefulValue<CornerBasedShape>): ModalBottomSheetStyleBuilder = apply {
        this.shapes = shape
        this.topShape = shape
        this.bottomShape = shape
    }

    override fun topShape(shape: StatefulValue<CornerBasedShape>): ModalBottomSheetStyleBuilder = apply {
        this.topShape = shape
    }

    override fun bottomShape(shape: StatefulValue<CornerBasedShape>): ModalBottomSheetStyleBuilder = apply {
        this.bottomShape = shape
    }

    override fun handleShape(handleShape: StatefulValue<CornerBasedShape>): ModalBottomSheetStyleBuilder = apply {
        this.handleShape = handleShape
    }

    @Composable
    override fun dimensions(
        builder:
        @Composable()
        (ModalBottomSheetDimensionsBuilder.() -> Unit),
    ): ModalBottomSheetStyleBuilder = apply {
        this.dimensionsBuilder.builder()
    }

    override fun handlePlacement(handlePlacement: BottomSheetHandlePlacement): ModalBottomSheetStyleBuilder = apply {
        this.handlePlacement = handlePlacement
    }

    override fun shadow(shadow: ShadowAppearance): ModalBottomSheetStyleBuilder = apply {
        this.shadow = shadow
    }

    override fun overlayStyle(overlayStyle: OverlayStyle): ModalBottomSheetStyleBuilder = apply {
        this.overlayStyle = overlayStyle
    }

    override fun style(): ModalBottomSheetStyle {
        return DefaultModalBottomSheetStyle(
            colors = colorsBuilder.build(),
            shapes = shapes ?: noShape.asStatefulValue(),
            topShape = topShape ?: defaultShape.asStatefulValue(),
            bottomShape = bottomShape ?: noShape.asStatefulValue(),
            handleShapes = handleShape ?: RoundedCornerShape(100).asStatefulValue(),
            dimensions = dimensionsBuilder.build(),
            handlePlacement = handlePlacement ?: BottomSheetHandlePlacement.Auto,
            shadow = shadow,
            overlayStyle = overlayStyle ?: OverlayStyle.builder().style(),
        )
    }
}

private val defaultShape = RoundedCornerShape(20)
private val noShape = RoundedCornerShape(ZeroCornerSize)
