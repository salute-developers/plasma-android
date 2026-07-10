package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MailPlusFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MailPlusFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.863 2.5 h 6.274 c 0.57 0.0 1.028 0.0 1.4 0.03 c 0.383 0.03 0.719 0.095 1.03 0.251 c 0.494 0.247 0.895 0.642 1.147 1.127 c 0.158 0.305 0.224 0.635 0.256 1.011 C 15.0 5.284 15.0 5.735 15.0 6.293 v 2.353 C 14.204 7.933 13.152 7.5 12.0 7.5 c -2.485 0.0 -4.5 2.015 -4.5 4.5 c 0.0 0.526 0.09 1.03 0.256 1.5 H 4.863 c -0.57 0.0 -1.028 0.0 -1.4 -0.03 c -0.383 -0.03 -0.719 -0.095 -1.03 -0.251 c -0.494 -0.247 -0.895 -0.642 -1.147 -1.127 c -0.158 -0.305 -0.224 -0.635 -0.256 -1.011 C 1.0 10.716 1.0 10.265 1.0 9.706 V 6.294 c 0.0 -0.56 0.0 -1.01 0.03 -1.375 c 0.032 -0.376 0.098 -0.706 0.256 -1.011 c 0.252 -0.485 0.653 -0.88 1.147 -1.127 c 0.311 -0.156 0.647 -0.22 1.03 -0.251 c 0.372 -0.03 0.83 -0.03 1.4 -0.03 Z M 3.02 5.335 c 0.143 -0.236 0.45 -0.312 0.687 -0.17 L 7.172 7.26 c 0.508 0.308 1.146 0.308 1.655 0.0 l 3.464 -2.093 c 0.236 -0.143 0.543 -0.067 0.686 0.17 c 0.143 0.235 0.067 0.543 -0.17 0.686 L 9.345 8.115 c -0.827 0.5 -1.863 0.5 -2.69 0.0 L 3.191 6.022 c -0.237 -0.143 -0.313 -0.45 -0.17 -0.687 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 15.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m 0.35 -5.795 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 c -0.193 0.0 -0.35 0.157 -0.35 0.35 v 1.695 H 9.955 c -0.194 0.0 -0.35 0.157 -0.35 0.35 c 0.0 0.194 0.156 0.35 0.35 0.35 h 1.695 v 1.696 c 0.0 0.193 0.157 0.35 0.35 0.35 c 0.193 0.0 0.35 -0.157 0.35 -0.35 v -1.695 h 1.696 c 0.193 0.0 0.35 -0.157 0.35 -0.35 c 0.0 -0.194 -0.157 -0.35 -0.35 -0.35 H 12.35 V 9.954 Z")
        )
    }.build()
}
