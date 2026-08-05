package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldLinesCirclesFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldLinesCirclesFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.828 3.74 c -0.504 -0.32 -1.152 -0.32 -1.656 0.0 c -0.585 0.373 -2.397 1.49 -4.63 2.51 c -2.267 1.036 -4.817 1.9 -6.917 1.9 C 5.004 8.15 4.5 8.64 4.5 9.24 c 0.0 3.913 0.448 7.18 1.186 9.906 l 11.959 -6.686 c -0.013 -0.102 -0.02 -0.206 -0.02 -0.312 c 0.0 -1.405 1.175 -2.543 2.625 -2.543 s 2.625 1.138 2.625 2.543 c 0.0 1.405 -1.175 2.545 -2.625 2.545 c -0.594 0.0 -1.142 -0.192 -1.582 -0.514 l -12.375 6.92 c 1.183 3.337 2.825 5.73 4.528 7.436 c 3.254 3.262 6.6 3.886 6.978 3.948 l 0.008 0.001 l 0.03 0.005 C 17.867 32.493 17.925 32.5 18.0 32.5 c 0.075 0.0 0.133 -0.007 0.163 -0.011 l 0.03 -0.005 H 18.2 l 0.002 -0.001 c 0.377 -0.062 3.724 -0.686 6.978 -3.948 c 2.409 -2.414 4.694 -6.198 5.734 -12.09 l -12.557 7.022 c 0.013 0.102 0.02 0.206 0.02 0.311 c 0.0 1.405 -1.176 2.544 -2.626 2.544 s -2.625 -1.139 -2.625 -2.544 s 1.175 -2.544 2.625 -2.544 c 0.594 0.0 1.142 0.192 1.582 0.514 l 13.93 -7.788 C 31.416 12.5 31.5 10.93 31.5 9.24 c 0.0 -0.601 -0.504 -1.09 -1.125 -1.09 c -2.1 0.0 -4.65 -0.864 -6.916 -1.9 c -2.234 -1.02 -4.046 -2.137 -4.631 -2.51 Z")
        )
    }.build()
}
