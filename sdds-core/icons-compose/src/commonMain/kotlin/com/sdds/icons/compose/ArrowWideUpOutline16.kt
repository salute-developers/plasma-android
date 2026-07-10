package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideUpOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideUpOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.96 6.9 C 12.88 7.082 12.7 7.202 12.5 7.202 h -1.983 v 6.21 c 0.0 0.6 -0.486 1.087 -1.086 1.087 H 6.57 c -0.6 0.0 -1.086 -0.486 -1.086 -1.086 V 7.203 H 3.5 c -0.2 0.0 -0.381 -0.12 -0.46 -0.304 C 2.962 6.715 3.0 6.502 3.14 6.357 l 4.5 -4.703 C 7.733 1.556 7.864 1.5 8.0 1.5 c 0.136 0.0 0.267 0.056 0.361 0.154 l 4.5 4.703 C 13.0 6.502 13.04 6.715 12.96 6.899 Z M 8.0 2.722 l -3.33 3.48 h 1.313 c 0.276 0.0 0.5 0.224 0.5 0.5 v 6.71 c 0.0 0.048 0.038 0.087 0.086 0.087 h 2.862 c 0.048 0.0 0.086 -0.039 0.086 -0.086 V 6.703 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 1.313 L 8.0 2.723 Z")
        )
    }.build()
}
