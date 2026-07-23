package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoAddFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoAddFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.0 13.286 C 3.0 10.919 4.919 9.0 7.286 9.0 h 12.429 C 22.08 9.0 24.0 10.919 24.0 13.286 v 9.428 C 24.0 25.081 22.081 27.0 19.715 27.0 h -0.227 c 0.008 -0.166 0.012 -0.332 0.012 -0.5 c 0.0 -5.523 -4.477 -10.0 -10.0 -10.0 c -2.482 0.0 -4.752 0.904 -6.5 2.4 v -5.614 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.561 12.189 c 0.9 -0.9 2.44 -0.263 2.44 1.01 v 10.054 c 0.0 1.298 -1.593 1.923 -2.477 0.971 l -4.838 -5.215 c -0.523 -0.563 -0.506 -1.439 0.037 -1.982 l 4.838 -4.838 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.5 35.0 c 4.694 0.0 8.5 -3.806 8.5 -8.5 S 14.194 18.0 9.5 18.0 S 1.0 21.806 1.0 26.5 S 4.806 35.0 9.5 35.0 Z m 0.75 -13.136 c 0.0 -0.415 -0.336 -0.75 -0.75 -0.75 s -0.75 0.335 -0.75 0.75 v 3.886 H 4.864 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 H 8.75 v 3.886 c 0.0 0.415 0.336 0.75 0.75 0.75 s 0.75 -0.335 0.75 -0.75 V 27.25 h 3.886 c 0.415 0.0 0.75 -0.336 0.75 -0.75 s -0.335 -0.75 -0.75 -0.75 H 10.25 v -3.886 Z")
        )
    }.build()
}
