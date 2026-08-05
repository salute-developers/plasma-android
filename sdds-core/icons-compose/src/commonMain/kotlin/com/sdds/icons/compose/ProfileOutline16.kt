package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.998 2.25 c -1.357 0.0 -2.474 1.126 -2.474 2.535 c 0.0 1.41 1.117 2.536 2.474 2.536 c 1.357 0.0 2.474 -1.126 2.474 -2.536 c 0.0 -1.41 -1.117 -2.535 -2.474 -2.535 Z M 4.524 4.785 c 0.0 -1.943 1.546 -3.535 3.474 -3.535 c 1.928 0.0 3.474 1.592 3.474 3.535 S 9.926 8.321 7.998 8.321 c -1.928 0.0 -3.474 -1.593 -3.474 -3.536 Z M 8.0 10.465 c -1.825 0.0 -3.522 0.557 -4.937 1.516 c -0.217 0.146 -0.333 0.391 -0.31 0.63 c 0.023 0.228 0.06 0.36 0.11 0.457 c 0.12 0.235 0.311 0.426 0.546 0.546 c 0.105 0.053 0.248 0.093 0.509 0.114 c 0.267 0.022 0.61 0.022 1.109 0.022 h 5.947 c 0.499 0.0 0.842 0.0 1.11 -0.022 c 0.26 -0.021 0.403 -0.06 0.508 -0.114 c 0.235 -0.12 0.426 -0.311 0.546 -0.546 c 0.05 -0.098 0.088 -0.229 0.11 -0.457 c 0.023 -0.238 -0.093 -0.482 -0.31 -0.629 c -1.415 -0.96 -3.113 -1.517 -4.938 -1.517 Z m -5.498 0.688 C 4.077 10.086 5.967 9.465 8.0 9.465 c 2.033 0.0 3.924 0.622 5.5 1.69 c 0.5 0.338 0.803 0.929 0.743 1.553 c -0.029 0.296 -0.086 0.563 -0.214 0.814 c -0.216 0.423 -0.56 0.767 -0.983 0.983 c -0.27 0.137 -0.559 0.193 -0.881 0.22 c -0.313 0.025 -0.697 0.025 -1.17 0.025 h -5.99 c -0.472 0.0 -0.856 0.0 -1.168 -0.025 c -0.323 -0.027 -0.612 -0.083 -0.882 -0.22 c -0.423 -0.216 -0.767 -0.56 -0.983 -0.983 c -0.128 -0.251 -0.185 -0.52 -0.214 -0.815 c -0.06 -0.625 0.243 -1.215 0.744 -1.554 Z")
        )
    }.build()
}
