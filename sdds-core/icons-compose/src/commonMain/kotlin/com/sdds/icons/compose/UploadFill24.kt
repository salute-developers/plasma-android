package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.UploadFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "UploadFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.92 2.12 h 12.16 c 0.535 0.0 0.98 0.0 1.345 0.03 c 0.38 0.03 0.736 0.098 1.073 0.27 c 0.518 0.264 0.939 0.684 1.202 1.202 c 0.172 0.337 0.24 0.694 0.27 1.073 C 22.0 5.06 22.0 5.505 22.0 6.04 v 8.16 c 0.0 0.535 0.0 0.98 -0.03 1.345 c -0.03 0.38 -0.098 0.736 -0.27 1.074 c -0.263 0.517 -0.684 0.938 -1.201 1.201 c -0.338 0.172 -0.694 0.24 -1.074 0.27 c -0.365 0.03 -0.81 0.03 -1.345 0.03 H 5.92 c -0.535 0.0 -0.98 0.0 -1.345 -0.03 c -0.38 -0.03 -0.736 -0.098 -1.073 -0.27 c -0.518 -0.263 -0.939 -0.684 -1.202 -1.201 c -0.172 -0.338 -0.24 -0.694 -0.27 -1.074 C 2.0 15.18 2.0 14.735 2.0 14.2 V 6.04 c 0.0 -0.534 0.0 -0.98 0.03 -1.345 c 0.03 -0.38 0.098 -0.736 0.27 -1.073 c 0.263 -0.518 0.684 -0.938 1.202 -1.202 c 0.337 -0.172 0.693 -0.24 1.073 -0.27 c 0.365 -0.03 0.81 -0.03 1.345 -0.03 Z m 5.55 6.47 c 0.293 -0.293 0.767 -0.293 1.06 0.0 l 3.0 3.0 c 0.293 0.293 0.293 0.768 0.0 1.06 c -0.293 0.293 -0.767 0.293 -1.06 0.0 l -1.72 -1.72 v 10.19 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 10.93 l -1.72 1.72 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 l 3.0 -3.0 Z")
        )
    }.build()
}
