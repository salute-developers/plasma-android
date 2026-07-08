package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VideoClipFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VideoClipFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.325 6.0 h -8.65 c -1.638 0.0 -2.936 0.0 -3.982 0.085 c -1.07 0.088 -1.976 0.27 -2.803 0.692 C 5.55 7.46 4.46 8.55 3.777 9.89 c -0.422 0.827 -0.604 1.732 -0.692 2.803 C 3.0 13.739 3.0 15.037 3.0 16.675 v 2.65 c 0.0 1.638 0.0 2.936 0.085 3.982 c 0.088 1.07 0.27 1.976 0.692 2.803 c 0.683 1.34 1.773 2.43 3.113 3.113 c 0.827 0.422 1.733 0.604 2.803 0.692 C 10.739 30.0 12.037 30.0 13.675 30.0 h 8.65 c 1.638 0.0 2.936 0.0 3.982 -0.085 c 1.07 -0.088 1.976 -0.27 2.803 -0.692 c 1.34 -0.683 2.43 -1.773 3.113 -3.113 c 0.422 -0.827 0.604 -1.732 0.691 -2.803 C 33.0 22.261 33.0 20.963 33.0 19.325 v -2.65 c 0.0 -1.638 0.0 -2.936 -0.086 -3.982 c -0.087 -1.07 -0.27 -1.976 -0.69 -2.803 c -0.684 -1.34 -1.774 -2.43 -3.114 -3.113 c -0.827 -0.422 -1.732 -0.604 -2.803 -0.692 C 25.261 6.0 23.963 6.0 22.325 6.0 Z m 0.55 13.299 c 1.0 -0.577 1.0 -2.02 0.0 -2.598 l -6.75 -3.897 c -1.0 -0.578 -2.25 0.144 -2.25 1.299 v 7.794 c 0.0 1.155 1.25 1.876 2.25 1.3 l 6.75 -3.898 Z")
        )
    }.build()
}
