package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PramFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PramFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.34 11.606 c 0.866 0.0 1.547 0.715 1.547 1.572 c 0.0 0.856 -0.681 1.571 -1.546 1.571 s -1.545 -0.715 -1.545 -1.571 c 0.0 -0.857 0.68 -1.571 1.545 -1.572 Z m 0.0 1.0 c -0.29 0.0 -0.544 0.245 -0.544 0.572 c 0.0 0.326 0.255 0.57 0.545 0.571 c 0.29 0.0 0.546 -0.245 0.546 -0.571 c 0.0 -0.327 -0.256 -0.572 -0.546 -0.572 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.36 11.606 c 0.864 0.0 1.545 0.715 1.545 1.572 c 0.0 0.856 -0.68 1.571 -1.546 1.571 c -0.864 0.0 -1.544 -0.715 -1.544 -1.571 c 0.0 -0.857 0.68 -1.571 1.544 -1.572 Z m 0.0 1.0 c -0.29 0.0 -0.545 0.245 -0.545 0.572 c 0.0 0.326 0.254 0.57 0.544 0.571 c 0.29 0.0 0.546 -0.245 0.546 -0.571 c 0.0 -0.327 -0.255 -0.572 -0.546 -0.572 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.396 1.25 c 2.694 0.0 4.858 2.234 4.858 4.964 c 0.0 0.269 -0.021 0.534 -0.062 0.792 c -0.37 2.356 -2.368 4.172 -4.796 4.172 H 7.305 c -2.281 0.0 -4.182 -1.603 -4.711 -3.75 H 2.25 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 6.646 V 1.75 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
    }.build()
}
