package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageTranscriptionOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageTranscriptionOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.702 5.058 c 0.0 -0.276 -0.223 -0.5 -0.5 -0.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 6.079 c 0.0 0.276 0.224 0.5 0.5 0.5 c 0.277 0.0 0.5 -0.224 0.5 -0.5 V 5.058 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.98 6.73 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 2.735 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 6.73 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.921 6.23 c 0.277 0.0 0.5 0.224 0.5 0.5 v 2.735 c 0.0 0.276 -0.223 0.5 -0.5 0.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 V 6.73 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.053 1.975 c -3.298 0.0 -5.971 2.673 -5.971 5.97 c 0.0 0.716 0.126 1.403 0.357 2.04 c 0.131 0.36 0.167 0.71 0.081 1.015 l -0.51 1.821 c -0.199 0.71 0.456 1.366 1.167 1.167 l 1.82 -0.51 c 0.306 -0.086 0.656 -0.05 1.017 0.08 c 0.636 0.232 1.323 0.358 2.039 0.358 c 3.297 0.0 5.97 -2.673 5.97 -5.97 c 0.0 -3.298 -2.673 -5.971 -5.97 -5.971 Z m -4.971 5.97 c 0.0 -2.745 2.225 -4.97 4.97 -4.97 c 2.746 0.0 4.972 2.225 4.972 4.97 c 0.0 2.746 -2.226 4.971 -4.971 4.971 c -0.597 0.0 -1.169 -0.105 -1.698 -0.297 c -0.49 -0.178 -1.061 -0.263 -1.627 -0.104 L 3.0 12.999 l 0.484 -1.73 c 0.159 -0.565 0.074 -1.137 -0.104 -1.626 c -0.192 -0.529 -0.297 -1.1 -0.297 -1.698 Z")
        )
    }.build()
}
