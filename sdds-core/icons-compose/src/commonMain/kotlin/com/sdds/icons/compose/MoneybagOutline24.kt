package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MoneybagOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MoneybagOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.75 3.0 C 5.478 3.0 5.227 3.149 5.095 3.388 C 4.962 3.628 4.97 3.919 5.116 4.15 l 2.525 3.998 c -2.085 1.063 -3.683 2.996 -4.269 5.39 l -0.084 0.344 C 2.4 17.505 5.143 21.0 8.873 21.0 h 6.255 c 3.73 0.0 6.472 -3.495 5.585 -7.118 l -0.084 -0.344 c -0.586 -2.394 -2.183 -4.327 -4.27 -5.39 l 2.526 -3.998 c 0.146 -0.23 0.154 -0.523 0.022 -0.762 C 18.776 3.148 18.524 3.0 18.252 3.0 H 5.75 Z m 3.414 4.75 L 7.111 4.5 h 9.779 l -2.053 3.25 H 9.164 Z m -0.33 1.5 c -1.956 0.8 -3.478 2.495 -4.005 4.644 L 4.745 14.24 C 4.089 16.916 6.116 19.5 8.873 19.5 h 6.255 c 2.757 0.0 4.784 -2.584 4.128 -5.26 l -0.084 -0.346 c -0.526 -2.149 -2.05 -3.845 -4.005 -4.644 H 8.834 Z")
        )
    }.build()
}
