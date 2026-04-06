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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.DpSize
import com.sdds.compose.uikit.components.counter.LocalCounterMotionStyle
import com.sdds.compose.uikit.LocalCounterStyle
import com.sdds.compose.uikit.LocalIconDefaultSize
import com.sdds.compose.uikit.components.tabs.LocalTabItemMotionStyle
import com.sdds.compose.uikit.LocalTabItemStyle
import com.sdds.compose.uikit.LocalTextBehaviour
import com.sdds.compose.uikit.LocalTintProvider
import com.sdds.compose.uikit.ProvideTextBehaviour
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.components.tabs.TabItemMotionStyle
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.interactions.selection
import com.sdds.compose.uikit.internal.common.backgroundFill
import com.sdds.compose.uikit.internal.common.enable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.getColorAsState
import com.sdds.compose.uikit.motion.getFillStyleAsState
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext
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
    motion: Motion<TabItemMotionStyle> = rememberMotion(
        LocalTabItemMotionStyle.current,
        rememberMotionContext()
    )
) {
    val backgroundColor = style.colors.backgroundFillStyle.getFillStyleAsState(
        motion.context,
        motion.style.backgroundFillStyle,
    )
    Row(
        modifier = modifier
            .defaultMinSize(
                minHeight = style.dimensions.minHeight,
                minWidth = style.dimensions.minWidth,
            )
            .selection(isSelected, motion.context.interactionSource)
            .clickable(
                interactionSource = motion.context.interactionSource,
                indication = null,
                onClickLabel = onClickLabel,
                enabled = enabled && onClick != null,
                role = Role.Tab,
                onClick = { onClick?.invoke() },
            )
            .backgroundFill(
                fillStyleProducer = { backgroundColor.value },
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
            behaviour = LocalTextBehaviour.current.copy(maxLines = 1, overflow = TextOverflow.Clip)
        ) {
            if (labelContent != null) {

                val labelColor = style.colors.labelFillStyle.getFillStyleAsState(
                    motionContext, motionStyle.labelFillStyle,
                )
                ProvideTextStyle(style.labelStyle, color = { labelColor.value }) {
                    labelContent()
                }
            }

            if (helperContent != null) {
                val valueColor = style.colors.valueColor.getColorAsState(
                    motionContext, motionStyle.labelFillStyle,
                )
                ProvideTextStyle(style.valueStyle, color = { valueColor.value }) {
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
            LocalCounterMotionStyle tryProvide motionStyle.counterMotionStyle
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
        val startContentColor = style.colors.startContentColor.getColorAsState(motionContext, motionStyle.labelFillStyle)
        CompositionLocalProvider(
            LocalTintProvider provides { startContentColor.value },
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
        val endContentColor = style.colors.endContentColor.getColorAsState(motionContext, motionStyle.labelFillStyle)
        CompositionLocalProvider(
            LocalTintProvider provides { endContentColor.value },
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

        val actionColor = style.colors.actionColor.getColorAsState(motionContext, motionStyle.labelFillStyle)
        CompositionLocalProvider(
            LocalIconDefaultSize provides DpSize(
                width = style.dimensions.actionSize,
                height = style.dimensions.actionSize,
            ),
            LocalTintProvider provides { actionColor.value }
        ) {
            action()
        }
    }

}