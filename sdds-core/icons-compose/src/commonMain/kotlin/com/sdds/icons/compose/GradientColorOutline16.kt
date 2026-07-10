package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GradientColorOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GradientColorOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.154 1.004 C 13.74 1.084 15.0 2.394 15.0 4.0 v 8.0 l -0.004 0.154 c -0.078 1.534 -1.308 2.764 -2.842 2.842 L 12.0 15.0 H 4.0 c -1.605 0.0 -2.916 -1.26 -2.996 -2.846 L 1.0 12.0 V 4.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 8.0 l 0.154 0.004 Z M 4.0 3.0 h 2.0 v 2.0 H 4.0 v 2.0 h 2.0 v 2.0 H 4.0 v 2.0 h 2.0 v 2.0 H 4.0 v 1.0 h 2.0 v -1.0 h 2.0 v 1.0 h 4.0 c 1.105 0.0 2.0 -0.895 2.0 -2.0 V 4.0 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 H 8.0 v 1.0 H 6.0 V 2.0 H 4.0 v 1.0 Z m 6.0 10.0 H 8.0 v -2.0 h 2.0 v 2.0 Z m -2.0 -2.0 H 6.0 V 9.0 h 2.0 v 2.0 Z m 4.0 0.0 h -2.0 V 9.0 h 2.0 v 2.0 Z m -2.0 -2.0 H 8.0 V 7.0 h 2.0 v 2.0 Z M 8.0 7.0 H 6.0 V 5.0 h 2.0 v 2.0 Z m 4.0 0.0 h -2.0 V 5.0 h 2.0 v 2.0 Z m -2.0 -2.0 H 8.0 V 3.0 h 2.0 v 2.0 Z")
        )
    }.build()
}
