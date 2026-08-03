package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CursorOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CursorOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.196 6.347 C 8.863 5.702 7.382 6.902 7.735 8.34 l 5.742 23.38 c 0.415 1.689 2.771 1.805 3.35 0.165 l 3.646 -10.332 l 10.864 -1.418 c 1.724 -0.225 2.1 -2.554 0.535 -3.31 L 10.196 6.347 Z M 9.804 8.378 l 20.443 9.883 l -10.185 1.33 c -0.654 0.085 -1.205 0.53 -1.424 1.152 L 15.22 30.43 L 9.804 8.378 Z")
        )
    }.build()
}
