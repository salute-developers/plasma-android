package com.sdds.compose.uikit.internal.navigationbar

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.AnimationState
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.DecayAnimationSpec
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.animateDecay
import androidx.compose.animation.core.animateTo
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Velocity
import com.sdds.compose.uikit.CollapsingNavBarState
import com.sdds.compose.uikit.CollapsingNavBarStyle
import com.sdds.compose.uikit.TopAppBarScrollBehavior
import com.sdds.compose.uikit.TopAppBarState
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.rememberNavBarShape
import kotlin.math.abs

@Composable
internal fun BaseCollapsingNavBar(
    style: CollapsingNavBarStyle,
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit,
    smallTitle: @Composable () -> Unit,
    description: @Composable (() -> Unit),
    smallDescription: @Composable (() -> Unit),
    navigationIcon: @Composable () -> Unit,
    actions: @Composable RowScope.() -> Unit,
    backgroundContent: @Composable (BoxScope.() -> Unit),
    windowInsets: WindowInsets,
    scrollBehavior: TopAppBarScrollBehavior?,
    interactionSource: InteractionSource,
) {
    val collapsedStateSet = remember { setOf(CollapsingNavBarState.Collapsed) }
    val pinnedHeight = style.dimensions.height.getValue(
        interactionSource = interactionSource,
        stateSet = collapsedStateSet
    )
    val maxHeight = style.dimensions.height.getValue(interactionSource)
    if (maxHeight <= pinnedHeight) {
        throw IllegalArgumentException(
            "A BaseCollapsingNavBar max height should be greater than its pinned height"
        )
    }
    val collapsedHeightPx: Float
    val maxHeightPx: Float
    LocalDensity.current.run {
        collapsedHeightPx = pinnedHeight.toPx()
        maxHeightPx = maxHeight.toPx()
    }

    // Sets the app bar's height offset limit to hide just the bottom title area and keep top title
    // visible when collapsed.
    SideEffect {
        if (scrollBehavior?.state?.heightOffsetLimit != collapsedHeightPx - maxHeightPx) {
            scrollBehavior?.state?.heightOffsetLimit = collapsedHeightPx - maxHeightPx
        }
    }

    // Obtain the container Color from the TopAppBarColors using the `collapsedFraction`, as the
    // bottom part of this TwoRowsTopAppBar changes color at the same rate the app bar expands or
    // collapse.
    // This will potentially animate or interpolate a transition between the container color and the
    // container's scrolled color according to the app bar's scroll state.
    val colorTransitionFraction = scrollBehavior?.state?.collapsedFraction ?: 0f
    val background = style.colors.backgroundColor.getValue(interactionSource, emptySet())
    val scrolledBackground =
        style.colors.backgroundColor.getValue(interactionSource, collapsedStateSet)
    val appBarContainerColor =
        containerColor(colorTransitionFraction, background, scrolledBackground)

    // Wrap the given actions in a Row.
    val actionsRow = @Composable {
        Row(
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically,
            content = actions
        )
    }
    val collapsedAlpha = TopTextAlphaEasing.transform(colorTransitionFraction)
    val expandedAlpha = 1f - colorTransitionFraction
    // Hide the top row title semantics when its alpha value goes below 0.5 threshold.
    // Hide the bottom row title semantics when the top title semantics are active.
    val hideTopRowSemantics = colorTransitionFraction < 0.5f
    val hideBottomRowSemantics = !hideTopRowSemantics

    // Set up support for resizing the top app bar when vertically dragging the bar itself.
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
                    scrollBehavior.snapAnimationSpec
                )
            }
        )
    } else {
        Modifier
    }

    Box(
        modifier = modifier
            .then(appBarDragModifier)
            .clip(rememberNavBarShape(style.bottomShape))
            .background(appBarContainerColor),
        contentAlignment = Alignment.TopCenter,
    ) {
        // Закрытое положение
        CollapsingNavBarLayout(
            modifier = Modifier //todo применить отступы в закрытом положении
                .windowInsetsPadding(windowInsets)
                // clip after padding so we don't show the title over the inset area
                .clipToBounds(),
            heightPx = collapsedHeightPx,
            navigationIconContentColor = style.colors.backIconColor.getValue(
                interactionSource,
                collapsedStateSet
            ),
            titleContentColor = style.colors.titleColor.getValue(
                interactionSource,
                collapsedStateSet
            ),
            actionIconContentColor = style.colors.actionStartColor.getValue(
                interactionSource,
                collapsedStateSet
            ),
            title = smallTitle,
            description = smallDescription,
            titleTextStyle = style.titleStyle.getValue(interactionSource, collapsedStateSet),
            alpha = collapsedAlpha,
            textVerticalArrangement = Arrangement.Center,
            textHorizontalArrangement = Arrangement.Start,//todo вынести в публичное апи или брать из стиля и сделать enum
            hideTitleSemantics = hideTopRowSemantics,
            navigationIcon = navigationIcon,
            actions = actionsRow,
            descriptionContentColor = style.colors.descriptionColor.getValue(
                interactionSource,
                collapsedStateSet
            ),
            descriptionTextStyle = style.descriptionStyle.getValue(
                interactionSource,
                collapsedStateSet
            ),
        )

        // Открытое положение, использовать новый лэйаут из обычного навбара без экшенов, стрелочки
        CollapsingNavBarLayout(
            modifier = Modifier //todo применить отступы в открытом положении
                // only apply the horizontal sides of the window insets padding, since the top
                // padding will always be applied by the layout above
                .windowInsetsPadding(windowInsets.only(WindowInsetsSides.Horizontal))
                .clipToBounds(),
            heightPx = maxHeightPx + (scrollBehavior?.state?.heightOffset
                ?: 0f),
            navigationIconContentColor = style.colors.backIconColor.getValue(interactionSource),
            titleContentColor = style.colors.titleColor.getValue(interactionSource),
            actionIconContentColor = style.colors.actionStartColor.getValue(interactionSource),
            title = title,
            description = description,
            titleTextStyle = style.titleStyle.getValue(interactionSource),
            alpha = expandedAlpha,
            textVerticalArrangement = Arrangement.Bottom,
            textHorizontalArrangement = Arrangement.Start, //todo
            hideTitleSemantics = hideBottomRowSemantics,
            navigationIcon = {},
            actions = {},
            descriptionContentColor = style.colors.descriptionColor.getValue(interactionSource),
            descriptionTextStyle = style.descriptionStyle.getValue(interactionSource),
            backgroundContent = backgroundContent,
        )
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
        FastOutLinearInEasing.transform(colorTransitionFraction)
    )
}

/**
 * Settles the app bar by flinging, in case the given velocity is greater than zero, and snapping
 * after the fling settles.
 */
internal suspend fun settleAppBar(
    state: TopAppBarState,
    velocity: Float,
    flingAnimationSpec: DecayAnimationSpec<Float>?,
    snapAnimationSpec: AnimationSpec<Float>?
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
                animationSpec = snapAnimationSpec
            ) { state.heightOffset = value }
        }
    }

    return Velocity(0f, remainingVelocity)
}

private val TopTextAlphaEasing = CubicBezierEasing(.8f, 0f, .8f, .15f)