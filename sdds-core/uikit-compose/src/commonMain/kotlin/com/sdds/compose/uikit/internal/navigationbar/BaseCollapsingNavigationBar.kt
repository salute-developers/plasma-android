package com.sdds.compose.uikit.internal.navigationbar

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.AnimationState
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.DecayAnimationSpec
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.animateDecay
import androidx.compose.animation.core.animateTo
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
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
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.Velocity
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.CollapsingNavigationBarDimensions
import com.sdds.compose.uikit.CollapsingNavigationBarState
import com.sdds.compose.uikit.CollapsingNavigationBarStates
import com.sdds.compose.uikit.CollapsingNavigationBarStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.LocalIconButtonStyle
import com.sdds.compose.uikit.LocalTintBrushProducer
import com.sdds.compose.uikit.NavBarCenterAlignmentStrategy
import com.sdds.compose.uikit.NavigationBarScrollBehavior
import com.sdds.compose.uikit.NavigationBarTextAlign
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.graphics.LocalIndication
import com.sdds.compose.uikit.graphics.brush.BrushProducer
import com.sdds.compose.uikit.interactions.MutableSemanticStateSource
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.components.navigationbar.NavigationBarMotionStyle
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.rememberMotionContext
import com.sdds.compose.uikit.motion.rememberStateSnapshot
import com.sdds.compose.uikit.motion.rememberWithSemanticStateSource
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
    centerAlignmentStrategy: NavBarCenterAlignmentStrategy,
    onBackPressed: () -> Unit,
    motion: Motion<NavigationBarMotionStyle>,
) {
    val collapsedMotion = motion.rememberWithSemanticStateSource(
        remember { MutableSemanticStateSource().apply { add(CollapsingNavigationBarStates.Collapsed) } },
    )
    var topContentSize by remember { mutableIntStateOf(0) }
    var bottomContentSize by remember { mutableIntStateOf(0) }
    val paddingBottomPx = with(LocalDensity.current) {
        style.dimensions.paddingBottomValues.getValue(
            motion.context.interactionSource,
            motion.context.semanticStateSource,
        ).toPx()
    }
    LaunchedEffect(bottomContentSize) {
        if (scrollBehavior?.state?.heightOffsetLimit != -bottomContentSize.toFloat() + paddingBottomPx) {
            scrollBehavior?.state?.heightOffsetLimit =
                -bottomContentSize.toFloat() + paddingBottomPx
        }
    }
    val collapsedSpacing by style.dimensions.horizontalSpacingValues.getValueAsState(collapsedMotion.context)
    val spacing by style.dimensions.horizontalSpacingValues.getValueAsState(motion.context)
    // Прогресс сворачивания читается лямбдой, а не значением: подписка возникает
    // в фазе отрисовки/замера (graphicsLayer, Layout, drawWithCache), а не в композиции,
    // поэтому скролл не пересобирает тело компонента на каждый кадр.
    val fraction: () -> Float = { scrollBehavior?.state?.collapsedFraction ?: 0f }
    val background = style.colors.background.getBrushAsState(motion.context, motion.style.backgroundColor)
    val scrolledBackground =
        style.colors.background.getBrushAsState(collapsedMotion.context, collapsedMotion.style.backgroundColor)

    // Тело подписано на порог, а не на прогресс: пересборка происходит только
    // при пересечении 0.5, а не на каждый кадр скролла.
    val hideTopRowSemantics by remember(scrollBehavior) {
        derivedStateOf { fraction() < 0.5f }
    }
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
    val shape = style.bottomShapes.getValue(motion.context.interactionSource, motion.context.semanticStateSource)
    Column(
        modifier = modifier
            .then(appBarDragModifier)
            .shadow(style.shadow)
            .clip(rememberNavBarShape(shape))
            .appBarBackground(
                background = { background.value },
                scrolledBackground = { scrolledBackground.value },
                progress = { FastOutLinearInEasing.transform(fraction()) },
            ),
    ) {
        Box(
            modifier = Modifier.windowInsetsPadding(
                windowInsets.only(WindowInsetsSides.Top),
            ),
        ) {
            val upTitleColor = style.colors.titleBrush.getBrushAsState(
                collapsedMotion.context,
                collapsedMotion.style.titleColor,
            )
            val upDescriptionColor = style.colors.descriptionBrush.getBrushAsState(
                collapsedMotion.context,
                collapsedMotion.style.descriptionColor,
            )
            val upTitleStyle = style.titleStyle.getTextStyleAsState(
                collapsedMotion.context,
                collapsedMotion.style.titleStyle,
            )
            val upDescriptionStyle = style.descriptionStyle.getTextStyleAsState(
                collapsedMotion.context,
                collapsedMotion.style.descriptionStyle,
            )
            val downTitleColor = style.colors.titleBrush.getBrushAsState(
                motion.context,
                motion.style.titleColor,
            )
            val downDescriptionColor = style.colors.descriptionBrush.getBrushAsState(
                motion.context,
                motion.style.descriptionColor,
            )
            val downTitleStyle = style.titleStyle.getTextStyleAsState(
                motion.context,
                motion.style.titleStyle,
            )
            val downDescriptionStyle = style.descriptionStyle.getTextStyleAsState(
                motion.context,
                motion.style.descriptionStyle,
            )
            // Верхний контент
            CollapsingNavBarLayout(
                modifier = Modifier
                    .fillMaxWidth()
                    .windowInsetsPadding(windowInsets.only(WindowInsetsSides.Horizontal))
                    .clipToBounds(),
                offsetPx = { 0f },
                alpha = { TopTextAlphaEasing.transform(fraction()) },
                actionStart = startContent(style, collapsedMotion, actionStart, onBackPressed, collapsedSpacing),
                actionEnd = endContent(style, collapsedMotion, actionEnd, collapsedSpacing),
                textAlign = collapsedTextAlign,
                centerContent = {
                    CenterContent(
                        modifier = if (hideTopRowSemantics) Modifier.clearAndSetSemantics { } else Modifier,
                        titleContent = collapsedTitle,
                        descriptionContent = collapsedDescription,
                        descriptionPadding = style.dimensions.descriptionPadding.getValue(
                            collapsedMotion.context.interactionSource,
                            collapsedMotion.context.semanticStateSource,
                        ),
                        titleColor = { upTitleColor.value },
                        descriptionColor = { upDescriptionColor.value },
                        titleStyle = upTitleStyle,
                        descriptionStyle = upDescriptionStyle,
                        textAlign = collapsedTextAlign,
                    )
                },
                onMainContentSizeChanged = {
                    topContentSize = it
                },
                backgroundContent = null,
                horizontalSpacing = collapsedSpacing,
                paddings = collapsingNavbarPaddingValues(style.dimensions, collapsedMotion, false),
                centerAlignmentStrategy = centerAlignmentStrategy,
                minContentHeight = style.dimensions.minContentHeight.getValue(
                    collapsedMotion.context.interactionSource,
                    collapsedMotion.context.semanticStateSource,
                ),
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
                alpha = { 1f - fraction() },
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
                            motion.context.interactionSource,
                            motion.context.semanticStateSource,
                        ),
                        titleColor = { downTitleColor.value },
                        descriptionColor = { downDescriptionColor.value },
                        titleStyle = downTitleStyle,
                        descriptionStyle = downDescriptionStyle,
                        textAlign = expandedTextAlign,
                    )
                },
                onMainContentSizeChanged = {
                    bottomContentSize = it
                },
                horizontalSpacing = spacing,
                paddings = collapsingNavbarPaddingValues(style.dimensions, motion, true),
                centerAlignmentStrategy = centerAlignmentStrategy,
                minContentHeight = style.dimensions.minContentHeight.getValue(
                    motion.context.interactionSource,
                    motion.context.semanticStateSource,
                ),
            )
        }

        content?.invoke()
    }
}

