package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CapsuleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CapsuleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.364 9.658 L 6.341 5.634 l 2.8 -2.8 c 1.11 -1.112 2.912 -1.112 4.023 0.0 c 1.111 1.11 1.111 2.912 0.0 4.024 l -2.8 2.8 Z m -4.73 -3.317 l 4.023 4.024 l -2.8 2.8 c -1.111 1.112 -2.913 1.112 -4.024 0.0 c -1.11 -1.11 -1.11 -2.912 0.0 -4.023 l 2.8 -2.8 Z m 2.8 -4.215 L 2.126 8.435 c -1.501 1.501 -1.501 3.936 0.0 5.438 c 1.502 1.502 3.936 1.502 5.438 0.0 l 6.307 -6.308 c 1.502 -1.502 1.502 -3.937 0.0 -5.439 c -1.501 -1.501 -3.936 -1.501 -5.437 0.0 Z m -2.887 6.75 c 0.29 0.0 0.526 -0.236 0.526 -0.526 c 0.0 -0.29 -0.235 -0.526 -0.526 -0.526 c -0.29 0.0 -0.525 0.236 -0.525 0.526 c 0.0 0.29 0.235 0.526 0.525 0.526 Z M 3.97 10.453 c 0.0 0.29 -0.235 0.526 -0.525 0.526 c -0.29 0.0 -0.526 -0.235 -0.526 -0.526 c 0.0 -0.29 0.235 -0.525 0.526 -0.525 c 0.29 0.0 0.525 0.235 0.525 0.525 Z M 7.65 10.98 c 0.29 0.0 0.525 -0.235 0.525 -0.526 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 c -0.29 0.0 -0.526 0.235 -0.526 0.525 c 0.0 0.29 0.235 0.526 0.526 0.526 Z m -1.576 1.577 c 0.0 0.29 -0.235 0.525 -0.526 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 c 0.0 -0.29 0.235 -0.526 0.525 -0.526 c 0.29 0.0 0.526 0.235 0.526 0.526 Z m -0.526 -1.577 c 0.29 0.0 0.526 -0.235 0.526 -0.526 c 0.0 -0.29 -0.235 -0.525 -0.526 -0.525 c -0.29 0.0 -0.525 0.235 -0.525 0.525 c 0.0 0.29 0.235 0.526 0.525 0.526 Z")
        )
    }.build()
}
