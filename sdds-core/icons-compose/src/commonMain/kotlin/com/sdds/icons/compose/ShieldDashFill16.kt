package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldDashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldDashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.249 3.956 c -0.033 4.815 -1.43 7.57 -2.927 9.133 c -1.506 1.571 -3.056 1.872 -3.231 1.902 l -0.002 0.001 H 8.086 l -0.014 0.002 C 8.058 14.996 8.032 15.0 8.0 15.0 c -0.033 0.0 -0.058 -0.004 -0.072 -0.006 l -0.015 -0.002 H 7.91 c -0.168 -0.029 -1.58 -0.303 -3.014 -1.683 l 9.353 -9.353 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.625 1.15 c 0.228 -0.151 0.522 -0.151 0.75 0.0 c 0.274 0.18 1.116 0.721 2.154 1.214 c 0.577 0.275 1.196 0.522 1.797 0.692 l 1.41 -1.41 c 0.196 -0.195 0.512 -0.195 0.707 0.0 c 0.196 0.196 0.196 0.512 0.0 0.708 L 2.563 14.233 c -0.195 0.195 -0.511 0.195 -0.707 0.0 c -0.194 -0.196 -0.195 -0.512 0.0 -0.707 l 1.78 -1.782 C 2.575 10.058 1.75 7.537 1.75 3.784 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 c 0.98 0.0 2.166 -0.42 3.22 -0.92 C 6.508 1.871 7.35 1.331 7.625 1.15 Z")
        )
    }.build()
}
