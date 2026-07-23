package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RewindBackwardOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RewindBackwardOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.57 5.842 C 20.07 4.918 22.0 5.997 22.0 7.757 v 8.486 c 0.0 1.76 -1.93 2.84 -3.43 1.916 L 13.0 14.729 v 1.514 c 0.0 1.76 -1.93 2.84 -3.43 1.916 l -6.89 -4.243 c -1.426 -0.879 -1.426 -2.953 0.0 -3.832 l 6.89 -4.242 C 11.07 4.918 13.0 5.997 13.0 7.757 v 1.515 l 5.57 -3.43 Z M 13.0 11.034 v 1.933 l 6.357 3.915 c 0.5 0.307 1.143 -0.052 1.143 -0.639 V 7.757 c 0.0 -0.586 -0.643 -0.946 -1.143 -0.638 L 13.0 11.034 Z m -1.5 -3.277 c 0.0 -0.586 -0.643 -0.946 -1.143 -0.638 l -6.89 4.243 c -0.475 0.293 -0.475 0.984 0.0 1.277 l 6.89 4.243 c 0.5 0.307 1.143 -0.052 1.143 -0.639 V 7.757 Z")
        )
    }.build()
}
