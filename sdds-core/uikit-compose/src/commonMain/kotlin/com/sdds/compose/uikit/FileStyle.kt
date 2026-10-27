package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
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
    @Deprecated("Use labelStyles", replaceWith = ReplaceWith("labelStyles"))
    val labelStyle: TextStyle

    /**
     * Стиль основной надписи
     */
    val labelStyles: StatefulValue<TextStyle>

    /**
     * Стиль дополнительной надписи
     */
    @Deprecated("Use descriptionStyles", replaceWith = ReplaceWith("descriptionStyles"))
    val descriptionStyle: TextStyle

    /**
     * Стиль дополнительной надписи
     */
    val descriptionStyles: StatefulValue<TextStyle>

    /**
     * Цвета компонента
     */
    val colors: FileColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: FileDimensions

    /**
     * Форма компонента
     */
    val shape: StatefulValue<Shape>

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
@ApiInfo
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
     * Устанавливает форму компонента [shape]
     */
    fun shape(shape: Shape): FileStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает форму компонента [shape]
     */
    fun shape(shape: StatefulValue<Shape>): FileStyleBuilder

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
    fun labelStyle(labelStyle: TextStyle): FileStyleBuilder =
        labelStyle(labelStyle.asStatefulValue())

    /**
     * Устанавливает стиль основного текста [labelStyle]
     */
    fun labelStyle(labelStyle: StatefulValue<TextStyle>): FileStyleBuilder

    /**
     * Устанавливает стиль дополнительного текста [descriptionStyle]
     */
    fun descriptionStyle(descriptionStyle: TextStyle): FileStyleBuilder =
        descriptionStyle(descriptionStyle.asStatefulValue())

    /**
     * Устанавливает стиль дополнительного текста [descriptionStyle]
     */
    fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>): FileStyleBuilder

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
    override val colors: FileColors,
    override val dimensions: FileDimensions,
    override val shape: StatefulValue<Shape>,
    override val progressPlacement: FileProgressPlacement,
    override val actionPlacement: FileActionPlacement,
    override val actionButtonStyle: ButtonStyle,
    override val progressBarStyle: ProgressBarStyle,
    override val circularProgressBarStyle: CircularProgressBarStyle,
    override val labelStyles: StatefulValue<TextStyle>,
    override val descriptionStyles: StatefulValue<TextStyle>,
) : FileStyle {

    @Deprecated("Use labelStyles", replaceWith = ReplaceWith("labelStyles"))
    override val labelStyle: TextStyle = labelStyles.getDefaultValue()

    @Deprecated("Use descriptionStyles", replaceWith = ReplaceWith("descriptionStyles"))
    override val descriptionStyle: TextStyle = descriptionStyles.getDefaultValue()
    class Builder : FileStyleBuilder {
        private var progressPlacement: FileProgressPlacement? = null
        private var actionPlacement: FileActionPlacement? = null
        private var actionButtonStyle: ButtonStyle? = null
        private var progressBarStyle: ProgressBarStyle? = null
        private var circularProgressBarStyle: CircularProgressBarStyle? = null
        private var shape: StatefulValue<Shape>? = null
        private var labelStyle: StatefulValue<TextStyle>? = null

        private var descriptionStyle: StatefulValue<TextStyle>? = null

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

        override fun shape(shape: StatefulValue<Shape>) = apply {
            this.shape = shape
        }

        override fun labelStyle(labelStyle: StatefulValue<TextStyle>): FileStyleBuilder = apply {
            this.labelStyle = labelStyle
        }

        override fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>): FileStyleBuilder = apply {
            this.descriptionStyle = descriptionStyle
        }

        @Composable
        override fun colors(builder: @Composable FileColorsBuilder.() -> Unit): FileStyleBuilder =
            apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable FileDimensionsBuilder.() -> Unit):
            FileStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): FileStyle = DefaultFileStyle(
            labelStyles = labelStyle ?: TextStyle.Default.asStatefulValue(),
            descriptionStyles = descriptionStyle ?: TextStyle.Default.asStatefulValue(),
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
            shape = shape ?: RectangleShape.asStatefulValue(),
            progressPlacement = progressPlacement ?: FileProgressPlacement.Inner,
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
     * Кисть фона компонента
     */
    val backgroundColor: StatefulValue<Brush>

    /**
     * Цвет основного текста
     */
    @Deprecated("Use labelBrush", replaceWith = ReplaceWith("labelBrush"))
    val labelColor: InteractiveColor

    /**
     * Кисть основного текста
     */
    val labelBrush: StatefulValue<Brush>

    /**
     * Цвет дополнительного текста
     */
    @Deprecated("Use descriptionBrush", replaceWith = ReplaceWith("descriptionBrush"))
    val descriptionColor: InteractiveColor

    /**
     * Кисть дополнительного текста
     */
    val descriptionBrush: StatefulValue<Brush>

    /**
     * Цвет иконки
     */
    @Deprecated("Use iconBrush", replaceWith = ReplaceWith("iconBrush"))
    val iconColor: InteractiveColor

    /**
     * Кисть иконки
     */
    val iconBrush: StatefulValue<Brush>

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
     * Устанавливает цвет фона
     */
    fun backgroundColor(backgroundColor: Color): FileColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(backgroundColor: InteractiveColor): FileColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисть фона
     */
    fun backgroundColor(backgroundBrush: Brush): FileColorsBuilder =
        backgroundColor(backgroundBrush.asStatefulValue())

    /**
     * Устанавливает кисть фона
     */
    fun backgroundColor(backgroundBrush: StatefulValue<Brush>): FileColorsBuilder

    /**
     * Устанавливает цвет основного текста [labelColor]
     */
    fun labelColor(labelColor: InteractiveColor): FileColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает цвет основного текста [labelColor]
     */
    fun labelColor(labelColor: Color): FileColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает кисть основного текста [labelColor]
     */
    fun labelColor(labelColor: Brush): FileColorsBuilder =
        labelColor(labelColor.asStatefulValue())

    /**
     * Устанавливает кисть основного текста [labelColor]
     */
    fun labelColor(labelColor: StatefulValue<Brush>): FileColorsBuilder

    /**
     * Устанавливает цвет дополнительного текста [descriptionColor]
     */
    fun descriptionColor(descriptionColor: InteractiveColor): FileColorsBuilder =
        descriptionColor(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает цвет дополнительного текста [descriptionColor]
     */
    fun descriptionColor(descriptionColor: Color): FileColorsBuilder =
        descriptionColor(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает кисть дополнительного текста [descriptionColor]
     */
    fun descriptionColor(descriptionColor: Brush): FileColorsBuilder =
        descriptionColor(descriptionColor.asStatefulValue())

    /**
     * Устанавливает кисть дополнительного текста [descriptionColor]
     */
    fun descriptionColor(descriptionColor: StatefulValue<Brush>): FileColorsBuilder

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: InteractiveColor): FileColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: Color): FileColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает кисть иконки [iconColor]
     */
    fun iconColor(iconColor: Brush): FileColorsBuilder =
        iconColor(iconColor.asStatefulValue())

    /**
     * Устанавливает кисть иконки [iconColor]
     */
    fun iconColor(iconColor: StatefulValue<Brush>): FileColorsBuilder

    /**
     * Вернёт [FileColors]
     */
    fun build(): FileColors
}

