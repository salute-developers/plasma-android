package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [NotificationContentStyle] для компонента [NotificationContent]
 */
val LocalNotificationContentStyle: ProvidableCompositionLocal<NotificationContentStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { NotificationContentStyle.builder().style() }

/**
 * Стиль компонента [NotificationContent]
 */
@Immutable
interface NotificationContentStyle : Style {

    /**
     * Cтиль группы кнопок [ButtonGroup]
     */
    val buttonGroupStyle: ButtonGroupStyle

    /**
     * Режим размещения кнопок [NotificationContentButtonLayout]
     */
    val buttonLayout: NotificationContentButtonLayout

    /**
     * Ресурс иконки
     */
    @get:DrawableRes
    val icon: Int?

    /**
     * Расположение иконки
     */
    val iconPlacement: NotificationContentIconPlacement

    /**
     * Стиль заголовка
     */
    val titleStyle: TextStyle

    /**
     * Стиль текста
     */
    val textStyle: TextStyle

    /**
     * Цвета компонента
     */
    val colors: NotificationContentColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: NotificationContentDimensions

    companion object {
        /**
         * Возвращает экземпляр [NotificationContentStyleBuilder]
         */
        fun builder(receiver: Any? = null): NotificationContentStyleBuilder =
            DefaultNotificationContentStyle.Builder()
    }
}

/**
 * Билдер стиля компонента [NotificationContent]
 */
interface NotificationContentStyleBuilder : StyleBuilder<NotificationContentStyle> {

    /**
     * Устанавливает стиль группы кнопок [buttonGroupStyle]
     */
    fun buttonGroupStyle(buttonGroupStyle: ButtonGroupStyle): NotificationContentStyleBuilder

    /**
     * Устанавливает режим размещения кнопок [buttonLayout]
     */
    fun buttonLayout(buttonLayout: NotificationContentButtonLayout): NotificationContentStyleBuilder

    /**
     * Устанавливает расположение иконки [iconPlacement]
     */
    fun iconPlacement(iconPlacement: NotificationContentIconPlacement): NotificationContentStyleBuilder

    /**
     * Устанавливает ресурс иконки [icon]
     */
    fun icon(@DrawableRes icon: Int): NotificationContentStyleBuilder

    /**
     * Устанавливает стиль заголовка [titleStyle]
     */
    fun titleStyle(titleStyle: TextStyle): NotificationContentStyleBuilder

    /**
     * Устанавливает стиль текста [textStyle]
     */
    fun textStyle(textStyle: TextStyle): NotificationContentStyleBuilder

    /**
     * Устанавливает цвета с помощью [builder]
     */
    @Composable
    fun colors(builder: @Composable NotificationContentColorsBuilder.() -> Unit): NotificationContentStyleBuilder

    /**
     * Устанавливает размеры и отступы с помощью [builder]
     */
    @Composable
    fun dimensions(
        builder: @Composable NotificationContentDimensionsBuilder.() -> Unit,
    ): NotificationContentStyleBuilder
}

private data class DefaultNotificationContentStyle(
    override val titleStyle: TextStyle,
    override val textStyle: TextStyle,
    override val colors: NotificationContentColors,
    override val dimensions: NotificationContentDimensions,
    override val buttonGroupStyle: ButtonGroupStyle,
    override val iconPlacement: NotificationContentIconPlacement,
    override val buttonLayout: NotificationContentButtonLayout,
    override val icon: Int?,
) : NotificationContentStyle {
    class Builder : NotificationContentStyleBuilder {
        private var buttonGroupStyle: ButtonGroupStyle? = null
        private var buttonLayout: NotificationContentButtonLayout? = null
        private var iconPlacement: NotificationContentIconPlacement? = null
        private var icon: Int? = null
        private var titleStyle: TextStyle? = null
        private var textStyle: TextStyle? = null

        private val colorsBuilder: NotificationContentColorsBuilder =
            NotificationContentColors.builder()

        private val dimensionsBuilder: NotificationContentDimensionsBuilder =
            NotificationContentDimensions.builder()

        override fun buttonGroupStyle(buttonGroupStyle: ButtonGroupStyle) = apply {
            this.buttonGroupStyle = buttonGroupStyle
        }

        override fun buttonLayout(buttonLayout: NotificationContentButtonLayout) = apply {
            this.buttonLayout = buttonLayout
        }

        override fun iconPlacement(iconPlacement: NotificationContentIconPlacement) = apply {
            this.iconPlacement = iconPlacement
        }

        override fun icon(icon: Int) = apply {
            this.icon = icon
        }

        override fun titleStyle(titleStyle: TextStyle): NotificationContentStyleBuilder = apply {
            this.titleStyle = titleStyle
        }

        override fun textStyle(textStyle: TextStyle): NotificationContentStyleBuilder = apply {
            this.textStyle = textStyle
        }

        @Composable
        override fun colors(builder: @Composable NotificationContentColorsBuilder.() -> Unit):
            NotificationContentStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(
            builder: @Composable NotificationContentDimensionsBuilder.() ->
            Unit,
        ): NotificationContentStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): NotificationContentStyle =
            DefaultNotificationContentStyle(
                titleStyle = titleStyle ?: TextStyle.Default,
                textStyle = textStyle ?: TextStyle.Default,
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                buttonGroupStyle = buttonGroupStyle ?: ButtonGroupStyle.builder().style(),
                buttonLayout = buttonLayout ?: NotificationContentButtonLayout.Normal,
                iconPlacement = iconPlacement ?: NotificationContentIconPlacement.None,
                icon = icon,
            )
    }
}

