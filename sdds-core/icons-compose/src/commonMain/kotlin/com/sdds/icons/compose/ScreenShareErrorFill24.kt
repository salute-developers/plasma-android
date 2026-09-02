package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ScreenShareErrorFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ScreenShareErrorFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 12.0 c 3.038 0.0 5.5 2.462 5.5 5.5 S 20.538 23.0 17.5 23.0 S 12.0 20.538 12.0 17.5 s 2.462 -5.5 5.5 -5.5 Z m 2.475 3.025 c -0.196 -0.195 -0.512 -0.195 -0.707 0.0 L 17.5 16.793 l -1.768 -1.768 c -0.195 -0.195 -0.511 -0.195 -0.707 0.0 c -0.195 0.196 -0.195 0.512 0.0 0.707 l 1.768 1.768 l -1.768 1.768 c -0.195 0.195 -0.195 0.511 0.0 0.707 c 0.196 0.195 0.512 0.195 0.707 0.0 l 1.768 -1.768 l 1.768 1.768 c 0.195 0.195 0.511 0.195 0.707 0.0 c 0.195 -0.196 0.195 -0.512 0.0 -0.707 L 18.207 17.5 l 1.768 -1.768 c 0.195 -0.195 0.195 -0.511 0.0 -0.707 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.25 4.0 C 20.769 4.0 22.0 5.231 22.0 6.75 v 6.062 C 20.832 11.69 19.247 11.0 17.5 11.0 c -3.59 0.0 -6.5 2.91 -6.5 6.5 c 0.0 0.886 0.178 1.73 0.499 2.5 H 4.75 C 3.231 20.0 2.0 18.769 2.0 17.25 V 6.75 C 2.0 5.231 3.231 4.0 4.75 4.0 h 14.5 Z")
        )
    }.build()
}
