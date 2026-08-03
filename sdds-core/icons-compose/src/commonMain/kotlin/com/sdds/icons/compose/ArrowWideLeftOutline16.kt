package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideLeftOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideLeftOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.9 3.04 C 7.082 3.12 7.202 3.3 7.202 3.5 v 1.983 h 6.21 c 0.6 0.0 1.087 0.486 1.087 1.086 v 2.862 c 0.0 0.6 -0.486 1.086 -1.086 1.086 H 7.203 V 12.5 c 0.0 0.2 -0.12 0.381 -0.304 0.46 C 6.715 13.039 6.502 13.0 6.357 12.86 l -4.703 -4.5 C 1.556 8.267 1.5 8.136 1.5 8.0 c 0.0 -0.136 0.056 -0.267 0.154 -0.361 l 4.703 -4.5 C 6.502 3.0 6.715 2.962 6.899 3.04 Z M 2.722 8.0 l 3.48 3.33 v -1.313 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 6.71 c 0.048 0.0 0.087 -0.038 0.087 -0.086 V 6.57 c 0.0 -0.048 -0.039 -0.086 -0.086 -0.086 H 6.703 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 V 4.67 L 2.723 8.0 Z")
        )
    }.build()
}
