package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CubeOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CubeOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.417 3.194 c -0.268 -0.107 -0.567 -0.107 -0.836 0.0 L 4.877 5.876 l 7.122 2.895 l 7.123 -2.895 l -6.705 -2.682 Z m 7.876 3.663 l -7.619 3.097 v 10.249 l 6.943 -2.777 c 0.427 -0.171 0.707 -0.585 0.707 -1.045 V 7.12 c 0.0 -0.09 -0.01 -0.177 -0.03 -0.262 Z m -8.969 13.346 V 9.954 L 3.705 6.857 c -0.02 0.085 -0.03 0.172 -0.03 0.262 v 9.262 c 0.0 0.46 0.28 0.874 0.706 1.045 l 6.943 2.777 Z M 11.08 1.941 c 0.59 -0.236 1.248 -0.236 1.838 0.0 l 7.2 2.88 c 0.41 0.163 0.758 0.429 1.02 0.76 c 0.34 0.428 0.536 0.966 0.536 1.538 v 9.262 c 0.0 1.012 -0.616 1.922 -1.556 2.298 l -7.2 2.88 c -0.295 0.118 -0.607 0.177 -0.919 0.177 c -0.312 0.0 -0.624 -0.059 -0.919 -0.177 l -7.2 -2.88 c -0.94 -0.375 -1.556 -1.286 -1.556 -2.298 V 7.12 c 0.0 -0.571 0.197 -1.11 0.536 -1.538 c 0.263 -0.331 0.61 -0.597 1.02 -0.76 l 7.2 -2.88 Z")
        )
    }.build()
}
