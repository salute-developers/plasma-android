package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherBrillianceOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherBrillianceOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.476 3.738 L 5.477 3.76 H 1.75 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 0.97 v 4.716 c 0.0 0.472 0.0 0.857 0.026 1.17 c 0.026 0.322 0.082 0.611 0.22 0.88 c 0.215 0.424 0.56 0.768 0.983 0.984 c 0.269 0.137 0.558 0.193 0.88 0.22 c 0.313 0.025 0.698 0.025 1.17 0.025 h 0.896 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 6.02 c -0.498 0.0 -0.842 0.0 -1.109 -0.022 c -0.26 -0.021 -0.404 -0.06 -0.508 -0.114 c -0.236 -0.12 -0.427 -0.311 -0.547 -0.546 c -0.053 -0.105 -0.092 -0.248 -0.114 -0.51 C 3.72 10.298 3.72 9.954 3.72 9.456 V 4.76 h 8.188 v 2.28 c 0.0 0.277 0.224 0.5 0.5 0.5 s 0.5 -0.223 0.5 -0.5 V 4.76 h 0.97 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 10.15 V 3.738 c 0.0 -1.262 -1.073 -2.238 -2.337 -2.238 c -1.264 0.0 -2.338 0.976 -2.338 2.238 Z M 7.814 2.5 c -0.765 0.0 -1.338 0.58 -1.338 1.238 V 3.76 h 2.676 V 3.738 C 9.152 3.08 8.579 2.5 7.814 2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.654 8.385 c -0.054 -0.157 -0.276 -0.157 -0.33 0.0 l -0.396 1.14 c -0.22 0.63 -0.724 1.117 -1.36 1.315 L 8.35 11.22 c -0.164 0.05 -0.164 0.283 0.0 0.334 l 1.217 0.378 c 0.636 0.198 1.14 0.687 1.36 1.316 l 0.396 1.14 c 0.054 0.156 0.276 0.156 0.33 0.0 l 0.397 -1.14 c 0.218 -0.63 0.723 -1.118 1.36 -1.316 l 1.216 -0.378 c 0.164 -0.051 0.164 -0.283 0.0 -0.334 L 13.41 10.84 c -0.636 -0.198 -1.14 -0.686 -1.36 -1.315 l -0.396 -1.14 Z")
        )
    }.build()
}
