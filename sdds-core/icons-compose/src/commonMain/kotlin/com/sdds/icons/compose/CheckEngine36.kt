package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CheckEngine36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CheckEngine36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.0 8.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 9.75 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 18.0 v 1.75 h 4.35 c 0.635 0.0 1.15 0.515 1.15 1.15 v 1.85 h 2.6 c 0.635 0.0 1.15 0.515 1.15 1.15 v 1.85 h 0.715 l 1.078 -1.617 c 0.455 -0.683 1.459 -0.683 1.914 0.0 l 1.35 2.024 c 0.126 0.19 0.193 0.411 0.193 0.638 v 5.16 c 0.0 0.227 -0.067 0.449 -0.193 0.638 l -1.35 2.024 c -0.455 0.683 -1.459 0.683 -1.914 0.0 L 27.965 24.5 H 27.25 v 2.6 c 0.0 0.635 -0.515 1.15 -1.15 1.15 h -8.797 c -0.262 0.0 -0.515 -0.089 -0.719 -0.252 L 13.15 25.25 H 8.4 c -0.635 0.0 -1.15 -0.515 -1.15 -1.15 v -3.85 H 5.5 v 4.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 14.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 v 3.75 h 1.75 v -3.6 c 0.0 -0.635 0.515 -1.15 1.15 -1.15 h 1.85 v -1.1 c 0.0 -0.635 0.515 -1.15 1.15 -1.15 H 16.0 V 9.5 h -4.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z M 9.25 23.25 h 4.197 c 0.262 0.0 0.515 0.089 0.719 0.252 L 17.6 26.25 h 7.649 v -2.735 c 0.0 -0.56 0.454 -1.015 1.015 -1.015 h 2.227 c 0.34 0.0 0.656 0.17 0.845 0.452 L 30.0 23.947 l 0.5 -0.75 v -4.644 l -0.5 -0.75 l -0.663 0.995 c -0.189 0.282 -0.506 0.452 -0.845 0.452 h -2.227 c -0.56 0.0 -1.015 -0.454 -1.015 -1.015 V 16.25 h -2.6 c -0.635 0.0 -1.15 -0.515 -1.15 -1.15 v -1.85 h -9.25 v 1.1 c 0.0 0.635 -0.515 1.15 -1.15 1.15 H 9.25 v 7.75 Z")
        )
    }.build()
}
