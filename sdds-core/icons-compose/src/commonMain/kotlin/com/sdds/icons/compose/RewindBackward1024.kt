package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RewindBackward1024: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RewindBackward1024",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 20.5 c 4.694 0.0 8.5 -3.806 8.5 -8.5 c 0.0 -3.105 -1.665 -5.822 -4.153 -7.306 v 1.653 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 2.75 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 3.597 c 0.415 0.0 0.75 0.336 0.75 0.75 S 19.61 3.5 19.194 3.5 H 17.27 C 20.11 5.264 22.0 8.41 22.0 12.0 c 0.0 5.523 -4.477 10.0 -10.0 10.0 S 2.0 17.523 2.0 12.0 c 0.0 -4.145 2.521 -7.699 6.11 -9.215 c 0.382 -0.162 0.822 0.017 0.984 0.399 c 0.16 0.381 -0.018 0.821 -0.4 0.982 C 5.642 5.456 3.5 8.48 3.5 12.0 c 0.0 4.694 3.806 8.5 8.5 8.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.5 10.5 c 0.0 -0.966 0.784 -1.75 1.75 -1.75 h 1.5 c 0.967 0.0 1.75 0.784 1.75 1.75 v 4.0 c 0.0 0.966 -0.783 1.75 -1.75 1.75 h -1.5 c -0.966 0.0 -1.75 -0.784 -1.75 -1.75 v -4.0 Z m 1.75 -0.25 c -0.138 0.0 -0.25 0.112 -0.25 0.25 v 4.0 c 0.0 0.138 0.112 0.25 0.25 0.25 h 1.5 c 0.138 0.0 0.25 -0.112 0.25 -0.25 v -4.0 c 0.0 -0.138 -0.112 -0.25 -0.25 -0.25 h -1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.145 8.862 C 10.365 8.999 10.5 9.24 10.5 9.5 v 6.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 9.0 15.914 9.0 15.5 v -4.787 l -0.914 0.458 c -0.37 0.185 -0.821 0.035 -1.007 -0.336 c -0.185 -0.37 -0.035 -0.82 0.336 -1.006 l 2.0 -1.0 c 0.232 -0.116 0.508 -0.104 0.73 0.033 Z")
        )
    }.build()
}
