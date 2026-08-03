package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageChatOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageChatOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.636 9.01 c 0.503 0.0 0.911 -0.409 0.911 -0.912 c 0.0 -0.504 -0.408 -0.912 -0.912 -0.912 c -0.503 0.0 -0.911 0.408 -0.911 0.912 c 0.0 0.503 0.408 0.912 0.912 0.912 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.811 8.098 C 8.811 8.6 8.403 9.01 7.9 9.01 c -0.504 0.0 -0.912 -0.409 -0.912 -0.912 c 0.0 -0.504 0.408 -0.912 0.912 -0.912 c 0.503 0.0 0.911 0.408 0.911 0.912 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.164 9.01 c 0.503 0.0 0.911 -0.409 0.911 -0.912 c 0.0 -0.504 -0.408 -0.912 -0.911 -0.912 c -0.504 0.0 -0.912 0.408 -0.912 0.912 C 4.252 8.6 4.66 9.01 5.164 9.01 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.053 1.975 c -3.298 0.0 -5.971 2.673 -5.971 5.97 c 0.0 0.716 0.126 1.403 0.357 2.04 c 0.131 0.36 0.167 0.71 0.081 1.015 l -0.51 1.821 c -0.199 0.71 0.456 1.366 1.167 1.167 l 1.82 -0.51 c 0.306 -0.086 0.656 -0.05 1.017 0.08 c 0.636 0.232 1.323 0.358 2.039 0.358 c 3.297 0.0 5.97 -2.673 5.97 -5.97 c 0.0 -3.298 -2.673 -5.971 -5.97 -5.971 Z m -4.971 5.97 c 0.0 -2.745 2.225 -4.97 4.97 -4.97 c 2.746 0.0 4.972 2.225 4.972 4.97 c 0.0 2.746 -2.226 4.971 -4.971 4.971 c -0.597 0.0 -1.169 -0.105 -1.698 -0.297 c -0.49 -0.178 -1.061 -0.263 -1.627 -0.104 L 3.0 12.999 l 0.484 -1.73 c 0.159 -0.565 0.074 -1.137 -0.104 -1.626 c -0.192 -0.529 -0.297 -1.1 -0.297 -1.698 Z")
        )
    }.build()
}
