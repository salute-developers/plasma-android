package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PeopleGroupFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PeopleGroupFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.35 5.2 c 0.0 1.353 -1.098 2.45 -2.45 2.45 c -1.354 0.0 -2.45 -1.097 -2.45 -2.45 c 0.0 -1.353 1.096 -2.45 2.45 -2.45 c 1.352 0.0 2.45 1.097 2.45 2.45 Z m -6.6 4.747 C 2.94 9.16 4.367 8.7 5.9 8.7 c 1.533 0.0 2.96 0.46 4.15 1.247 c 0.504 0.334 0.75 0.899 0.75 1.45 c 0.0 1.024 -0.83 1.853 -1.852 1.853 H 2.852 C 1.83 13.25 1.0 12.42 1.0 11.398 c 0.0 -0.552 0.246 -1.117 0.75 -1.45 Z M 11.5 11.5 c 0.0 0.263 -0.036 0.517 -0.104 0.758 h 2.194 c 0.779 0.0 1.41 -0.63 1.41 -1.41 c 0.0 -0.417 -0.186 -0.853 -0.578 -1.112 c -0.82 -0.544 -1.806 -0.861 -2.863 -0.861 c -0.503 0.0 -0.99 0.072 -1.45 0.205 c 0.832 0.486 1.391 1.388 1.391 2.42 Z m 0.0 -3.5 c 0.966 0.0 1.75 -0.784 1.75 -1.75 S 12.466 4.5 11.5 4.5 S 9.75 5.284 9.75 6.25 S 10.534 8.0 11.5 8.0 Z")
        )
    }.build()
}
