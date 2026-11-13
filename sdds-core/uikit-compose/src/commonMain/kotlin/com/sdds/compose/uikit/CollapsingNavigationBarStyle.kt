package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
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
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.interactions.transform
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [CollapsingNavigationBarStyle] для компонента [CollapsingNavigationBar]
 */
val LocalCollapsingNavigationBarStyle = compositionLocalOf { CollapsingNavigationBarStyle.builder().style() }

/**
 * Стиль компонента CollapsingNavigationBar
 */
@Immutable
interface CollapsingNavigationBarStyle : Style {

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
     * Стиль заголовка по умолчанию
     */
    val titleStyle: StatefulValue<TextStyle>

    /**
     * Стиль описания по умолчанию
     */
    val descriptionStyle: StatefulValue<TextStyle>

    /**
     * Тень компонента
     */
    val shadow: ShadowAppearance

    /**
     * Размеры и отступы компонента
     */
    val dimensions: CollapsingNavigationBarDimensions

    /**
     * Цвета компонента
     */
    val colors: CollapsingNavigationBarColors

    /**
     * Стиль кнопки действия
     */
    val actionButtonStyle: ButtonStyle?

    companion object {
        /**
         * Возвращает экземпляр [CollapsingNavigationBarStyleBuilder]
         */
        fun builder(receiver: Any? = null): CollapsingNavigationBarStyleBuilder =
            DefaultCollapsingNavigationBarStyle.Builder()
    }
}

/**
 * Билдер стиля [CollapsingNavigationBarStyle]
 */
@ApiInfo
interface CollapsingNavigationBarStyleBuilder : StyleBuilder<CollapsingNavigationBarStyle> {

    /**
     * Устанавливает стиль заголовка [titleStyle]
     */
    fun titleStyle(titleStyle: StatefulValue<TextStyle>): CollapsingNavigationBarStyleBuilder

    /**
     * Устанавливает стиль основной надписи по умолчанию [titleStyle]
     */
    fun titleStyle(titleStyle: TextStyle): CollapsingNavigationBarStyleBuilder =
        titleStyle(titleStyle.asStatefulValue())

    /**
     * Устанавливает стиль описания [descriptionStyle]
     */
    fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>): CollapsingNavigationBarStyleBuilder

    /**
     * Устанавливает стиль описания по умолчанию [titleStyle]
     */
    fun descriptionStyle(descriptionStyle: TextStyle): CollapsingNavigationBarStyleBuilder =
        descriptionStyle(descriptionStyle.asStatefulValue())

    /**
     * Устанавливает источник изображения иконки кнопки назад [backIcon]
     */
    fun backIcon(backIcon: ImageSource): CollapsingNavigationBarStyleBuilder

    /**
     * Устанавливает иконку кнопки назад [backIcon]
     */
    @Deprecated(
        "Use backIcon with ImageSource",
        replaceWith = ReplaceWith("backIcon(backIcon)"),
        level = DeprecationLevel.ERROR,
    )
    fun backIcon(@DrawableRes backIcon: Int?): CollapsingNavigationBarStyleBuilder = this

    /**
     * Устанавливает форму нижних углов [bottomShape]
     */
    fun bottomShape(bottomShape: StatefulValue<CornerBasedShape>): CollapsingNavigationBarStyleBuilder

    /**
     * Устанавливает форму нижних углов [bottomShape]
     */
    fun bottomShape(bottomShape: CornerBasedShape): CollapsingNavigationBarStyleBuilder =
        bottomShape(bottomShape.asStatefulValue())

    /**
     * Устанавливает тень [shadow] компонента
     */
    fun shadow(shadow: ShadowAppearance): CollapsingNavigationBarStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(
        builder: @Composable CollapsingNavigationBarColorsBuilder.() -> Unit,
    ): CollapsingNavigationBarStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(
        builder: @Composable CollapsingNavigationBarDimensionsBuilder.() -> Unit,
    ): CollapsingNavigationBarStyleBuilder

    /**
     * Устанавливает стиль кнопок действия
     */
    fun actionButtonStyle(actionButtonStyle: ButtonStyle): CollapsingNavigationBarStyleBuilder
}

