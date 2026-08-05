package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureDownFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureDownFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.185 9.937 C 17.063 9.67 16.797 9.5 16.504 9.5 h -9.0 c -0.293 0.0 -0.56 0.17 -0.681 0.437 c -0.123 0.266 -0.08 0.579 0.111 0.801 l 4.5 5.25 c 0.143 0.166 0.351 0.262 0.57 0.262 c 0.219 0.0 0.427 -0.096 0.57 -0.262 l 4.5 -5.25 c 0.19 -0.222 0.234 -0.535 0.111 -0.801 Z")
        )
    }.build()
}
