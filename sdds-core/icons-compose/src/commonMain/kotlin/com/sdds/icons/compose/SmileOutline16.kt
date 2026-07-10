package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SmileOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SmileOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.002 8.0 c 0.0 -3.313 2.685 -5.998 5.998 -5.998 S 13.998 4.687 13.998 8.0 S 11.313 13.998 8.0 13.998 S 2.002 11.313 2.002 8.0 Z M 8.0 1.002 C 4.135 1.002 1.002 4.135 1.002 8.0 S 4.135 14.998 8.0 14.998 S 14.998 11.865 14.998 8.0 S 11.865 1.002 8.0 1.002 Z M 5.716 7.298 c 0.485 0.0 0.878 -0.393 0.878 -0.878 S 6.201 5.542 5.716 5.542 S 4.838 5.935 4.838 6.42 S 5.23 7.298 5.716 7.298 Z M 11.16 6.42 c 0.0 0.485 -0.393 0.878 -0.878 0.878 S 9.404 6.905 9.404 6.42 s 0.393 -0.878 0.878 -0.878 s 0.878 0.393 0.878 0.878 Z M 5.39 9.506 c -0.138 -0.24 -0.444 -0.321 -0.683 -0.183 c -0.24 0.138 -0.321 0.444 -0.183 0.683 c 0.352 0.61 0.858 1.116 1.468 1.469 c 0.61 0.352 1.302 0.537 2.007 0.537 c 0.704 0.0 1.396 -0.185 2.006 -0.537 c 0.61 -0.353 1.116 -0.86 1.469 -1.47 c 0.138 -0.238 0.056 -0.544 -0.183 -0.682 c -0.24 -0.138 -0.545 -0.056 -0.683 0.183 c -0.265 0.458 -0.645 0.838 -1.103 1.103 c -0.458 0.264 -0.977 0.403 -1.506 0.403 c -0.53 0.0 -1.049 -0.139 -1.507 -0.403 c -0.457 -0.265 -0.838 -0.645 -1.102 -1.103 Z")
        )
    }.build()
}