private class DefaultCollapsingNavigationBarStyle(
    override val backIconSource: ImageSource?,
    override val shadow: ShadowAppearance,
    override val dimensions: CollapsingNavigationBarDimensions,
    override val colors: CollapsingNavigationBarColors,
    override val actionButtonStyle: ButtonStyle?,
    override val titleStyle: StatefulValue<TextStyle>,
    override val descriptionStyle: StatefulValue<TextStyle>,
    override val bottomShapes: StatefulValue<CornerBasedShape>,
) : CollapsingNavigationBarStyle {
    @Deprecated("Use backIconSource", replaceWith = ReplaceWith("backIconSource"))
    override val backIcon: Int? = null

    @Deprecated("Use bottomShapes", replaceWith = ReplaceWith("bottomShapes"))
    override val bottomShape: CornerBasedShape = bottomShapes.getDefaultValue()

    class Builder : CollapsingNavigationBarStyleBuilder {

        private var backIconSource: ImageSource? = null
        private var bottomShape: StatefulValue<CornerBasedShape>? = null
        private var shadow: ShadowAppearance? = null
        private val colorsBuilder = CollapsingNavigationBarColors.builder()
        private val dimensionsBuilder = CollapsingNavigationBarDimensions.builder()
        private var titleStyle: StatefulValue<TextStyle>? = null
        private var descriptionStyle: StatefulValue<TextStyle>? = null
        private var actionButtonStyle: ButtonStyle? = null

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
        override fun colors(builder: @Composable (CollapsingNavigationBarColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (CollapsingNavigationBarDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun actionButtonStyle(actionButtonStyle: ButtonStyle) = apply {
            this.actionButtonStyle = actionButtonStyle
        }

        override fun style(): CollapsingNavigationBarStyle {
            return DefaultCollapsingNavigationBarStyle(
                backIconSource = backIconSource,
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                shadow = shadow ?: ShadowAppearance(),
                bottomShapes = bottomShape ?: RoundedCornerShape(16.dp).asStatefulValue(),
                actionButtonStyle = actionButtonStyle,
                titleStyle = titleStyle ?: TextStyle().asStatefulValue(),
                descriptionStyle = descriptionStyle ?: TextStyle().asStatefulValue(),
            )
        }
    }
}

/**
 * Цвета компонента CollapsingNavigationBar
 */
@Immutable
interface CollapsingNavigationBarColors {

    /**
     * Цвет фона
     */
    @Deprecated(
        "Use background: StatefulValue<Brush> property",
        replaceWith = ReplaceWith("background"),
    )
    val backgroundColor: StatefulValue<Color>

    /**
     * Цвет фона
     */
    val background: StatefulValue<Brush>

    /**
     * Цвет кнопки закрытия
     */
    @Deprecated("Use backIconBrush", replaceWith = ReplaceWith("backIconBrush"))
    val backIconColor: StatefulValue<Color>

    /**
     * Кисть кнопки закрытия
     */
    val backIconBrush: StatefulValue<Brush>

    /**
     * Цвет экшена в начале
     */
    @Deprecated("Use actionStartBrush", replaceWith = ReplaceWith("actionStartBrush"))
    val actionStartColor: StatefulValue<Color>

    /**
     * Кисть экшена в начале
     */
    val actionStartBrush: StatefulValue<Brush>

    /**
     * Цвет экшена в конце
     */
    @Deprecated("Use actionEndBrush", replaceWith = ReplaceWith("actionEndBrush"))
    val actionEndColor: StatefulValue<Color>

    /**
     * Кисть экшена в конце
     */
    val actionEndBrush: StatefulValue<Brush>

    /**
     * Цвет основной надписи по умолчанию
     */
    @Deprecated("Use titleBrush", replaceWith = ReplaceWith("titleBrush"))
    val titleColor: StatefulValue<Color>

    /**
     * Кисть основной надписи по умолчанию
     */
    val titleBrush: StatefulValue<Brush>

    /**
     * Цвет описания по умолчанию
     */
    @Deprecated("Use descriptionBrush", replaceWith = ReplaceWith("descriptionBrush"))
    val descriptionColor: StatefulValue<Color>

    /**
     * Кисть описания по умолчанию
     */
    val descriptionBrush: StatefulValue<Brush>

    companion object {

        /**
         * Создает экземпляр [CollapsingNavigationBarColorsBuilder]
         */
        fun builder(): CollapsingNavigationBarColorsBuilder = DefaultCollapsingNavigationBarColors.Builder()
    }
}

/**
 * Builder для [CollapsingNavigationBarColors]
 */
interface CollapsingNavigationBarColorsBuilder {
    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Color): CollapsingNavigationBarColorsBuilder =
        background(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Color>): CollapsingNavigationBarColorsBuilder =
        background(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun background(backgroundColor: StatefulValue<Brush>): CollapsingNavigationBarColorsBuilder

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun background(backgroundColor: InteractiveColor): CollapsingNavigationBarColorsBuilder =
        background(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun background(backgroundColor: Brush): CollapsingNavigationBarColorsBuilder =
        background(backgroundColor.asStatefulValue())

    /**
     * Устанавливает цвет кнопки закрытия [backIconColor].
     */
    fun backIconColor(backIconColor: Color): CollapsingNavigationBarColorsBuilder =
        backIconBrush(backIconColor.asStatefulBrush())

    /**
     * Устанавливает цвет кнопки закрытия [backIconColor].
     */
    fun backIconColor(backIconColor: InteractiveColor): CollapsingNavigationBarColorsBuilder =
        backIconBrush(backIconColor.asStatefulBrush())

    /**
     * Устанавливает цвет кнопки закрытия [backIconColor].
     */
    fun backIconColor(backIconColor: StatefulValue<Color>): CollapsingNavigationBarColorsBuilder =
        backIconBrush(backIconColor.asStatefulBrush())

    /**
     * Устанавливает цвет кнопки закрытия [backIconBrush].
     */
    fun backIconBrush(backIconColor: Brush): CollapsingNavigationBarColorsBuilder =
        backIconBrush(backIconColor.asStatefulValue())

    /**
     * Устанавливает цвет кнопки закрытия [backIconBrush].
     */
    fun backIconBrush(backIconColor: StatefulValue<Brush>): CollapsingNavigationBarColorsBuilder

    /**
     * Устанавливает цвет экшена в начале [actionStartColor].
     */
    fun actionStartColor(actionStartColor: Color): CollapsingNavigationBarColorsBuilder =
        actionStartBrush(actionStartColor.asStatefulBrush())

    /**
     * Устанавливает цвет экшена в начале [actionStartColor].
     */
    fun actionStartColor(actionStartColor: StatefulValue<Color>): CollapsingNavigationBarColorsBuilder =
        actionStartBrush(actionStartColor.asStatefulBrush())

    /**
     * Устанавливает цвет экшена в начале [actionStartColor].
     */
    fun actionStartColor(actionStartColor: InteractiveColor): CollapsingNavigationBarColorsBuilder =
        actionStartBrush(actionStartColor.asStatefulBrush())

    /**
     * Устанавливает цвет экшена в начале [actionStartBrush].
     */
    fun actionStartBrush(actionStartColor: Brush): CollapsingNavigationBarColorsBuilder =
        actionStartBrush(actionStartColor.asStatefulValue())

    /**
     * Устанавливает цвет экшена в начале [actionStartBrush].
     */
    fun actionStartBrush(actionStartColor: StatefulValue<Brush>): CollapsingNavigationBarColorsBuilder

    /**
     * Устанавливает цвет экшена в конце [actionEndColor].
     */
    fun actionEndColor(actionEndColor: Color): CollapsingNavigationBarColorsBuilder =
        actionEndBrush(actionEndColor.asStatefulBrush())

    /**
     * Устанавливает цвет экшена в конце [actionEndColor].
     */
    fun actionEndColor(actionEndColor: StatefulValue<Color>): CollapsingNavigationBarColorsBuilder =
        actionEndBrush(actionEndColor.asStatefulBrush())

    /**
     * Устанавливает цвет экшена в конце [actionEndColor].
     */
    fun actionEndColor(actionEndColor: InteractiveColor): CollapsingNavigationBarColorsBuilder =
        actionEndBrush(actionEndColor.asStatefulBrush())

    /**
     * Устанавливает цвет экшена в конце [actionEndBrush].
     */
    fun actionEndBrush(actionEndColor: Brush): CollapsingNavigationBarColorsBuilder =
        actionEndBrush(actionEndColor.asStatefulValue())

    /**
     * Устанавливает цвет экшена в конце [actionEndBrush].
     */
    fun actionEndBrush(actionEndColor: StatefulValue<Brush>): CollapsingNavigationBarColorsBuilder

    /**
     * Устанавливает цвет заголовка [titleColor].
     */
    fun titleColor(titleColor: Color): CollapsingNavigationBarColorsBuilder =
        titleBrush(titleColor.asStatefulBrush())

    /**
     * Устанавливает цвет заголовка [titleColor].
     */
    fun titleColor(titleColor: StatefulValue<Color>): CollapsingNavigationBarColorsBuilder =
        titleBrush(titleColor.asStatefulBrush())

    /**
     * Устанавливает цвет заголовка [titleColor].
     */
    fun titleColor(titleColor: InteractiveColor): CollapsingNavigationBarColorsBuilder =
        titleBrush(titleColor.asStatefulBrush())

    /**
     * Устанавливает цвет заголовка [titleBrush].
     */
    fun titleBrush(titleColor: Brush): CollapsingNavigationBarColorsBuilder =
        titleBrush(titleColor.asStatefulValue())

    /**
     * Устанавливает цвет заголовка [titleBrush].
     */
    fun titleBrush(titleColor: StatefulValue<Brush>): CollapsingNavigationBarColorsBuilder

    /**
     * Устанавливает цвет описания [descriptionColor].
     */
    fun descriptionColor(descriptionColor: Color): CollapsingNavigationBarColorsBuilder =
        descriptionBrush(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает цвет описания [descriptionColor].
     */
    fun descriptionColor(descriptionColor: StatefulValue<Color>): CollapsingNavigationBarColorsBuilder =
        descriptionBrush(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает цвет описания [descriptionColor].
     */
    fun descriptionColor(descriptionColor: InteractiveColor): CollapsingNavigationBarColorsBuilder =
        descriptionBrush(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает цвет описания [descriptionBrush].
     */
    fun descriptionBrush(descriptionColor: Brush): CollapsingNavigationBarColorsBuilder =
        descriptionBrush(descriptionColor.asStatefulValue())

    /**
     * Устанавливает цвет описания [descriptionBrush].
     */
    fun descriptionBrush(descriptionColor: StatefulValue<Brush>): CollapsingNavigationBarColorsBuilder

    /**
     * Создает экземпляр [CollapsingNavigationBarColors]
     */
    fun build(): CollapsingNavigationBarColors
}

@Immutable
private data class DefaultCollapsingNavigationBarColors(
    override val background: StatefulValue<Brush>,
    override val backIconBrush: StatefulValue<Brush>,
    override val actionStartBrush: StatefulValue<Brush>,
    override val actionEndBrush: StatefulValue<Brush>,
    override val titleBrush: StatefulValue<Brush>,
    override val descriptionBrush: StatefulValue<Brush>,
) : CollapsingNavigationBarColors {

    @Deprecated("use background", replaceWith = ReplaceWith("background"))
    override val backgroundColor: StatefulValue<Color> = background.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    @Deprecated("use backIconBrush", replaceWith = ReplaceWith("backIconBrush"))
    override val backIconColor: StatefulValue<Color> = backIconBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    @Deprecated("use actionStartBrush", replaceWith = ReplaceWith("actionStartBrush"))
    override val actionStartColor: StatefulValue<Color> = actionStartBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    @Deprecated("use actionEndBrush", replaceWith = ReplaceWith("actionEndBrush"))
    override val actionEndColor: StatefulValue<Color> = actionEndBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    @Deprecated("use titleBrush", replaceWith = ReplaceWith("titleBrush"))
    override val titleColor: StatefulValue<Color> = titleBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    @Deprecated("use descriptionBrush", replaceWith = ReplaceWith("descriptionBrush"))
    override val descriptionColor: StatefulValue<Color> = descriptionBrush.transform {
        if (it is SolidColor) it.value else Color.Unspecified
    }

    class Builder : CollapsingNavigationBarColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null
        private var background: StatefulValue<Brush>? = null
        private var backIconColor: StatefulValue<Brush>? = null
        private var actionStartColor: StatefulValue<Brush>? = null
        private var actionEndColor: StatefulValue<Brush>? = null
        private var titleColor: StatefulValue<Brush>? = null
        private var descriptionColor: StatefulValue<Brush>? = null

        override fun background(backgroundColor: StatefulValue<Brush>) = apply {
            this.background = backgroundColor
        }

        override fun backIconBrush(backIconColor: StatefulValue<Brush>) = apply {
            this.backIconColor = backIconColor
        }

        override fun actionStartBrush(actionStartColor: StatefulValue<Brush>) = apply {
            this.actionStartColor = actionStartColor
        }

        override fun actionEndBrush(actionEndColor: StatefulValue<Brush>) = apply {
            this.actionEndColor = actionEndColor
        }

        override fun titleBrush(titleColor: StatefulValue<Brush>) = apply {
            this.titleColor = titleColor
        }

        override fun descriptionBrush(descriptionColor: StatefulValue<Brush>) = apply {
            this.descriptionColor = descriptionColor
        }

        override fun build(): CollapsingNavigationBarColors {
            return DefaultCollapsingNavigationBarColors(
                backIconBrush = backIconColor ?: Color.Black.asStatefulBrush(),
                actionStartBrush = actionStartColor ?: Color.Black.asStatefulBrush(),
                actionEndBrush = actionEndColor ?: Color.Black.asStatefulBrush(),
                titleBrush = titleColor ?: Color.White.asStatefulBrush(
                    setOf(CollapsingNavigationBarStates.Collapsed) to Color.Black,
                ),
                descriptionBrush = descriptionColor ?: Color.LightGray.asStatefulBrush(
                    setOf(CollapsingNavigationBarStates.Collapsed) to Color.DarkGray,
                ),
                background = background ?: Color.Transparent.asStatefulBrush(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface CollapsingNavigationBarDimensions {

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
     * Отступ сверху от текстового блока в сотстоянии expanded
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
     * Минимальная высота контент-области — блока со слотами actionStart, центрального контента
     * и actionEnd. Позволяет зафиксировать высоту компонента, чтобы она не менялась
     * при разной высоте содержимого слотов (например, иконка против текста).
     *
     * Значение для состояния [CollapsingNavigationBarStates.Collapsed] задаёт минимальную высоту
     * свёрнутого ряда, значение по умолчанию — минимальную высоту раскрытого блока.
     *
     * Величина относится именно к контент-области: вертикальные отступы добавляются сверх неё
     * и в неё не входят. Системные инсеты в величину также не входят.
     */
    val minContentHeight: StatefulValue<Dp>

    companion object {
        /**
         * Создает экземпляр [CollapsingNavigationBarDimensionsBuilder]
         */
        fun builder(): CollapsingNavigationBarDimensionsBuilder = DefaultCollapsingNavigationBarDimensions.Builder()
    }
}

/**
 * Builder для [CollapsingNavigationBarDimensions]
 */
interface CollapsingNavigationBarDimensionsBuilder {
    /**
     * Устанавливает отступ иконки назад [backIconMargin]
     */
    fun backIconMargin(backIconMargin: Dp): CollapsingNavigationBarDimensionsBuilder =
        backIconMargin(backIconMargin.asStatefulValue())

    /**
     * Устанавливает отступ иконки назад [backIconMargin]
     */
    fun backIconMargin(backIconMargin: StatefulValue<Dp>): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ сверху от внешнего (не встроенного) текстового блока [textBlockTopMargin]
     */
    fun textBlockTopMargin(textBlockTopMargin: Dp): CollapsingNavigationBarDimensionsBuilder =
        textBlockTopMargin(textBlockTopMargin.asStatefulValue())

    /**
     * Устанавливает отступ сверху от внешнего (не встроенного) текстового блока [textBlockTopMargin]
     */
    fun textBlockTopMargin(textBlockTopMargin: StatefulValue<Dp>): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает горизонтальный отступ между элементами основного блока [horizontalSpacing]
     */
    fun horizontalSpacing(horizontalSpacing: StatefulValue<Dp>): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает горизонтальный отступ между элементами основного блока [horizontalSpacing]
     */
    fun horizontalSpacing(horizontalSpacing: Dp): CollapsingNavigationBarDimensionsBuilder =
        horizontalSpacing(horizontalSpacing.asStatefulValue())

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): CollapsingNavigationBarDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): CollapsingNavigationBarDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): CollapsingNavigationBarDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): CollapsingNavigationBarDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ описания [descriptionPadding]
     */
    fun descriptionPadding(descriptionPadding: StatefulValue<Dp>): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ описания [descriptionPadding]
     */
    fun descriptionPadding(descriptionPadding: Dp): CollapsingNavigationBarDimensionsBuilder =
        descriptionPadding(descriptionPadding.asStatefulValue())

    /**
     * Устанавливает минимальную высоту контент-области [minContentHeight]
     */
    fun minContentHeight(minContentHeight: Dp): CollapsingNavigationBarDimensionsBuilder =
        minContentHeight(minContentHeight.asStatefulValue())

    /**
     * Устанавливает минимальную высоту контент-области [minContentHeight]
     */
    fun minContentHeight(minContentHeight: StatefulValue<Dp>): CollapsingNavigationBarDimensionsBuilder

    /**
     * Создает экземпляр [CollapsingNavigationBarDimensions]
     */
    fun build(): CollapsingNavigationBarDimensions
}

private class DefaultCollapsingNavigationBarDimensions(
    override val descriptionPadding: StatefulValue<Dp>,
    override val minContentHeight: StatefulValue<Dp>,
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,
    override val backIconMarginValues: StatefulValue<Dp>,
    override val horizontalSpacingValues: StatefulValue<Dp>,
    override val textBlockTopMarginValues: StatefulValue<Dp>,
) : CollapsingNavigationBarDimensions {

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
    class Builder : CollapsingNavigationBarDimensionsBuilder {

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

        override fun build(): CollapsingNavigationBarDimensions {
            return DefaultCollapsingNavigationBarDimensions(
                paddingStartValues = paddingStart ?: 16.dp.asStatefulValue(),
                paddingEndValues = paddingEnd ?: 16.dp.asStatefulValue(),
                paddingTopValues = paddingTop ?: 16.dp.asStatefulValue(),
                paddingBottomValues = paddingBottom ?: 16.dp.asStatefulValue(),
                backIconMarginValues = backIconMargin ?: 4.dp.asStatefulValue(),
                horizontalSpacingValues = horizontalSpacing ?: 16.dp.asStatefulValue(),
                descriptionPadding = descriptionPadding ?: 2.dp.asStatefulValue(),
                textBlockTopMarginValues = textBlockTopMargin ?: 64.dp.asStatefulValue(),
                minContentHeight = minContentHeight ?: 0.dp.asStatefulValue(),
            )
        }
    }
}
