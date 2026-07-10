package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChatHumanFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChatHumanFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.5 10.25 C 2.5 6.246 5.746 3.0 9.75 3.0 S 17.0 6.246 17.0 10.25 s -3.246 7.25 -7.25 7.25 c -0.672 0.0 -1.324 -0.092 -1.943 -0.264 c -0.62 -0.172 -1.186 -0.23 -1.684 -0.098 l -1.939 0.51 c -1.11 0.292 -2.124 -0.721 -1.832 -1.832 l 0.51 -1.94 c 0.131 -0.497 0.074 -1.063 -0.098 -1.683 C 2.592 11.574 2.5 10.923 2.5 10.25 Z m 7.25 0.5 c 1.243 0.0 2.25 -1.007 2.25 -2.25 s -1.007 -2.25 -2.25 -2.25 S 7.5 7.257 7.5 8.5 s 1.007 2.25 2.25 2.25 Z m 0.0 4.0 c 1.583 0.0 2.976 -0.818 3.778 -2.054 c -1.126 -0.604 -2.412 -0.946 -3.778 -0.946 s -2.652 0.342 -3.778 0.946 c 0.802 1.236 2.195 2.054 3.778 2.054 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.833 19.0 c 0.836 -0.008 1.645 -0.133 2.41 -0.36 c 0.624 0.233 1.3 0.36 2.007 0.36 c 0.535 0.0 1.052 -0.073 1.542 -0.209 c 0.737 -0.204 1.601 -0.331 2.466 -0.104 l 1.94 0.51 l -0.51 -1.939 c -0.228 -0.864 -0.101 -1.73 0.103 -2.466 C 19.927 14.302 20.0 13.785 20.0 13.25 c 0.0 -1.518 -0.588 -2.898 -1.548 -3.925 c -0.087 -0.828 -0.29 -1.62 -0.59 -2.363 C 20.035 8.214 21.5 10.56 21.5 13.25 c 0.0 0.672 -0.092 1.324 -0.264 1.943 c -0.172 0.62 -0.23 1.186 -0.098 1.683 l 0.51 1.94 c 0.292 1.11 -0.721 2.124 -1.832 1.832 l -1.94 -0.51 c -0.497 -0.131 -1.063 -0.074 -1.683 0.098 c -0.62 0.172 -1.27 0.264 -1.943 0.264 c -1.662 0.0 -3.194 -0.56 -4.417 -1.5 Z")
        )
    }.build()
}
