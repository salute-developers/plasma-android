package com.sdds.compose.uikit

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
@ApiInfo
interface NoteCompactStyleBuilder : StyleBuilder<NoteCompactStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): NoteCompactStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): NoteCompactStyleBuilder

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
    fun titleStyle(titleStyle: TextStyle): NoteCompactStyleBuilder =
        titleStyle(titleStyle.asStatefulValue())

    /**
     * Устанавливает стиль заголовка [titleStyle]
     */
    fun titleStyle(titleStyle: StatefulValue<TextStyle>): NoteCompactStyleBuilder

    /**
     * Устанавливает стиль текста [textStyle]
     */
    fun textStyle(textStyle: TextStyle): NoteCompactStyleBuilder =
        textStyle(textStyle.asStatefulValue())

    /**
     * Устанавливает стиль текста [textStyle]
     */
    fun textStyle(textStyle: StatefulValue<TextStyle>): NoteCompactStyleBuilder

    /**
     * Устанавливает источник изображения иконки close [closeIcon]
     */
    fun closeIcon(closeIcon: ImageSource): NoteCompactStyleBuilder

    /**
     * Устанавливает ресурс иконки close [closeIcon]
     */
    @Deprecated(
        "Use closeIcon with ImageSource",
        replaceWith = ReplaceWith("closeIcon(closeIcon)"),
        level = DeprecationLevel.ERROR,
    )
    fun closeIcon(@DrawableRes closeIcon: Int): NoteCompactStyleBuilder = this

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
    override val contentBeforeArrangement: ContentBeforeVerticalArrangement,
    override val colors: NoteCompactColors,
    override val dimensions: NoteCompactDimensions,
    override val linkButtonStyle: ButtonStyle,
    override val closeIconSource: ImageSource?,
    override val shapes: StatefulValue<CornerBasedShape>,
    override val titleStyles: StatefulValue<TextStyle>,
    override val textStyles: StatefulValue<TextStyle>,
) : NoteCompactStyle {
    @Deprecated("Use closeIconSource", replaceWith = ReplaceWith("closeIconSource"))
    override val closeIcon: Int? = null

    @Deprecated("Use shapes", replaceWith = ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()

    @Deprecated("Use titleStyles", replaceWith = ReplaceWith("titleStyles"))
    override val titleStyle: TextStyle = titleStyles.getDefaultValue()

    @Deprecated("Use textStyles", replaceWith = ReplaceWith("textStyles"))
    override val textStyle: TextStyle = textStyles.getDefaultValue()

    class Builder : NoteCompactStyleBuilder {
        private var shape: StatefulValue<CornerBasedShape>? = null
        private var contentBeforeArrangement: ContentBeforeVerticalArrangement? = null
        private val colorsBuilder = NoteCompactColors.builder()
        private val dimensionsBuilder = NoteCompactDimensions.builder()
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
 * Цвета компонента [NoteCompact]
 */
@Immutable
interface NoteCompactColors {
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
    fun titleColor(titleColor: InteractiveColor): NoteCompactColorsBuilder =
        titleColor(titleColor.asStatefulBrush())

    /**
     * Устанавливает цвет заголовка [titleColor]
     */
    fun titleColor(titleColor: Color): NoteCompactColorsBuilder =
        titleColor(titleColor.asStatefulBrush())

    /**
     * Устанавливает цвет заголовка [titleColor]
     */
    fun titleColor(titleColor: Brush): NoteCompactColorsBuilder =
        titleColor(titleColor.asStatefulValue())

    /**
     * Устанавливает цвет заголовка [titleColor]
     */
    fun titleColor(titleColor: StatefulValue<Brush>): NoteCompactColorsBuilder

    /**
     * Устанавливает цвет текста [textColor]
     */
    fun textColor(textColor: InteractiveColor): NoteCompactColorsBuilder =
        textColor(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста [textColor]
     */
    fun textColor(textColor: Color): NoteCompactColorsBuilder =
        textColor(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста [textColor]
     */
    fun textColor(textColor: Brush): NoteCompactColorsBuilder =
        textColor(textColor.asStatefulValue())

    /**
     * Устанавливает цвет текста [textColor]
     */
    fun textColor(textColor: StatefulValue<Brush>): NoteCompactColorsBuilder

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: InteractiveColor): NoteCompactColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: Color): NoteCompactColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: Brush): NoteCompactColorsBuilder =
        iconColor(iconColor.asStatefulValue())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: StatefulValue<Brush>): NoteCompactColorsBuilder

    /**
     * Устанавливает цвет иконки disclosure [disclosureColor]
     */
    fun disclosureColor(disclosureColor: InteractiveColor): NoteCompactColorsBuilder =
        disclosureColor(disclosureColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки disclosure[disclosureColor]
     */
    fun disclosureColor(disclosureColor: Color): NoteCompactColorsBuilder =
        disclosureColor(disclosureColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки disclosure [disclosureColor]
     */
    fun disclosureColor(disclosureColor: Brush): NoteCompactColorsBuilder =
        disclosureColor(disclosureColor.asStatefulValue())

    /**
     * Устанавливает цвет иконки disclosure [disclosureColor]
     */
    fun disclosureColor(disclosureColor: StatefulValue<Brush>): NoteCompactColorsBuilder

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
        closeColor(closeColor.asStatefulBrush())

    /**
     * Устанавливает цвет кнопки закрытия [closeColor].
     */
    fun closeColor(closeColor: InteractiveColor): NoteCompactColorsBuilder =
        closeColor(closeColor.asStatefulBrush())

    /**
     * Устанавливает цвет кнопки закрытия [closeColor].
     */
    fun closeColor(closeColor: Brush): NoteCompactColorsBuilder =
        closeColor(closeColor.asStatefulValue())

    /**
     * Устанавливает цвет кнопки закрытия [closeColor].
     */
    fun closeColor(closeColor: StatefulValue<Brush>): NoteCompactColorsBuilder

    /**
     * Вернёт [NoteCompactColors]
     */
    fun build(): NoteCompactColors
}

@Immutable
private data class DefaultNoteCompactColors(
    override val backgroundColor: StatefulValue<Brush>,
    override val closeBrush: StatefulValue<Brush>,
    override val titleBrush: StatefulValue<Brush>,
    override val textBrush: StatefulValue<Brush>,
    override val iconBrush: StatefulValue<Brush>,
    override val disclosureBrush: StatefulValue<Brush>,
) : NoteCompactColors {

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

    class Builder : NoteCompactColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var closeColor: StatefulValue<Brush>? = null
        private var titleColor: StatefulValue<Brush>? = null
        private var textColor: StatefulValue<Brush>? = null
        private var iconColor: StatefulValue<Brush>? = null
        private var disclosureColor: StatefulValue<Brush>? = null

        override fun titleColor(titleColor: StatefulValue<Brush>): NoteCompactColorsBuilder = apply {
            this.titleColor = titleColor
        }

        override fun textColor(textColor: StatefulValue<Brush>): NoteCompactColorsBuilder = apply {
            this.textColor = textColor
        }

        override fun iconColor(iconColor: StatefulValue<Brush>): NoteCompactColorsBuilder = apply {
            this.iconColor = iconColor
        }

        override fun disclosureColor(disclosureColor: StatefulValue<Brush>): NoteCompactColorsBuilder = apply {
            this.disclosureColor = disclosureColor
        }

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun closeColor(closeColor: StatefulValue<Brush>) = apply {
            this.closeColor = closeColor
        }

        override fun build(): NoteCompactColors {
            return DefaultNoteCompactColors(
                backgroundColor = backgroundColor ?: SolidColor(Color.White).asStatefulValue(),
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
interface NoteCompactDimensions {
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
    val closeStartMargin: Dp

    /**
     * Отступ иконки close от верхнего края компонента
     */
    val closeStartMarginValues: StatefulValue<Dp>

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
    val actionStartMargin: Dp

    /**
     * Отступ между text и action
     */
    val actionStartMarginValues: StatefulValue<Dp>

    /**
     * Отступ между text и action
     */
    @Deprecated(
        "Use actionTopMarginValues",
        replaceWith = ReplaceWith("actionTopMarginValues"),
    )
    val actionEndMargin: Dp

    /**
     * Отступ между text и action
     */
    val actionEndMarginValues: StatefulValue<Dp>

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
    fun closeSize(closeSize: Dp): NoteCompactDimensionsBuilder =
        closeSize(closeSize.asStatefulValue())

    /**
     * Устанавливает размер иконки close [closeSize]
     */
    fun closeSize(closeSize: StatefulValue<Dp>): NoteCompactDimensionsBuilder

    /**
     * Устанавливает размер иконки для contentBefore [iconSize]
     */
    fun iconSize(iconSize: Dp): NoteCompactDimensionsBuilder =
        iconSize(iconSize.asStatefulValue())

    /**
     * Устанавливает размер иконки для contentBefore [iconSize]
     */
    fun iconSize(iconSize: StatefulValue<Dp>): NoteCompactDimensionsBuilder

    /**
     * Устанавливает размер иконки для contentAfter [disclosureSize]
     */
    fun disclosureSize(disclosureSize: Dp): NoteCompactDimensionsBuilder =
        disclosureSize(disclosureSize.asStatefulValue())

    /**
     * Устанавливает размер иконки для contentAfter [disclosureSize]
     */
    fun disclosureSize(disclosureSize: StatefulValue<Dp>): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ в начале иконки закрытия [closeStartMargin]
     */
    fun closeStartMargin(closeStartMargin: Dp): NoteCompactDimensionsBuilder =
        closeStartMargin(closeStartMargin.asStatefulValue())

    /**
     * Устанавливает отступ в начале иконки закрытия [closeStartMargin]
     */
    fun closeStartMargin(closeStartMargin: StatefulValue<Dp>): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ вконце contentBefore [contentBeforeEndMargin]
     */
    fun contentBeforeEndMargin(contentBeforeEndMargin: Dp): NoteCompactDimensionsBuilder =
        contentBeforeEndMargin(contentBeforeEndMargin.asStatefulValue())

    /**
     * Устанавливает отступ вконце contentBefore [contentBeforeEndMargin]
     */
    fun contentBeforeEndMargin(contentBeforeEndMargin: StatefulValue<Dp>): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ вначале contentAfter [contentAfterStartMargin]
     */
    fun contentAfterStartMargin(contentAfterStartMargin: Dp): NoteCompactDimensionsBuilder =
        contentAfterStartMargin(contentAfterStartMargin.asStatefulValue())

    /**
     * Устанавливает отступ вначале contentAfter [contentAfterStartMargin]
     */
    fun contentAfterStartMargin(contentAfterStartMargin: StatefulValue<Dp>): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ между text и title [textTopMargin]
     */
    fun textTopMargin(textTopMargin: Dp): NoteCompactDimensionsBuilder =
        textTopMargin(textTopMargin.asStatefulValue())

    /**
     * Устанавливает отступ между text и title [textTopMargin]
     */
    fun textTopMargin(textTopMargin: StatefulValue<Dp>): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ между блоком, содержащим title с text, и action [actionStartMargin]
     */
    fun actionStartMargin(actionStartMargin: Dp): NoteCompactDimensionsBuilder =
        actionStartMargin(actionStartMargin.asStatefulValue())

    /**
     * Устанавливает отступ между блоком, содержащим title с text, и action [actionStartMargin]
     */
    fun actionStartMargin(actionStartMargin: StatefulValue<Dp>): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ между action и close [actionEndMargin]
     */
    fun actionEndMargin(actionEndMargin: Dp): NoteCompactDimensionsBuilder =
        actionEndMargin(actionEndMargin.asStatefulValue())

    /**
     * Устанавливает отступ между action и close [actionEndMargin]
     */
    fun actionEndMargin(actionEndMargin: StatefulValue<Dp>): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): NoteCompactDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): NoteCompactDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): NoteCompactDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): NoteCompactDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): NoteCompactDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): NoteCompactDimensionsBuilder

    /**
     * Создает экземпляр [NoteCompactDimensions]
     */
    fun build(): NoteCompactDimensions
}

