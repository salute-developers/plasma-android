package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ScreenShareErrorFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ScreenShareErrorFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 8.25 c 2.071 0.0 3.75 1.679 3.75 3.75 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 Z m 1.693 2.057 c -0.136 -0.137 -0.358 -0.138 -0.495 -0.001 L 12.0 11.505 l -1.2 -1.2 c -0.136 -0.136 -0.357 -0.135 -0.493 0.0 c -0.137 0.137 -0.138 0.36 -0.001 0.496 L 11.505 12.0 l -1.2 1.2 c -0.136 0.136 -0.135 0.358 0.002 0.494 c 0.136 0.136 0.357 0.137 0.494 0.0 L 12.0 12.495 l 1.198 1.2 c 0.137 0.136 0.359 0.135 0.495 -0.002 c 0.137 -0.136 0.137 -0.357 0.0 -0.494 L 12.495 12.0 l 1.198 -1.2 c 0.137 -0.136 0.137 -0.357 0.0 -0.493 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.385 2.625 c 0.384 0.0 0.702 0.0 0.96 0.02 c 0.265 0.022 0.511 0.069 0.743 0.187 c 0.357 0.182 0.648 0.473 0.83 0.83 c 0.118 0.232 0.165 0.478 0.187 0.742 c 0.02 0.259 0.02 0.577 0.02 0.961 v 3.406 c -0.796 -0.712 -1.847 -1.146 -3.0 -1.146 c -2.485 0.0 -4.5 2.015 -4.5 4.5 c 0.0 0.526 0.092 1.03 0.258 1.5 H 3.865 c -0.384 0.0 -0.702 0.0 -0.96 -0.02 c -0.265 -0.022 -0.511 -0.069 -0.743 -0.187 c -0.357 -0.182 -0.648 -0.473 -0.83 -0.83 c -0.118 -0.232 -0.165 -0.478 -0.186 -0.742 c -0.022 -0.259 -0.021 -0.577 -0.021 -0.961 v -5.52 c 0.0 -0.384 0.0 -0.702 0.02 -0.96 c 0.022 -0.265 0.069 -0.511 0.187 -0.743 c 0.182 -0.357 0.473 -0.648 0.83 -0.83 c 0.232 -0.118 0.478 -0.165 0.742 -0.186 c 0.259 -0.022 0.577 -0.021 0.961 -0.021 h 8.52 Z")
        )
    }.build()
}
