package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CashATMFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CashATMFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 32.006 6.5 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -28.0 c -0.551 0.0 -1.0 0.448 -1.0 1.0 s 0.449 1.0 1.0 1.0 h 28.0 Z M 8.926 8.385 h 18.161 v 18.61 c 0.0 1.05 0.0 1.575 -0.204 1.976 c -0.18 0.353 -0.467 0.64 -0.82 0.82 c -0.4 0.204 -0.926 0.204 -1.976 0.204 H 11.926 c -1.05 0.0 -1.575 0.0 -1.977 -0.204 c -0.352 -0.18 -0.64 -0.467 -0.819 -0.82 c -0.204 -0.4 -0.204 -0.926 -0.204 -1.976 V 8.385 Z m 12.242 7.29 c 0.0 -1.734 -1.412 -3.146 -3.162 -3.146 s -3.162 1.412 -3.162 3.146 c 0.0 1.733 1.412 3.145 3.162 3.145 s 3.162 -1.412 3.162 -3.145 Z m -3.162 -5.146 c 2.847 0.0 5.162 2.3 5.162 5.146 c 0.0 2.845 -2.315 5.145 -5.162 5.145 s -5.162 -2.3 -5.162 -5.145 c 0.0 -2.846 2.315 -5.146 5.162 -5.146 Z m -1.514 12.814 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 3.027 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 h -3.027 Z")
        )
    }.build()
}
