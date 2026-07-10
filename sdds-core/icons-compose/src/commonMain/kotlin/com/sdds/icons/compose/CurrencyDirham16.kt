package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyDirham16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyDirham16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.5 4.7 C 4.224 4.7 4.0 4.924 4.0 5.2 v 5.6 c 0.0 0.276 0.224 0.5 0.5 0.5 h 0.9 c 1.436 0.0 2.6 -1.164 2.6 -2.6 V 7.3 c 0.0 -1.436 -1.164 -2.6 -2.6 -2.6 H 4.5 Z M 5.0 10.3 V 5.7 h 0.4 C 6.284 5.7 7.0 6.416 7.0 7.3 v 1.4 c 0.0 0.884 -0.716 1.6 -1.6 1.6 H 5.0 Z m 4.333 -5.1 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 5.6 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 8.388 H 11.0 V 10.8 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 5.2 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 S 11.0 4.924 11.0 5.2 v 2.188 H 9.333 V 5.2 Z")
        )
    }.build()
}
