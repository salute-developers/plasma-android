package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.BaseButton
import com.sdds.compose.uikit.internal.ButtonIcon
import com.sdds.compose.uikit.internal.ButtonText

/**
 * Кнопка с иконкой.
 * Если [loading] == true, кнопка отобразит круглый индикатор загрузки.
 *
 * @param icon иконка
 * @param onClick обработчик нажатий
 * @param modifier модификатор
 * @param shape форма кнопки
 * @param size размер кнопки
 * @param style стиль кнопки
 * @param enabled флаг доступности кнопки
 * @param loading флаг загрузки
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 */
@Composable
fun IconButton(
    icon: Painter,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    settingsProvider: Button.ButtonSettingsProvider,
    shape: Button.IconButtonShape = Button.IconButtonShape.Rounded,
    size: Button.Size = Button.Size.M,
    style: Button.Style = Button.Style.Default,
    enabled: Boolean = true,
    loading: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val dimensions = settingsProvider.iconButtonDimensionsFor(size)
    val innerShape = when (shape) {
        Button.IconButtonShape.Rounded -> settingsProvider.shapeFor(size)
        Button.IconButtonShape.Circle -> CircleShape
    }
    BaseButton(
        modifier = modifier.requiredSize(dimensions.height),
        onClick = onClick,
        shape = innerShape,
        size = size,
        style = style,
        enabled = enabled,
        loading = loading,
        showContentWhenLoading = false,
        interactionSource = interactionSource,
        dimensions = dimensions,
        settingsProvider = settingsProvider,
    ) {
        ButtonIcon(
            icon = icon,
            size = dimensions.iconSize,
        )
    }
}

/**
 * Кнопка с иконкой.
 * Если [loading] == true, кнопка отобразит круглый индикатор загрузки.
 * Кнопка умеет отобрать иконки в начале и в конце.
 *
 * @param label текст кнопки
 * @param onClick обработчик нажатий
 * @param modifier модификатор
 * @param value доп. текст кнопки
 * @param icons иконки
 * @param size размер кнопки
 * @param style стиль кнопки
 * @param spacing вид отступа между [label] и [value]
 * @param enabled флаг доступности кнопки
 * @param loading флаг загрузки
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 */
@Composable
fun BasicButton(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    value: String? = null,
    icons: Button.Icons? = null,
    size: Button.Size = Button.Size.M,
    style: Button.Style = Button.Style.Default,
    spacing: Button.Spacing = Button.Spacing.Packed,
    enabled: Boolean = true,
    loading: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    settingsProvider: Button.ButtonSettingsProvider,
) {
    val contentColor = settingsProvider.contentColorFor(style)
    val dimensions = size.basicButtonDimensions().let { dimensions ->
        var paddings = dimensions.paddings
        paddings = when {
            icons?.start != null -> paddings.copy(start = paddings.start - 2.dp)
            icons?.end != null -> paddings.copy(end = paddings.end - 2.dp)
            else -> paddings
        }
        dimensions.copy(paddings = paddings)
    }
    BaseButton(
        modifier = modifier,
        onClick = onClick,
        size = size,
        style = style,
        contentColor = contentColor,
        enabled = enabled,
        loading = loading,
        showContentWhenLoading = style == Button.Style.Clear,
        interactionSource = interactionSource,
        dimensions = dimensions,
        settingsProvider = settingsProvider,
    ) {
        if (icons?.start != null) {
            ButtonIcon(
                icon = icons.start,
                size = dimensions.iconSize,
                marginEnd = dimensions.iconMargin,
            )
        }

        ButtonText(
            label = label,
            style = settingsProvider.textStyleFor(size),
            color = contentColor,
            spacing = spacing,
            value = value,
            valueMargin = dimensions.valueMargin,
        )

        if (icons?.end != null) {
            ButtonIcon(
                icon = icons.end,
                size = dimensions.iconSize,
                marginStart = dimensions.iconMargin,
            )
        }
    }
}

