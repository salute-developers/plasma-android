package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureUpOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureUpOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.354 9.387 c -0.196 0.195 -0.512 0.195 -0.708 0.0 L 8.0 6.74 L 5.354 9.387 c -0.196 0.195 -0.512 0.195 -0.708 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 L 8.0 5.326 l 3.354 3.354 c 0.195 0.195 0.195 0.512 0.0 0.707 Z")
        )
    }.build()
}
