package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
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
    val shape: CornerBasedShape

    /**
     * Форма handle
     * @see CornerBasedShape
     */
    val handleShape: CornerBasedShape

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
    fun shape(shape: CornerBasedShape): ModalBottomSheetStyleBuilder

    /**
     * Устанавливает форму handle [shape]
     * @see ModalBottomSheetStyle.handleShape
     */
    fun handleShape(handleShape: CornerBasedShape): ModalBottomSheetStyleBuilder

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
    val backgroundColor: InteractiveColor

    /**
     * Цвет handle
     * @see InteractiveColor
     */
    val handleColor: InteractiveColor
}

/**
 * Builder для [ModalBottomSheetColors]
 */
interface ModalBottomSheetColorsBuilder {

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see ModalBottomSheetColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): ModalBottomSheetColorsBuilder

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see ModalBottomSheetColorsBuilder.backgroundColor
     * @see ModalBottomSheetColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): ModalBottomSheetColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет [handleColor] фона компонента.
     * @see ModalBottomSheetColors.handleColor
     * @see InteractiveColor
     */
    fun handleColor(handleColor: InteractiveColor): ModalBottomSheetColorsBuilder

    /**
     * Устанавливает цвет [handleColor] фона компонента.
     * @see ModalBottomSheetColorsBuilder.handleColor
     * @see ModalBottomSheetColors.handleColor
     */
    fun handleColor(handleColor: Color): ModalBottomSheetColorsBuilder =
        handleColor(handleColor.asInteractive())

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
    val paddingStart: Dp

    /**
     * Внутренний отступ вконце
     */
    val paddingEnd: Dp

    /**
     * Внутренний отступ сверху
     */
    val paddingTop: Dp

    /**
     * Внутренний отступ снизу
     */
    val paddingBottom: Dp

    /**
     *  Oтступ handle от края
     */
    val handleOffset: Dp

    /**
     *  Ширина handle
     */
    val handleWidth: Dp

    /**
     *  Высота handle
     */
    val handleHeight: Dp

    /**
     * Радиус эффекта размытия для фона окна
     */
    val backgroundBlurRadius: Dp
}

/**
 * Builder для [ModalBottomSheetDimensions]
 */
interface ModalBottomSheetDimensionsBuilder {

    /**
     * Устанавливает внутренний отступ вначале
     */
    fun paddingStart(pStart: Dp): ModalBottomSheetDimensionsBuilder

    /**
     * Устанавливает внутренний отступ вконце
     */
    fun paddingEnd(pEnd: Dp): ModalBottomSheetDimensionsBuilder

    /**
     * Устанавливает внутренний отступ сверху
     */
    fun paddingTop(pTop: Dp): ModalBottomSheetDimensionsBuilder

    /**
     * Устанавливает внутренний отступ снизу
     */
    fun paddingBottom(pBottom: Dp): ModalBottomSheetDimensionsBuilder

    /**
     * Устанавливает отступ handle от края
     */
    fun handleOffset(hOffset: Dp): ModalBottomSheetDimensionsBuilder

    /**
     * Устанавливает ширину handle
     */
    fun handleWidth(hWidth: Dp): ModalBottomSheetDimensionsBuilder

    /**
     * Устанавливает высоту handle
     */
    fun handleHeight(hHeight: Dp): ModalBottomSheetDimensionsBuilder

