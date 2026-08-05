package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VkOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VkOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.28 5.521 c 0.046 2.415 1.1 3.439 1.936 3.65 V 5.52 h 1.347 v 2.083 c 0.825 -0.09 1.691 -1.039 1.984 -2.083 h 1.347 c -0.225 1.287 -1.164 2.236 -1.832 2.626 c 0.668 0.317 1.738 1.145 2.145 2.642 h -1.482 c -0.319 -1.002 -1.112 -1.776 -2.162 -1.882 v 1.882 H 8.401 c -2.855 0.0 -4.484 -1.977 -4.552 -5.268 h 1.43 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.251 1.672 c 2.835 0.0 4.253 0.0 5.134 0.89 c 0.88 0.89 0.88 2.322 0.88 5.185 v 0.506 c 0.0 2.864 0.0 4.296 -0.88 5.185 c -0.881 0.89 -2.299 0.89 -5.134 0.89 H 7.75 c -2.835 0.0 -4.253 0.0 -5.134 -0.89 c -0.88 -0.89 -0.88 -2.322 -0.88 -5.185 V 7.747 c 0.0 -2.863 0.0 -4.296 0.88 -5.185 c 0.881 -0.89 2.299 -0.89 5.134 -0.89 h 0.501 Z M 7.786 2.67 c -2.388 0.0 -3.582 0.0 -4.324 0.75 S 2.72 5.375 2.72 7.787 v 0.426 c 0.0 2.412 0.0 3.619 0.742 4.368 c 0.742 0.75 1.936 0.75 4.324 0.75 h 0.422 c 2.388 0.0 3.582 0.0 4.324 -0.75 s 0.742 -1.956 0.742 -4.368 V 7.787 c 0.0 -2.412 0.0 -3.618 -0.742 -4.367 c -0.742 -0.75 -1.936 -0.75 -4.324 -0.75 H 7.786 Z")
        )
    }.build()
}
