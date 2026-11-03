package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
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
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [NavigationBarStyle] для компонента [NavigationBar]
 */
val LocalNavigationBarStyle = compositionLocalOf { NavigationBarStyle.builder().style() }

/**
 * Стиль компонента NavigationBar
 */
@Immutable
interface NavigationBarStyle : Style {

    /**
     * Иконка кнопки назад
     */
    @Deprecated("Use backIconSource", replaceWith = ReplaceWith("backIconSource"))
    @get:DrawableRes
    val backIcon: Int?
        get() = null

    /**
     * Источник изображения иконки кнопки назад
     */
    val backIconSource: ImageSource?
        get() = null

    /**
     * Форма нижних углов компонента
     */
    @Deprecated("Use bottomShapes", replaceWith = ReplaceWith("bottomShapes"))
    val bottomShape: CornerBasedShape

    /**
     * Форма нижних углов компонента
     */
    val bottomShapes: StatefulValue<CornerBasedShape>

    /**
     * Стиль текста по умолчанию
     */
    @Deprecated("Use textStyles", replaceWith = ReplaceWith("textStyles"))
    val textStyle: TextStyle

    /**
     * Стиль текста по умолчанию
     */
    val textStyles: StatefulValue<TextStyle>

    /**
     * Стиль описания по умолчанию
     */
    val descriptionStyle: StatefulValue<TextStyle>

    /**
     * Стиль основной надписи по умолчанию
     */
    val titleStyle: StatefulValue<TextStyle>

    /**
     * Тень компонента
     */
    val shadow: ShadowAppearance

    /**
     * Размеры и отступы компонента
     */
    val dimensions: NavigationBarDimensions

    /**
     * Цвета компонента
     */
    val colors: NavigationBarColors

    /**
     * Стиль кнопки действия
     */
    val actionButtonStyle: ButtonStyle?

    companion object {
        /**
         * Возвращает экземпляр [NavigationBarStyleBuilder]
         */
        fun builder(receiver: Any? = null): NavigationBarStyleBuilder =
            DefaultNavigationBarStyle.Builder()
    }
}

/**
 * Билдер стиля [NavigationBarStyle]
 */
@ApiInfo
interface NavigationBarStyleBuilder : StyleBuilder<NavigationBarStyle> {

    /**
     * Устанавливает стиль текста по умолчанию [textStyle]
     */
    fun textStyle(textStyle: TextStyle): NavigationBarStyleBuilder =
        textStyle(textStyle.asStatefulValue())

    /**
     * Устанавливает стиль текста по умолчанию [textStyle]
     */
    fun textStyle(textStyle: StatefulValue<TextStyle>): NavigationBarStyleBuilder

    /**
     * Устанавливает стиль основной надписи по умолчанию [titleStyle]
     */
    fun titleStyle(titleStyle: StatefulValue<TextStyle>): NavigationBarStyleBuilder

    /**
     * Устанавливает стиль основной надписи по умолчанию [titleStyle]
     */
    fun titleStyle(titleStyle: TextStyle): NavigationBarStyleBuilder =
        titleStyle(titleStyle.asStatefulValue())

    /**
     * Устанавливает стиль описания по умолчанию [titleStyle]
     */
    fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>): NavigationBarStyleBuilder

    /**
     * Устанавливает стиль описания по умолчанию [titleStyle]
     */
    fun descriptionStyle(descriptionStyle: TextStyle): NavigationBarStyleBuilder =
        descriptionStyle(descriptionStyle.asStatefulValue())

    /**
     * Устанавливает источник изображения иконки кнопки назад [backIcon]
     */
    fun backIcon(backIcon: ImageSource): NavigationBarStyleBuilder

    /**
     * Устанавливает иконку кнопки назад [backIcon]
     */
    @Deprecated(
        "Use backIcon with ImageSource",
        replaceWith = ReplaceWith("backIcon(backIcon)"),
        level = DeprecationLevel.ERROR,
    )
    fun backIcon(@DrawableRes backIcon: Int?): NavigationBarStyleBuilder = this

    /**
     * Устанавливает форму нижних углов [bottomShape]
     */
    fun bottomShape(bottomShape: StatefulValue<CornerBasedShape>): NavigationBarStyleBuilder

    /**
     * Устанавливает форму нижних углов [bottomShape]
     */
    fun bottomShape(bottomShape: CornerBasedShape): NavigationBarStyleBuilder =
        bottomShape(bottomShape.asStatefulValue())

    /**
     * Устанавливает тень [shadow] компонента
     */
    fun shadow(shadow: ShadowAppearance): NavigationBarStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(builder: @Composable NavigationBarColorsBuilder.() -> Unit): NavigationBarStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(builder: @Composable NavigationBarDimensionsBuilder.() -> Unit): NavigationBarStyleBuilder

    /**
     * Устанавливает стиль кнопок действия
     */
    fun actionButtonStyle(actionButtonStyle: ButtonStyle): NavigationBarStyleBuilder
}

