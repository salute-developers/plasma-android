package com.sdds.compose.uikit

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
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
 * На время анимации загрузки контент будет скрыт или станет полупрозрачным
 * в зависимости от режима [spinnerMode].
 *
 * @param icon иконка
 * @param onClick обработчик нажатий
 * @param modifier модификатор
 * @param shape форма кнопки
 * @param dimensions размеры кнопки
 * @param contentColor цвет контента кнопки
 * @param spinnerColor цвет индикатора загрузки
 * @param spinnerMode режим, определяющий, как выглядит контент во время анимации загрузки
 * @param backgroundColor цвет фона кнопки
 * @param pressedBackgroundColor цвет фона, когда кнопка нажата
 * @param enabled флаг доступности кнопки
 * @param loading флаг загрузки
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 */
@Composable
fun IconButton(
    icon: Painter,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: CornerBasedShape = RoundedCornerShape(25),
    dimensions: Button.Dimensions = Button.Dimensions(),
    contentColor: Color = Color.White,
    spinnerColor: Color = contentColor,
    spinnerMode: Button.SpinnerMode = Button.SpinnerMode.HideContent,
    backgroundColor: Color = Color.Black,
    pressedBackgroundColor: Color = Color.Black.copy(alpha = 0.2f),
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    BaseButton(
        modifier = modifier.requiredSize(dimensions.height),
        onClick = onClick,
        shape = shape,
        dimensions = dimensions,
        contentColor = contentColor,
        backgroundColor = backgroundColor,
        pressedBackgroundColor = pressedBackgroundColor,
        enabledAlpha = ENABLED_BUTTON_ALPHA,
        disabledAlpha = DISABLED_BUTTON_ALPHA,
        spinnerColor = spinnerColor,
        spinnerMode = spinnerMode,
        enabled = enabled,
        loading = loading,
        indication = indication,
        interactionSource = interactionSource,
    ) {
        ButtonIcon(
            icon = icon,
            size = dimensions.iconSize,
        )
    }
}

/**
 * Кнопка с текстом и иконкой.
 * Если [loading] == true, кнопка отобразит круглый индикатор загрузки.
 * Кнопка умеет отобрать иконки в начале и в конце.
 *
 * @param label текст кнопки
 * @param onClick обработчик нажатий
 * @param modifier модификатор
 * @param shape форма кнопки
 * @param dimensions размеры кнопки
 * @param contentColor цвет контента (иконка, label)
 * @param spinnerColor цвет индикатора загрузки
 * @param spinnerMode режим, определяющий, как выглядит контент во время анимации загрузки
 * @param backgroundColor цвет фона кнопки
 * @param pressedBackgroundColor цвет фона, когда кнопка нажата
 * @param value доп. текст кнопки
 * @param valueColor цвет доп. текста
 * @param labelTextStyle стиль основного текста
 * @param valueTextStyle стиль доп. текста
 * @param valueColor цвет доп. текста
 * @param icons иконки
 * @param spacing вид отступа между [label] и [value]
 * @param enabled флаг доступности кнопки
 * @param loading флаг загрузки
 * @param enabledAlpha альфа кнопки в активном состоянии
 * @param disabledAlpha альфа кнопки в неактивном состоянии
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 */
@Composable
fun Button(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: CornerBasedShape = RoundedCornerShape(25),
    dimensions: Button.Dimensions = Button.Dimensions(),
    contentColor: Color = Color.White,
    spinnerColor: Color = contentColor,
    spinnerMode: Button.SpinnerMode = Button.SpinnerMode.HideContent,
    backgroundColor: Color = Color.Black,
    pressedBackgroundColor: Color = Color.Black.copy(alpha = 0.2f),
    value: String? = null,
    valueColor: Color = contentColor.copy(alpha = VALUE_ALPHA),
    labelTextStyle: TextStyle = TextStyle.Default,
    valueTextStyle: TextStyle = labelTextStyle,
    icons: Button.Icons? = null,
    spacing: Button.Spacing = Button.Spacing.Packed,
    enabled: Boolean = true,
    loading: Boolean = false,
    enabledAlpha: Float = ENABLED_BUTTON_ALPHA,
    disabledAlpha: Float = DISABLED_BUTTON_ALPHA,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val dimensions = dimensions.let {
        var paddings = it.paddings
        paddings = when {
            icons?.start != null -> paddings.copy(start = paddings.start - IconPaddingOffset)
            icons?.end != null -> paddings.copy(end = paddings.end - IconPaddingOffset)
            else -> paddings
        }
        it.copy(paddings = paddings)
    }
    BaseButton(
        modifier = modifier,
        onClick = onClick,
        contentColor = contentColor,
        backgroundColor = backgroundColor,
        pressedBackgroundColor = pressedBackgroundColor,
        spinnerColor = spinnerColor,
        spinnerMode = spinnerMode,
        enabledAlpha = enabledAlpha,
        disabledAlpha = disabledAlpha,
        enabled = enabled,
        shape = shape,
        loading = loading,
        dimensions = dimensions,
        indication = indication,
        interactionSource = interactionSource,
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
            labelTextStyle = labelTextStyle.copy(color = contentColor),
            valueTextStyle = valueTextStyle.copy(color = valueColor),
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

/**
 * Содержит сущности для конфигурирования кнопки
 */
object Button {

    /**
     * Размеры и отступы, которые используются внутри кнопки.
     *
     * @property height высота кнопки
     * @property paddings горизонтальные отступы кнопки
     * @property minWidth минимальная ширина кнопки
     * @property iconSize размер иконки
     * @property spinnerSize размер спиннера
     * @property spinnerStrokeWidth толщина спиннера
     * @property iconMargin отступ иконки
     * @property valueMargin отступ доп. текста
     */
    @Immutable
    data class Dimensions(
        val height: Dp = 48.dp,
        val paddings: PaddingValues = PaddingValues(),
        val minWidth: Dp = 84.dp,
        val iconSize: Dp = 24.dp,
        val spinnerSize: Dp = 22.dp,
        val spinnerStrokeWidth: Dp = 2.dp,
        val iconMargin: Dp = 6.dp,
        val valueMargin: Dp = 4.dp,
    ) {

        /**
         * Горизонтальные отступы кнопки
         *
         * @property start начальный отступ
         * @property end конечный отступ
         */
        @Immutable
        data class PaddingValues(
            val start: Dp = 20.dp,
            val end: Dp = 20.dp,
        ) {
            constructor(horizontal: Dp) : this(horizontal, horizontal)
        }
    }

    /**
     * Режим, определяющий, как выглядит контент во время индикации загрузки.
     *
     * @property contentAlpha альфа контента
     */
    sealed class SpinnerMode(val contentAlpha: Float) {

        /**
         * Контент будет скрыт во время загрузки, имеет alpha = 0
         */
        object HideContent : SpinnerMode(0f)

        /**
         * Контент станет полупрозрачным, с альфой [alpha]
         */
        data class SemitransparentContent(val alpha: Float) : SpinnerMode(alpha)
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
}

private const val VALUE_ALPHA = 0.56f
private const val ENABLED_BUTTON_ALPHA = 1f
private const val DISABLED_BUTTON_ALPHA = 0.4f
private val IconPaddingOffset = 2.dp
