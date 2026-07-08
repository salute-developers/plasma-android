package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WatchRoundFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WatchRoundFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.188 3.0 c -1.218 0.0 -2.276 0.838 -2.555 2.024 l -1.228 5.218 l 0.015 0.004 C 8.318 12.166 7.0 14.929 7.0 18.0 c 0.0 3.071 1.318 5.834 3.42 7.754 l -0.015 0.004 l 1.228 5.218 C 11.912 32.162 12.97 33.0 14.188 33.0 h 6.624 c 1.218 0.0 2.276 -0.838 2.555 -2.024 l 1.228 -5.218 l -0.015 -0.004 c 1.573 -1.437 2.707 -3.347 3.178 -5.504 h 1.367 c 0.207 0.0 0.375 -0.168 0.375 -0.375 v -3.75 c 0.0 -0.207 -0.168 -0.375 -0.375 -0.375 h -1.367 c -0.47 -2.157 -1.605 -4.067 -3.178 -5.504 l 0.015 -0.004 l -1.228 -5.218 C 23.088 3.838 22.03 3.0 20.812 3.0 h -6.624 Z M 17.5 9.75 c -4.556 0.0 -8.25 3.694 -8.25 8.25 s 3.694 8.25 8.25 8.25 s 8.25 -3.694 8.25 -8.25 s -3.694 -8.25 -8.25 -8.25 Z")
        )
    }.build()
}
