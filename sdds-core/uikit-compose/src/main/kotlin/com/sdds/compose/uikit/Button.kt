package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import com.sdds.compose.uikit.graphics.LocalIndication
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.BaseButton
import com.sdds.compose.uikit.internal.ButtonIcon
import com.sdds.compose.uikit.internal.ButtonText
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.button.ButtonMotionStyle
import com.sdds.compose.uikit.motion.components.button.IconButtonMotionStyle
import com.sdds.compose.uikit.motion.components.button.LinkButtonMotionStyle
import com.sdds.compose.uikit.motion.components.button.rememberButtonMotion
import com.sdds.compose.uikit.motion.components.button.rememberIconButtonMotion
import com.sdds.compose.uikit.motion.components.button.rememberLinkButtonMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

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
    indication: Indication? = LocalIndication.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClickLabel: String? = null,
    onClick: () -> Unit,
) {
    val motion: Motion<IconButtonMotionStyle> = rememberIconButtonMotion(
        motionContext = rememberMotionContext(interactionSource),
    )
    IconButton(
        iconRes = iconRes,
        modifier = modifier,
        motion = motion,
        iconContentDescription = iconContentDescription,
        style = style,
        enabled = enabled,
        loading = loading,
        indication = indication,
        onClickLabel = onClickLabel,
        onClick = onClick,
    )
}

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
 * @param onClick обработчик нажатий
 * @param onClickLabel надпись для Accessibility
 */
@Composable
fun IconButton(
    @DrawableRes
    iconRes: Int,
    motion: Motion<IconButtonMotionStyle>,
    modifier: Modifier = Modifier,
    iconContentDescription: String? = null,
    style: ButtonStyle = LocalIconButtonStyle.current,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = LocalIndication.current,
    onClickLabel: String? = null,
    onClick: () -> Unit,
) {
    val size = style.dimensions.heightValues.getValue(motion.context.interactionSource)
    BaseButton(
        modifier = modifier.requiredSize(size),
        onClick = onClick,
        style = style,
        enabled = enabled,
        loading = loading,
        indication = indication,
        motion = motion,
        onClickLabel = onClickLabel,
        startContent = {
            ButtonIcon(
                iconRes = iconRes,
                contentDescription = iconContentDescription,
                style = style,
                motion = motion,
            )
        },
    )
}

/**
 * Кнопка с иконкой.
 * Если [loading] == true, кнопка отобразит круглый индикатор загрузки.
 * На время анимации загрузки контент будет скрыт или станет полупрозрачным
 * в зависимости от стиля.
 * @param icon контент, представляющий иконку
 * @param onClick обработчик нажатий
 * @param modifier модификатор
 * @param iconContentDescription описание иконки
 * @param style стиль кнопки
 * @param enabled флаг доступности кнопки
 * @param loading флаг загрузки
 * @param indication [Indication] кнопки
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 * @param onClickLabel надпись для Accessibility
 * @param motion объект анимаций
 */
@Composable
fun IconButton(
    icon: @Composable () -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    iconContentDescription: String? = null,
    style: ButtonStyle = LocalIconButtonStyle.current,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = LocalIndication.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClickLabel: String? = null,
    motion: Motion<IconButtonMotionStyle> = rememberIconButtonMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    val dimensions = style.dimensions
    BaseButton(
        modifier = modifier.requiredSize(dimensions.heightValues.getValue(interactionSource)),
        onClick = onClick,
        style = style,
        enabled = enabled,
        loading = loading,
        indication = indication,
        motion = motion,
        onClickLabel = onClickLabel,
        startContent = {
            ButtonIcon(
                iconSize = dimensions.iconSizeValues,
                iconColor = style.colors.iconBrush,
                motion = motion,
                icon = icon,
            )
        },
    )
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
 * @param motion объект анимаций
 */
@Composable
fun LinkButton(
    modifier: Modifier = Modifier,
    label: String,
    style: ButtonStyle = LocalLinkButtonStyle.current,
    icons: ButtonIcons? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = LocalIndication.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
    onClickLabel: String? = null,
    motion: Motion<LinkButtonMotionStyle> = rememberLinkButtonMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
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
        motion = motion,
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
    indication: Indication? = LocalIndication.current,
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
    indication: Indication? = LocalIndication.current,
    iconContentDescription: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClickLabel: String? = null,
) {
    val dimensions = style.dimensions
    BaseButton(
        modifier = modifier.requiredSize(dimensions.heightValues.getValue(interactionSource)),
        onClick = onClick,
        onClickLabel = onClickLabel,
        style = style,
        enabled = enabled,
        loading = loading,
        indication = indication,
        motion = rememberIconButtonMotion(
            motionContext = rememberMotionContext(interactionSource),
        ),
        startContent = {
            ButtonIcon(
                icon = icon,
                style = style,
                contentDescription = iconContentDescription,
                motion = rememberButtonMotion(
                    motionContext = rememberMotionContext(interactionSource),
                ),
            )
        },
    )
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
 * @param motion объект анимаций
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
    indication: Indication? = LocalIndication.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClickLabel: String? = null,
    motion: Motion<ButtonMotionStyle> = rememberButtonMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    BaseButton(
        modifier = modifier,
        onClick = onClick,
        onClickLabel = onClickLabel,
        style = style,
        enabled = enabled,
        loading = loading,
        indication = indication,
        spacing = spacing,
        needPaddingCompensation = true,
        motion = motion,
        startContent =
        if (icons?.startRes != null || icons?.start != null) {
            { StartButtonIcon(icons = icons, style = style, motion = motion) }
        } else {
            null
        },
        endContent =
        if (icons?.endRes != null || icons?.end != null) {
            { EndButtonIcon(icons = icons, style = style, motion = motion) }
        } else {
            null
        },
    ) {
        ButtonText(
            label = label,
            labelTextStyle = style.labelStyles,
            labelColor = style.colors.labelBrush,
            valueTextStyle = style.valueStyles,
            valueColor = style.colors.valueBrush,
            value = value,
            valueMargin = style.dimensions.valueMarginValues,
            motion = motion,
        )
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
private fun StartButtonIcon(
    icons: ButtonIcons?,
    style: ButtonStyle,
    motion: Motion<ButtonMotionStyle>,
) {
    if (icons?.startRes != null) {
        ButtonIcon(
            iconRes = icons.startRes,
            contentDescription = icons.startContentDescription,
            style = style,
            marginEnd = style.dimensions.iconMarginValues,
            motion = motion,
        )
    } else if (icons?.start != null) {
        ButtonIcon(
            icon = icons.start,
            contentDescription = icons.startContentDescription,
            style = style,
            marginEnd = style.dimensions.iconMarginValues,
            motion = motion,
        )
    }
}

@Composable
private fun EndButtonIcon(
    icons: ButtonIcons?,
    style: ButtonStyle,
    motion: Motion<ButtonMotionStyle>,
) {
    if (icons?.endRes != null) {
        ButtonIcon(
            iconRes = icons.endRes,
            contentDescription = icons.endContentDescription,
            style = style,
            marginStart = style.dimensions.iconMarginValues,
            motion = motion,
        )
    } else if (icons?.end != null) {
        ButtonIcon(
            icon = icons.end,
            contentDescription = icons.endContentDescription,
            style = style,
            marginStart = style.dimensions.iconMarginValues,
            motion = motion,
        )
    }
}
