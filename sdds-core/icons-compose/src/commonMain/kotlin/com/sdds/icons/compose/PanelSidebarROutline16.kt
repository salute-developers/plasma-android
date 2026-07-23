package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PanelSidebarROutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PanelSidebarROutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.28 2.5 H 3.72 c -0.375 0.0 -0.686 0.0 -0.94 0.02 C 2.515 2.543 2.27 2.59 2.037 2.708 C 1.68 2.89 1.39 3.18 1.207 3.537 C 1.09 3.77 1.042 4.015 1.021 4.28 C 1.0 4.534 1.0 4.845 1.0 5.22 v 5.56 c 0.0 0.375 0.0 0.686 0.02 0.94 c 0.022 0.265 0.069 0.51 0.187 0.743 c 0.182 0.357 0.473 0.648 0.83 0.83 c 0.232 0.118 0.478 0.165 0.743 0.186 C 3.034 13.5 3.345 13.5 3.72 13.5 h 8.56 c 0.375 0.0 0.686 0.0 0.94 -0.02 c 0.265 -0.022 0.51 -0.069 0.743 -0.187 c 0.357 -0.182 0.648 -0.473 0.83 -0.83 c 0.118 -0.232 0.165 -0.478 0.186 -0.743 C 15.0 11.466 15.0 11.155 15.0 10.78 V 5.22 c 0.0 -0.375 0.0 -0.686 -0.02 -0.94 c -0.022 -0.265 -0.069 -0.51 -0.187 -0.743 c -0.182 -0.357 -0.473 -0.648 -0.83 -0.83 c -0.232 -0.118 -0.478 -0.165 -0.743 -0.186 C 12.966 2.5 12.655 2.5 12.28 2.5 Z m 0.859 1.017 c 0.202 0.017 0.302 0.047 0.37 0.081 c 0.169 0.086 0.307 0.224 0.393 0.393 c 0.034 0.068 0.064 0.168 0.08 0.37 C 14.0 4.57 14.0 4.84 14.0 5.24 v 5.52 c 0.0 0.4 0.0 0.67 -0.017 0.879 c -0.017 0.202 -0.047 0.302 -0.081 0.37 c -0.086 0.169 -0.224 0.307 -0.393 0.393 c -0.068 0.034 -0.168 0.064 -0.37 0.08 C 12.93 12.5 12.66 12.5 12.26 12.5 h -1.125 v -9.0 h 1.125 c 0.4 0.0 0.67 0.0 0.879 0.017 Z M 10.135 3.5 v 9.0 H 3.74 c -0.4 0.0 -0.67 0.0 -0.879 -0.017 c -0.202 -0.017 -0.302 -0.047 -0.37 -0.081 c -0.169 -0.086 -0.307 -0.224 -0.393 -0.393 c -0.034 -0.068 -0.064 -0.168 -0.08 -0.37 C 2.0 11.43 2.0 11.16 2.0 10.76 V 5.24 c 0.0 -0.4 0.0 -0.67 0.017 -0.879 c 0.017 -0.202 0.047 -0.302 0.081 -0.37 c 0.086 -0.169 0.224 -0.307 0.393 -0.393 c 0.068 -0.034 0.168 -0.064 0.37 -0.08 C 3.07 3.5 3.34 3.5 3.74 3.5 h 6.395 Z")
        )
    }.build()
}
