package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [NoteCompactStyle] для компонента [NoteCompact]
 */
val LocalNoteCompactStyle = compositionLocalOf(structuralEqualityPolicy()) { NoteCompactStyle.builder().style() }

/**
 * Стиль компонента Note
 */
@Immutable
interface NoteCompactStyle : Style {

    /**
     * Форма компонента
     */
    val shape: CornerBasedShape

    /**
     * Расположение contentBefore
     */
    val contentBeforeArrangement: ContentBeforeVerticalArrangement

    /**
     * Cтиль кнопки в action [Button]
     */
    val linkButtonStyle: ButtonStyle

    /**
     * Стиль заголовка
     */
    val titleStyle: TextStyle

    /**
     * Стиль текста
     */
    val textStyle: TextStyle

    /**
     * Ресурс иконки close
     */
    @get:DrawableRes
    val closeIcon: Int?

    /**
     * Цвета компонента
     */
    val colors: NoteCompactColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: NoteCompactDimensions

    companion object {
        /**
         * Возвращает экземпляр [NoteCompactStyleBuilder]
         */
        fun builder(receiver: Any? = null): NoteCompactStyleBuilder = DefaultNoteCompactStyle.Builder()
    }
}

/**
 * Билдер стиля [NoteCompactStyle]
 */
interface NoteCompactStyleBuilder : StyleBuilder<NoteCompactStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): NoteCompactStyleBuilder

    /**
     * Устанавливает расположение [contentBeforeArrangement]
     */
    fun contentBeforeArrangement(contentBeforeArrangement: ContentBeforeVerticalArrangement): NoteCompactStyleBuilder

    /**
     * Устанавливает стиль компонентов LinkButton в компоненте
     */
    fun linkButtonStyle(linkButtonStyle: ButtonStyle): NoteCompactStyleBuilder

    /**
     * Устанавливает стиль заголовка [titleStyle]
     */
    fun titleStyle(titleStyle: TextStyle): NoteCompactStyleBuilder

    /**
     * Устанавливает стиль текста [textStyle]
     */
    fun textStyle(textStyle: TextStyle): NoteCompactStyleBuilder

    /**
     * Устанавливает ресурс иконки close [closeIcon]
     */
    fun closeIcon(@DrawableRes closeIcon: Int): NoteCompactStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(builder: @Composable NoteCompactColorsBuilder.() -> Unit): NoteCompactStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(builder: @Composable NoteCompactDimensionsBuilder.() -> Unit): NoteCompactStyleBuilder
}

