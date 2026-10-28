package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.annotations.DrawableRes
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
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
    @Deprecated("Use shapes", replaceWith = ReplaceWith("shapes"))
    val shape: CornerBasedShape

    /**
     * Форма компонента
     */
    val shapes: StatefulValue<CornerBasedShape>

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
    @Deprecated("Use titleStyles", replaceWith = ReplaceWith("titleStyles"))
    val titleStyle: TextStyle

    /**
     * Стиль заголовка
     */
    val titleStyles: StatefulValue<TextStyle>

    /**
     * Стиль текста
     */
    @Deprecated("Use textStyles", replaceWith = ReplaceWith("textStyles"))
    val textStyle: TextStyle

    /**
     * Стиль текста
     */
    val textStyles: StatefulValue<TextStyle>

    /**
     * Ресурс иконки close
     */
    @Deprecated("Use closeIconSource", replaceWith = ReplaceWith("closeIconSource"))
    @get:DrawableRes
    val closeIcon: Int?
        get() = null

    /**
     * Источник изображения иконки close
     */
    val closeIconSource: ImageSource?
        get() = null

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
@ApiInfo
interface NoteStyleBuilder : StyleBuilder<NoteStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): NoteStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): NoteStyleBuilder

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
    fun titleStyle(titleStyle: TextStyle): NoteStyleBuilder =
        titleStyle(titleStyle.asStatefulValue())

    /**
     * Устанавливает стиль заголовка [titleStyle]
     */
    fun titleStyle(titleStyle: StatefulValue<TextStyle>): NoteStyleBuilder

    /**
     * Устанавливает стиль текста [textStyle]
     */
    fun textStyle(textStyle: TextStyle): NoteStyleBuilder =
        textStyle(textStyle.asStatefulValue())

    /**
     * Устанавливает стиль текста [textStyle]
     */
    fun textStyle(textStyle: StatefulValue<TextStyle>): NoteStyleBuilder

    /**
     * Устанавливает источник изображения иконки close [closeIcon]
     */
    fun closeIcon(closeIcon: ImageSource): NoteStyleBuilder

    /**
     * Устанавливает ресурс иконки close [closeIcon]
     */
    @Deprecated(
        "Use closeIcon with ImageSource",
        replaceWith = ReplaceWith("closeIcon(closeIcon)"),
        level = DeprecationLevel.ERROR,
    )
    fun closeIcon(@DrawableRes closeIcon: Int): NoteStyleBuilder = this

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
    override val shapes: StatefulValue<CornerBasedShape>,
    override val contentBeforeArrangement: ContentBeforeVerticalArrangement,
    override val titleStyles: StatefulValue<TextStyle>,
    override val textStyles: StatefulValue<TextStyle>,
    override val colors: NoteColors,
    override val dimensions: NoteDimensions,
    override val linkButtonStyle: ButtonStyle,
    override val closeIconSource: ImageSource?,
) : NoteStyle {
    @Deprecated("Use closeIconSource", replaceWith = ReplaceWith("closeIconSource"))
    override val closeIcon: Int? = null

    @Deprecated("Use shapes", replaceWith = ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()

    @Deprecated("Use titleStyles", replaceWith = ReplaceWith("titleStyles"))
    override val titleStyle: TextStyle = titleStyles.getDefaultValue()

    @Deprecated("Use textStyles", replaceWith = ReplaceWith("textStyles"))
    override val textStyle: TextStyle = textStyles.getDefaultValue()

    class Builder : NoteStyleBuilder {
        private var shape: StatefulValue<CornerBasedShape>? = null
        private var contentBeforeArrangement: ContentBeforeVerticalArrangement? = null
        private val colorsBuilder = NoteColors.builder()
        private val dimensionsBuilder = NoteDimensions.builder()
        private var titleStyle: StatefulValue<TextStyle>? = null
        private var textStyle: StatefulValue<TextStyle>? = null
        private var linkButtonStyle: ButtonStyle? = null
        private var closeIconSource: ImageSource? = null

        override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
            this.shape = shape
        }

        override fun contentBeforeArrangement(contentBeforeArrangement: ContentBeforeVerticalArrangement) = apply {
            this.contentBeforeArrangement = contentBeforeArrangement
        }

        override fun linkButtonStyle(linkButtonStyle: ButtonStyle) = apply {
            this.linkButtonStyle = linkButtonStyle
        }

        override fun titleStyle(titleStyle: StatefulValue<TextStyle>) = apply {
            this.titleStyle = titleStyle
        }

        override fun textStyle(textStyle: StatefulValue<TextStyle>) = apply {
            this.textStyle = textStyle
        }

        override fun closeIcon(closeIcon: ImageSource) = apply {
            this.closeIconSource = closeIcon
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
                shapes = shape ?: RoundedCornerShape(15).asStatefulValue(),
                contentBeforeArrangement = contentBeforeArrangement ?: ContentBeforeVerticalArrangement.Top,
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                titleStyles = titleStyle ?: TextStyle.Default.asStatefulValue(),
                textStyles = textStyle ?: TextStyle.Default.asStatefulValue(),
                linkButtonStyle = linkButtonStyle ?: ButtonStyle.linkButtonBuilder().style(),
                closeIconSource = closeIconSource,
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
    @Deprecated("Use titleBrush", replaceWith = ReplaceWith("titleBrush"))
    val titleColor: InteractiveColor

    /**
     * Цвет заголовка
     */
    val titleBrush: StatefulValue<Brush>

    /**
     * Цвет текста
     */
    @Deprecated("Use textBrush", replaceWith = ReplaceWith("textBrush"))
    val textColor: InteractiveColor

    /**
     * Цвет текста
     */
    val textBrush: StatefulValue<Brush>

    /**
     * Цвет иконки
     */
    @Deprecated("Use iconBrush", replaceWith = ReplaceWith("iconBrush"))
    val iconColor: InteractiveColor

    /**
     * Цвет иконки
     */
    val iconBrush: StatefulValue<Brush>

    /**
     * Цвет иконки disclosure
     */
    @Deprecated("Use disclosureBrush", replaceWith = ReplaceWith("disclosureBrush"))
    val disclosureColor: InteractiveColor

    /**
     * Цвет иконки disclosure
     */
    val disclosureBrush: StatefulValue<Brush>

    /**
     * Цвет фона
     */
    val backgroundColor: StatefulValue<Brush>

    /**
     * Цвет кнопки закрытия
     */
    @Deprecated("Use closeBrush", replaceWith = ReplaceWith("closeBrush"))
    val closeColor: InteractiveColor

    /**
     * Цвет кнопки закрытия
     */
    val closeBrush: StatefulValue<Brush>

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
    fun titleColor(titleColor: InteractiveColor): NoteColorsBuilder =
        titleColor(titleColor.asStatefulBrush())

    /**
     * Устанавливает цвет заголовка [titleColor]
     */
    fun titleColor(titleColor: Color): NoteColorsBuilder =
        titleColor(titleColor.asStatefulBrush())

    /**
     * Устанавливает цвет заголовка [titleColor]
     */
    fun titleColor(titleColor: Brush): NoteColorsBuilder =
        titleColor(titleColor.asStatefulValue())

    /**
     * Устанавливает цвет заголовка [titleColor]
     */
    fun titleColor(titleColor: StatefulValue<Brush>): NoteColorsBuilder

    /**
     * Устанавливает цвет текста [textColor]
     */
    fun textColor(textColor: InteractiveColor): NoteColorsBuilder =
        textColor(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста [textColor]
     */
    fun textColor(textColor: Color): NoteColorsBuilder =
        textColor(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста [textColor]
     */
    fun textColor(textColor: Brush): NoteColorsBuilder =
        textColor(textColor.asStatefulValue())

    /**
     * Устанавливает цвет текста [textColor]
     */
    fun textColor(textColor: StatefulValue<Brush>): NoteColorsBuilder

    /**
     * Устанавливает цвет иконки disclosure [disclosureColor]
     */
    fun disclosureColor(disclosureColor: InteractiveColor): NoteColorsBuilder =
        disclosureColor(disclosureColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки disclosure[disclosureColor]
     */
    fun disclosureColor(disclosureColor: Color): NoteColorsBuilder =
        disclosureColor(disclosureColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки disclosure [disclosureColor]
     */
    fun disclosureColor(disclosureColor: Brush): NoteColorsBuilder =
        disclosureColor(disclosureColor.asStatefulValue())

    /**
     * Устанавливает цвет иконки disclosure [disclosureColor]
     */
    fun disclosureColor(disclosureColor: StatefulValue<Brush>): NoteColorsBuilder

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: InteractiveColor): NoteColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: Color): NoteColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: Brush): NoteColorsBuilder =
        iconColor(iconColor.asStatefulValue())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: StatefulValue<Brush>): NoteColorsBuilder

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: InteractiveColor): NoteColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Color): NoteColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

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
        closeColor(closeColor.asStatefulBrush())

    /**
     * Устанавливает цвет кнопки закрытия [closeColor].
     */
    fun closeColor(closeColor: InteractiveColor): NoteColorsBuilder =
        closeColor(closeColor.asStatefulBrush())

    /**
     * Устанавливает цвет кнопки закрытия [closeColor].
     */
    fun closeColor(closeColor: Brush): NoteColorsBuilder =
        closeColor(closeColor.asStatefulValue())

    /**
     * Устанавливает цвет кнопки закрытия [closeColor].
     */
    fun closeColor(closeColor: StatefulValue<Brush>): NoteColorsBuilder

    /**
     * Вернёт [NoteColors]
     */
    fun build(): NoteColors
}

