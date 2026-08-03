package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShadowUpOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShadowUpOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.5 3.0 C 27.985 3.0 30.0 5.015 30.0 7.5 v 5.0 h -0.007 l 0.001 0.019 L 30.0 12.75 V 28.5 c 0.0 2.485 -2.015 4.5 -4.5 4.5 h -15.0 C 8.015 33.0 6.0 30.985 6.0 28.5 V 12.75 l 0.006 -0.231 V 12.5 H 6.0 v -5.0 l 0.006 -0.231 C 6.126 4.89 8.092 3.0 10.5 3.0 h 15.0 Z m -15.0 7.25 c -1.38 0.0 -2.5 1.12 -2.5 2.5 V 28.5 c 0.0 1.38 1.12 2.5 2.5 2.5 h 15.0 c 1.38 0.0 2.5 -1.12 2.5 -2.5 V 12.75 c 0.0 -1.38 -1.12 -2.5 -2.5 -2.5 h -15.0 Z m 1.62 -5.75 L 7.5 9.12 v 0.276 c 0.785 -0.703 1.819 -1.133 2.953 -1.145 L 14.205 4.5 H 12.12 Z m 13.423 3.751 c 0.83 0.008 1.606 0.24 2.27 0.64 L 28.5 8.205 V 7.5 c 0.0 -0.625 -0.192 -1.205 -0.52 -1.686 l -2.437 2.437 Z M 15.795 4.5 l -3.75 3.75 h 2.91 l 3.75 -3.75 h -2.91 Z m -5.295 0.0 c -1.657 0.0 -3.0 1.343 -3.0 3.0 v 0.03 l 3.03 -3.03 H 10.5 Z m 8.955 3.75 l 3.75 -3.75 h -2.91 l -3.75 3.75 h 2.91 Z m 7.73 -3.23 c -0.48 -0.328 -1.06 -0.52 -1.685 -0.52 h -0.705 l -3.75 3.75 h 2.91 l 3.23 -3.23 Z")
        )
    }.build()
}
