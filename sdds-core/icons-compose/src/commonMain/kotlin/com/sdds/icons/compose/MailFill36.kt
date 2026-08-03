package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MailFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MailFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 24.723 6.0 H 11.277 c -1.22 0.0 -2.203 0.0 -3.0 0.065 c -0.82 0.067 -1.54 0.209 -2.206 0.548 c -1.058 0.54 -1.919 1.4 -2.458 2.458 c -0.34 0.667 -0.481 1.387 -0.548 2.207 C 3.0 12.074 3.0 13.058 3.0 14.277 v 7.446 c 0.0 1.22 0.0 2.203 0.065 3.0 c 0.067 0.82 0.209 1.54 0.548 2.206 c 0.54 1.058 1.4 1.919 2.458 2.458 c 0.667 0.34 1.387 0.481 2.207 0.548 C 9.074 30.0 10.058 30.0 11.277 30.0 h 13.446 c 1.22 0.0 2.203 0.0 3.0 -0.065 c 0.82 -0.067 1.54 -0.209 2.206 -0.548 c 1.058 -0.54 1.919 -1.4 2.458 -2.458 c 0.34 -0.667 0.481 -1.387 0.548 -2.207 C 33.0 23.926 33.0 22.942 33.0 21.723 v -7.446 c 0.0 -1.22 0.0 -2.203 -0.065 -3.0 c -0.067 -0.82 -0.209 -1.54 -0.548 -2.206 c -0.54 -1.058 -1.4 -1.919 -2.458 -2.458 c -0.667 -0.34 -1.387 -0.481 -2.207 -0.548 C 26.926 6.0 25.942 6.0 24.723 6.0 Z M 8.774 11.898 c -0.47 -0.29 -1.086 -0.143 -1.376 0.328 c -0.29 0.47 -0.142 1.086 0.328 1.376 l 7.391 4.548 c 1.768 1.088 3.998 1.088 5.765 0.0 l 7.392 -4.548 c 0.47 -0.29 0.617 -0.906 0.328 -1.376 c -0.29 -0.47 -0.906 -0.617 -1.376 -0.328 l -7.392 4.549 c -1.125 0.692 -2.543 0.692 -3.668 0.0 l -7.392 -4.549 Z")
        )
    }.build()
}
