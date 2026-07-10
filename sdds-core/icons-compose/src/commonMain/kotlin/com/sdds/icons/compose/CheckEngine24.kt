package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CheckEngine24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CheckEngine24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.25 5.5 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 6.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 12.0 v 1.0 h 2.9 c 0.47 0.0 0.85 0.38 0.85 0.85 v 1.15 h 1.65 c 0.47 0.0 0.85 0.38 0.85 0.85 v 1.15 h 0.349 l 0.694 -1.041 c 0.336 -0.505 1.078 -0.505 1.414 0.0 l 0.9 1.35 c 0.093 0.14 0.143 0.304 0.143 0.471 v 3.44 c 0.0 0.167 -0.05 0.332 -0.143 0.471 l -0.9 1.35 c -0.336 0.505 -1.078 0.505 -1.414 0.0 l -0.694 -1.041 H 18.25 v 1.65 c 0.0 0.47 -0.38 0.85 -0.85 0.85 h -5.865 c -0.193 0.0 -0.38 -0.066 -0.53 -0.186 L 8.736 16.75 H 5.6 c -0.47 0.0 -0.85 -0.38 -0.85 -0.85 v -2.4 h -1.0 V 16.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 2.25 16.414 2.25 16.0 V 9.5 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 S 3.75 9.086 3.75 9.5 V 12.0 h 1.0 V 9.6 c 0.0 -0.47 0.38 -0.85 0.85 -0.85 h 1.15 V 8.1 c 0.0 -0.47 0.38 -0.85 0.85 -0.85 h 2.9 v -1.0 H 8.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z m -1.0 9.75 h 2.715 c 0.193 0.0 0.38 0.066 0.53 0.186 l 2.268 1.814 h 4.987 v -1.74 c 0.0 -0.42 0.34 -0.76 0.76 -0.76 h 1.485 c 0.254 0.0 0.491 0.127 0.632 0.338 L 20.0 15.648 l 0.25 -0.375 v -3.046 L 20.0 11.852 l -0.373 0.56 c -0.141 0.211 -0.378 0.338 -0.632 0.338 H 17.51 c -0.42 0.0 -0.76 -0.34 -0.76 -0.76 v -1.24 H 15.1 c -0.47 0.0 -0.85 -0.38 -0.85 -0.85 V 8.75 h -6.0 V 9.4 c 0.0 0.47 -0.38 0.85 -0.85 0.85 H 6.25 v 5.0 Z")
        )
    }.build()
}
