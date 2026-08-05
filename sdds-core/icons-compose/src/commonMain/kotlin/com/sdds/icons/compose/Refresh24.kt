package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Refresh24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Refresh24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 3.5 c -4.694 0.0 -8.5 3.806 -8.5 8.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 2.0 12.414 2.0 12.0 C 2.0 6.477 6.477 2.0 12.0 2.0 c 3.59 0.0 6.736 1.891 8.5 4.73 V 4.806 c 0.0 -0.415 0.336 -0.75 0.75 -0.75 S 22.0 4.39 22.0 4.806 v 3.597 c 0.0 0.414 -0.336 0.75 -0.75 0.75 h -0.708 h -0.034 h -2.855 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 h 1.653 C 17.822 5.165 15.105 3.5 12.0 3.5 Z m 9.25 7.75 c 0.414 0.0 0.75 0.336 0.75 0.75 c 0.0 5.523 -4.477 10.0 -10.0 10.0 c -3.59 0.0 -6.736 -1.891 -8.5 -4.73 v 1.924 c 0.0 0.415 -0.336 0.75 -0.75 0.75 S 2.0 19.61 2.0 19.194 v -3.597 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 0.708 h 0.034 h 2.855 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 4.694 C 6.178 18.835 8.895 20.5 12.0 20.5 c 4.694 0.0 8.5 -3.806 8.5 -8.5 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
    }.build()
}
