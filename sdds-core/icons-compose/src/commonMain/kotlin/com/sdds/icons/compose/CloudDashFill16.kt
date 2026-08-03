package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudDashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudDashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.525 1.646 c 0.196 -0.195 0.513 -0.195 0.708 0.0 c 0.195 0.196 0.195 0.512 0.0 0.707 l -11.88 11.88 c -0.195 0.195 -0.511 0.195 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.708 l 0.881 -0.882 C 1.597 11.92 1.0 10.803 1.0 9.547 c 0.0 -1.845 1.286 -3.394 3.026 -3.83 C 4.64 3.85 6.421 2.5 8.526 2.5 c 1.162 0.0 2.225 0.413 3.048 1.097 l 1.951 -1.95 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.81 5.184 c 0.282 0.594 0.44 1.257 0.44 1.957 c 0.0 0.162 -0.009 0.323 -0.025 0.481 C 14.275 8.123 15.0 9.182 15.0 10.406 c 0.0 1.709 -1.41 3.094 -3.15 3.094 H 5.025 c -0.169 0.0 -0.336 -0.01 -0.5 -0.03 l 8.285 -8.286 Z")
        )
    }.build()
}
