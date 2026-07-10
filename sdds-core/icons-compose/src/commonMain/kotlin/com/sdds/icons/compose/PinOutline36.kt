package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.926 11.697 l -1.054 -6.693 h 10.26 l -1.054 6.693 c -0.2 1.268 0.122 2.562 0.892 3.589 l 3.179 4.24 c 0.247 0.33 0.012 0.8 -0.4 0.8 H 10.255 c -0.412 0.0 -0.648 -0.47 -0.4 -0.8 l 3.179 -4.24 c 0.77 -1.027 1.091 -2.321 0.892 -3.589 Z m -1.347 -8.693 c -1.075 0.0 -1.896 0.96 -1.728 2.022 l 1.099 6.982 c 0.116 0.734 -0.07 1.484 -0.516 2.078 l -3.18 4.24 c -1.235 1.648 -0.06 4.0 2.0 4.0 h 6.266 v 8.414 L 18.002 33.0 l 1.482 -2.26 v -8.414 h 6.265 c 2.06 0.0 3.236 -2.352 2.0 -4.0 l -3.18 -4.24 c -0.445 -0.594 -0.631 -1.344 -0.515 -2.078 l 1.099 -6.982 c 0.167 -1.062 -0.654 -2.022 -1.729 -2.022 H 12.58 Z")
        )
    }.build()
}
