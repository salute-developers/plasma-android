package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryHorizEmptyFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryHorizEmptyFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.0 6.655 c 0.0 -0.387 -0.313 -0.7 -0.7 -0.7 h -0.784 c -0.036 -0.183 -0.087 -0.339 -0.16 -0.482 c -0.215 -0.421 -0.558 -0.764 -0.98 -0.979 c -0.478 -0.244 -1.105 -0.244 -2.36 -0.244 H 4.584 c -1.255 0.0 -1.882 0.0 -2.36 0.244 c -0.422 0.215 -0.765 0.558 -0.98 0.98 C 1.0 5.951 1.0 6.578 1.0 7.833 v 0.332 c 0.0 1.255 0.0 1.882 0.244 2.36 c 0.215 0.422 0.558 0.765 0.98 0.98 c 0.478 0.244 1.105 0.244 2.36 0.244 h 5.432 c 1.255 0.0 1.882 0.0 2.36 -0.244 c 0.422 -0.215 0.765 -0.558 0.98 -0.98 c 0.073 -0.142 0.124 -0.298 0.16 -0.48 H 14.3 c 0.387 0.0 0.7 -0.314 0.7 -0.7 V 6.654 Z")
        )
    }.build()
}
