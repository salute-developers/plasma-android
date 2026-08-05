package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Percent16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Percent16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.516 2.75 C 3.54 2.75 2.75 3.54 2.75 4.516 c 0.0 0.975 0.79 1.766 1.766 1.766 c 0.975 0.0 1.766 -0.79 1.766 -1.766 c 0.0 -0.975 -0.79 -1.766 -1.766 -1.766 Z M 1.75 4.516 c 0.0 -1.528 1.238 -2.766 2.766 -2.766 s 2.766 1.238 2.766 2.766 s -1.238 2.766 -2.766 2.766 S 1.75 6.044 1.75 4.516 Z m 11.604 -1.87 c 0.195 0.196 0.195 0.512 0.0 0.708 l -10.0 10.0 c -0.196 0.195 -0.512 0.195 -0.708 0.0 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 l 10.0 -10.0 c 0.196 -0.195 0.512 -0.195 0.708 0.0 Z m -3.631 8.842 c 0.0 -0.976 0.79 -1.766 1.766 -1.766 c 0.975 0.0 1.765 0.79 1.765 1.766 c 0.0 0.975 -0.79 1.766 -1.765 1.766 c -0.976 0.0 -1.766 -0.791 -1.766 -1.766 Z m 1.766 -2.766 c -1.528 0.0 -2.766 1.238 -2.766 2.766 c 0.0 1.527 1.238 2.766 2.766 2.766 c 1.527 0.0 2.765 -1.239 2.765 -2.766 c 0.0 -1.528 -1.238 -2.766 -2.765 -2.766 Z")
        )
    }.build()
}
