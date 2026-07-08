package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShareScreenMobileFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShareScreenMobileFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.125 5.0 C 4.847 5.0 3.0 6.847 3.0 9.125 v 15.75 C 3.0 27.153 4.847 29.0 7.125 29.0 h 8.625 V 17.75 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 7.5 c 1.657 0.0 3.0 1.343 3.0 3.0 v 11.233 c 2.102 -0.19 3.75 -1.956 3.75 -4.108 V 9.125 C 33.0 6.847 31.153 5.0 28.875 5.0 H 7.125 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 19.4 c 0.0 -0.84 0.0 -1.26 0.163 -1.581 c 0.144 -0.282 0.374 -0.512 0.656 -0.655 C 19.139 17.0 19.559 17.0 20.4 17.0 h 4.2 c 0.84 0.0 1.26 0.0 1.581 0.163 c 0.282 0.144 0.512 0.374 0.655 0.656 C 27.0 18.139 27.0 18.559 27.0 19.4 v 10.2 c 0.0 0.84 0.0 1.26 -0.163 1.581 c -0.144 0.282 -0.374 0.512 -0.656 0.655 C 25.861 32.0 25.441 32.0 24.6 32.0 h -4.2 c -0.84 0.0 -1.26 0.0 -1.581 -0.163 c -0.282 -0.144 -0.512 -0.374 -0.655 -0.656 C 18.0 30.861 18.0 30.441 18.0 29.6 V 19.4 Z")
        )
    }.build()
}
