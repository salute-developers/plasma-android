package com.sdds.compose.uikit

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.semantics.Role
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.compose.uikit.internal.common.surface
import com.sdds.compose.uikit.internal.icontext.BaseIconText

/**
 * Компонент Chip с поддержкой кликабельности
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param onClick обработчик нажатий
 * @param label текст
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param enabled включен ли компонент
 * @param indication [Indication]
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Chip(
    modifier: Modifier = Modifier,
    style: ChipStyle = LocalChipStyle.current,
    onClick: (() -> Unit)? = null,
    label: String = "",
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val isFocused = interactionSource.collectIsFocusedAsState()
    val labelStyle = style.labelStyle
    val dimensionsSet = style.dimensions.toDimensionsSet()
    val colorsSet = style.colors.toColorsSet()
    val backgroundColor = style.colors.backgroundColor.colorForInteractionAsState(interactionSource)
    BaseIconText(
        modifier = modifier
            .focusSelector(
                settings = LocalFocusSelectorSettings.current,
                shape = style.shape,
            ) { isFocused.value }
            .surface(
                shape = style.shape,
                backgroundColor = { SolidColor(backgroundColor.value) },
                onClick = onClick,
                indication = indication,
                enabled = enabled,
                alpha = { if (it) ENABLED_CHIP_ALPHA else style.disableAlpha },
                role = Role.Button,
                interactionSource = interactionSource,
            ),
        dimensionsSet = dimensionsSet,
        colorsSet = colorsSet,
        labelContent = label,
        labelStyle = labelStyle,
        startContent = startContent,
        endContent = endContent,
        interactionSource = interactionSource,
    )
}

/**
 * Компонент Chip с поддержкой selected состояния
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param isSelected выбран ли chip
 * @param onSelectedChange обработчик смены состояния chip
 * @param startContent контент вначале
 * @param label текст
 * @param endContent контент вконце
 * @param enabled включен ли компонент
 * @param indication [Indication]
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Chip(
    modifier: Modifier = Modifier,
    style: ChipStyle = LocalChipStyle.current,
    isSelected: Boolean = false,
    onSelectedChange: ((Boolean) -> Unit)? = null,
    label: String = "",
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val isFocused = interactionSource.collectIsFocusedAsState()
    val labelStyle = style.labelStyle
    val dimensionsSet = style.dimensions.toDimensionsSet()
    val colorsSet = style.colors.toColorsSet()
    val backgroundColor = style.colors.backgroundColor.colorForInteractionAsState(interactionSource)
    BaseIconText(
        modifier = modifier
            .focusSelector(
                settings = LocalFocusSelectorSettings.current,
                shape = style.shape,
            ) { isFocused.value }
            .surface(
                shape = style.shape,
                backgroundColor = { SolidColor(backgroundColor.value) },
                value = isSelected,
                onValueChange = onSelectedChange,
                indication = indication,
                enabled = enabled,
                alpha = { if (it) ENABLED_CHIP_ALPHA else style.disableAlpha },
                role = Role.Button,
                interactionSource = interactionSource,
            ),
        dimensionsSet = dimensionsSet,
        colorsSet = colorsSet,
        labelContent = label,
        labelStyle = labelStyle,
        startContent = startContent,
        endContent = endContent,
        interactionSource = interactionSource,
    )
}

internal fun ChipDimensions.toDimensionsSet(): BaseIconText.Dimensions {
    return BaseIconText.Dimensions(
        height = this.height,
        endContentSize = this.contentEndSize,
        startContentSize = this.contentStartSize,
        endContentMargin = this.contentEndPadding,
        startContentMargin = this.contentStartPadding,
        endPadding = this.paddingEnd,
        startPadding = this.paddingStart,
    )
}

internal fun ChipColors.toColorsSet(): BaseIconText.Colors {
    return BaseIconText.Colors(
        contentColor = this.contentColor,
        labelColor = this.labelColor,
        startContentColor = this.contentStartColor,
        endContentColor = this.contentEndColor,
    )
}

private const val ENABLED_CHIP_ALPHA = 1f
