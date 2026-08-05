package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwitchSettingsFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwitchSettingsFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 4.25 C 1.0 2.455 2.455 1.0 4.25 1.0 h 7.5 C 13.545 1.0 15.0 2.455 15.0 4.25 S 13.545 7.5 11.75 7.5 h -7.5 C 2.455 7.5 1.0 6.045 1.0 4.25 Z m 10.75 1.5 c 0.828 0.0 1.5 -0.672 1.5 -1.5 s -0.672 -1.5 -1.5 -1.5 s -1.5 0.672 -1.5 1.5 s 0.672 1.5 1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.0 11.75 c 0.0 1.795 -1.455 3.25 -3.25 3.25 h -7.5 C 2.455 15.0 1.0 13.545 1.0 11.75 S 2.455 8.5 4.25 8.5 h 7.5 c 1.795 0.0 3.25 1.455 3.25 3.25 Z m -10.75 -1.5 c -0.828 0.0 -1.5 0.672 -1.5 1.5 s 0.672 1.5 1.5 1.5 s 1.5 -0.672 1.5 -1.5 s -0.672 -1.5 -1.5 -1.5 Z")
        )
    }.build()
}
