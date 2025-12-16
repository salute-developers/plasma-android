package com.sdds.compose.uikit.internal.navigationbar

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.AnimationState
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.DecayAnimationSpec
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.animateDecay
import androidx.compose.animation.core.animateTo
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.Velocity
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.CollapsingNavigationBarState
import com.sdds.compose.uikit.CollapsingNavigationBarStates
import com.sdds.compose.uikit.CollapsingNavigationBarStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.LocalIconButtonStyle
import com.sdds.compose.uikit.LocalTint
import com.sdds.compose.uikit.NavBarCenterAlignmentStrategy
import com.sdds.compose.uikit.NavigationBarScrollBehavior
import com.sdds.compose.uikit.NavigationBarTextAlign
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.rememberNavBarShape
import com.sdds.compose.uikit.shadow.shadow
import com.sdds.compose.uikit.toPlatformTextAlign
import kotlin.math.abs

@Suppress("LongMethod")
@Composable
internal fun BaseCollapsingNavBar(
    style: CollapsingNavigationBarStyle,
    modifier: Modifier = Modifier,
    expandedTitle: (@Composable () -> Unit)?,
    collapsedTitle: (@Composable () -> Unit)?,
    expandedDescription: (@Composable () -> Unit)?,
    collapsedDescription: (@Composable () -> Unit)?,
    actionStart: (@Composable RowScope.() -> Unit)?,
    actionEnd: (@Composable RowScope.() -> Unit)?,
    backgroundContent: (@Composable BoxScope.() -> Unit)?,
    content: (@Composable (() -> Unit))?,
    collapsedTextAlign: NavigationBarTextAlign,
    expandedTextAlign: NavigationBarTextAlign,
    windowInsets: WindowInsets,
    scrollBehavior: NavigationBarScrollBehavior?,
    interactionSource: InteractionSource,
    centerAlignmentStrategy: NavBarCenterAlignmentStrategy,
    onBackPressed: () -> Unit,
) {
    var topContentSize by remember { mutableIntStateOf(0) }
    var bottomContentSize by remember { mutableIntStateOf(0) }
    val collapsedStateSet = remember { setOf(CollapsingNavigationBarStates.Collapsed) }
    val paddingBottomPx = with(LocalDensity.current) {
        style.dimensions.paddingBottom.toPx()
    }
    LaunchedEffect(bottomContentSize) {
        if (scrollBehavior?.state?.heightOffsetLimit != -bottomContentSize.toFloat() + paddingBottomPx) {
            scrollBehavior?.state?.heightOffsetLimit =
                -bottomContentSize.toFloat() + paddingBottomPx
        }
    }

    val colorTransitionFraction = scrollBehavior?.state?.collapsedFraction ?: 0f
    val background = style.colors.backgroundColor.getValue(interactionSource, emptySet())
    val scrolledBackground =
        style.colors.backgroundColor.getValue(interactionSource, collapsedStateSet)
    val appBarContainerColor =
        containerColor(colorTransitionFraction, background, scrolledBackground)

    val collapsedAlpha = TopTextAlphaEasing.transform(colorTransitionFraction)
    val expandedAlpha = 1f - colorTransitionFraction
    val hideTopRowSemantics = colorTransitionFraction < 0.5f
    val hideBottomRowSemantics = !hideTopRowSemantics

    val appBarDragModifier = if (scrollBehavior != null && !scrollBehavior.isPinned) {
        Modifier.draggable(
            orientation = Orientation.Vertical,
            state = rememberDraggableState { delta ->
                scrollBehavior.state.heightOffset = scrollBehavior.state.heightOffset + delta
            },
            onDragStopped = { velocity ->
                settleAppBar(
                    scrollBehavior.state,
                    velocity,
                    scrollBehavior.flingAnimationSpec,
                    scrollBehavior.snapAnimationSpec,
                )
            },
        )
    } else {
        Modifier
    }

    Column(
        modifier = modifier
            .then(appBarDragModifier)
            .shadow(style.shadow)
            .clip(rememberNavBarShape(style.bottomShape))
            .background(appBarContainerColor),
    ) {
        Box {
            // Верхний контент
            CollapsingNavBarLayout(
                modifier = Modifier
                    .fillMaxWidth()
                    .windowInsetsPadding(windowInsets)
                    .clipToBounds(),
                offsetPx = { 0f },
                alpha = { collapsedAlpha },
                actionStart = startContent(style, interactionSource, actionStart, onBackPressed),
                actionEnd = endContent(style, interactionSource, actionEnd),
                textAlign = collapsedTextAlign,
                centerContent = {
                    CenterContent(
                        modifier = if (hideTopRowSemantics) Modifier.clearAndSetSemantics { } else Modifier,
                        titleContent = collapsedTitle,
                        descriptionContent = collapsedDescription,
                        descriptionPadding = style.dimensions.descriptionPadding.getValue(
                            interactionSource,
                            collapsedStateSet,
                        ),
                        titleColor = style.colors.titleColor.getValue(
                            interactionSource,
                            collapsedStateSet,
                        ),
                        descriptionColor = style.colors.descriptionColor.getValue(
                            interactionSource,
                            collapsedStateSet,
                        ),
                        titleStyle = style.titleStyle.getValue(
                            interactionSource,
                            collapsedStateSet,
                        ),
                        descriptionStyle = style.descriptionStyle.getValue(
                            interactionSource,
                            collapsedStateSet,
                        ),
                        textAlign = collapsedTextAlign,
                    )
                },
                onMainContentSizeChanged = {
                    topContentSize = it
                },
                backgroundContent = null,
                horizontalSpacing = style.dimensions.horizontalSpacing,
                paddings = PaddingValues(
                    start = style.dimensions.paddingStart,
                    end = style.dimensions.paddingEnd,
                    top = style.dimensions.paddingTop,
                    bottom = style.dimensions.paddingBottom,
                ),
                centerAlignmentStrategy = centerAlignmentStrategy,
            )

            // Нижний контент
            CollapsingNavBarLayout(
                modifier = Modifier
                    .fillMaxWidth()
                    .windowInsetsPadding(windowInsets.only(WindowInsetsSides.Horizontal))
                    .clipToBounds(),
                offsetPx = {
                    topContentSize + (scrollBehavior?.state?.heightOffset ?: 0f) - paddingBottomPx
                },
                alpha = { expandedAlpha },
                actionStart = null,
                actionEnd = null,
                backgroundContent = backgroundContent,
                textAlign = expandedTextAlign,
                centerContent = {
                    CenterContent(
                        modifier = if (hideBottomRowSemantics) Modifier.clearAndSetSemantics { } else Modifier,
                        titleContent = expandedTitle,
                        descriptionContent = expandedDescription,
                        descriptionPadding = style.dimensions.descriptionPadding.getValue(
                            interactionSource,
                        ),
                        titleColor = style.colors.titleColor.getValue(interactionSource),
                        descriptionColor = style.colors.descriptionColor.getValue(interactionSource),
                        titleStyle = style.titleStyle.getValue(interactionSource),
                        descriptionStyle = style.descriptionStyle.getValue(interactionSource),
                        textAlign = expandedTextAlign,
                    )
                },
                onMainContentSizeChanged = {
                    bottomContentSize = it
                },
                horizontalSpacing = style.dimensions.horizontalSpacing,
                paddings = PaddingValues(
                    start = style.dimensions.paddingStart,
                    end = style.dimensions.paddingEnd,
                    top = style.dimensions.textBlockTopMargin,
                    bottom = style.dimensions.paddingBottom,
                ),
                centerAlignmentStrategy = centerAlignmentStrategy,
            )
        }

        content?.invoke()
    }
}

