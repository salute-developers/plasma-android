package com.sdds.sbcom.motion.navigationdrawer

import androidx.compose.animation.core.tween
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.NavigationDrawerValue
import com.sdds.compose.uikit.motion.changes
import com.sdds.compose.uikit.motion.components.navigationdrawer.NavigationDrawerMotionStyle
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.transition

private val DrawerSelectorBoundsMotion = transition<Rect>(label = "NavigationDrawerSelectorBounds") {
    segment { } changesWith { finite(tween(DRAWER_ANIMATION_DURATION)) }
}

private val DrawerColorMotion = transition<Brush>(label = "NavigationDrawerSelectorBounds") {
    segment { } changesWith { finite(tween(DRAWER_ANIMATION_DURATION)) }
}

private val DrawerWidthMotion = transition<Dp> {
    segment {
        condition { stateSnapshot ->
            stateSnapshot changes NavigationDrawerValue.Expanded
        }
    } changesWith { finite(tween(DRAWER_ANIMATION_DURATION)) }
}

internal const val DRAWER_ANIMATION_DURATION = 200

internal val NavigationDrawerMotion = NavigationDrawerMotionStyle.builder()
    .width(DrawerWidthMotion)
    .selectorBounds(DrawerSelectorBoundsMotion)
    .selectorColor(DrawerColorMotion)
    .background(DrawerColorMotion)
    .style()
