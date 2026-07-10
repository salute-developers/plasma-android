package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 11.75 c 2.348 0.0 4.25 -1.903 4.25 -4.25 S 14.348 3.25 12.0 3.25 c -2.347 0.0 -4.25 1.903 -4.25 4.25 s 1.903 4.25 4.25 4.25 Z m 8.5 6.19 c 0.017 -0.577 -0.235 -1.133 -0.694 -1.485 c -2.226 -1.707 -4.913 -2.705 -7.805 -2.705 c -2.893 0.0 -5.58 0.998 -7.807 2.707 c -0.459 0.351 -0.711 0.908 -0.693 1.485 c 0.02 0.659 0.081 1.087 0.262 1.443 c 0.24 0.47 0.622 0.853 1.093 1.092 C 5.39 20.75 6.09 20.75 7.49 20.75 h 9.018 c 1.4 0.0 2.1 0.0 2.635 -0.273 c 0.47 -0.24 0.853 -0.622 1.093 -1.092 c 0.181 -0.356 0.242 -0.785 0.262 -1.445 Z")
        )
    }.build()
}
