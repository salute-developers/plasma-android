package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.IntOffset
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.getValue

/**
 * Таб (Вкладка). Элемент, предназначенный для использования в [Tabs].
 * Может содержать иконку, кнопку действия, счетчик.
 *
 * @param modifier модификатор
 * @param style стиль компонента [TabItem]
 * @param isSelected выбран ли таб
 * @param enabled включен ли таб
 * @param icon ресурс иконки
 * @param actionIcon ресурс иконки действия
 * @param onActionClicked обработчик нажатия на иконку действия
 * @param count текст счетчика [Counter]
 * @param interactionSource источник взаимодействий
 */
@Composable
fun IconTabItem(
    modifier: Modifier = Modifier,
    style: TabItemStyle = LocalTabItemStyle.current,
    isSelected: Boolean = false,
    enabled: Boolean = true,
    @DrawableRes icon: Int? = null,
    @DrawableRes actionIcon: Int? = null,
    onActionClicked: () -> Unit = {},
    count: String? = null,
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
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            icon?.let {
                Box {
                    Icon(
                        modifier = Modifier.size(style.dimensions.startContentSize),
                        painter = painterResource(icon),
                        contentDescription = "",
                        tint = style.colors.startContentColor.getValue(interactionSource, stateSet),
                    )
                    if (!count.isNullOrEmpty()) { TabItemCounter(count, style) }
                }
            }
            ActionContent(style, interactionSource, actionIcon, stateSet, onActionClicked)
        }
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
            .padding(start = style.dimensions.actionPadding)
            .size(style.dimensions.actionSize)
            .clickable(indication = null, interactionSource = null, onClick = onActionClicked),
        painter = painterResource(actionIcon),
        contentDescription = "",
        tint = style.colors.actionColor.getValue(interactionSource, stateSet),
    )
}

@Composable
private fun BoxScope.TabItemCounter(
    count: String,
    style: TabItemStyle,
) {
    Box(
        modifier = Modifier
            .align(Alignment.TopEnd)
            .offset {
                IntOffset(
                    x = style.dimensions.counterOffsetX.roundToPx(),
                    y = -style.dimensions.counterOffsetX.roundToPx(),
                )
            },
    ) {
        Counter(
            style = style.counterStyle,
            count = count,
        )
    }
}
