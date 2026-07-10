package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DzenAltFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DzenAltFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.19 3.0 c 0.09 0.0 0.165 0.073 0.167 0.163 c 0.123 3.237 0.534 5.203 1.912 6.581 c 1.374 1.375 3.34 1.787 6.569 1.91 c 0.09 0.004 0.164 0.078 0.164 0.168 L 21.0 12.2 c 0.0 0.091 -0.073 0.165 -0.163 0.168 c -3.23 0.122 -5.194 0.534 -6.57 1.91 c -1.375 1.375 -1.786 3.337 -1.91 6.56 C 12.353 20.927 12.28 21.0 12.19 21.0 h -0.38 c -0.09 0.0 -0.165 -0.073 -0.167 -0.163 c -0.124 -3.223 -0.535 -5.185 -1.91 -6.56 s -3.34 -1.787 -6.57 -1.91 C 3.073 12.363 3.0 12.29 3.0 12.2 v -0.377 c 0.0 -0.091 0.073 -0.166 0.163 -0.169 c 3.23 -0.122 5.194 -0.533 6.57 -1.909 c 1.378 -1.378 1.788 -3.346 1.91 -6.58 C 11.649 3.073 11.724 3.0 11.814 3.0 h 0.377 Z")
        )
    }.build()
}