@Composable
private fun Button.Size.basicButtonDimensions(): Button.Dimensions =
    when (this) {
        Button.Size.L -> Button.Dimensions(
            height = 56.dp,
            paddings = Button.Dimensions.PaddingValues(horizontal = 24.dp),
            minWidth = 98.dp,
            iconSize = 24.dp,
            spinnerSize = 22.dp,
            iconMargin = 8.dp,
            valueMargin = 4.dp,
        )

        Button.Size.M -> Button.Dimensions(
            height = 48.dp,
            paddings = Button.Dimensions.PaddingValues(horizontal = 20.dp),
            minWidth = 84.dp,
            iconSize = 24.dp,
            spinnerSize = 22.dp,
            iconMargin = 6.dp,
            valueMargin = 4.dp,
        )

        Button.Size.S -> Button.Dimensions(
            height = 40.dp,
            paddings = Button.Dimensions.PaddingValues(horizontal = 16.dp),
            minWidth = 71.dp,
            iconSize = 24.dp,
            spinnerSize = 22.dp,
            iconMargin = 4.dp,
            valueMargin = 4.dp,
        )

        Button.Size.XS -> Button.Dimensions(
            height = 32.dp,
            paddings = Button.Dimensions.PaddingValues(horizontal = 12.dp),
            minWidth = 57.dp,
            iconSize = 24.dp,
            spinnerSize = 16.dp,
            iconMargin = 4.dp,
            valueMargin = 2.dp,
        )
    }

/**
 * Содержит сущности для конфигурирования кнопки
 */
object Button {

    /**
     * Размеры и отступы, которые используются внутри кнопки.
     * Нужны только для использования внутри библиотеки.
     */
    data class Dimensions(
        val height: Dp = 0.dp,
        val paddings: PaddingValues = PaddingValues(),
        val minWidth: Dp = 0.dp,
        val iconSize: Dp = 0.dp,
        val spinnerSize: Dp = 0.dp,
        val iconMargin: Dp = 0.dp,
        val valueMargin: Dp = 0.dp,
    ) {

        data class PaddingValues(
            val start: Dp = 0.dp,
            val end: Dp = 0.dp,
        ) {
            constructor(horizontal: Dp) : this(horizontal, horizontal)
        }
    }

    /**
     * Размеры кнопки
     */
    enum class Size {
        L, M, S, XS
    }

    /**
     * Стиль отображения кнопки
     */
    enum class Style {
        Default,
        Secondary,
        Accent,
        Positive,
        Negative,
        Warning,
        Clear,
        Dark,
        Black,
        White,
    }

    /**
     * Способы группировки контента в кнопке при помощи отступов.
     * В основном контролирует отображение текста Label-Value.
     */
    enum class Spacing {

        /**
         * Контент "упакован", отступы будут добавлены снаружи
         */
        Packed,

        /**
         * Контент отобразится по всей ширине, отступы будут добавлены
         * между элементами контента
         */
        SpaceBetween,
    }

    /**
     * Иконки кнопки
     * @property start иконка, которая будет добавлена в начале
     * @property end иконка, которая будет добавлена в конце
     */
    data class Icons(
        val start: Painter? = null,
        val end: Painter? = null,
    )

    /**
     * Форма кнопки [IconButton]
     */
    enum class IconButtonShape {
        /**
         * Скругленные края
         */
        Rounded,

        /**
         * Круглая форма
         */
        Circle,
    }

    /**
     * Интерфейс провайдера настроек в зависимости от стиля и размера кнопки
     */
    interface ButtonSettingsProvider {
        /**
         * Вернёт форму [CornerBasedShape] кнопки для соответствующего [Size]
         */
        @Composable
        fun shapeFor(size: Size): CornerBasedShape

        /**
         * Вернёт цвет [Color] контента кнопки для соответствующего [Style]
         */
        @Composable
        fun contentColorFor(style: Style): Color

        /**
         * Вернёт цвет [Color] бэкграунда кнопки для соответствующего [Style]
         */
        @Composable
        fun backgroundColorFor(style: Style): Color

        /**
         * Вернёт текстовый стиль [TextStyle] для соответствующего [Size]
         */
        @Composable
        fun textStyleFor(size: Size): TextStyle

        /**
         * Вернёт [Dimensions] для соответствующего [Size]
         */
        @Composable
        fun iconButtonDimensionsFor(size: Size): Dimensions
    }
}
