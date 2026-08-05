package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PowerWireOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PowerWireOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.428 4.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 c -0.553 0.0 -1.0 0.448 -1.0 1.0 v 6.287 H 11.5 c -1.38 0.0 -2.5 1.119 -2.5 2.5 v 5.34 c 0.0 2.036 0.886 3.97 2.426 5.3 l 2.733 2.358 c 0.11 0.095 0.173 0.233 0.173 0.379 v 6.833 h 7.333 v -6.833 c 0.0 -0.146 0.063 -0.284 0.173 -0.379 l 2.733 -2.358 c 1.54 -1.33 2.426 -3.264 2.426 -5.3 v -5.34 c 0.0 -1.381 -1.12 -2.5 -2.5 -2.5 h -0.928 V 4.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 6.287 h -7.141 V 4.0 Z M 11.0 12.787 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 12.997 c 0.276 0.0 0.5 0.224 0.5 0.5 v 5.34 c 0.0 1.454 -0.633 2.836 -1.733 3.786 L 20.53 24.27 c -0.55 0.475 -0.866 1.166 -0.866 1.893 v 4.833 h -3.333 v -4.833 c 0.0 -0.727 -0.316 -1.418 -0.866 -1.893 l -2.733 -2.358 C 11.633 20.963 11.0 19.58 11.0 18.128 v -5.341 Z")
        )
    }.build()
}
