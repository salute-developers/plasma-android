package com.sdds.compose.uikit

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.internal.AvatarDefaults
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [AvatarStyle] для компонента [Avatar]
 */
val LocalAvatarStyle = compositionLocalOf { AvatarStyle.builder().style() }

/**
 * Стиль компонента [Avatar]
 */
interface AvatarStyle : Style {

    /**
     * Форма компонента
     */
    val shape: Shape

    /**
     * Цвета компонента
     */
    val colors: AvatarColors

    /**
     * Размеры и отступы компонента
     */
    @Deprecated("Use dimensionValues", ReplaceWith("dimensionValues"))
    val dimensions: AvatarDimensions

    /**
     * Стиль текста
     */
    val textStyle: TextStyle

    /**
     * Стиль бейджа
     */
    val badgeStyle: BadgeStyle?

    /**
     * Стиль счетчика
     */
    val counterStyle: CounterStyle?

    /**
     * Стиль индикатора статуса
     */
    val statusStyle: IndicatorStyle?

    /**
     * Размеры и отступы компонента
     */
    val dimensionValues: AvatarDimensionValues

    companion object {

        /**
         * Возвращает экземпляр [AvatarStyleBuilder]
         */
        fun builder(receiver: Any? = null): AvatarStyleBuilder = DefaultAvatarStyle.Builder(receiver)
    }
}

/**
 * Builder для [AvatarStyle]
 */
interface AvatarStyleBuilder : StyleBuilder<AvatarStyle> {

    /**
     * Устанавливает форму [shape] компоненту
     * @see AvatarStyle.shape
     */
    fun shape(shape: Shape): AvatarStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see AvatarStyle.colors
     */
    @Composable
    fun colors(builder: @Composable AvatarColorsBuilder.() -> Unit): AvatarStyleBuilder

    /**
     * Устанавливает размеры и отступы [dimensions]
     * @see AvatarStyle.dimensions
     */
    @Deprecated("Use dimensions(AvatarDimensionsBuilder)", ReplaceWith("dimensions { }"))
    fun dimensions(dimensions: AvatarDimensions): AvatarStyleBuilder

    /**
     * Устанавливает размеры и отступы [dimensions]
     * @see AvatarStyle.dimensionValues
     */
    @Composable
    fun dimensions(builder: @Composable AvatarDimensionsBuilder.() -> Unit): AvatarStyleBuilder

    /**
     * Устанавливает стиль текста [textStyle]
     * @see AvatarStyle.textStyle
     */
    fun textStyle(textStyle: TextStyle): AvatarStyleBuilder

    /**
     * Устанавливает стиль индикатора статуса [statusStyle]
     */
    fun statusStyle(statusStyle: IndicatorStyle): AvatarStyleBuilder

    /**
     * Устанавливает стиль бейджа [badgeStyle]
     */
    fun badgeStyle(badgeStyle: BadgeStyle): AvatarStyleBuilder

    /**
     * Устанавливает стиль счетчика [counterStyle]
     */
    fun counterStyle(counterStyle: CounterStyle): AvatarStyleBuilder
}

/**
 * Цвета компонента [Avatar]
 */
interface AvatarColors {

    /**
     * Цвет иконки действия
     */
    val actionColor: Color

    /**
     * Цвет фона иконки действия
     */
    val actionScrimColor: Color

    /**
     * Цвет текста
     */
    @Deprecated("Use textColors or textBrushes")
    val textColor: Brush

    /**
     * Кисти для отрисовки текста
     */
    val textBrushes: StatefulValue<Brush>?

    /**
     * Цвета текста
     */
    val textColors: InteractiveColor?

    /**
     * Цвет фона
     */
    @Deprecated("Use backgroundBrushes: StatefulValue<Brush>>")
    val backgroundColor: List<Brush>
        get() = emptyList()

    /**
     * Кисти фона
     */
    val backgroundBrushes: StatefulValue<Brush>?

    /**
     * Цвета фона. Используются, если [backgroundBrushes] == `null`
     */
    val backgroundColors: InteractiveColor?

    /**
     * Прозрачность фона
     */
    @Deprecated("The property backgroundAlpha is unused")
    val backgroundAlpha: Float
        get() = 1f

    /**
     * Возвращает цвет статуса [status]
     * @see AvatarStatus
     */
    @Composable
    @Deprecated("The results of this function is unused")
    fun statusColor(status: AvatarStatus): State<Color>

