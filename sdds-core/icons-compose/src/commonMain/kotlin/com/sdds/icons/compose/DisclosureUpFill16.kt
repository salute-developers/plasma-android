package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureUpFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureUpFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.589 9.512 C 4.67 9.69 4.848 9.803 5.043 9.803 h 6.0 c 0.195 0.0 0.373 -0.113 0.454 -0.29 c 0.082 -0.178 0.053 -0.387 -0.074 -0.535 l -3.0 -3.5 c -0.095 -0.111 -0.234 -0.175 -0.38 -0.175 s -0.285 0.064 -0.38 0.175 l -3.0 3.5 C 4.536 9.126 4.507 9.335 4.59 9.512 Z")
        )
    }.build()
}
