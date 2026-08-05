package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SmileFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SmileFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 5.725 7.3 C 6.208 7.3 6.6 6.908 6.6 6.425 S 6.208 5.55 5.725 5.55 S 4.85 5.942 4.85 6.425 S 5.242 7.3 5.725 7.3 Z m 5.425 -0.875 c 0.0 0.483 -0.392 0.875 -0.875 0.875 S 9.4 6.908 9.4 6.425 S 9.792 5.55 10.275 5.55 s 0.875 0.392 0.875 0.875 Z M 5.402 9.5 C 5.264 9.26 4.958 9.179 4.719 9.317 C 4.479 9.455 4.398 9.761 4.536 10.0 C 4.887 10.608 5.392 11.113 6.0 11.464 S 7.298 12.0 8.0 12.0 s 1.392 -0.185 2.0 -0.536 c 0.608 -0.351 1.113 -0.856 1.464 -1.464 c 0.138 -0.24 0.056 -0.545 -0.183 -0.683 c -0.24 -0.138 -0.545 -0.056 -0.683 0.183 c -0.263 0.456 -0.642 0.835 -1.098 1.098 C 9.044 10.861 8.527 11.0 8.0 11.0 s -1.044 -0.139 -1.5 -0.402 C 6.044 10.335 5.665 9.956 5.402 9.5 Z")
        )
    }.build()
}
