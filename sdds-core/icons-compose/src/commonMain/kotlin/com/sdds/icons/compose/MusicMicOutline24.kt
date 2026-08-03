package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicMicOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicMicOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.5 8.0 c 0.0 -3.038 2.463 -5.5 5.5 -5.5 c 3.038 0.0 5.5 2.462 5.5 5.5 s -2.462 5.5 -5.5 5.5 c -0.315 0.0 -0.624 -0.027 -0.924 -0.077 L 7.34 20.019 c -0.496 0.423 -1.234 0.394 -1.695 -0.067 l -0.09 -0.09 l -1.478 1.477 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 l 1.477 -1.478 l -0.09 -0.09 c -0.46 -0.461 -0.49 -1.199 -0.067 -1.695 l 6.595 -7.734 C 10.527 8.626 10.5 8.316 10.5 8.0 Z M 16.0 4.0 c -2.209 0.0 -4.0 1.79 -4.0 4.0 s 1.791 4.0 4.0 4.0 c 2.21 0.0 4.0 -1.79 4.0 -4.0 s -1.79 -4.0 -4.0 -4.0 Z m -4.859 6.579 c 0.516 0.97 1.313 1.766 2.282 2.281 l -6.88 5.868 l -1.269 -1.269 l 5.867 -6.88 Z")
        )
    }.build()
}