private fun startContent(
    style: CollapsingNavigationBarStyle,
    interactionSource: InteractionSource,
    actionStart: (@Composable RowScope.() -> Unit)?,
    onBackPressed: () -> Unit,
): (@Composable () -> Unit)? {
    return if (style.backIcon != null || actionStart != null) {
        @Composable { StartContent(style, interactionSource, actionStart, onBackPressed) }
    } else {
        null
    }
}

@Composable
private fun StartContent(
    style: CollapsingNavigationBarStyle,
    interactionSource: InteractionSource,
    actionStart: (@Composable RowScope.() -> Unit)?,
    onBackPressed: () -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        style.backIcon?.let {
            val iconInteraction = remember { MutableInteractionSource() }
            val backIconColor =
                style.colors.backIconColor.getValue(iconInteraction)
            val padding = style.dimensions.backIconMargin
            Icon(
                modifier = Modifier
                    .padding(end = padding)
                    .clickable(
                        interactionSource = iconInteraction,
                        indication = null,
                        onClick = onBackPressed,
                    ),
                painter = painterResource(it),
                contentDescription = "",
                tint = backIconColor,
            )
        }
        if (actionStart != null) {
            Actions(
                actionStart,
                style.colors.actionStartColor,
                interactionSource,
                style.actionButtonStyle,
                style.dimensions.horizontalSpacing,
            )
        }
    }
}

private fun endContent(
    style: CollapsingNavigationBarStyle,
    interactionSource: InteractionSource,
    actionEnd: (@Composable RowScope.() -> Unit)?,
): (@Composable () -> Unit)? {
    return if (actionEnd != null) {
        { EndContent(style, interactionSource, actionEnd) }
    } else {
        null
    }
}

@Composable
private fun EndContent(
    style: CollapsingNavigationBarStyle,
    interactionSource: InteractionSource,
    actionEnd: (@Composable RowScope.() -> Unit)?,
) {
    if (actionEnd != null) {
        Actions(
            actionEnd,
            style.colors.actionEndColor,
            interactionSource,
            style.actionButtonStyle,
            style.dimensions.horizontalSpacing,
        )
    }
}

