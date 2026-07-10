package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinDirhamFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinDirhamFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.3 8.3 c 0.0 1.295 -0.39 2.499 -1.06 3.5 h -1.282 C 11.985 11.739 12.0 11.671 12.0 11.6 V 6.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 S 11.0 5.724 11.0 6.0 v 2.188 H 9.333 V 6.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 5.6 c 0.0 0.071 0.015 0.139 0.042 0.2 H 6.614 C 7.438 11.364 8.0 10.498 8.0 9.5 V 8.1 c 0.0 -1.436 -1.164 -2.6 -2.6 -2.6 H 4.5 C 4.224 5.5 4.0 5.724 4.0 6.0 v 5.6 c 0.0 0.071 0.015 0.139 0.042 0.2 h -1.28 C 2.092 10.799 1.7 9.595 1.7 8.3 C 1.7 4.82 4.52 2.0 8.0 2.0 s 6.3 2.82 6.3 6.3 Z M 9.334 9.188 V 11.6 c 0.0 0.071 -0.015 0.139 -0.041 0.2 h 1.75 C 11.015 11.739 11.0 11.671 11.0 11.6 V 9.188 H 9.333 Z M 5.0 6.5 v 4.6 h 0.4 c 0.884 0.0 1.6 -0.716 1.6 -1.6 V 8.1 c 0.0 -0.884 -0.716 -1.6 -1.6 -1.6 H 5.0 Z m -3.475 6.35 C 1.235 12.85 1.0 13.085 1.0 13.375 c 0.0 0.29 0.235 0.525 0.525 0.525 h 12.95 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 1.525 Z")
        )
    }.build()
}
