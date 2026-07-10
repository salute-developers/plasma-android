package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Sum16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Sum16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.722 3.193 C 3.402 2.824 3.665 2.25 4.153 2.25 h 7.477 c 0.315 0.0 0.57 0.255 0.57 0.57 v 0.755 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 3.25 H 5.802 L 9.27 7.663 C 9.43 7.838 9.447 8.11 9.296 8.305 l -3.42 4.445 H 11.2 v -0.325 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 v 0.755 c 0.0 0.315 -0.255 0.57 -0.57 0.57 H 4.153 c -0.488 0.0 -0.75 -0.574 -0.43 -0.943 L 7.887 8.0 L 3.722 3.193 Z")
        )
    }.build()
}
