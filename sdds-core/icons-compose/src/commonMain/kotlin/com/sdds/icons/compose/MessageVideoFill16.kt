package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageVideoFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageVideoFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.051 2.05 c -3.257 0.0 -5.898 2.64 -5.898 5.899 c 0.0 0.7 0.122 1.374 0.347 1.999 c 0.135 0.375 0.174 0.743 0.083 1.067 l -0.499 1.782 c -0.19 0.681 0.438 1.31 1.119 1.118 l 1.782 -0.498 c 0.324 -0.091 0.692 -0.052 1.067 0.083 c 0.625 0.225 1.298 0.347 2.0 0.347 c 3.257 0.0 5.898 -2.64 5.898 -5.898 c 0.0 -3.258 -2.64 -5.899 -5.899 -5.899 Z M 5.48 6.87 c 0.0 -0.416 0.0 -0.625 0.08 -0.784 c 0.072 -0.14 0.186 -0.254 0.326 -0.325 C 6.045 5.68 6.253 5.68 6.67 5.68 h 1.552 c 0.417 0.0 0.625 0.0 0.784 0.081 c 0.14 0.071 0.254 0.185 0.325 0.325 c 0.081 0.16 0.081 0.368 0.081 0.784 v 0.317 l 1.03 -0.831 c 0.194 -0.158 0.484 -0.02 0.484 0.23 v 2.422 c 0.0 0.25 -0.29 0.39 -0.485 0.232 L 9.412 8.408 v 0.317 c 0.0 0.416 0.0 0.625 -0.08 0.784 c -0.072 0.14 -0.186 0.254 -0.326 0.325 c -0.159 0.08 -0.367 0.08 -0.784 0.08 H 6.67 c -0.417 0.0 -0.625 0.0 -0.784 -0.08 c -0.14 -0.071 -0.254 -0.185 -0.325 -0.325 C 5.48 9.349 5.48 9.14 5.48 8.725 V 6.87 Z")
        )
    }.build()
}
