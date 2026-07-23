package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwitchSettingsOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwitchSettingsOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.25 1.0 C 2.455 1.0 1.0 2.455 1.0 4.25 S 2.455 7.5 4.25 7.5 h 7.5 C 13.545 7.5 15.0 6.045 15.0 4.25 S 13.545 1.0 11.75 1.0 h -7.5 Z M 2.0 4.25 C 2.0 3.007 3.007 2.0 4.25 2.0 h 7.5 C 12.993 2.0 14.0 3.007 14.0 4.25 S 12.993 6.5 11.75 6.5 h -7.5 C 3.007 6.5 2.0 5.493 2.0 4.25 Z m 9.75 1.25 C 12.44 5.5 13.0 4.94 13.0 4.25 S 12.44 3.0 11.75 3.0 S 10.5 3.56 10.5 4.25 s 0.56 1.25 1.25 1.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.75 15.0 c 1.795 0.0 3.25 -1.455 3.25 -3.25 S 13.545 8.5 11.75 8.5 h -7.5 C 2.455 8.5 1.0 9.955 1.0 11.75 S 2.455 15.0 4.25 15.0 h 7.5 Z M 14.0 11.75 c 0.0 1.243 -1.007 2.25 -2.25 2.25 h -7.5 C 3.007 14.0 2.0 12.993 2.0 11.75 S 3.007 9.5 4.25 9.5 h 7.5 c 1.243 0.0 2.25 1.007 2.25 2.25 Z M 4.25 10.5 C 3.56 10.5 3.0 11.06 3.0 11.75 S 3.56 13.0 4.25 13.0 s 1.25 -0.56 1.25 -1.25 s -0.56 -1.25 -1.25 -1.25 Z")
        )
    }.build()
}
