package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarRecommendOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarRecommendOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 12.168 3.973 c -0.39 -0.764 -1.48 -0.764 -1.87 0.0 L 8.04 8.396 l -4.904 0.78 c -0.847 0.135 -1.184 1.173 -0.578 1.78 l 3.51 3.513 l -0.774 4.905 c -0.134 0.847 0.749 1.488 1.513 1.1 l 4.232 -2.153 c 0.37 -0.188 0.516 -0.64 0.328 -1.009 c -0.188 -0.37 -0.639 -0.516 -1.008 -0.328 l -3.446 1.753 l 0.672 -4.26 c 0.052 -0.332 -0.057 -0.669 -0.295 -0.906 l -3.047 -3.052 l 4.26 -0.677 c 0.33 -0.053 0.617 -0.261 0.77 -0.56 l 1.96 -3.842 l 1.815 3.557 c 0.188 0.369 0.64 0.515 1.009 0.327 c 0.369 -0.189 0.515 -0.64 0.327 -1.01 l -2.216 -4.34 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.06 9.702 c -0.39 -0.764 -1.48 -0.764 -1.87 0.0 l -1.214 2.38 l -2.638 0.419 c -0.847 0.134 -1.184 1.172 -0.578 1.779 l 1.888 1.89 l -0.417 2.638 c -0.133 0.847 0.75 1.488 1.514 1.1 l 2.38 -1.212 l 2.381 1.211 c 0.764 0.39 1.647 -0.252 1.513 -1.099 l -0.416 -2.638 l 1.888 -1.89 c 0.605 -0.607 0.268 -1.645 -0.578 -1.78 l -2.638 -0.419 l -1.214 -2.379 Z m -1.852 3.265 l 0.917 -1.798 l 0.918 1.798 c 0.152 0.299 0.439 0.507 0.77 0.56 l 1.993 0.317 l -1.426 1.428 c -0.237 0.237 -0.346 0.574 -0.294 0.905 l 0.314 1.994 l -1.799 -0.915 c -0.299 -0.153 -0.653 -0.153 -0.952 0.0 L 13.85 18.17 l 0.315 -1.994 c 0.052 -0.331 -0.057 -0.668 -0.294 -0.905 l -1.427 -1.428 l 1.994 -0.317 c 0.331 -0.053 0.617 -0.261 0.77 -0.56 Z")
        )
    }.build()
}
