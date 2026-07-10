package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureLeftOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureLeftOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.412 4.646 c 0.195 0.196 0.195 0.512 0.0 0.708 L 6.766 8.0 l 2.646 2.646 c 0.195 0.196 0.195 0.512 0.0 0.708 c -0.195 0.195 -0.512 0.195 -0.707 0.0 L 5.352 8.0 l 3.353 -3.354 c 0.195 -0.195 0.512 -0.195 0.707 0.0 Z")
        )
    }.build()
}
