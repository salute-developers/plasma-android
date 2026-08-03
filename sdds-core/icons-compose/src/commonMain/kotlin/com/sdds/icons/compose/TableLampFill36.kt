package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableLampFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableLampFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.875 24.497 v 6.25 h -5.996 c -0.621 0.0 -1.125 0.503 -1.125 1.124 c 0.0 0.622 0.504 1.125 1.125 1.125 H 25.12 c 0.62 0.0 1.125 -0.504 1.125 -1.125 s -0.504 -1.125 -1.125 -1.125 h -5.996 v -6.248 h -2.25 Z m -9.75 -2.0 c -0.375 0.0 -0.726 -0.187 -0.935 -0.499 c -0.209 -0.312 -0.248 -0.707 -0.105 -1.054 l 6.724 -16.32 C 13.214 3.643 14.173 3.0 15.236 3.0 h 5.515 c 1.063 0.0 2.021 0.641 2.427 1.623 l 6.736 16.32 c 0.144 0.347 0.104 0.743 -0.105 1.055 c -0.208 0.312 -0.56 0.5 -0.935 0.5 H 7.125 Z")
        )
    }.build()
}