private class DefaultNavigationBarStyle(
    override val backIconSource: ImageSource?,
    override val shadow: ShadowAppearance,
    override val dimensions: NavigationBarDimensions,
    override val colors: NavigationBarColors,
    override val titleStyle: StatefulValue<TextStyle>,
    override val descriptionStyle: StatefulValue<TextStyle>,
    override val actionButtonStyle: ButtonStyle?,
    override val bottomShapes: StatefulValue<CornerBasedShape>,
    override val textStyles: StatefulValue<TextStyle>,
) : NavigationBarStyle {
    @Deprecated("Use backIconSource", replaceWith = ReplaceWith("backIconSource"))
    override val backIcon: Int? = null

    @Deprecated("Use bottomShapes", replaceWith = ReplaceWith("bottomShapes"))
    override val bottomShape: CornerBasedShape = bottomShapes.getDefaultValue()

    @Deprecated("Use textStyles", replaceWith = ReplaceWith("textStyles"))
    override val textStyle: TextStyle = textStyles.getDefaultValue()
    class Builder : NavigationBarStyleBuilder {

        private var backIconSource: ImageSource? = null
        private var bottomShape: StatefulValue<CornerBasedShape>? = null
        private var shadow: ShadowAppearance? = null
        private val colorsBuilder = NavigationBarColors.builder()
        private val dimensionsBuilder = NavigationBarDimensions.builder()
        private var textStyle: StatefulValue<TextStyle>? = null
        private var titleStyle: StatefulValue<TextStyle>? = null
        private var descriptionStyle: StatefulValue<TextStyle>? = null
        private var actionButtonStyle: ButtonStyle? = null

        override fun textStyle(textStyle: StatefulValue<TextStyle>) = apply {
            this.textStyle = textStyle
        }

        override fun titleStyle(titleStyle: StatefulValue<TextStyle>) = apply {
            this.titleStyle = titleStyle
        }

        override fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>) = apply {
            this.descriptionStyle = descriptionStyle
        }

        override fun backIcon(backIcon: ImageSource) = apply {
            this.backIconSource = backIcon
        }

        override fun bottomShape(bottomShape: StatefulValue<CornerBasedShape>) = apply {
            this.bottomShape = bottomShape
        }

        override fun shadow(shadow: ShadowAppearance) = apply {
            this.shadow = shadow
        }

        @Composable
        override fun colors(builder: @Composable (NavigationBarColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (NavigationBarDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun actionButtonStyle(actionButtonStyle: ButtonStyle) = apply {
            this.actionButtonStyle = actionButtonStyle
        }

        override fun style(): NavigationBarStyle {
            return DefaultNavigationBarStyle(
                backIconSource = backIconSource,
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                shadow = shadow ?: ShadowAppearance(),
                bottomShapes = bottomShape ?: RoundedCornerShape(ZeroCornerSize).asStatefulValue(),
                textStyles = textStyle ?: TextStyle.Default.asStatefulValue(),
                titleStyle = titleStyle ?: TextStyle.Default.asStatefulValue(),
                descriptionStyle = descriptionStyle ?: TextStyle.Default.asStatefulValue(),
                actionButtonStyle = actionButtonStyle,
            )
        }
    }
}

/**
 * Цвета компонента NavigationBar
 */
@Immutable
interface NavigationBarColors {

    /**
     * Цвет фона
     */
    @Deprecated("Use backgroundBrush", replaceWith = ReplaceWith("backgroundBrush"))
    val backgroundColor: InteractiveColor

    /**
     * Кисть фона
     */
    val backgroundBrush: StatefulValue<Brush>

    /**
     * Цвет кнопки закрытия
     */
    @Deprecated("Use backIconBrush", replaceWith = ReplaceWith("backIconBrush"))
    val backIconColor: InteractiveColor

    /**
     * Кисть кнопки закрытия
     */
    val backIconBrush: StatefulValue<Brush>

    /**
     * Цвет экшена в начале
     */
    @Deprecated("Use actionStartBrush", replaceWith = ReplaceWith("actionStartBrush"))
    val actionStartColor: InteractiveColor

    /**
     * Кисть экшена в начале
     */
    val actionStartBrush: StatefulValue<Brush>

    /**
     * Цвет экшена в конце
     */
    @Deprecated("Use actionEndBrush", replaceWith = ReplaceWith("actionEndBrush"))
    val actionEndColor: InteractiveColor

    /**
     * Кисть экшена в конце
     */
    val actionEndBrush: StatefulValue<Brush>

    /**
     * Цвет текста по умолчанию
     */
    @Deprecated("Use textBrush", replaceWith = ReplaceWith("textBrush"))
    val textColor: InteractiveColor

    /**
     * Кисть текста по умолчанию
     */
    val textBrush: StatefulValue<Brush>

    /**
     * Цвет основной надписи по умолчанию
     */
    @Deprecated("Use titleBrush", replaceWith = ReplaceWith("titleBrush"))
    val titleColor: InteractiveColor

    /**
     * Кисть основной надписи по умолчанию
     */
    val titleBrush: StatefulValue<Brush>

    /**
     * Цвет описания по умолчанию
     */
    @Deprecated("Use descriptionBrush", replaceWith = ReplaceWith("descriptionBrush"))
    val descriptionColor: InteractiveColor

    /**
     * Кисть описания по умолчанию
     */
    val descriptionBrush: StatefulValue<Brush>

    companion object {

        /**
         * Создает экземпляр [NavigationBarColorsBuilder]
         */
        fun builder(): NavigationBarColorsBuilder = DefaultNavigationBarColors.Builder()
    }
}

/**
 * Builder для [NavigationBarColors]
 */
interface NavigationBarColorsBuilder {
    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Color): NavigationBarColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: InteractiveColor): NavigationBarColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Brush): NavigationBarColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): NavigationBarColorsBuilder

    /**
     * Устанавливает цвет кнопки закрытия [backIconColor].
     */
    fun backIconColor(backIconColor: Color): NavigationBarColorsBuilder =
        backIconColor(backIconColor.asStatefulBrush())

    /**
     * Устанавливает цвет кнопки закрытия [backIconColor].
     */
    fun backIconColor(backIconColor: InteractiveColor): NavigationBarColorsBuilder =
        backIconColor(backIconColor.asStatefulBrush())

    /**
     * Устанавливает цвет кнопки закрытия [backIconColor].
     */
    fun backIconColor(backIconColor: Brush): NavigationBarColorsBuilder =
        backIconColor(backIconColor.asStatefulValue())

    /**
     * Устанавливает цвет кнопки закрытия [backIconColor].
     */
    fun backIconColor(backIconColor: StatefulValue<Brush>): NavigationBarColorsBuilder

    /**
     * Устанавливает цвет экшена в начале [actionStartColor].
     */
    fun actionStartColor(actionStartColor: Color): NavigationBarColorsBuilder =
        actionStartColor(actionStartColor.asStatefulBrush())

    /**
     * Устанавливает цвет экшена в начале [actionStartColor].
     */
    fun actionStartColor(actionStartColor: InteractiveColor): NavigationBarColorsBuilder =
        actionStartColor(actionStartColor.asStatefulBrush())

    /**
     * Устанавливает цвет экшена в начале [actionStartColor].
     */
    fun actionStartColor(actionStartColor: Brush): NavigationBarColorsBuilder =
        actionStartColor(actionStartColor.asStatefulValue())

    /**
     * Устанавливает цвет экшена в начале [actionStartColor].
     */
    fun actionStartColor(actionStartColor: StatefulValue<Brush>): NavigationBarColorsBuilder

    /**
     * Устанавливает цвет экшена в конце [actionEndColor].
     */
    fun actionEndColor(actionEndColor: Color): NavigationBarColorsBuilder =
        actionEndColor(actionEndColor.asStatefulBrush())

    /**
     * Устанавливает цвет экшена в конце [actionEndColor].
     */
    fun actionEndColor(actionEndColor: InteractiveColor): NavigationBarColorsBuilder =
        actionEndColor(actionEndColor.asStatefulBrush())

    /**
     * Устанавливает цвет экшена в конце [actionEndColor].
     */
    fun actionEndColor(actionEndColor: Brush): NavigationBarColorsBuilder =
        actionEndColor(actionEndColor.asStatefulValue())

    /**
     * Устанавливает цвет экшена в конце [actionEndColor].
     */
    fun actionEndColor(actionEndColor: StatefulValue<Brush>): NavigationBarColorsBuilder

    /**
     * Устанавливает цвет текста по умолчанию [textColor].
     */
    fun textColor(textColor: Color): NavigationBarColorsBuilder =
        textColor(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста по умолчанию [textColor].
     */
    fun textColor(textColor: InteractiveColor): NavigationBarColorsBuilder =
        textColor(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста по умолчанию [textColor].
     */
    fun textColor(textColor: Brush): NavigationBarColorsBuilder =
        textColor(textColor.asStatefulValue())

    /**
     * Устанавливает цвет текста по умолчанию [textColor].
     */
    fun textColor(textColor: StatefulValue<Brush>): NavigationBarColorsBuilder

    /**
     * Устанавливает цвет основной надписи по умолчанию [titleColor].
     */
    fun titleColor(titleColor: Color): NavigationBarColorsBuilder =
        titleColor(titleColor.asStatefulBrush())

    /**
     * Устанавливает цвет основной надписи по умолчанию [titleColor].
     */
    fun titleColor(titleColor: InteractiveColor): NavigationBarColorsBuilder =
        titleColor(titleColor.asStatefulBrush())

    /**
     * Устанавливает цвет основной надписи по умолчанию [titleColor].
     */
    fun titleColor(titleColor: Brush): NavigationBarColorsBuilder =
        titleColor(titleColor.asStatefulValue())

    /**
     * Устанавливает цвет основной надписи по умолчанию [titleColor].
     */
    fun titleColor(titleColor: StatefulValue<Brush>): NavigationBarColorsBuilder

    /**
     * Устанавливает цвет описания по умолчанию [descriptionColor].
     */
    fun descriptionColor(descriptionColor: Color): NavigationBarColorsBuilder =
        descriptionColor(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает цвет описания по умолчанию [descriptionColor].
     */
    fun descriptionColor(descriptionColor: InteractiveColor): NavigationBarColorsBuilder =
        descriptionColor(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает цвет описания по умолчанию [descriptionColor].
     */
    fun descriptionColor(descriptionColor: Brush): NavigationBarColorsBuilder =
        descriptionColor(descriptionColor.asStatefulValue())

    /**
     * Устанавливает цвет описания по умолчанию [descriptionColor].
     */
    fun descriptionColor(descriptionColor: StatefulValue<Brush>): NavigationBarColorsBuilder

    /**
     * Создает экземпляр [NavigationBarColors]
     */
    fun build(): NavigationBarColors
}

@Immutable
private data class DefaultNavigationBarColors(
    override val backgroundBrush: StatefulValue<Brush>,
    override val backIconBrush: StatefulValue<Brush>,
    override val actionStartBrush: StatefulValue<Brush>,
    override val actionEndBrush: StatefulValue<Brush>,
    override val textBrush: StatefulValue<Brush>,
    override val titleBrush: StatefulValue<Brush>,
    override val descriptionBrush: StatefulValue<Brush>,
) : NavigationBarColors {
    @Deprecated("Use backgroundBrush", replaceWith = ReplaceWith("backgroundBrush"))
    override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use backIconBrush", replaceWith = ReplaceWith("backIconBrush"))
    override val backIconColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use actionStartBrush", replaceWith = ReplaceWith("actionStartBrush"))
    override val actionStartColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use actionEndBrush", replaceWith = ReplaceWith("actionEndBrush"))
    override val actionEndColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use textBrush", replaceWith = ReplaceWith("textBrush"))
    override val textColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use titleBrush", replaceWith = ReplaceWith("titleBrush"))
    override val titleColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use descriptionBrush", replaceWith = ReplaceWith("descriptionBrush"))
    override val descriptionColor: InteractiveColor = Color.Transparent.asInteractive()
    class Builder : NavigationBarColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var backIconColor: StatefulValue<Brush>? = null
        private var actionStartColor: StatefulValue<Brush>? = null
        private var actionEndColor: StatefulValue<Brush>? = null
        private var textColor: StatefulValue<Brush>? = null
        private var titleColor: StatefulValue<Brush>? = null
        private var descriptionColor: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun backIconColor(backIconColor: StatefulValue<Brush>) = apply {
            this.backIconColor = backIconColor
        }

        override fun actionStartColor(actionStartColor: StatefulValue<Brush>) = apply {
            this.actionStartColor = actionStartColor
        }

        override fun actionEndColor(actionEndColor: StatefulValue<Brush>) = apply {
            this.actionEndColor = actionEndColor
        }

        override fun textColor(textColor: StatefulValue<Brush>) = apply {
            this.textColor = textColor
        }

        override fun titleColor(titleColor: StatefulValue<Brush>) = apply {
            this.titleColor = titleColor
        }

        override fun descriptionColor(descriptionColor: StatefulValue<Brush>) = apply {
            this.descriptionColor = descriptionColor
        }

        override fun build(): NavigationBarColors {
            return DefaultNavigationBarColors(
                backgroundBrush = backgroundColor ?: Color.Transparent.asStatefulBrush(),
                backIconBrush = backIconColor ?: Color.Black.asStatefulBrush(),
                actionStartBrush = actionStartColor ?: Color.Black.asStatefulBrush(),
                actionEndBrush = actionEndColor ?: Color.Black.asStatefulBrush(),
                textBrush = textColor ?: Color.Black.asStatefulBrush(),
                titleBrush = titleColor ?: Color.Black.asStatefulBrush(),
                descriptionBrush = descriptionColor ?: Color.Gray.asStatefulBrush(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface NavigationBarDimensions {

    /**
     * Отступ иконки назад
     */
    @Deprecated(
        "Use backIconMarginValues",
        replaceWith = ReplaceWith("backIconMarginValues"),
    )
    val backIconMargin: Dp

    /**
     * Отступ иконки назад
     */
    val backIconMarginValues: StatefulValue<Dp>

    /**
     * Горизонтальный отступ между элементами основного блока
     */
    @Deprecated(
        "Use horizontalSpacingValues",
        replaceWith = ReplaceWith("horizontalSpacingValues"),
    )
    val horizontalSpacing: Dp

    /**
     * Горизонтальный отступ между элементами основного блока
     */
    val horizontalSpacingValues: StatefulValue<Dp>

    /**
     * Отступ сверху от внешнего (не встроенного) текстового блока
     */
    @Deprecated(
        "Use textBlockTopMarginValues",
        replaceWith = ReplaceWith("textBlockTopMarginValues"),
    )
    val textBlockTopMargin: Dp

    /**
     * Отступ сверху от внешнего (не встроенного) текстового блока
     */
    val textBlockTopMarginValues: StatefulValue<Dp>

    /**
     * Отступ в начале
     */
    @Deprecated(
        "Use paddingStartValues",
        replaceWith = ReplaceWith("paddingStartValues"),
    )
    val paddingStart: Dp

    /**
     * Отступ в начале
     */
    val paddingStartValues: StatefulValue<Dp>

    /**
     * Отступ в конце
     */
    @Deprecated("Use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
    val paddingEnd: Dp

    /**
     * Отступ в конце
     */
    val paddingEndValues: StatefulValue<Dp>

    /**
     * Отступ сверху
     */
    @Deprecated("Use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
    val paddingTop: Dp

    /**
     * Отступ сверху
     */
    val paddingTopValues: StatefulValue<Dp>

    /**
     * Отступ снизу
     */
    @Deprecated("Use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
    val paddingBottom: Dp

    /**
     * Отступ снизу
     */
    val paddingBottomValues: StatefulValue<Dp>

    /**
     * Отступ описания
     */
    val descriptionPadding: StatefulValue<Dp>

    /**
     * Минимальная высота контент-области — блока со слотами actionStart, центрального контента
     * и actionEnd. Позволяет зафиксировать высоту компонента, чтобы она не менялась
     * при разной высоте содержимого слотов (например, иконка против текста).
     *
     * Величина относится именно к контент-области: [paddingTop] и [paddingBottom]
     * добавляются сверх неё и в неё не входят. Системные инсеты в величину также не входят.
     */
    val minContentHeight: StatefulValue<Dp>

    companion object {
        /**
         * Создает экземпляр [NavigationBarDimensionsBuilder]
         */
        fun builder(): NavigationBarDimensionsBuilder = DefaultNavigationBarDimensions.Builder()
    }
}

/**
 * Builder для [NavigationBarDimensions]
 */
interface NavigationBarDimensionsBuilder {
    /**
     * Устанавливает отступ иконки назад [backIconMargin]
     */
    fun backIconMargin(backIconMargin: Dp): NavigationBarDimensionsBuilder =
        backIconMargin(backIconMargin.asStatefulValue())

    /**
     * Устанавливает отступ иконки назад [backIconMargin]
     */
    fun backIconMargin(backIconMargin: StatefulValue<Dp>): NavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ сверху от внешнего (не встроенного) текстового блока [textBlockTopMargin]
     */
    fun textBlockTopMargin(textBlockTopMargin: Dp): NavigationBarDimensionsBuilder =
        textBlockTopMargin(textBlockTopMargin.asStatefulValue())

    /**
     * Устанавливает отступ сверху от внешнего (не встроенного) текстового блока [textBlockTopMargin]
     */
    fun textBlockTopMargin(textBlockTopMargin: StatefulValue<Dp>): NavigationBarDimensionsBuilder

    /**
     * Устанавливает горизонтальный отступ между элементами основного блока [horizontalSpacing]
     */
    fun horizontalSpacing(horizontalSpacing: Dp): NavigationBarDimensionsBuilder =
        horizontalSpacing(horizontalSpacing.asStatefulValue())

    /**
     * Устанавливает горизонтальный отступ между элементами основного блока [horizontalSpacing]
     */
    fun horizontalSpacing(horizontalSpacing: StatefulValue<Dp>): NavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): NavigationBarDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): NavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): NavigationBarDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): NavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): NavigationBarDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): NavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): NavigationBarDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): NavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ описания [descriptionPadding]
     */
    fun descriptionPadding(descriptionPadding: Dp): NavigationBarDimensionsBuilder =
        descriptionPadding(descriptionPadding.asStatefulValue())

    /**
     * Устанавливает отступ описания [descriptionPadding]
     */
    fun descriptionPadding(descriptionPadding: StatefulValue<Dp>): NavigationBarDimensionsBuilder

    /**
     * Устанавливает минимальную высоту контент-области [minContentHeight]
     */
    fun minContentHeight(minContentHeight: Dp): NavigationBarDimensionsBuilder =
        minContentHeight(minContentHeight.asStatefulValue())

    /**
     * Устанавливает минимальную высоту контент-области [minContentHeight]
     */
    fun minContentHeight(minContentHeight: StatefulValue<Dp>): NavigationBarDimensionsBuilder

    /**
     * Создает экземпляр [NavigationBarDimensions]
     */
    fun build(): NavigationBarDimensions
}

private class DefaultNavigationBarDimensions(
    override val descriptionPadding: StatefulValue<Dp>,
    override val minContentHeight: StatefulValue<Dp>,
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,
    override val backIconMarginValues: StatefulValue<Dp>,
    override val horizontalSpacingValues: StatefulValue<Dp>,
    override val textBlockTopMarginValues: StatefulValue<Dp>,
) : NavigationBarDimensions {
    @Deprecated(
        "Use paddingStartValues",
        replaceWith = ReplaceWith("paddingStartValues"),
    )
    override val paddingStart: Dp = paddingStartValues.getDefaultValue()

    @Deprecated(
        "Use paddingEndValues",
        replaceWith = ReplaceWith("paddingEndValues"),
    )
    override val paddingEnd: Dp = paddingEndValues.getDefaultValue()

    @Deprecated(
        "Use paddingTopValues",
        replaceWith = ReplaceWith("paddingTopValues"),
    )
    override val paddingTop: Dp = paddingTopValues.getDefaultValue()

    @Deprecated(
        "Use paddingBottomValues",
        replaceWith = ReplaceWith("paddingBottomValues"),
    )
    override val paddingBottom: Dp = paddingBottomValues.getDefaultValue()

    @Deprecated(
        "Use backIconMarginValues",
        replaceWith = ReplaceWith("backIconMarginValues"),
    )
    override val backIconMargin: Dp = backIconMarginValues.getDefaultValue()

    @Deprecated(
        "Use horizontalSpacingValues",
        replaceWith = ReplaceWith("horizontalSpacingValues"),
    )
    override val horizontalSpacing: Dp = horizontalSpacingValues.getDefaultValue()

    @Deprecated(
        "Use textBlockTopMarginValues",
        replaceWith = ReplaceWith("textBlockTopMarginValues"),
    )
    override val textBlockTopMargin: Dp = textBlockTopMarginValues.getDefaultValue()
    class Builder : NavigationBarDimensionsBuilder {

        private var backIconMargin: StatefulValue<Dp>? = null
        private var horizontalSpacing: StatefulValue<Dp>? = null
        private var textBlockTopMargin: StatefulValue<Dp>? = null
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null
        private var descriptionPadding: StatefulValue<Dp>? = null
        private var minContentHeight: StatefulValue<Dp>? = null

        override fun backIconMargin(backIconMargin: StatefulValue<Dp>) = apply {
            this.backIconMargin = backIconMargin
        }

        override fun textBlockTopMargin(textBlockTopMargin: StatefulValue<Dp>) = apply {
            this.textBlockTopMargin = textBlockTopMargin
        }

        override fun horizontalSpacing(horizontalSpacing: StatefulValue<Dp>) = apply {
            this.horizontalSpacing = horizontalSpacing
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

        override fun descriptionPadding(descriptionPadding: StatefulValue<Dp>) = apply {
            this.descriptionPadding = descriptionPadding
        }

        override fun minContentHeight(minContentHeight: StatefulValue<Dp>) = apply {
            this.minContentHeight = minContentHeight
        }

        override fun build(): NavigationBarDimensions {
            return DefaultNavigationBarDimensions(
                paddingStartValues = paddingStart ?: 16.dp.asStatefulValue(),
                paddingEndValues = paddingEnd ?: 16.dp.asStatefulValue(),
                paddingTopValues = paddingTop ?: 16.dp.asStatefulValue(),
                paddingBottomValues = paddingBottom ?: 16.dp.asStatefulValue(),
                backIconMarginValues = backIconMargin ?: 4.dp.asStatefulValue(),
                horizontalSpacingValues = horizontalSpacing ?: 16.dp.asStatefulValue(),
                textBlockTopMarginValues = textBlockTopMargin ?: 16.dp.asStatefulValue(),
                descriptionPadding = descriptionPadding ?: 2.dp.asStatefulValue(),
                minContentHeight = minContentHeight ?: 0.dp.asStatefulValue(),
            )
        }
    }
}
