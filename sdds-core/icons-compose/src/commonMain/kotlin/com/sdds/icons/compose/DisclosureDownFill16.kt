package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureDownFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureDownFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.454 6.459 C 11.373 6.282 11.195 6.203 11.0 6.203 H 5.0 c -0.195 0.0 -0.373 0.079 -0.454 0.256 C 4.464 6.636 4.493 6.845 4.62 6.993 l 3.0 3.5 c 0.095 0.111 0.234 0.175 0.38 0.175 s 0.285 -0.064 0.38 -0.175 l 3.0 -3.5 c 0.127 -0.148 0.156 -0.357 0.074 -0.534 Z")
        )
    }.build()
}
