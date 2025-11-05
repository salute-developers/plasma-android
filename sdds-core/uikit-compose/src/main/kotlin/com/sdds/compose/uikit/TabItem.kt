package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.getValue

/**
 * Таб (Вкладка). Элемент, предназначенный для использования в [Tabs].
 * Может содержать контент в начале и в конце, основной текст, дополнительный текст, кнопку действия, счетчик.
 *
 * @param modifier модификатор
 * @param style стиль компонента [TabItem]
 * @param isSelected выбран ли таб
 * @param enabled включен ли таб
 * @param label основной текст
 * @param helpText дополнительный текст
 * @param count текст счетчика [Counter]
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param actionIcon ресурс иконки действия
 * @param onActionClicked обработчик нажатия на иконку действия
 * @param interactionSource источник взаимодействий [InteractionSource]
 */
@Composable
fun TabItem(
    modifier: Modifier = Modifier,
    style: TabItemStyle = LocalTabItemStyle.current,
    isSelected: Boolean = false,
    enabled: Boolean = true,
    label: String? = null,
    helpText: String? = null,
    count: String? = null,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    @DrawableRes actionIcon: Int? = null,
    onActionClicked: () -> Unit = {},
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val stateSet = remember(isSelected) {
        if (isSelected) setOf(InteractiveState.Selected) else emptySet()
    }
    Row(
        modifier = modifier
            .defaultMinSize(
                minHeight = style.dimensions.minHeight,
                minWidth = style.dimensions.minWidth,
            )
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
            )
            .background(
                color = style.colors.backgroundColor.getValue(interactionSource, stateSet),
                shape = style.shape,
            )
            .graphicsLayer { this.alpha = if (enabled) 1f else style.disableAlpha },
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        StartContent(style, interactionSource, startContent, stateSet)

        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(style.dimensions.valuePadding),
        ) {
            if (!label.isNullOrEmpty()) {
                Text(
                    text = label,
                    style = style.labelStyle.copy(
                        style.colors.labelColor.getValue(interactionSource, stateSet),
                    ),
                )
            }

            if (!helpText.isNullOrEmpty()) {
                Text(
                    text = helpText,
                    style = style.valueStyle.copy(
                        style.colors.valueColor.getValue(interactionSource, stateSet),
                    ),
                )
            }
        }
        CounterContent(style, count)
        EndContent(style, interactionSource, endContent, stateSet)
        ActionContent(style, interactionSource, actionIcon, stateSet, onActionClicked)
    }
}

@Composable
private fun CounterContent(
    style: TabItemStyle,
    count: String?,
) {
    if (count.isNullOrEmpty()) return
    Counter(
        modifier = Modifier
            .padding(start = style.dimensions.counterPadding),
        count = count,
        style = style.counterStyle,
    )
}

@Composable
private fun StartContent(
    style: TabItemStyle,
    interactionSource: InteractionSource,
    content: (@Composable () -> Unit)?,
    stateSet: Set<ValueState>,
) {
    content ?: return
    CompositionLocalProvider(
        LocalTint provides style.colors.startContentColor.getValue(interactionSource, stateSet),
    ) {
        Box(
            modifier = Modifier
                .padding(end = style.dimensions.iconPadding)
                .size(style.dimensions.startContentSize),
            contentAlignment = Alignment.Center,
        ) { content.invoke() }
    }
}

@Composable
private fun EndContent(
    style: TabItemStyle,
    interactionSource: InteractionSource,
    content: (@Composable () -> Unit)?,
    stateSet: Set<ValueState>,
) {
    content ?: return
    CompositionLocalProvider(
        LocalTint provides style.colors.endContentColor.getValue(interactionSource, stateSet),
    ) {
        Box(
            modifier = Modifier
                .padding(start = style.dimensions.iconPadding)
                .size(style.dimensions.startContentSize),
            contentAlignment = Alignment.Center,
        ) { content.invoke() }
    }
}

@Composable
private fun ActionContent(
    style: TabItemStyle,
    interactionSource: InteractionSource,
    actionIcon: Int?,
    stateSet: Set<ValueState>,
    onActionClicked: () -> Unit,
) {
    actionIcon ?: return
    Icon(
        modifier = Modifier
            .clickable(indication = null, interactionSource = null, onClick = onActionClicked)
            .padding(start = style.dimensions.actionPadding),
        painter = painterResource(actionIcon),
        contentDescription = "",
        tint = style.colors.actionColor.getValue(interactionSource, stateSet),
    )
}

@Composable
@Preview(showBackground = true)
private fun TabItemPreview() {
    TabItem(
        style = TabItemStyle.builder()
            .style(),
        label = "Label",
        helpText = "HelpText",
        startContent = {
            Box(
                Modifier
                    .size(24.dp)
                    .background(Color.Gray),
            )
        },
        endContent = {
            Box(
                Modifier
                    .size(24.dp)
                    .background(Color.LightGray),
            )
        },
        count = "2",
        isSelected = true,
        enabled = true,
    )
}
