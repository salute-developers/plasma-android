package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoorLOpenFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoorLOpenFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.217 2.604 c 1.688 -0.482 3.373 0.767 3.373 2.5 v 0.369 h 4.91 c 1.38 0.0 2.5 1.12 2.5 2.5 v 20.055 c 0.0 1.38 -1.12 2.5 -2.5 2.5 h -4.91 v 0.367 c 0.0 1.734 -1.685 2.983 -3.373 2.5 L 7.905 30.167 C 6.777 29.844 6.0 28.825 6.0 27.666 V 8.334 c 0.0 -1.159 0.777 -2.178 1.905 -2.5 l 11.312 -3.23 Z m 3.373 25.924 h 4.91 c 0.276 0.0 0.5 -0.224 0.5 -0.5 V 7.973 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -4.91 v 21.055 Z m -6.033 -10.527 c 0.0 0.821 -0.675 1.487 -1.508 1.487 S 13.54 18.822 13.54 18.0 c 0.0 -0.821 0.675 -1.487 1.508 -1.487 S 16.557 17.18 16.557 18.0 Z")
        )
    }.build()
}
