package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChoiceFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChoiceFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.0 4.75 C 13.0 3.784 13.784 3.0 14.75 3.0 h 4.5 C 20.216 3.0 21.0 3.784 21.0 4.75 v 4.5 c 0.0 0.966 -0.784 1.75 -1.75 1.75 h -4.5 C 13.784 11.0 13.0 10.216 13.0 9.25 v -4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.75 13.0 C 3.784 13.0 3.0 13.784 3.0 14.75 v 4.5 C 3.0 20.216 3.784 21.0 4.75 21.0 h 4.5 c 0.966 0.0 1.75 -0.784 1.75 -1.75 v -4.5 C 11.0 13.784 10.216 13.0 9.25 13.0 h -4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.75 13.0 C 13.784 13.0 13.0 13.784 13.0 14.75 v 4.5 c 0.0 0.966 0.784 1.75 1.75 1.75 h 4.5 c 0.966 0.0 1.75 -0.784 1.75 -1.75 v -4.5 c 0.0 -0.966 -0.784 -1.75 -1.75 -1.75 h -4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.75 3.0 C 3.784 3.0 3.0 3.784 3.0 4.75 v 4.5 C 3.0 10.216 3.784 11.0 4.75 11.0 h 4.5 C 10.216 11.0 11.0 10.216 11.0 9.25 v -4.5 C 11.0 3.784 10.216 3.0 9.25 3.0 h -4.5 Z M 4.5 4.75 c 0.0 -0.138 0.112 -0.25 0.25 -0.25 h 4.5 c 0.138 0.0 0.25 0.112 0.25 0.25 v 4.5 c 0.0 0.138 -0.112 0.25 -0.25 0.25 h -4.5 C 4.612 9.5 4.5 9.388 4.5 9.25 v -4.5 Z")
        )
    }.build()
}
