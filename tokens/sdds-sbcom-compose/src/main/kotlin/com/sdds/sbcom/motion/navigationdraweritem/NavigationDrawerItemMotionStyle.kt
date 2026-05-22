package com.sdds.sbcom.motion.navigationdraweritem

import androidx.compose.animation.core.tween
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.motion.components.navigationdrawer.NavigationDrawerItemMotionStyle
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.transition
import com.sdds.sbcom.motion.navigationdrawer.DRAWER_ANIMATION_DURATION

private val DrawerColorMotion = transition<Brush>(label = "NavigationDrawerSelectorBounds") {
    segment { } changesWith { finite(tween(DRAWER_ANIMATION_DURATION)) }
}

internal val NavigationDrawerItemMotionStyle = NavigationDrawerItemMotionStyle.builder()
    .background(DrawerColorMotion)
    .icon(DrawerColorMotion)
    .titleColor(DrawerColorMotion)
    .style()
