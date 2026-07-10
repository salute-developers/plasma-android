package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinPoundFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinPoundFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.3 8.3 c 0.0 1.295 -0.39 2.499 -1.06 3.5 h -1.482 c 0.027 -0.061 0.042 -0.129 0.042 -0.2 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 9.28 V 9.188 h 1.81 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 9.28 V 6.5 h 1.81 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 8.78 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 5.53 c 0.0 0.098 0.025 0.19 0.068 0.27 h -0.37 c 0.027 -0.061 0.042 -0.129 0.042 -0.2 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 5.5 V 6.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 S 4.5 5.724 4.5 6.0 v 5.53 c 0.0 0.098 0.025 0.19 0.068 0.27 H 2.762 C 2.092 10.799 1.7 9.595 1.7 8.3 C 1.7 4.82 4.52 2.0 8.0 2.0 s 6.3 2.82 6.3 6.3 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.525 12.85 C 1.235 12.85 1.0 13.085 1.0 13.375 c 0.0 0.29 0.235 0.525 0.525 0.525 h 12.95 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 1.525 Z")
        )
    }.build()
}
