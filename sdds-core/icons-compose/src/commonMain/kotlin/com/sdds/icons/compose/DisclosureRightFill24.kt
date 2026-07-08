package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureRightFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureRightFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.187 6.819 C 9.92 6.94 9.75 7.207 9.75 7.5 v 9.0 c 0.0 0.293 0.17 0.559 0.437 0.681 c 0.266 0.123 0.579 0.08 0.801 -0.111 l 5.25 -4.5 C 16.404 12.426 16.5 12.218 16.5 12.0 c 0.0 -0.219 -0.096 -0.427 -0.262 -0.57 l -5.25 -4.5 c -0.222 -0.19 -0.535 -0.234 -0.801 -0.111 Z")
        )
    }.build()
}
