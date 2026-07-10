package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MaxFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MaxFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.219 4.5 c 7.446 0.0 13.28 6.067 13.281 13.54 c 0.025 7.356 -5.885 13.344 -13.21 13.383 c -2.65 0.0 -3.881 -0.388 -6.021 -1.942 c -1.354 1.748 -5.641 3.114 -5.829 0.777 c 0.0 -1.755 -0.386 -3.238 -0.825 -4.857 C 5.093 23.407 4.5 21.186 4.5 17.968 C 4.5 10.282 10.78 4.5 18.219 4.5 Z m 0.18 6.644 c -3.623 -0.188 -6.446 2.33 -7.072 6.28 c -0.515 3.27 0.4 7.25 1.18 7.459 c 0.374 0.09 1.316 -0.673 1.902 -1.262 c 0.97 0.673 2.1 1.077 3.275 1.172 c 3.754 0.181 6.962 -2.69 7.214 -6.456 c 0.147 -3.774 -2.744 -6.972 -6.499 -7.188 v -0.005 Z")
        )
    }.build()
}
