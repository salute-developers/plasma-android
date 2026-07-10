package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoorROpenFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoorROpenFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.783 2.604 c -1.688 -0.482 -3.373 0.767 -3.373 2.5 v 0.369 H 8.5 c -1.38 0.0 -2.5 1.12 -2.5 2.5 v 20.055 c 0.0 1.38 1.12 2.5 2.5 2.5 h 4.91 v 0.367 c 0.0 1.734 1.685 2.983 3.373 2.5 l 11.311 -3.229 c 1.13 -0.322 1.906 -1.341 1.906 -2.5 V 8.334 c 0.0 -1.159 -0.777 -2.178 -1.905 -2.5 l -11.312 -3.23 Z M 13.41 28.528 H 8.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 V 7.973 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 4.91 v 21.055 Z m 6.033 -10.527 c 0.0 0.821 0.675 1.487 1.508 1.487 S 22.46 18.822 22.46 18.0 c 0.0 -0.821 -0.675 -1.487 -1.508 -1.487 S 19.443 17.18 19.443 18.0 Z")
        )
    }.build()
}
