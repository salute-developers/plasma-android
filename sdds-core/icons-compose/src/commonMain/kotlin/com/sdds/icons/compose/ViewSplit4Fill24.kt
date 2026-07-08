package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ViewSplit4Fill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ViewSplit4Fill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.08 4.0 H 5.92 C 5.385 4.0 4.94 4.0 4.575 4.03 C 4.195 4.06 3.84 4.128 3.502 4.3 C 2.984 4.563 2.563 4.984 2.3 5.502 C 2.128 5.839 2.06 6.195 2.03 6.575 C 2.0 6.94 2.0 7.385 2.0 7.92 v 8.16 c 0.0 0.535 0.0 0.98 0.03 1.345 c 0.03 0.38 0.098 0.736 0.27 1.073 c 0.263 0.518 0.684 0.939 1.202 1.202 c 0.337 0.172 0.693 0.24 1.073 0.27 C 4.94 20.0 5.385 20.0 5.92 20.0 h 12.162 c 0.534 0.0 0.98 0.0 1.344 -0.03 c 0.38 -0.03 0.736 -0.098 1.073 -0.27 c 0.518 -0.263 0.939 -0.684 1.202 -1.201 c 0.172 -0.338 0.24 -0.694 0.27 -1.074 C 22.0 17.06 22.0 16.615 22.0 16.08 V 7.92 c 0.0 -0.535 0.0 -0.98 -0.03 -1.345 c -0.03 -0.38 -0.098 -0.736 -0.27 -1.073 C 21.437 4.984 21.016 4.563 20.5 4.3 c -0.338 -0.172 -0.694 -0.24 -1.074 -0.27 C 19.06 4.0 18.615 4.0 18.08 4.0 Z m -6.83 1.5 v 5.75 H 3.5 v 1.5 h 7.75 v 5.75 h 1.5 v -5.75 h 7.75 v -1.5 h -7.75 V 5.5 h -1.5 Z")
        )
    }.build()
}
