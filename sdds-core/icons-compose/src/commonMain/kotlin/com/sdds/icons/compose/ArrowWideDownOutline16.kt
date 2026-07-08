package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideDownOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideDownOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.04 9.1 C 3.12 8.918 3.3 8.798 3.5 8.798 h 1.983 v -6.21 c 0.0 -0.6 0.486 -1.087 1.086 -1.087 h 2.862 c 0.6 0.0 1.086 0.486 1.086 1.086 v 6.211 H 12.5 c 0.2 0.0 0.381 0.12 0.46 0.304 c 0.079 0.184 0.04 0.397 -0.099 0.542 l -4.5 4.703 C 8.267 14.444 8.136 14.5 8.0 14.5 c -0.136 0.0 -0.267 -0.056 -0.361 -0.154 l -4.5 -4.703 C 3.0 9.498 2.962 9.285 3.04 9.101 Z M 8.0 13.278 l 3.33 -3.48 h -1.313 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 v -6.71 C 9.517 2.538 9.48 2.5 9.431 2.5 H 6.57 c -0.048 0.0 -0.086 0.039 -0.086 0.086 v 6.711 c 0.0 0.276 -0.224 0.5 -0.5 0.5 H 4.67 L 8.0 13.277 Z")
        )
    }.build()
}
