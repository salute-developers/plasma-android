package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GroupAltOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GroupAltOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.25 6.25 c 0.828 0.0 1.5 0.672 1.5 1.5 v 2.5 h 2.5 c 0.828 0.0 1.5 0.672 1.5 1.5 v 4.5 c 0.0 0.828 -0.672 1.5 -1.5 1.5 h -4.5 c -0.828 0.0 -1.5 -0.672 -1.5 -1.5 v -2.5 h -2.5 c -0.828 0.0 -1.5 -0.672 -1.5 -1.5 v -4.5 c 0.0 -0.828 0.672 -1.5 1.5 -1.5 h 4.5 Z m 1.5 6.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 h -0.5 v 2.5 h 4.5 v -4.5 h -2.5 v 0.5 Z m -6.0 0.0 h 4.5 v -4.5 h -4.5 v 4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.5 2.0 C 21.328 2.0 22.0 2.672 22.0 3.5 c 0.0 0.555 -0.302 1.038 -0.75 1.298 V 19.2 C 21.698 19.461 22.0 19.945 22.0 20.5 c 0.0 0.828 -0.672 1.5 -1.5 1.5 c -0.555 0.0 -1.038 -0.302 -1.298 -0.75 H 4.798 C 4.538 21.698 4.055 22.0 3.5 22.0 C 2.672 22.0 2.0 21.328 2.0 20.5 c 0.0 -0.555 0.302 -1.04 0.75 -1.299 V 4.798 C 2.302 4.538 2.0 4.055 2.0 3.5 C 2.0 2.672 2.672 2.0 3.5 2.0 c 0.555 0.0 1.038 0.302 1.298 0.75 h 14.404 C 19.462 2.302 19.945 2.0 20.5 2.0 Z M 4.798 4.25 C 4.666 4.477 4.478 4.666 4.25 4.798 V 19.2 c 0.227 0.132 0.416 0.322 0.548 0.549 h 14.404 c 0.132 -0.227 0.32 -0.417 0.548 -0.549 V 4.798 c -0.227 -0.132 -0.416 -0.32 -0.548 -0.548 H 4.798 Z")
        )
    }.build()
}
