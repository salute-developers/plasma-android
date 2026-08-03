package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HomeAltFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HomeAltFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.993 3.86 c -0.654 -0.147 -1.332 -0.147 -1.986 0.0 c -0.743 0.168 -1.414 0.583 -2.305 1.135 l -8.753 5.412 c -0.803 0.496 -1.408 0.87 -1.86 1.393 c -0.4 0.461 -0.699 0.998 -0.882 1.577 C 2.999 14.036 2.999 14.745 3.0 15.685 v 10.12 c 0.0 0.901 0.0 1.645 0.05 2.25 c 0.052 0.63 0.162 1.208 0.44 1.75 c 0.432 0.843 1.12 1.528 1.967 1.957 c 0.546 0.277 1.127 0.387 1.76 0.438 c 0.609 0.05 1.356 0.05 2.262 0.05 h 17.043 c 0.905 0.0 1.653 0.0 2.261 -0.05 c 0.633 -0.05 1.214 -0.161 1.76 -0.438 c 0.847 -0.429 1.535 -1.114 1.967 -1.956 c 0.278 -0.543 0.389 -1.121 0.44 -1.75 C 33.0 27.45 33.0 26.705 33.0 25.805 v -10.12 c 0.0 -0.94 0.001 -1.65 -0.207 -2.309 c -0.183 -0.58 -0.483 -1.116 -0.881 -1.577 c -0.452 -0.523 -1.058 -0.897 -1.861 -1.393 l -8.753 -5.412 c -0.89 -0.552 -1.562 -0.967 -2.305 -1.135 Z M 22.5 17.33 c -2.485 0.0 -4.5 2.014 -4.5 4.5 v 8.182 h 9.0 v -8.183 c 0.0 -2.485 -2.015 -4.5 -4.5 -4.5 Z")
        )
    }.build()
}
