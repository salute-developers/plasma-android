package com.sdds.compose.uikit.internal.tabs

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.DpSize
import com.sdds.compose.uikit.LocalCounterStyle
import com.sdds.compose.uikit.LocalIconDefaultSize
import com.sdds.compose.uikit.LocalTabItemStyle
import com.sdds.compose.uikit.LocalTextBehaviour
import com.sdds.compose.uikit.LocalTintBrushProducer
import com.sdds.compose.uikit.ProvideTextBehaviour
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.selection
import com.sdds.compose.uikit.internal.common.enable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.components.counter.LocalCounterMotionStyle
import com.sdds.compose.uikit.motion.components.tabs.TabItemMotionStyle
import com.sdds.compose.uikit.motion.components.tabs.rememberTabItemMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.tryProvide

@Composable
internal fun BaseTabItem(
    modifier: Modifier = Modifier,
    style: TabItemStyle = LocalTabItemStyle.current,
    isSelected: Boolean = false,
    enabled: Boolean = true,
    labelContent: (@Composable () -> Unit)? = null,
    helperContent: (@Composable () -> Unit)? = null,
    counter: (@Composable () -> Unit)? = null,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    action: (@Composable () -> Unit)? = null,
    onClick: (() -> Unit)? = null,
    onClickLabel: String? = null,
    motion: Motion<TabItemMotionStyle> = rememberTabItemMotion(),
) {
    val backgroundColor = style.colors.backgroundBrush.getBrushAsState(
        motion.context,
        motion.style.backgroundColor,
    )
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
            .backgroundBrush(
                brushProducer = { backgroundColor.value },
                shape = style.shape,
            )
            .enable(enabled)
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
            ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        StartContent(style, motion.context, motion.style, startContent)
        CenterContent(
            style = style,
            motionContext = motion.context,
            motionStyle = motion.style,
            labelContent = labelContent,
            helperContent = helperContent,
        )
        CounterContent(style, motion.style, counter)
        EndContent(style, motion.context, motion.style, endContent)
        ActionContent(style, motion.context, motion.style, action)
    }
}

@Composable
internal fun CenterContent(
    style: TabItemStyle,
    motionContext: MotionContext,
    motionStyle: TabItemMotionStyle,
    helperContent: (@Composable () -> Unit)? = null,
    labelContent: (@Composable () -> Unit)? = null,
) {
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(style.dimensions.valuePadding),
    ) {
        ProvideTextBehaviour(
            behaviour = LocalTextBehaviour.current.copy(maxLines = 1, overflow = TextOverflow.Clip),
        ) {
            if (labelContent != null) {
                val labelBrush = style.colors.labelBrush.getBrushAsState(motionContext, motionStyle.labelColor)
                val labelStyle by style.labelStyles.getTextStyleAsState(motionContext, motionStyle.labelStyle)
                ProvideTextStyle(
                    labelStyle,
                    brush = { labelBrush.value },
                ) {
                    labelContent()
                }
            }

            if (helperContent != null) {
                val valueBrush = style.colors.valueBrush.getBrushAsState(motionContext, motionStyle.valueColor)
                ProvideTextStyle(
                    style.valueStyle,
                    brush = { valueBrush.value },
                ) {
                    helperContent()
                }
            }
        }
    }
}

@Composable
private fun CounterContent(
    style: TabItemStyle,
    motionStyle: TabItemMotionStyle,
    counter: (@Composable () -> Unit)? = null,
) {
    if (counter == null) return
    Box(modifier = Modifier.padding(start = style.dimensions.counterPadding)) {
        CompositionLocalProvider(
            LocalCounterStyle provides style.counterStyle,
            LocalCounterMotionStyle tryProvide motionStyle.counterMotionStyle,
        ) {
            counter()
        }
    }
}

@Composable
private fun StartContent(
    style: TabItemStyle,
    motionContext: MotionContext,
    motionStyle: TabItemMotionStyle,
    content: (@Composable () -> Unit)?,
) {
    content ?: return
    Box(
        modifier = Modifier
            .padding(end = style.dimensions.iconPadding)
            .size(style.dimensions.startContentSize),
        contentAlignment = Alignment.Center,
    ) {
        val startContentColor = style.colors.startContentBrush.getBrushAsState(
            motionContext,
            motionStyle.startContentColor,
        )
        CompositionLocalProvider(
            LocalTintBrushProducer provides { startContentColor.value },
        ) {
            content.invoke()
        }
    }
}

@Composable
private fun EndContent(
    style: TabItemStyle,
    motionContext: MotionContext,
    motionStyle: TabItemMotionStyle,
    content: (@Composable () -> Unit)?,
) {
    content ?: return
    Box(
        modifier = Modifier
            .padding(start = style.dimensions.iconPadding)
            .size(style.dimensions.endContentSize),
        contentAlignment = Alignment.Center,
    ) {
        val endContentColor = style.colors.endContentBrush.getBrushAsState(
            motionContext,
            motionStyle.endContentColor,
        )
        CompositionLocalProvider(
            LocalTintBrushProducer provides { endContentColor.value },
        ) {
            content.invoke()
        }
    }
}

@Composable
private fun ActionContent(
    style: TabItemStyle,
    motionContext: MotionContext,
    motionStyle: TabItemMotionStyle,
    action: (@Composable () -> Unit)? = null,
) {
    action ?: return

    Box(modifier = Modifier.padding(start = style.dimensions.actionPadding)) {
        val actionColor = style.colors.actionBrush.getBrushAsState(motionContext, motionStyle.actionColor)
        CompositionLocalProvider(
            LocalIconDefaultSize provides DpSize(
                width = style.dimensions.actionSize,
                height = style.dimensions.actionSize,
            ),
            LocalTintBrushProducer provides { actionColor.value },
        ) {
            action()
        }
    }
}