    companion object {

        /**
         * Возвращает экземпляр [AvatarColorsBuilder]
         */
        fun builder(): AvatarColorsBuilder = DefaultAvatarColors.Builder()
    }
}

/**
 * Builder для [AvatarColors]
 */
interface AvatarColorsBuilder {

    /**
     * Устанавливает цвет [activeStatusColor] для статуса [AvatarStatus.Active]
     * @see AvatarColors.statusColor
     */
    @Deprecated("Use statusStyle", replaceWith = ReplaceWith("statusStyle()"))
    fun activeStatusColor(activeStatusColor: Color): AvatarColorsBuilder

    /**
     * Устанавливает цвет [inactiveStatusColor] для статуса [AvatarStatus.Inactive]
     * @see AvatarColors.statusColor
     */
    @Deprecated("Use statusStyle", replaceWith = ReplaceWith("statusStyle()"))
    fun inactiveStatusColor(inactiveStatusColor: Color): AvatarColorsBuilder

    /**
     * Устанавливает цвет [actionColor] иконки действия
     * @see AvatarColors.actionColor
     */
    fun actionColor(actionColor: Color): AvatarColorsBuilder

    /**
     * Устанавливает цвет фона [actionScrimColor] иконки действия
     * @see AvatarColors.actionScrimColor
     */
    fun actionScrimColor(actionScrimColor: Color): AvatarColorsBuilder

    /**
     * Устанавливает цвет текста [textColor]
     * @see AvatarColors.textColor
     */
    fun textColor(textColor: Color): AvatarColorsBuilder =
        textColor(SolidColor(textColor))

    /**
     * Устанавливает цвет (или градиент) текста [textColor]
     * @see AvatarColors.textColor
     */
    fun textColor(textColor: Brush): AvatarColorsBuilder

    /**
     * Устанавливает цвет (или градиент) текста [textColor]
     * @see AvatarColors.textColor
     */
    fun textColor(textColor: StatefulValue<Brush>): AvatarColorsBuilder

    /**
     * Устанавливает цвет (или градиент) текста [textColor]
     * @see AvatarColors.textColor
     */
    fun textColor(textColor: InteractiveColor): AvatarColorsBuilder

    /**
     * Устанавливает цвет фона [backgroundColor]
     * @see AvatarColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): AvatarColorsBuilder = this

    /**
     * Устанавливает цвет фона [backgroundColor]
     * @see AvatarColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Brush): AvatarColorsBuilder = this

    /**
     * Устанавливает цвет фона [backgroundColor]
     * @see AvatarColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: List<Brush>): AvatarColorsBuilder = this

    /**
     * Устанавливает цвет фона [backgroundColor]
     * @see AvatarColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): AvatarColorsBuilder = this

    /**
     * Устанавливает цвет фона [backgroundColor]
     * @see AvatarColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): AvatarColorsBuilder = this

    /**
     * Устанавливает прозрачность фона [alpha]
     * @see AvatarColors.backgroundAlpha
     */
    @Deprecated("Using backgroundAlpha has no effect")
    fun backgroundAlpha(alpha: Float): AvatarColorsBuilder = this

    /**
     * Создает экземпляр [AvatarColors]
     */
    fun build(): AvatarColors
}

/**
 * Размеры и отступы [Avatar]
 * @property statusOffsetX
 * @property statusOffsetY
 * @property width ширина аватара
 * @property height высота аватара
 */
@Immutable
interface AvatarDimensionValues {
    /**
     * Смещение статуса по горизонтали
     */
    val statusOffsetX: Dp

    /**
     * Смещение статуса по вертикали
     */
    val statusOffsetY: Dp

    /**
     * Ширина аватара
     */
    val width: Dp

    /**
     * Высота аватара
     */
    val height: Dp
}

/**
 * Билдер для [AvatarDimensionValues]
 */
interface AvatarDimensionsBuilder {

    /**
     * Устанавливает смещение статуса по горизонтали [statusOffsetX]
     */
    fun statusOffsetX(statusOffsetX: Dp): AvatarDimensionsBuilder

    /**
     * Устанавливает смещение статуса по вертикали [statusOffsetY]
     */
    fun statusOffsetY(statusOffsetY: Dp): AvatarDimensionsBuilder

    /**
     * Устанавливает ширину аватара [width]
     */
    fun width(width: Dp): AvatarDimensionsBuilder

    /**
     * Устанавливает высоту аватара [height]
     */
    fun height(height: Dp): AvatarDimensionsBuilder

    /**
     * Возвращает [AvatarDimensionValues]
     */
    fun build(): AvatarDimensionValues

