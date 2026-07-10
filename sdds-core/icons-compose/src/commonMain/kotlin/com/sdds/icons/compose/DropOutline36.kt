package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DropOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DropOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.82 3.272 c -0.482 -0.363 -1.158 -0.363 -1.64 0.0 l -0.498 0.394 l -0.293 0.242 c -0.3 0.25 -0.623 0.529 -0.963 0.833 c -1.292 1.157 -2.584 2.46 -3.792 3.886 C 8.124 12.77 6.0 17.091 6.0 21.428 C 6.0 27.818 11.373 33.0 18.0 33.0 s 12.0 -5.181 12.0 -11.572 c 0.0 -4.337 -2.125 -8.659 -5.634 -12.8 c -1.208 -1.426 -2.5 -2.73 -3.792 -3.887 c -0.34 -0.304 -0.662 -0.583 -0.963 -0.833 l -0.54 -0.441 l -0.25 -0.195 Z M 18.339 5.45 L 18.0 5.174 l -0.06 0.048 l -0.273 0.225 C 17.385 5.68 17.082 5.943 16.76 6.23 c -1.23 1.102 -2.457 2.34 -3.6 3.69 C 9.807 13.876 8.0 17.752 8.0 21.427 C 8.0 26.646 12.408 31.0 18.0 31.0 s 10.0 -4.354 10.0 -9.572 c 0.0 -3.675 -1.807 -7.55 -5.16 -11.508 c -1.143 -1.349 -2.37 -2.587 -3.6 -3.689 c -0.32 -0.286 -0.622 -0.547 -0.902 -0.78 Z")
        )
    }.build()
}
