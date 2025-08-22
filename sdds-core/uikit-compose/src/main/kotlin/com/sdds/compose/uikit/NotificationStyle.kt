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
 * CompositionLocal c [NotificationStyle] для компонента [Notification]
 */
val LocalNotificationStyle = compositionLocalOf { NotificationStyle.builder().style() }

/**
 * Стиль компонента Notification
 */
@Immutable
interface NotificationStyle : Style {

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
    val dimensions: NotificationDimensions

    /**
     * Цвета компонента
     */
    val colors: NotificationColors

    /**
     * Выравнивание иконки закрытия
     */
    val closeAlignment: NotificationCloseAlignment

    /**
     * Стиль контента [NotificationContentStyle]
     */
    val notificationContentStyle: NotificationContentStyle

    companion object {
        /**
         * Возвращает экземпляр [NotificationStyleBuilder]
         */
        fun builder(receiver: Any? = null): NotificationStyleBuilder = DefaultNotificationStyle.Builder()
    }
}

/**
 * Билдер стиля [NotificationStyle]
 */
interface NotificationStyleBuilder : StyleBuilder<NotificationStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): NotificationStyleBuilder

    /**
     * Устанавливает тень [shadow] компонента
     */
    fun shadow(shadow: ShadowAppearance): NotificationStyleBuilder

    /**
     * Устанавливает стиль контента [notificationContentStyle]
     */
    fun notificationContentStyle(notificationContentStyle: NotificationContentStyle): NotificationStyleBuilder

    /**
     * Устанавливает выравнивание [closeAlignment] иконки закрытия
     */
    fun closeAlignment(closeAlignment: NotificationCloseAlignment): NotificationStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(builder: @Composable NotificationColorsBuilder.() -> Unit): NotificationStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(builder: @Composable NotificationDimensionsBuilder.() -> Unit): NotificationStyleBuilder
}

private class DefaultNotificationStyle(
    override val shape: CornerBasedShape,
    override val shadow: ShadowAppearance,
    override val dimensions: NotificationDimensions,
    override val colors: NotificationColors,
    override val closeAlignment: NotificationCloseAlignment,
    override val notificationContentStyle: NotificationContentStyle,
) : NotificationStyle {

    class Builder : NotificationStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var shadow: ShadowAppearance? = null
        private var closeAlignment: NotificationCloseAlignment? = null
        private val colorsBuilder = NotificationColors.builder()
        private val dimensionsBuilder = NotificationDimensions.builder()
        private var notificationContentStyle: NotificationContentStyle? = null

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun shadow(shadow: ShadowAppearance) = apply {
            this.shadow = shadow
        }

        override fun notificationContentStyle(notificationContentStyle: NotificationContentStyle) = apply {
            this.notificationContentStyle = notificationContentStyle
        }

        override fun closeAlignment(closeAlignment: NotificationCloseAlignment) = apply {
            this.closeAlignment = closeAlignment
        }

        @Composable
        override fun colors(builder: @Composable (NotificationColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (NotificationDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun style(): NotificationStyle {
            return DefaultNotificationStyle(
                shape = shape ?: RoundedCornerShape(15),
                shadow = shadow ?: ShadowAppearance(),
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                closeAlignment = NotificationCloseAlignment.TopEnd,
                notificationContentStyle = notificationContentStyle ?: NotificationContentStyle.builder().style(),
            )
        }
    }
}

/**
 * Цвета компонента Notification
 */
@Immutable
interface NotificationColors {

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
         * Создает экземпляр [NotificationColorsBuilder]
         */
        fun builder(): NotificationColorsBuilder = DefaultNotificationColors.Builder()
    }
}

/**
 * Builder для [NotificationColors]
 */
interface NotificationColorsBuilder {
    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Brush): NotificationColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): NotificationColorsBuilder

    /**
     * Устанавливает цвет кнопки закрытия [closeColor].
     */
    fun closeColor(closeColor: Color): NotificationColorsBuilder =
        closeColor(closeColor.asInteractive())

    /**
     * Устанавливает цвет кнопки закрытия [closeColor].
     */
    fun closeColor(closeColor: InteractiveColor): NotificationColorsBuilder

    /**
     * Создает экземпляр [NotificationColors]
     */
    fun build(): NotificationColors
}

@Immutable
private data class DefaultNotificationColors(
    override val backgroundColor: StatefulValue<Brush>,
    override val closeColor: InteractiveColor,
) : NotificationColors {

    class Builder : NotificationColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var closeColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun closeColor(closeColor: InteractiveColor) = apply {
            this.closeColor = closeColor
        }

        override fun build(): NotificationColors {
            return DefaultNotificationColors(
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
interface NotificationDimensions {

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
         * Создает экземпляр [NotificationDimensionsBuilder]
         */
        fun builder(): NotificationDimensionsBuilder = DefaultNotificationDimensions.Builder()
    }
}

/**
 * Builder для [NotificationDimensions]
 */
interface NotificationDimensionsBuilder {
    /**
     * Устанавливает размер иконки закрытия [closeSize]
     */
    fun closeSize(closeSize: Dp): NotificationDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): NotificationDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): NotificationDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): NotificationDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): NotificationDimensionsBuilder

    /**
     * Создает экземпляр [NotificationDimensions]
     */
    fun build(): NotificationDimensions
}

private class DefaultNotificationDimensions(
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val closeSize: Dp,
) : NotificationDimensions {

    class Builder : NotificationDimensionsBuilder {

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

        override fun build(): NotificationDimensions {
            return DefaultNotificationDimensions(
                paddingStart = paddingStart ?: 32.dp,
                paddingEnd = paddingEnd ?: 32.dp,
                paddingTop = paddingTop ?: 32.dp,
                paddingBottom = paddingBottom ?: 32.dp,
                closeSize = closeSize ?: 24.dp,
            )
        }
    }
}
