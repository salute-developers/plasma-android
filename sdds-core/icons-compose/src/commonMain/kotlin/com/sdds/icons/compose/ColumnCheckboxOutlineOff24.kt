package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColumnCheckboxOutlineOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColumnCheckboxOutlineOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.041 2.0 h 1.544 C 7.791 2.583 8.347 3.0 9.0 3.0 h 6.0 c 0.653 0.0 1.209 -0.417 1.415 -1.0 h 1.544 C 17.72 3.419 16.486 4.5 15.0 4.5 H 9.0 C 7.514 4.5 6.28 3.419 6.041 2.0 Z M 9.0 7.5 h 6.0 c 0.134 0.0 0.264 0.018 0.388 0.05 l -4.604 4.604 l -0.698 -0.873 c -0.26 -0.323 -0.731 -0.375 -1.055 -0.117 c -0.323 0.26 -0.375 0.731 -0.117 1.055 l 0.803 1.003 l -2.166 2.166 C 7.518 15.264 7.5 15.134 7.5 15.0 V 9.0 c 0.0 -0.828 0.672 -1.5 1.5 -1.5 Z M 7.475 17.584 l 0.002 0.001 l 1.135 -1.136 H 8.611 L 10.66 14.4 v 0.001 l 4.587 -4.586 V 9.812 l 1.202 -1.201 v 0.001 l 1.136 -1.135 V 7.475 l 3.43 -3.43 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.294 -0.768 -0.294 -1.06 0.0 l -3.432 3.43 C 16.077 6.151 15.556 6.0 15.0 6.0 H 9.0 C 7.343 6.0 6.0 7.343 6.0 9.0 v 6.0 c 0.0 0.556 0.151 1.077 0.415 1.523 l -3.432 3.432 c -0.292 0.293 -0.292 0.768 0.0 1.06 c 0.293 0.293 0.768 0.293 1.061 0.0 l 3.431 -3.43 Z M 15.0 16.5 h -4.317 l -1.5 1.5 H 15.0 c 1.657 0.0 3.0 -1.343 3.0 -3.0 V 9.183 l -1.5 1.5 V 15.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 Z M 9.0 21.0 h 6.0 c 0.653 0.0 1.209 0.417 1.415 1.0 h 1.544 c -0.238 -1.419 -1.473 -2.5 -2.959 -2.5 H 9.0 c -1.486 0.0 -2.72 1.081 -2.959 2.5 h 1.544 C 7.791 21.417 8.347 21.0 9.0 21.0 Z")
        )
    }.build()
}
