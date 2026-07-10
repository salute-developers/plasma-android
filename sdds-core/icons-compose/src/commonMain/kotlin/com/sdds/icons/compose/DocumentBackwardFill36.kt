package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DocumentBackwardFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DocumentBackwardFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.0 10.8 c 0.0 -2.73 0.0 -4.095 0.531 -5.138 C 7.0 4.745 7.745 3.999 8.661 3.532 C 9.706 3.0 11.07 3.0 13.8 3.0 h 8.4 c 2.73 0.0 4.095 0.0 5.138 0.531 c 0.918 0.468 1.663 1.214 2.13 2.13 C 30.0 6.706 30.0 8.07 30.0 10.8 v 6.33 c -1.09 -0.407 -2.269 -0.63 -3.5 -0.63 c -5.523 0.0 -10.0 4.477 -10.0 10.0 c 0.0 2.482 0.904 4.752 2.4 6.5 h -5.1 c -2.73 0.0 -4.095 0.0 -5.138 -0.531 c -0.917 -0.468 -1.663 -1.213 -2.13 -2.13 C 6.0 29.294 6.0 27.93 6.0 25.2 V 10.8 Z m 5.0 -0.675 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 12.0 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 12.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z M 11.0 15.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 6.0 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -6.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.5 35.0 c 4.694 0.0 8.5 -3.806 8.5 -8.5 S 31.194 18.0 26.5 18.0 S 18.0 21.806 18.0 26.5 s 3.806 8.5 8.5 8.5 Z m -0.242 -11.833 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 l -3.865 3.863 c -0.292 0.293 -0.292 0.768 0.0 1.06 l 3.864 3.864 c 0.293 0.293 0.768 0.293 1.06 0.0 c 0.294 -0.293 0.294 -0.767 0.0 -1.06 l -2.583 -2.584 h 7.463 c 0.414 0.0 0.75 -0.335 0.75 -0.75 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 h -7.463 l 2.584 -2.583 Z")
        )
    }.build()
}
