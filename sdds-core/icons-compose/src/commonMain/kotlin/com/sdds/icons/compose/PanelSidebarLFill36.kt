package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PanelSidebarLFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PanelSidebarLFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.759 6.0 c -0.805 0.0 -1.47 0.0 -2.01 0.044 C 6.185 6.09 5.668 6.19 5.183 6.436 C 4.431 6.819 3.819 7.431 3.436 8.184 C 3.189 8.669 3.09 9.186 3.044 9.748 C 3.0 10.29 3.0 10.954 3.0 11.758 V 24.24 c 0.0 0.805 0.0 1.469 0.044 2.01 c 0.046 0.562 0.145 1.079 0.392 1.564 c 0.383 0.753 0.995 1.365 1.748 1.748 c 0.485 0.248 1.002 0.346 1.564 0.392 c 0.541 0.044 1.206 0.044 2.01 0.044 H 27.24 c 0.805 0.0 1.47 0.0 2.01 -0.044 c 0.563 -0.046 1.08 -0.144 1.565 -0.392 c 0.752 -0.383 1.364 -0.995 1.748 -1.748 c 0.247 -0.485 0.346 -1.002 0.392 -1.564 c 0.044 -0.541 0.044 -1.206 0.044 -2.01 V 11.758 c 0.0 -0.805 0.0 -1.47 -0.044 -2.01 c -0.046 -0.563 -0.145 -1.08 -0.392 -1.565 c -0.384 -0.753 -0.996 -1.365 -1.748 -1.748 c -0.486 -0.247 -1.002 -0.346 -1.564 -0.392 C 28.709 6.0 28.045 6.0 27.24 6.0 H 8.758 Z m 4.565 21.998 V 8.0 h 13.875 c 0.856 0.0 1.439 0.0 1.889 0.038 c 0.438 0.035 0.662 0.1 0.819 0.18 c 0.376 0.192 0.682 0.498 0.874 0.874 c 0.08 0.156 0.145 0.38 0.18 0.819 C 30.998 10.361 31.0 10.943 31.0 11.8 v 12.398 c 0.0 0.857 0.0 1.44 -0.038 1.89 c -0.035 0.438 -0.1 0.662 -0.18 0.818 c -0.192 0.377 -0.498 0.683 -0.874 0.874 c -0.157 0.08 -0.38 0.145 -0.82 0.18 c -0.45 0.037 -1.032 0.038 -1.888 0.038 H 13.324 Z")
        )
    }.build()
}
