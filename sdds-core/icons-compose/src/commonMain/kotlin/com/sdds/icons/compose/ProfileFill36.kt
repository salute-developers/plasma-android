package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 17.648 c 3.52 0.0 6.375 -2.854 6.375 -6.375 c 0.0 -3.52 -2.854 -6.375 -6.375 -6.375 c -3.52 0.0 -6.375 2.855 -6.375 6.375 c 0.0 3.521 2.854 6.375 6.375 6.375 Z m 12.75 9.286 c 0.026 -0.866 -0.353 -1.7 -1.04 -2.228 c -3.34 -2.561 -7.37 -4.058 -11.708 -4.058 c -4.34 0.0 -8.371 1.498 -11.711 4.06 c -0.688 0.528 -1.066 1.363 -1.04 2.229 c 0.031 0.988 0.122 1.63 0.394 2.164 c 0.36 0.706 0.933 1.28 1.639 1.639 c 0.802 0.408 1.852 0.408 3.952 0.408 h 13.529 c 2.1 0.0 3.15 0.0 3.952 -0.408 c 0.706 -0.36 1.28 -0.933 1.639 -1.64 c 0.272 -0.533 0.363 -1.176 0.393 -2.166 Z")
        )
    }.build()
}
