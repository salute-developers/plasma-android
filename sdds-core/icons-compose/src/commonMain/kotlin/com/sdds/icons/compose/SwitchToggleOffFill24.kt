package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwitchToggleOffFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwitchToggleOffFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.0 6.0 c 3.314 0.0 6.0 2.686 6.0 6.0 s -2.686 6.0 -6.0 6.0 H 8.0 c -3.314 0.0 -6.0 -2.686 -6.0 -6.0 s 2.686 -6.0 6.0 -6.0 h 8.0 Z M 8.0 9.0 c -1.657 0.0 -3.0 1.343 -3.0 3.0 s 1.343 3.0 3.0 3.0 s 3.0 -1.343 3.0 -3.0 s -1.343 -3.0 -3.0 -3.0 Z")
        )
    }.build()
}
