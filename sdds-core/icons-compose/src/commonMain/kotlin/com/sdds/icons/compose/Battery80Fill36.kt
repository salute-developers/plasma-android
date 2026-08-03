package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Battery80Fill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Battery80Fill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.5 4.5 C 13.5 3.672 14.172 3.0 15.0 3.0 h 6.0 c 0.828 0.0 1.5 0.672 1.5 1.5 v 1.662 c 0.433 0.078 0.797 0.192 1.13 0.361 c 0.902 0.46 1.637 1.195 2.097 2.098 c 0.523 1.027 0.523 2.37 0.523 5.059 v 11.64 c 0.0 2.688 0.0 4.032 -0.523 5.06 c -0.46 0.902 -1.195 1.637 -2.098 2.097 C 22.602 33.0 21.26 33.0 18.57 33.0 h -1.14 c -2.688 0.0 -4.032 0.0 -5.06 -0.523 c -0.902 -0.46 -1.637 -1.195 -2.097 -2.098 C 9.75 29.352 9.75 28.01 9.75 25.32 V 13.68 c 0.0 -2.688 0.0 -4.032 0.523 -5.06 c 0.46 -0.902 1.195 -1.637 2.098 -2.097 c 0.332 -0.169 0.696 -0.283 1.129 -0.36 V 4.5 Z M 12.0 29.25 c 0.0 0.828 0.672 1.5 1.5 1.5 h 9.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 V 28.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 h -10.5 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 0.75 Z m 0.75 -2.4 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 v -1.5 c 0.0 -0.415 0.336 -0.75 0.75 -0.75 h 10.5 c 0.414 0.0 0.75 0.335 0.75 0.75 v 1.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 h -10.5 Z M 12.0 22.2 c 0.0 0.414 0.336 0.75 0.75 0.75 h 10.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 v -1.5 c 0.0 -0.415 -0.336 -0.75 -0.75 -0.75 h -10.5 c -0.414 0.0 -0.75 0.335 -0.75 0.75 v 1.5 Z m 0.75 -3.15 c -0.414 0.0 -0.75 -0.335 -0.75 -0.75 v -1.5 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 10.5 c 0.414 0.0 0.75 0.336 0.75 0.75 v 1.5 c 0.0 0.415 -0.336 0.75 -0.75 0.75 h -10.5 Z M 12.0 14.4 c 0.0 0.415 0.336 0.75 0.75 0.75 h 10.5 c 0.414 0.0 0.75 -0.335 0.75 -0.75 v -1.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 h -10.5 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 1.5 Z")
        )
    }.build()
}
