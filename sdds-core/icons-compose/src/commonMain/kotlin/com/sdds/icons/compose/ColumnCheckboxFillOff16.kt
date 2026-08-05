package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColumnCheckboxFillOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColumnCheckboxFillOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.826 1.0 h 1.028 C 5.0 1.436 5.412 1.75 5.897 1.75 h 4.2 c 0.485 0.0 0.897 -0.314 1.043 -0.75 h 1.028 C 12.0 1.993 11.138 2.75 10.097 2.75 h -4.2 c -1.04 0.0 -1.904 -0.757 -2.071 -1.75 Z m 6.27 13.25 h -4.2 C 5.413 14.25 5.0 14.564 4.855 15.0 H 3.826 c 0.167 -0.993 1.03 -1.75 2.07 -1.75 h 4.2 c 1.041 0.0 1.905 0.757 2.072 1.75 H 11.14 c -0.146 -0.436 -0.558 -0.75 -1.043 -0.75 Z m -6.3 -8.35 c 0.0 -1.16 0.941 -2.1 2.1 -2.1 h 4.2 c 0.424 0.0 0.817 0.125 1.147 0.34 l 2.493 -2.494 c 0.196 -0.195 0.512 -0.195 0.707 0.0 c 0.196 0.196 0.196 0.512 0.0 0.707 L 2.564 14.233 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 l 2.28 -2.28 c -0.215 -0.33 -0.34 -0.723 -0.34 -1.146 V 5.9 Z m 2.677 3.01 l 0.712 -0.712 l -0.548 -0.686 c -0.173 -0.215 -0.488 -0.25 -0.703 -0.078 c -0.216 0.173 -0.25 0.487 -0.078 0.703 L 6.473 8.91 Z m 5.724 1.19 V 6.01 l -6.19 6.19 h 4.09 c 1.16 0.0 2.1 -0.94 2.1 -2.1 Z")
        )
    }.build()
}
