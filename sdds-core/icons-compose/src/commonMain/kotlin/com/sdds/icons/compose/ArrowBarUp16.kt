package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowBarUp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowBarUp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.304 1.875 c 0.138 0.003 0.268 0.064 0.36 0.167 l 3.334 3.725 c 0.184 0.206 0.166 0.522 -0.04 0.706 c -0.205 0.185 -0.521 0.167 -0.706 -0.039 l -2.46 -2.75 v 7.941 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 v -8.03 l -2.81 2.857 C 4.787 6.648 4.471 6.65 4.273 6.457 c -0.197 -0.194 -0.2 -0.51 -0.005 -0.707 l 3.666 -3.726 c 0.097 -0.098 0.23 -0.152 0.369 -0.149 Z M 2.5 14.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 10.0 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 3.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
    }.build()
}