/**
 * Цвета компонента [NotificationContent]
 */
@Immutable
interface NotificationContentColors {
    /**
     * Цвет заголовка
     */
    val titleColor: InteractiveColor

    /**
     * Цвет текста
     */
    val textColor: InteractiveColor

    /**
     * Цвет иконки
     */
    val iconColor: InteractiveColor

    companion object {
        /**
         * Возвращает экземпляр [NotificationContentColorsBuilder]
         */
        fun builder(): NotificationContentColorsBuilder =
            DefaultNotificationContentColors.Builder()
    }
}

/**
 * Билдер для [NotificationContentColors]
 */
interface NotificationContentColorsBuilder {
    /**
     * Устанавливает цвет заголовка [titleColor]
     */
    fun titleColor(titleColor: InteractiveColor): NotificationContentColorsBuilder

    /**
     * Устанавливает цвет заголовка [titleColor]
     */
    fun titleColor(titleColor: Color): NotificationContentColorsBuilder =
        titleColor(titleColor.asInteractive())

    /**
     * Устанавливает цвет текста [textColor]
     */
    fun textColor(textColor: InteractiveColor): NotificationContentColorsBuilder

    /**
     * Устанавливает цвет текста [textColor]
     */
    fun textColor(textColor: Color): NotificationContentColorsBuilder =
        textColor(textColor.asInteractive())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: InteractiveColor): NotificationContentColorsBuilder

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: Color): NotificationContentColorsBuilder =
        iconColor(iconColor.asInteractive())

    /**
     * Вернёт [NotificationContentColors]
     */
    fun build(): NotificationContentColors
}