private fun startContent(
    style: CollapsingNavigationBarStyle,
    motion: Motion<NavigationBarMotionStyle>,
    actionStart: (@Composable RowScope.() -> Unit)?,
    onBackPressed: () -> Unit,
    spacing: Dp,
): (@Composable () -> Unit)? {
    return if (style.backIconSource != null || actionStart != null) {
        @Composable { StartContent(style, motion, actionStart, onBackPressed, spacing) }
    } else {
        null
    }
}

@Composable
private fun StartContent(
    style: CollapsingNavigationBarStyle,
    motion: Motion<NavigationBarMotionStyle>,
    actionStart: (@Composable RowScope.() -> Unit)?,
    onBackPressed: () -> Unit,
    spacing: Dp,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        style.backIconSource?.let {
            val iconInteraction = remember { MutableInteractionSource() }
            val iconMotionContext = rememberMotionContext(
                semanticStateSource = motion.context.semanticStateSource,
                interactionSource = iconInteraction,
            )
            val backIconColor =
                style.colors.backIconBrush.getBrushAsState(iconMotionContext, motion.style.backIconColor)
            val padding by style.dimensions.backIconMarginValues.getValueAsState(motion.context)
            Icon(
                modifier = Modifier
                    .padding(end = padding)
                    .clickable(
                        interactionSource = iconInteraction,
                        indication = LocalIndication.current,
                        onClick = onBackPressed,
                    ),
                source = it,
                contentDescription = "",
                brush = { backIconColor.value },
            )
        }
        if (actionStart != null) {
            Actions(
                actionStart,
                style.colors.actionStartBrush,
                motion.context,
                motion.style.actionStartColor,
                style.actionButtonStyle,
                spacing,
            )
        }
    }
}

