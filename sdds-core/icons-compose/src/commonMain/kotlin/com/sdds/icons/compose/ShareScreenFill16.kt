package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShareScreenFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShareScreenFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.643 1.401 C 7.737 1.304 7.866 1.25 8.0 1.25 c 0.134 0.0 0.264 0.054 0.358 0.15 l 2.083 2.138 c 0.193 0.197 0.189 0.514 -0.009 0.707 c -0.198 0.193 -0.514 0.189 -0.707 -0.01 L 8.501 2.98 V 5.49 h 3.824 c 1.063 0.0 1.925 0.862 1.925 1.925 v 5.41 c 0.0 1.063 -0.862 1.925 -1.925 1.925 h -8.65 c -1.063 0.0 -1.925 -0.862 -1.925 -1.925 v -5.41 c 0.0 -1.063 0.862 -1.925 1.925 -1.925 h 3.826 V 2.98 L 6.275 4.235 C 6.083 4.434 5.766 4.438 5.568 4.245 C 5.371 4.052 5.367 3.735 5.56 3.538 L 7.643 1.4 Z M 7.5 5.495 V 9.23 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 5.494 h -1.0 Z")
        )
    }.build()
}
