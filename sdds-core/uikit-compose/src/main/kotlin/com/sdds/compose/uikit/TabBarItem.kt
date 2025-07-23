package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.clickableWithoutIndication
import com.sdds.compose.uikit.internal.common.StyledText

/**
 * Элемент [TabBar]
 *
 * @param modifier модификатор
 * @param onClick обработчик нажатия
 * @param style стиль компонента
 * @param defaultIcon иконка при [isSelected] == false
 * @param selectedIcon иконка при [isSelected] == true
 * @param label текст лэйбла
 * @param interactionSource источник взаимодействий
 * @param extra дополнительный контент в правом верхнем углу иконки
 */
@Composable
fun TabBarItem(
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    onClick: (() -> Unit)? = null,
    style: TabBarItemStyle = LocalTabBarItemStyle.current,
    defaultIcon: @Composable () -> Unit,
    selectedIcon: @Composable () -> Unit,
    label: String? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    extra: (@Composable () -> Unit)? = null,
) {
    val stateSet =
        remember(isSelected) { if (isSelected) setOf(InteractiveState.Selected) else emptySet() }
    val backgroundColor = style.colors.backgroundColor.getValue(interactionSource, stateSet)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .then(
                onClick?.let {
                    Modifier.clickableWithoutIndication { it.invoke() }
                } ?: Modifier,
            )
            .defaultMinSize(minHeight = style.dimensions.minHeight)
            .fillMaxWidth()
            .background(backgroundColor, shape = style.shape)
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
                top = style.dimensions.paddingTop,
                bottom = style.dimensions.paddingBottom,
            ),
    ) {
        Box(
            modifier = Modifier
                .size(style.dimensions.iconSize)
                .defaultMinSize(
                    style.dimensions.iconSize,
                    style.dimensions.iconSize,
                ),
            contentAlignment = Alignment.Center,
        ) {
            val iconColor = style.colors.iconColor.getValue(interactionSource, stateSet)
            CompositionLocalProvider(LocalTint provides iconColor) {
                if (isSelected) selectedIcon.invoke() else defaultIcon.invoke()
            }
            extra?.let { TabBarItemExtra(it, style) }
        }
        if (!label.isNullOrEmpty() && style.labelPlacement != TabBarLabelPlacement.None) {
            StyledText(
                modifier = Modifier.padding(top = style.dimensions.labelPadding),
                text = label,
                textStyle = style.labelStyle,
                textColor = style.colors.labelColor.getValue(interactionSource, stateSet),
            )
        }
    }
}

/**
 * Элемент [TabBar]
 *
 * @param modifier модификатор
 * @param onClick обработчик нажатия
 * @param style стиль компонента
 * @param defaultIcon иконка при [isSelected] == false
 * @param selectedIcon иконка при [isSelected] == true
 * @param label текст лэйбла
 * @param interactionSource источник взаимодействий
 * @param extra дополнительный контент в правом верхнем углу иконки
 */
@Composable
fun TabBarItem(
    modifier: Modifier = Modifier,
    isSelected: Boolean,
    onClick: (() -> Unit)? = null,
    style: TabBarItemStyle = LocalTabBarItemStyle.current,
    @DrawableRes defaultIcon: Int,
    @DrawableRes selectedIcon: Int,
    label: String? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    extra: (@Composable () -> Unit)? = null,
) {
    TabBarItem(
        modifier = modifier,
        onClick = onClick,
        isSelected = isSelected,
        style = style,
        defaultIcon = {
            Icon(
                painter = painterResource(defaultIcon),
                contentDescription = "",
            )
        },
        selectedIcon = {
            Icon(
                painter = painterResource(selectedIcon),
                contentDescription = "",
            )
        },
        label = label,
        interactionSource = interactionSource,
        extra = extra,
    )
}

/**
 * Размещение label в [TabBar]
 */
enum class TabBarLabelPlacement {

    /**
     * Лэйбл отсутствует
     */
    None,

    /**
     * Лэйбл снизу
     */
    Bottom,
}

@Composable
private fun BoxScope.TabBarItemExtra(
    extra: @Composable () -> Unit,
    style: TabBarItemStyle,
) {
    var size by remember { mutableStateOf(IntSize.Zero) }
    Box(
        modifier = Modifier
            .onSizeChanged { size = it }
            .graphicsLayer { alpha = if (size != IntSize.Zero) 1f else 0f }
            .align(Alignment.TopEnd)
            .offset {
                IntOffset(
                    x = size.width / 2,
                    y = -size.height / 2,
                )
            },
    ) {
        CompositionLocalProvider(
            LocalBadgeStyle provides style.badgeStyle,
            LocalCounterStyle provides style.counterStyle,
            LocalIndicatorStyle provides style.indicatorStyle,
        ) {
            extra()
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun TabBarItemPreview() {
    TabBarItem(
        isSelected = true,
        modifier = Modifier,
        style = TabBarItemStyle.builder()
            .labelPlacement(TabBarLabelPlacement.Bottom)
            .style(),
        defaultIcon = {
            Text("default")
        },
        selectedIcon = {
            Text("selected")
        },
        label = "label",
    ) {
        Indicator(
            modifier = Modifier.size(4.dp),
            style = IndicatorStyle.builder()
                .color {
                    backgroundColor(Color.Red.asInteractive())
                }
                .style(),
        )
    }
}
