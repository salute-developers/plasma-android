package com.sdds.compose.uikit

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.common.surface
import com.sdds.compose.uikit.internal.focusselector.LocalFocusSelectorMode
import com.sdds.compose.uikit.internal.focusselector.applyFocusSelector
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
    BaseIconText(
        modifier = modifier
            .applyFocusSelector(
                focusSelectorMode = LocalFocusSelectorMode.current,
                originalShape = style.shape,
            ) { isFocused.value }
            .surface(
                shape = style.shape,
                onClick = onClick,
                indication = indication,
                enabled = enabled,
                alpha = { if (it) ENABLED_CHIP_ALPHA else style.disableAlpha },
                role = Role.Button,
                interactionSource = interactionSource,
            ),
        shape = style.shape,
        dimensionsSet = dimensionsSet,
        colorsSet = colorsSet,
        labelContent = label,
        labelStyle = labelStyle,
        startContent = startContent,
        endContent = endContent,
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
    BaseIconText(
        modifier = modifier
            .applyFocusSelector(
                focusSelectorMode = LocalFocusSelectorMode.current,
                originalShape = style.shape,
            ) { isFocused.value }
            .surface(
                shape = style.shape,
                value = isSelected,
                onValueChange = onSelectedChange,
                indication = indication,
                enabled = enabled,
                alpha = { if (it) ENABLED_CHIP_ALPHA else style.disableAlpha },
                role = Role.Button,
                interactionSource = interactionSource,
            ),
        shape = style.shape,
        dimensionsSet = dimensionsSet,
        colorsSet = colorsSet,
        labelContent = label,
        labelStyle = labelStyle,
        startContent = startContent,
        endContent = endContent,
    )
}

/**
 * Вспомогательный объект для описания API и стиля компонента
 */
object Chip {

    /**
     * Размеры и отступы компонента [Chip]
     * @property height высота компонента
     * @property startPadding отступ в начале
     * @property endPadding отступ в конце
     * @property startContentSize размер контента в начале
     * @property endContentSize размер контента в конце
     * @property startContentMargin отступ от контента в начале
     * @property endContentMargin отступ от контента в конце
     */
    @Immutable
    data class Dimensions(
        val height: Dp = 48.dp,
        val startContentSize: Dp = 24.dp,
        val endContentSize: Dp = 24.dp,
        val startContentMargin: Dp = 12.dp,
        val endContentMargin: Dp = 12.dp,
        val startPadding: Dp = 12.dp,
        val endPadding: Dp = 12.dp,
    )
}

/**
 * Вспомогательный объект для описания API и стиля компонента
 */
object EmbeddedChip

internal fun Chip.Dimensions.toDimensionsSet(): BaseIconText.Dimensions {
    return BaseIconText.Dimensions(
        height = this.height,
        endContentSize = this.endContentSize,
        startContentSize = this.startContentSize,
        endContentMargin = this.endContentMargin,
        startContentMargin = this.startContentMargin,
        endPadding = this.endPadding,
        startPadding = this.startPadding,
    )
}

internal fun ChipColors.toColorsSet(): BaseIconText.Colors {
    return BaseIconText.Colors(
        backgroundColor = this.backgroundColor,
        contentColor = this.contentColor,
        labelColor = this.labelColor,
        startContentColor = this.startContentColor,
        endContentColor = this.endContentColor,
    )
}

private const val ENABLED_CHIP_ALPHA = 1f
