package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MobileFrontFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MobileFrontFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.755 20.771 C 18.0 20.291 18.0 19.662 18.0 18.4 V 5.6 c 0.0 -1.26 0.0 -1.89 -0.245 -2.371 c -0.216 -0.424 -0.56 -0.768 -0.983 -0.984 C 16.29 2.0 15.66 2.0 14.4 2.0 H 9.6 C 8.34 2.0 7.71 2.0 7.229 2.245 C 6.805 2.461 6.46 2.805 6.245 3.23 C 6.0 3.709 6.0 4.339 6.0 5.6 v 12.8 c 0.0 1.26 0.0 1.89 0.245 2.372 c 0.216 0.423 0.56 0.767 0.984 0.983 C 7.709 22.0 8.339 22.0 9.6 22.0 h 4.8 c 1.26 0.0 1.89 0.0 2.371 -0.245 c 0.424 -0.216 0.768 -0.56 0.984 -0.983 Z M 10.75 4.5 C 10.336 4.5 10.0 4.836 10.0 5.25 S 10.336 6.0 10.75 6.0 h 2.5 C 13.664 6.0 14.0 5.664 14.0 5.25 S 13.664 4.5 13.25 4.5 h -2.5 Z")
        )
    }.build()
}
