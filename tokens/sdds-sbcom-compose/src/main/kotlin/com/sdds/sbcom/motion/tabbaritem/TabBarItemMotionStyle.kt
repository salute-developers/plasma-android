package com.sdds.sbcom.motion.tabbaritem

import androidx.compose.animation.core.tween
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.motion.components.tabbar.TabBarItemMotionStyle
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.transition

private val TabBarItemColorMotion = transition<Brush>(label = "TabBarColorMotion") {
    segment { } changesWith { finite(tween(TAB_BAR_ITEM_DURATION)) }
}

internal val TabBarItemMotionStyle = TabBarItemMotionStyle.builder()
    .backgroundColor(TabBarItemColorMotion)
    .iconColor(TabBarItemColorMotion)
    .labelColor(TabBarItemColorMotion)
    .style()

private const val TAB_BAR_ITEM_DURATION = 200
