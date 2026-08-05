package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColorSwatchFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColorSwatchFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.166 16.186 l -5.064 5.064 h 9.675 c 0.39 0.0 0.765 -0.155 1.041 -0.432 c 0.276 -0.276 0.432 -0.65 0.432 -1.04 v -4.445 c 0.0 -0.39 -0.156 -0.765 -0.432 -1.041 c -0.276 -0.276 -0.65 -0.43 -1.04 -0.43 H 17.5 l -2.334 2.324 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.223 2.75 c -0.39 0.0 -0.765 0.156 -1.041 0.432 c -0.276 0.276 -0.432 0.65 -0.432 1.04 v 13.334 c 0.0 0.98 0.39 1.92 1.082 2.612 c 0.693 0.693 1.633 1.082 2.612 1.082 c 0.98 0.0 1.92 -0.39 2.613 -1.082 c 0.692 -0.693 1.082 -1.633 1.082 -2.612 V 4.223 c 0.0 -0.39 -0.155 -0.765 -0.431 -1.041 C 9.432 2.906 9.058 2.75 8.667 2.75 H 4.223 Z m 2.221 14.056 c 0.415 0.0 0.75 0.335 0.75 0.75 v 0.01 c 0.0 0.415 -0.335 0.75 -0.75 0.75 c -0.414 0.0 -0.75 -0.335 -0.75 -0.75 v -0.01 c 0.0 -0.415 0.336 -0.75 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.683 4.71 c -0.39 0.0 -0.765 0.156 -1.041 0.432 l -0.843 0.842 l -1.16 1.302 v 10.306 l 7.226 -7.227 c 0.276 -0.276 0.43 -0.65 0.43 -1.04 c 0.0 -0.391 -0.154 -0.766 -0.43 -1.042 l -3.142 -3.141 c -0.276 -0.276 -0.65 -0.431 -1.04 -0.431 Z")
        )
    }.build()
}
