package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRubleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRubleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.259 11.472 C 13.93 10.479 14.323 9.285 14.323 8.0 c 0.0 -3.452 -2.83 -6.25 -6.323 -6.25 c -3.492 0.0 -6.322 2.798 -6.322 6.25 c 0.0 1.285 0.392 2.479 1.064 3.472 h 3.88 V 10.41 H 6.068 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 0.554 V 8.674 H 6.068 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 0.554 V 5.049 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 1.599 c 1.139 0.0 2.062 0.923 2.062 2.062 c 0.0 1.14 -0.923 2.063 -2.062 2.063 H 7.622 V 9.41 h 1.256 c 0.277 0.0 0.5 0.224 0.5 0.5 s -0.223 0.5 -0.5 0.5 H 7.622 v 1.062 h 5.637 Z m -5.343 2.777 L 8.0 14.25 h 0.085 h -0.169 Z M 7.622 7.674 h 1.099 c 0.587 0.0 1.062 -0.476 1.062 -1.063 S 9.308 5.55 8.721 5.55 H 7.622 v 2.125 Z M 1.5 12.535 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 12.996 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 H 1.5 Z")
        )
    }.build()
}
