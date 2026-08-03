package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SendOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SendOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 32.19 18.898 c 0.343 -0.168 0.56 -0.517 0.56 -0.898 s -0.217 -0.73 -0.56 -0.898 L 4.692 3.602 C 4.313 3.417 3.86 3.488 3.556 3.78 c -0.303 0.292 -0.39 0.743 -0.219 1.128 L 9.183 18.0 L 3.337 31.092 c -0.171 0.385 -0.084 0.836 0.22 1.128 c 0.303 0.292 0.756 0.363 1.134 0.178 l 27.5 -13.5 Z M 10.307 15.61 L 6.29 6.615 L 29.48 18.0 L 6.29 29.385 l 4.016 -8.996 l 5.126 -2.04 c 0.315 -0.126 0.315 -0.572 0.0 -0.697 l -5.126 -2.041 Z")
        )
    }.build()
}
