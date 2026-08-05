package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideRightOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideRightOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.1 12.96 C 8.918 12.88 8.798 12.7 8.798 12.5 v -1.983 h -6.21 c -0.6 0.0 -1.087 -0.486 -1.087 -1.086 V 6.57 c 0.0 -0.6 0.486 -1.086 1.086 -1.086 h 6.211 V 3.5 c 0.0 -0.2 0.12 -0.381 0.304 -0.46 C 9.285 2.962 9.498 3.0 9.643 3.14 l 4.703 4.5 C 14.444 7.733 14.5 7.864 14.5 8.0 c 0.0 0.136 -0.056 0.267 -0.154 0.361 l -4.703 4.5 C 9.498 13.0 9.285 13.04 9.101 12.96 Z M 13.278 8.0 l -3.48 -3.33 v 1.313 c 0.0 0.276 -0.224 0.5 -0.5 0.5 h -6.71 C 2.538 6.483 2.5 6.52 2.5 6.569 v 2.862 c 0.0 0.048 0.039 0.086 0.086 0.086 h 6.711 c 0.276 0.0 0.5 0.224 0.5 0.5 v 1.313 L 13.277 8.0 Z")
        )
    }.build()
}
