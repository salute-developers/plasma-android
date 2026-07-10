package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.952 7.85 c 1.643 0.0 2.975 -1.332 2.975 -2.975 S 9.595 1.9 7.952 1.9 S 4.977 3.232 4.977 4.875 S 6.309 7.85 7.952 7.85 Z m 5.948 4.334 c 0.013 -0.404 -0.164 -0.793 -0.485 -1.04 C 11.857 9.95 9.975 9.25 7.95 9.25 s -3.905 0.698 -5.464 1.894 c -0.32 0.246 -0.497 0.635 -0.485 1.04 c 0.015 0.461 0.057 0.761 0.184 1.01 c 0.168 0.33 0.435 0.597 0.765 0.765 c 0.374 0.191 0.864 0.191 1.844 0.191 h 6.313 c 0.98 0.0 1.47 0.0 1.845 -0.19 c 0.33 -0.169 0.597 -0.436 0.765 -0.766 c 0.126 -0.249 0.169 -0.549 0.183 -1.01 Z")
        )
    }.build()
}
