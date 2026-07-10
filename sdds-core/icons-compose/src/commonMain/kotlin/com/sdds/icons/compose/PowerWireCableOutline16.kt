package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PowerWireCableOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PowerWireCableOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.855 1.0 C 5.482 1.0 5.18 1.302 5.18 1.675 v 2.838 H 4.95 c -0.663 0.0 -1.2 0.537 -1.2 1.2 v 2.389 c 0.0 0.972 0.43 1.895 1.173 2.522 l 1.255 1.06 c 0.045 0.037 0.071 0.093 0.071 0.152 v 3.16 h 3.5 v -3.16 c 0.0 -0.059 0.026 -0.115 0.07 -0.153 l 1.256 -1.059 c 0.744 -0.627 1.173 -1.55 1.173 -2.522 v -2.39 c 0.0 -0.662 -0.537 -1.2 -1.2 -1.2 H 10.82 V 1.676 C 10.821 1.302 10.52 1.0 10.146 1.0 H 5.855 Z M 9.82 4.513 V 2.0 H 6.18 v 2.513 H 9.82 Z m -5.071 1.2 c 0.0 -0.11 0.09 -0.2 0.2 -0.2 h 6.098 c 0.11 0.0 0.2 0.09 0.2 0.2 v 2.389 c 0.0 0.678 -0.3 1.321 -0.817 1.758 l -1.256 1.059 c -0.27 0.228 -0.426 0.563 -0.426 0.917 v 2.16 h -1.5 v -2.16 c 0.0 -0.354 -0.156 -0.69 -0.426 -0.917 L 5.567 9.86 C 5.05 9.423 4.75 8.78 4.75 8.102 v -2.39 Z")
        )
    }.build()
}
