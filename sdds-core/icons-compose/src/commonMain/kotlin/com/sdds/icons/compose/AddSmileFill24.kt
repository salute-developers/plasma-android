package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AddSmileFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AddSmileFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.605 3.85 H 15.95 c -0.884 0.0 -1.6 0.717 -1.6 1.6 c 0.0 0.884 0.716 1.6 1.6 1.6 h 1.5 v 1.875 c 0.0 0.842 0.683 1.525 1.525 1.525 c 0.842 0.0 1.525 -0.683 1.525 -1.525 V 8.78 c 0.388 1.067 0.6 2.22 0.6 3.42 c 0.0 5.523 -4.477 10.0 -10.0 10.0 s -10.0 -4.477 -10.0 -10.0 s 4.477 -10.0 10.0 -10.0 c 2.034 0.0 3.926 0.607 5.505 1.65 Z M 9.1 9.95 c 0.0 0.69 -0.56 1.25 -1.25 1.25 S 6.6 10.64 6.6 9.95 S 7.16 8.7 7.85 8.7 S 9.1 9.26 9.1 9.95 Z m 6.5 0.0 c 0.0 0.69 -0.56 1.25 -1.25 1.25 s -1.25 -0.56 -1.25 -1.25 s 0.56 -1.25 1.25 -1.25 s 1.25 0.56 1.25 1.25 Z m -8.18 4.375 c -0.208 -0.358 -0.666 -0.481 -1.025 -0.274 c -0.359 0.207 -0.482 0.665 -0.274 1.024 c 0.504 0.874 1.23 1.6 2.104 2.105 c 0.874 0.505 1.866 0.77 2.875 0.77 c 1.01 0.0 2.001 -0.265 2.875 -0.77 c 0.874 -0.505 1.6 -1.23 2.105 -2.105 c 0.207 -0.358 0.084 -0.817 -0.275 -1.024 c -0.358 -0.207 -0.817 -0.085 -1.024 0.274 c -0.373 0.646 -0.91 1.183 -1.556 1.556 s -1.379 0.57 -2.125 0.57 s -1.479 -0.197 -2.125 -0.57 c -0.646 -0.373 -1.182 -0.91 -1.555 -1.556 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.1 1.7 c 0.414 0.0 0.75 0.336 0.75 0.75 V 4.7 h 2.25 c 0.414 0.0 0.75 0.336 0.75 0.75 S 22.514 6.2 22.1 6.2 h -2.25 v 2.25 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 6.2 H 16.1 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 S 15.686 4.7 16.1 4.7 h 2.25 V 2.45 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
    }.build()
}
