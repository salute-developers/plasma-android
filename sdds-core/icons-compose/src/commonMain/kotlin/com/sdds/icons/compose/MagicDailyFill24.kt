package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MagicDailyFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MagicDailyFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.75 c -1.795 0.0 -3.25 1.455 -3.25 3.25 h -5.0 C 3.336 6.0 3.0 6.336 3.0 6.75 S 3.336 7.5 3.75 7.5 H 5.0 v 6.781 c 0.0 0.674 0.0 1.224 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 8.494 19.0 9.045 19.0 9.718 19.0 h 4.563 c 0.674 0.0 1.224 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 19.0 15.506 19.0 14.955 19.0 14.282 V 7.5 h 1.25 C 20.664 7.5 21.0 7.164 21.0 6.75 S 20.664 6.0 20.25 6.0 h -5.0 c 0.0 -1.795 -1.455 -3.25 -3.25 -3.25 Z m 0.0 1.5 c -0.966 0.0 -1.75 0.784 -1.75 1.75 h 3.5 c 0.0 -0.966 -0.784 -1.75 -1.75 -1.75 Z M 8.47 9.47 c 0.293 -0.293 0.767 -0.293 1.06 0.0 l 2.5 2.5 c 0.293 0.293 0.293 0.767 0.0 1.06 l -2.5 2.5 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 1.97 -1.97 l -1.97 -1.97 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 Z m 4.0 0.0 c 0.293 -0.293 0.767 -0.293 1.06 0.0 l 2.5 2.5 c 0.293 0.293 0.293 0.767 0.0 1.06 l -2.5 2.5 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 1.97 -1.97 l -1.97 -1.97 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.5 15.75 C 3.5 15.336 3.164 15.0 2.75 15.0 S 2.0 15.336 2.0 15.75 C 2.0 19.202 4.798 22.0 8.25 22.0 h 7.5 c 3.452 0.0 6.25 -2.798 6.25 -6.25 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 c 0.0 2.623 -2.127 4.75 -4.75 4.75 h -7.5 c -2.623 0.0 -4.75 -2.127 -4.75 -4.75 Z")
        )
    }.build()
}