private class DefaultNoteCompactStyle(
    override val shape: CornerBasedShape,
    override val contentBeforeArrangement: ContentBeforeVerticalArrangement,
    override val titleStyle: TextStyle,
    override val textStyle: TextStyle,
    override val colors: NoteCompactColors,
    override val dimensions: NoteCompactDimensions,
    override val linkButtonStyle: ButtonStyle,
    override val closeIcon: Int?,
) : NoteCompactStyle {

    class Builder : NoteCompactStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var contentBeforeArrangement: ContentBeforeVerticalArrangement? = null
        private val colorsBuilder = NoteCompactColors.builder()
        private val dimensionsBuilder = NoteCompactDimensions.builder()
        private var titleStyle: TextStyle? = null
        private var textStyle: TextStyle? = null
        private var linkButtonStyle: ButtonStyle? = null
        private var closeIcon: Int? = null

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun contentBeforeArrangement(contentBeforeArrangement: ContentBeforeVerticalArrangement) = apply {
            this.contentBeforeArrangement = contentBeforeArrangement
        }

        override fun linkButtonStyle(linkButtonStyle: ButtonStyle) = apply {
            this.linkButtonStyle = linkButtonStyle
        }

        override fun titleStyle(titleStyle: TextStyle) = apply {
            this.titleStyle = titleStyle
        }

        override fun textStyle(textStyle: TextStyle) = apply {
            this.textStyle = textStyle
        }

        override fun closeIcon(closeIcon: Int) = apply {
            this.closeIcon = closeIcon
        }

        @Composable
        override fun colors(builder: @Composable (NoteCompactColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (NoteCompactDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun style(): NoteCompactStyle {
            return DefaultNoteCompactStyle(
                shape = shape ?: RoundedCornerShape(15),
                contentBeforeArrangement = contentBeforeArrangement ?: ContentBeforeVerticalArrangement.Top,
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                titleStyle = titleStyle ?: TextStyle.Default,
                textStyle = textStyle ?: TextStyle.Default,
                linkButtonStyle = linkButtonStyle ?: ButtonStyle.linkButtonBuilder().style(),
                closeIcon = closeIcon,
            )
        }
    }
}

/**
 * Цвета компонента [NoteCompact]
 */
@Immutable
interface NoteCompactColors {
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
         * Возвращает экземпляр [NoteCompactColorsBuilder]
         */
        fun builder(): NoteCompactColorsBuilder =
            DefaultNoteCompactColors.Builder()
    }
}

/**
 * Билдер для [NoteCompactColors]
 */
interface NoteCompactColorsBuilder {
    /**
     * Устанавливает цвет заголовка [titleColor]
     */
    fun titleColor(titleColor: InteractiveColor): NoteCompactColorsBuilder

    /**
     * Устанавливает цвет заголовка [titleColor]
     */
    fun titleColor(titleColor: Color): NoteCompactColorsBuilder =
        titleColor(titleColor.asInteractive())

    /**
     * Устанавливает цвет текста [textColor]
     */
    fun textColor(textColor: InteractiveColor): NoteCompactColorsBuilder

    /**
     * Устанавливает цвет текста [textColor]
     */
    fun textColor(textColor: Color): NoteCompactColorsBuilder =
        textColor(textColor.asInteractive())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: InteractiveColor): NoteCompactColorsBuilder

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: Color): NoteCompactColorsBuilder =
        iconColor(iconColor.asInteractive())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Brush): NoteCompactColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): NoteCompactColorsBuilder

    /**
     * Устанавливает цвет кнопки закрытия [closeColor].
     */
    fun closeColor(closeColor: Color): NoteCompactColorsBuilder =
        closeColor(closeColor.asInteractive())

    /**
     * Устанавливает цвет кнопки закрытия [closeColor].
     */
    fun closeColor(closeColor: InteractiveColor): NoteCompactColorsBuilder

    /**
     * Вернёт [NoteCompactColors]
     */
    fun build(): NoteCompactColors
}

