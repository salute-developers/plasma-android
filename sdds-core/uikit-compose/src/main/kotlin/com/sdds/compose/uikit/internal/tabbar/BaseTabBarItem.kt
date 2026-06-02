package com.sdds.compose.uikit.internal.tabbar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import com.sdds.compose.uikit.LocalBadgeStyle
import com.sdds.compose.uikit.LocalCounterStyle
import com.sdds.compose.uikit.LocalIconDefaultSize
import com.sdds.compose.uikit.LocalIndicatorStyle
import com.sdds.compose.uikit.LocalTabBarItemStyle
import com.sdds.compose.uikit.LocalTintBrushProducer
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.TabBar
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.TabBarLabelPlacement
import com.sdds.compose.uikit.graphics.brush.BrushProducer
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.interactions.selection
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.tabbar.TabBarItemMotionStyle
import com.sdds.compose.uikit.motion.components.tabbar.rememberTabBarItemMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getDpAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState

/**
 * Элемент [TabBar]
 *
 * @param icon слот иконки
 * @param modifier модификатор
 * @param isSelected выбран ли элемент
 * @param onClick обработчик нажатия
 * @param onClickLabel accessibility текст при клике на компонент
 * @param style стиль компонента
 * @param labelContent слот лэйбла
 * @param extra дополнительный контент в правом верхнем углу иконки
 * @param motion объект анимаций
 */
@Composable
internal fun BaseTabBarItem(
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    onClick: (() -> Unit)? = null,
    onClickLabel: String? = null,
    style: TabBarItemStyle = LocalTabBarItemStyle.current,
    labelContent: (@Composable () -> Unit)? = null,
    extra: (@Composable () -> Unit)? = null,
    motion: Motion<TabBarItemMotionStyle> = rememberTabBarItemMotion(),
) {
    val backgroundColor = style.colors.background.getBrushAsState(
        motion.context,
        motion.style.backgroundColor,
    )
    val shape = style.shapeValue.getValueAsState(motion.context)
    val minHeight = style.dimensions.minHeightValue.getDpAsState(motion.context, motion.style.minHeight)
    val paddingStart = style.dimensions.paddingStartValue.getDpAsState(motion.context, motion.style.paddingStart)
    val paddingEnd = style.dimensions.paddingEndValue.getDpAsState(motion.context, motion.style.paddingEnd)
    val paddingTop = style.dimensions.paddingTopValue.getDpAsState(motion.context, motion.style.paddingTop)
    val paddingBottom = style.dimensions.paddingBottomValue.getDpAsState(motion.context, motion.style.paddingBottom)
    val iconSize = style.dimensions.iconSizeValue.getDpAsState(motion.context, motion.style.iconSize)
    val labelPadding = style.dimensions.labelPaddingValue.getDpAsState(motion.context, motion.style.labelPadding)
    val iconColor = style.colors.icon.getBrushAsState(motion.context, motion.style.iconColor)
    val labelColor = style.colors.label.getBrushAsState(motion.context, motion.style.labelColor)
    val labelStyle = style.labelStyleValue.getTextStyleAsState(motion.context, motion.style.labelStyle)
    Column(
        modifier = modifier
            .then(
                onClick?.let {
                    Modifier.clickable(
                        interactionSource = motion.context.interactionSource,
                        indication = null,
                        onClickLabel = onClickLabel,
                        role = Role.Tab,
                    ) { it.invoke() }
                } ?: Modifier,
            )
            .defaultMinSize(minHeight = minHeight.value)
            .selection(isSelected, motion.context.semanticStateSource)
            .fillMaxWidth()
            .background(backgroundColor.value, shape = shape.value)
            .padding(
                start = paddingStart.value,
                end = paddingEnd.value,
                top = paddingTop.value,
                bottom = paddingBottom.value,
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            contentAlignment = Alignment.Center,
        ) {
            Box(
                modifier = Modifier.defaultMinSize(
                    iconSize.value,
                    iconSize.value,
                ),
                contentAlignment = Alignment.TopCenter,
            ) {
                CompositionLocalProvider(
                    LocalTintBrushProducer provides { iconColor.value },
                    LocalIconDefaultSize provides DpSize(iconSize.value, iconSize.value),
                ) {
                    icon.invoke()
                }
                extra?.let { TabBarItemExtra(it, style, motion) }
            }
        }
        if (labelContent != null && style.labelPlacement != TabBarLabelPlacement.None) {
            ProvideTextStyle(labelStyle.value, brush = BrushProducer { labelColor.value }) {
                Box(modifier = Modifier.padding(top = labelPadding.value)) {
                    labelContent()
                }
            }
        }
    }
}

@Composable
private fun BoxScope.TabBarItemExtra(
    extra: @Composable () -> Unit,
    style: TabBarItemStyle,
    motion: Motion<TabBarItemMotionStyle>,
) {
    BoxWithConstraints(
        modifier = Modifier.align(Alignment.TopStart),
    ) {
        val boxScope = this
        val extraSize = remember { mutableStateOf(IntSize.Zero) }
        val extraOffsetX = style.dimensions.extraOffsetX.getDpAsState(
            motion.context,
            motion.style.extraOffsetX,
        )
        val extraOffsetY = style.dimensions.extraOffsetY.getDpAsState(
            motion.context,
            motion.style.extraOffsetY,
        )
        Box(
            modifier = Modifier
                .onSizeChanged {
                    extraSize.value = it
                }
                .offset {
                    val extraWidth = extraSize.value.width
                    val offsetX = extraOffsetX.value.roundToPx()
                        .coerceAtMost(boxScope.maxWidth.roundToPx() - extraWidth)
                    val offsetY = extraOffsetY.value.roundToPx()
                    IntOffset(offsetX, offsetY)
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
}