    /**
     * Устанавливает радиус эффекта размытия для фона окна [radius]
     */
    fun backgroundBlurRadius(radius: Dp): ModalBottomSheetDimensionsBuilder

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
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val handleOffset: Dp,
    override val handleWidth: Dp,
    override val handleHeight: Dp,
    override val backgroundBlurRadius: Dp,
) : ModalBottomSheetDimensions {
    class Builder : ModalBottomSheetDimensionsBuilder {

        private var pStart: Dp? = null
        private var pEnd: Dp? = null
        private var pTop: Dp? = null
        private var pBottom: Dp? = null
        private var handleOffset: Dp? = null
        private var handleWidth: Dp? = null
        private var handleHeight: Dp? = null
        private var backgroundBlurRadius: Dp? = null

        override fun paddingStart(pStart: Dp): ModalBottomSheetDimensionsBuilder = apply {
            this.pStart = pStart
        }

        override fun paddingEnd(pEnd: Dp): ModalBottomSheetDimensionsBuilder = apply {
            this.pEnd = pEnd
        }

        override fun paddingTop(pTop: Dp): ModalBottomSheetDimensionsBuilder = apply {
            this.pTop = pTop
        }

        override fun paddingBottom(pBottom: Dp): ModalBottomSheetDimensionsBuilder = apply {
            this.pBottom = pBottom
        }

        override fun handleOffset(hOffset: Dp): ModalBottomSheetDimensionsBuilder = apply {
            this.handleOffset = hOffset
        }

        override fun handleWidth(hWidth: Dp): ModalBottomSheetDimensionsBuilder = apply {
            this.handleWidth = hWidth
        }

        override fun handleHeight(hHeight: Dp): ModalBottomSheetDimensionsBuilder = apply {
            this.handleHeight = hHeight
        }

        override fun backgroundBlurRadius(radius: Dp): ModalBottomSheetDimensionsBuilder = apply {
            this.backgroundBlurRadius = radius
        }

        override fun build(): ModalBottomSheetDimensions {
            return DefaultModalBottomSheetDimensions(
                paddingStart = pStart ?: 16.dp,
                paddingEnd = pEnd ?: 16.dp,
                paddingTop = pTop ?: 16.dp,
                paddingBottom = pBottom ?: 16.dp,
                handleOffset = handleOffset ?: 6.dp,
                handleWidth = handleWidth ?: 48.dp,
                handleHeight = handleHeight ?: 4.dp,
                backgroundBlurRadius = backgroundBlurRadius ?: Dp.Unspecified,
            )
        }
    }
}

@Immutable
private class DefaultModalBottomSheetColors(
    override val backgroundColor: InteractiveColor,
    override val handleColor: InteractiveColor,
) : ModalBottomSheetColors {
    class Builder : ModalBottomSheetColorsBuilder {
        private var backgroundColor: InteractiveColor? = null
        private var handleColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: InteractiveColor): ModalBottomSheetColorsBuilder = apply {
            this.backgroundColor = backgroundColor
        }

        override fun handleColor(handleColor: InteractiveColor): ModalBottomSheetColorsBuilder = apply {
            this.handleColor = handleColor
        }

        override fun build(): ModalBottomSheetColors {
            return DefaultModalBottomSheetColors(
                backgroundColor = backgroundColor ?: Color.Transparent.asInteractive(),
                handleColor = handleColor ?: Color.Gray.asInteractive(),
            )
        }
    }
}

@Immutable
private class DefaultModalBottomSheetStyle(
    override val colors: ModalBottomSheetColors,
    override val shape: CornerBasedShape,
    override val dimensions: ModalBottomSheetDimensions,
    override val handleShape: CornerBasedShape,
    override val handlePlacement: BottomSheetHandlePlacement,
    override val shadow: ShadowAppearance?,
    override val overlayStyle: OverlayStyle,
) : ModalBottomSheetStyle

private class ModalBottomSheetStyleBuilderImpl(receiver: Any?) : ModalBottomSheetStyleBuilder {
    private var colorsBuilder: ModalBottomSheetColorsBuilder = ModalBottomSheetColorsBuilder.builder()
    private var shape: CornerBasedShape? = null
    private var handleShape: CornerBasedShape? = null
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

    override fun shape(shape: CornerBasedShape): ModalBottomSheetStyleBuilder = apply {
        this.shape = shape
    }

    override fun handleShape(handleShape: CornerBasedShape): ModalBottomSheetStyleBuilder = apply {
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
            shape = shape ?: RoundedCornerShape(20),
            handleShape = handleShape ?: RoundedCornerShape(100),
            dimensions = dimensionsBuilder.build(),
            handlePlacement = handlePlacement ?: BottomSheetHandlePlacement.Auto,
            shadow = shadow,
            overlayStyle = overlayStyle ?: OverlayStyle.builder().style(),
        )
    }
}
