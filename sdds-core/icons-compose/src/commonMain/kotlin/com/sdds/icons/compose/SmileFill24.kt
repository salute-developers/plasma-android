package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SmileFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SmileFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z M 8.75 11.0 C 9.44 11.0 10.0 10.44 10.0 9.75 S 9.44 8.5 8.75 8.5 S 7.5 9.06 7.5 9.75 S 8.06 11.0 8.75 11.0 Z m 7.75 -1.25 c 0.0 0.69 -0.56 1.25 -1.25 1.25 S 14.0 10.44 14.0 9.75 s 0.56 -1.25 1.25 -1.25 s 1.25 0.56 1.25 1.25 Z m -8.18 4.375 c -0.208 -0.359 -0.666 -0.482 -1.025 -0.274 c -0.359 0.207 -0.482 0.665 -0.275 1.024 c 0.505 0.874 1.23 1.6 2.105 2.105 c 0.874 0.504 1.866 0.77 2.875 0.77 c 1.01 0.0 2.0 -0.266 2.875 -0.77 c 0.874 -0.505 1.6 -1.23 2.105 -2.105 c 0.207 -0.359 0.084 -0.817 -0.275 -1.024 c -0.359 -0.208 -0.817 -0.085 -1.024 0.274 c -0.373 0.646 -0.91 1.183 -1.556 1.556 S 12.746 16.25 12.0 16.25 s -1.479 -0.196 -2.125 -0.57 c -0.646 -0.372 -1.183 -0.909 -1.556 -1.555 Z")
        )
    }.build()
}
