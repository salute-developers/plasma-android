package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessagePersonChatFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessagePersonChatFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.11 5.25 c -6.98 0.0 -12.64 5.659 -12.64 12.64 c 0.0 1.502 0.263 2.944 0.745 4.283 c 0.29 0.804 0.373 1.593 0.178 2.288 L 5.324 28.28 c -0.409 1.46 0.937 2.806 2.397 2.397 l 3.818 -1.07 c 0.695 -0.194 1.484 -0.11 2.288 0.179 c 1.232 0.444 2.551 0.701 3.924 0.74 c -0.656 -1.291 -1.026 -2.752 -1.026 -4.3 c 0.0 -5.247 4.253 -9.5 9.5 -9.5 c 1.638 0.0 3.18 0.415 4.525 1.145 c -0.01 -6.972 -5.666 -12.62 -12.64 -12.62 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.5 35.0 c 4.694 0.0 8.5 -3.806 8.5 -8.5 S 31.194 18.0 26.5 18.0 S 18.0 21.806 18.0 26.5 s 3.806 8.5 8.5 8.5 Z m 3.477 -11.978 c 0.0 1.92 -1.557 3.477 -3.477 3.477 s -3.477 -1.556 -3.477 -3.477 c 0.0 -1.92 1.556 -3.477 3.477 -3.477 c 1.92 0.0 3.477 1.557 3.477 3.477 Z m 2.362 7.259 c -1.24 1.91 -3.391 3.173 -5.838 3.173 s -4.599 -1.264 -5.838 -3.174 c 1.738 -0.933 3.726 -1.462 5.837 -1.462 c 2.112 0.0 4.1 0.53 5.839 1.463 Z")
        )
    }.build()
}
