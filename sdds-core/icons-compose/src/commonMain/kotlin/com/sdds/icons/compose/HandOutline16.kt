package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HandOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.41 2.25 c -0.204 0.0 -0.369 0.165 -0.369 0.368 v 4.687 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 3.66 c 0.0 -0.204 -0.165 -0.368 -0.368 -0.368 c -0.203 0.0 -0.368 0.164 -0.368 0.368 v 5.897 c 0.0 0.243 -0.174 0.45 -0.413 0.493 c -0.239 0.042 -0.473 -0.094 -0.556 -0.322 L 4.464 7.333 c -0.07 -0.191 -0.28 -0.29 -0.472 -0.22 c -0.19 0.07 -0.29 0.28 -0.22 0.472 l 1.366 3.751 c 0.692 1.903 2.796 2.884 4.699 2.192 c 1.477 -0.538 2.4 -1.928 2.413 -3.414 l -0.001 -0.031 v -3.82 c 0.0 -0.203 -0.165 -0.367 -0.368 -0.367 c -0.203 0.0 -0.368 0.164 -0.368 0.367 v 2.084 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 v -4.34 c 0.0 -0.204 -0.165 -0.368 -0.368 -0.368 c -0.203 0.0 -0.368 0.164 -0.368 0.368 v 3.819 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 2.618 c 0.0 -0.203 -0.165 -0.368 -0.368 -0.368 Z m 1.367 0.439 c 0.117 -0.033 0.24 -0.05 0.368 -0.05 c 0.755 0.0 1.368 0.612 1.368 1.368 v 0.939 c 0.117 -0.033 0.24 -0.05 0.368 -0.05 c 0.755 0.0 1.368 0.612 1.368 1.367 v 3.786 v 0.034 c 0.0 1.905 -1.175 3.694 -3.07 4.384 c -2.422 0.882 -5.1 -0.367 -5.98 -2.789 L 2.832 7.928 C 2.574 7.217 2.94 6.432 3.65 6.173 C 4.286 5.942 4.981 6.211 5.305 6.78 v -3.12 c 0.0 -0.755 0.613 -1.367 1.368 -1.367 c 0.137 0.0 0.27 0.02 0.395 0.057 C 7.192 1.722 7.746 1.25 8.409 1.25 c 0.756 0.0 1.368 0.612 1.368 1.368 v 0.07 Z")
        )
    }.build()
}
