package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlaskOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlaskOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.1 1.05 h 0.2 c 0.275 0.0 0.499 0.224 0.5 0.5 c 0.0 0.276 -0.225 0.5 -0.5 0.5 h -0.2 v 3.674 l 0.006 0.086 c 0.01 0.085 0.037 0.17 0.078 0.246 l 3.705 6.88 c 0.47 0.875 -0.094 1.924 -1.04 2.051 L 12.657 15.0 H 3.345 c -0.993 0.0 -1.649 -0.994 -1.313 -1.887 l 0.08 -0.176 l 3.706 -6.881 c 0.04 -0.077 0.067 -0.16 0.078 -0.246 L 5.9 5.724 V 2.05 H 5.699 c -0.275 0.0 -0.5 -0.224 -0.5 -0.5 s 0.225 -0.5 0.5 -0.5 h 0.202 V 1.0 H 10.1 v 0.05 Z m -3.2 1.0 v 3.674 c 0.0 0.28 -0.07 0.558 -0.203 0.805 L 2.992 13.41 C 2.85 13.677 3.042 14.0 3.344 14.0 h 9.313 c 0.302 0.0 0.494 -0.323 0.351 -0.59 L 9.303 6.53 C 9.17 6.281 9.1 6.004 9.1 5.723 V 2.05 H 6.9 Z")
        )
    }.build()
}
