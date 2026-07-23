package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinDashFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinDashFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.731 18.284 c 1.26 1.728 0.08 4.216 -1.998 4.216 h -5.248 v 8.25 L 18.0 33.0 l -1.485 -2.25 v -7.849 l 7.856 -7.855 l 2.36 3.238 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.749 4.08 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.707 30.95 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 L 29.749 4.08 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.484 3.0 c 1.104 0.0 1.946 1.032 1.772 2.17 l -0.972 5.375 L 11.31 22.52 c -2.079 0.0 -3.3 -2.508 -2.042 -4.236 l 3.053 -4.187 c 0.417 -0.572 0.591 -1.297 0.483 -2.006 l -1.06 -6.92 C 11.57 4.03 12.411 3.0 13.515 3.0 h 8.97 Z")
        )
    }.build()
}
