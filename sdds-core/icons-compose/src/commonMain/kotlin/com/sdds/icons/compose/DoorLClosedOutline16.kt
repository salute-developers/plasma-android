package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoorLClosedOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoorLClosedOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.798 9.405 c 0.597 0.0 1.08 -0.472 1.08 -1.054 c 0.0 -0.582 -0.483 -1.053 -1.08 -1.053 c -0.596 0.0 -1.08 0.471 -1.08 1.053 s 0.484 1.054 1.08 1.054 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.16 1.002 c -0.277 0.0 -0.515 0.0 -0.71 0.016 C 4.244 1.035 4.04 1.072 3.846 1.17 C 3.555 1.319 3.318 1.557 3.17 1.848 c -0.1 0.195 -0.136 0.398 -0.153 0.604 C 3.0 2.647 3.0 2.885 3.0 3.162 v 9.676 c 0.0 0.277 0.0 0.515 0.016 0.71 c 0.017 0.207 0.054 0.41 0.153 0.604 c 0.149 0.292 0.386 0.529 0.677 0.677 c 0.195 0.1 0.398 0.137 0.604 0.153 c 0.195 0.016 0.433 0.016 0.71 0.016 h 5.677 c 0.277 0.0 0.515 0.0 0.71 -0.016 c 0.207 -0.016 0.41 -0.053 0.604 -0.153 c 0.292 -0.148 0.529 -0.385 0.678 -0.677 c 0.099 -0.194 0.136 -0.397 0.152 -0.603 c 0.016 -0.196 0.016 -0.434 0.016 -0.711 V 3.162 c 0.0 -0.277 0.0 -0.515 -0.015 -0.71 c -0.017 -0.206 -0.054 -0.41 -0.153 -0.604 c -0.15 -0.291 -0.386 -0.529 -0.678 -0.677 c -0.194 -0.1 -0.397 -0.136 -0.603 -0.153 c -0.196 -0.016 -0.434 -0.016 -0.711 -0.016 H 5.16 Z M 4.3 2.062 c 0.03 -0.015 0.087 -0.036 0.231 -0.047 c 0.15 -0.013 0.347 -0.013 0.649 -0.013 h 5.637 c 0.303 0.0 0.5 0.0 0.65 0.013 c 0.143 0.011 0.2 0.032 0.23 0.047 c 0.104 0.053 0.188 0.137 0.24 0.24 c 0.016 0.03 0.036 0.087 0.048 0.231 c 0.012 0.15 0.012 0.347 0.012 0.649 v 9.636 c 0.0 0.303 0.0 0.5 -0.012 0.65 c -0.012 0.143 -0.032 0.2 -0.047 0.23 c -0.053 0.104 -0.137 0.188 -0.24 0.24 c -0.03 0.016 -0.088 0.036 -0.232 0.048 c -0.15 0.012 -0.346 0.012 -0.649 0.012 H 5.18 c -0.302 0.0 -0.499 0.0 -0.649 -0.012 c -0.144 -0.012 -0.2 -0.032 -0.23 -0.048 c -0.104 -0.052 -0.188 -0.136 -0.241 -0.24 c -0.015 -0.03 -0.036 -0.087 -0.047 -0.23 C 4.0 13.317 4.0 13.12 4.0 12.817 V 3.182 C 4.0 2.88 4.0 2.683 4.013 2.533 c 0.011 -0.144 0.032 -0.2 0.047 -0.23 c 0.053 -0.104 0.137 -0.188 0.24 -0.241 Z")
        )
    }.build()
}
