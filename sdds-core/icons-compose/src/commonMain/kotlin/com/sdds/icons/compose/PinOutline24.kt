package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.34 2.0 C 7.572 2.0 6.986 2.688 7.107 3.447 l 0.738 4.614 C 7.92 8.533 7.8 9.017 7.508 9.398 l -2.127 2.791 C 4.504 13.341 5.325 15.0 6.773 15.0 h 4.231 v 5.5 l 1.0 1.5 l 1.0 -1.5 V 15.0 h 4.231 c 1.448 0.0 2.27 -1.659 1.392 -2.81 L 16.5 9.397 c -0.29 -0.381 -0.412 -0.865 -0.336 -1.337 l 0.738 -4.614 C 17.024 2.688 16.437 2.0 15.668 2.0 H 8.34 Z m 0.985 5.824 L 8.634 3.5 h 6.74 l -0.691 4.324 c -0.14 0.878 0.085 1.775 0.624 2.483 l 2.127 2.791 c 0.125 0.165 0.008 0.402 -0.199 0.402 H 6.773 c -0.207 0.0 -0.324 -0.237 -0.199 -0.402 l 2.127 -2.791 c 0.54 -0.708 0.765 -1.605 0.624 -2.483 Z")
        )
    }.build()
}
