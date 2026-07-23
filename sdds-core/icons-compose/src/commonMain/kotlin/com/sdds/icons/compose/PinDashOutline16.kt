package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinDashOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinDashOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.514 8.151 c 0.586 0.792 0.02 1.914 -0.965 1.914 H 8.682 v 3.883 L 8.0 15.0 l -0.68 -1.052 v -3.06 l 1.82 -1.823 h 2.408 c 0.164 0.0 0.259 -0.187 0.16 -0.319 l -0.956 -1.292 l 0.715 -0.715 l 1.046 1.412 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.486 1.001 c 0.521 0.0 0.92 0.465 0.84 0.98 l -0.43 2.508 l 2.842 -2.843 c 0.196 -0.195 0.512 -0.195 0.707 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 l -11.88 11.88 c -0.195 0.194 -0.512 0.194 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.709 l 3.46 -3.46 H 4.452 c -0.985 0.0 -1.55 -1.122 -0.965 -1.914 l 1.464 -1.977 c 0.199 -0.269 0.28 -0.606 0.23 -0.936 L 4.675 1.981 c -0.08 -0.515 0.318 -0.98 0.84 -0.98 h 4.971 Z M 6.17 5.085 c 0.092 0.594 -0.057 1.2 -0.414 1.684 L 4.29 8.746 c -0.098 0.132 -0.003 0.32 0.161 0.32 h 1.866 l 3.464 -3.463 s -0.034 0.023 0.05 -0.518 l 0.478 -3.084 H 5.69 L 6.17 5.085 Z")
        )
    }.build()
}
