package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DropOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DropOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.49 1.218 l -0.114 -0.09 c -0.22 -0.17 -0.531 -0.17 -0.752 0.0 L 7.396 1.31 L 7.26 1.424 C 7.124 1.54 6.976 1.67 6.821 1.813 C 6.227 2.353 5.635 2.96 5.081 3.626 C 3.474 5.56 2.5 7.576 2.5 9.6 C 2.5 12.582 4.963 15.0 8.0 15.0 s 5.5 -2.418 5.5 -5.4 c 0.0 -2.024 -0.974 -4.041 -2.582 -5.974 c -0.554 -0.665 -1.146 -1.273 -1.738 -1.813 C 9.024 1.67 8.876 1.54 8.739 1.423 L 8.49 1.219 Z M 8.096 2.189 L 8.0 2.11 L 7.907 2.189 C 7.779 2.296 7.64 2.418 7.494 2.55 C 6.932 3.064 6.373 3.64 5.851 4.266 C 4.321 6.105 3.5 7.9 3.5 9.6 C 3.5 12.013 5.498 14.0 8.0 14.0 s 4.5 -1.987 4.5 -4.4 c 0.0 -1.7 -0.82 -3.495 -2.351 -5.334 C 9.627 3.639 9.068 3.064 8.506 2.55 C 8.36 2.418 8.223 2.298 8.096 2.19 Z")
        )
    }.build()
}
