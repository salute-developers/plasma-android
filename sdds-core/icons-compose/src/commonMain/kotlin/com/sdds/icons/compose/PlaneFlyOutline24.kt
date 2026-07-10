package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneFlyOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneFlyOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.512 4.027 C 8.284 2.986 9.077 2.0 10.143 2.0 c 0.959 0.0 1.839 0.529 2.288 1.375 l 3.211 6.045 l 3.586 -0.11 C 20.745 9.266 22.0 10.483 22.0 12.0 s -1.255 2.735 -2.772 2.69 l -3.586 -0.11 l -3.21 6.045 C 11.981 21.47 11.101 22.0 10.142 22.0 c -1.066 0.0 -1.86 -0.986 -1.631 -2.027 L 9.73 14.4 l -2.495 -0.075 l -0.619 0.618 C 6.1 15.46 5.401 15.75 4.672 15.75 H 3.405 c -0.744 0.0 -1.227 -0.782 -0.895 -1.447 L 3.661 12.0 l -1.15 -2.303 C 2.177 9.032 2.66 8.25 3.404 8.25 h 1.267 C 5.4 8.25 6.1 8.54 6.616 9.055 l 0.619 0.62 L 9.73 9.598 L 8.512 4.027 Z M 10.143 3.5 c -0.108 0.0 -0.19 0.1 -0.166 0.207 l 1.412 6.454 c 0.048 0.218 -0.004 0.446 -0.142 0.621 c -0.137 0.176 -0.345 0.282 -0.568 0.289 l -3.722 0.113 C 6.75 11.19 6.55 11.11 6.404 10.963 l -0.849 -0.848 C 5.321 9.882 5.003 9.75 4.672 9.75 H 4.214 l 0.957 1.915 c 0.105 0.21 0.105 0.46 0.0 0.67 L 4.214 14.25 h 0.458 c 0.331 0.0 0.649 -0.132 0.883 -0.366 l 0.849 -0.848 c 0.146 -0.146 0.346 -0.226 0.553 -0.22 l 3.722 0.113 c 0.223 0.007 0.431 0.113 0.568 0.289 c 0.138 0.175 0.19 0.403 0.142 0.621 l -1.412 6.454 C 9.954 20.4 10.035 20.5 10.143 20.5 c 0.404 0.0 0.774 -0.223 0.964 -0.579 l 3.43 -6.456 c 0.134 -0.252 0.4 -0.407 0.685 -0.398 l 4.052 0.123 c 0.67 0.02 1.226 -0.518 1.226 -1.19 c 0.0 -0.671 -0.555 -1.21 -1.226 -1.19 l -4.052 0.123 c -0.286 0.009 -0.551 -0.146 -0.685 -0.398 l -3.43 -6.456 c -0.19 -0.356 -0.56 -0.579 -0.963 -0.579 Z")
        )
    }.build()
}
