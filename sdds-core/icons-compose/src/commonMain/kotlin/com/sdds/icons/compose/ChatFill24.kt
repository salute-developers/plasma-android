package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChatFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChatFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.749 3.0 c -4.004 0.0 -7.25 3.246 -7.25 7.25 c 0.0 0.672 0.092 1.324 0.264 1.943 c 0.172 0.62 0.23 1.186 0.098 1.684 l -0.51 1.939 c -0.292 1.11 0.721 2.124 1.832 1.832 l 1.94 -0.51 c 0.497 -0.131 1.063 -0.074 1.683 0.098 c 0.62 0.172 1.27 0.264 1.943 0.264 c 4.004 0.0 7.25 -3.246 7.25 -7.25 S 13.753 3.0 9.749 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.832 19.0 c 0.836 -0.008 1.645 -0.133 2.41 -0.36 c 0.624 0.233 1.3 0.36 2.007 0.36 c 0.535 0.0 1.052 -0.073 1.542 -0.209 c 0.737 -0.204 1.602 -0.331 2.466 -0.104 l 1.94 0.51 l -0.51 -1.939 c -0.228 -0.864 -0.102 -1.73 0.103 -2.466 C 19.926 14.302 20.0 13.785 20.0 13.25 c 0.0 -1.518 -0.588 -2.898 -1.548 -3.925 c -0.087 -0.828 -0.29 -1.62 -0.59 -2.363 c 2.174 1.252 3.638 3.599 3.638 6.288 c 0.0 0.672 -0.092 1.324 -0.264 1.943 c -0.172 0.62 -0.23 1.186 -0.098 1.683 l 0.51 1.94 c 0.293 1.11 -0.721 2.124 -1.832 1.832 l -1.94 -0.51 c -0.497 -0.131 -1.063 -0.074 -1.683 0.098 c -0.619 0.172 -1.27 0.264 -1.943 0.264 c -1.662 0.0 -3.194 -0.56 -4.417 -1.5 Z")
        )
    }.build()
}
