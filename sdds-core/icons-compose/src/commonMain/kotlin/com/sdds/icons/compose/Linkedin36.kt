package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Linkedin36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Linkedin36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.02 16.636 v 0.042 h -0.028 l 0.028 -0.042 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.5 4.5 c -3.314 0.0 -6.0 2.686 -6.0 6.0 v 15.0 c 0.0 3.314 2.686 6.0 6.0 6.0 h 15.0 c 3.314 0.0 6.0 -2.686 6.0 -6.0 v -15.0 c 0.0 -3.314 -2.686 -6.0 -6.0 -6.0 h -15.0 Z m 2.185 22.602 V 14.91 H 8.607 v 12.192 h 4.078 Z m -2.039 -13.857 c 1.422 0.0 2.308 -0.936 2.308 -2.106 c -0.027 -1.197 -0.886 -2.107 -2.28 -2.107 c -1.396 0.0 -2.308 0.91 -2.308 2.107 c 0.0 1.17 0.885 2.106 2.254 2.106 h 0.026 Z m 4.295 13.857 h 4.079 v -6.809 c 0.0 -0.364 0.026 -0.728 0.134 -0.989 c 0.294 -0.728 0.965 -1.482 2.092 -1.482 c 1.476 0.0 2.066 1.118 2.066 2.757 v 6.523 h 4.078 V 20.11 c 0.0 -3.745 -2.012 -5.488 -4.695 -5.488 c -2.163 0.0 -3.134 1.182 -3.675 2.013 V 14.91 H 14.94 c 0.054 1.144 0.0 12.192 0.0 12.192 Z")
        )
    }.build()
}
