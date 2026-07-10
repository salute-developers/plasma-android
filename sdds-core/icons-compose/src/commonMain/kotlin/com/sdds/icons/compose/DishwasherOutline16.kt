package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.211 3.783 c 0.0 0.388 -0.312 0.703 -0.697 0.703 c -0.384 0.0 -0.696 -0.315 -0.696 -0.703 c 0.0 -0.388 0.312 -0.702 0.696 -0.702 c 0.385 0.0 0.697 0.314 0.697 0.702 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.52 3.283 c -0.275 0.0 -0.5 0.224 -0.5 0.5 s 0.225 0.5 0.5 0.5 h 3.136 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 8.521 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.029 1.0 c -0.472 0.0 -0.857 0.0 -1.17 0.026 c -0.322 0.026 -0.611 0.082 -0.88 0.22 C 2.555 1.46 2.21 1.805 1.995 2.228 c -0.137 0.269 -0.193 0.558 -0.22 0.88 C 1.75 3.423 1.75 3.808 1.75 4.28 v 7.438 c 0.0 0.473 0.0 0.857 0.026 1.17 c 0.026 0.322 0.082 0.611 0.22 0.88 c 0.215 0.424 0.56 0.769 0.983 0.984 c 0.269 0.138 0.558 0.194 0.88 0.22 c 0.313 0.025 0.698 0.025 1.17 0.025 h 5.939 c 0.472 0.0 0.857 0.0 1.169 -0.025 c 0.322 -0.027 0.612 -0.082 0.881 -0.22 c 0.423 -0.215 0.768 -0.56 0.983 -0.983 c 0.138 -0.27 0.194 -0.559 0.22 -0.882 c 0.026 -0.312 0.026 -0.696 0.026 -1.168 v -7.44 c 0.0 -0.471 0.0 -0.856 -0.026 -1.168 c -0.026 -0.323 -0.082 -0.612 -0.22 -0.881 c -0.215 -0.424 -0.56 -0.768 -0.983 -0.984 c -0.27 -0.137 -0.559 -0.193 -0.881 -0.22 C 11.824 1.0 11.44 1.0 10.967 1.0 H 5.03 Z M 3.433 2.136 C 3.537 2.083 3.68 2.043 3.94 2.022 C 4.208 2.0 4.551 2.0 5.05 2.0 h 5.897 c 0.498 0.0 0.842 0.0 1.108 0.022 c 0.261 0.022 0.404 0.06 0.51 0.114 c 0.234 0.12 0.426 0.311 0.545 0.547 c 0.054 0.104 0.093 0.247 0.115 0.508 c 0.021 0.267 0.022 0.61 0.022 1.109 v 0.915 H 2.75 V 4.3 c 0.0 -0.498 0.0 -0.842 0.022 -1.109 c 0.022 -0.26 0.06 -0.404 0.114 -0.508 c 0.12 -0.236 0.311 -0.427 0.547 -0.547 Z M 2.75 6.216 v 5.48 c 0.0 0.499 0.0 0.842 0.022 1.11 c 0.022 0.26 0.06 0.403 0.114 0.508 c 0.12 0.235 0.311 0.426 0.547 0.546 c 0.104 0.054 0.247 0.093 0.508 0.114 c 0.267 0.022 0.61 0.022 1.109 0.022 h 5.897 c 0.498 0.0 0.842 0.0 1.108 -0.022 c 0.261 -0.021 0.404 -0.06 0.51 -0.114 c 0.234 -0.12 0.426 -0.31 0.545 -0.546 c 0.054 -0.105 0.093 -0.248 0.115 -0.509 c 0.021 -0.267 0.022 -0.61 0.022 -1.109 v -5.48 H 2.75 Z")
        )
    }.build()
}
