package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BitbucketOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BitbucketOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.521 3.013 c 0.252 0.057 0.427 0.302 0.382 0.569 l -2.834 17.0 C 19.03 20.823 18.821 21.0 18.576 21.0 H 5.424 l -0.09 -0.008 c -0.175 -0.032 -0.32 -0.155 -0.38 -0.323 L 4.93 20.582 l -2.834 -17.0 C 2.047 3.278 2.28 3.0 2.59 3.0 h 18.82 l 0.111 0.013 Z M 6.271 19.5 H 17.73 l 1.666 -10.0 h -3.584 l -0.757 6.063 l -0.02 0.09 C 14.97 15.855 14.78 16.0 14.56 16.0 H 9.44 L 9.35 15.991 c -0.18 -0.034 -0.328 -0.164 -0.384 -0.339 l -0.02 -0.09 l -0.875 -7.0 c -0.032 -0.26 0.142 -0.496 0.387 -0.55 L 8.567 8.0 h 11.08 l 0.583 -3.5 H 3.77 l 2.5 15.0 Z m 4.053 -5.0 h 3.352 l 0.625 -5.0 H 9.699 l 0.625 5.0 Z")
        )
    }.build()
}
