package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.UsbAFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "UsbAFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.43 13.374 C 3.0 14.328 3.0 15.552 3.0 18.0 c 0.0 2.448 0.0 3.672 0.43 4.626 c 0.488 1.086 1.358 1.956 2.444 2.444 C 6.83 25.5 8.052 25.5 10.5 25.5 h 15.0 c 2.448 0.0 3.672 0.0 4.626 -0.43 c 1.086 -0.488 1.956 -1.358 2.445 -2.444 C 33.0 21.672 33.0 20.448 33.0 18.0 c 0.0 -2.448 0.0 -3.671 -0.43 -4.626 c -0.488 -1.086 -1.358 -1.956 -2.444 -2.444 c -0.954 -0.43 -2.178 -0.43 -4.626 -0.43 h -15.0 c -2.448 0.0 -3.671 0.0 -4.626 0.43 c -1.086 0.488 -1.956 1.358 -2.445 2.444 Z m 5.195 5.501 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 18.75 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 8.625 Z")
        )
    }.build()
}
