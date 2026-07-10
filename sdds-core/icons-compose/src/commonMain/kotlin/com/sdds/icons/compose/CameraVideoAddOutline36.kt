package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoAddOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoAddOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.138 11.0 h 12.414 c 1.18 0.0 2.138 0.957 2.138 2.138 v 9.724 c 0.0 1.18 -0.957 2.138 -2.138 2.138 h -0.164 c 0.074 0.49 0.112 0.99 0.112 1.5 c 0.0 0.168 -0.004 0.334 -0.012 0.5 h 0.064 c 2.285 0.0 4.138 -1.853 4.138 -4.138 v -9.724 C 23.69 10.853 21.837 9.0 19.552 9.0 H 7.138 C 4.853 9.0 3.0 10.853 3.0 13.138 V 18.9 c 0.608 -0.52 1.279 -0.969 2.0 -1.333 v -4.43 C 5.0 11.958 5.957 11.0 7.138 11.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 33.0 13.199 c 0.0 -1.273 -1.538 -1.91 -2.438 -1.01 l -4.839 4.838 c -0.543 0.543 -0.56 1.419 -0.037 1.982 l 4.838 5.215 C 31.409 25.176 33.0 24.551 33.0 23.253 V 13.199 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 26.5 c 0.0 4.694 -3.806 8.5 -8.5 8.5 S 1.0 31.194 1.0 26.5 S 4.806 18.0 9.5 18.0 s 8.5 3.806 8.5 8.5 Z m -8.5 -5.386 c 0.414 0.0 0.75 0.335 0.75 0.75 v 3.886 h 3.886 c 0.415 0.0 0.75 0.336 0.75 0.75 s -0.335 0.75 -0.75 0.75 H 10.25 v 3.886 c 0.0 0.415 -0.336 0.75 -0.75 0.75 s -0.75 -0.335 -0.75 -0.75 V 27.25 H 4.864 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 H 8.75 v -3.886 c 0.0 -0.415 0.336 -0.75 0.75 -0.75 Z")
        )
    }.build()
}
