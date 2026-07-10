package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PanelSidebarRFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PanelSidebarRFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.279 2.5 c 0.374 0.0 0.685 0.0 0.94 0.02 c 0.264 0.022 0.51 0.069 0.742 0.187 c 0.357 0.182 0.648 0.473 0.83 0.83 c 0.118 0.232 0.165 0.478 0.186 0.743 c 0.021 0.254 0.021 0.565 0.021 0.94 v 5.562 c 0.0 0.374 0.0 0.685 -0.02 0.94 c -0.022 0.264 -0.069 0.51 -0.187 0.742 c -0.182 0.357 -0.473 0.648 -0.83 0.83 c -0.232 0.118 -0.478 0.165 -0.743 0.186 c -0.254 0.021 -0.565 0.021 -0.94 0.021 H 3.722 c -0.374 0.0 -0.686 0.0 -0.94 -0.02 c -0.264 -0.022 -0.51 -0.069 -0.742 -0.187 c -0.357 -0.182 -0.648 -0.473 -0.83 -0.83 c -0.118 -0.232 -0.165 -0.478 -0.187 -0.742 c -0.02 -0.255 -0.02 -0.566 -0.02 -0.94 V 5.22 c 0.0 -0.375 0.0 -0.686 0.02 -0.94 c 0.022 -0.265 0.069 -0.51 0.187 -0.743 c 0.182 -0.357 0.473 -0.648 0.83 -0.83 c 0.232 -0.118 0.478 -0.165 0.742 -0.186 C 3.035 2.5 3.347 2.5 3.721 2.5 h 8.558 Z m -2.145 10.001 V 3.5 H 3.742 c -0.4 0.0 -0.67 0.0 -0.88 0.017 C 2.66 3.534 2.562 3.564 2.494 3.598 C 2.323 3.684 2.186 3.822 2.1 3.991 C 2.065 4.06 2.036 4.16 2.02 4.361 C 2.001 4.57 2.001 4.84 2.001 5.24 v 5.521 c 0.0 0.4 0.0 0.67 0.017 0.879 c 0.017 0.203 0.046 0.302 0.08 0.37 c 0.087 0.17 0.225 0.307 0.394 0.393 c 0.068 0.034 0.167 0.064 0.37 0.08 c 0.208 0.018 0.478 0.018 0.879 0.018 h 6.392 Z")
        )
    }.build()
}