private class DefaultNoteCompactDimensions(
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,
    override val closeSizeValues: StatefulValue<Dp>,
    override val iconSizeValues: StatefulValue<Dp>,
    override val textTopMarginValues: StatefulValue<Dp>,
    override val actionStartMarginValues: StatefulValue<Dp>,
    override val closeStartMarginValues: StatefulValue<Dp>,
    override val contentBeforeEndMarginValues: StatefulValue<Dp>,
    override val actionEndMarginValues: StatefulValue<Dp>,
    override val disclosureSizeValues: StatefulValue<Dp>,
    override val contentAfterStartMarginValues: StatefulValue<Dp>,

) : NoteCompactDimensions {
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

    @Deprecated("Use actionStartMarginValues", replaceWith = ReplaceWith("actionStartMarginValues"))
    override val actionStartMargin: Dp = actionStartMarginValues.getDefaultValue()

    @Deprecated("Use closeStartMarginValues", replaceWith = ReplaceWith("closeStartMarginValues"))
    override val closeStartMargin: Dp = closeStartMarginValues.getDefaultValue()

    @Deprecated(
        "Use contentBeforeEndMarginValues",
        replaceWith = ReplaceWith("contentBeforeEndMarginValues"),
    )
    override val contentBeforeEndMargin: Dp = contentBeforeEndMarginValues.getDefaultValue()

    @Deprecated("Use actionEndMarginValues", replaceWith = ReplaceWith("actionEndMarginValues"))
    override val actionEndMargin: Dp = actionEndMarginValues.getDefaultValue()

    @Deprecated("Use disclosureSizeValues", replaceWith = ReplaceWith("disclosureSizeValues"))
    override val disclosureSize: Dp = disclosureSizeValues.getDefaultValue()

    @Deprecated(
        "Use contentAfterStartMarginValues",
        replaceWith = ReplaceWith("contentAfterStartMarginValues"),
    )
    override val contentAfterStartMargin: Dp = contentAfterStartMarginValues.getDefaultValue()
    class Builder : NoteCompactDimensionsBuilder {

        private var closeSize: StatefulValue<Dp>? = null
        private var iconSize: StatefulValue<Dp>? = null
        private var disclosureSize: StatefulValue<Dp>? = null
        private var closeStartMargin: StatefulValue<Dp>? = null
        private var contentBeforeEndMargin: StatefulValue<Dp>? = null
        private var contentAfterStartMargin: StatefulValue<Dp>? = null
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null
        private var textTopMargin: StatefulValue<Dp>? = null
        private var actionStartMargin: StatefulValue<Dp>? = null
        private var actionEndMargin: StatefulValue<Dp>? = null

        override fun closeSize(closeSize: StatefulValue<Dp>) = apply {
            this.closeSize = closeSize
        }

        override fun iconSize(iconSize: StatefulValue<Dp>) = apply {
            this.iconSize = iconSize
        }

        override fun disclosureSize(disclosureSize: StatefulValue<Dp>) = apply {
            this.disclosureSize = disclosureSize
        }

        override fun closeStartMargin(closeStartMargin: StatefulValue<Dp>) = apply {
            this.closeStartMargin = closeStartMargin
        }

        override fun contentBeforeEndMargin(contentBeforeEndMargin: StatefulValue<Dp>) = apply {
            this.contentBeforeEndMargin = contentBeforeEndMargin
        }

        override fun contentAfterStartMargin(contentAfterStartMargin: StatefulValue<Dp>) = apply {
            this.contentAfterStartMargin = contentAfterStartMargin
        }

        override fun textTopMargin(textTopMargin: StatefulValue<Dp>) = apply {
            this.textTopMargin = textTopMargin
        }

        override fun actionStartMargin(actionStartMargin: StatefulValue<Dp>) = apply {
            this.actionStartMargin = actionStartMargin
        }

        override fun actionEndMargin(actionEndMargin: StatefulValue<Dp>) = apply {
            this.actionEndMargin = actionEndMargin
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

        override fun build(): NoteCompactDimensions {
            return DefaultNoteCompactDimensions(
                paddingStartValues = paddingStart ?: 0.dp.asStatefulValue(),
                paddingEndValues = paddingEnd ?: 0.dp.asStatefulValue(),
                paddingTopValues = paddingTop ?: 0.dp.asStatefulValue(),
                paddingBottomValues = paddingBottom ?: 0.dp.asStatefulValue(),
                closeSizeValues = closeSize ?: 24.dp.asStatefulValue(),
                iconSizeValues = iconSize ?: Dp.Unspecified.asStatefulValue(),
                disclosureSizeValues = disclosureSize ?: Dp.Unspecified.asStatefulValue(),
                closeStartMarginValues = closeStartMargin ?: 0.dp.asStatefulValue(),
                contentBeforeEndMarginValues = contentBeforeEndMargin ?: 0.dp.asStatefulValue(),
                contentAfterStartMarginValues = contentAfterStartMargin ?: 0.dp.asStatefulValue(),
                textTopMarginValues = textTopMargin ?: 0.dp.asStatefulValue(),
                actionStartMarginValues = actionStartMargin ?: 0.dp.asStatefulValue(),
                actionEndMarginValues = actionEndMargin ?: 0.dp.asStatefulValue(),
            )
        }
    }
}
