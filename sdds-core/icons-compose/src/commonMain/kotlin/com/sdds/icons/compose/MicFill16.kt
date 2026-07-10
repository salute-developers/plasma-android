package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.725 1.0 c -1.353 0.0 -2.45 1.175 -2.45 2.625 v 4.2 c 0.0 1.45 1.097 2.625 2.45 2.625 c 1.353 0.0 2.45 -1.175 2.45 -2.625 v -4.2 C 10.175 2.175 9.078 1.0 7.725 1.0 Z M 4.021 8.308 C 3.985 8.034 3.733 7.841 3.46 7.878 c -0.274 0.036 -0.467 0.287 -0.43 0.56 c 0.148 1.131 0.703 2.169 1.56 2.92 c 0.731 0.642 1.64 1.038 2.599 1.14 v 1.627 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 v -1.627 c 0.959 -0.102 1.868 -0.498 2.599 -1.14 c 0.857 -0.751 1.412 -1.789 1.56 -2.92 c 0.037 -0.273 -0.156 -0.524 -0.43 -0.56 c -0.273 -0.037 -0.525 0.156 -0.56 0.43 c -0.118 0.89 -0.555 1.707 -1.23 2.299 c -0.674 0.592 -1.541 0.918 -2.439 0.918 c -0.898 0.0 -1.765 -0.326 -2.44 -0.918 c -0.674 -0.592 -1.111 -1.409 -1.228 -2.299 Z")
        )
    }.build()
}
