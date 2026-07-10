package com.sdds.compose.uikit

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.compose.uikit.graphics.LocalIndication
import com.sdds.compose.uikit.interactions.MutableSemanticStateSource
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.interactions.selection
import com.sdds.compose.uikit.internal.common.surface
import com.sdds.compose.uikit.internal.icontext.BaseIconText
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.chip.ChipMotionStyle
import com.sdds.compose.uikit.motion.components.chip.rememberChipMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

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
    indication: Indication? = LocalIndication.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    semanticStateSource: MutableSemanticStateSource = remember { MutableSemanticStateSource() },
) {
    val motion = rememberChipMotion(
        motionContext = rememberMotionContext(semanticStateSource, interactionSource),
    )
    val isFocused = motion.context.interactionSource.collectIsFocusedAsState()
    val dimensionsSet = style.dimensions.toDimensionsSet()
    val colorsSet = style.colors.toColorsSet()
    val backgroundColor = style.colors.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
    val currentShape by style.shapes.getValueAsState(motion.context)
    BaseIconText(
        modifier = modifier
            .focusSelector(
                settings = LocalFocusSelectorSettings.current,
                shape = currentShape,
            ) { isFocused.value }
            .surface(
                shape = currentShape,
                backgroundColor = { backgroundColor.value },
                onClick = onClick,
                indication = indication,
                enabled = enabled,
                alpha = { if (it) ENABLED_CHIP_ALPHA else style.disableAlpha },
                role = Role.Button,
                interactionSource = motion.context.interactionSource,
            ),
        dimensionsSet = dimensionsSet,
        brushesSet = colorsSet,
        labelContent = label,
        labelStyle = style.labelStyles,
        startContent = startContent,
        endContent = endContent,
        motion = motion,
    )
}

/**
 * Компонент Chip с поддержкой кликабельности
 *
 * @param label текст
 * @param modifier модификатор
 * @param style стиль компонента
 * @param onClick обработчик нажатий
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param enabled включен ли компонент
 * @param indication [Indication]
 * @param onClickLabel надпись для Accessibility
 * @param motion объект анимаций
 */
@Composable
fun Chip(
    label: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    style: ChipStyle = LocalChipStyle.current,
    onClick: (() -> Unit)? = null,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    indication: Indication? = LocalIndication.current,
    onClickLabel: String? = null,
    motion: Motion<ChipMotionStyle> = rememberChipMotion(),
) {
    val isFocused = motion.context.interactionSource.collectIsFocusedAsState()
    val dimensionsSet = style.dimensions.toDimensionsSet()
    val colorsSet = style.colors.toColorsSet()
    val backgroundColor = style.colors.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
    val currentShape by style.shapes.getValueAsState(motion.context)
    BaseIconText(
        modifier = modifier
            .focusSelector(
                settings = LocalFocusSelectorSettings.current,
                shape = currentShape,
            ) { isFocused.value }
            .surface(
                shape = currentShape,
                backgroundColor = { backgroundColor.value },
                onClick = onClick,
                indication = indication,
                onClickLabel = onClickLabel,
                enabled = enabled,
                alpha = { if (it) ENABLED_CHIP_ALPHA else style.disableAlpha },
                role = Role.Button,
                interactionSource = motion.context.interactionSource,
            ),
        dimensionsSet = dimensionsSet,
        brushesSet = colorsSet,
        labelContent = label,
        labelStyle = style.labelStyles,
        startContent = startContent,
        endContent = endContent,
        motion = motion,
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
 * @param semanticStateSource источник семантических состояний
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
    indication: Indication? = LocalIndication.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    semanticStateSource: MutableSemanticStateSource = remember { MutableSemanticStateSource() },
) {
    val motion = rememberChipMotion(
        motionContext = rememberMotionContext(semanticStateSource, interactionSource),
    )
    val isFocused = motion.context.interactionSource.collectIsFocusedAsState()
    val dimensionsSet = style.dimensions.toDimensionsSet()
    val colorsSet = style.colors.toColorsSet()
    val backgroundColor = style.colors.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
    val currentShape by style.shapes.getValueAsState(motion.context)
    BaseIconText(
        modifier = modifier
            .focusSelector(
                settings = LocalFocusSelectorSettings.current,
                shape = currentShape,
            ) { isFocused.value }
            .surface(
                shape = currentShape,
                backgroundColor = { backgroundColor.value },
                value = isSelected,
                onValueChange = onSelectedChange,
                indication = indication,
                enabled = enabled,
                alpha = { if (it) ENABLED_CHIP_ALPHA else style.disableAlpha },
                role = Role.Button,
                interactionSource = motion.context.interactionSource,
            )
            .selection(isSelected, motion.context.semanticStateSource),
        dimensionsSet = dimensionsSet,
        brushesSet = colorsSet,
        labelContent = label,
        labelStyle = style.labelStyles,
        startContent = startContent,
        endContent = endContent,
        motion = motion,
    )
}

/**
 * Компонент Chip с поддержкой selected состояния
 *
 * @param label контент
 * @param modifier модификатор
 * @param style стиль компонента
 * @param isSelected выбран ли chip
 * @param onSelectedChange обработчик смены состояния chip
 * @param startContent контент вначале
 * @param endContent контент вконце
 * @param enabled включен ли компонент
 * @param indication [Indication]
 * @param motion объект анимаций
 */
@Composable
fun Chip(
    label: @Composable () -> Unit,
    isSelected: Boolean,
    onSelectedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    style: ChipStyle = LocalChipStyle.current,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    indication: Indication? = LocalIndication.current,
    motion: Motion<ChipMotionStyle> = rememberChipMotion(),
) {
    val isFocused = motion.context.interactionSource.collectIsFocusedAsState()
    val dimensionsSet = style.dimensions.toDimensionsSet()
    val colorsSet = style.colors.toColorsSet()
    val backgroundColor = style.colors.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
    val currentShape by style.shapes.getValueAsState(motion.context)
    BaseIconText(
        modifier = modifier
            .focusSelector(
                settings = LocalFocusSelectorSettings.current,
                shape = currentShape,
            ) { isFocused.value }
            .surface(
                shape = currentShape,
                backgroundColor = { backgroundColor.value },
                value = isSelected,
                onValueChange = onSelectedChange,
                indication = indication,
                enabled = enabled,
                alpha = { if (it) ENABLED_CHIP_ALPHA else style.disableAlpha },
                role = Role.Button,
                interactionSource = motion.context.interactionSource,
            )
            .selection(isSelected, motion.context.semanticStateSource),
        dimensionsSet = dimensionsSet,
        brushesSet = colorsSet,
        labelContent = label,
        labelStyle = style.labelStyles,
        startContent = startContent,
        endContent = endContent,
        motion = motion,
    )
}

internal fun ChipDimensions.toDimensionsSet() = BaseIconText.Dimensions(
    height = this.heightValues,
    endContentSize = this.contentEndSizeValues,
    startContentSize = this.contentStartSizeValues,
    endContentMargin = this.contentEndPaddings,
    startContentMargin = this.contentStartPaddings,
    startPadding = this.startPaddings,
    endPadding = this.endPaddings,
)

@Composable
internal fun ChipColors.toColorsSet() = BaseIconText.Brushes(
    contentBrush = this.contentBrush,
    labelBrush = this.labelBrush,
    startContentBrush = this.contentStartBrush,
    endContentBrush = this.contentEndBrush,
)

private const val ENABLED_CHIP_ALPHA = 1f
