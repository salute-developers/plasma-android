package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AdjustWidth24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AdjustWidth24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.25 12.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 3.957 l -1.479 -1.43 c -0.297 -0.289 -0.305 -0.763 -0.017 -1.061 c 0.288 -0.298 0.763 -0.306 1.06 -0.019 l 2.813 2.72 c 0.146 0.142 0.229 0.337 0.229 0.54 s -0.083 0.398 -0.229 0.54 l -2.813 2.716 l -0.058 0.05 c -0.299 0.236 -0.732 0.211 -1.002 -0.068 c -0.288 -0.297 -0.28 -0.772 0.018 -1.06 l 1.476 -1.428 H 15.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.25 6.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 S 12.75 5.586 12.75 6.0 v 12.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.438 12.0 c 0.0 -0.203 0.082 -0.398 0.228 -0.54 l 2.813 -2.72 C 5.776 8.453 6.25 8.461 6.539 8.76 c 0.288 0.298 0.28 0.772 -0.018 1.06 L 5.043 11.25 H 9.0 c 0.414 0.0 0.75 0.336 0.75 0.75 S 9.414 12.75 9.0 12.75 H 5.045 l 1.476 1.428 c 0.298 0.287 0.306 0.762 0.018 1.06 c -0.27 0.28 -0.703 0.303 -1.002 0.069 L 5.48 15.256 l -2.813 -2.717 C 2.52 12.398 2.438 12.203 2.438 12.0 Z")
        )
    }.build()
}
