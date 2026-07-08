package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NetworkOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NetworkOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.461 2.856 c 0.197 -0.194 0.2 -0.51 0.005 -0.707 C 4.272 1.952 3.956 1.95 3.76 2.144 C 2.634 3.254 2.0 4.76 2.0 6.333 c 0.0 1.572 0.634 3.079 1.76 4.188 c 0.196 0.194 0.512 0.192 0.706 -0.005 c 0.194 -0.196 0.192 -0.513 -0.005 -0.707 C 3.525 8.886 3.0 7.635 3.0 6.333 C 3.0 5.03 3.525 3.779 4.461 2.856 Z m 1.731 3.477 c 0.0 -0.973 0.802 -1.773 1.806 -1.773 c 1.003 0.0 1.805 0.8 1.805 1.773 c 0.0 0.972 -0.802 1.773 -1.805 1.773 c -1.004 0.0 -1.806 -0.8 -1.806 -1.773 Z M 7.998 3.56 c -1.543 0.0 -2.806 1.235 -2.806 2.773 c 0.0 1.368 1.0 2.496 2.306 2.729 v 4.44 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 v -4.44 c 1.306 -0.233 2.305 -1.361 2.305 -2.73 c 0.0 -1.537 -1.263 -2.772 -2.805 -2.772 Z m 3.53 -1.411 c 0.195 -0.197 0.511 -0.199 0.708 -0.005 c 1.125 1.11 1.76 2.616 1.76 4.189 c 0.0 1.572 -0.635 3.079 -1.76 4.188 c -0.197 0.194 -0.513 0.192 -0.707 -0.005 c -0.194 -0.196 -0.192 -0.513 0.005 -0.707 c 0.936 -0.923 1.461 -2.174 1.461 -3.476 c 0.0 -1.303 -0.525 -2.554 -1.461 -3.477 c -0.197 -0.194 -0.199 -0.51 -0.005 -0.707 Z")
        )
    }.build()
}
