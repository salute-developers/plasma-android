package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.selection.toggleable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.switch.BaseSwitch
import com.sdds.compose.uikit.internal.switch.BaseSwitchLayout
import com.sdds.compose.uikit.internal.switch.switchDescription
import com.sdds.compose.uikit.internal.switch.switchLabel

/**
 * Компонент Switch (переключатель)
 * @param active активен ли переключатель
 * @param modifier модификатор
 * @param onActiveChanged колбэк изменения состояния переключателя
 * @param label лейбл
 * @param description описание
 * @param labelColor цвет лейбла
 * @param descriptionColor цвет описания
 * @param labelTextStyle стиль текста лэйбла
 * @param descriptionTextStyle стиль текста описания
 * @param labelMaxLines количество строк в лейбле
 * @param descriptionMaxLines количество строк в описании
 * @param thumbColor цвет подвижного элемента
 * @param activeTrackColor цвет неподвижного элемента в состоянии active = true
 * @param inactiveTrackColor цвет неподвижного элемента в состоянии active = false
 * @param switchWidth ширина switch
 * @param switchHeight высота switch
 * @param thumbDiameter диаметр подвижного элемента
 * @param trackCornerRadius радиус закругления
 * @param switchPadding внутренний паддинг switch
 * @param animationDuration длительность анимации
 * @param verticalSpacing расстояние между названием и описанием
 * @param horizontalSpacing расстояние между переключателем и текстом ([label] или [description])
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
    labelColor: Color = Color.Black,
    descriptionColor: Color = Color.Black,
    labelTextStyle: TextStyle = TextStyle.Default,
    descriptionTextStyle: TextStyle = TextStyle.Default,
    labelMaxLines: Int = Int.MAX_VALUE,
    descriptionMaxLines: Int = Int.MAX_VALUE,
    thumbColor: Color = Color.White,
    activeTrackColor: Color = Color.Green,
    inactiveTrackColor: Color = Color.Gray,
    switchWidth: Dp = 44.dp,
    switchHeight: Dp = 28.dp,
    thumbDiameter: Dp = 24.dp,
    trackCornerRadius: Dp = 14.dp,
    switchPadding: Dp = 2.dp,
    animationDuration: Int = 200,
    verticalSpacing: Dp = 2.dp,
    horizontalSpacing: Dp = 12.dp,
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
            BaseSwitch(
                active = active,
                modifier = it,
                thumbColor = thumbColor,
                activeTrackColor = activeTrackColor,
                inactiveTrackColor = inactiveTrackColor,
                switchWidth = switchWidth,
                switchHeight = switchHeight,
                thumbDiameter = thumbDiameter,
                trackCornerRadius = trackCornerRadius,
                switchPadding = switchPadding,
                animationDuration = animationDuration,
                enabled = enabled,
            )
        },
        label = switchLabel(
            value = label,
            textStyle = labelTextStyle,
            maxLines = labelMaxLines,
            color = labelColor,
        ),
        description = switchDescription(
            value = description,
            textStyle = descriptionTextStyle,
            maxLines = descriptionMaxLines,
            color = descriptionColor,
        ),
        verticalSpacing = verticalSpacing,
        horizontalSpacing = horizontalSpacing,
    )
}
