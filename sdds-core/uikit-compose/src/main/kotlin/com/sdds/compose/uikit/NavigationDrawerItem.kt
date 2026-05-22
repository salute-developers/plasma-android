package com.sdds.compose.uikit

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.interactions.selection
import com.sdds.compose.uikit.internal.common.background
import com.sdds.compose.uikit.internal.common.enable
import com.sdds.compose.uikit.internal.navigationdrawer.LocalNavigationDrawerSelectionRegistry
import com.sdds.compose.uikit.internal.navigationdrawer.LocalNavigationDrawerValue
import com.sdds.compose.uikit.internal.navigationdrawer.navigationDrawerItemBounds
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.cell.CellMotionStyle
import com.sdds.compose.uikit.motion.components.cell.rememberCellMotion
import com.sdds.compose.uikit.motion.components.navigationdrawer.NavigationDrawerItemMotionStyle
import com.sdds.compose.uikit.motion.components.navigationdrawer.rememberNavigationDrawerItemMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getDpAsState

/**
 * Item для [NavigationDrawer].
 *
 * В [NavigationDrawerValue.Expanded] отображает title/content, endContent и indicator
 * в end-зоне после [endContent]. В [NavigationDrawerValue.Collapsed] скрывает текстовые
 * и end-слоты, оставляя icon/start content интерактивным; indicator размещается поверх icon/start зоны.

 * @param icon слот для иконки.
 * @param modifier модификатор item-а.
 * @param selected выбран ли item.
 * @param enabled доступен ли item.
 * @param onClick обработчик нажатия.
 * @param style стиль item-а.
 * @param motion стиль анимаций item-а.
 * @param titleContent основной title/content слот.
 * @param endContent end слот.
 * @param indicator indicator слот.
 */
@Composable
fun NavigationDrawerItem(
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    style: NavigationDrawerItemStyle = LocalNavigationDrawerItemStyle.current,
    motion: Motion<NavigationDrawerItemMotionStyle> = rememberNavigationDrawerItemMotion(),
    selected: Boolean = false,
    enabled: Boolean = true,
    onClick: (() -> Unit)? = null,
    onClickLabel: String? = null,
    titleContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable RowScope.() -> Unit)? = null,
    indicator: (@Composable () -> Unit)? = null,
) {
    val drawerValue = LocalNavigationDrawerValue.current
    val expanded = drawerValue == NavigationDrawerValue.Expanded
    val registry = LocalNavigationDrawerSelectionRegistry.current
    val registryKey = remember { Any() }
    val background = style.colors.background.getBrushAsState(motion.context, motion.style.background)
    val minHeight = style.dimensions.minHeight.getDpAsState(motion.context, motion.style.minHeight)
    val shape = style.shape.getValueAsState(motion.context)

    val paddingStart = style.dimensions.paddingStart.getDpAsState(motion.context, motion.style.paddingStart)
    val paddingEnd = style.dimensions.paddingEnd.getDpAsState(motion.context, motion.style.paddingEnd)
    val paddingTop = style.dimensions.paddingTop.getDpAsState(motion.context, motion.style.paddingTop)
    val paddingBottom = style.dimensions.paddingBottom.getDpAsState(motion.context, motion.style.paddingBottom)

    val interactionSource = motion.context.interactionSource
    val cellStyle = style.toCellStyle()
    val cellMotionStyle = remember(motion.style) { motion.style.toCellMotionStyle() }
    SideEffect {
        registry?.select(registryKey, selected)
    }

    CompositionLocalProvider(
        LocalBadgeStyle provides style.badgeStyle,
    ) {
        Box {
            Cell(
                modifier = Modifier
                    .sizeIn(minHeight = minHeight.value)
                    .selection(selected, motion.context.semanticStateSource)
                    .navigationDrawerItemClickable(enabled, onClick, onClickLabel, interactionSource)
                    .fillMaxWidth()
                    .then(modifier)
                    .navigationDrawerItemBounds(registryKey, registry)
                    .backgroundBrush(brushProducer = { background.value }, shape = shape.value)
                    .padding(
                        start = paddingStart.value,
                        end = paddingEnd.value,
                        top = paddingTop.value,
                        bottom = paddingBottom.value,
                    )
                    .enable(enabled),
                style = cellStyle,
                titleContent = titleContent?.let { content ->
                    {
                        AnimatedCenterContent(expanded, motion, content)
                    }
                },
                startContent = {
                    NavigationDrawerItemStartContent(
                        iconBrush = style.colors.icon,
                        iconSize = style.dimensions.iconSize,
                        motion = motion,
                        icon = icon,
                    )
                },
                endContent = if ((endContent != null || indicator != null)) {
                    {
                        NavigationDrawerItemEndContent(
                            expanded = expanded,
                            enter = motion.style.endContentEnter,
                            exit = motion.style.endContentExit,
                            endContent = endContent,
                            indicator = indicator,
                        )
                    }
                } else {
                    null
                },
                motion = rememberCellMotion(style = cellMotionStyle, motionContext = motion.context),
            )

            if (indicator != null) {
                CompositionLocalProvider(LocalCounterStyle provides style.counterStyle) {
                    BoxWithConstraints {
                        val boxScope = this
                        val indicatorSize = remember { mutableStateOf(IntSize.Zero) }
                        val indicatorOffsetX = style.dimensions.indicatorOffsetX.getDpAsState(
                            motion.context,
                            motion.style.indicatorOffsetX,
                        )
                        val indicatorOffsetY = style.dimensions.indicatorOffsetY.getDpAsState(
                            motion.context,
                            motion.style.indicatorOffsetY,
                        )
                        AnimatedVisibility(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .onSizeChanged {
                                    indicatorSize.value = it
                                }
                                .offset {
                                    val indicatorWidth = indicatorSize.value.width
                                    val offsetX = indicatorOffsetX.value.roundToPx()
                                        .coerceAtMost(boxScope.maxWidth.roundToPx() - indicatorWidth)
                                    val offsetY = indicatorOffsetY.value.roundToPx()
                                    IntOffset(offsetX, offsetY)
                                },
                            visible = !expanded,
                            enter = motion.style.startIndicatorEnter,
                            exit = motion.style.startIndicatorExit,
                        ) {
                            indicator()
                        }
                    }
                }
            }
        }
    }

    SideEffect {
        motion.context.semanticStateSource.setExclusive(
            drawerValue,
            NavigationDrawerValue.Expanded,
            NavigationDrawerValue.Collapsed,
        )
    }
}