private data class DefaultNotificationContentColors(
    override val titleColor: InteractiveColor,
    override val textColor: InteractiveColor,
    override val iconColor: InteractiveColor,
) : NotificationContentColors {
    class Builder : NotificationContentColorsBuilder {
        private var titleColor: InteractiveColor? = null
        private var textColor: InteractiveColor? = null
        private var iconColor: InteractiveColor? = null

        override fun titleColor(titleColor: InteractiveColor): NotificationContentColorsBuilder =
            apply { this.titleColor = titleColor }

        override fun textColor(textColor: InteractiveColor): NotificationContentColorsBuilder =
            apply { this.textColor = textColor }

        override fun iconColor(iconColor: InteractiveColor): NotificationContentColorsBuilder =
            apply { this.iconColor = iconColor }

        override fun build(): NotificationContentColors =
            DefaultNotificationContentColors(
                titleColor = titleColor ?: Color.Black.asInteractive(),
                textColor = textColor ?: Color.Black.asInteractive(),
                iconColor = iconColor ?: Color.Black.asInteractive(),
            )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface NotificationContentDimensions {
    /**
     * Размер иконки
     */
    val iconSize: Dp

    /**
     * Отступ иконки
     */
    val iconMargin: Dp

    /**
     * Отступ текста
     */
    val textPadding: Dp

    /**
     * Отступ контента в начале
     */
    val contentStartPadding: Dp

    /**
     * Отступ контента в конце
     */
    val contentEndPadding: Dp

    /**
     * Отступ контента сверху
     */
    val contentTopPadding: Dp

    /**
     * Отступ контента снизу
     */
    val contentBottomPadding: Dp

    /**
     * Отступ текстового контейнера в начале
     */
    val textBoxStartPadding: Dp

    /**
     * Отступ текстового контейнера в конце
     */
    val textBoxEndPadding: Dp

    /**
     * Отступ текстового контейнера сверху
     */
    val textBoxTopPadding: Dp

    /**
     * Отступ текстового контейнера снизу
     */
    val textBoxBottomPadding: Dp

    /**
     * Отступ группы кнопок в начале
     */
    val buttonGroupStartPadding: Dp

    /**
     * Отступ группы кнопок в конце
     */
    val buttonGroupEndPadding: Dp

    /**
     * Отступ группы кнопок сверху
     */
    val buttonGroupTopPadding: Dp

    /**
     * Отступ группы кнопок снизу
     */
    val buttonGroupBottomPadding: Dp

    companion object {
        /**
         * Возвращает экземпляр [NotificationContentDimensionsBuilder]
         */
        fun builder(): NotificationContentDimensionsBuilder =
            DefaultNotificationContentDimensions.Builder()
    }
}

/**
 * Билдер для [NotificationContentDimensions]
 */
interface NotificationContentDimensionsBuilder {
    /**
     * Устанавливает размер иконки [iconSize]
     */
    fun iconSize(iconSize: Dp): NotificationContentDimensionsBuilder

    /**
     * Устанавливает отступ иконки [iconMargin]
     */
    fun iconMargin(iconMargin: Dp): NotificationContentDimensionsBuilder

    /**
     * Устанавливает отступ текста [textPadding]
     */
    fun textPadding(textPadding: Dp): NotificationContentDimensionsBuilder

    /**
     * Устанавливает отступ контента в начале [contentStartPadding]
     */
    fun contentStartPadding(contentStartPadding: Dp): NotificationContentDimensionsBuilder

    /**
     * Устанавливает отступ контента в конце [contentEndPadding]
     */
    fun contentEndPadding(contentEndPadding: Dp): NotificationContentDimensionsBuilder

    /**
     * Устанавливает отступ контента сверху [contentTopPadding]
     */
    fun contentTopPadding(contentTopPadding: Dp): NotificationContentDimensionsBuilder

    /**
     * Устанавливает отступ контента снизу [contentBottomPadding]
     */
    fun contentBottomPadding(contentBottomPadding: Dp): NotificationContentDimensionsBuilder

    /**
     * Устанавливает отступ текстового контейнера в начале [textBoxStartPadding]
     */
    fun textBoxStartPadding(textBoxStartPadding: Dp): NotificationContentDimensionsBuilder

    /**
     * Устанавливает отступ текстового контейнера в конце [textBoxEndPadding]
     */
    fun textBoxEndPadding(textBoxEndPadding: Dp): NotificationContentDimensionsBuilder

    /**
     * Устанавливает отступ текстового контейнера сверху [textBoxTopPadding]
     */
    fun textBoxTopPadding(textBoxTopPadding: Dp): NotificationContentDimensionsBuilder

    /**
     * Устанавливает отступ текстового контейнера снизу [textBoxBottomPadding]
     */
    fun textBoxBottomPadding(textBoxBottomPadding: Dp): NotificationContentDimensionsBuilder

    /**
     * Устанавливает отступ группы кнопок в начале [buttonGroupStartPadding]
     */
    fun buttonGroupStartPadding(buttonGroupStartPadding: Dp): NotificationContentDimensionsBuilder

    /**
     * Устанавливает отступ группы кнопок в конце [buttonGroupEndPadding]
     */
    fun buttonGroupEndPadding(buttonGroupEndPadding: Dp): NotificationContentDimensionsBuilder

    /**
     * Устанавливает отступ группы кнопок сверху [buttonGroupTopPadding]
     */
    fun buttonGroupTopPadding(buttonGroupTopPadding: Dp): NotificationContentDimensionsBuilder

    /**
     * Устанавливает отступ группы кнопок снизу [buttonGroupBottomPadding]
     */
    fun buttonGroupBottomPadding(buttonGroupBottomPadding: Dp): NotificationContentDimensionsBuilder

    /**
     * Вернёт [NotificationContentDimensions]
     */
    fun build(): NotificationContentDimensions
}

private data class DefaultNotificationContentDimensions(
    override val iconSize: Dp,
    override val iconMargin: Dp,
    override val textPadding: Dp,
    override val contentStartPadding: Dp,
    override val contentEndPadding: Dp,
    override val contentTopPadding: Dp,
    override val contentBottomPadding: Dp,
    override val textBoxStartPadding: Dp,
    override val textBoxEndPadding: Dp,
    override val textBoxTopPadding: Dp,
    override val textBoxBottomPadding: Dp,
    override val buttonGroupStartPadding: Dp,
    override val buttonGroupEndPadding: Dp,
    override val buttonGroupTopPadding: Dp,
    override val buttonGroupBottomPadding: Dp,
) : NotificationContentDimensions {
    class Builder : NotificationContentDimensionsBuilder {
        private var iconSize: Dp? = null
        private var iconMargin: Dp? = null
        private var textPadding: Dp? = null
        private var contentStartPadding: Dp? = null
        private var contentEndPadding: Dp? = null
        private var contentTopPadding: Dp? = null
        private var contentBottomPadding: Dp? = null
        private var textBoxStartPadding: Dp? = null
        private var textBoxEndPadding: Dp? = null
        private var textBoxTopPadding: Dp? = null
        private var textBoxBottomPadding: Dp? = null
        private var buttonGroupStartPadding: Dp? = null
        private var buttonGroupEndPadding: Dp? = null
        private var buttonGroupTopPadding: Dp? = null
        private var buttonGroupBottomPadding: Dp? = null

        override fun iconSize(iconSize: Dp): NotificationContentDimensionsBuilder = apply {
            this.iconSize = iconSize
        }

        override fun iconMargin(iconMargin: Dp) = apply {
            this.iconMargin = iconMargin
        }

        override fun textPadding(textPadding: Dp): NotificationContentDimensionsBuilder = apply {
            this.textPadding = textPadding
        }

        override fun contentStartPadding(contentStartPadding: Dp): NotificationContentDimensionsBuilder =
            apply { this.contentStartPadding = contentStartPadding }

        override fun contentEndPadding(contentEndPadding: Dp): NotificationContentDimensionsBuilder =
            apply { this.contentEndPadding = contentEndPadding }

        override fun contentTopPadding(contentTopPadding: Dp): NotificationContentDimensionsBuilder =
            apply { this.contentTopPadding = contentTopPadding }

        override fun contentBottomPadding(contentBottomPadding: Dp): NotificationContentDimensionsBuilder =
            apply { this.contentBottomPadding = contentBottomPadding }

        override fun textBoxStartPadding(textBoxStartPadding: Dp): NotificationContentDimensionsBuilder =
            apply { this.textBoxStartPadding = textBoxStartPadding }

        override fun textBoxEndPadding(textBoxEndPadding: Dp): NotificationContentDimensionsBuilder =
            apply { this.textBoxEndPadding = textBoxEndPadding }

        override fun textBoxTopPadding(textBoxTopPadding: Dp): NotificationContentDimensionsBuilder =
            apply { this.textBoxTopPadding = textBoxTopPadding }

        override fun textBoxBottomPadding(textBoxBottomPadding: Dp): NotificationContentDimensionsBuilder =
            apply { this.textBoxBottomPadding = textBoxBottomPadding }

        override fun buttonGroupStartPadding(buttonGroupStartPadding: Dp): NotificationContentDimensionsBuilder =
            apply { this.buttonGroupStartPadding = buttonGroupStartPadding }

        override fun buttonGroupEndPadding(buttonGroupEndPadding: Dp): NotificationContentDimensionsBuilder =
            apply { this.buttonGroupEndPadding = buttonGroupEndPadding }

        override fun buttonGroupTopPadding(buttonGroupTopPadding: Dp): NotificationContentDimensionsBuilder =
            apply { this.buttonGroupTopPadding = buttonGroupTopPadding }

        override fun buttonGroupBottomPadding(buttonGroupBottomPadding: Dp): NotificationContentDimensionsBuilder =
            apply { this.buttonGroupBottomPadding = buttonGroupBottomPadding }

        @Suppress("CyclomaticComplexMethod")
        override fun build(): NotificationContentDimensions =
            DefaultNotificationContentDimensions(
                iconSize = iconSize ?: 24.dp,
                iconMargin = iconMargin ?: 0.dp,
                textPadding = textPadding ?: 0.dp,
                contentStartPadding = contentStartPadding ?: 0.dp,
                contentEndPadding = contentEndPadding ?: 0.dp,
                contentTopPadding = contentTopPadding ?: 0.dp,
                contentBottomPadding = contentBottomPadding ?: 0.dp,
                textBoxStartPadding = textBoxStartPadding ?: 0.dp,
                textBoxEndPadding = textBoxEndPadding ?: 0.dp,
                textBoxTopPadding = textBoxTopPadding ?: 0.dp,
                textBoxBottomPadding = textBoxBottomPadding ?: 0.dp,
                buttonGroupStartPadding = buttonGroupStartPadding ?: 0.dp,
                buttonGroupEndPadding = buttonGroupEndPadding ?: 0.dp,
                buttonGroupTopPadding = buttonGroupTopPadding ?: 0.dp,
                buttonGroupBottomPadding = buttonGroupBottomPadding ?: 0.dp,
            )
    }
}
