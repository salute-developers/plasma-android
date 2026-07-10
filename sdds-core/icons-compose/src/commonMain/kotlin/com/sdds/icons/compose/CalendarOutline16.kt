package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CalendarOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CalendarOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.515 1.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 0.929 h 5.97 V 1.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 v 0.932 c 0.204 0.005 0.375 0.02 0.53 0.056 c 0.831 0.196 1.48 0.844 1.675 1.675 c 0.06 0.255 0.06 0.55 0.06 0.966 v 0.065 v 6.027 c 0.0 0.472 0.0 0.857 -0.025 1.17 c -0.027 0.322 -0.083 0.611 -0.22 0.88 c -0.216 0.424 -0.56 0.768 -0.984 0.984 c -0.269 0.137 -0.558 0.193 -0.88 0.22 c -0.313 0.025 -0.698 0.025 -1.17 0.025 H 5.03 c -0.472 0.0 -0.857 0.0 -1.17 -0.025 c -0.322 -0.027 -0.611 -0.083 -0.88 -0.22 c -0.424 -0.216 -0.768 -0.56 -0.984 -0.984 c -0.137 -0.269 -0.193 -0.558 -0.22 -0.88 c -0.025 -0.313 -0.025 -0.698 -0.025 -1.17 V 5.194 V 5.129 c 0.0 -0.416 0.0 -0.71 0.06 -0.966 c 0.195 -0.83 0.844 -1.479 1.674 -1.675 c 0.157 -0.036 0.327 -0.05 0.531 -0.056 V 1.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z m 0.0 2.429 c -0.507 0.0 -0.674 0.003 -0.801 0.033 c -0.462 0.108 -0.822 0.469 -0.93 0.93 C 2.753 4.52 2.75 4.686 2.75 5.194 V 6.0 h 10.5 V 5.194 c 0.0 -0.508 -0.003 -0.675 -0.033 -0.802 c -0.109 -0.461 -0.47 -0.822 -0.93 -0.93 c -0.128 -0.03 -0.295 -0.033 -0.802 -0.033 h -6.97 Z M 13.25 7.0 H 2.75 v 4.2 c 0.0 0.498 0.0 0.842 0.022 1.109 c 0.022 0.26 0.06 0.404 0.114 0.509 c 0.12 0.235 0.311 0.426 0.547 0.546 c 0.104 0.053 0.247 0.092 0.508 0.114 C 4.208 13.5 4.551 13.5 5.05 13.5 h 5.9 c 0.498 0.0 0.842 0.0 1.109 -0.022 c 0.26 -0.021 0.404 -0.06 0.509 -0.114 c 0.235 -0.12 0.426 -0.311 0.546 -0.546 c 0.053 -0.105 0.092 -0.248 0.114 -0.51 c 0.022 -0.266 0.022 -0.61 0.022 -1.108 V 7.0 Z")
        )
    }.build()
}
