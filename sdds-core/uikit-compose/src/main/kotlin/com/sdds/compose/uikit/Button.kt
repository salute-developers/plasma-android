package com.sdds.compose.uikit

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
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
 * @param spinnerMode режим, определяющий, как выглядит контент во время анимации загрузки
 * @param enabled флаг доступности кнопки
 * @param loading флаг загрузки
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 */
@Composable
fun IconButton(
    icon: Painter,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: ButtonStyle = LocalIconButtonStyle.current,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val dimensions = style.dimensions
    BaseButton(
        modifier = modifier.requiredSize(dimensions.height),
        onClick = onClick,
        shape = style.shape,
        dimensions = dimensions,
        colors = style.colors,
        spinnerMode = Button.SpinnerMode.HideContent,
        enabled = enabled,
        loading = loading,
        enabledAlpha = ENABLED_BUTTON_ALPHA,
        disabledAlpha = style.disableAlpha,
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
 * @param spinnerMode режим, определяющий, как выглядит контент во время анимации загрузки
 * @param value доп. текст кнопки
 * @param icons иконки
 * @param spacing вид отступа между [label] и [value]
 * @param enabled флаг доступности кнопки
 * @param loading флаг загрузки
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 */
@Composable
fun Button(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    value: String? = null,
    style: ButtonStyle = LocalButtonStyle.current,
    spacing: Button.Spacing = Button.Spacing.Packed,
    icons: Button.Icons? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val dimensions = style.dimensions.let {
        var paddings = it.paddings
        paddings = when {
            icons?.start != null -> paddings.copy(start = paddings.start - IconPaddingOffset)
            icons?.end != null -> paddings.copy(end = paddings.end - IconPaddingOffset)
            else -> paddings
        }
        it.copy(paddings = paddings)
    }
    val colors = style.colors

    BaseButton(
        modifier = modifier,
        onClick = onClick,
        colors = colors,
        spinnerMode = style.spinnerMode,
        enabledAlpha = ENABLED_BUTTON_ALPHA,
        disabledAlpha = style.disableAlpha,
        enabled = enabled,
        shape = style.shape,
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
        val labelColor = colors.labelColor.colorForInteraction(interactionSource)
        val valueColor = colors.valueColor.colorForInteraction(interactionSource)
        ButtonText(
            label = label,
            labelTextStyle = style.labelStyle,
            labelColor = labelColor,
            valueTextStyle = style.valueStyle,
            valueColor = valueColor,
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

private const val ENABLED_BUTTON_ALPHA = 1f
private val IconPaddingOffset = 2.dp
