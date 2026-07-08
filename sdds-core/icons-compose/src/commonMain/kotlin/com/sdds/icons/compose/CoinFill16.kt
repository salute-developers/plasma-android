package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.258 11.472 c 0.673 -0.993 1.065 -2.187 1.065 -3.472 c 0.0 -3.452 -2.83 -6.25 -6.323 -6.25 c -3.492 0.0 -6.322 2.798 -6.322 6.25 c 0.0 1.285 0.392 2.479 1.064 3.472 h 10.516 Z M 7.934 14.25 H 8.0 h 0.067 h -0.133 Z M 7.5 4.354 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 c 0.549 0.0 1.093 0.107 1.6 0.315 c 0.508 0.208 0.97 0.513 1.36 0.898 c 0.388 0.384 0.697 0.841 0.908 1.345 C 12.08 6.915 12.19 7.455 12.19 8.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 c 0.0 -0.412 -0.082 -0.82 -0.242 -1.202 c -0.16 -0.38 -0.394 -0.728 -0.69 -1.02 C 9.961 5.486 9.61 5.253 9.223 5.095 C 8.835 4.936 8.42 4.855 8.0 4.855 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z M 1.5 12.534 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 12.996 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 H 1.5 Z")
        )
    }.build()
}
