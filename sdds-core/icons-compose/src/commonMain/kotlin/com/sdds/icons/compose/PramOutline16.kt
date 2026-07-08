package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PramOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PramOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.896 1.75 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 c 2.694 0.0 4.858 2.234 4.858 4.964 c 0.0 0.269 -0.021 0.533 -0.061 0.791 c -0.37 2.357 -2.368 4.172 -4.797 4.172 H 7.305 c -2.281 0.0 -4.182 -1.602 -4.711 -3.75 H 2.25 c -0.276 0.0 -0.5 -0.223 -0.5 -0.5 c 0.0 -0.275 0.224 -0.5 0.5 -0.5 h 6.646 V 1.75 Z m 1.0 4.678 h 3.352 c 0.004 -0.071 0.006 -0.142 0.006 -0.214 c 0.0 -2.025 -1.472 -3.68 -3.358 -3.93 v 4.144 Z m 3.174 1.0 H 3.63 c 0.5 1.6 1.963 2.75 3.674 2.75 h 2.091 c 1.711 0.0 3.173 -1.15 3.674 -2.75 Z m -0.71 5.178 c -0.29 0.0 -0.546 0.245 -0.546 0.572 c 0.0 0.326 0.256 0.57 0.546 0.57 c 0.29 0.0 0.546 -0.244 0.546 -0.57 c 0.0 -0.327 -0.256 -0.572 -0.546 -0.572 Z m -1.546 0.572 c 0.0 -0.857 0.68 -1.572 1.546 -1.572 c 0.865 0.0 1.546 0.715 1.546 1.572 c 0.0 0.856 -0.681 1.57 -1.546 1.57 s -1.546 -0.714 -1.546 -1.57 Z m -7.019 0.0 c 0.0 -0.327 0.256 -0.572 0.546 -0.572 c 0.29 0.0 0.546 0.245 0.546 0.572 c 0.0 0.326 -0.256 0.57 -0.546 0.57 c -0.29 0.0 -0.546 -0.244 -0.546 -0.57 Z m 0.546 -1.572 c -0.865 0.0 -1.546 0.715 -1.546 1.572 c 0.0 0.856 0.681 1.57 1.546 1.57 s 1.546 -0.714 1.546 -1.57 c 0.0 -0.857 -0.68 -1.572 -1.546 -1.572 Z")
        )
    }.build()
}
