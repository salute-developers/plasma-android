package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwitchToggleOnOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwitchToggleOnOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.0 7.75 c 0.0 2.347 -1.903 4.25 -4.25 4.25 h -5.5 C 2.903 12.0 1.0 10.097 1.0 7.75 S 2.903 3.5 5.25 3.5 h 5.5 C 13.097 3.5 15.0 5.403 15.0 7.75 Z M 10.75 11.0 C 12.545 11.0 14.0 9.545 14.0 7.75 S 12.545 4.5 10.75 4.5 h -5.5 C 3.455 4.5 2.0 5.955 2.0 7.75 S 3.455 11.0 5.25 11.0 h 5.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.0 7.85 c 0.0 -1.104 0.895 -2.0 2.0 -2.0 s 2.0 0.896 2.0 2.0 c 0.0 1.105 -0.895 2.0 -2.0 2.0 s -2.0 -0.895 -2.0 -2.0 Z")
        )
    }.build()
}
