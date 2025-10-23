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
 * CompositionLocal c [NoteStyle] для компонента [Note]
 */
val LocalNoteStyle = compositionLocalOf(structuralEqualityPolicy()) { NoteStyle.builder().style() }

/**
 * Стиль компонента [Note]
 */
@Immutable
interface NoteStyle : Style {

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
    val colors: NoteColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: NoteDimensions

    companion object {
        /**
         * Возвращает экземпляр [NoteStyleBuilder]
         */
        fun builder(receiver: Any? = null): NoteStyleBuilder = DefaultNoteStyle.Builder()
    }
}

/**
 * Билдер стиля [NoteStyle]
 */
interface NoteStyleBuilder : StyleBuilder<NoteStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): NoteStyleBuilder

    /**
     * Устанавливает расположение [contentBeforeArrangement]
     */
    fun contentBeforeArrangement(contentBeforeArrangement: ContentBeforeVerticalArrangement): NoteStyleBuilder

    /**
     * Устанавливает стиль компонентов LinkButton в компоненте
     */
    fun linkButtonStyle(linkButtonStyle: ButtonStyle): NoteStyleBuilder

    /**
     * Устанавливает стиль заголовка [titleStyle]
     */
    fun titleStyle(titleStyle: TextStyle): NoteStyleBuilder

    /**
     * Устанавливает стиль текста [textStyle]
     */
    fun textStyle(textStyle: TextStyle): NoteStyleBuilder

    /**
     * Устанавливает ресурс иконки close [closeIcon]
     */
    fun closeIcon(@DrawableRes closeIcon: Int): NoteStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(builder: @Composable NoteColorsBuilder.() -> Unit): NoteStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(builder: @Composable NoteDimensionsBuilder.() -> Unit): NoteStyleBuilder
}

private class DefaultNoteStyle(
    override val shape: CornerBasedShape,
    override val contentBeforeArrangement: ContentBeforeVerticalArrangement,
    override val titleStyle: TextStyle,
    override val textStyle: TextStyle,
    override val colors: NoteColors,
    override val dimensions: NoteDimensions,
    override val linkButtonStyle: ButtonStyle,
    override val closeIcon: Int?,
) : NoteStyle {

    class Builder : NoteStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var contentBeforeArrangement: ContentBeforeVerticalArrangement? = null
        private val colorsBuilder = NoteColors.builder()
        private val dimensionsBuilder = NoteDimensions.builder()
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
        override fun colors(builder: @Composable (NoteColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (NoteDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun style(): NoteStyle {
            return DefaultNoteStyle(
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
 * Цвета компонента [Note]
 */
@Immutable
interface NoteColors {
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
         * Возвращает экземпляр [NoteColorsBuilder]
         */
        fun builder(): NoteColorsBuilder =
            DefaultNoteColors.Builder()
    }
}

/**
 * Билдер для [NoteColors]
 */
interface NoteColorsBuilder {
    /**
     * Устанавливает цвет заголовка [titleColor]
     */
    fun titleColor(titleColor: InteractiveColor): NoteColorsBuilder

    /**
     * Устанавливает цвет заголовка [titleColor]
     */
    fun titleColor(titleColor: Color): NoteColorsBuilder =
        titleColor(titleColor.asInteractive())

    /**
     * Устанавливает цвет текста [textColor]
     */
    fun textColor(textColor: InteractiveColor): NoteColorsBuilder

    /**
     * Устанавливает цвет текста [textColor]
     */
    fun textColor(textColor: Color): NoteColorsBuilder =
        textColor(textColor.asInteractive())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: InteractiveColor): NoteColorsBuilder

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: Color): NoteColorsBuilder =
        iconColor(iconColor.asInteractive())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Brush): NoteColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): NoteColorsBuilder

    /**
     * Устанавливает цвет кнопки закрытия [closeColor].
     */
    fun closeColor(closeColor: Color): NoteColorsBuilder =
        closeColor(closeColor.asInteractive())

    /**
     * Устанавливает цвет кнопки закрытия [closeColor].
     */
    fun closeColor(closeColor: InteractiveColor): NoteColorsBuilder

    /**
     * Вернёт [NoteColors]
     */
    fun build(): NoteColors
}

@Immutable
private data class DefaultNoteColors(
    override val backgroundColor: StatefulValue<Brush>,
    override val closeColor: InteractiveColor,
    override val titleColor: InteractiveColor,
    override val textColor: InteractiveColor,
    override val iconColor: InteractiveColor,
) : NoteColors {

    class Builder : NoteColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var closeColor: InteractiveColor? = null
        private var titleColor: InteractiveColor? = null
        private var textColor: InteractiveColor? = null
        private var iconColor: InteractiveColor? = null

        override fun titleColor(titleColor: InteractiveColor): NoteColorsBuilder = apply {
            this.titleColor = titleColor
        }

        override fun textColor(textColor: InteractiveColor): NoteColorsBuilder = apply {
            this.textColor = textColor
        }

        override fun iconColor(iconColor: InteractiveColor): NoteColorsBuilder = apply {
            this.iconColor = iconColor
        }

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun closeColor(closeColor: InteractiveColor) = apply {
            this.closeColor = closeColor
        }

        override fun build(): NoteColors {
            return DefaultNoteColors(
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
interface NoteDimensions {
    /**
     * Размер иконки close
     */
    val closeSize: Dp

    /**
     * Размер иконки для contentBefore
     */
    val iconSize: Dp

    /**
     * Отступ иконки close от верхнего края компонента
     */
    val closeTopMargin: Dp

    /**
     * Отступ иконки close от края в конце компонента
     */
    val closeEndMargin: Dp

    /**
     * Отступ вконце contentBefore
     */
    val contentBeforeEndMargin: Dp

    /**
     * Отступ между text и title
     */
    val textTopMargin: Dp

    /**
     * Отступ между text и action
     */
    val actionTopMargin: Dp

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

    /**
     * Отступ title в конце при наличии иконки закрытия
     */
    val titlePaddingEnd: Dp

    companion object {
        /**
         * Возвращает экземпляр [NoteDimensionsBuilder]
         */
        fun builder(): NoteDimensionsBuilder =
            DefaultNoteDimensions.Builder()
    }
}

/**
 * Builder для [NoteDimensions]
 */
interface NoteDimensionsBuilder {
    /**
     * Устанавливает размер иконки close [closeSize]
     */
    fun closeSize(closeSize: Dp): NoteDimensionsBuilder

    /**
     * Устанавливает размер иконки для contentBefore [iconSize]
     */
    fun iconSize(iconSize: Dp): NoteDimensionsBuilder

    /**
     * Устанавливает отступ иконки закрытия от края [closeSize]
     */
    fun closeTopMargin(closeTopMargin: Dp): NoteDimensionsBuilder

    /**
     * Устанавливает отступ иконки закрытия от края [closeSize]
     */
    fun closeEndMargin(closeEndMargin: Dp): NoteDimensionsBuilder

    /**
     * Устанавливает отступ вконце contentBefore [contentBeforeEndMargin]
     */
    fun contentBeforeEndMargin(contentBeforeEndMargin: Dp): NoteDimensionsBuilder

    /**
     * Устанавливает отступ между text и title [textTopMargin]
     */
    fun textTopMargin(textTopMargin: Dp): NoteDimensionsBuilder

    /**
     * Устанавливает отступ мужду text и action [actionTopMargin]
     */
    fun actionTopMargin(actionTopMargin: Dp): NoteDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): NoteDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): NoteDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): NoteDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): NoteDimensionsBuilder

    /**
     * Устанавливает отступ title в конце при наличии иконки закрытия [titlePaddingEnd]
     */
    fun titlePaddingEnd(titlePaddingEnd: Dp): NoteDimensionsBuilder

    /**
     * Создает экземпляр [NoteDimensions]
     */
    fun build(): NoteDimensions
}

