package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NetworkFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NetworkFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.05 5.05 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 C 4.396 5.584 3.5 7.746 3.5 10.0 s 0.896 4.416 2.49 6.01 c 0.292 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.292 0.293 -0.767 0.0 -1.06 C 5.737 13.637 5.0 11.857 5.0 10.0 c 0.0 -1.856 0.737 -3.637 2.05 -4.95 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 10.0 c 0.0 -2.209 1.79 -4.0 4.0 -4.0 s 4.0 1.791 4.0 4.0 c 0.0 1.953 -1.4 3.579 -3.25 3.93 v 6.32 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -6.32 C 9.4 13.579 8.0 11.953 8.0 10.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.95 3.99 c 0.293 -0.293 0.768 -0.293 1.06 0.0 C 19.605 5.584 20.5 7.746 20.5 10.0 s -0.895 4.416 -2.49 6.01 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 C 18.263 13.637 19.0 11.857 19.0 10.0 c 0.0 -1.856 -0.738 -3.637 -2.05 -4.95 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 Z")
        )
    }.build()
}
