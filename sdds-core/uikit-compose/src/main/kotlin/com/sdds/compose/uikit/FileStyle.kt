package com.sdds.compose.uikit

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
 * CompositionLocal c [FileStyle] для компонента [File]
 */
val LocalFileStyle: ProvidableCompositionLocal<FileStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { FileStyle.builder().style() }

/**
 * Стиль компонента
 */
@Immutable
interface FileStyle : Style {
    /**
     * Стиль основной надписи
     */
    val labelStyle: TextStyle

    /**
     * Стиль дополнительной надписи
     */
    val descriptionStyle: TextStyle

    /**
     * Цвета компонента
     */
    val colors: FileColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: FileDimensions

    /**
     * Расположение прогресса [FileProgressPlacement]
     */
    val progressPlacement: FileProgressPlacement

    /**
     * Расположение кнопки действия и встроенного прогресса
     */
    val actionPlacement: FileActionPlacement

    /**
     * Стиль кнопки действия
     */
    val actionButtonStyle: ButtonStyle

    /**
     * Стиль внешнего прогресса
     */
    val progressBarStyle: ProgressBarStyle

    /**
     * Стиль встроенного прогресса
     */
    val circularProgressBarStyle: CircularProgressBarStyle

    companion object {
        /**
         * Возвращает экземпляр [FileStyleBuilder]
         */
        fun builder(receiver: Any? = null): FileStyleBuilder = DefaultFileStyle.Builder()
    }
}

/**
 * Билдер стиля компонента [File]
 */
interface FileStyleBuilder : StyleBuilder<FileStyle> {

    /**
     * Устанавливает стиль кнопки действия [actionButtonStyle]
     */
    fun actionButtonStyle(actionButtonStyle: ButtonStyle): FileStyleBuilder

    /**
     * Устанавливает стиль внешнего прогресса [progressBarStyle]
     */
    fun progressBarStyle(progressBarStyle: ProgressBarStyle): FileStyleBuilder

    /**
     * Устанавливает стиль встроенного прогресса [circularProgressBarStyle]
     */
    fun circularProgressBarStyle(circularProgressBarStyle: CircularProgressBarStyle): FileStyleBuilder

    /**
     * Устанавливает расположение прогресса [progressPlacement]
     */
    fun progressPlacement(progressPlacement: FileProgressPlacement): FileStyleBuilder

    /**
     * Устанавливает расположение кнопки действия и встроенного прогресса [actionPlacement]
     */
    fun actionPlacement(actionPlacement: FileActionPlacement): FileStyleBuilder

    /**
     * Устанавливает стиль основного текста [labelStyle]
     */
    fun labelStyle(labelStyle: TextStyle): FileStyleBuilder

    /**
     * Устанавливает стиль дополнительного текста [descriptionStyle]
     */
    fun descriptionStyle(descriptionStyle: TextStyle): FileStyleBuilder

    /**
     * Устанавливает цвета компонента с помощью [builder]
     */
    @Composable
    fun colors(builder: @Composable FileColorsBuilder.() -> Unit): FileStyleBuilder

    /**
     * Устанавливает ращмеры и отступы компонента с помощью [builder]
     */
    @Composable
    fun dimensions(builder: @Composable FileDimensionsBuilder.() -> Unit): FileStyleBuilder
}

private data class DefaultFileStyle(
    override val labelStyle: TextStyle,
    override val descriptionStyle: TextStyle,
    override val colors: FileColors,
    override val dimensions: FileDimensions,
    override val progressPlacement: FileProgressPlacement,
    override val actionPlacement: FileActionPlacement,
    override val actionButtonStyle: ButtonStyle,
    override val progressBarStyle: ProgressBarStyle,
    override val circularProgressBarStyle: CircularProgressBarStyle,
) : FileStyle {
    class Builder : FileStyleBuilder {
        private var progressPlacement: FileProgressPlacement? = null
        private var actionPlacement: FileActionPlacement? = null
        private var actionButtonStyle: ButtonStyle? = null
        private var progressBarStyle: ProgressBarStyle? = null
        private var circularProgressBarStyle: CircularProgressBarStyle? = null
        private var labelStyle: TextStyle? = null

        private var descriptionStyle: TextStyle? = null

        private val colorsBuilder: FileColorsBuilder = FileColors.builder()

        private val dimensionsBuilder: FileDimensionsBuilder = FileDimensions.builder()

        override fun actionButtonStyle(actionButtonStyle: ButtonStyle) = apply {
            this.actionButtonStyle = actionButtonStyle
        }

        override fun progressBarStyle(progressBarStyle: ProgressBarStyle) = apply {
            this.progressBarStyle = progressBarStyle
        }

        override fun circularProgressBarStyle(circularProgressBarStyle: CircularProgressBarStyle) =
            apply { this.circularProgressBarStyle = circularProgressBarStyle }

        override fun progressPlacement(progressPlacement: FileProgressPlacement) = apply {
            this.progressPlacement = progressPlacement
        }

        override fun actionPlacement(actionPlacement: FileActionPlacement) = apply {
            this.actionPlacement = actionPlacement
        }

        override fun labelStyle(labelStyle: TextStyle): FileStyleBuilder = apply {
            this.labelStyle = labelStyle
        }

        override fun descriptionStyle(descriptionStyle: TextStyle): FileStyleBuilder = apply {
            this.descriptionStyle = descriptionStyle
        }

        @Composable
        override fun colors(builder: @Composable FileColorsBuilder.() -> Unit): FileStyleBuilder =
            apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable FileDimensionsBuilder.() -> Unit):
            FileStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): FileStyle = DefaultFileStyle(
            labelStyle = labelStyle ?: TextStyle.Default,
            descriptionStyle = descriptionStyle ?: TextStyle.Default,
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
            progressPlacement = progressPlacement ?: FileProgressPlacement.Inline,
            actionPlacement = actionPlacement ?: FileActionPlacement.End,
            actionButtonStyle = actionButtonStyle ?: ButtonStyle.iconButtonBuilder().style(),
            progressBarStyle = progressBarStyle ?: ProgressBarStyle.builder().style(),
            circularProgressBarStyle = circularProgressBarStyle ?: CircularProgressBarStyle.builder().style(),
        )
    }
}

