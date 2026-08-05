package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.KidsLockFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "KidsLockFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 11.0 c 2.005 0.0 3.797 0.908 4.99 2.334 C 22.807 12.98 23.0 12.513 23.0 12.0 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 c -0.075 0.0 -0.148 0.004 -0.22 0.012 C 19.875 5.998 16.287 3.0 12.0 3.0 c -4.287 0.0 -7.875 2.998 -8.78 7.012 C 3.148 10.004 3.074 10.0 3.0 10.0 c -1.105 0.0 -2.0 0.895 -2.0 2.0 s 0.895 2.0 2.0 2.0 c 0.074 0.0 0.148 -0.004 0.22 -0.012 C 4.125 18.002 7.713 21.0 12.0 21.0 h 0.022 C 11.375 19.99 11.0 18.789 11.0 17.5 c 0.0 -1.512 0.517 -2.904 1.383 -4.008 c -0.155 0.012 -0.31 0.017 -0.466 0.014 c -0.651 -0.011 -1.293 -0.153 -1.888 -0.418 c -0.595 -0.264 -1.13 -0.646 -1.575 -1.122 l 1.243 -1.16 c 0.289 0.31 0.637 0.557 1.023 0.729 c 0.386 0.172 0.803 0.264 1.226 0.271 c 0.422 0.008 0.842 -0.07 1.234 -0.229 c 0.392 -0.158 0.748 -0.394 1.047 -0.693 l 0.662 0.662 C 15.688 11.195 16.57 11.0 17.5 11.0 Z M 6.625 10.75 C 7.385 10.75 8.0 10.134 8.0 9.375 C 8.0 8.615 7.384 8.0 6.625 8.0 C 5.865 8.0 5.25 8.616 5.25 9.375 c 0.0 0.76 0.616 1.375 1.375 1.375 Z M 18.75 9.375 c 0.0 0.76 -0.616 1.375 -1.375 1.375 c -0.76 0.0 -1.375 -0.616 -1.375 -1.375 C 16.0 8.615 16.616 8.0 17.375 8.0 c 0.76 0.0 1.375 0.616 1.375 1.375 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.5 15.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 v 1.0 h -2.0 v -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.0 17.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 S 12.0 20.538 12.0 17.5 s 2.462 -5.5 5.5 -5.5 s 5.5 2.462 5.5 5.5 Z m -3.5 -1.0 v -1.0 c 0.0 -1.104 -0.895 -2.0 -2.0 -2.0 c -1.104 0.0 -2.0 0.895 -2.0 2.0 v 1.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 V 20.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 4.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -2.5 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 Z")
        )
    }.build()
}
