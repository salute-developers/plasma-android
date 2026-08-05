package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HierarchyFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HierarchyFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.7 1.75 c 0.773 0.0 1.4 0.622 1.4 1.389 v 1.388 c 0.0 0.767 -0.627 1.39 -1.4 1.39 H 8.5 v 1.587 h 3.35 c 0.856 0.0 1.55 0.689 1.55 1.538 v 1.041 h 0.2 c 0.774 0.0 1.401 0.623 1.401 1.39 v 1.388 c 0.0 0.767 -0.627 1.389 -1.4 1.389 h -1.4 c -0.773 0.0 -1.4 -0.622 -1.4 -1.389 v -1.388 c 0.0 -0.767 0.627 -1.39 1.4 -1.39 H 12.4 V 9.042 c 0.0 -0.301 -0.246 -0.546 -0.55 -0.546 H 8.5 v 1.587 h 0.2 c 0.773 0.0 1.4 0.623 1.4 1.39 v 1.388 c 0.0 0.767 -0.627 1.389 -1.4 1.389 H 7.3 c -0.772 0.0 -1.4 -0.622 -1.4 -1.389 v -1.388 c 0.0 -0.767 0.628 -1.39 1.4 -1.39 h 0.2 V 8.496 H 4.15 c -0.304 0.0 -0.55 0.245 -0.55 0.546 v 1.041 h 0.2 c 0.773 0.0 1.4 0.623 1.4 1.39 v 1.388 c 0.0 0.767 -0.627 1.389 -1.4 1.389 H 2.4 c -0.773 0.0 -1.4 -0.622 -1.4 -1.389 v -1.388 c 0.0 -0.767 0.627 -1.39 1.4 -1.39 h 0.2 V 9.042 c 0.0 -0.85 0.693 -1.538 1.55 -1.538 H 7.5 V 5.917 H 7.3 c -0.772 0.0 -1.4 -0.623 -1.4 -1.39 V 3.14 c 0.0 -0.767 0.628 -1.389 1.4 -1.389 h 1.4 Z")
        )
    }.build()
}
