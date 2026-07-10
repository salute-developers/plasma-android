package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlurFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlurFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m 1.28 -27.22 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 l -13.5 13.5 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 13.5 -13.5 Z m 4.765 1.765 c 0.44 -0.439 0.44 -1.151 0.0 -1.59 c -0.439 -0.44 -1.151 -0.44 -1.59 0.0 l -16.5 16.5 c -0.44 0.439 -0.44 1.151 0.0 1.59 c 0.439 0.44 1.151 0.44 1.59 0.0 l 16.5 -16.5 Z m 6.0 4.41 c -0.439 -0.44 -1.151 -0.44 -1.59 0.0 l -16.5 16.5 c -0.44 0.439 -0.44 1.151 0.0 1.59 c 0.439 0.44 1.151 0.44 1.59 0.0 l 16.5 -16.5 c 0.44 -0.439 0.44 -1.151 0.0 -1.59 Z m 1.235 4.765 c 0.293 0.293 0.293 0.767 0.0 1.06 l -13.5 13.5 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 13.5 -13.5 c 0.293 -0.293 0.767 -0.293 1.06 0.0 Z m -3.485 -8.515 c 0.44 0.439 0.44 1.151 0.0 1.59 l -18.0 18.0 c -0.439 0.44 -1.151 0.44 -1.59 0.0 c -0.44 -0.439 -0.44 -1.151 0.0 -1.59 l 18.0 -18.0 c 0.439 -0.44 1.151 -0.44 1.59 0.0 Z M 29.78 24.53 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 l -5.25 5.25 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 5.25 -5.25 Z M 12.53 6.22 c 0.293 0.293 0.293 0.767 0.0 1.06 l -5.25 5.25 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 5.25 -5.25 c 0.293 -0.293 0.767 -0.293 1.06 0.0 Z")
        )
    }.build()
}
