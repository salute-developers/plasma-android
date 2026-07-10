package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Pressure1016: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Pressure1016",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.11 8.508 c 0.14 -0.15 0.358 -0.198 0.548 -0.123 c 0.191 0.076 0.317 0.26 0.317 0.465 v 5.6 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 v -4.335 L 5.09 11.059 C 4.9 11.26 4.584 11.27 4.383 11.082 c -0.201 -0.19 -0.212 -0.506 -0.024 -0.707 l 1.75 -1.867 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.675 8.35 c 0.662 0.0 1.2 0.537 1.2 1.2 v 4.2 c 0.0 0.662 -0.537 1.2 -1.2 1.2 h -1.4 c -0.662 0.0 -1.2 -0.538 -1.2 -1.2 v -4.2 c 0.0 -0.663 0.538 -1.2 1.2 -1.2 h 1.4 Z m -1.4 1.0 c -0.11 0.0 -0.2 0.09 -0.2 0.2 v 4.2 c 0.0 0.11 0.09 0.2 0.2 0.2 h 1.4 c 0.11 0.0 0.2 -0.09 0.2 -0.2 v -4.2 c 0.0 -0.11 -0.09 -0.2 -0.2 -0.2 h -1.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.26 1.0 c 1.044 0.0 1.89 0.846 1.89 1.89 c 0.0 1.043 -0.846 1.889 -1.89 1.889 H 4.0 v 1.97 c 0.0 0.277 -0.224 0.5 -0.5 0.5 S 3.0 7.027 3.0 6.75 V 1.5 C 3.0 1.225 3.224 1.0 3.5 1.0 h 1.76 Z M 4.0 3.779 h 1.26 c 0.492 0.0 0.89 -0.398 0.89 -0.89 C 6.15 2.4 5.752 2.0 5.26 2.0 H 4.0 v 1.78 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.197 1.204 c 0.128 -0.174 0.354 -0.247 0.559 -0.18 C 12.96 1.091 13.1 1.284 13.1 1.5 v 5.25 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 3.027 l -1.022 1.394 c -0.094 0.128 -0.244 0.204 -0.403 0.204 c -0.16 0.0 -0.31 -0.076 -0.404 -0.204 L 9.25 3.027 V 6.75 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 1.5 c 0.0 -0.216 0.14 -0.409 0.345 -0.476 c 0.205 -0.067 0.43 0.006 0.558 0.18 l 1.522 2.074 l 1.522 -2.074 Z")
        )
    }.build()
}
