package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoOffFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoOffFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.53 4.53 c 0.293 -0.292 0.293 -0.767 0.0 -1.06 c -0.292 -0.293 -0.767 -0.293 -1.06 0.0 l -3.34 3.334 C 14.614 6.306 13.914 6.0 13.142 6.0 H 4.857 C 3.28 6.0 2.0 7.28 2.0 8.857 v 6.286 c 0.0 1.291 0.857 2.383 2.033 2.736 L 2.47 19.44 c -0.293 0.293 -0.293 0.768 0.0 1.061 c 0.292 0.294 0.767 0.294 1.06 0.001 l 16.0 -15.97 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.143 18.0 h -4.99 L 16.0 10.154 v 4.989 C 16.0 16.72 14.72 18.0 13.143 18.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.0 8.8 c 0.0 -0.85 -1.026 -1.274 -1.625 -0.674 l -3.226 3.226 c -0.362 0.362 -0.373 0.945 -0.025 1.32 l 3.226 3.478 c 0.589 0.634 1.65 0.218 1.65 -0.648 V 8.799 Z")
        )
    }.build()
}
