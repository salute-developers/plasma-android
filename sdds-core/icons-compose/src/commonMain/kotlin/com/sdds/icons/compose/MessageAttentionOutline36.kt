package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageAttentionOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageAttentionOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.47 17.89 c 0.0 -6.981 5.66 -12.64 12.64 -12.64 c 6.981 0.0 12.64 5.659 12.64 12.64 c 0.0 6.98 -5.659 12.64 -12.64 12.64 c -1.502 0.0 -2.944 -0.263 -4.283 -0.745 c -0.804 -0.29 -1.593 -0.373 -2.288 -0.178 L 7.72 30.676 c -1.46 0.409 -2.806 -0.937 -2.397 -2.397 l 1.07 -3.818 c 0.194 -0.695 0.11 -1.484 -0.179 -2.288 c -0.482 -1.339 -0.745 -2.781 -0.745 -4.283 Z m 13.59 -4.862 c 0.0 -0.704 -0.572 -1.275 -1.276 -1.275 c -0.704 0.0 -1.275 0.57 -1.275 1.275 v 5.185 c 0.0 0.705 0.571 1.275 1.275 1.275 s 1.275 -0.57 1.275 -1.275 v -5.185 Z M 19.03 23.753 c -0.154 0.544 -0.654 0.942 -1.247 0.942 c -0.716 0.0 -1.296 -0.58 -1.296 -1.296 c 0.0 -0.125 0.017 -0.245 0.05 -0.36 c 0.155 -0.541 0.654 -0.937 1.246 -0.937 c 0.716 0.0 1.297 0.58 1.297 1.296 c 0.0 0.114 -0.015 0.224 -0.043 0.33 l -0.007 0.025 Z")
        )
    }.build()
}
