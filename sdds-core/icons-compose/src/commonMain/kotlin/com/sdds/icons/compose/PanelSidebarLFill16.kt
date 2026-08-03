package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PanelSidebarLFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PanelSidebarLFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.722 2.5 c -0.375 0.0 -0.686 0.0 -0.94 0.02 c -0.265 0.022 -0.51 0.069 -0.743 0.187 C 1.682 2.89 1.391 3.18 1.21 3.537 C 1.091 3.77 1.044 4.015 1.023 4.28 C 1.002 4.534 1.002 4.845 1.002 5.22 v 5.562 c 0.0 0.374 0.0 0.685 0.02 0.94 c 0.022 0.264 0.069 0.51 0.187 0.742 c 0.182 0.357 0.473 0.648 0.83 0.83 c 0.232 0.118 0.478 0.165 0.743 0.186 c 0.254 0.021 0.565 0.021 0.94 0.021 h 8.557 c 0.374 0.0 0.686 0.0 0.94 -0.02 c 0.264 -0.022 0.51 -0.069 0.742 -0.187 c 0.357 -0.182 0.648 -0.473 0.83 -0.83 c 0.118 -0.232 0.165 -0.478 0.187 -0.742 c 0.02 -0.255 0.02 -0.566 0.02 -0.94 V 5.22 c 0.0 -0.375 0.0 -0.686 -0.02 -0.94 c -0.022 -0.265 -0.069 -0.51 -0.187 -0.743 c -0.182 -0.357 -0.473 -0.648 -0.83 -0.83 c -0.232 -0.118 -0.478 -0.165 -0.742 -0.186 C 12.965 2.5 12.653 2.5 12.279 2.5 H 3.722 Z m 2.144 10.001 V 3.5 h 6.392 c 0.4 0.0 0.67 0.0 0.88 0.017 c 0.202 0.017 0.302 0.047 0.369 0.081 c 0.17 0.086 0.307 0.224 0.393 0.393 c 0.035 0.068 0.064 0.168 0.081 0.37 c 0.017 0.209 0.017 0.479 0.017 0.879 v 5.521 c 0.0 0.4 0.0 0.67 -0.017 0.879 c -0.017 0.203 -0.046 0.302 -0.08 0.37 c -0.087 0.17 -0.225 0.307 -0.394 0.393 c -0.067 0.034 -0.167 0.064 -0.37 0.08 c -0.208 0.018 -0.478 0.018 -0.879 0.018 H 5.866 Z")
        )
    }.build()
}
