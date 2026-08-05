package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureUpFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureUpFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.819 14.055 C 6.94 14.32 7.207 14.49 7.5 14.49 h 9.0 c 0.293 0.0 0.559 -0.17 0.681 -0.436 c 0.123 -0.266 0.08 -0.58 -0.111 -0.802 l -4.5 -5.25 C 12.426 7.837 12.218 7.741 12.0 7.741 c -0.219 0.0 -0.427 0.096 -0.57 0.262 l -4.5 5.25 c -0.19 0.223 -0.234 0.536 -0.111 0.802 Z")
        )
    }.build()
}