/**
 * Цвета компонента
 */
@Immutable
interface FileColors {
    /**
     * Цвет основного текста
     */
    val labelColor: InteractiveColor

    /**
     * Цвет дополнительного текста
     */
    val descriptionColor: InteractiveColor

    /**
     * Цвет иконки
     */
    val iconColor: InteractiveColor

    companion object {
        /**
         * Возвращает экземпляр [FileColorsBuilder]
         */
        fun builder(): FileColorsBuilder = DefaultFileColors.Builder()
    }
}

/**
 * Билдер для [FileColors]
 */
interface FileColorsBuilder {
    /**
     * Устанавливает цвет основного текста [labelColor]
     */
    fun labelColor(labelColor: InteractiveColor): FileColorsBuilder

    /**
     * Устанавливает цвет основного текста [labelColor]
     */
    fun labelColor(labelColor: Color): FileColorsBuilder =
        labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет дополнительного текста [descriptionColor]
     */
    fun descriptionColor(descriptionColor: InteractiveColor): FileColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста [descriptionColor]
     */
    fun descriptionColor(descriptionColor: Color): FileColorsBuilder =
        descriptionColor(descriptionColor.asInteractive())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: InteractiveColor): FileColorsBuilder

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: Color): FileColorsBuilder = iconColor(iconColor.asInteractive())

    /**
     * Вернёт [FileColors]
     */
    fun build(): FileColors
}

private data class DefaultFileColors(
    override val labelColor: InteractiveColor,
    override val descriptionColor: InteractiveColor,
    override val iconColor: InteractiveColor,
) : FileColors {
    class Builder : FileColorsBuilder {
        private var labelColor: InteractiveColor? = null

        private var descriptionColor: InteractiveColor? = null

        private var iconColor: InteractiveColor? = null

        override fun labelColor(labelColor: InteractiveColor): FileColorsBuilder = apply {
            this.labelColor = labelColor
        }

        override fun descriptionColor(descriptionColor: InteractiveColor): FileColorsBuilder =
            apply { this.descriptionColor = descriptionColor }

        override fun iconColor(iconColor: InteractiveColor): FileColorsBuilder = apply {
            this.iconColor = iconColor
        }

        override fun build(): FileColors = DefaultFileColors(
            labelColor = labelColor ?: Color.Black.asInteractive(),
            descriptionColor = descriptionColor ?: Color.Black.asInteractive(),
            iconColor = iconColor ?: Color.Black.asInteractive(),
        )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface FileDimensions {
    /**
     * Отступ контента в начале
     */
    val startContentPadding: Dp

    /**
     * Отступ контента в конце
     */
    val endContentPadding: Dp

    /**
     * Отступ нижнего контента (внешнего прогресса)
     */
    val bottomContentPadding: Dp

    /**
     * Отступ дополнительного текста
     */
    val descriptionPadding: Dp

    companion object {
        /**
         * Возвращает экземпляр [FileDimensionsBuilder]
         */
        fun builder(): FileDimensionsBuilder = DefaultFileDimensions.Builder()
    }
}

/**
 * Билдер для [FileDimensions]
 */
interface FileDimensionsBuilder {
    /**
     * Устанавливает отступ контента в начале [startContentPadding]
     */
    fun startContentPadding(startContentPadding: Dp): FileDimensionsBuilder

    /**
     * Устанавливает отступ контента в конце [endContentPadding]
     */
    fun endContentPadding(endContentPadding: Dp): FileDimensionsBuilder

    /**
     * Устанавливает отступ нижнего прогресса [bottomContentPadding]
     */
    fun bottomContentPadding(bottomContentPadding: Dp): FileDimensionsBuilder

    /**
     * Устанавливает отступ дополнительного текста [descriptionPadding]
     */
    fun descriptionPadding(descriptionPadding: Dp): FileDimensionsBuilder

    /**
     * Вернёт [FileDimensions]
     */
    fun build(): FileDimensions
}

private data class DefaultFileDimensions(
    override val startContentPadding: Dp,
    override val endContentPadding: Dp,
    override val bottomContentPadding: Dp,
    override val descriptionPadding: Dp,
) : FileDimensions {
    class Builder : FileDimensionsBuilder {
        private var startContentPadding: Dp? = null

        private var endContentPadding: Dp? = null

        private var bottomContentPadding: Dp? = null

        private var descriptionPadding: Dp? = null

        override fun startContentPadding(startContentPadding: Dp): FileDimensionsBuilder = apply {
            this.startContentPadding = startContentPadding
        }

        override fun endContentPadding(endContentPadding: Dp): FileDimensionsBuilder = apply {
            this.endContentPadding = endContentPadding
        }

        override fun bottomContentPadding(bottomContentPadding: Dp): FileDimensionsBuilder =
            apply { this.bottomContentPadding = bottomContentPadding }

        override fun descriptionPadding(descriptionPadding: Dp): FileDimensionsBuilder = apply {
            this.descriptionPadding = descriptionPadding
        }

        override fun build(): FileDimensions = DefaultFileDimensions(
            startContentPadding = startContentPadding ?: 8.dp,
            endContentPadding = endContentPadding ?: 8.dp,
            bottomContentPadding = bottomContentPadding ?: 8.dp,
            descriptionPadding = descriptionPadding ?: 2.dp,
        )
    }
}