private fun endContent(
    style: CollapsingNavigationBarStyle,
    motion: Motion<NavigationBarMotionStyle>,
    actionEnd: (@Composable RowScope.() -> Unit)?,
    spacing: Dp,
): (@Composable () -> Unit)? {
    return if (actionEnd != null) {
        { EndContent(style, motion, actionEnd, spacing) }
    } else {
        null
    }
}

@Composable
private fun EndContent(
    style: CollapsingNavigationBarStyle,
    motion: Motion<NavigationBarMotionStyle>,
    actionEnd: (@Composable RowScope.() -> Unit)?,
    spacing: Dp,
) {
    if (actionEnd != null) {
        Actions(
            actionEnd,
            style.colors.actionEndBrush,
            motion.context,
            motion.style.actionEndColor,
            style.actionButtonStyle,
            spacing,
        )
    }
}

@Composable
private fun Actions(
    actionContent: (@Composable RowScope.() -> Unit),
    tint: StatefulValue<Brush>,
    motionContext: MotionContext,
    motionProperty: MotionProperty<Brush>,
    actionButtonStyle: ButtonStyle?,
    spacing: Dp,
) {
    val iconColor = tint.getBrushAsState(motionContext, motionProperty)
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
            LocalTintBrushProducer provides { iconColor.value },
            LocalIconButtonStyle provides actionButtonStyle,
            content = actions,
        )
    } else {
        CompositionLocalProvider(
            LocalTintBrushProducer provides { iconColor.value },
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
    titleColor: BrushProducer,
    descriptionColor: BrushProducer,
    titleStyle: State<TextStyle>,
    descriptionStyle: State<TextStyle>,
    textAlign: NavigationBarTextAlign,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(descriptionPadding),
        horizontalAlignment = textAlign.toHorizontalAlignment(),
    ) {
        titleContent?.let {
            val currentStyle = titleStyle.value
            ProvideTextStyle(
                value = currentStyle.copy(textAlign = textAlign.toPlatformTextAlign()),
                brush = titleColor,
                content = it,
            )
        }
        descriptionContent?.let {
            val currentStyle = descriptionStyle.value
            ProvideTextStyle(
                value = currentStyle.copy(textAlign = textAlign.toPlatformTextAlign()),
                brush = descriptionColor,
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

private fun Modifier.appBarBackground(
    background: BrushProducer,
    scrolledBackground: BrushProducer,
    progress: () -> Float,
): Modifier = drawWithCache {
    val clampedProgress = progress().coerceIn(0f, 1f)
    val currentContainerBrush = background()
    val currentScrolledContainerBrush = scrolledBackground()
    val resolvedBrush = containerColor(
        progress = clampedProgress,
        containerColor = currentContainerBrush,
        scrolledContainerColor = currentScrolledContainerBrush,
    )

    if (resolvedBrush != null) {
        onDrawBehind {
            drawRect(brush = resolvedBrush)
        }
    } else {
        onDrawBehind {
            if (clampedProgress < 1f) {
                drawRect(
                    brush = currentContainerBrush,
                    alpha = 1f - clampedProgress,
                )
            }
            if (clampedProgress > 0f) {
                drawRect(
                    brush = currentScrolledContainerBrush,
                    alpha = clampedProgress,
                )
            }
        }
    }
}

@Stable
private fun containerColor(
    progress: Float,
    containerColor: Brush,
    scrolledContainerColor: Brush,
): Brush? {
    return if (containerColor is SolidColor && scrolledContainerColor is SolidColor) {
        SolidColor(
            lerp(
                containerColor.value,
                scrolledContainerColor.value,
                progress,
            ),
        )
    } else {
        null
    }
}

@Composable
private fun collapsingNavbarPaddingValues(
    dimensions: CollapsingNavigationBarDimensions,
    motion: Motion<NavigationBarMotionStyle>,
    forDownLayout: Boolean,
): PaddingValues {
    val start = dimensions.paddingStartValues
    val top = if (forDownLayout) dimensions.textBlockTopMarginValues else dimensions.paddingTopValues
    val end = dimensions.paddingEndValues
    val bottom = dimensions.paddingBottomValues
    val values = remember(start, top, end, bottom) { listOf(start, top, end, bottom) }
    val snapshot = motion.context.rememberStateSnapshot(values)
    val paddings = remember(snapshot, start, top, end, bottom) {
        PaddingValues(
            start = start.getValue(snapshot.target),
            end = end.getValue(snapshot.target),
            top = top.getValue(snapshot.target),
            bottom = bottom.getValue(snapshot.target),
        )
    }
    return paddings
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
