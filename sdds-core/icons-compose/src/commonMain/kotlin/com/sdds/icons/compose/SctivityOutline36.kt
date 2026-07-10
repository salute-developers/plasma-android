package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SctivityOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SctivityOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.626 6.44 l 5.788 10.025 l 2.959 -1.708 c -1.442 -2.987 -1.805 -6.253 -1.216 -9.322 c -2.488 -0.428 -5.111 -0.123 -7.531 1.005 Z m 9.712 -0.428 c -0.45 2.512 -0.152 5.17 0.99 7.617 l 5.111 -2.952 c -1.549 -2.212 -3.7 -3.799 -6.101 -4.665 Z m 7.226 6.614 l -5.111 2.951 c 1.549 2.213 3.7 3.8 6.101 4.666 c 0.45 -2.513 0.152 -5.17 -0.99 -7.617 Z m 0.399 9.794 c -2.952 -1.025 -5.599 -2.972 -7.465 -5.714 l -2.959 1.708 l 5.788 10.025 c 2.187 -1.53 3.763 -3.651 4.636 -6.019 Z m -6.585 7.144 L 17.59 19.54 l -2.958 1.708 c 1.441 2.988 1.804 6.254 1.216 9.322 c 2.487 0.428 5.111 0.124 7.53 -1.005 Z m -9.711 0.429 c 0.45 -2.513 0.151 -5.17 -0.99 -7.617 l -5.112 2.951 c 1.549 2.212 3.7 3.8 6.102 4.666 Z M 6.44 23.379 l 5.112 -2.952 c -1.549 -2.212 -3.7 -3.799 -6.102 -4.665 C 5.0 18.274 5.3 20.932 6.44 23.378 Z m -0.398 -9.795 c 2.951 1.025 5.598 2.973 7.465 5.715 l 2.958 -1.709 l -5.788 -10.025 c -2.187 1.531 -3.762 3.652 -4.635 6.02 Z m 4.46 -8.572 c 3.558 -2.054 7.61 -2.485 11.293 -1.522 c 3.742 0.978 7.11 3.396 9.198 7.012 c 2.087 3.616 2.498 7.742 1.474 11.472 c -1.008 3.67 -3.407 6.965 -6.965 9.019 c -3.558 2.054 -7.61 2.484 -11.292 1.522 c -3.742 -0.978 -7.11 -3.397 -9.198 -7.013 S 2.514 17.76 3.538 14.03 c 1.008 -3.67 3.406 -6.964 6.964 -9.018 Z")
        )
    }.build()
}
