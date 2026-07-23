package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AntennaFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AntennaFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.0 8.5 C 7.0 9.88 5.88 11.0 4.5 11.0 S 2.0 9.88 2.0 8.5 S 3.12 6.0 4.5 6.0 S 7.0 7.12 7.0 8.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.75 15.5 c 0.0 1.38 -1.12 2.5 -2.5 2.5 s -2.5 -1.12 -2.5 -2.5 S 6.87 13.0 8.25 13.0 s 2.5 1.12 2.5 2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.75 18.0 c 1.38 0.0 2.5 -1.12 2.5 -2.5 s -1.12 -2.5 -2.5 -2.5 s -2.5 1.12 -2.5 2.5 s 1.12 2.5 2.5 2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.0 8.5 c 0.0 1.38 -1.12 2.5 -2.5 2.5 S 17.0 9.88 17.0 8.5 S 18.12 6.0 19.5 6.0 S 22.0 7.12 22.0 8.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 11.0 c 1.38 0.0 2.5 -1.12 2.5 -2.5 S 13.38 6.0 12.0 6.0 S 9.5 7.12 9.5 8.5 S 10.62 11.0 12.0 11.0 Z")
        )
    }.build()
}
