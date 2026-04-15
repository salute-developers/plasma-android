package com.sdds.compose.uikit.internal.tabs

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.IntOffset
import com.sdds.compose.uikit.LocalCounterStyle
import com.sdds.compose.uikit.LocalIconDefaultSize
import com.sdds.compose.uikit.LocalTabItemStyle
import com.sdds.compose.uikit.LocalTintBrushProducer
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.selection
import com.sdds.compose.uikit.internal.common.enable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.counter.LocalCounterMotionStyle
import com.sdds.compose.uikit.motion.components.tabs.TabItemMotionStyle
import com.sdds.compose.uikit.motion.components.tabs.rememberTabItemMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.tryProvide

@Composable
@Suppress("LongMethod")
internal fun BaseIconTabItem(
    modifier: Modifier = Modifier,
    style: TabItemStyle = LocalTabItemStyle.current,
    isSelected: Boolean = false,
    enabled: Boolean = true,
    action: (@Composable () -> Unit)? = null,
    counter: (@Composable () -> Unit)? = null,
    onClick: (() -> Unit)? = null,
    onClickLabel: String? = null,
    motion: Motion<TabItemMotionStyle> = rememberTabItemMotion(),
    content: @Composable () -> Unit,
) {
    val background = style.colors.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
    val clickableModifier = if (enabled && onClick != null) {
        Modifier.clickable(
            interactionSource = motion.context.interactionSource,
            indication = null,
            onClickLabel = onClickLabel,
            role = Role.Tab,
            onClick = onClick,
        )
    } else {
        Modifier
    }
    Row(
        modifier = modifier
            .defaultMinSize(
                minHeight = style.dimensions.minHeight,
                minWidth = style.dimensions.minWidth,
            )
            .selection(isSelected, motion.context.interactionSource)
            .then(clickableModifier)
            .enable(enabled)
            .backgroundBrush(
                brushProducer = { background.value },
                shape = style.shape,
            )
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
            ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box {
                TabContent(
                    style = style,
                    motion = motion,
                    content = content,
                )
                if (counter != null) {
                    TabItemCounter(
                        style = style,
                        motionStyle = motion.style,
                        counter = counter,
                    )
                }
            }
            if (action != null) {
                ActionContent(
                    style = style,
                    motion = motion,
                    action = action,
                )
            }
        }
    }
}

@Composable
private fun ActionContent(
    style: TabItemStyle,
    motion: Motion<TabItemMotionStyle>,
    action: @Composable () -> Unit,
) {
    Box(
        modifier = Modifier.padding(start = style.dimensions.actionPadding),
    ) {
        val color = style.colors.actionBrush.getBrushAsState(motion.context, motion.style.actionColor)
        CompositionLocalProvider(
            LocalIconDefaultSize provides DpSize(
                width = style.dimensions.actionSize,
                height = style.dimensions.actionSize,
            ),
            LocalTintBrushProducer provides { color.value },
        ) {
            action()
        }
    }
}

@Composable
private fun TabContent(
    style: TabItemStyle,
    motion: Motion<TabItemMotionStyle>,
    content: @Composable () -> Unit,
) {
    val iconColor = style.colors.startContentBrush.getBrushAsState(
        motion.context,
        motion.style.startContentColor,
    )
    val iconSize = style.dimensions.startContentSize.let { DpSize(it, it) }
    CompositionLocalProvider(
        LocalTintBrushProducer provides { iconColor.value },
        LocalIconDefaultSize provides iconSize,
    ) {
        content()
    }
}

@Composable
private fun BoxScope.TabItemCounter(
    style: TabItemStyle,
    motionStyle: TabItemMotionStyle,
    counter: @Composable () -> Unit,
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
        CompositionLocalProvider(
            LocalCounterStyle provides style.counterStyle,
            LocalCounterMotionStyle tryProvide motionStyle.counterMotionStyle,
        ) {
            counter()
        }
    }
}
