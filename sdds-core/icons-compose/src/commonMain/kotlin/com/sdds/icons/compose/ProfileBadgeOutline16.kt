package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileBadgeOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileBadgeOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.524 4.785 c 0.0 -1.41 1.117 -2.535 2.474 -2.535 c 1.358 0.0 2.475 1.126 2.475 2.535 c 0.0 1.41 -1.117 2.536 -2.475 2.536 c -1.357 0.0 -2.474 -1.126 -2.474 -2.536 Z M 7.998 1.25 c -1.928 0.0 -3.474 1.592 -3.474 3.535 S 6.07 8.321 7.998 8.321 c 1.929 0.0 3.475 -1.593 3.475 -3.536 S 9.927 1.25 7.998 1.25 Z M 3.063 11.979 C 4.478 11.02 6.175 10.463 8.0 10.463 c 1.826 0.0 3.524 0.558 4.94 1.518 c 0.216 0.146 0.332 0.39 0.309 0.629 c -0.023 0.228 -0.06 0.359 -0.11 0.456 c -0.12 0.235 -0.31 0.426 -0.546 0.546 c -0.105 0.054 -0.248 0.093 -0.509 0.114 c -0.266 0.022 -0.61 0.022 -1.108 0.022 h -5.95 c -0.498 0.0 -0.841 0.0 -1.108 -0.022 c -0.26 -0.021 -0.404 -0.06 -0.509 -0.114 c -0.235 -0.12 -0.426 -0.31 -0.546 -0.546 c -0.05 -0.098 -0.087 -0.229 -0.11 -0.458 c -0.023 -0.238 0.093 -0.483 0.31 -0.63 Z M 8.0 9.463 c -2.032 0.0 -3.923 0.622 -5.498 1.688 c -0.5 0.339 -0.804 0.93 -0.744 1.553 c 0.029 0.297 0.086 0.565 0.214 0.816 c 0.216 0.423 0.56 0.768 0.983 0.983 c 0.27 0.137 0.559 0.194 0.882 0.22 c 0.312 0.025 0.696 0.025 1.169 0.025 h 5.99 c 0.473 0.0 0.857 0.0 1.17 -0.025 c 0.322 -0.026 0.612 -0.083 0.881 -0.22 c 0.423 -0.216 0.768 -0.56 0.983 -0.983 c 0.128 -0.25 0.185 -0.518 0.214 -0.814 c 0.06 -0.624 -0.243 -1.214 -0.743 -1.553 c -1.576 -1.068 -3.468 -1.69 -5.501 -1.69 Z m 1.399 2.5 c -0.277 0.0 -0.5 0.225 -0.5 0.5 c 0.0 0.277 0.223 0.5 0.5 0.5 h 2.098 c 0.277 0.0 0.5 -0.223 0.5 -0.5 c 0.0 -0.275 -0.223 -0.5 -0.5 -0.5 H 9.4 Z")
        )
    }.build()
}
