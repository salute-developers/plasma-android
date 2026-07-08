package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageChatFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageChatFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.47 17.89 c 0.0 -6.981 5.66 -12.64 12.64 -12.64 c 6.981 0.0 12.64 5.659 12.64 12.64 c 0.0 6.98 -5.659 12.64 -12.64 12.64 c -1.502 0.0 -2.944 -0.263 -4.283 -0.745 c -0.804 -0.29 -1.593 -0.373 -2.288 -0.178 L 7.72 30.676 c -1.46 0.409 -2.806 -0.937 -2.397 -2.397 l 1.07 -3.818 c 0.194 -0.695 0.11 -1.484 -0.179 -2.288 c -0.482 -1.339 -0.745 -2.781 -0.745 -4.283 Z m 19.628 -0.94 c -0.356 -0.416 -0.886 -0.68 -1.478 -0.68 c -1.074 0.0 -1.944 0.87 -1.944 1.944 c 0.0 0.481 0.175 0.922 0.464 1.262 c 0.357 0.418 0.888 0.683 1.48 0.683 c 1.074 0.0 1.945 -0.87 1.945 -1.945 c 0.0 -0.482 -0.176 -0.924 -0.467 -1.264 Z m -5.367 1.264 v 0.05 v -0.05 Z m 0.0 0.05 c -0.027 1.051 -0.887 1.895 -1.945 1.895 c -1.053 0.0 -1.91 -0.838 -1.943 -1.883 l -0.001 -0.037 v -0.025 c 0.0 -1.074 0.87 -1.945 1.944 -1.945 c 1.074 0.0 1.945 0.87 1.945 1.945 m -6.302 1.266 c 0.292 -0.34 0.468 -0.783 0.468 -1.266 c 0.0 -1.074 -0.87 -1.945 -1.944 -1.945 c -0.59 0.0 -1.12 0.264 -1.477 0.679 c -0.292 0.34 -0.468 0.783 -0.468 1.266 c 0.0 1.074 0.87 1.945 1.944 1.945 c 0.59 0.0 1.12 -0.264 1.477 -0.679 Z")
        )
    }.build()
}