private fun NavigationDrawerItemMotionStyle.toCellMotionStyle(): CellMotionStyle {
    val itemMotionStyle = this
    return CellMotionStyle.builder()
        .titleStyle(itemMotionStyle.titleStyle)
        .titleColor(itemMotionStyle.titleColor)
        .style()
}

@Composable
private fun AnimatedCenterContent(
    visible: Boolean,
    motion: Motion<NavigationDrawerItemMotionStyle>,
    content: @Composable () -> Unit,
) {
    ProvideTextBehaviour(TextBehaviour(maxLines = 1, overflow = TextOverflow.MiddleEllipsis)) {
        AnimatedVisibility(
            visible,
            enter = motion.style.centerContentEnter,
            exit = motion.style.centerContentExit,
        ) {
            content()
        }
    }
}

@Composable
private fun NavigationDrawerItemStartContent(
    iconSize: StatefulValue<Dp>,
    iconBrush: StatefulValue<Brush>,
    motion: Motion<NavigationDrawerItemMotionStyle>,
    icon: (@Composable () -> Unit)?,
) {
    Box(contentAlignment = Alignment.Center) {
        val brush = iconBrush.getBrushAsState(motion.context, motion.style.icon)
        val iconSize by iconSize.getDpAsState(motion.context, motion.style.iconSize)
        val iconDefaultSize = remember {
            derivedStateOf { DpSize(iconSize, iconSize) }
        }
        CompositionLocalProvider(
            LocalTintBrushProducer provides { brush.value },
            LocalIconDefaultSize provides iconDefaultSize.value,
        ) {
            icon?.invoke()
        }
    }
}

@Composable
private fun RowScope.NavigationDrawerItemEndContent(
    expanded: Boolean,
    enter: EnterTransition,
    exit: ExitTransition,
    endContent: (@Composable RowScope.() -> Unit)?,
    indicator: (@Composable () -> Unit)?,
) {
    val rowScope = this
    AnimatedVisibility(
        expanded,
        enter = enter,
        exit = exit,
    ) {
        endContent?.invoke(rowScope)
        indicator?.invoke()
    }
}

private fun Modifier.navigationDrawerItemClickable(
    enabled: Boolean,
    onClick: (() -> Unit)?,
    onClickLabel: String?,
    interactionSource: MutableInteractionSource,
): Modifier {
    if (!enabled || onClick == null) return this
    return clickable(
        interactionSource = interactionSource,
        indication = null,
        onClickLabel = onClickLabel,
        role = Role.Tab,
        onClick = onClick,
    )
}

@Composable
private fun NavigationDrawerItemStyle.toCellStyle(): CellStyle {
    val itemStyle = this
    val avatarStyle = LocalAvatarStyle.current
    val iconButtonStyle = LocalIconButtonStyle.current
    val checkBoxStyle = LocalCheckBoxStyle.current
    val radioBoxStyle = LocalRadioBoxStyle.current
    val switchStyle = LocalSwitchStyle.current
    return CellStyle.builder()
        .titleStyle(itemStyle.titleStyles)
        .disclosureTextStyle(itemStyle.disclosureTextStyles)
        .dimensions {
            contentPaddingStart(itemStyle.dimensions.contentPaddingStart)
            contentPaddingEnd(itemStyle.dimensions.contentPaddingEnd)
        }
        .colors {
            titleColor(itemStyle.colors.title)
        }
        .avatarStyle(avatarStyle)
        .checkBoxStyle(checkBoxStyle)
        .radioBoxStyle(radioBoxStyle)
        .switchStyle(switchStyle)
        .counterStyle(itemStyle.counterStyle)
        .iconButtonStyle(iconButtonStyle)
        .style()
}
