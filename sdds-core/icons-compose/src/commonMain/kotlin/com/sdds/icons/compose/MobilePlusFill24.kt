package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MobilePlusFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MobilePlusFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.0 6.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 S 12.0 9.538 12.0 6.5 S 14.462 1.0 17.5 1.0 S 23.0 3.462 23.0 6.5 Z m -5.5 -3.75 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.25 h 2.25 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -2.25 V 9.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 7.25 H 14.5 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 h 2.25 V 3.5 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.6 2.0 h 3.21 c -0.673 0.701 -1.19 1.553 -1.497 2.5 H 9.75 C 9.336 4.5 9.0 4.836 9.0 5.25 S 9.336 6.0 9.75 6.0 h 1.269 C 11.006 6.165 11.0 6.332 11.0 6.5 c 0.0 3.59 2.91 6.5 6.5 6.5 c 0.168 0.0 0.335 -0.006 0.5 -0.019 V 18.4 c 0.0 1.26 0.0 1.89 -0.245 2.372 c -0.216 0.423 -0.56 0.767 -0.983 0.983 C 16.29 22.0 15.66 22.0 14.4 22.0 H 9.6 c -1.26 0.0 -1.89 0.0 -2.371 -0.245 c -0.424 -0.216 -0.768 -0.56 -0.984 -0.983 C 6.0 20.29 6.0 19.66 6.0 18.4 V 5.6 c 0.0 -1.26 0.0 -1.89 0.245 -2.371 c 0.216 -0.424 0.56 -0.768 0.984 -0.984 C 7.709 2.0 8.339 2.0 9.6 2.0 Z")
        )
    }.build()
}
