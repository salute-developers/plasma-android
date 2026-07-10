package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudErrorFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudErrorFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 30.985 18.44 C 32.23 19.664 33.0 21.366 33.0 23.25 c 0.0 3.728 -3.022 6.75 -6.75 6.75 H 11.625 C 6.862 30.0 3.0 26.139 3.0 21.375 c 0.0 -3.97 2.682 -7.313 6.333 -8.317 l 0.06 -0.014 c 1.142 -0.306 2.335 -0.374 3.505 -0.2 c 1.17 0.175 2.292 0.589 3.295 1.215 c 1.003 0.627 1.867 1.453 2.537 2.427 c 0.671 0.975 1.134 2.077 1.36 3.238 c 0.106 0.542 0.631 0.895 1.173 0.79 c 0.542 -0.106 0.896 -0.631 0.79 -1.174 c -0.066 -0.34 -0.15 -0.677 -0.248 -1.009 c 1.4 0.746 2.998 1.169 4.695 1.169 c 1.613 0.0 3.136 -0.382 4.485 -1.06 Z M 17.053 6.212 c -2.762 0.574 -5.11 2.274 -6.547 4.597 c 0.893 -0.094 1.796 -0.075 2.688 0.058 c 1.285 0.191 2.524 0.618 3.653 1.255 C 16.621 11.287 16.5 10.407 16.5 9.5 c 0.0 -1.152 0.195 -2.258 0.553 -3.288 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.5 18.0 c 4.694 0.0 8.5 -3.806 8.5 -8.5 S 31.194 1.0 26.5 1.0 S 18.0 4.806 18.0 9.5 s 3.806 8.5 8.5 8.5 Z M 23.752 5.691 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 c -0.294 0.293 -0.294 0.768 0.0 1.06 L 25.438 9.5 l -2.748 2.748 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.294 0.768 0.294 1.061 0.0 l 2.748 -2.747 l 2.748 2.748 c 0.293 0.293 0.768 0.293 1.06 0.0 c 0.294 -0.293 0.294 -0.768 0.0 -1.06 L 27.562 9.5 l 2.748 -2.748 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.294 -0.768 -0.294 -1.06 0.0 L 26.5 8.438 l -2.748 -2.748 Z")
        )
    }.build()
}