private class DefaultNoteDimensions(
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val closeSize: Dp,
    override val iconSize: Dp,
    override val textTopMargin: Dp,
    override val actionTopMargin: Dp,
    override val closeTopMargin: Dp,
    override val closeEndMargin: Dp,
    override val titlePaddingEnd: Dp,
    override val contentBeforeEndMargin: Dp,
) : NoteDimensions {

    class Builder : NoteDimensionsBuilder {

        private var closeSize: Dp? = null
        private var iconSize: Dp? = null
        private var closeTopMargin: Dp? = null
        private var closeEndMargin: Dp? = null
        private var contentBeforeEndMargin: Dp? = null
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var paddingTop: Dp? = null
        private var paddingBottom: Dp? = null
        private var textTopMargin: Dp? = null
        private var actionTopMargin: Dp? = null
        private var titlePaddingEnd: Dp? = null

        override fun closeSize(closeSize: Dp) = apply {
            this.closeSize = closeSize
        }

        override fun iconSize(iconSize: Dp) = apply {
            this.iconSize = iconSize
        }

        override fun closeTopMargin(closeTopMargin: Dp) = apply {
            this.closeTopMargin = closeTopMargin
        }

        override fun closeEndMargin(closeEndMargin: Dp) = apply {
            this.closeEndMargin = closeEndMargin
        }

        override fun contentBeforeEndMargin(contentBeforeEndMargin: Dp) = apply {
            this.contentBeforeEndMargin = contentBeforeEndMargin
        }

        override fun textTopMargin(textTopMargin: Dp) = apply {
            this.textTopMargin = textTopMargin
        }

        override fun actionTopMargin(actionTopMargin: Dp) = apply {
            this.actionTopMargin = actionTopMargin
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

        override fun titlePaddingEnd(titlePaddingEnd: Dp) = apply {
            this.titlePaddingEnd = titlePaddingEnd
        }

        override fun build(): NoteDimensions {
            return DefaultNoteDimensions(
                paddingStart = paddingStart ?: 0.dp,
                paddingEnd = paddingEnd ?: 0.dp,
                paddingTop = paddingTop ?: 0.dp,
                paddingBottom = paddingBottom ?: 0.dp,
                closeSize = closeSize ?: 24.dp,
                iconSize = iconSize ?: Dp.Unspecified,
                closeTopMargin = closeTopMargin ?: 0.dp,
                closeEndMargin = closeEndMargin ?: 0.dp,
                contentBeforeEndMargin = contentBeforeEndMargin ?: 0.dp,
                textTopMargin = textTopMargin ?: 0.dp,
                actionTopMargin = actionTopMargin ?: 0.dp,
                titlePaddingEnd = titlePaddingEnd ?: 0.dp,
            )
        }
    }
}
