package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherNormalOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherNormalOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.707 9.52 c 0.0 0.043 0.003 0.087 0.008 0.13 H 5.0 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 2.028 v 11.89 c 0.0 0.645 0.0 1.091 0.066 1.483 c 0.335 1.998 1.9 3.565 3.9 3.9 c 0.39 0.065 0.837 0.065 1.482 0.065 h 0.095 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 c -0.777 0.0 -1.042 -0.004 -1.247 -0.038 c -1.157 -0.194 -2.064 -1.1 -2.258 -2.258 c -0.034 -0.205 -0.038 -0.47 -0.038 -1.247 V 11.65 h 16.928 v 12.569 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -12.57 h 2.029 c 0.552 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -7.716 c 0.006 -0.042 0.009 -0.086 0.009 -0.13 c 0.0 -2.638 -2.147 -4.769 -4.786 -4.769 s -4.785 2.131 -4.785 4.77 Z m 4.785 -2.77 c -1.542 0.0 -2.785 1.244 -2.785 2.77 c 0.0 0.043 -0.003 0.087 -0.009 0.13 h 5.588 c -0.005 -0.043 -0.008 -0.087 -0.008 -0.13 c 0.0 -1.526 -1.243 -2.77 -2.786 -2.77 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.114 26.988 c -0.553 0.0 -1.0 0.448 -1.0 1.0 s 0.447 1.0 1.0 1.0 h 3.699 c 0.42 1.306 1.643 2.26 3.093 2.26 h 0.8 c 1.45 0.0 2.673 -0.954 3.093 -2.26 h 3.7 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 17.114 Z m 6.792 2.26 c -0.284 0.0 -0.547 -0.097 -0.758 -0.26 h 2.317 c -0.211 0.163 -0.475 0.26 -0.759 0.26 h -0.8 Z")
        )
    }.build()
}
