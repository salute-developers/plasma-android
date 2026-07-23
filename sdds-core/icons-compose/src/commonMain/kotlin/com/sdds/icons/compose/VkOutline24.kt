package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VkOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VkOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.022 8.377 c 0.07 3.53 1.61 5.025 2.832 5.334 V 8.377 h 1.97 v 3.045 c 1.205 -0.131 2.471 -1.519 2.899 -3.045 h 1.97 c -0.329 1.88 -1.703 3.268 -2.68 3.839 c 0.976 0.462 2.542 1.672 3.137 3.861 h -2.168 c -0.465 -1.464 -1.625 -2.597 -3.159 -2.75 v 2.75 h -0.237 c -4.175 0.0 -6.555 -2.89 -6.654 -7.7 h 2.09 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.365 2.75 c 4.145 0.0 6.217 0.0 7.504 1.3 c 1.288 1.301 1.288 3.394 1.288 7.58 v 0.74 c 0.0 4.186 0.0 6.279 -1.288 7.58 c -1.287 1.3 -3.36 1.3 -7.504 1.3 h -0.733 c -4.145 0.0 -6.217 0.0 -7.504 -1.3 c -1.288 -1.301 -1.288 -3.394 -1.288 -7.58 v -0.74 c 0.0 -4.186 0.0 -6.279 1.288 -7.58 c 1.287 -1.3 3.36 -1.3 7.504 -1.3 h 0.733 Z m -0.678 1.5 c -3.473 0.0 -5.21 0.0 -6.289 1.09 C 4.32 6.43 4.32 8.184 4.32 11.69 v 0.62 c 0.0 3.506 0.0 5.26 1.078 6.35 c 1.08 1.09 2.816 1.09 6.289 1.09 H 12.3 c 3.472 0.0 5.21 0.0 6.288 -1.09 c 1.078 -1.09 1.079 -2.843 1.079 -6.35 v -0.62 c 0.0 -3.507 0.0 -5.26 -1.08 -6.35 c -1.078 -1.09 -2.815 -1.09 -6.287 -1.09 h -0.614 Z")
        )
    }.build()
}
