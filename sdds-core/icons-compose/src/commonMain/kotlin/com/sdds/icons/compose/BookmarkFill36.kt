package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookmarkFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookmarkFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.822 4.5 h 6.356 c 0.938 0.0 1.705 0.0 2.328 0.055 c 0.645 0.057 1.228 0.179 1.772 0.479 c 0.852 0.47 1.545 1.218 1.979 2.14 c 0.277 0.589 0.39 1.219 0.442 1.917 c 0.051 0.674 0.051 1.504 0.051 2.519 v 15.426 c 0.0 0.757 0.0 1.402 -0.042 1.906 c -0.042 0.496 -0.137 1.087 -0.49 1.566 c -0.464 0.628 -1.166 0.993 -1.908 0.992 c -0.567 0.0 -1.053 -0.29 -1.437 -0.564 c -0.39 -0.28 -0.856 -0.682 -1.402 -1.155 l -1.643 -1.422 c -0.633 -0.548 -1.064 -0.92 -1.422 -1.186 c -0.347 -0.257 -0.566 -0.37 -0.756 -0.426 c -0.425 -0.127 -0.875 -0.127 -1.3 0.0 c -0.19 0.057 -0.409 0.169 -0.756 0.426 c -0.358 0.266 -0.789 0.638 -1.422 1.186 L 13.53 29.78 c -0.546 0.473 -1.012 0.876 -1.402 1.155 c -0.384 0.274 -0.87 0.563 -1.437 0.564 c -0.742 0.0 -1.444 -0.364 -1.908 -0.992 c -0.353 -0.48 -0.448 -1.07 -0.49 -1.566 c -0.042 -0.504 -0.042 -1.15 -0.042 -1.906 V 11.61 c 0.0 -1.015 0.0 -1.845 0.05 -2.519 c 0.054 -0.698 0.166 -1.328 0.443 -1.917 c 0.434 -0.922 1.127 -1.67 1.979 -2.14 c 0.544 -0.3 1.127 -0.422 1.772 -0.479 C 13.117 4.5 13.884 4.5 14.822 4.5 Z")
        )
    }.build()
}
