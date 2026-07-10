package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ResizeCorneredFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ResizeCorneredFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.375 3.602 c 1.118 0.0 2.025 0.907 2.025 2.025 c 0.0 14.787 -11.988 26.775 -26.775 26.775 c -1.118 0.0 -2.025 -0.907 -2.025 -2.025 c 0.0 -1.118 0.907 -2.025 2.025 -2.025 c 12.55 0.0 22.725 -10.174 22.725 -22.725 c 0.0 -1.118 0.907 -2.025 2.025 -2.025 Z")
        )
    }.build()
}
