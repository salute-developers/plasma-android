package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyDirham36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyDirham36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.5 11.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 12.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 1.929 c 3.037 0.0 5.5 -2.462 5.5 -5.5 v -3.0 c 0.0 -3.038 -2.463 -5.5 -5.5 -5.5 H 10.5 Z m 1.0 12.0 V 13.0 h 0.929 c 1.933 0.0 3.5 1.567 3.5 3.5 v 3.0 c 0.0 1.933 -1.567 3.5 -3.5 3.5 H 11.5 Z m 9.286 -11.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 c -0.553 0.0 -1.0 0.448 -1.0 1.0 v 12.0 c 0.0 0.552 0.447 1.0 1.0 1.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -5.24 H 24.5 V 24.0 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 V 12.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 4.76 h -3.714 V 12.0 Z")
        )
    }.build()
}
