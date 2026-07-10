package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.857 6.0 C 3.28 6.0 2.0 7.28 2.0 8.857 v 6.286 C 2.0 16.72 3.28 18.0 4.857 18.0 h 8.286 C 14.72 18.0 16.0 16.72 16.0 15.143 V 8.857 C 16.0 7.28 14.72 6.0 13.143 6.0 H 4.857 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.0 8.8 c 0.0 -0.85 -1.026 -1.274 -1.625 -0.674 l -3.226 3.226 c -0.362 0.362 -0.373 0.945 -0.025 1.32 l 3.226 3.478 c 0.589 0.634 1.65 0.218 1.65 -0.648 V 8.799 Z")
        )
    }.build()
}