    companion object {

        /**
         * Возвращает [AvatarDimensionsBuilder]
         */
        fun builder(): AvatarDimensionsBuilder = DefaultAvatarDimensionValues.Builder()
    }
}

/**
 * Размеры и отступы компонента [Avatar]
 * @property statusSize размера статуса
 * @property statusOffset смещение статуса относительно нижнего правого угла
 * @property actionSize размер иконки действия
 * @property size размер компонента [Avatar]
 */
@Immutable
@Deprecated("Use AvatarDimensionBuilder and AvatarDimensionsHolder")
data class AvatarDimensions(
    val statusSize: Dp = 8.dp,
    val statusOffset: Offset = Offset.Zero,
    val actionSize: Size? = null,
    val size: Dp? = null,
)

@Immutable
private data class DefaultAvatarStyle(
    override val shape: Shape,
    override val colors: AvatarColors,
    override val textStyle: TextStyle,
    override val badgeStyle: BadgeStyle?,
    override val counterStyle: CounterStyle?,
    override val statusStyle: IndicatorStyle?,
    override val dimensionValues: AvatarDimensionValues,
) : AvatarStyle {

    @Suppress("OVERRIDE_DEPRECATION")
    override val dimensions: AvatarDimensions = AvatarDimensions()

    class Builder(override val receiver: Any?) : AvatarStyleBuilder {
        private var shape: Shape? = null
        private var colorsBuilder: AvatarColorsBuilder = AvatarColors.builder()
        private var dimensionsBuilder: AvatarDimensionsBuilder = AvatarDimensionsBuilder.builder()
        private var textStyle: TextStyle? = null
        private var badgeStyle: BadgeStyle? = null
        private var counterStyle: CounterStyle? = null
        private var statusStyle: IndicatorStyle? = null

        override fun shape(shape: Shape) = apply {
            this.shape = shape
        }

        @Composable
        override fun colors(
            builder:
            @Composable()
            (AvatarColorsBuilder.() -> Unit),
        ) = apply {
            this.colorsBuilder.builder()
        }

        @Deprecated("Use dimensions(AvatarDimensionsBuilder)", replaceWith = ReplaceWith("dimensions { }"))
        override fun dimensions(dimensions: AvatarDimensions) = apply {
            dimensionsBuilder.apply {
                width(dimensions.size ?: 0.dp)
                height(dimensions.size ?: 0.dp)
            }
        }

        @Composable
        override fun dimensions(builder: @Composable AvatarDimensionsBuilder.() -> Unit): AvatarStyleBuilder = apply {
            this.dimensionsBuilder.builder()
        }

        override fun textStyle(textStyle: TextStyle) = apply {
            this.textStyle = textStyle
        }

        override fun statusStyle(statusStyle: IndicatorStyle): AvatarStyleBuilder = apply {
            this.statusStyle = statusStyle
        }

        override fun badgeStyle(badgeStyle: BadgeStyle): AvatarStyleBuilder = apply {
            this.badgeStyle = badgeStyle
        }

        override fun counterStyle(counterStyle: CounterStyle): AvatarStyleBuilder = apply {
            this.counterStyle = counterStyle
        }

        override fun style(): AvatarStyle =
            DefaultAvatarStyle(
                shape = shape ?: RoundedCornerShape(50),
                colors = colorsBuilder.build(),
                textStyle = textStyle ?: TextStyle.Default,
                badgeStyle = badgeStyle,
                counterStyle = counterStyle,
                statusStyle = statusStyle,
                dimensionValues = dimensionsBuilder.build(),
            )
    }
}

