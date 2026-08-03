package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PassportFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PassportFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.0 9.0 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 s -2.0 0.895 -2.0 2.0 s 0.895 2.0 2.0 2.0 s 2.0 -0.895 2.0 -2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.245 3.229 C 4.0 3.709 4.0 4.339 4.0 5.6 v 12.8 c 0.0 1.26 0.0 1.89 0.245 2.372 c 0.216 0.423 0.56 0.767 0.984 0.983 C 5.709 22.0 6.339 22.0 7.6 22.0 h 8.8 c 1.26 0.0 1.89 0.0 2.372 -0.245 c 0.423 -0.216 0.767 -0.56 0.983 -0.983 C 20.0 20.29 20.0 19.66 20.0 18.4 V 5.6 c 0.0 -1.26 0.0 -1.89 -0.245 -2.371 c -0.216 -0.424 -0.56 -0.768 -0.983 -0.984 C 18.29 2.0 17.66 2.0 16.4 2.0 H 7.6 C 6.34 2.0 5.71 2.0 5.229 2.245 C 4.805 2.461 4.46 2.805 4.245 3.23 Z M 8.25 14.5 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 7.836 16.0 8.25 16.0 h 7.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -7.5 Z m 3.75 -9.0 c 1.933 0.0 3.5 1.567 3.5 3.5 s -1.567 3.5 -3.5 3.5 S 8.5 10.933 8.5 9.0 s 1.567 -3.5 3.5 -3.5 Z m -1.75 12.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 9.836 19.0 10.25 19.0 h 3.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -3.5 Z")
        )
    }.build()
}
