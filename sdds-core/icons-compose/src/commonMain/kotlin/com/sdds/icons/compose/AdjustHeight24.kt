package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AdjustHeight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AdjustHeight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 14.25 c 0.414 0.0 0.75 0.336 0.75 0.75 v 3.957 l 1.43 -1.479 c 0.289 -0.297 0.764 -0.305 1.061 -0.017 c 0.298 0.288 0.306 0.763 0.019 1.06 l -2.72 2.813 c -0.142 0.146 -0.337 0.229 -0.54 0.229 s -0.398 -0.083 -0.54 -0.229 l -2.716 -2.813 l -0.05 -0.058 c -0.236 -0.299 -0.211 -0.732 0.068 -1.002 c 0.297 -0.288 0.772 -0.28 1.06 0.018 l 1.428 1.476 V 15.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 11.25 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 6.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 S 5.586 11.25 6.0 11.25 h 12.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 2.438 c 0.203 0.0 0.398 0.082 0.54 0.228 l 2.72 2.813 c 0.287 0.297 0.279 0.772 -0.019 1.06 c -0.297 0.288 -0.772 0.28 -1.06 -0.018 L 12.75 5.043 V 9.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 11.25 9.414 11.25 9.0 V 5.045 L 9.822 6.52 C 9.534 6.82 9.06 6.827 8.762 6.54 c -0.28 -0.27 -0.304 -0.703 -0.069 -1.002 L 8.744 5.48 l 2.717 -2.813 C 11.602 2.52 11.797 2.438 12.0 2.438 Z")
        )
    }.build()
}
