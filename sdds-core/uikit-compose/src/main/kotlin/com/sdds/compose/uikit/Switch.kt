package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.selection.toggleable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.internal.switch.BaseSwitchLayout
import com.sdds.compose.uikit.internal.switch.SwitchToggle
import com.sdds.compose.uikit.internal.switch.switchDescription
import com.sdds.compose.uikit.internal.switch.switchLabel

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
    BaseSwitchLayout(
        modifier = modifier
            .then(toggleableModifier)
            .graphicsLayer { alpha = if (enabled) 1f else 0.4f },
        switch = {
            SwitchToggle(
                active = active,
                modifier = it,
                colors = colors,
                dimensions = dimensions,
                animationDuration = animationDuration,
                enabled = enabled,
                interactionSource = interactionSource,
            )
        },
        label = switchLabel(
            value = label,
            textStyle = labelTextStyle,
            maxLines = labelMaxLines,
            color = colors.labelColor,
        ),
        description = switchDescription(
            value = description,
            textStyle = descriptionTextStyle,
            maxLines = descriptionMaxLines,
            color = colors.descriptionColor,
        ),
        verticalSpacing = dimensions.verticalSpacing,
        horizontalSpacing = dimensions.horizontalSpacing,
    )
}

/**
 * Вспомогательный объект для описания API и стиля компонента
 */
object Switch
