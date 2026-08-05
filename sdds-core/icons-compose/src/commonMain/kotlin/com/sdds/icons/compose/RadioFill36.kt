package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RadioFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RadioFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.5 4.5 C 10.5 3.672 9.828 3.0 9.0 3.0 S 7.5 3.672 7.5 4.5 v 4.56 C 6.833 9.12 6.228 9.244 5.662 9.532 c -0.917 0.468 -1.663 1.213 -2.13 2.13 c -0.3 0.587 -0.42 1.215 -0.477 1.91 C 3.0 14.24 3.0 15.067 3.0 16.077 v 6.844 c 0.0 1.01 0.0 1.836 0.055 2.508 c 0.057 0.695 0.178 1.322 0.476 1.908 c 0.468 0.918 1.214 1.663 2.13 2.13 c 0.587 0.3 1.215 0.42 1.91 0.477 C 8.24 30.0 9.067 30.0 10.077 30.0 h 15.844 c 1.01 0.0 1.836 0.0 2.508 -0.055 c 0.695 -0.057 1.322 -0.178 1.908 -0.476 c 0.918 -0.468 1.663 -1.213 2.13 -2.13 c 0.3 -0.587 0.42 -1.214 0.477 -1.91 C 33.0 24.76 33.0 23.933 33.0 22.923 v -6.844 c 0.0 -1.01 0.0 -1.836 -0.055 -2.508 c -0.057 -0.694 -0.178 -1.322 -0.476 -1.908 c -0.468 -0.918 -1.213 -1.663 -2.13 -2.13 c -0.587 -0.3 -1.214 -0.42 -1.91 -0.477 C 27.76 9.0 26.933 9.0 25.923 9.0 H 10.5 V 4.5 Z m 0.0 19.5 c 0.0 0.828 -0.672 1.5 -1.5 1.5 S 7.5 24.828 7.5 24.0 s 0.672 -1.5 1.5 -1.5 s 1.5 0.672 1.5 1.5 Z m 12.0 1.5 c 3.314 0.0 6.0 -2.686 6.0 -6.0 s -2.686 -6.0 -6.0 -6.0 s -6.0 2.686 -6.0 6.0 s 2.686 6.0 6.0 6.0 Z m 3.0 -6.0 c 0.0 1.657 -1.343 3.0 -3.0 3.0 s -3.0 -1.343 -3.0 -3.0 s 1.343 -3.0 3.0 -3.0 s 3.0 1.343 3.0 3.0 Z")
        )
    }.build()
}
