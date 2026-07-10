package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ResetOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ResetOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 12.0 2.0 C 8.41 2.0 5.264 3.891 3.5 6.73 V 4.806 c 0.0 -0.415 -0.336 -0.75 -0.75 -0.75 S 2.0 4.39 2.0 4.806 v 3.597 c 0.0 0.414 0.336 0.75 0.75 0.75 h 0.708 h 0.034 h 2.855 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 4.694 C 6.178 5.165 8.895 3.5 12.0 3.5 c 4.694 0.0 8.5 3.806 8.5 8.5 s -3.806 8.5 -8.5 8.5 c -3.52 0.0 -6.543 -2.14 -7.834 -5.195 c -0.16 -0.381 -0.6 -0.56 -0.982 -0.399 c -0.382 0.162 -0.56 0.602 -0.4 0.983 C 4.302 19.48 7.856 22.0 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 12.0 14.0 c 1.105 0.0 2.0 -0.895 2.0 -2.0 s -0.895 -2.0 -2.0 -2.0 s -2.0 0.895 -2.0 2.0 s 0.895 2.0 2.0 2.0 Z")
        )
    }.build()
}
