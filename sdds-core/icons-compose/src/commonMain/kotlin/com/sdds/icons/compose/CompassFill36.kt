package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CompassFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CompassFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m 6.244 -23.285 c 0.326 0.247 0.47 0.667 0.363 1.061 l -2.333 8.586 c -0.269 0.992 -0.91 1.841 -1.788 2.373 l -7.61 4.609 c -0.35 0.212 -0.793 0.19 -1.12 -0.057 c -0.327 -0.246 -0.47 -0.666 -0.363 -1.06 l 2.332 -8.587 c 0.27 -0.99 0.91 -1.84 1.788 -2.373 l 7.61 -4.608 c 0.35 -0.212 0.794 -0.19 1.12 0.056 Z m -8.589 7.45 c 0.068 -0.248 0.181 -0.478 0.333 -0.68 l 4.024 3.032 c -0.152 0.202 -0.342 0.374 -0.562 0.507 l -5.472 3.314 l 1.677 -6.173 Z")
        )
    }.build()
}
