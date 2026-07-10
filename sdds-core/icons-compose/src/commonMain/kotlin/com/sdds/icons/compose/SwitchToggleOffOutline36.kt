package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwitchToggleOffOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwitchToggleOffOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 18.0 c 0.0 -4.97 4.03 -9.0 9.0 -9.0 h 12.0 c 4.97 0.0 9.0 4.03 9.0 9.0 s -4.03 9.0 -9.0 9.0 H 12.0 c -4.97 0.0 -9.0 -4.03 -9.0 -9.0 Z m 9.0 -7.0 c -3.866 0.0 -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 h 12.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 H 12.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.375 17.875 c 0.0 2.485 -2.015 4.5 -4.5 4.5 s -4.5 -2.015 -4.5 -4.5 s 2.015 -4.5 4.5 -4.5 s 4.5 2.015 4.5 4.5 Z")
        )
    }.build()
}
