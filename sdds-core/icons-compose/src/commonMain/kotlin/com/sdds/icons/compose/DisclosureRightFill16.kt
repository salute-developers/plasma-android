package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureRightFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureRightFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.483 4.545 C 6.306 4.626 6.193 4.805 6.193 5.0 v 6.0 c 0.0 0.195 0.113 0.372 0.29 0.453 c 0.178 0.082 0.386 0.053 0.535 -0.074 l 3.5 -3.0 c 0.11 -0.095 0.174 -0.234 0.174 -0.38 s -0.064 -0.285 -0.174 -0.38 l -3.5 -3.0 C 6.869 4.492 6.66 4.463 6.483 4.545 Z")
        )
    }.build()
}