@Immutable
private data class DefaultNoteColors(
    override val backgroundColor: StatefulValue<Brush>,
    override val closeBrush: StatefulValue<Brush>,
    override val titleBrush: StatefulValue<Brush>,
    override val textBrush: StatefulValue<Brush>,
    override val iconBrush: StatefulValue<Brush>,
    override val disclosureBrush: StatefulValue<Brush>,

) : NoteColors {
    @Deprecated("Use closeBrush", replaceWith = ReplaceWith("closeBrush"))
    override val closeColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use titleBrush", replaceWith = ReplaceWith("titleBrush"))
    override val titleColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use textBrush", replaceWith = ReplaceWith("textBrush"))
    override val textColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use iconBrush", replaceWith = ReplaceWith("iconBrush"))
    override val iconColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use disclosureBrush", replaceWith = ReplaceWith("disclosureBrush"))
    override val disclosureColor: InteractiveColor = Color.Transparent.asInteractive()
    class Builder : NoteColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var closeColor: StatefulValue<Brush>? = null
        private var titleColor: StatefulValue<Brush>? = null
        private var textColor: StatefulValue<Brush>? = null
        private var iconColor: StatefulValue<Brush>? = null
        private var disclosureColor: StatefulValue<Brush>? = null

        override fun titleColor(titleColor: StatefulValue<Brush>): NoteColorsBuilder = apply {
            this.titleColor = titleColor
        }

        override fun textColor(textColor: StatefulValue<Brush>): NoteColorsBuilder = apply {
            this.textColor = textColor
        }

        override fun iconColor(iconColor: StatefulValue<Brush>): NoteColorsBuilder = apply {
            this.iconColor = iconColor
        }

        override fun disclosureColor(disclosureColor: StatefulValue<Brush>): NoteColorsBuilder = apply {
            this.disclosureColor = disclosureColor
        }

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun closeColor(closeColor: StatefulValue<Brush>) = apply {
            this.closeColor = closeColor
        }

        override fun build(): NoteColors {
            return DefaultNoteColors(
                backgroundColor = backgroundColor ?: Color.White.asStatefulBrush(),
                closeBrush = closeColor ?: Color.LightGray.asStatefulBrush(),
                titleBrush = titleColor ?: Color.Black.asStatefulBrush(),
                textBrush = textColor ?: Color.DarkGray.asStatefulBrush(),
                iconBrush = iconColor ?: Color.DarkGray.asStatefulBrush(),
                disclosureBrush = disclosureColor ?: Color.DarkGray.asStatefulBrush(),
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
    @Deprecated("Use closeSizeValues", replaceWith = ReplaceWith("closeSizeValues"))
    val closeSize: Dp

    /**
     * Размер иконки close
     */
    val closeSizeValues: StatefulValue<Dp>

    /**
     * Размер иконки для contentBefore
     */
    @Deprecated("Use iconSizeValues", replaceWith = ReplaceWith("iconSizeValues"))
    val iconSize: Dp

    /**
     * Размер иконки для contentBefore
     */
    val iconSizeValues: StatefulValue<Dp>

    /**
     * Размер иконки для contentAfter
     */
    @Deprecated("Use disclosureSizeValues", replaceWith = ReplaceWith("disclosureSizeValues"))
    val disclosureSize: Dp

    /**
     * Размер иконки для contentAfter
     */
    val disclosureSizeValues: StatefulValue<Dp>

    /**
     * Отступ иконки close от верхнего края компонента
     */
    @Deprecated("Use closeTopMarginValues", replaceWith = ReplaceWith("closeTopMarginValues"))
    val closeTopMargin: Dp

    /**
     * Отступ иконки close от верхнего края компонента
     */
    val closeTopMarginValues: StatefulValue<Dp>

    /**
     * Отступ иконки close от края в конце компонента
     */
    @Deprecated("Use closeEndMarginValues", replaceWith = ReplaceWith("closeEndMarginValues"))
    val closeEndMargin: Dp

    /**
     * Отступ иконки close от края в конце компонента
     */
    val closeEndMarginValues: StatefulValue<Dp>

    /**
     * Отступ вконце contentBefore
     */
    @Deprecated(
        "Use contentBeforeEndMarginValues",
        replaceWith = ReplaceWith("contentBeforeEndMarginValues"),
    )
    val contentBeforeEndMargin: Dp

    /**
     * Отступ вконце contentBefore
     */
    val contentBeforeEndMarginValues: StatefulValue<Dp>

    /**
     * Отступ вначле contentAfter
     */
    @Deprecated(
        "Use contentAfterStartMarginValues",
        replaceWith = ReplaceWith("contentAfterStartMarginValues"),
    )
    val contentAfterStartMargin: Dp

    /**
     * Отступ вначле contentAfter
     */
    val contentAfterStartMarginValues: StatefulValue<Dp>

    /**
     * Отступ вконце contentAfter
     */
    @Deprecated(
        "Use contentAfterEndMarginValues",
        replaceWith = ReplaceWith("contentAfterEndMarginValues"),
    )
    val contentAfterEndMargin: Dp

    /**
     * Отступ вконце contentAfter
     */
    val contentAfterEndMarginValues: StatefulValue<Dp>

    /**
     * Отступ между text и title
     */
    @Deprecated(
        "Use textTopMarginValues",
        replaceWith = ReplaceWith("textTopMarginValues"),
    )
    val textTopMargin: Dp

    /**
     * Отступ между text и title
     */
    val textTopMarginValues: StatefulValue<Dp>

    /**
     * Отступ между text и action
     */
    @Deprecated(
        "Use actionTopMarginValues",
        replaceWith = ReplaceWith("actionTopMarginValues"),
    )
    val actionTopMargin: Dp

    /**
     * Отступ между text и action
     */
    val actionTopMarginValues: StatefulValue<Dp>

    /**
     * Отступ контента в начале
     */
    @Deprecated("Use paddingStartValues", replaceWith = ReplaceWith("paddingStartValues"))
    val paddingStart: Dp

    /**
     * Отступ контента в начале
     */
    val paddingStartValues: StatefulValue<Dp>

    /**
     * Отступ контента в конце
     */
    @Deprecated("Use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
    val paddingEnd: Dp

    /**
     * Отступ контента в конце
     */
    val paddingEndValues: StatefulValue<Dp>

    /**
     * Отступ контента сверху
     */
    @Deprecated("Use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
    val paddingTop: Dp

    /**
     * Отступ контента сверху
     */
    val paddingTopValues: StatefulValue<Dp>

    /**
     * Отступ контента снизу
     */
    @Deprecated("Use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
    val paddingBottom: Dp

    /**
     * Отступ контента снизу
     */
    val paddingBottomValues: StatefulValue<Dp>

    /**
     * Отступ title в конце при наличии иконки закрытия
     */
    @Deprecated("Use titlePaddingEndValues", replaceWith = ReplaceWith("titlePaddingEndValues"))
    val titlePaddingEnd: Dp

    /**
     * Отступ title в конце при наличии иконки закрытия
     */
    val titlePaddingEndValues: StatefulValue<Dp>

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
    fun closeSize(closeSize: Dp): NoteDimensionsBuilder =
        closeSize(closeSize.asStatefulValue())

    /**
     * Устанавливает размер иконки close [closeSize]
     */
    fun closeSize(closeSize: StatefulValue<Dp>): NoteDimensionsBuilder

    /**
     * Устанавливает размер иконки для contentBefore [iconSize]
     */
    fun iconSize(iconSize: Dp): NoteDimensionsBuilder =
        iconSize(iconSize.asStatefulValue())

    /**
     * Устанавливает размер иконки для contentBefore [iconSize]
     */
    fun iconSize(iconSize: StatefulValue<Dp>): NoteDimensionsBuilder

    /**
     * Устанавливает размер иконки для contentAfter [disclosureSize]
     */
    fun disclosureSize(disclosureSize: Dp): NoteDimensionsBuilder =
        disclosureSize(disclosureSize.asStatefulValue())

    /**
     * Устанавливает размер иконки для contentAfter [disclosureSize]
     */
    fun disclosureSize(disclosureSize: StatefulValue<Dp>): NoteDimensionsBuilder

    /**
     * Устанавливает отступ иконки закрытия от края [closeSize]
     */
    fun closeTopMargin(closeTopMargin: Dp): NoteDimensionsBuilder =
        closeTopMargin(closeTopMargin.asStatefulValue())

    /**
     * Устанавливает отступ иконки закрытия от края [closeSize]
     */
    fun closeTopMargin(closeTopMargin: StatefulValue<Dp>): NoteDimensionsBuilder

    /**
     * Устанавливает отступ иконки закрытия от края [closeSize]
     */
    fun closeEndMargin(closeEndMargin: Dp): NoteDimensionsBuilder =
        closeEndMargin(closeEndMargin.asStatefulValue())

    /**
     * Устанавливает отступ иконки закрытия от края [closeSize]
     */
    fun closeEndMargin(closeEndMargin: StatefulValue<Dp>): NoteDimensionsBuilder

    /**
     * Устанавливает отступ вконце contentBefore [contentBeforeEndMargin]
     */
    fun contentBeforeEndMargin(contentBeforeEndMargin: Dp): NoteDimensionsBuilder =
        contentBeforeEndMargin(contentBeforeEndMargin.asStatefulValue())

    /**
     * Устанавливает отступ вконце contentBefore [contentBeforeEndMargin]
     */
    fun contentBeforeEndMargin(contentBeforeEndMargin: StatefulValue<Dp>): NoteDimensionsBuilder

    /**
     * Устанавливает отступ вначале contentAfter [contentAfterStartMargin]
     */
    fun contentAfterStartMargin(contentAfterStartMargin: Dp): NoteDimensionsBuilder =
        contentAfterStartMargin(contentAfterStartMargin.asStatefulValue())

    /**
     * Устанавливает отступ вначале contentAfter [contentAfterStartMargin]
     */
    fun contentAfterStartMargin(contentAfterStartMargin: StatefulValue<Dp>): NoteDimensionsBuilder

    /**
     * Устанавливает отступ вконце contentAfter [contentAfterEndMargin]
     */
    fun contentAfterEndMargin(contentAfterEndMargin: Dp): NoteDimensionsBuilder =
        contentAfterEndMargin(contentAfterEndMargin.asStatefulValue())

    /**
     * Устанавливает отступ вконце contentAfter [contentAfterEndMargin]
     */
    fun contentAfterEndMargin(contentAfterEndMargin: StatefulValue<Dp>): NoteDimensionsBuilder

    /**
     * Устанавливает отступ между text и title [textTopMargin]
     */
    fun textTopMargin(textTopMargin: Dp): NoteDimensionsBuilder =
        textTopMargin(textTopMargin.asStatefulValue())

    /**
     * Устанавливает отступ между text и title [textTopMargin]
     */
    fun textTopMargin(textTopMargin: StatefulValue<Dp>): NoteDimensionsBuilder

    /**
     * Устанавливает отступ мужду text и action [actionTopMargin]
     */
    fun actionTopMargin(actionTopMargin: Dp): NoteDimensionsBuilder =
        actionTopMargin(actionTopMargin.asStatefulValue())

    /**
     * Устанавливает отступ мужду text и action [actionTopMargin]
     */
    fun actionTopMargin(actionTopMargin: StatefulValue<Dp>): NoteDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): NoteDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): NoteDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): NoteDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): NoteDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): NoteDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): NoteDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): NoteDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): NoteDimensionsBuilder

    /**
     * Устанавливает отступ title в конце при наличии иконки закрытия [titlePaddingEnd]
     */
    fun titlePaddingEnd(titlePaddingEnd: Dp): NoteDimensionsBuilder =
        titlePaddingEnd(titlePaddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ title в конце при наличии иконки закрытия [titlePaddingEnd]
     */
    fun titlePaddingEnd(titlePaddingEnd: StatefulValue<Dp>): NoteDimensionsBuilder

    /**
     * Создает экземпляр [NoteDimensions]
     */
    fun build(): NoteDimensions
}

