package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColumnCheckboxFillOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColumnCheckboxFillOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.041 2.0 h 1.544 C 7.791 2.583 8.347 3.0 9.0 3.0 h 6.0 c 0.653 0.0 1.209 -0.417 1.415 -1.0 h 1.544 C 17.72 3.419 16.486 4.5 15.0 4.5 H 9.0 C 7.514 4.5 6.28 3.419 6.041 2.0 Z M 15.0 21.0 H 9.0 c -0.653 0.0 -1.209 0.417 -1.415 1.0 H 6.041 C 6.28 20.581 7.514 19.5 9.0 19.5 h 6.0 c 1.486 0.0 2.72 1.081 2.959 2.5 h -1.544 c -0.206 -0.583 -0.762 -1.0 -1.415 -1.0 Z M 6.0 9.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 6.0 c 0.556 0.0 1.077 0.151 1.523 0.415 l 3.431 -3.43 c 0.293 -0.294 0.768 -0.294 1.06 0.0 c 0.294 0.292 0.294 0.767 0.0 1.06 l -3.43 3.43 l 0.001 0.002 l -2.338 2.338 V 9.812 L 10.66 14.4 v 0.001 l -3.183 3.184 H 7.475 l -3.43 3.43 c -0.294 0.293 -0.769 0.293 -1.062 0.0 c -0.292 -0.292 -0.292 -0.767 0.0 -1.06 l 3.432 -3.432 C 6.151 16.077 6.0 15.556 6.0 15.0 V 9.0 Z m 3.717 4.222 l 1.067 -1.068 l -0.698 -0.873 c -0.26 -0.323 -0.731 -0.375 -1.055 -0.117 c -0.323 0.26 -0.375 0.731 -0.117 1.055 l 0.803 1.003 Z M 18.0 15.0 V 9.183 L 9.183 18.0 H 15.0 c 1.657 0.0 3.0 -1.343 3.0 -3.0 Z")
        )
    }.build()
}
