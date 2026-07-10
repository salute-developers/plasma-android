package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.KidsLockFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "KidsLockFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 7.5 c 1.324 0.0 2.515 0.572 3.338 1.482 C 15.593 8.731 15.75 8.384 15.75 8.0 c 0.0 -0.767 -0.63 -1.388 -1.409 -1.388 c -0.052 0.0 -0.104 0.002 -0.155 0.008 C 13.55 3.832 11.021 1.75 8.0 1.75 c -3.02 0.0 -5.548 2.082 -6.185 4.87 c -0.051 -0.006 -0.103 -0.008 -0.156 -0.008 C 0.881 6.612 0.25 7.232 0.25 8.0 c 0.0 0.767 0.63 1.39 1.41 1.39 c 0.052 0.0 0.104 -0.004 0.155 -0.01 C 2.453 12.169 4.98 14.25 8.0 14.25 h 0.102 C 7.719 13.587 7.5 12.82 7.5 12.0 c 0.0 -1.22 0.486 -2.327 1.274 -3.138 c -0.271 0.064 -0.55 0.095 -0.831 0.09 C 7.497 8.944 7.057 8.849 6.65 8.67 C 6.242 8.49 5.876 8.234 5.57 7.912 l 0.737 -0.677 C 6.52 7.459 6.775 7.638 7.059 7.763 c 0.284 0.124 0.59 0.191 0.9 0.196 c 0.312 0.006 0.62 -0.05 0.908 -0.165 c 0.288 -0.115 0.55 -0.286 0.77 -0.502 l 0.582 0.574 C 10.765 7.63 11.368 7.5 12.0 7.5 Z M 4.18 7.223 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 s -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 Z m 8.639 -1.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 c 0.0 -0.553 0.447 -1.0 1.0 -1.0 c 0.552 0.0 1.0 0.447 1.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.318 10.637 c 0.0 -0.377 0.306 -0.682 0.682 -0.682 c 0.377 0.0 0.682 0.305 0.682 0.682 v 0.681 h -1.364 v -0.681 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.75 12.0 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 c 2.071 0.0 3.75 1.679 3.75 3.75 Z m -2.386 -0.682 v -0.682 c 0.0 -0.753 -0.611 -1.364 -1.364 -1.364 c -0.753 0.0 -1.364 0.61 -1.364 1.364 v 0.682 c -0.376 0.0 -0.682 0.305 -0.682 0.681 v 1.705 c 0.0 0.377 0.306 0.682 0.682 0.682 h 2.728 c 0.376 0.0 0.681 -0.305 0.681 -0.682 V 12.0 c 0.0 -0.376 -0.305 -0.681 -0.681 -0.681 Z")
        )
    }.build()
}
