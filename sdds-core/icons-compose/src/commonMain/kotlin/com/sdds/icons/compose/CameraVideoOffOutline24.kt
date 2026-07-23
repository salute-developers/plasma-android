package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoOffOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoOffOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.53 4.53 c 0.293 -0.292 0.293 -0.767 0.0 -1.06 c -0.292 -0.293 -0.767 -0.293 -1.06 0.0 l -3.416 3.41 C 14.55 6.337 13.832 6.0 13.034 6.0 H 4.76 C 3.235 6.0 2.0 7.235 2.0 8.759 v 6.482 c 0.0 1.266 0.852 2.333 2.014 2.657 L 2.47 19.44 c -0.293 0.292 -0.293 0.767 0.0 1.06 c 0.292 0.294 0.767 0.294 1.06 0.001 l 16.0 -15.97 Z M 5.415 16.5 l 8.576 -8.56 C 13.76 7.67 13.417 7.5 13.035 7.5 H 4.759 C 4.064 7.5 3.5 8.063 3.5 8.759 v 6.482 c 0.0 0.696 0.564 1.259 1.259 1.259 h 0.656 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.035 16.5 H 9.653 l -1.5 1.5 h 4.882 c 1.523 0.0 2.758 -1.235 2.758 -2.759 v -4.88 l -1.5 1.5 v 3.38 c 0.0 0.696 -0.563 1.259 -1.258 1.259 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.0 8.8 c 0.0 -0.85 -1.026 -1.274 -1.625 -0.674 l -3.226 3.225 c -0.362 0.362 -0.373 0.946 -0.025 1.321 l 3.226 3.477 c 0.589 0.635 1.65 0.218 1.65 -0.647 V 8.799 Z")
        )
    }.build()
}
