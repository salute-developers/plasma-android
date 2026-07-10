package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DropDashOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DropDashOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.342 5.653 C 13.082 6.951 13.5 8.273 13.5 9.6 c 0.0 2.982 -2.463 5.4 -5.5 5.4 c -1.399 0.0 -2.677 -0.513 -3.647 -1.358 l 0.709 -0.71 C 5.848 13.598 6.872 14.0 8.0 14.0 c 2.503 0.0 4.5 -1.988 4.5 -4.4 c 0.0 -1.039 -0.307 -2.113 -0.894 -3.211 l 0.736 -0.736 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.624 1.127 c 0.221 -0.17 0.531 -0.17 0.752 0.0 l 0.114 0.09 l 0.248 0.207 C 8.876 1.54 9.024 1.67 9.18 1.813 c 0.592 0.54 1.184 1.148 1.738 1.813 c 0.096 0.115 0.19 0.232 0.281 0.348 l 2.327 -2.328 c 0.195 -0.195 0.511 -0.195 0.707 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 l -11.88 11.88 c -0.194 0.194 -0.511 0.194 -0.706 0.0 c -0.196 -0.196 -0.196 -0.513 0.0 -0.709 l 1.459 -1.459 C 2.718 11.327 2.5 10.488 2.5 9.6 c 0.0 -2.024 0.974 -4.041 2.582 -5.974 c 0.554 -0.665 1.146 -1.273 1.739 -1.813 c 0.155 -0.143 0.303 -0.272 0.44 -0.39 l 0.135 -0.112 l 0.228 -0.184 Z m 0.282 1.06 C 7.78 2.298 7.641 2.419 7.494 2.553 C 6.933 3.064 6.372 3.639 5.851 4.266 C 4.32 6.105 3.5 7.9 3.5 9.6 c 0.0 0.607 0.125 1.188 0.355 1.716 l 6.63 -6.63 c -0.108 -0.14 -0.22 -0.28 -0.337 -0.42 c -0.522 -0.627 -1.081 -1.202 -1.643 -1.714 C 8.36 2.419 8.222 2.298 8.095 2.189 L 7.999 2.11 L 7.906 2.188 Z")
        )
    }.build()
}
