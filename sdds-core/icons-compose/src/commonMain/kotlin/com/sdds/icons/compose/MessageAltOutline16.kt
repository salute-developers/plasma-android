package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageAltOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageAltOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.052 8.661 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 5.316 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 2.736 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.787 6.534 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -5.47 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 s 0.223 -0.5 0.5 -0.5 h 5.47 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.053 1.975 c 3.297 0.0 5.971 2.673 5.971 5.97 c 0.0 3.298 -2.674 5.971 -5.971 5.971 c -0.715 0.0 -1.403 -0.126 -2.04 -0.357 c -0.36 -0.131 -0.71 -0.167 -1.015 -0.082 l -1.821 0.51 c -0.71 0.199 -1.365 -0.455 -1.166 -1.166 L 2.52 11.0 c 0.085 -0.305 0.05 -0.655 -0.082 -1.016 C 2.21 9.348 2.082 8.66 2.082 7.945 c 0.0 -3.297 2.673 -5.97 5.97 -5.97 Z m 0.0 1.0 c -2.745 0.0 -4.97 2.225 -4.97 4.97 c 0.0 0.597 0.105 1.169 0.297 1.698 c 0.178 0.489 0.262 1.06 0.103 1.627 L 3.0 12.998 l 1.729 -0.484 c 0.565 -0.159 1.137 -0.074 1.627 0.104 c 0.528 0.192 1.1 0.297 1.697 0.297 c 2.745 0.0 4.971 -2.226 4.971 -4.97 c 0.0 -2.746 -2.226 -4.971 -4.971 -4.971 Z")
        )
    }.build()
}
