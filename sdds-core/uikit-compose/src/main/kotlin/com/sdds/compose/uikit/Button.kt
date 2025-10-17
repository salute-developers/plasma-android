package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
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
 * в зависимости от стиля.
 *
 * @param iconRes иконка
 * @param modifier модификатор
 * @param iconContentDescription описание иконки
 * @param style стиль кнопки
 * @param enabled флаг доступности кнопки
 * @param loading флаг загрузки
 * @param indication [Indication] кнопки
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 * @param onClick обработчик нажатий
 * @param onClickLabel надпись для Accessibility
 */
@Composable
fun IconButton(
    @DrawableRes
    iconRes: Int,
    modifier: Modifier = Modifier,
    iconContentDescription: String? = null,
    style: ButtonStyle = LocalIconButtonStyle.current,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClickLabel: String? = null,
    onClick: () -> Unit,
) {
    val dimensions = style.dimensions
    BaseButton(
        modifier = modifier.requiredSize(dimensions.height),
        onClick = onClick,
        shape = LocalButtonForceShape.current ?: style.shape,
        dimensions = dimensions,
        colors = style.colors,
        enabled = enabled,
        loading = loading,
        loadingAlpha = style.loadingAlpha,
        disabledAlpha = style.disableAlpha,
        indication = indication,
        interactionSource = interactionSource,
        onClickLabel = onClickLabel,
    ) {
        ButtonIcon(
            iconRes = iconRes,
            contentDescription = iconContentDescription,
            size = dimensions.iconSize,
            iconColor = style.colors.iconColor.colorForInteraction(interactionSource),
        )
    }
}

/**
 * Кнопка с текстом и иконкой с прозрачным фоном.
 * Если [loading] == true, кнопка отобразит круглый индикатор загрузки.
 * На время анимации загрузки контент будет скрыт или станет полупрозрачным
 * в зависимости от стиля.
 *
 * @param modifier модификатор
 * @param label текст кнопки
 * @param style стиль кнопки
 * @param icons иконки
 * @param enabled флаг доступности кнопки
 * @param loading флаг загрузки
 * @param indication [Indication] кнопки
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 * @param onClick обработчик нажатий
 * @param onClickLabel надпись для Accessibility
 */
@Composable
fun LinkButton(
    modifier: Modifier = Modifier,
    label: String,
    style: ButtonStyle = LocalLinkButtonStyle.current,
    icons: ButtonIcons? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
    onClickLabel: String? = null,
) {
    Button(
        label = label,
        onClick = onClick,
        modifier = modifier,
        style = style,
        icons = icons,
        enabled = enabled,
        loading = loading,
        indication = indication,
        interactionSource = interactionSource,
        onClickLabel = onClickLabel,
    )
}

/**
 * Кнопка с иконкой.
 * Если [loading] == true, кнопка отобразит круглый индикатор загрузки.
 * На время анимации загрузки контент будет скрыт или станет полупрозрачным
 * в зависимости от стиля.
 *
 * @param icon иконка
 * @param onClick обработчик нажатий
 * @param modifier модификатор
 * @param style стиль кнопки
 * @param enabled флаг доступности кнопки
 * @param loading флаг загрузки
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 * @param onClickLabel надпись для Accessibility
 */
@Composable
@NonRestartableComposable
@Deprecated("Use IconButton with iconRes parameter")
fun IconButton(
    icon: Painter,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: ButtonStyle = LocalIconButtonStyle.current,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClickLabel: String? = null,
) {
    IconButton(
        icon = icon,
        onClick = onClick,
        modifier = modifier,
        style = style,
        enabled = enabled,
        loading = loading,
        indication = indication,
        interactionSource = interactionSource,
        iconContentDescription = null,
        onClickLabel = onClickLabel,
    )
}

/**
 * Кнопка с иконкой.
 * Если [loading] == true, кнопка отобразит круглый индикатор загрузки.
 * На время анимации загрузки контент будет скрыт или станет полупрозрачным
 * в зависимости от стиля.
 *
 * @param icon иконка
 * @param onClick обработчик нажатий
 * @param modifier модификатор
 * @param style стиль кнопки
 * @param enabled флаг доступности кнопки
 * @param loading флаг загрузки
 * @param iconContentDescription описание иконки
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 * @param onClickLabel надпись для Accessibility
 */
