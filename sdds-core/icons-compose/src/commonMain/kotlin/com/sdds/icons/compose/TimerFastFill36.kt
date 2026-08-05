package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TimerFastFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TimerFastFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.557 5.0 c -0.553 0.0 -1.0 0.448 -1.0 1.0 s 0.447 1.0 1.0 1.0 h 1.986 v 2.047 c -5.305 0.507 -9.455 4.993 -9.455 10.453 c 0.0 5.799 4.681 10.5 10.456 10.5 C 28.32 30.0 33.0 25.299 33.0 19.5 c 0.0 -5.46 -4.15 -9.948 -9.457 -10.453 V 7.0 h 1.99 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -5.976 Z M 6.113 11.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 5.23 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -5.23 Z m -2.988 6.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 5.229 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 3.125 Z m 0.494 7.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 5.23 c 0.551 0.0 1.0 0.448 1.0 1.0 s -0.449 1.0 -1.0 1.0 h -5.23 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z m 23.367 -7.544 c 0.39 -0.392 0.389 -1.025 -0.002 -1.415 c -0.392 -0.39 -1.025 -0.388 -1.415 0.003 l -3.735 3.75 c -0.39 0.392 -0.388 1.025 0.003 1.415 c 0.392 0.39 1.025 0.388 1.415 -0.003 l 3.734 -3.75 Z")
        )
    }.build()
}
