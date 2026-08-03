package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.078 4.0 c -2.884 0.0 -5.222 2.54 -5.222 5.675 v 9.08 c 0.0 3.134 2.338 5.675 5.222 5.675 c 2.884 0.0 5.222 -2.541 5.222 -5.675 v -9.08 C 23.3 6.54 20.962 4.0 18.078 4.0 Z m -7.961 15.81 c -0.071 -0.547 -0.573 -0.933 -1.12 -0.862 c -0.548 0.07 -0.935 0.572 -0.864 1.12 c 0.315 2.421 1.486 4.646 3.3 6.26 c 1.563 1.39 3.512 2.245 5.568 2.455 v 3.591 c 0.0 0.552 0.447 1.0 1.0 1.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -3.59 c 2.055 -0.211 4.004 -1.066 5.567 -2.456 c 1.814 -1.614 2.985 -3.839 3.3 -6.26 c 0.07 -0.548 -0.316 -1.05 -0.863 -1.12 c -0.548 -0.071 -1.05 0.315 -1.12 0.863 c -0.253 1.947 -1.195 3.732 -2.647 5.023 c -1.45 1.29 -3.312 2.0 -5.237 2.0 c -1.925 0.0 -3.787 -0.71 -5.238 -2.0 c -1.452 -1.291 -2.393 -3.076 -2.646 -5.023 Z")
        )
    }.build()
}
