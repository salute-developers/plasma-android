package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.OdnoklassnikiFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "OdnoklassnikiFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.723 13.144 c 0.422 -0.67 1.308 -0.87 1.978 -0.45 c 2.02 1.262 4.586 1.262 6.606 0.0 c 0.667 -0.41 1.539 -0.211 1.962 0.446 c 0.431 0.667 0.24 1.556 -0.428 1.987 c -0.877 0.551 -1.841 0.95 -2.85 1.18 l 2.741 2.744 c 0.56 0.56 0.56 1.468 0.0 2.03 c -0.561 0.56 -1.47 0.56 -2.031 0.0 l -2.696 -2.695 L 9.31 21.08 c -0.555 0.524 -1.422 0.524 -1.977 0.0 c -0.578 -0.546 -0.603 -1.456 -0.057 -2.033 l 2.743 -2.741 c -1.008 -0.23 -1.972 -0.63 -2.848 -1.18 L 7.17 15.125 c -0.672 -0.424 -0.872 -1.311 -0.447 -1.981 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.003 2.5 c 2.71 0.0 4.907 2.193 4.908 4.901 c 0.0 2.708 -2.194 4.904 -4.904 4.905 c -2.709 -0.002 -4.905 -2.195 -4.908 -4.902 C 7.098 4.697 9.294 2.501 12.003 2.5 Z m 0.004 2.874 c -1.122 0.0 -2.03 0.91 -2.033 2.03 c 0.0 1.122 0.91 2.032 2.033 2.032 c 1.122 0.0 2.032 -0.909 2.032 -2.03 c 0.0 -1.122 -0.91 -2.032 -2.032 -2.032 Z")
        )
    }.build()
}