@Immutable
private data class DefaultNoteCompactColors(
    override val backgroundColor: StatefulValue<Brush>,
    override val closeColor: InteractiveColor,
    override val titleColor: InteractiveColor,
    override val textColor: InteractiveColor,
    override val iconColor: InteractiveColor,
) : NoteCompactColors {

    class Builder : NoteCompactColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var closeColor: InteractiveColor? = null
        private var titleColor: InteractiveColor? = null
        private var textColor: InteractiveColor? = null
        private var iconColor: InteractiveColor? = null

        override fun titleColor(titleColor: InteractiveColor): NoteCompactColorsBuilder = apply {
            this.titleColor = titleColor
        }

        override fun textColor(textColor: InteractiveColor): NoteCompactColorsBuilder = apply {
            this.textColor = textColor
        }

        override fun iconColor(iconColor: InteractiveColor): NoteCompactColorsBuilder = apply {
            this.iconColor = iconColor
        }

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun closeColor(closeColor: InteractiveColor) = apply {
            this.closeColor = closeColor
        }

        override fun build(): NoteCompactColors {
            return DefaultNoteCompactColors(
                backgroundColor = backgroundColor ?: SolidColor(Color.White).asStatefulValue(),
                closeColor = closeColor ?: Color.LightGray.asInteractive(),
                titleColor = titleColor ?: Color.Black.asInteractive(),
                textColor = textColor ?: Color.DarkGray.asInteractive(),
                iconColor = iconColor ?: Color.DarkGray.asInteractive(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface NoteCompactDimensions {
    /**
     * Размер иконки close
     */
    val closeSize: Dp

    /**
     * Размер иконки для contentBefore
     */
    val iconSize: Dp

    /**
     * Отступ вначале иконки close
     */
    val closeStartMargin: Dp

    /**
     * Отступ вконце contentBefore
     */
    val contentBeforeEndMargin: Dp

    /**
     * Отступ между text и title
     */
    val textTopMargin: Dp

    /**
     * Отступ между блоком, содержащим title с text, и action
     */
    val actionStartMargin: Dp

    /**
     * Отступ между action и close
     */
    val actionEndMargin: Dp

    /**
     * Отступ контента в начале
     */
    val paddingStart: Dp

    /**
     * Отступ контента в конце
     */
    val paddingEnd: Dp

    /**
     * Отступ контента сверху
     */
    val paddingTop: Dp

    /**
     * Отступ контента снизу
     */
    val paddingBottom: Dp

    companion object {
        /**
         * Возвращает экземпляр [NoteCompactDimensionsBuilder]
         */
        fun builder(): NoteCompactDimensionsBuilder =
            DefaultNoteCompactDimensions.Builder()
    }
}

/**
 * Builder для [NoteCompactDimensions]
 */
interface NoteCompactDimensionsBuilder {
    /**
     * Устанавливает размер иконки close [closeSize]
     */
    fun closeSize(closeSize: Dp): NoteCompactDimensionsBuilder

    /**
     * Устанавливает размер иконки для contentBefore [iconSize]
     */
    fun iconSize(iconSize: Dp): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ в начале иконки закрытия [closeStartMargin]
     */
    fun closeStartMargin(closeStartMargin: Dp): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ вконце contentBefore [contentBeforeEndMargin]
     */
    fun contentBeforeEndMargin(contentBeforeEndMargin: Dp): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ между text и title [textTopMargin]
     */
    fun textTopMargin(textTopMargin: Dp): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ между блоком, содержащим title с text, и action [actionStartMargin]
     */
    fun actionStartMargin(actionStartMargin: Dp): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ между action и close [actionEndMargin]
     */
    fun actionEndMargin(actionEndMargin: Dp): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): NoteCompactDimensionsBuilder

    /**
     * Создает экземпляр [NoteCompactDimensions]
     */
    fun build(): NoteCompactDimensions
}

private class DefaultNoteCompactDimensions(
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val closeSize: Dp,
    override val iconSize: Dp,
    override val textTopMargin: Dp,
    override val actionStartMargin: Dp,
    override val closeStartMargin: Dp,
    override val contentBeforeEndMargin: Dp,
    override val actionEndMargin: Dp,
) : NoteCompactDimensions {

    class Builder : NoteCompactDimensionsBuilder {

        private var closeSize: Dp? = null
        private var iconSize: Dp? = null
        private var closeStartMargin: Dp? = null
        private var contentBeforeEndMargin: Dp? = null
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var paddingTop: Dp? = null
        private var paddingBottom: Dp? = null
        private var textTopMargin: Dp? = null
        private var actionStartMargin: Dp? = null
        private var actionEndMargin: Dp? = null

        override fun closeSize(closeSize: Dp) = apply {
            this.closeSize = closeSize
        }

        override fun iconSize(iconSize: Dp) = apply {
            this.iconSize = iconSize
        }

        override fun closeStartMargin(closeStartMargin: Dp) = apply {
            this.closeStartMargin = closeStartMargin
        }

        override fun contentBeforeEndMargin(contentBeforeEndMargin: Dp) = apply {
            this.contentBeforeEndMargin = contentBeforeEndMargin
        }

        override fun textTopMargin(textTopMargin: Dp) = apply {
            this.textTopMargin = textTopMargin
        }

        override fun actionStartMargin(actionStartMargin: Dp) = apply {
            this.actionStartMargin = actionStartMargin
        }

        override fun actionEndMargin(actionEndMargin: Dp) = apply {
            this.actionEndMargin = actionEndMargin
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

        override fun build(): NoteCompactDimensions {
            return DefaultNoteCompactDimensions(
                paddingStart = paddingStart ?: 0.dp,
                paddingEnd = paddingEnd ?: 0.dp,
                paddingTop = paddingTop ?: 0.dp,
                paddingBottom = paddingBottom ?: 0.dp,
                closeSize = closeSize ?: 24.dp,
                iconSize = iconSize ?: Dp.Unspecified,
                closeStartMargin = closeStartMargin ?: 0.dp,
                contentBeforeEndMargin = contentBeforeEndMargin ?: 0.dp,
                textTopMargin = textTopMargin ?: 0.dp,
                actionStartMargin = actionStartMargin ?: 0.dp,
                actionEndMargin = actionEndMargin ?: 0.dp,
            )
        }
    }
}
