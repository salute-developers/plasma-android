package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CapsuleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CapsuleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.05 21.464 l -8.514 -8.515 l 5.941 -5.94 c 2.351 -2.352 6.163 -2.352 8.515 0.0 c 2.35 2.35 2.351 6.162 0.0 8.514 l -5.941 5.94 Z M 30.58 5.42 c -3.228 -3.228 -8.461 -3.228 -11.69 0.0 L 5.422 18.89 c -3.228 3.228 -3.228 8.461 0.0 11.69 c 3.228 3.227 8.461 3.227 11.689 0.0 l 13.47 -13.47 c 3.227 -3.228 3.227 -8.461 -0.001 -11.69 Z M 12.762 19.87 c 0.62 0.0 1.123 -0.503 1.123 -1.123 s -0.503 -1.122 -1.123 -1.122 s -1.122 0.502 -1.122 1.122 c 0.0 0.62 0.502 1.123 1.122 1.123 Z m -3.368 3.367 c 0.0 0.62 -0.502 1.122 -1.122 1.122 c -0.62 0.0 -1.122 -0.502 -1.122 -1.122 c 0.0 -0.62 0.502 -1.122 1.122 -1.122 c 0.62 0.0 1.122 0.502 1.122 1.122 Z m 7.857 1.122 c 0.62 0.0 1.123 -0.502 1.123 -1.122 c 0.0 -0.62 -0.503 -1.122 -1.122 -1.122 c -0.62 0.0 -1.123 0.502 -1.123 1.122 c 0.0 0.62 0.503 1.122 1.122 1.122 Z m -3.366 3.368 c 0.0 0.62 -0.503 1.122 -1.123 1.122 s -1.122 -0.503 -1.122 -1.122 c 0.0 -0.62 0.502 -1.123 1.122 -1.123 c 0.62 0.0 1.123 0.503 1.123 1.123 Z m -1.123 -3.368 c 0.62 0.0 1.123 -0.502 1.123 -1.122 c 0.0 -0.62 -0.503 -1.122 -1.123 -1.122 s -1.122 0.502 -1.122 1.122 c 0.0 0.62 0.502 1.122 1.122 1.122 Z")
        )
    }.build()
}
