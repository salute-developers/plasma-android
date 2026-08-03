package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SearchError36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SearchError36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.0 15.5 C 7.0 10.806 10.806 7.0 15.5 7.0 s 8.5 3.806 8.5 8.5 c 0.0 3.46 -2.068 6.438 -5.035 7.764 c 0.216 0.634 0.371 1.296 0.457 1.98 c 1.007 -0.407 1.938 -0.965 2.762 -1.646 l 7.859 7.86 c 0.39 0.39 1.024 0.39 1.414 0.0 c 0.39 -0.391 0.39 -1.025 0.0 -1.415 l -7.859 -7.859 C 25.098 20.368 26.0 18.039 26.0 15.5 C 26.0 9.701 21.299 5.0 15.5 5.0 S 5.0 9.701 5.0 15.5 c 0.0 0.675 0.064 1.336 0.186 1.976 c 0.606 -0.29 1.245 -0.521 1.911 -0.685 C 7.033 16.37 7.0 15.939 7.0 15.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 26.5 c 0.0 4.694 -3.806 8.5 -8.5 8.5 S 1.0 31.194 1.0 26.5 S 4.806 18.0 9.5 18.0 s 8.5 3.806 8.5 8.5 Z M 5.691 22.691 c 0.293 -0.293 0.768 -0.293 1.061 0.0 L 9.5 25.44 l 2.748 -2.748 c 0.293 -0.293 0.768 -0.293 1.06 0.0 c 0.294 0.293 0.294 0.768 0.0 1.06 L 10.562 26.5 l 2.748 2.748 c 0.293 0.293 0.293 0.768 0.0 1.06 c -0.293 0.294 -0.768 0.294 -1.06 0.0 L 9.5 27.562 l -2.748 2.748 c -0.293 0.293 -0.768 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 L 8.44 26.5 L 5.69 23.752 c -0.292 -0.293 -0.292 -0.768 0.0 -1.06 Z")
        )
    }.build()
}