@Composable
private fun Actions(
    actionContent: (@Composable RowScope.() -> Unit),
    tint: StatefulValue<Color>,
    interactionSource: InteractionSource,
    actionButtonStyle: ButtonStyle?,
    spacing: Dp,
) {
    val iconColor = tint.getValue(interactionSource)
    val actions = @Composable {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(spacing),
        ) {
            actionContent()
        }
    }
    if (actionButtonStyle != null) {
        CompositionLocalProvider(
            LocalTint provides iconColor,
            LocalIconButtonStyle provides actionButtonStyle,
            content = actions,
        )
    } else {
        CompositionLocalProvider(
            LocalTint provides iconColor,
            content = actions,
        )
    }
}

@Composable
private fun CenterContent(
    modifier: Modifier,
    titleContent: (@Composable () -> Unit)?,
    descriptionContent: (@Composable () -> Unit)?,
    descriptionPadding: Dp,
    titleColor: Color,
    descriptionColor: Color,
    titleStyle: TextStyle,
    descriptionStyle: TextStyle,
    textAlign: NavigationBarTextAlign,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(descriptionPadding),
        horizontalAlignment = textAlign.toHorizontalAlignment(),
    ) {
        titleContent?.let {
            ProvideTextStyle(
                value = titleStyle.copy(textAlign = textAlign.toPlatformTextAlign()),
                color = { titleColor },
                content = it,
            )
        }
        descriptionContent?.let {
            ProvideTextStyle(
                value = descriptionStyle.copy(textAlign = textAlign.toPlatformTextAlign()),
                color = { descriptionColor },
                content = it,
            )
        }
    }
}

private fun NavigationBarTextAlign.toAlignment(): Alignment {
    return when (this) {
        NavigationBarTextAlign.Start -> Alignment.CenterStart
        NavigationBarTextAlign.Center -> Alignment.Center
        NavigationBarTextAlign.End -> Alignment.CenterEnd
    }
}

private fun NavigationBarTextAlign.toHorizontalAlignment(): Alignment.Horizontal {
    return when (this) {
        NavigationBarTextAlign.Start -> Alignment.Start
        NavigationBarTextAlign.Center -> Alignment.CenterHorizontally
        NavigationBarTextAlign.End -> Alignment.End
    }
}

@Stable
private fun containerColor(
    colorTransitionFraction: Float,
    containerColor: Color,
    scrolledContainerColor: Color,
): Color {
    return lerp(
        containerColor,
        scrolledContainerColor,
        FastOutLinearInEasing.transform(colorTransitionFraction),
    )
}

/**
 * Settles the app bar by flinging, in case the given velocity is greater than zero, and snapping
 * after the fling settles.
 */
internal suspend fun settleAppBar(
    state: CollapsingNavigationBarState,
    velocity: Float,
    flingAnimationSpec: DecayAnimationSpec<Float>?,
    snapAnimationSpec: AnimationSpec<Float>?,
): Velocity {
    // Check if the app bar is completely collapsed/expanded. If so, no need to settle the app bar,
    // and just return Zero Velocity.
    // Note that we don't check for 0f due to float precision with the collapsedFraction
    // calculation.
    if (state.collapsedFraction < 0.01f || state.collapsedFraction == 1f) {
        return Velocity.Zero
    }
    var remainingVelocity = velocity
    // In case there is an initial velocity that was left after a previous user fling, animate to
    // continue the motion to expand or collapse the app bar.
    if (flingAnimationSpec != null && abs(velocity) > 1f) {
        var lastValue = 0f
        AnimationState(
            initialValue = 0f,
            initialVelocity = velocity,
        )
            .animateDecay(flingAnimationSpec) {
                val delta = value - lastValue
                val initialHeightOffset = state.heightOffset
                state.heightOffset = initialHeightOffset + delta
                val consumed = abs(initialHeightOffset - state.heightOffset)
                lastValue = value
                remainingVelocity = this.velocity
                // avoid rounding errors and stop if anything is unconsumed
                if (abs(delta - consumed) > 0.5f) this.cancelAnimation()
            }
    }
    // Snap if animation specs were provided.
    if (snapAnimationSpec != null) {
        if (state.heightOffset < 0 &&
            state.heightOffset > state.heightOffsetLimit
        ) {
            AnimationState(initialValue = state.heightOffset).animateTo(
                if (state.collapsedFraction < 0.5f) {
                    0f
                } else {
                    state.heightOffsetLimit
                },
                animationSpec = snapAnimationSpec,
            ) { state.heightOffset = value }
        }
    }

    return Velocity(0f, remainingVelocity)
}

private val TopTextAlphaEasing = CubicBezierEasing(.8f, 0f, .8f, .15f)
