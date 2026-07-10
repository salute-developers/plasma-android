package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TimerFastOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TimerFastOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.555 6.125 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 h 5.974 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -1.986 v 2.15 c 5.237 0.504 9.333 4.912 9.333 10.277 c 0.0 5.703 -4.628 10.324 -10.334 10.324 c -5.707 0.0 -10.335 -4.621 -10.335 -10.324 c 0.0 -5.366 4.098 -9.775 9.336 -10.277 v -2.15 h -1.988 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 Z m 3.987 5.103 c -4.605 0.0 -8.335 3.728 -8.335 8.324 s 3.73 8.324 8.335 8.324 c 4.604 0.0 8.334 -3.728 8.334 -8.324 s -3.73 -8.324 -8.334 -8.324 Z m 4.442 3.887 c 0.39 0.39 0.39 1.024 0.0 1.414 l -3.734 3.73 c -0.391 0.39 -1.024 0.39 -1.415 0.0 c -0.39 -0.392 -0.39 -1.025 0.001 -1.415 l 3.734 -3.73 c 0.39 -0.39 1.024 -0.39 1.414 0.001 Z m -20.87 -4.022 c -0.553 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.447 1.0 1.0 1.0 h 5.227 c 0.552 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 H 6.113 Z M 3.124 17.06 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 h 5.227 c 0.553 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.447 -1.0 -1.0 -1.0 H 3.125 Z m 0.494 6.968 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 5.227 c 0.553 0.0 1.0 0.448 1.0 1.0 c 0.0 0.553 -0.447 1.0 -1.0 1.0 H 4.62 c -0.552 0.0 -1.0 -0.447 -1.0 -1.0 Z")
        )
    }.build()
}
