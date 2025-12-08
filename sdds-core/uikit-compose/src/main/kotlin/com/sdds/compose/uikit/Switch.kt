package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.internal.checkable.switch.BaseSwitch
import com.sdds.compose.uikit.internal.checkable.switch.BaseSwitchLayout
import com.sdds.compose.uikit.internal.checkable.switch.SwitchToggle
import com.sdds.compose.uikit.internal.checkable.switch.switchText

/**
 * Компонент Switch (переключатель)
 * @param active активен ли переключатель
 * @param modifier модификатор
 * @param onActiveChanged колбэк изменения состояния переключателя
 * @param label лейбл
 * @param description описание
 * @param style стиль компонента [SwitchStyle]
 * @param labelMaxLines количество строк в лейбле
 * @param descriptionMaxLines количество строк в описании
 * @param animationDuration длительность анимации
 * @param enabled доступен ли переключатель
 * @param interactionSource источник взамодействий
 */
@Composable
fun Switch(
    active: Boolean,
    modifier: Modifier = Modifier,
    onActiveChanged: ((Boolean) -> Unit)? = null,
    label: String? = null,
    description: String? = null,
    style: SwitchStyle = LocalSwitchStyle.current,
    labelMaxLines: Int = Int.MAX_VALUE,
    descriptionMaxLines: Int = Int.MAX_VALUE,
    animationDuration: Int = style.animationDurationMillis,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    BaseSwitch(
        active = active,
        modifier = modifier,
        onActiveChanged = onActiveChanged,
        labelContent = label?.let {
            {
                Text(it, maxLines = labelMaxLines, overflow = TextOverflow.Ellipsis)
            }
        },
        descriptionContent = description?.let {
            {
                Text(it, maxLines = descriptionMaxLines, overflow = TextOverflow.Ellipsis)
            }
        },
        style = style,
        animationDuration = animationDuration,
        enabled = enabled,
        interactionSource = interactionSource,
    )
}

/**
 * Компонент Switch (переключатель)
 * @param active активен ли переключатель
 * @param labelContent основной контент Switch
 * @param modifier модификатор
 * @param onActiveChanged колбэк изменения состояния переключателя
 * @param descriptionContent контент для описания Switch
 * @param style стиль компонента [SwitchStyle]
 * @param animationDuration длительность анимации
 * @param enabled доступен ли переключатель
 * @param interactionSource источник взамодействий
 */
@Composable
@NonRestartableComposable
fun Switch(
    active: Boolean,
    labelContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    onActiveChanged: ((Boolean) -> Unit)? = null,
    style: SwitchStyle = LocalSwitchStyle.current,
    descriptionContent: (@Composable () -> Unit)? = null,
    animationDuration: Int = style.animationDurationMillis,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    BaseSwitch(
        active = active,
        modifier = modifier,
        onActiveChanged = onActiveChanged,
        labelContent = labelContent,
        descriptionContent = descriptionContent,
        style = style,
        animationDuration = animationDuration,
        enabled = enabled,
        interactionSource = interactionSource,
    )
}

/**
 * Компонент Switch (переключатель)
 * @param active активен ли переключатель
 * @param modifier модификатор
 * @param onActiveChanged колбэк изменения состояния переключателя
 * @param label лейбл
 * @param description описание
 * @param style стиль компонента [SwitchStyle]
 * @param dimensions размеры и отступы [SwitchDimensions]
 * @param colors цвета [SwitchColors]
 * @param labelTextStyle стиль текста лэйбла
 * @param descriptionTextStyle стиль текста описания
 * @param labelMaxLines количество строк в лейбле
 * @param descriptionMaxLines количество строк в описании
 * @param animationDuration длительность анимации
 * @param enabled доступен ли переключатель
 * @param interactionSource источник взамодействий
 */
