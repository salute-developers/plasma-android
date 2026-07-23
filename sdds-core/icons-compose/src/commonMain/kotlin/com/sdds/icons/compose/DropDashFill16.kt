package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DropDashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DropDashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.342 5.653 c 0.178 0.312 0.336 0.625 0.476 0.939 l 0.017 0.039 C 13.265 7.613 13.5 8.605 13.5 9.6 c 0.0 2.982 -2.463 5.4 -5.5 5.4 c -1.033 0.0 -2.0 -0.28 -2.825 -0.766 l -0.039 -0.023 c -0.278 -0.167 -0.54 -0.358 -0.783 -0.57 l 7.989 -7.988 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.624 1.127 c 0.221 -0.17 0.531 -0.17 0.752 0.0 l 0.114 0.09 l 0.248 0.207 C 8.876 1.54 9.024 1.67 9.18 1.813 c 0.592 0.54 1.184 1.148 1.738 1.813 c 0.096 0.115 0.19 0.232 0.281 0.348 l 2.327 -2.328 c 0.195 -0.195 0.511 -0.195 0.707 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 l -11.88 11.88 c -0.194 0.194 -0.511 0.194 -0.706 0.0 c -0.196 -0.196 -0.196 -0.513 0.0 -0.709 l 1.459 -1.459 l -0.002 -0.004 l -0.034 -0.067 C 2.705 11.273 2.5 10.46 2.5 9.6 c 0.0 -2.024 0.974 -4.041 2.582 -5.974 c 0.554 -0.665 1.146 -1.273 1.739 -1.813 c 0.155 -0.143 0.303 -0.272 0.44 -0.39 l 0.135 -0.112 l 0.228 -0.184 Z")
        )
    }.build()
}
