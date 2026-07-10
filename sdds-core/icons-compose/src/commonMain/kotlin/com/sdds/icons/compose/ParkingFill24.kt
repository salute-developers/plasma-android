package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ParkingFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ParkingFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.0 12.0 h -3.0 V 9.0 h 3.0 c 0.828 0.0 1.5 0.672 1.5 1.5 S 13.828 12.0 13.0 12.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.25 3.0 C 4.455 3.0 3.0 4.455 3.0 6.25 v 11.5 C 3.0 19.545 4.455 21.0 6.25 21.0 h 11.5 c 1.795 0.0 3.25 -1.455 3.25 -3.25 V 6.25 C 21.0 4.455 19.545 3.0 17.75 3.0 H 6.25 Z m 3.0 4.5 C 8.836 7.5 8.5 7.836 8.5 8.25 v 7.5 c 0.0 0.414 0.336 0.75 0.75 0.75 S 10.0 16.164 10.0 15.75 V 13.5 h 3.0 c 1.657 0.0 3.0 -1.343 3.0 -3.0 s -1.343 -3.0 -3.0 -3.0 H 9.25 Z")
        )
    }.build()
}
