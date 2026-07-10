package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlashDriveOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlashDriveOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.547 3.0 c -1.38 0.0 -2.5 1.12 -2.5 2.5 v 5.074 C 10.347 10.678 9.0 12.09 9.0 13.818 v 15.931 C 9.0 31.544 10.455 33.0 12.25 33.0 h 11.497 c 1.795 0.0 3.25 -1.455 3.25 -3.25 V 13.818 c 0.0 -1.727 -1.347 -3.14 -3.047 -3.244 V 5.5 c 0.0 -1.38 -1.12 -2.5 -2.5 -2.5 h -6.903 Z m 7.403 7.568 V 5.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -6.903 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 5.068 h 7.903 Z m 3.047 19.181 c 0.0 0.69 -0.56 1.25 -1.25 1.25 H 12.25 C 11.56 31.0 11.0 30.44 11.0 29.75 V 13.818 c 0.0 -0.69 0.56 -1.25 1.25 -1.25 h 11.497 c 0.69 0.0 1.25 0.56 1.25 1.25 v 15.931 Z")
        )
    }.build()
}
