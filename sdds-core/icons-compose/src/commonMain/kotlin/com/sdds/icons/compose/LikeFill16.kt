package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LikeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LikeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.297 1.368 C 8.87 1.245 8.423 1.483 8.282 1.908 L 7.564 4.085 c -0.086 0.26 -0.203 0.51 -0.35 0.742 L 5.723 7.12 c -0.11 0.174 -0.235 0.338 -0.374 0.488 C 4.973 6.988 4.194 6.66 3.445 6.945 L 2.777 7.198 c -0.585 0.222 -0.985 0.77 -1.022 1.4 l -0.252 4.34 c -0.05 0.838 0.554 1.57 1.38 1.675 l 0.7 0.088 c 0.608 0.077 1.173 -0.205 1.496 -0.676 l 4.127 0.906 c 1.277 0.28 2.586 -0.312 3.229 -1.461 l 1.767 -3.158 c 0.859 -1.536 -0.24 -3.437 -1.985 -3.437 h -1.443 c -0.345 0.0 -0.597 -0.33 -0.508 -0.668 L 10.774 4.0 c 0.3 -1.138 -0.357 -2.309 -1.477 -2.632 Z M 3.815 7.94 c 0.354 -0.134 0.728 0.142 0.71 0.523 l -0.22 4.682 c -0.015 0.309 -0.287 0.54 -0.591 0.502 l -0.7 -0.089 C 2.737 13.523 2.536 13.28 2.553 13.0 l 0.252 -4.34 C 2.818 8.45 2.95 8.268 3.146 8.194 L 3.815 7.94 Z")
        )
    }.build()
}
