package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ViewSplit4Outline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ViewSplit4Outline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.721 2.5 h 8.558 c 0.375 0.0 0.686 0.0 0.94 0.02 c 0.265 0.022 0.51 0.069 0.743 0.187 c 0.358 0.182 0.649 0.473 0.83 0.831 c 0.119 0.232 0.166 0.478 0.187 0.743 C 15.0 4.535 15.0 4.846 15.0 5.22 v 5.558 c 0.0 0.375 0.0 0.686 -0.02 0.94 c -0.022 0.265 -0.069 0.51 -0.187 0.743 c -0.182 0.358 -0.473 0.649 -0.831 0.83 c -0.232 0.119 -0.478 0.166 -0.743 0.187 c -0.254 0.021 -0.565 0.021 -0.94 0.021 H 3.72 c -0.375 0.0 -0.686 0.0 -0.94 -0.02 c -0.265 -0.022 -0.51 -0.069 -0.743 -0.187 c -0.358 -0.182 -0.649 -0.473 -0.83 -0.831 c -0.119 -0.232 -0.166 -0.478 -0.187 -0.743 C 1.0 11.465 1.0 11.154 1.0 10.78 V 5.22 c 0.0 -0.375 0.0 -0.686 0.02 -0.94 c 0.022 -0.265 0.069 -0.51 0.187 -0.743 C 1.39 3.18 1.68 2.889 2.038 2.708 C 2.27 2.587 2.516 2.541 2.781 2.52 C 3.035 2.5 3.346 2.5 3.72 2.5 Z M 2.862 3.517 C 2.66 3.534 2.56 3.564 2.492 3.598 c -0.17 0.087 -0.307 0.224 -0.394 0.394 c -0.034 0.068 -0.064 0.168 -0.08 0.37 C 2.0 4.571 2.0 4.842 2.0 5.242 V 7.5 h 5.5 v -4.0 H 3.742 c -0.4 0.0 -0.671 0.0 -0.88 0.017 Z M 8.5 3.5 v 4.0 H 14.0 V 5.242 c 0.0 -0.4 0.0 -0.671 -0.017 -0.88 c -0.017 -0.202 -0.047 -0.302 -0.081 -0.37 c -0.087 -0.17 -0.224 -0.307 -0.394 -0.394 c -0.068 -0.034 -0.167 -0.064 -0.37 -0.08 C 12.929 3.5 12.658 3.5 12.258 3.5 H 8.5 Z m 5.5 5.0 H 8.5 v 4.0 h 3.758 c 0.4 0.0 0.671 0.0 0.88 -0.017 c 0.203 -0.017 0.302 -0.047 0.37 -0.081 c 0.17 -0.087 0.307 -0.224 0.394 -0.394 c 0.034 -0.068 0.064 -0.167 0.08 -0.37 C 14.0 11.429 14.0 11.158 14.0 10.758 V 8.5 Z m -6.5 4.0 v -4.0 H 2.0 v 2.258 c 0.0 0.4 0.0 0.671 0.017 0.88 c 0.017 0.203 0.047 0.302 0.081 0.37 c 0.087 0.17 0.224 0.307 0.394 0.394 c 0.068 0.034 0.168 0.064 0.37 0.08 c 0.209 0.018 0.48 0.018 0.88 0.018 H 7.5 Z")
        )
    }.build()
}
