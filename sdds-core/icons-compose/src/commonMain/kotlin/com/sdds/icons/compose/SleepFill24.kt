package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SleepFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SleepFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.201 3.459 l 0.028 0.017 c 2.861 1.757 4.773 4.918 4.773 8.526 c 0.0 5.523 -4.478 10.0 -10.0 10.0 c -3.608 0.0 -6.769 -1.91 -8.527 -4.772 l -0.017 -0.027 c -0.154 -0.251 -0.295 -0.482 -0.39 -0.674 c -0.087 -0.174 -0.228 -0.488 -0.16 -0.845 c 0.079 -0.414 0.356 -0.756 0.744 -0.919 c 0.2 -0.084 0.393 -0.085 0.526 -0.074 c 0.138 0.011 0.274 0.042 0.398 0.076 c 0.236 0.064 0.538 0.171 0.887 0.295 l 0.029 0.01 c 0.783 0.279 1.628 0.43 2.51 0.43 c 4.141 0.0 7.5 -3.357 7.5 -7.5 c 0.0 -0.881 -0.152 -1.726 -0.43 -2.51 L 15.06 5.464 c -0.124 -0.35 -0.231 -0.651 -0.296 -0.888 c -0.033 -0.123 -0.064 -0.26 -0.076 -0.397 c -0.01 -0.134 -0.01 -0.326 0.075 -0.527 c 0.163 -0.388 0.505 -0.665 0.919 -0.743 c 0.357 -0.068 0.671 0.073 0.845 0.159 c 0.192 0.095 0.423 0.237 0.673 0.39 Z")
        )
    }.build()
}