@Composable
@Deprecated("Use IconButton with iconRes parameter")
fun IconButton(
    icon: Painter,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: ButtonStyle = LocalIconButtonStyle.current,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = null,
    iconContentDescription: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClickLabel: String? = null,
) {
    val dimensions = style.dimensions
    BaseButton(
        modifier = modifier.requiredSize(dimensions.height),
        onClick = onClick,
        onClickLabel = onClickLabel,
        shape = LocalButtonForceShape.current ?: style.shape,
        dimensions = dimensions,
        colors = style.colors,
        enabled = enabled,
        loading = loading,
        loadingAlpha = style.loadingAlpha,
        disabledAlpha = style.disableAlpha,
        indication = indication,
        interactionSource = interactionSource,
    ) {
        ButtonIcon(
            icon = icon,
            contentDescription = iconContentDescription,
            size = dimensions.iconSize,
            iconColor = style.colors.iconColor.colorForInteraction(interactionSource),
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
 * @param style стиль кнопки
 * @param value доп. текст кнопки
 * @param icons иконки
 * @param spacing вид отступа между [label] и [value]
 * @param enabled флаг доступности кнопки
 * @param loading флаг загрузки
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 * @param onClickLabel надпись для Accessibility
 */
@Composable
fun Button(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    value: String? = null,
    style: ButtonStyle = LocalButtonStyle.current,
    spacing: ButtonSpacing = ButtonSpacing.Packed,
    icons: ButtonIcons? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClickLabel: String? = null,
) {
    val dimensions = style.dimensions.let {
        var paddingStart = it.paddingStart
        var paddingEnd = it.paddingEnd
        when {
            (icons?.start != null || icons?.startRes != null) && paddingStart > IconPaddingOffset ->
                paddingStart -= IconPaddingOffset

            (icons?.end != null || icons?.endRes != null) && paddingEnd > IconPaddingOffset ->
                paddingEnd -= IconPaddingOffset

            else -> {}
        }
        it.copy(paddingStart = paddingStart, paddingEnd = paddingEnd)
    }
    val colors = style.colors

    BaseButton(
        modifier = modifier,
        onClick = onClick,
        colors = colors,
        onClickLabel = onClickLabel,
        loadingAlpha = style.loadingAlpha,
        disabledAlpha = style.disableAlpha,
        enabled = enabled,
        shape = LocalButtonForceShape.current ?: style.shape,
        loading = loading,
        dimensions = dimensions,
        indication = indication,
        interactionSource = interactionSource,
    ) {
        StartButtonIcon(icons, dimensions, style.colors, interactionSource)

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

        EndButtonIcon(icons, dimensions, style.colors, interactionSource)
    }
}

/**
 * Размеры и отступы, которые используются внутри кнопки.
 *
 * @property height высота кнопки
 * @property paddingStart отступ кнопки в начале
 * @property paddingEnd отступ кнопки в конце
 * @property minWidth минимальная ширина кнопки
 * @property iconSize размер иконки
 * @property spinnerSize размер спиннера
 * @property spinnerStrokeWidth толщина спиннера
 * @property iconMargin отступ иконки
 * @property valueMargin отступ доп. текста
 */
@Immutable
data class ButtonDimensions(
    val height: Dp = 48.dp,
    val paddingStart: Dp = 0.dp,
    val paddingEnd: Dp = 0.dp,
    val minWidth: Dp = 84.dp,
    val iconSize: Dp = 24.dp,
    val spinnerSize: Dp = 22.dp,
    val spinnerStrokeWidth: Dp = 2.dp,
    val iconMargin: Dp = 6.dp,
    val valueMargin: Dp = 4.dp,
)

/**
 * Способы группировки контента в кнопке при помощи отступов.
 * В основном контролирует отображение текста Label-Value.
 */
enum class ButtonSpacing {

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
 * @property startRes иконка, которая будет добавлена в начале
 * @property endRes иконка, которая будет добавлена в конце
 * @property startContentDescription описание иконки в начале
 * @property endContentDescription описание иконки в конце
 */
class ButtonIcons(
    @Deprecated("Use startRes instead")
    val start: Painter? = null,
    @Deprecated("Use endRes instead")
    val end: Painter? = null,
    val startContentDescription: String? = null,
    val endContentDescription: String? = null,
    @DrawableRes
    val startRes: Int? = null,
    @DrawableRes
    val endRes: Int? = null,
) {

    /**
     * Создает [ButtonIcons] с указанными иконками вначале [start] и вконце [end]
     */
    constructor(start: Painter?, end: Painter?) : this(start, end, null, null)

    /**
     * Копирует [ButtonIcons]
     */
    fun copy(
        start: Painter? = this.start,
        end: Painter? = this.end,
        startContentDescription: String? = this.startContentDescription,
        endContentDescription: String? = this.endContentDescription,
    ): ButtonIcons = ButtonIcons(start, end, startContentDescription, endContentDescription)
}

internal val LocalButtonForceShape: ProvidableCompositionLocal<Shape?> =
    compositionLocalOf(structuralEqualityPolicy()) { null }

@Composable
private fun RowScope.StartButtonIcon(
    icons: ButtonIcons?,
    dimensions: ButtonDimensions,
    colors: ButtonColors,
    interactionSource: InteractionSource,
) {
    if (icons?.startRes != null) {
        ButtonIcon(
            iconRes = icons.startRes,
            contentDescription = icons.startContentDescription,
            size = dimensions.iconSize,
            marginEnd = dimensions.iconMargin,
            iconColor = colors.iconColor.colorForInteraction(interactionSource),
        )
    } else if (icons?.start != null) {
        ButtonIcon(
            icon = icons.start,
            contentDescription = icons.startContentDescription,
            size = dimensions.iconSize,
            marginEnd = dimensions.iconMargin,
            iconColor = colors.iconColor.colorForInteraction(interactionSource),
        )
    }
}

@Composable
private fun RowScope.EndButtonIcon(
    icons: ButtonIcons?,
    dimensions: ButtonDimensions,
    colors: ButtonColors,
    interactionSource: InteractionSource,
) {
    if (icons?.endRes != null) {
        ButtonIcon(
            iconRes = icons.endRes,
            contentDescription = icons.endContentDescription,
            size = dimensions.iconSize,
            marginStart = dimensions.iconMargin,
            iconColor = colors.iconColor.colorForInteraction(interactionSource),
        )
    } else if (icons?.end != null) {
        ButtonIcon(
            icon = icons.end,
            contentDescription = icons.endContentDescription,
            size = dimensions.iconSize,
            marginStart = dimensions.iconMargin,
            iconColor = colors.iconColor.colorForInteraction(interactionSource),
        )
    }
}

private val IconPaddingOffset = 2.dp
