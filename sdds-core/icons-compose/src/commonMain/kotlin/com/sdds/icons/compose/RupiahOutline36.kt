package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RupiahOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RupiahOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.25 18.0 c 0.0 -7.042 5.708 -12.75 12.75 -12.75 S 30.75 10.958 30.75 18.0 S 25.042 30.75 18.0 30.75 S 5.25 25.042 5.25 18.0 Z M 18.0 3.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 Z m -4.125 7.5 c -0.621 0.0 -1.125 0.504 -1.125 1.125 s 0.504 1.125 1.125 1.125 h 3.0 c 0.866 0.0 1.501 0.38 1.944 0.909 c 0.156 0.187 0.284 0.388 0.385 0.591 h -4.579 c -0.621 0.0 -1.125 0.504 -1.125 1.125 s 0.504 1.125 1.125 1.125 h 4.58 c -0.102 0.203 -0.23 0.404 -0.386 0.591 C 18.376 17.621 17.74 18.0 16.875 18.0 h -3.0 c -0.621 0.0 -1.125 0.504 -1.125 1.125 c 0.0 0.374 0.183 0.706 0.464 0.91 c 0.034 0.048 0.073 0.093 0.115 0.136 l 5.75 5.75 c 0.44 0.439 1.152 0.439 1.591 0.0 c 0.44 -0.44 0.44 -1.152 0.0 -1.591 l -4.079 -4.08 h 0.284 c 1.62 0.0 2.859 -0.745 3.67 -1.716 c 0.51 -0.61 0.866 -1.326 1.052 -2.034 h 1.278 c 0.621 0.0 1.125 -0.504 1.125 -1.125 s -0.504 -1.125 -1.125 -1.125 h -1.277 c -0.135 -0.51 -0.357 -1.024 -0.662 -1.5 h 1.939 c 0.621 0.0 1.125 -0.504 1.125 -1.125 S 23.496 10.5 22.875 10.5 h -9.0 Z")
        )
    }.build()
}
