package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TelegramFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TelegramFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.602 5.132 c 0.023 -0.008 1.669 -0.638 1.53 0.928 c -0.046 0.65 -0.416 2.922 -0.787 5.38 c -0.556 3.47 -1.158 7.265 -1.16 7.281 c 0.0 0.0 -0.093 1.067 -0.881 1.252 c -0.788 0.185 -2.086 -0.648 -2.319 -0.834 c -0.185 -0.139 -3.478 -2.227 -4.684 -3.247 c -0.325 -0.278 -0.696 -0.834 0.046 -1.483 c 1.67 -1.53 3.664 -3.433 4.87 -4.64 c 0.556 -0.556 1.112 -1.854 -1.206 -0.277 c -3.293 2.272 -6.54 4.406 -6.54 4.406 C 7.468 13.9 6.726 14.36 5.34 13.945 c -1.381 -0.415 -2.99 -0.967 -3.015 -0.975 c 0.0 0.0 -1.113 -0.695 0.788 -1.437 c 0.02 -0.009 8.027 -3.294 10.806 -4.453 c 1.067 -0.463 4.684 -1.948 4.684 -1.948 Z")
        )
    }.build()
}
