package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CalendarFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CalendarFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.53 1.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 0.932 c 0.227 0.005 0.417 0.02 0.588 0.063 c 0.808 0.201 1.438 0.832 1.639 1.64 c 0.067 0.269 0.067 0.58 0.067 1.02 v 6.066 c 0.0 0.472 0.0 0.857 -0.025 1.169 c -0.026 0.322 -0.083 0.612 -0.22 0.881 c -0.216 0.424 -0.56 0.768 -0.983 0.984 c -0.27 0.137 -0.56 0.193 -0.882 0.22 c -0.312 0.025 -0.697 0.025 -1.17 0.025 H 4.957 c -0.472 0.0 -0.857 0.0 -1.169 -0.025 c -0.323 -0.027 -0.612 -0.083 -0.882 -0.22 c -0.423 -0.216 -0.767 -0.56 -0.983 -0.984 c -0.137 -0.269 -0.193 -0.559 -0.22 -0.881 c -0.025 -0.313 -0.025 -0.697 -0.025 -1.17 V 5.155 c 0.0 -0.439 0.0 -0.75 0.066 -1.02 c 0.201 -0.807 0.832 -1.438 1.64 -1.639 c 0.171 -0.043 0.36 -0.058 0.588 -0.063 V 1.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 v 0.929 h 6.058 V 1.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z M 2.676 6.286 V 11.2 c 0.0 0.498 0.0 0.842 0.022 1.109 c 0.022 0.26 0.061 0.403 0.115 0.508 c 0.12 0.236 0.31 0.426 0.545 0.546 c 0.105 0.054 0.248 0.093 0.51 0.114 C 4.134 13.5 4.478 13.5 4.976 13.5 h 6.046 c 0.499 0.0 0.843 0.0 1.11 -0.023 c 0.26 -0.02 0.404 -0.06 0.509 -0.114 c 0.235 -0.12 0.426 -0.31 0.546 -0.546 c 0.053 -0.105 0.092 -0.248 0.114 -0.508 c 0.022 -0.267 0.022 -0.61 0.022 -1.109 V 6.286 H 2.677 Z")
        )
    }.build()
}
