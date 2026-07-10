package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Pressure116: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Pressure116",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.418 8.476 c 0.147 -0.13 0.358 -0.162 0.537 -0.082 c 0.18 0.08 0.295 0.26 0.295 0.456 v 5.6 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 9.964 L 6.982 11.09 c -0.206 0.183 -0.522 0.165 -0.706 -0.042 c -0.183 -0.206 -0.164 -0.522 0.042 -0.706 l 2.1 -1.867 Z")
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
