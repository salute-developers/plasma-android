package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.053 12.789 c -1.27 -0.819 -1.46 -2.6 -0.392 -3.668 c 0.985 -0.985 2.434 -1.341 3.762 -0.926 l 9.941 3.107 l 3.685 -3.918 c 1.521 -1.618 4.08 -1.657 5.65 -0.087 c 1.57 1.57 1.53 4.128 -0.087 5.65 l -3.919 3.685 l 3.107 9.94 c 0.415 1.328 0.059 2.777 -0.925 3.762 c -1.069 1.068 -2.85 0.878 -3.669 -0.391 l -4.784 -7.415 l -2.857 2.687 l 0.01 1.353 c 0.008 1.07 -0.414 2.1 -1.171 2.857 L 13.08 30.75 c -0.72 0.72 -1.947 0.434 -2.274 -0.53 L 9.53 26.463 l -3.755 -1.276 c -0.964 -0.327 -1.25 -1.553 -0.53 -2.274 L 6.57 21.59 c 0.757 -0.758 1.786 -1.18 2.857 -1.172 l 1.357 0.01 l 2.684 -2.855 l -7.414 -4.784 Z m 5.222 12.594 l 1.101 3.241 l 0.613 -0.613 c 0.379 -0.379 0.59 -0.893 0.586 -1.428 l -0.013 -1.79 c -0.002 -0.279 0.112 -0.545 0.315 -0.736 l 4.05 -3.808 c 0.216 -0.203 0.511 -0.3 0.806 -0.264 c 0.295 0.036 0.558 0.2 0.719 0.45 l 5.435 8.423 c 0.128 0.199 0.406 0.229 0.573 0.061 c 0.459 -0.458 0.624 -1.132 0.431 -1.75 L 22.597 16.63 c -0.114 -0.366 -0.01 -0.765 0.27 -1.027 l 4.375 -4.114 c 0.795 -0.748 0.814 -2.006 0.042 -2.779 c -0.772 -0.772 -2.03 -0.753 -2.778 0.043 l -4.114 4.375 c -0.262 0.279 -0.661 0.383 -1.027 0.27 L 8.827 10.103 c -0.619 -0.193 -1.293 -0.027 -1.751 0.43 c -0.167 0.168 -0.138 0.446 0.06 0.574 l 8.424 5.436 c 0.25 0.16 0.415 0.424 0.45 0.718 c 0.037 0.295 -0.06 0.59 -0.263 0.807 l -3.806 4.047 c -0.19 0.203 -0.457 0.317 -0.736 0.315 l -1.793 -0.013 c -0.536 -0.004 -1.05 0.207 -1.429 0.586 L 7.37 23.617 l 3.27 1.11 c 0.307 0.105 0.542 0.35 0.635 0.656 Z")
        )
    }.build()
}
