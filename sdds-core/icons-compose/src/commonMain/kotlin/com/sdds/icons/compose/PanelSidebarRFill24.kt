package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PanelSidebarRFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PanelSidebarRFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.08 4.0 c 0.535 0.0 0.98 0.0 1.345 0.03 c 0.38 0.03 0.736 0.098 1.073 0.27 c 0.518 0.263 0.939 0.684 1.202 1.202 c 0.172 0.337 0.24 0.693 0.27 1.073 C 22.0 6.94 22.0 7.385 22.0 7.92 v 8.16 c 0.0 0.535 0.0 0.98 -0.03 1.345 c -0.03 0.38 -0.098 0.736 -0.27 1.073 c -0.263 0.518 -0.684 0.939 -1.201 1.202 c -0.338 0.172 -0.694 0.24 -1.074 0.27 C 19.06 20.0 18.615 20.0 18.08 20.0 H 5.92 c -0.535 0.0 -0.98 0.0 -1.345 -0.03 c -0.38 -0.03 -0.736 -0.098 -1.073 -0.27 C 2.984 19.437 2.563 19.016 2.3 18.5 c -0.172 -0.338 -0.24 -0.694 -0.27 -1.074 C 2.0 17.06 2.0 16.615 2.0 16.08 V 7.92 c 0.0 -0.535 0.0 -0.98 0.03 -1.345 c 0.03 -0.38 0.098 -0.736 0.27 -1.073 C 2.563 4.984 2.984 4.563 3.502 4.3 c 0.337 -0.172 0.693 -0.24 1.073 -0.27 C 4.94 4.0 5.385 4.0 5.92 4.0 h 12.16 Z M 15.0 18.5 v -13.0 H 5.95 c -0.572 0.0 -0.957 0.0 -1.253 0.025 C 4.41 5.548 4.273 5.59 4.183 5.636 c -0.236 0.12 -0.427 0.311 -0.547 0.547 C 3.59 6.273 3.548 6.41 3.525 6.697 C 3.5 6.993 3.5 7.377 3.5 7.95 v 8.1 c 0.0 0.572 0.0 0.957 0.025 1.252 c 0.023 0.288 0.065 0.425 0.111 0.515 c 0.12 0.236 0.311 0.427 0.547 0.547 c 0.09 0.046 0.227 0.088 0.514 0.111 C 4.993 18.5 5.377 18.5 5.95 18.5 H 15.0 Z")
        )
    }.build()
}
