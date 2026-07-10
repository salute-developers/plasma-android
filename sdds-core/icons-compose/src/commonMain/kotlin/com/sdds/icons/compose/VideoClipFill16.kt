package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VideoClipFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VideoClipFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.018 2.5 H 5.982 c -0.765 0.0 -1.37 0.0 -1.859 0.04 c -0.5 0.04 -0.922 0.123 -1.308 0.316 C 2.19 3.169 1.681 3.669 1.362 4.283 C 1.166 4.662 1.081 5.077 1.04 5.567 C 1.0 6.047 1.0 6.642 1.0 7.393 v 1.214 c 0.0 0.75 0.0 1.346 0.04 1.826 c 0.04 0.49 0.126 0.905 0.322 1.284 c 0.32 0.614 0.828 1.114 1.453 1.427 c 0.386 0.193 0.809 0.277 1.308 0.317 C 4.612 13.5 5.217 13.5 5.982 13.5 h 4.036 c 0.765 0.0 1.37 0.0 1.859 -0.04 c 0.5 -0.04 0.922 -0.123 1.307 -0.316 c 0.626 -0.313 1.135 -0.813 1.454 -1.427 c 0.196 -0.379 0.281 -0.794 0.322 -1.284 C 15.0 9.953 15.0 9.358 15.0 8.607 V 7.393 c 0.0 -0.75 0.0 -1.346 -0.04 -1.826 c -0.04 -0.49 -0.126 -0.905 -0.322 -1.284 c -0.32 -0.614 -0.828 -1.114 -1.454 -1.427 c -0.385 -0.193 -0.808 -0.277 -1.307 -0.317 C 11.388 2.5 10.783 2.5 10.018 2.5 Z m 0.257 6.095 c 0.467 -0.264 0.467 -0.926 0.0 -1.19 l -3.15 -1.787 c -0.467 -0.264 -1.05 0.067 -1.05 0.596 v 3.572 c 0.0 0.53 0.583 0.86 1.05 0.596 l 3.15 -1.787 Z")
        )
    }.build()
}
