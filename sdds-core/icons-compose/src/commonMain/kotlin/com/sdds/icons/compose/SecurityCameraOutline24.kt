package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SecurityCameraOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SecurityCameraOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 6.0 7.75 C 6.0 7.336 6.336 7.0 6.75 7.0 h 3.5 C 10.664 7.0 11.0 7.336 11.0 7.75 S 10.664 8.5 10.25 8.5 h -3.5 C 6.336 8.5 6.0 8.164 6.0 7.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.255 4.003 c -1.243 0.0 -2.25 1.007 -2.25 2.25 v 5.497 c 0.0 1.243 1.007 2.25 2.25 2.25 h 5.995 v 2.004 c 0.0 0.414 -0.336 0.75 -0.75 0.75 h -7.0 V 15.75 C 3.5 15.336 3.164 15.0 2.75 15.0 S 2.0 15.336 2.0 15.75 v 3.5 C 2.0 19.664 2.336 20.0 2.75 20.0 s 0.75 -0.336 0.75 -0.75 v -0.996 h 7.0 c 1.243 0.0 2.25 -1.007 2.25 -2.25 V 14.0 h 4.0 c 1.243 0.0 2.25 -1.007 2.25 -2.25 V 6.253 c 0.0 -1.243 -1.007 -2.25 -2.25 -2.25 H 5.255 Z m -0.75 2.25 c 0.0 -0.414 0.335 -0.75 0.75 -0.75 H 16.75 c 0.414 0.0 0.75 0.336 0.75 0.75 v 5.497 c 0.0 0.414 -0.336 0.75 -0.75 0.75 H 5.255 c -0.415 0.0 -0.75 -0.336 -0.75 -0.75 V 6.253 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 22.001 6.75 c 0.0 -0.26 -0.134 -0.5 -0.355 -0.638 c -0.22 -0.136 -0.497 -0.149 -0.73 -0.033 l -0.5 0.25 C 20.16 6.456 20.0 6.716 20.0 7.0 v 4.0 c 0.0 0.285 0.161 0.545 0.416 0.671 l 0.501 0.25 c 0.232 0.116 0.508 0.103 0.73 -0.034 C 21.866 11.752 22.0 11.51 22.0 11.25 v -4.5 Z")
        )
    }.build()
}
