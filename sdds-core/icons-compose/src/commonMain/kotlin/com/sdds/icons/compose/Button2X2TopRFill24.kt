package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button2X2TopRFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button2X2TopRFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.25 2.0 C 14.007 2.0 13.0 3.007 13.0 4.25 v 4.5 C 13.0 9.993 14.007 11.0 15.25 11.0 h 4.5 C 20.993 11.0 22.0 9.993 22.0 8.75 v -4.5 C 22.0 3.007 20.993 2.0 19.75 2.0 h -4.5 Z M 14.5 4.25 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 4.5 c 0.414 0.0 0.75 0.336 0.75 0.75 v 4.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 h -4.5 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 v -4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.75 3.0 C 3.784 3.0 3.0 3.784 3.0 4.75 v 3.5 C 3.0 9.216 3.784 10.0 4.75 10.0 h 3.5 C 9.216 10.0 10.0 9.216 10.0 8.25 v -3.5 C 10.0 3.784 9.216 3.0 8.25 3.0 h -3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.0 15.75 c 0.0 -0.966 0.784 -1.75 1.75 -1.75 h 3.5 c 0.966 0.0 1.75 0.784 1.75 1.75 v 3.5 c 0.0 0.966 -0.784 1.75 -1.75 1.75 h -3.5 C 14.784 21.0 14.0 20.216 14.0 19.25 v -3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.75 14.0 C 3.784 14.0 3.0 14.784 3.0 15.75 v 3.5 C 3.0 20.216 3.784 21.0 4.75 21.0 h 3.5 C 9.216 21.0 10.0 20.216 10.0 19.25 v -3.5 C 10.0 14.784 9.216 14.0 8.25 14.0 h -3.5 Z")
        )
    }.build()
}
