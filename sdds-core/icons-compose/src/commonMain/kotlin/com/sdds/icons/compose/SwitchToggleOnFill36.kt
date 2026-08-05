package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwitchToggleOnFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwitchToggleOnFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 24.0 9.0 c 4.97 0.0 9.0 4.03 9.0 9.0 s -4.03 9.0 -9.0 9.0 H 12.0 c -4.97 0.0 -9.0 -4.03 -9.0 -9.0 s 4.03 -9.0 9.0 -9.0 h 12.0 Z m 0.0 3.75 c -2.9 0.0 -5.25 2.35 -5.25 5.25 s 2.35 5.25 5.25 5.25 s 5.25 -2.35 5.25 -5.25 s -2.35 -5.25 -5.25 -5.25 Z")
        )
    }.build()
}
