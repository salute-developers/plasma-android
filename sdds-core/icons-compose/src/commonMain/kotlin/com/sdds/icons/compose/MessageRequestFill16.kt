package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageRequestFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageRequestFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.159 7.675 h 5.32 L 6.086 6.283 c -0.166 -0.166 -0.166 -0.435 0.0 -0.601 c 0.166 -0.166 0.435 -0.166 0.6 0.0 l 2.118 2.117 c 0.166 0.166 0.166 0.435 0.0 0.601 l -2.117 2.118 c -0.166 0.166 -0.435 0.166 -0.601 0.0 c -0.166 -0.166 -0.166 -0.436 0.0 -0.601 l 1.391 -1.392 H 2.18 c 0.048 0.494 0.157 0.97 0.32 1.423 c 0.135 0.375 0.174 0.743 0.083 1.067 l -0.499 1.782 c -0.19 0.681 0.438 1.31 1.119 1.118 l 1.782 -0.498 c 0.324 -0.091 0.692 -0.052 1.067 0.083 c 0.625 0.225 1.298 0.347 2.0 0.347 c 3.257 0.0 5.898 -2.64 5.898 -5.898 c 0.0 -3.258 -2.641 -5.899 -5.899 -5.899 c -3.166 0.0 -5.749 2.494 -5.892 5.625 Z")
        )
    }.build()
}
