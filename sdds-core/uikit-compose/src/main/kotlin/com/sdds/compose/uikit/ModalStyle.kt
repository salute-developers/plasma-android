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
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ModalStyle] для компонента [Modal]
 */
val LocalModalStyle = compositionLocalOf { ModalStyle.builder().style() }

/**
 * Стиль компонента Modal
 */
@Immutable
interface ModalStyle : Style {

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
    val dimensions: ModalDimensions

    /**
     * Цвета компонента
     */
    val colors: ModalColors

    /**
     * Стиль [Overlay]
     */
    val overlayStyle: OverlayStyle

    companion object {
        /**
         * Возвращает экземпляр [ModalStyleBuilder]
         */
        fun builder(receiver: Any? = null): ModalStyleBuilder = DefaultModalStyle.Builder()
    }
}

/**
 * Билдер стиля [ModalStyle]
 */
interface ModalStyleBuilder : StyleBuilder<ModalStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): ModalStyleBuilder

    /**
     * Устанавливает тень [shadow] компонента
     */
    fun shadow(shadow: ShadowAppearance): ModalStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(builder: @Composable ModalColorsBuilder.() -> Unit): ModalStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(builder: @Composable ModalDimensionsBuilder.() -> Unit): ModalStyleBuilder

    /**
     * Устанавливает стиль [overlayStyle]
     */
    fun overlayStyle(overlayStyle: OverlayStyle): ModalStyleBuilder
}

private class DefaultModalStyle(
    override val shape: CornerBasedShape,
    override val shadow: ShadowAppearance,
    override val dimensions: ModalDimensions,
    override val colors: ModalColors,
    override val overlayStyle: OverlayStyle,
) : ModalStyle {

    class Builder : ModalStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var shadow: ShadowAppearance? = null
        private val colorsBuilder = ModalColors.builder()
        private val dimensionsBuilder = ModalDimensions.builder()

        private var overlayStyle: OverlayStyle? = null

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun shadow(shadow: ShadowAppearance) = apply {
            this.shadow = shadow
        }

        @Composable
        override fun colors(builder: @Composable (ModalColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (ModalDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun overlayStyle(overlayStyle: OverlayStyle) = apply {
            this.overlayStyle = overlayStyle
        }

        override fun style(): ModalStyle {
            return DefaultModalStyle(
                shape = shape ?: RoundedCornerShape(15),
                shadow = shadow ?: ShadowAppearance(),
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                overlayStyle = overlayStyle ?: OverlayStyle
                    .builder()
                    .style(),
            )
        }
    }
}

/**
 * Цвета компонента Modal
 */
@Immutable
interface ModalColors {

    /**
     * Цвет фона
     */
    val backgroundColor: StatefulValue<Brush>

    /**
     * Цвет кнопки закрытия
     */
    val closeColor: InteractiveColor

    companion object {

        /**
         * Создает экземпляр [ModalColorsBuilder]
         */
        fun builder(): ModalColorsBuilder = DefaultModalColors.Builder()
    }
}

/**
 * Builder для [ModalColors]
 */
interface ModalColorsBuilder {
    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Brush): ModalColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): ModalColorsBuilder

    /**
     * Устанавливает цвет кнопки закрытия [closeColor].
     */
    fun closeColor(closeColor: Color): ModalColorsBuilder =
        closeColor(closeColor.asInteractive())

    /**
     * Устанавливает цвет кнопки закрытия [closeColor].
     */
    fun closeColor(closeColor: InteractiveColor): ModalColorsBuilder

    /**
     * Создает экземпляр [ModalColors]
     */
    fun build(): ModalColors
}

@Immutable
private data class DefaultModalColors(
    override val backgroundColor: StatefulValue<Brush>,
    override val closeColor: InteractiveColor,
) : ModalColors {

    class Builder : ModalColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var closeColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun closeColor(closeColor: InteractiveColor) = apply {
            this.closeColor = closeColor
        }

        override fun build(): ModalColors {
            return DefaultModalColors(
                backgroundColor = backgroundColor ?: SolidColor(Color.White).asStatefulValue(),
                closeColor = Color.DarkGray.asInteractive(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface ModalDimensions {

    /**
     * Размер иконки закрытия
     */
    val closeSize: Dp

    /**
     * Отступ в начале
     */
    val paddingStart: Dp

    /**
     * Отступ в конце
     */
    val paddingEnd: Dp

    /**
     * Отступ сверху
     */
    val paddingTop: Dp

    /**
     * Отступ снизу
     */
    val paddingBottom: Dp

    companion object {
        /**
         * Создает экземпляр [ModalDimensionsBuilder]
         */
        fun builder(): ModalDimensionsBuilder = DefaultModalDimensions.Builder()
    }
}

/**
 * Builder для [ModalDimensions]
 */
interface ModalDimensionsBuilder {
    /**
     * Устанавливает размер иконки закрытия [closeSize]
     */
    fun closeSize(closeSize: Dp): ModalDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): ModalDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): ModalDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): ModalDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): ModalDimensionsBuilder

    /**
     * Создает экземпляр [ModalDimensions]
     */
    fun build(): ModalDimensions
}

private class DefaultModalDimensions(
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val closeSize: Dp,
) : ModalDimensions {

    class Builder : ModalDimensionsBuilder {

        private var closeSize: Dp? = null
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var paddingTop: Dp? = null
        private var paddingBottom: Dp? = null

        override fun closeSize(closeSize: Dp) = apply {
            this.closeSize = closeSize
        }

        override fun paddingStart(paddingStart: Dp) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: Dp) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: Dp) = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: Dp) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun build(): ModalDimensions {
            return DefaultModalDimensions(
                paddingStart = paddingStart ?: 32.dp,
                paddingEnd = paddingEnd ?: 32.dp,
                paddingTop = paddingTop ?: 32.dp,
                paddingBottom = paddingBottom ?: 32.dp,
                closeSize = closeSize ?: 24.dp,
            )
        }
    }
}
