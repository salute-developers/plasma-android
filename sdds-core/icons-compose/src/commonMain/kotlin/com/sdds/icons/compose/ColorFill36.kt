package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColorFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColorFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.833 16.645 c 0.372 -0.261 0.876 -0.082 1.077 0.327 c 1.416 2.878 4.022 5.033 7.12 5.873 c 0.945 0.27 1.935 0.405 2.97 0.405 c 0.73 0.0 1.431 -0.07 2.111 -0.197 c 0.433 -0.081 0.863 0.196 0.882 0.636 C 20.998 23.793 21.0 23.896 21.0 24.0 c 0.0 2.655 -1.155 5.055 -3.0 6.69 c -1.59 1.44 -3.69 2.31 -6.0 2.31 c -4.965 0.0 -9.0 -4.035 -9.0 -9.0 c 0.0 -3.037 1.52 -5.728 3.833 -7.355 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 28.09 16.973 c 0.202 -0.409 0.706 -0.588 1.078 -0.326 C 31.48 18.273 33.0 20.962 33.0 24.0 c 0.0 4.965 -4.035 9.0 -9.0 9.0 c -1.117 0.0 -2.191 -0.204 -3.179 -0.58 c -0.477 -0.181 -0.567 -0.793 -0.234 -1.18 c 1.713 -2.0 2.663 -4.561 2.663 -7.24 c 0.0 -0.51 -0.045 -1.02 -0.12 -1.5 c -0.045 -0.277 0.097 -0.549 0.342 -0.685 c 1.986 -1.1 3.608 -2.784 4.619 -4.842 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 3.0 c 4.965 0.0 9.0 4.035 9.0 9.0 c 0.0 1.17 -0.225 2.295 -0.63 3.315 c -1.035 2.61 -3.255 4.62 -6.0 5.37 C 19.62 20.895 18.825 21.0 18.0 21.0 c -0.825 0.0 -1.62 -0.105 -2.37 -0.315 c -2.745 -0.75 -4.965 -2.76 -6.0 -5.37 C 9.225 14.295 9.0 13.17 9.0 12.0 c 0.0 -4.965 4.035 -9.0 9.0 -9.0 Z")
        )
    }.build()
}
