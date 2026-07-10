package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwitchSettingsOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwitchSettingsOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.0 6.5 C 19.0 7.328 18.328 8.0 17.5 8.0 S 16.0 7.328 16.0 6.5 S 16.672 5.0 17.5 5.0 S 19.0 5.672 19.0 6.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 6.5 C 2.0 4.015 4.015 2.0 6.5 2.0 h 11.0 C 19.985 2.0 22.0 4.015 22.0 6.5 S 19.985 11.0 17.5 11.0 h -11.0 C 4.015 11.0 2.0 8.985 2.0 6.5 Z m 4.5 -3.0 c -1.657 0.0 -3.0 1.343 -3.0 3.0 s 1.343 3.0 3.0 3.0 h 11.0 c 1.657 0.0 3.0 -1.343 3.0 -3.0 s -1.343 -3.0 -3.0 -3.0 h -11.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 17.5 C 8.0 18.328 7.328 19.0 6.5 19.0 S 5.0 18.328 5.0 17.5 S 5.672 16.0 6.5 16.0 S 8.0 16.672 8.0 17.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 17.5 C 2.0 15.015 4.015 13.0 6.5 13.0 h 11.0 c 2.485 0.0 4.5 2.015 4.5 4.5 S 19.985 22.0 17.5 22.0 h -11.0 C 4.015 22.0 2.0 19.985 2.0 17.5 Z m 4.5 -3.0 c -1.657 0.0 -3.0 1.343 -3.0 3.0 s 1.343 3.0 3.0 3.0 h 11.0 c 1.657 0.0 3.0 -1.343 3.0 -3.0 s -1.343 -3.0 -3.0 -3.0 h -11.0 Z")
        )
    }.build()
}
