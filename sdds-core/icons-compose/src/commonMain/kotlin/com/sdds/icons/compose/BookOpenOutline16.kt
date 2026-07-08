package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookOpenOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookOpenOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.325 2.25 c 2.58 0.0 3.77 1.477 3.82 2.531 h 0.005 V 12.9 h -0.004 c -0.016 0.196 -0.23 0.35 -0.496 0.351 c -0.265 0.0 -0.48 -0.155 -0.497 -0.35 H 14.15 c 0.0 0.044 0.01 0.05 -0.007 0.004 c -0.015 -0.037 -0.043 -0.092 -0.087 -0.16 c -0.09 -0.138 -0.236 -0.31 -0.455 -0.48 c -0.433 -0.335 -1.155 -0.664 -2.276 -0.664 c -2.248 0.0 -2.825 1.295 -2.825 1.65 l -0.01 0.1 c -0.046 0.229 -0.248 0.4 -0.49 0.4 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 c 0.0 -0.355 -0.577 -1.65 -2.825 -1.65 c -1.12 0.0 -1.843 0.33 -2.276 0.664 c -0.219 0.17 -0.366 0.342 -0.455 0.48 c -0.044 0.068 -0.072 0.123 -0.087 0.16 C 1.84 12.95 1.85 12.944 1.85 12.9 H 1.847 c -0.018 0.196 -0.233 0.35 -0.497 0.35 c -0.265 0.0 -0.479 -0.155 -0.496 -0.35 H 0.85 V 4.807 h 0.003 C 0.859 4.694 0.889 4.583 0.92 4.493 C 0.96 4.381 1.017 4.257 1.089 4.13 c 0.145 -0.257 0.364 -0.551 0.667 -0.83 C 2.369 2.739 3.32 2.25 4.675 2.25 c 1.725 0.0 2.829 0.662 3.387 1.415 c 0.1 -0.122 0.214 -0.245 0.344 -0.365 c 0.614 -0.562 1.564 -1.05 2.92 -1.05 Z m -6.65 1.0 c -1.094 0.0 -1.807 0.387 -2.243 0.787 C 2.21 4.241 2.056 4.451 1.96 4.62 C 1.912 4.705 1.881 4.776 1.863 4.826 C 1.855 4.85 1.851 4.864 1.85 4.871 v 6.557 C 2.468 10.97 3.39 10.6 4.675 10.6 c 1.269 0.0 2.2 0.368 2.825 0.866 V 4.85 c 0.0 -0.343 -0.563 -1.6 -2.825 -1.6 Z m 6.65 0.0 c -1.094 0.0 -1.806 0.387 -2.243 0.787 C 8.86 4.241 8.706 4.451 8.61 4.62 C 8.563 4.705 8.531 4.776 8.514 4.826 L 8.5 4.871 v 6.595 c 0.625 -0.498 1.556 -0.866 2.825 -0.866 c 1.286 0.0 2.208 0.37 2.825 0.828 V 4.85 c 0.0 -0.343 -0.563 -1.6 -2.825 -1.6 Z")
        )
    }.build()
}
