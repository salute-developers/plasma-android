package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SecurityCameraFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SecurityCameraFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.25 4.0 C 4.007 4.0 3.0 5.007 3.0 6.25 v 5.5 C 3.0 12.993 4.007 14.0 5.25 14.0 h 6.0 v 2.004 c 0.0 0.414 -0.336 0.75 -0.75 0.75 h -7.0 V 15.75 C 3.5 15.336 3.164 15.0 2.75 15.0 S 2.0 15.336 2.0 15.75 v 3.5 C 2.0 19.664 2.336 20.0 2.75 20.0 s 0.75 -0.336 0.75 -0.75 v -0.996 h 7.0 c 1.243 0.0 2.25 -1.007 2.25 -2.25 V 14.0 h 4.0 c 1.243 0.0 2.25 -1.007 2.25 -2.25 v -5.5 C 19.0 5.007 17.993 4.0 16.75 4.0 H 5.25 Z m 1.5 3.0 C 6.336 7.0 6.0 7.336 6.0 7.75 S 6.336 8.5 6.75 8.5 h 3.5 C 10.664 8.5 11.0 8.164 11.0 7.75 S 10.664 7.0 10.25 7.0 h -3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 21.646 6.112 c 0.221 0.137 0.355 0.378 0.355 0.638 v 4.5 c 0.0 0.26 -0.134 0.5 -0.355 0.637 c -0.22 0.137 -0.497 0.15 -0.729 0.034 l -0.501 -0.25 C 20.16 11.544 20.0 11.285 20.0 11.0 V 7.0 c 0.0 -0.284 0.16 -0.544 0.415 -0.671 l 0.502 -0.25 c 0.232 -0.116 0.508 -0.103 0.73 0.033 Z")
        )
    }.build()
}
