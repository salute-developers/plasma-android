package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlagOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlagOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 2.282 v 6.553 c 1.04 -0.51 1.958 -0.668 2.805 -0.601 c 1.029 0.08 1.901 0.49 2.673 0.868 l 0.129 0.064 C 9.349 9.53 9.989 9.844 10.69 9.942 c 0.653 0.091 1.39 -0.004 2.31 -0.538 V 2.887 c -0.897 0.438 -1.718 0.538 -2.497 0.428 C 9.594 3.186 8.775 2.77 8.036 2.397 L 7.904 2.33 C 7.1 1.925 6.377 1.58 5.578 1.512 C 4.855 1.45 4.025 1.612 3.0 2.282 Z m 11.0 -0.265 c 0.0 -0.185 -0.102 -0.355 -0.266 -0.442 C 13.571 1.49 13.373 1.5 13.22 1.603 c -1.025 0.696 -1.847 0.825 -2.576 0.722 C 9.903 2.22 9.22 1.875 8.44 1.48 L 8.354 1.437 C 7.566 1.04 6.68 0.603 5.664 0.516 C 4.62 0.426 3.494 0.705 2.211 1.608 C 2.08 1.702 2.0 1.854 2.0 2.018 V 14.5 C 2.0 14.775 2.224 15.0 2.5 15.0 S 3.0 14.776 3.0 14.5 V 9.968 C 4.103 9.33 4.98 9.172 5.727 9.231 C 6.545 9.295 7.262 9.62 8.037 10.0 c 0.055 0.026 0.109 0.052 0.163 0.08 c 0.707 0.347 1.485 0.73 2.352 0.852 c 0.97 0.135 2.012 -0.057 3.217 -0.826 C 13.913 10.015 14.0 9.856 14.0 9.685 V 2.017 Z")
        )
    }.build()
}
