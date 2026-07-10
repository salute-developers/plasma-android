package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 28.5 21.024 V 10.881 L 15.0 14.735 v 13.393 C 15.0 30.818 12.817 33.0 10.125 33.0 S 5.25 30.819 5.25 28.128 c 0.0 -2.69 2.183 -4.872 4.875 -4.872 c 0.966 0.0 1.867 0.281 2.625 0.766 V 9.587 c 0.0 -1.506 0.999 -2.83 2.448 -3.243 l 11.25 -3.212 c 2.156 -0.616 4.302 1.002 4.302 3.243 V 25.13 c 0.0 2.69 -2.183 4.872 -4.875 4.872 S 21.0 27.82 21.0 25.13 c 0.0 -2.69 2.183 -4.872 4.875 -4.872 c 0.966 0.0 1.867 0.281 2.625 0.766 Z")
        )
    }.build()
}