@Immutable
private data class DefaultAvatarColors(
    private val activeStatusColor: Color,
    private val inactiveStatusColor: Color,
    override val actionColor: Color,
    override val actionScrimColor: Color,
    override val textBrushes: StatefulValue<Brush>?,
    override val textColors: InteractiveColor?,
    override val backgroundBrushes: StatefulValue<Brush>?,
    override val backgroundColors: InteractiveColor?,
) : AvatarColors {

    @Deprecated("Use background: StatefulValue<Brush>")
    override val backgroundColor: List<Brush> = emptyList()

    @Deprecated("The property backgroundAlpha is unused")
    override val backgroundAlpha: Float = 0.2f

    @Deprecated("Use textColors or textBrushes")
    override val textColor: Brush = textBrushes?.getDefaultValue() ?: AvatarDefaults.defaultBrush

    @Deprecated("The results of this function is unused")
    @Composable
    override fun statusColor(status: AvatarStatus): State<Color> {
        val color = when (status) {
            AvatarStatus.None -> Color.Transparent
            AvatarStatus.Active -> activeStatusColor
            AvatarStatus.Inactive -> inactiveStatusColor
        }
        return rememberUpdatedState(newValue = color)
    }

    class Builder : AvatarColorsBuilder {

        private var activeStatusColor: Color? = null
        private var inactiveStatusColor: Color? = null
        private var actionColor: Color? = null
        private var actionScrimColor: Color? = null
        private var textBrush: StatefulValue<Brush>? = null
        private var textColor: InteractiveColor? = null
        private var backgroundBrushes: StatefulValue<Brush>? = null
        private var backgroundColors: InteractiveColor? = null
        private var backgroundAlpha: Float? = null

        override fun backgroundColor(backgroundColor: Color): AvatarColorsBuilder = apply {
            backgroundColor(backgroundColor.asInteractive())
        }

        override fun backgroundColor(backgroundColor: InteractiveColor): AvatarColorsBuilder = apply {
            this.backgroundColors = backgroundColor
        }

        override fun backgroundColor(backgroundColor: Brush): AvatarColorsBuilder = apply {
            backgroundColor(backgroundColor.asStatefulValue())
        }

        override fun backgroundColor(backgroundColor: List<Brush>): AvatarColorsBuilder =
            backgroundColor(backgroundColor.filterIsInstance<ShaderBrush>().asLayered())

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>): AvatarColorsBuilder = apply {
            this.backgroundBrushes = backgroundColor
        }

        @Deprecated("Using backgroundAlpha has no effect")
        override fun backgroundAlpha(alpha: Float): AvatarColorsBuilder = this

        @Deprecated("Use statusStyle", replaceWith = ReplaceWith("statusStyle()"))
        override fun activeStatusColor(activeStatusColor: Color) = apply {
            this.activeStatusColor = activeStatusColor
        }

        @Deprecated("Use statusStyle", replaceWith = ReplaceWith("statusStyle()"))
        override fun inactiveStatusColor(inactiveStatusColor: Color) = apply {
            this.inactiveStatusColor = inactiveStatusColor
        }

        override fun actionColor(actionColor: Color) = apply {
            this.actionColor = actionColor
        }

        override fun actionScrimColor(actionScrimColor: Color) = apply {
            this.actionScrimColor = actionScrimColor
        }

        override fun textColor(textColor: Brush) =
            textColor(textColor.asStatefulValue())

        override fun textColor(textColor: StatefulValue<Brush>): AvatarColorsBuilder = apply {
            this.textBrush = textColor
        }

        override fun textColor(textColor: InteractiveColor): AvatarColorsBuilder = apply {
            this.textColor = textColor
        }

        override fun build(): AvatarColors =
            DefaultAvatarColors(
                activeStatusColor = activeStatusColor ?: Color.Green,
                inactiveStatusColor = inactiveStatusColor ?: Color.DarkGray,
                actionColor = actionColor ?: Color.White,
                actionScrimColor = actionScrimColor ?: AvatarDefaults.DefaultScrimColor,
                textBrushes = textBrush,
                textColors = textColor,
                backgroundBrushes = backgroundBrushes,
                backgroundColors = backgroundColors,
            )
    }
}

@Immutable
private data class DefaultAvatarDimensionValues(
    override val statusOffsetX: Dp = 0.dp,
    override val statusOffsetY: Dp = 0.dp,
    override val width: Dp = 0.dp,
    override val height: Dp = 0.dp,
) : AvatarDimensionValues {

    class Builder : AvatarDimensionsBuilder {
        private var statusOffsetX: Dp = 0.dp
        private var statusOffsetY: Dp = 0.dp
        private var width: Dp = 0.dp
        private var height: Dp = 0.dp

        override fun statusOffsetX(statusOffsetX: Dp): AvatarDimensionsBuilder = apply {
            this.statusOffsetX = statusOffsetX
        }

        override fun statusOffsetY(statusOffsetY: Dp): AvatarDimensionsBuilder = apply {
            this.statusOffsetY = statusOffsetY
        }

        override fun width(width: Dp): AvatarDimensionsBuilder = apply {
            this.width = width
        }

        override fun height(height: Dp): AvatarDimensionsBuilder = apply {
            this.height = height
        }

        override fun build(): AvatarDimensionValues {
            return DefaultAvatarDimensionValues(
                statusOffsetX,
                statusOffsetY,
                width,
                height,
            )
        }
    }
}
