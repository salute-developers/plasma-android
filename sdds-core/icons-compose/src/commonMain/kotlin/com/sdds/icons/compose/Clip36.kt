package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Clip36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Clip36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.724 7.361 c 3.466 -3.466 9.086 -3.466 12.552 0.0 c 3.465 3.466 3.465 9.085 0.0 12.551 l -10.56 10.56 c -1.75 1.75 -4.504 1.999 -6.54 0.589 c -2.63 -1.82 -2.968 -5.577 -0.707 -7.838 l 10.559 -10.559 c 0.39 -0.39 1.023 -0.39 1.414 0.0 c 0.39 0.391 0.39 1.024 0.0 1.415 L 11.883 24.637 c -1.379 1.38 -1.172 3.67 0.431 4.78 c 1.242 0.86 2.92 0.708 3.988 -0.36 l 10.56 -10.559 c 2.684 -2.685 2.684 -7.038 0.0 -9.723 c -2.686 -2.684 -7.039 -2.685 -9.723 0.0 L 5.47 20.443 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.415 L 15.724 7.361 Z")
        )
    }.build()
}
