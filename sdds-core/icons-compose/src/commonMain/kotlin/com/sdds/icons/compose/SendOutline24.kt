package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SendOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SendOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.582 12.673 C 21.838 12.546 22.0 12.286 22.0 12.0 c 0.0 -0.286 -0.162 -0.546 -0.418 -0.673 l -18.25 -9.0 C 3.049 2.187 2.708 2.24 2.48 2.46 C 2.253 2.678 2.186 3.016 2.315 3.305 L 6.179 12.0 l -3.864 8.695 c -0.129 0.289 -0.062 0.627 0.165 0.846 c 0.228 0.219 0.569 0.271 0.852 0.132 l 18.25 -9.0 Z m -14.449 -2.22 L 4.527 4.59 L 19.554 12.0 L 4.527 19.41 l 2.606 -5.863 l 3.287 -1.315 c 0.21 -0.084 0.21 -0.38 0.0 -0.464 l -3.287 -1.315 Z")
        )
    }.build()
}
