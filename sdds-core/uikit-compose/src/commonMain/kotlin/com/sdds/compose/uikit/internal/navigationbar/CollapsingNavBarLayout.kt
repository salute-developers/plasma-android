package com.sdds.compose.uikit.internal.navigationbar

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.NavBarCenterAlignmentStrategy
import com.sdds.compose.uikit.NavigationBarTextAlign

@Composable
internal fun CollapsingNavBarLayout(
    modifier: Modifier,
    offsetPx: () -> Float,
    alpha: () -> Float,
    textAlign: NavigationBarTextAlign,
    actionStart: (@Composable () -> Unit)?,
    actionEnd: (@Composable () -> Unit)?,
    centerContent: (@Composable () -> Unit)?,
    backgroundContent: (@Composable BoxScope.() -> Unit)?,
    onMainContentSizeChanged: (Int) -> Unit = {},
    horizontalSpacing: Dp,
    paddings: PaddingValues,
    centerAlignmentStrategy: NavBarCenterAlignmentStrategy,
) {
    NavigationBarLayout(
        modifier = modifier,
        startContent = actionStart,
        centerContent = centerContent,
        endContent = actionEnd,
        horizontalSpacing = horizontalSpacing,
        centerAlignmentStrategy = centerAlignmentStrategy,
        textAlign = textAlign,
        alpha = alpha,
        offsetPx = offsetPx,
        backgroundContent = backgroundContent,
        onMainContentSizeChanged = onMainContentSizeChanged,
        paddings = paddings,
    )
}