@Suppress("CyclomaticComplexMethod")
private class DefaultNoteDimensions(
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,
    override val closeSizeValues: StatefulValue<Dp>,
    override val iconSizeValues: StatefulValue<Dp>,
    override val textTopMarginValues: StatefulValue<Dp>,
    override val actionTopMarginValues: StatefulValue<Dp>,
    override val closeTopMarginValues: StatefulValue<Dp>,
    override val closeEndMarginValues: StatefulValue<Dp>,
    override val titlePaddingEndValues: StatefulValue<Dp>,
    override val contentBeforeEndMarginValues: StatefulValue<Dp>,
    override val disclosureSizeValues: StatefulValue<Dp>,
    override val contentAfterEndMarginValues: StatefulValue<Dp>,
    override val contentAfterStartMarginValues: StatefulValue<Dp>,

) : NoteDimensions {
    @Deprecated("Use paddingStartValues", replaceWith = ReplaceWith("paddingStartValues"))
    override val paddingStart: Dp = paddingStartValues.getDefaultValue()

    @Deprecated("Use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
    override val paddingEnd: Dp = paddingEndValues.getDefaultValue()

    @Deprecated("Use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
    override val paddingTop: Dp = paddingTopValues.getDefaultValue()

    @Deprecated("Use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
    override val paddingBottom: Dp = paddingBottomValues.getDefaultValue()

    @Deprecated("Use closeSizeValues", replaceWith = ReplaceWith("closeSizeValues"))
    override val closeSize: Dp = closeSizeValues.getDefaultValue()

    @Deprecated("Use iconSizeValues", replaceWith = ReplaceWith("iconSizeValues"))
    override val iconSize: Dp = iconSizeValues.getDefaultValue()

    @Deprecated("Use textTopMarginValues", replaceWith = ReplaceWith("textTopMarginValues"))
    override val textTopMargin: Dp = textTopMarginValues.getDefaultValue()

    @Deprecated("Use actionTopMarginValues", replaceWith = ReplaceWith("actionTopMarginValues"))
    override val actionTopMargin: Dp = actionTopMarginValues.getDefaultValue()

    @Deprecated("Use closeTopMarginValues", replaceWith = ReplaceWith("closeTopMarginValues"))
    override val closeTopMargin: Dp = closeTopMarginValues.getDefaultValue()

    @Deprecated("Use closeEndMarginValues", replaceWith = ReplaceWith("closeEndMarginValues"))
    override val closeEndMargin: Dp = closeEndMarginValues.getDefaultValue()

    @Deprecated("Use titlePaddingEndValues", replaceWith = ReplaceWith("titlePaddingEndValues"))
    override val titlePaddingEnd: Dp = titlePaddingEndValues.getDefaultValue()

    @Deprecated(
        "Use contentBeforeEndMarginValues",
        replaceWith = ReplaceWith("contentBeforeEndMarginValues"),
    )
    override val contentBeforeEndMargin: Dp = contentBeforeEndMarginValues.getDefaultValue()

    @Deprecated("Use disclosureSizeValues", replaceWith = ReplaceWith("disclosureSizeValues"))
    override val disclosureSize: Dp = disclosureSizeValues.getDefaultValue()

    @Deprecated(
        "Use contentAfterEndMarginValues",
        replaceWith = ReplaceWith("contentAfterEndMarginValues"),
    )
    override val contentAfterEndMargin: Dp = contentAfterEndMarginValues.getDefaultValue()

    @Deprecated(
        "Use contentAfterStartMarginValues",
        replaceWith = ReplaceWith("contentAfterStartMarginValues"),
    )
    override val contentAfterStartMargin: Dp = contentAfterStartMarginValues.getDefaultValue()
    class Builder : NoteDimensionsBuilder {

        private var closeSize: StatefulValue<Dp>? = null
        private var iconSize: StatefulValue<Dp>? = null
        private var disclosureSize: StatefulValue<Dp>? = null
        private var closeTopMargin: StatefulValue<Dp>? = null
        private var closeEndMargin: StatefulValue<Dp>? = null
        private var contentBeforeEndMargin: StatefulValue<Dp>? = null
        private var contentAfterStartMargin: StatefulValue<Dp>? = null
        private var contentAfterEndMargin: StatefulValue<Dp>? = null
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null
        private var textTopMargin: StatefulValue<Dp>? = null
        private var actionTopMargin: StatefulValue<Dp>? = null
        private var titlePaddingEnd: StatefulValue<Dp>? = null

        override fun closeSize(closeSize: StatefulValue<Dp>) = apply {
            this.closeSize = closeSize
        }

        override fun iconSize(iconSize: StatefulValue<Dp>) = apply {
            this.iconSize = iconSize
        }

        override fun disclosureSize(disclosureSize: StatefulValue<Dp>) = apply {
            this.disclosureSize = disclosureSize
        }

        override fun closeTopMargin(closeTopMargin: StatefulValue<Dp>) = apply {
            this.closeTopMargin = closeTopMargin
        }

        override fun closeEndMargin(closeEndMargin: StatefulValue<Dp>) = apply {
            this.closeEndMargin = closeEndMargin
        }

        override fun contentBeforeEndMargin(contentBeforeEndMargin: StatefulValue<Dp>) = apply {
            this.contentBeforeEndMargin = contentBeforeEndMargin
        }

        override fun contentAfterStartMargin(contentAfterStartMargin: StatefulValue<Dp>) = apply {
            this.contentAfterStartMargin = contentAfterStartMargin
        }

        override fun contentAfterEndMargin(contentAfterEndMargin: StatefulValue<Dp>) = apply {
            this.contentAfterEndMargin = contentAfterEndMargin
        }

        override fun textTopMargin(textTopMargin: StatefulValue<Dp>) = apply {
            this.textTopMargin = textTopMargin
        }

        override fun actionTopMargin(actionTopMargin: StatefulValue<Dp>) = apply {
            this.actionTopMargin = actionTopMargin
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: StatefulValue<Dp>) = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun titlePaddingEnd(titlePaddingEnd: StatefulValue<Dp>) = apply {
            this.titlePaddingEnd = titlePaddingEnd
        }

        override fun build(): NoteDimensions {
            return DefaultNoteDimensions(
                paddingStartValues = paddingStart ?: 0.dp.asStatefulValue(),
                paddingEndValues = paddingEnd ?: 0.dp.asStatefulValue(),
                paddingTopValues = paddingTop ?: 0.dp.asStatefulValue(),
                paddingBottomValues = paddingBottom ?: 0.dp.asStatefulValue(),
                closeSizeValues = closeSize ?: 24.dp.asStatefulValue(),
                iconSizeValues = iconSize ?: Dp.Unspecified.asStatefulValue(),
                disclosureSizeValues = disclosureSize ?: Dp.Unspecified.asStatefulValue(),
                closeTopMarginValues = closeTopMargin ?: 0.dp.asStatefulValue(),
                closeEndMarginValues = closeEndMargin ?: 0.dp.asStatefulValue(),
                contentBeforeEndMarginValues = contentBeforeEndMargin ?: 0.dp.asStatefulValue(),
                contentAfterEndMarginValues = contentAfterEndMargin ?: 0.dp.asStatefulValue(),
                contentAfterStartMarginValues = contentAfterStartMargin ?: 0.dp.asStatefulValue(),
                textTopMarginValues = textTopMargin ?: 0.dp.asStatefulValue(),
                actionTopMarginValues = actionTopMargin ?: 0.dp.asStatefulValue(),
                titlePaddingEndValues = titlePaddingEnd ?: 0.dp.asStatefulValue(),
            )
        }
    }
}