@Composable
@Deprecated("Use Switch without dimensions and colors parameters")
fun Switch(
    active: Boolean,
    modifier: Modifier = Modifier,
    onActiveChanged: ((Boolean) -> Unit)? = null,
    label: String? = null,
    description: String? = null,
    style: SwitchStyle = LocalSwitchStyle.current,
    dimensions: SwitchDimensions = style.dimensions,
    colors: SwitchColors = style.colors,
    labelTextStyle: TextStyle = style.labelStyle,
    descriptionTextStyle: TextStyle = style.descriptionStyle,
    labelMaxLines: Int = Int.MAX_VALUE,
    descriptionMaxLines: Int = Int.MAX_VALUE,
    animationDuration: Int = style.animationDurationMillis,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val stateSet = remember(active) { if (active) setOf(SwitchStates.Checked) else emptySet() }
    val colorValues = colors.toColorValues()
    val dimensionValues = dimensions.toDimensionValues()
    val toggleableModifier =
        if (onActiveChanged != null) {
            Modifier.toggleable(
                value = active,
                onValueChange = onActiveChanged,
                enabled = enabled,
                role = Role.Switch,
                interactionSource = interactionSource,
                indication = null,
            )
        } else {
            Modifier
        }
    val labelColor = colorValues.labelColor.colorForInteractionAsState(interactionSource, stateSet)
    val descriptionColor = colorValues.descriptionColor.colorForInteractionAsState(interactionSource, stateSet)
    BaseSwitchLayout(
        modifier = modifier
            .then(toggleableModifier)
            .graphicsLayer { alpha = if (enabled) 1f else style.disableAlpha },
        switch = {
            SwitchToggle(
                active = active,
                thumbShape = style.toggleThumbShape,
                trackShape = style.toggleTrackShape,
                colors = colorValues,
                dimensions = dimensionValues,
                animationDuration = animationDuration,
                interactionSource = interactionSource,
            )
        },
        label = switchText(
            value = label,
            textStyle = labelTextStyle,
            maxLines = labelMaxLines,
            color = labelColor,
        ),
        description = switchText(
            value = description,
            textStyle = descriptionTextStyle,
            maxLines = descriptionMaxLines,
            color = descriptionColor,
        ),
        verticalSpacing = dimensionValues.descriptionPadding,
        horizontalSpacing = dimensionValues.textPadding,
    )
}

private fun SwitchDimensions.toDimensionValues(): SwitchDimensionValues {
    return object : SwitchDimensionValues {
        override val toggleTrackWidth: Dp = this@toDimensionValues.toggleWidth
        override val toggleTrackHeight: Dp = this@toDimensionValues.toggleHeight
        override val toggleThumbWidth: Dp = this@toDimensionValues.thumbDiameter
        override val toggleThumbHeight: Dp = this@toDimensionValues.thumbDiameter
        override val toggleThumbPadding: Dp = 2.dp
        override val textPadding: Dp = this@toDimensionValues.horizontalSpacing
        override val descriptionPadding: Dp = this@toDimensionValues.verticalSpacing
        override val paddingTop: Dp = 0.dp
        override val paddingStart: Dp = 0.dp
        override val paddingEnd: Dp = 0.dp
        override val paddingBottom: Dp = 0.dp
    }
}

private fun SwitchColors.toColorValues(): SwitchColorValues {
    return object : SwitchColorValues {
        override val labelColor: InteractiveColor =
            this@toColorValues.labelColor.asInteractive()
        override val descriptionColor: InteractiveColor =
            this@toColorValues.labelColor.asInteractive()
        override val toggleThumbColor: InteractiveColor =
            this@toColorValues.thumbColor.asInteractive()
        override val toggleTrackColor: InteractiveColor = this@toColorValues.inactiveTrackColor
            .asInteractive(
                setOf(SwitchStates.Checked) to this@toColorValues.activeTrackColor,
            )
        override val toggleTrackBorderColor: InteractiveColor =
            Color.Transparent.asInteractive()
        override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()
    }
}

/**
 * Состояния Switch
 */
enum class SwitchStates : ValueState {
    /**
     * Switch включен
     */
    Checked,
}

@Composable
@Preview
private fun SwitchPreview() {
    Switch(
        active = true,
        label = "Label",
        style = SwitchStyle
            .builder()
            .toggleThumbShape(RoundedCornerShape(25))
            .toggleTrackShape(RoundedCornerShape(25))
            .style(),
        description = "Description is long enough",
    )
}
