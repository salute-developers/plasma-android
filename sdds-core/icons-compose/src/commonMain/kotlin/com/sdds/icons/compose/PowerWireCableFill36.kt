package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PowerWireCableFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PowerWireCableFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.432 3.0 c -0.76 0.0 -1.375 0.616 -1.375 1.375 v 6.182 h -0.522 c -1.4 0.0 -2.535 1.129 -2.535 2.521 v 5.16 c 0.0 2.061 0.906 4.02 2.479 5.361 l 2.668 2.275 c 0.112 0.096 0.177 0.236 0.177 0.383 V 33.0 h 7.352 v -6.743 c 0.0 -0.147 0.065 -0.287 0.177 -0.383 l 2.668 -2.275 C 26.094 22.258 27.0 20.3 27.0 18.24 v -5.16 c 0.0 -1.393 -1.135 -2.522 -2.535 -2.522 h -0.521 V 4.375 c 0.0 -0.76 -0.616 -1.375 -1.375 -1.375 h -9.137 Z m 8.512 7.557 V 5.0 h -7.887 v 5.557 h 7.887 Z")
        )
    }.build()
}
