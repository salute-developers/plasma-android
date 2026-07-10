package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageAttentionFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageAttentionFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.786 11.724 c 0.69 0.0 1.25 0.56 1.25 1.25 v 5.237 c 0.0 0.69 -0.56 1.25 -1.25 1.25 s -1.25 -0.56 -1.25 -1.25 v -5.237 c 0.0 -0.69 0.56 -1.25 1.25 -1.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.095 23.447 c 0.0 0.723 -0.586 1.31 -1.31 1.31 c -0.722 0.0 -1.308 -0.587 -1.308 -1.31 c 0.0 -0.723 0.586 -1.31 1.309 -1.31 s 1.309 0.587 1.309 1.31 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.116 5.102 c -7.06 0.0 -12.782 5.722 -12.782 12.781 c 0.0 1.535 0.27 3.008 0.767 4.373 c 0.285 0.781 0.364 1.547 0.176 2.22 l -1.103 3.937 c -0.411 1.47 0.943 2.823 2.412 2.411 l 3.938 -1.102 c 0.672 -0.188 1.438 -0.109 2.219 0.175 c 1.365 0.498 2.839 0.768 4.373 0.768 c 7.06 0.0 12.782 -5.722 12.782 -12.782 c 0.0 -7.059 -5.723 -12.781 -12.782 -12.781 Z M 7.334 17.883 c 0.0 -5.954 4.827 -10.781 10.782 -10.781 s 10.782 4.827 10.782 10.781 c 0.0 5.955 -4.827 10.782 -10.782 10.782 c -1.298 0.0 -2.54 -0.229 -3.689 -0.647 c -1.04 -0.378 -2.25 -0.556 -3.443 -0.222 l -3.863 1.082 l 1.082 -3.863 c 0.334 -1.194 0.156 -2.403 -0.222 -3.443 c -0.419 -1.15 -0.647 -2.391 -0.647 -3.689 Z")
        )
    }.build()
}
