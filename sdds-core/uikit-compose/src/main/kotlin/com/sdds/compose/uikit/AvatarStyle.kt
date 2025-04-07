package com.sdds.compose.uikit

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
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
@Stable
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
    val dimensions: AvatarDimensions

    /**
     * Стиль текста
     */
    val textStyle: TextStyle

    companion object {

        /**
         * Возвращает экземпляр [AvatarStyleBuilder]
         */
        fun builder(): AvatarStyleBuilder = DefaultAvatarStyle.Builder()
    }
}

/**
 * Builder для [AvatarStyle]
 */
@Stable
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
    fun dimensions(dimensions: AvatarDimensions): AvatarStyleBuilder

    /**
     * Устанавливает стиль текста [textStyle]
     * @see AvatarStyle.textStyle
     */
    fun textStyle(textStyle: TextStyle): AvatarStyleBuilder
}

/**
 * Цвета компонента [Avatar]
 */
@Stable
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
    val textColor: Brush

    /**
     * Цвет фона
     */
    val backgroundColor: List<Brush>
        get() = emptyList()

    /**
     * Прозрачность фона
     */
    val backgroundAlpha: Float
        get() = 1f

    /**
     * Возвращает цвет статуса [status]
     * @see AvatarStatus
     */
    @Composable
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
@Stable
interface AvatarColorsBuilder {

    /**
     * Устанавливает цвет [activeStatusColor] для статуса [AvatarStatus.Active]
     * @see AvatarColors.statusColor
     */
    fun activeStatusColor(activeStatusColor: Color): AvatarColorsBuilder

    /**
     * Устанавливает цвет [inactiveStatusColor] для статуса [AvatarStatus.Inactive]
     * @see AvatarColors.statusColor
     */
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
     * Устанавливает прозрачность фона [alpha]
     * @see AvatarColors.backgroundAlpha
     */
    fun backgroundAlpha(alpha: Float): AvatarColorsBuilder = this

    /**
     * Создает экземпляр [AvatarColors]
     */
    fun build(): AvatarColors
}

/**
 * Размеры и отступы компонента [Avatar]
 * @property statusSize размера статуса
 * @property statusOffset смещение статуса относительно нижнего правого угла
 * @property actionSize размер иконки действия
 * @property size размер компонента [Avatar]
 */
@Immutable
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
    override val dimensions: AvatarDimensions,
    override val textStyle: TextStyle,
) : AvatarStyle {

    class Builder : AvatarStyleBuilder {
        private var shape: Shape? = null
        private var colorsBuilder: AvatarColorsBuilder = AvatarColors.builder()
        private var dimensions: AvatarDimensions? = null
        private var textStyle: TextStyle? = null

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

        override fun dimensions(dimensions: AvatarDimensions) = apply {
            this.dimensions = dimensions
        }

        override fun textStyle(textStyle: TextStyle) = apply {
            this.textStyle = textStyle
        }

        override fun style(): AvatarStyle =
            DefaultAvatarStyle(
                shape = shape ?: RoundedCornerShape(50),
                colors = colorsBuilder.build(),
                dimensions = dimensions ?: AvatarDimensions(),
                textStyle = textStyle ?: TextStyle.Default,
            )
    }
}

@Immutable
private data class DefaultAvatarColors(
    private val activeStatusColor: Color,
    private val inactiveStatusColor: Color,
    override val actionColor: Color,
    override val actionScrimColor: Color,
    override val textColor: Brush,
    override val backgroundColor: List<Brush>,
    override val backgroundAlpha: Float,
) : AvatarColors {

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
        private var textColor: Brush? = null
        private var backgroundColor: List<Brush>? = null
        private var backgroundAlpha: Float? = null

        override fun backgroundColor(backgroundColor: Color): AvatarColorsBuilder = apply {
            backgroundColor(SolidColor(backgroundColor))
        }

        override fun backgroundColor(backgroundColor: Brush): AvatarColorsBuilder = apply {
            backgroundColor(listOf(backgroundColor))
        }

        override fun backgroundColor(backgroundColor: List<Brush>): AvatarColorsBuilder = apply {
            this.backgroundColor = backgroundColor
        }

        override fun backgroundAlpha(alpha: Float): AvatarColorsBuilder = apply {
            this.backgroundAlpha = alpha
        }

        override fun activeStatusColor(activeStatusColor: Color) = apply {
            this.activeStatusColor = activeStatusColor
        }

        override fun inactiveStatusColor(inactiveStatusColor: Color) = apply {
            this.inactiveStatusColor = inactiveStatusColor
        }

        override fun actionColor(actionColor: Color) = apply {
            this.actionColor = actionColor
        }

        override fun actionScrimColor(actionScrimColor: Color) = apply {
            this.actionScrimColor = actionScrimColor
        }

        override fun textColor(textColor: Brush) = apply {
            this.textColor = textColor
        }

        override fun build(): AvatarColors =
            DefaultAvatarColors(
                activeStatusColor = activeStatusColor ?: Color.Green,
                inactiveStatusColor = inactiveStatusColor ?: Color.DarkGray,
                actionColor = actionColor ?: Color.White,
                actionScrimColor = actionScrimColor ?: AvatarDefaults.DefaultScrimColor,
                textColor = textColor ?: AvatarDefaults.defaultBrush,
                backgroundColor = backgroundColor ?: AvatarDefaults.defaultBackground,
                backgroundAlpha = backgroundAlpha ?: AvatarDefaults.BackgroundOpacity,
            )
    }
}
