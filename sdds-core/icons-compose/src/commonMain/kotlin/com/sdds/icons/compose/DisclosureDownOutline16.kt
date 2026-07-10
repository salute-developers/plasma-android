package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureDownOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureDownOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.646 6.593 c 0.196 -0.195 0.512 -0.195 0.708 0.0 L 8.0 9.24 l 2.646 -2.647 c 0.196 -0.195 0.512 -0.195 0.708 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 L 8.0 10.654 L 4.646 7.3 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 Z")
        )
    }.build()
}
