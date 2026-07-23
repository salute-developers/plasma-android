package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SearchError16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SearchError16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.0 7.0 c 0.0 -2.21 1.79 -4.0 4.0 -4.0 s 4.0 1.79 4.0 4.0 c 0.0 1.743 -1.114 3.225 -2.67 3.773 c 0.091 0.32 0.147 0.655 0.164 1.0 c 0.617 -0.193 1.182 -0.502 1.67 -0.902 l 3.532 3.532 c 0.196 0.196 0.512 0.196 0.707 0.0 c 0.196 -0.195 0.196 -0.511 0.0 -0.707 l -3.531 -3.532 C 11.577 9.302 12.0 8.201 12.0 7.0 c 0.0 -2.761 -2.239 -5.0 -5.0 -5.0 S 2.0 4.239 2.0 7.0 c 0.0 0.317 0.03 0.626 0.086 0.926 c 0.302 -0.142 0.624 -0.252 0.959 -0.324 C 3.015 7.405 3.0 7.204 3.0 7.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.75 12.0 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 c 2.071 0.0 3.75 1.679 3.75 3.75 Z m -5.444 -1.694 c 0.136 -0.136 0.358 -0.136 0.495 0.0 L 4.0 11.505 l 1.199 -1.199 c 0.136 -0.136 0.358 -0.136 0.494 0.0 c 0.137 0.137 0.137 0.358 0.0 0.495 L 4.495 12.0 l 1.198 1.199 c 0.137 0.137 0.137 0.358 0.0 0.495 c -0.136 0.136 -0.358 0.136 -0.494 0.0 l -1.2 -1.199 l -1.198 1.199 c -0.137 0.136 -0.359 0.136 -0.495 0.0 c -0.137 -0.137 -0.137 -0.358 0.0 -0.495 L 3.505 12.0 l -1.2 -1.199 c -0.136 -0.137 -0.136 -0.358 0.0 -0.495 Z")
        )
    }.build()
}
