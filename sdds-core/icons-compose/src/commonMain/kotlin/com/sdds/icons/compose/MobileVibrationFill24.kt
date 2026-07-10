package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MobileVibrationFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MobileVibrationFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.0 5.25 C 7.0 4.007 8.007 3.0 9.25 3.0 h 5.5 C 15.992 3.0 17.0 4.007 17.0 5.25 v 13.5 c 0.0 1.243 -1.008 2.25 -2.25 2.25 h -5.5 C 8.007 21.0 7.0 19.993 7.0 18.75 V 5.25 Z m 3.0 1.0 c 0.0 -0.414 0.335 -0.75 0.75 -0.75 h 2.5 C 13.664 5.5 14.0 5.836 14.0 6.25 S 13.664 7.0 13.25 7.0 h -2.5 C 10.335 7.0 10.0 6.664 10.0 6.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.97 5.97 c -0.293 0.293 -0.293 0.767 0.0 1.06 L 3.94 8.0 L 2.681 9.258 c -0.41 0.41 -0.41 1.074 0.0 1.485 L 3.939 12.0 l -1.257 1.258 c -0.41 0.41 -0.41 1.074 0.0 1.485 L 3.939 16.0 l -0.97 0.97 c -0.292 0.293 -0.292 0.767 0.0 1.06 c 0.293 0.293 0.768 0.293 1.061 0.0 l 1.288 -1.288 c 0.41 -0.41 0.41 -1.074 0.0 -1.485 L 4.06 14.0 l 1.258 -1.258 c 0.41 -0.41 0.41 -1.074 0.0 -1.485 L 4.06 10.0 l 1.258 -1.258 c 0.41 -0.41 0.41 -1.074 0.0 -1.484 L 4.03 5.97 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.03 5.97 c 0.293 0.293 0.293 0.767 0.0 1.06 L 20.06 8.0 l 1.258 1.258 c 0.41 0.41 0.41 1.074 0.0 1.485 L 20.06 12.0 l 1.258 1.258 c 0.41 0.41 0.41 1.074 0.0 1.485 L 20.06 16.0 l 0.97 0.97 c 0.293 0.293 0.293 0.767 0.0 1.06 c -0.293 0.293 -0.768 0.293 -1.06 0.0 l -1.288 -1.288 c -0.41 -0.41 -0.41 -1.074 0.0 -1.485 L 19.939 14.0 l -1.257 -1.258 c -0.41 -0.41 -0.41 -1.074 0.0 -1.485 L 19.939 10.0 l -1.257 -1.258 c -0.41 -0.41 -0.41 -1.074 0.0 -1.484 l 1.287 -1.288 c 0.293 -0.293 0.768 -0.293 1.061 0.0 Z")
        )
    }.build()
}
