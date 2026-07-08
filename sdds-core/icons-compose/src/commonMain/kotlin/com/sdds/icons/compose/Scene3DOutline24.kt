package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Scene3DOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Scene3DOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.337 16.085 C 4.017 16.33 3.069 16.6 2.535 16.77 l -0.017 0.006 c -0.084 0.027 -0.185 0.06 -0.275 0.08 c -0.088 0.02 -0.278 0.06 -0.495 0.003 c -0.248 -0.064 -0.456 -0.216 -0.593 -0.433 c -0.118 -0.187 -0.14 -0.377 -0.148 -0.47 C 1.0 15.868 1.0 15.764 1.0 15.678 V 4.405 C 1.0 4.303 1.0 4.19 1.007 4.093 c 0.007 -0.085 0.024 -0.295 0.155 -0.496 c 0.144 -0.221 0.356 -0.37 0.614 -0.43 c 0.238 -0.054 0.447 0.006 0.525 0.028 C 2.396 3.222 2.506 3.263 2.608 3.3 l 0.018 0.006 C 3.706 3.701 6.563 4.5 12.0 4.5 c 5.437 0.0 8.294 -0.799 9.374 -1.194 L 21.392 3.3 c 0.102 -0.037 0.212 -0.078 0.307 -0.105 c 0.078 -0.022 0.287 -0.082 0.525 -0.027 c 0.258 0.06 0.47 0.208 0.614 0.43 c 0.13 0.2 0.148 0.41 0.155 0.495 C 23.0 4.19 23.0 4.303 23.0 4.405 v 11.272 c 0.0 0.086 0.0 0.19 -0.007 0.28 c -0.008 0.093 -0.03 0.283 -0.148 0.47 c -0.137 0.217 -0.345 0.369 -0.593 0.433 c -0.217 0.057 -0.407 0.018 -0.495 -0.003 c -0.09 -0.02 -0.19 -0.053 -0.275 -0.08 l -0.017 -0.006 c -0.534 -0.17 -1.482 -0.44 -2.802 -0.686 C 18.145 19.297 15.36 21.75 12.0 21.75 c -3.359 0.0 -6.144 -2.453 -6.663 -5.665 Z M 2.5 15.213 V 4.85 C 3.952 5.322 6.922 6.0 12.0 6.0 s 8.048 -0.678 9.5 -1.15 v 10.364 c -0.64 -0.188 -1.569 -0.426 -2.763 -0.64 c -0.22 -3.53 -3.152 -6.324 -6.737 -6.324 s -6.516 2.794 -6.737 6.323 C 4.07 14.788 3.14 15.026 2.5 15.213 Z M 6.75 15.0 c 0.0 -2.9 2.35 -5.25 5.25 -5.25 s 5.25 2.35 5.25 5.25 s -2.35 5.25 -5.25 5.25 S 6.75 17.9 6.75 15.0 Z")
        )
    }.build()
}
