package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PowerWireDashOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PowerWireDashOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.974 12.444 c 0.016 0.112 0.023 0.227 0.023 0.343 v 5.34 c 0.0 2.036 -0.885 3.97 -2.426 5.3 l -2.732 2.358 c -0.11 0.095 -0.174 0.234 -0.174 0.38 v 6.832 h -7.332 v -6.833 c 0.0 -0.145 -0.064 -0.284 -0.174 -0.379 l -0.282 -0.243 l 1.418 -1.418 l 0.172 0.148 c 0.55 0.474 0.866 1.165 0.866 1.892 v 4.833 h 3.332 v -4.833 c 0.0 -0.727 0.317 -1.418 0.867 -1.893 l 2.733 -2.358 c 1.1 -0.95 1.732 -2.332 1.732 -3.785 V 14.42 l 1.977 -1.977 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.57 3.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 6.26 l 6.18 -6.18 c 0.391 -0.39 1.024 -0.39 1.415 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.709 30.95 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 6.61 -6.61 C 9.687 21.636 9.0 19.92 9.0 18.129 v -5.34 c 0.0 -1.382 1.12 -2.5 2.5 -2.5 h 0.928 V 4.0 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 6.287 h 7.14 V 4.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z M 11.5 12.287 c -0.275 0.0 -0.5 0.224 -0.5 0.5 v 5.34 c 0.001 1.26 0.476 2.466 1.32 3.384 l 9.224 -9.224 H 11.5 Z")
        )
    }.build()
}
