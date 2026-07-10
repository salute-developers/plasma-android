package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MailPlusFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MailPlusFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.277 6.0 h 13.446 c 1.22 0.0 2.203 0.0 3.0 0.065 c 0.82 0.067 1.54 0.209 2.206 0.548 c 1.058 0.54 1.919 1.4 2.458 2.458 c 0.34 0.667 0.481 1.387 0.548 2.207 C 33.0 12.074 33.0 13.058 33.0 14.277 V 18.9 c -1.748 -1.496 -4.018 -2.4 -6.5 -2.4 c -5.523 0.0 -10.0 4.477 -10.0 10.0 c 0.0 1.231 0.223 2.41 0.63 3.5 h -5.853 c -1.22 0.0 -2.203 0.0 -3.0 -0.065 c -0.82 -0.067 -1.54 -0.209 -2.206 -0.548 c -1.058 -0.54 -1.919 -1.4 -2.458 -2.458 c -0.34 -0.667 -0.481 -1.387 -0.548 -2.207 C 3.0 23.926 3.0 22.942 3.0 21.723 v -7.446 c 0.0 -1.22 0.0 -2.203 0.065 -3.0 c 0.067 -0.82 0.209 -1.54 0.548 -2.206 c 0.54 -1.058 1.4 -1.919 2.458 -2.458 c 0.667 -0.34 1.387 -0.481 2.207 -0.548 C 9.074 6.0 10.058 6.0 11.277 6.0 Z m -3.879 6.226 c 0.29 -0.47 0.906 -0.617 1.376 -0.328 l 7.392 4.549 c 1.125 0.692 2.543 0.692 3.668 0.0 l 7.392 -4.549 c 0.47 -0.29 1.086 -0.143 1.376 0.328 c 0.29 0.47 0.142 1.086 -0.328 1.376 l -7.392 4.548 c -1.767 1.088 -3.997 1.088 -5.765 0.0 l -7.391 -4.548 c -0.47 -0.29 -0.617 -0.906 -0.328 -1.376 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.5 35.0 c 4.694 0.0 8.5 -3.806 8.5 -8.5 S 31.194 18.0 26.5 18.0 S 18.0 21.806 18.0 26.5 s 3.806 8.5 8.5 8.5 Z m 0.75 -13.136 c 0.0 -0.415 -0.336 -0.75 -0.75 -0.75 s -0.75 0.335 -0.75 0.75 v 3.886 h -3.886 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 3.886 v 3.886 c 0.0 0.415 0.336 0.75 0.75 0.75 s 0.75 -0.335 0.75 -0.75 V 27.25 h 3.887 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 27.25 v -3.886 Z")
        )
    }.build()
}
