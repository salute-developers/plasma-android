package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HelpCircleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HelpCircleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 6.879 4.958 C 6.649 5.136 6.425 5.484 6.425 6.25 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 c 0.0 -0.984 0.3 -1.686 0.859 -2.12 C 6.766 3.715 7.434 3.624 8.0 3.624 c 0.566 0.0 1.234 0.09 1.766 0.504 c 0.559 0.435 0.859 1.137 0.859 2.121 c 0.0 1.15 -0.727 1.726 -1.26 2.126 c -0.593 0.445 -0.84 0.637 -0.84 1.024 C 8.525 9.69 8.29 9.925 8.0 9.925 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 c 0.0 -0.937 0.687 -1.442 1.152 -1.784 l 0.108 -0.08 C 9.252 7.15 9.575 6.85 9.575 6.25 c 0.0 -0.766 -0.225 -1.114 -0.454 -1.292 C 8.866 4.76 8.484 4.675 8.0 4.675 S 7.134 4.759 6.879 4.958 Z M 8.7 11.15 c 0.0 0.387 -0.313 0.7 -0.7 0.7 c -0.387 0.0 -0.7 -0.313 -0.7 -0.7 c 0.0 -0.387 0.313 -0.7 0.7 -0.7 c 0.387 0.0 0.7 0.313 0.7 0.7 Z")
        )
    }.build()
}
