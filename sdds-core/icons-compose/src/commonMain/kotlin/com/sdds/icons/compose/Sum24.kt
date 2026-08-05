package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Sum24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Sum24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.81 5.157 C 5.331 4.607 5.722 3.75 6.451 3.75 h 10.68 c 0.47 0.0 0.85 0.38 0.85 0.85 v 1.079 c 0.0 0.414 -0.335 0.75 -0.75 0.75 c -0.413 0.0 -0.75 -0.336 -0.75 -0.75 V 5.25 H 8.884 l 4.93 6.274 c 0.038 0.047 0.07 0.098 0.096 0.152 c 0.098 0.205 0.097 0.44 0.004 0.641 c -0.026 0.054 -0.057 0.105 -0.095 0.153 l -4.831 6.28 h 7.496 v -0.429 c 0.0 -0.414 0.335 -0.75 0.75 -0.75 c 0.414 0.0 0.75 0.336 0.75 0.75 V 19.4 c 0.0 0.47 -0.38 0.85 -0.85 0.85 H 6.452 c -0.729 0.0 -1.12 -0.856 -0.643 -1.407 L 11.74 12.0 L 5.81 5.157 Z")
        )
    }.build()
}
