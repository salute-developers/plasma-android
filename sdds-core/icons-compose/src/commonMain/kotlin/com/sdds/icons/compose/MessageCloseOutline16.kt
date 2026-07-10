package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageCloseOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageCloseOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.278 5.769 c -0.196 -0.196 -0.512 -0.195 -0.707 0.0 c -0.196 0.195 -0.196 0.512 0.0 0.707 l 1.622 1.622 L 5.57 9.72 c -0.196 0.195 -0.196 0.512 0.0 0.707 c 0.195 0.195 0.511 0.195 0.707 0.0 L 7.9 8.805 l 1.622 1.622 c 0.195 0.195 0.512 0.195 0.707 0.0 c 0.195 -0.195 0.195 -0.512 0.0 -0.707 L 8.607 8.098 l 1.622 -1.622 c 0.195 -0.195 0.195 -0.512 0.0 -0.707 c -0.195 -0.195 -0.512 -0.196 -0.707 0.0 L 7.9 7.39 L 6.278 5.769 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.053 2.05 c -3.256 0.0 -5.896 2.64 -5.896 5.896 c 0.0 0.706 0.125 1.384 0.353 2.013 c 0.135 0.37 0.174 0.737 0.083 1.062 l -0.51 1.82 C 1.9 13.497 2.503 14.1 3.157 13.917 l 1.821 -0.51 c 0.325 -0.091 0.692 -0.052 1.062 0.082 c 0.629 0.229 1.307 0.353 2.013 0.353 c 3.256 0.0 5.896 -2.64 5.896 -5.895 c 0.0 -3.257 -2.64 -5.896 -5.896 -5.896 Z M 3.007 7.946 c 0.0 -2.787 2.26 -5.046 5.046 -5.046 c 2.787 0.0 5.046 2.259 5.046 5.046 c 0.0 2.786 -2.259 5.045 -5.046 5.045 c -0.606 0.0 -1.186 -0.106 -1.723 -0.302 c -0.48 -0.174 -1.035 -0.255 -1.58 -0.102 l -1.822 0.51 l -0.008 0.001 H 2.917 c -0.002 0.0 -0.006 -0.003 -0.01 -0.006 c -0.004 -0.004 -0.006 -0.008 -0.006 -0.01 v -0.003 v -0.008 l 0.51 -1.821 c 0.153 -0.546 0.072 -1.102 -0.102 -1.581 c -0.195 -0.537 -0.302 -1.117 -0.302 -1.723 Z")
        )
    }.build()
}