private data class DefaultFileColors(
    override val backgroundColor: StatefulValue<Brush>,
    override val labelBrush: StatefulValue<Brush>,
    override val descriptionBrush: StatefulValue<Brush>,
    override val iconBrush: StatefulValue<Brush>,
) : FileColors {
    @Deprecated("Use labelBrush", replaceWith = ReplaceWith("labelBrush"))
    override val labelColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use descriptionBrush", replaceWith = ReplaceWith("descriptionBrush"))
    override val descriptionColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use iconBrush", replaceWith = ReplaceWith("iconBrush"))
    override val iconColor: InteractiveColor = Color.Transparent.asInteractive()
    class Builder : FileColorsBuilder {
        private var backgroundBrush: StatefulValue<Brush>? = null

        private var labelColor: StatefulValue<Brush>? = null

        private var descriptionColor: StatefulValue<Brush>? = null

        private var iconColor: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundBrush: StatefulValue<Brush>): FileColorsBuilder =
            apply { this.backgroundBrush = backgroundBrush }

        override fun labelColor(labelColor: StatefulValue<Brush>): FileColorsBuilder = apply {
            this.labelColor = labelColor
        }

        override fun descriptionColor(descriptionColor: StatefulValue<Brush>): FileColorsBuilder =
            apply { this.descriptionColor = descriptionColor }

        override fun iconColor(iconColor: StatefulValue<Brush>): FileColorsBuilder = apply {
            this.iconColor = iconColor
        }

        override fun build(): FileColors = DefaultFileColors(
            backgroundColor = backgroundBrush ?: Color.Transparent.asStatefulBrush(),
            labelBrush = labelColor ?: Color.Black.asStatefulBrush(),
            descriptionBrush = descriptionColor ?: Color.Black.asStatefulBrush(),
            iconBrush = iconColor ?: Color.Black.asStatefulBrush(),
        )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface FileDimensions {
    /**
     * Внешний отступ компонента в начале
     */
    val paddingStart: StatefulValue<Dp>

    /**
     * Внешний отступ компонента сверху
     */
    val paddingTop: StatefulValue<Dp>

    /**
     * Внешний отступ компонента в конце
     */
    val paddingEnd: StatefulValue<Dp>

    /**
     * Внешний отступ компонента снизу
     */
    val paddingBottom: StatefulValue<Dp>

    /**
     * Отступ контента в начале
     */
    @Deprecated("Use startContentPaddingValues", replaceWith = ReplaceWith("startContentPaddingValues"))
    val startContentPadding: Dp

    /**
     * Отступ контента в начале
     */
    val startContentPaddingValues: StatefulValue<Dp>

    /**
     * Отступ контента в конце
     */
    @Deprecated("Use endContentPaddingValues", replaceWith = ReplaceWith("endContentPaddingValues"))
    val endContentPadding: Dp

    /**
     * Отступ контента в конце
     */
    val endContentPaddingValues: StatefulValue<Dp>

    /**
     * Отступ нижнего контента (внешнего прогресса)
     */
    @Deprecated("Use bottomContentPaddingValues", replaceWith = ReplaceWith("bottomContentPaddingValues"))
    val bottomContentPadding: Dp

    /**
     * Отступ нижнего контента (внешнего прогресса)
     */
    val bottomContentPaddingValues: StatefulValue<Dp>

    /**
     * Отступ дополнительного текста
     */
    @Deprecated("Use descriptionPaddingValues", replaceWith = ReplaceWith("descriptionPaddingValues"))
    val descriptionPadding: Dp

    /**
     * Отступ дополнительного текста
     */
    val descriptionPaddingValues: StatefulValue<Dp>

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
     * Устанавливает внешний отступ компонента в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): FileDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает внешний отступ компонента в начале [paddingStart]
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): FileDimensionsBuilder

    /**
     * Устанавливает внешний отступ компонента сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): FileDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает внешний отступ компонента сверху [paddingTop]
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): FileDimensionsBuilder

    /**
     * Устанавливает внешний отступ компонента в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): FileDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает внешний отступ компонента в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): FileDimensionsBuilder

    /**
     * Устанавливает внешний отступ компонента снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): FileDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает внешний отступ компонента снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): FileDimensionsBuilder

    /**
     * Устанавливает отступ контента в начале [startContentPadding]
     */
    fun startContentPadding(startContentPadding: Dp): FileDimensionsBuilder =
        startContentPadding(startContentPadding.asStatefulValue())

    /**
     * Устанавливает отступ контента в начале [startContentPadding]
     */
    fun startContentPadding(startContentPadding: StatefulValue<Dp>): FileDimensionsBuilder

    /**
     * Устанавливает отступ контента в конце [endContentPadding]
     */
    fun endContentPadding(endContentPadding: Dp): FileDimensionsBuilder =
        endContentPadding(endContentPadding.asStatefulValue())

    /**
     * Устанавливает отступ контента в конце [endContentPadding]
     */
    fun endContentPadding(endContentPadding: StatefulValue<Dp>): FileDimensionsBuilder

    /**
     * Устанавливает отступ нижнего прогресса [bottomContentPadding]
     */
    fun bottomContentPadding(bottomContentPadding: Dp): FileDimensionsBuilder =
        bottomContentPadding(bottomContentPadding.asStatefulValue())

    /**
     * Устанавливает отступ нижнего прогресса [bottomContentPadding]
     */
    fun bottomContentPadding(bottomContentPadding: StatefulValue<Dp>): FileDimensionsBuilder

    /**
     * Устанавливает отступ дополнительного текста [descriptionPadding]
     */
    fun descriptionPadding(descriptionPadding: Dp): FileDimensionsBuilder =
        descriptionPadding(descriptionPadding.asStatefulValue())

    /**
     * Устанавливает отступ дополнительного текста [descriptionPadding]
     */
    fun descriptionPadding(descriptionPadding: StatefulValue<Dp>): FileDimensionsBuilder

    /**
     * Вернёт [FileDimensions]
     */
    fun build(): FileDimensions
}

