package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PanelSidebarRFocusFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PanelSidebarRFocusFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.92 4.0 h 12.16 c 0.535 0.0 0.98 0.0 1.345 0.03 c 0.38 0.03 0.736 0.098 1.073 0.27 c 0.518 0.263 0.939 0.684 1.202 1.202 c 0.172 0.337 0.24 0.693 0.27 1.073 C 22.0 6.94 22.0 7.385 22.0 7.92 v 8.161 c 0.0 0.535 0.0 0.98 -0.03 1.345 c -0.03 0.38 -0.098 0.736 -0.27 1.073 c -0.263 0.518 -0.684 0.939 -1.201 1.202 c -0.338 0.172 -0.694 0.24 -1.074 0.27 C 19.06 20.0 18.615 20.0 18.08 20.0 H 5.92 c -0.535 0.0 -0.98 0.0 -1.345 -0.03 c -0.38 -0.03 -0.736 -0.098 -1.073 -0.27 C 2.984 19.437 2.563 19.016 2.3 18.5 c -0.172 -0.338 -0.24 -0.694 -0.27 -1.074 C 2.0 17.06 2.0 16.615 2.0 16.08 V 7.92 c 0.0 -0.535 0.0 -0.98 0.03 -1.345 c 0.03 -0.38 0.098 -0.736 0.27 -1.073 C 2.563 4.984 2.984 4.563 3.502 4.3 c 0.337 -0.172 0.693 -0.24 1.073 -0.27 C 4.94 4.0 5.385 4.0 5.92 4.0 Z M 17.0 5.5 c -0.828 0.0 -1.5 0.672 -1.5 1.5 v 10.0 c 0.0 0.828 0.672 1.5 1.5 1.5 h 2.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 V 7.0 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 h -2.0 Z")
        )
    }.build()
}
