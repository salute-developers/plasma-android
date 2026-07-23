package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LogoutFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LogoutFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.282 13.158 C 9.5 12.73 9.5 12.17 9.5 11.05 V 8.51 h -3.0 C 6.224 8.51 6.0 8.288 6.0 8.01 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 3.0 V 4.95 c 0.0 -1.12 0.0 -1.68 -0.218 -2.108 C 9.09 2.466 8.784 2.16 8.408 1.968 C 7.98 1.75 7.42 1.75 6.3 1.75 H 5.7 c -1.12 0.0 -1.68 0.0 -2.108 0.218 C 3.216 2.16 2.91 2.466 2.718 2.842 C 2.5 3.27 2.5 3.83 2.5 4.95 v 6.1 c 0.0 1.12 0.0 1.68 0.218 2.108 c 0.192 0.376 0.498 0.682 0.874 0.874 C 4.02 14.25 4.58 14.25 5.7 14.25 h 0.6 c 1.12 0.0 1.68 0.0 2.108 -0.218 c 0.376 -0.192 0.682 -0.498 0.874 -0.874 Z M 9.5 7.511 h 2.796 l -1.268 -1.272 c -0.195 -0.196 -0.194 -0.513 0.001 -0.708 c 0.196 -0.194 0.513 -0.194 0.707 0.002 l 2.118 2.125 c 0.195 0.195 0.195 0.51 0.0 0.706 l -2.117 2.124 c -0.195 0.196 -0.512 0.197 -0.708 0.002 c -0.195 -0.195 -0.196 -0.512 0.0 -0.707 l 1.267 -1.272 H 9.5 v -1.0 Z")
        )
    }.build()
}
