package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CalendarEventFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CalendarEventFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 21.0 c 1.657 0.0 3.0 1.343 3.0 3.0 s -1.343 3.0 -3.0 3.0 s -3.0 -1.343 -3.0 -3.0 s 1.343 -3.0 3.0 -3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.5 3.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 2.005 c 0.483 0.01 0.877 0.04 1.234 0.126 c 1.737 0.417 3.093 1.774 3.51 3.51 c 0.132 0.55 0.131 1.184 0.131 2.098 v 12.554 c 0.0 1.014 0.0 1.835 -0.055 2.5 c -0.056 0.688 -0.175 1.298 -0.462 1.863 c -0.456 0.894 -1.183 1.621 -2.077 2.076 c -0.565 0.288 -1.174 0.407 -1.861 0.463 c -0.666 0.055 -1.488 0.055 -2.502 0.055 H 11.583 c -1.014 0.0 -1.836 0.0 -2.502 -0.055 c -0.687 -0.056 -1.297 -0.175 -1.862 -0.463 c -0.894 -0.455 -1.621 -1.182 -2.076 -2.076 c -0.288 -0.565 -0.407 -1.175 -0.463 -1.862 c -0.055 -0.666 -0.055 -1.488 -0.055 -2.501 V 11.739 c 0.0 -0.914 0.0 -1.549 0.13 -2.097 C 5.174 7.905 6.53 6.548 8.268 6.13 C 8.624 6.045 9.017 6.015 9.5 6.005 V 4.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 v 2.0 h 13.0 V 4.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z M 6.625 24.25 c 0.0 1.067 0.0 1.807 0.048 2.382 c 0.046 0.563 0.131 0.88 0.252 1.116 c 0.263 0.517 0.685 0.938 1.202 1.202 c 0.237 0.12 0.553 0.206 1.116 0.252 c 0.575 0.047 1.316 0.048 2.382 0.048 h 12.75 c 1.067 0.0 1.807 0.0 2.382 -0.048 c 0.563 -0.046 0.88 -0.131 1.117 -0.252 c 0.517 -0.264 0.938 -0.685 1.201 -1.202 c 0.12 -0.236 0.206 -0.553 0.252 -1.116 c 0.047 -0.575 0.048 -1.315 0.048 -2.382 V 14.0 H 6.625 v 10.25 Z")
        )
    }.build()
}
