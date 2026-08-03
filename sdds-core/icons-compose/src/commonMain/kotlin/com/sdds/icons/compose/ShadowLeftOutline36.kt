package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShadowLeftOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShadowLeftOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.5 6.0 v 0.007 L 12.46 6.01 l 0.059 -0.004 L 12.75 6.0 H 28.5 c 2.485 0.0 4.5 2.015 4.5 4.5 v 15.0 c 0.0 2.485 -2.015 4.5 -4.5 4.5 H 12.75 l -0.231 -0.006 c -0.03 -0.001 -0.06 -0.005 -0.088 -0.007 l 0.069 0.006 V 30.0 h -5.0 l -0.231 -0.006 C 4.89 29.874 3.0 27.908 3.0 25.5 v -15.0 C 3.0 8.015 5.015 6.0 7.5 6.0 h 5.0 Z m -8.0 17.88 l 4.62 4.62 h 0.276 c -0.703 -0.786 -1.134 -1.82 -1.145 -2.954 L 4.5 21.795 v 2.085 Z m 0.0 1.62 c 0.0 1.657 1.343 3.0 3.0 3.0 h 0.03 L 4.5 25.47 v 0.03 Z M 12.75 8.0 c -1.38 0.0 -2.5 1.12 -2.5 2.5 v 15.0 c 0.0 1.38 1.12 2.5 2.5 2.5 H 28.5 c 1.38 0.0 2.5 -1.12 2.5 -2.5 v -15.0 C 31.0 9.12 29.88 8.0 28.5 8.0 H 12.75 Z M 4.5 20.205 l 3.75 3.75 v -2.91 l -3.75 -3.75 v 2.91 Z m 0.0 -4.5 l 3.75 3.75 v -2.91 l -3.75 -3.75 v 2.91 Z m 0.52 -6.89 C 4.692 9.294 4.5 9.874 4.5 10.5 v 0.705 l 3.75 3.75 v -2.91 l -3.23 -3.23 Z M 7.5 7.5 c -0.625 0.0 -1.205 0.192 -1.686 0.52 l 2.437 2.436 c 0.008 -0.83 0.24 -1.606 0.64 -2.27 L 8.205 7.5 H 7.5 Z")
        )
    }.build()
}