private data class DefaultFileDimensions(
    override val paddingStart: StatefulValue<Dp>,
    override val paddingTop: StatefulValue<Dp>,
    override val paddingEnd: StatefulValue<Dp>,
    override val paddingBottom: StatefulValue<Dp>,
    override val startContentPaddingValues: StatefulValue<Dp>,
    override val endContentPaddingValues: StatefulValue<Dp>,
    override val bottomContentPaddingValues: StatefulValue<Dp>,
    override val descriptionPaddingValues: StatefulValue<Dp>,
) : FileDimensions {
    @Deprecated("Use startContentPaddingValues", replaceWith = ReplaceWith("startContentPaddingValues"))
    override val startContentPadding: Dp = startContentPaddingValues.getDefaultValue()

    @Deprecated("Use endContentPaddingValues", replaceWith = ReplaceWith("endContentPaddingValues"))
    override val endContentPadding: Dp = endContentPaddingValues.getDefaultValue()

    @Deprecated("Use bottomContentPaddingValues", replaceWith = ReplaceWith("bottomContentPaddingValues"))
    override val bottomContentPadding: Dp = bottomContentPaddingValues.getDefaultValue()

    @Deprecated("Use descriptionPaddingValues", replaceWith = ReplaceWith("descriptionPaddingValues"))
    override val descriptionPadding: Dp = descriptionPaddingValues.getDefaultValue()
    class Builder : FileDimensionsBuilder {
        private var paddingStart: StatefulValue<Dp>? = null

        private var paddingTop: StatefulValue<Dp>? = null

        private var paddingEnd: StatefulValue<Dp>? = null

        private var paddingBottom: StatefulValue<Dp>? = null

        private var startContentPadding: StatefulValue<Dp>? = null

        private var endContentPadding: StatefulValue<Dp>? = null

        private var bottomContentPadding: StatefulValue<Dp>? = null

        private var descriptionPadding: StatefulValue<Dp>? = null

        override fun paddingStart(paddingStart: StatefulValue<Dp>): FileDimensionsBuilder = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingTop(paddingTop: StatefulValue<Dp>): FileDimensionsBuilder = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>): FileDimensionsBuilder = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>): FileDimensionsBuilder = apply {
            this.paddingBottom = paddingBottom
        }

        override fun startContentPadding(startContentPadding: StatefulValue<Dp>): FileDimensionsBuilder = apply {
            this.startContentPadding = startContentPadding
        }

        override fun endContentPadding(endContentPadding: StatefulValue<Dp>): FileDimensionsBuilder = apply {
            this.endContentPadding = endContentPadding
        }

        override fun bottomContentPadding(bottomContentPadding: StatefulValue<Dp>): FileDimensionsBuilder =
            apply { this.bottomContentPadding = bottomContentPadding }

        override fun descriptionPadding(descriptionPadding: StatefulValue<Dp>): FileDimensionsBuilder = apply {
            this.descriptionPadding = descriptionPadding
        }

        override fun build(): FileDimensions = DefaultFileDimensions(
            paddingStart = paddingStart ?: 0.dp.asStatefulValue(),
            paddingTop = paddingTop ?: 0.dp.asStatefulValue(),
            paddingEnd = paddingEnd ?: 0.dp.asStatefulValue(),
            paddingBottom = paddingBottom ?: 0.dp.asStatefulValue(),
            startContentPaddingValues = startContentPadding ?: 8.dp.asStatefulValue(),
            endContentPaddingValues = endContentPadding ?: 8.dp.asStatefulValue(),
            bottomContentPaddingValues = bottomContentPadding ?: 8.dp.asStatefulValue(),
            descriptionPaddingValues = descriptionPadding ?: 2.dp.asStatefulValue(),
        )
    }
}
