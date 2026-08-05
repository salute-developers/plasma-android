package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BackwardFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BackwardFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.55 5.02 c -0.221 -0.258 -0.474 -0.562 -1.072 -0.515 c -0.517 0.04 -0.902 0.337 -1.116 0.515 c -0.234 0.195 -0.505 0.464 -0.798 0.755 l -9.235 9.17 c -0.439 0.437 -0.439 1.144 0.0 1.58 l 9.235 9.17 c 0.293 0.292 0.564 0.561 0.798 0.756 c 0.214 0.178 0.6 0.475 1.116 0.515 c 0.522 0.017 0.962 -0.518 1.123 -0.728 c 0.16 -0.209 0.347 -0.875 0.372 -1.151 C 16.0 24.785 16.0 24.404 16.0 23.992 V 20.39 v -0.06 l 0.046 0.002 c 4.435 0.132 7.622 0.54 9.575 1.83 c 1.966 1.298 3.292 3.057 4.94 5.242 c 0.0 0.0 0.119 0.17 0.189 0.325 c 0.68 1.49 2.25 1.713 2.25 0.447 v -0.336 c 0.0 -9.31 -7.752 -16.214 -17.0 -16.885 V 7.262 c 0.0 -0.412 0.0 -0.792 -0.027 -1.094 c -0.025 -0.276 -0.086 -0.757 -0.422 -1.148 Z")
        )
    }.build()
}
