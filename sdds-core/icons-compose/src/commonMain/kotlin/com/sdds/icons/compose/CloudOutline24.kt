package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.324 8.678 C 3.838 9.313 2.0 11.566 2.0 14.25 C 2.0 17.426 4.574 20.0 7.75 20.0 h 9.75 c 2.485 0.0 4.5 -2.015 4.5 -4.5 c 0.0 -1.782 -1.035 -3.32 -2.536 -4.05 c 0.024 -0.23 0.036 -0.464 0.036 -0.7 C 19.5 7.022 16.478 4.0 12.75 4.0 C 9.744 4.0 7.199 5.964 6.324 8.678 Z m 1.678 -0.173 C 11.061 8.638 13.5 11.16 13.5 14.25 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 12.0 14.664 12.0 14.25 C 12.0 11.903 10.097 10.0 7.75 10.0 c -0.24 0.0 -0.476 0.02 -0.705 0.058 C 5.034 10.393 3.5 12.143 3.5 14.25 c 0.0 2.347 1.903 4.25 4.25 4.25 h 9.75 c 1.657 0.0 3.0 -1.343 3.0 -3.0 c 0.0 -1.34 -0.878 -2.475 -2.092 -2.86 c -0.364 -0.116 -0.583 -0.487 -0.509 -0.861 C 17.965 11.447 18.0 11.103 18.0 10.75 c 0.0 -2.9 -2.35 -5.25 -5.25 -5.25 c -2.096 0.0 -3.906 1.229 -4.748 3.005 Z")
        )
    }.build()
}
