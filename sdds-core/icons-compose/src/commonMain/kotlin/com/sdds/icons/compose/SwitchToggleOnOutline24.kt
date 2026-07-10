package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwitchToggleOnOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwitchToggleOnOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.0 15.0 c 1.657 0.0 3.0 -1.343 3.0 -3.0 s -1.343 -3.0 -3.0 -3.0 s -3.0 1.343 -3.0 3.0 s 1.343 3.0 3.0 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 6.0 c -3.314 0.0 -6.0 2.686 -6.0 6.0 s 2.686 6.0 6.0 6.0 h 8.0 c 3.314 0.0 6.0 -2.686 6.0 -6.0 s -2.686 -6.0 -6.0 -6.0 H 8.0 Z m -4.5 6.0 c 0.0 -2.485 2.015 -4.5 4.5 -4.5 h 8.0 c 2.485 0.0 4.5 2.015 4.5 4.5 s -2.015 4.5 -4.5 4.5 H 8.0 c -2.485 0.0 -4.5 -2.015 -4.5 -4.5 Z")
        )
    }.build()
}
