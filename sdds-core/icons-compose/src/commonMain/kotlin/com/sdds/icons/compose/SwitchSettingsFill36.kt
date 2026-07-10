package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwitchSettingsFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwitchSettingsFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 33.0 9.625 c 0.0 3.659 -2.966 6.625 -6.625 6.625 H 9.625 C 5.966 16.25 3.0 13.284 3.0 9.625 S 5.966 3.0 9.625 3.0 h 16.75 C 30.034 3.0 33.0 5.966 33.0 9.625 Z M 26.4 6.37 c -1.795 0.0 -3.25 1.455 -3.25 3.25 s 1.455 3.25 3.25 3.25 s 3.25 -1.455 3.25 -3.25 s -1.455 -3.25 -3.25 -3.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 26.375 c 0.0 -3.659 2.966 -6.625 6.625 -6.625 h 16.75 c 3.659 0.0 6.625 2.966 6.625 6.625 S 30.034 33.0 26.375 33.0 H 9.625 C 5.966 33.0 3.0 30.034 3.0 26.375 Z m 6.6 3.255 c 1.795 0.0 3.25 -1.455 3.25 -3.25 s -1.455 -3.25 -3.25 -3.25 s -3.25 1.455 -3.25 3.25 s 1.455 3.25 3.25 3.25 Z")
        )
    }.build()
}
