package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CompassFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CompassFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.517 11.464 c 0.042 -0.155 0.114 -0.299 0.208 -0.424 l 2.55 1.92 c -0.095 0.126 -0.214 0.234 -0.351 0.317 l -3.47 2.102 l 1.063 -3.915 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z m 4.213 -15.59 c 0.245 0.184 0.352 0.5 0.272 0.795 L 14.93 12.93 c -0.185 0.682 -0.625 1.266 -1.23 1.631 l -5.073 3.073 c -0.262 0.159 -0.595 0.142 -0.84 -0.043 c -0.245 -0.184 -0.353 -0.5 -0.272 -0.795 L 9.07 11.07 c 0.185 -0.682 0.625 -1.266 1.23 -1.631 l 5.073 -3.073 c 0.262 -0.159 0.595 -0.142 0.84 0.043 Z")
        )
    }.build()
}
