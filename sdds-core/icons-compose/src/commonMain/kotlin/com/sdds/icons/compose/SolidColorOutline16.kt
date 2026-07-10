package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SolidColorOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SolidColorOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 1.0 c 1.657 0.0 3.0 1.343 3.0 3.0 v 8.0 c 0.0 1.657 -1.343 3.0 -3.0 3.0 H 4.0 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 V 4.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 8.0 Z M 4.0 2.0 C 2.895 2.0 2.0 2.895 2.0 4.0 v 8.0 c 0.0 1.105 0.895 2.0 2.0 2.0 h 8.0 c 1.105 0.0 2.0 -0.895 2.0 -2.0 V 4.0 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 H 4.0 Z m 7.0 2.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 6.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 H 5.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 V 5.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 6.0 Z")
        )
    }.build()
}
