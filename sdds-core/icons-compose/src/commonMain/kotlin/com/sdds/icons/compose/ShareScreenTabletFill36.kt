package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShareScreenTabletFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShareScreenTabletFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.125 5.0 C 4.847 5.0 3.0 6.847 3.0 9.125 v 15.75 C 3.0 27.153 4.847 29.0 7.125 29.0 h 7.125 v -8.25 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 H 33.0 V 9.125 C 33.0 6.847 31.153 5.0 28.875 5.0 H 7.125 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.5 22.4 c 0.0 -0.84 0.0 -1.26 0.163 -1.581 c 0.144 -0.282 0.374 -0.512 0.656 -0.655 C 17.639 20.0 18.059 20.0 18.9 20.0 h 11.7 c 0.84 0.0 1.26 0.0 1.581 0.163 c 0.282 0.144 0.512 0.374 0.656 0.656 C 33.0 21.139 33.0 21.559 33.0 22.4 v 7.2 c 0.0 0.84 0.0 1.26 -0.163 1.581 c -0.144 0.282 -0.374 0.512 -0.656 0.655 C 31.861 32.0 31.441 32.0 30.6 32.0 H 18.9 c -0.84 0.0 -1.26 0.0 -1.581 -0.163 c -0.282 -0.144 -0.512 -0.374 -0.655 -0.656 c -0.164 -0.32 -0.164 -0.74 -0.164 -1.581 v -7.2 Z")
        )
    }.build()
}
