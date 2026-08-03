package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChatHumanOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChatHumanOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 8.5 c 0.0 1.243 -1.007 2.25 -2.25 2.25 S 7.5 9.743 7.5 8.5 s 1.007 -2.25 2.25 -2.25 S 12.0 7.257 12.0 8.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.528 12.696 c -0.803 1.236 -2.195 2.054 -3.778 2.054 c -1.583 0.0 -2.976 -0.818 -3.778 -2.054 c 1.125 -0.604 2.412 -0.946 3.778 -0.946 s 2.652 0.342 3.778 0.946 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.5 10.25 C 2.5 6.246 5.746 3.0 9.75 3.0 S 17.0 6.246 17.0 10.25 s -3.246 7.25 -7.25 7.25 c -0.672 0.0 -1.324 -0.092 -1.943 -0.264 c -0.62 -0.172 -1.186 -0.23 -1.684 -0.098 l -1.939 0.51 c -1.11 0.292 -2.124 -0.721 -1.832 -1.832 l 0.51 -1.94 c 0.131 -0.497 0.074 -1.063 -0.098 -1.683 C 2.592 11.574 2.5 10.923 2.5 10.25 Z M 9.75 4.5 C 6.574 4.5 4.0 7.074 4.0 10.25 c 0.0 0.535 0.073 1.052 0.209 1.542 c 0.204 0.737 0.331 1.601 0.104 2.466 l -0.51 1.94 l 1.939 -0.51 c 0.864 -0.228 1.73 -0.102 2.466 0.103 C 8.698 15.927 9.215 16.0 9.75 16.0 c 3.176 0.0 5.75 -2.574 5.75 -5.75 S 12.926 4.5 9.75 4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.242 18.64 c -0.764 0.227 -1.573 0.352 -2.409 0.36 c 1.223 0.94 2.755 1.5 4.417 1.5 c 0.672 0.0 1.324 -0.092 1.943 -0.264 c 0.62 -0.172 1.186 -0.23 1.683 -0.098 l 1.94 0.51 c 1.11 0.292 2.124 -0.721 1.832 -1.832 l -0.51 -1.94 c -0.131 -0.497 -0.074 -1.063 0.098 -1.683 c 0.172 -0.62 0.264 -1.271 0.264 -1.943 c 0.0 -2.69 -1.464 -5.037 -3.639 -6.288 c 0.301 0.742 0.504 1.535 0.59 2.363 C 19.413 10.352 20.0 11.732 20.0 13.25 c 0.0 0.535 -0.073 1.052 -0.209 1.542 c -0.204 0.737 -0.331 1.601 -0.104 2.466 l 0.51 1.94 l -1.939 -0.51 c -0.864 -0.228 -1.73 -0.101 -2.466 0.103 C 15.302 18.927 14.785 19.0 14.25 19.0 c -0.706 0.0 -1.383 -0.127 -2.008 -0.36 Z")
        )
    }.build()
}
