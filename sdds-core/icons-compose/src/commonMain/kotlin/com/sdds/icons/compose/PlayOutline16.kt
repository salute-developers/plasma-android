package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlayOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlayOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.175 6.658 c 1.033 0.596 1.033 2.088 0.0 2.684 l -7.35 4.244 C 4.792 14.182 3.5 13.436 3.5 12.243 V 3.756 c 0.0 -1.193 1.292 -1.939 2.325 -1.342 l 7.35 4.244 Z m -0.5 1.818 c 0.367 -0.211 0.367 -0.74 0.0 -0.952 L 5.325 3.28 C 4.958 3.068 4.5 3.333 4.5 3.756 v 8.487 c 0.0 0.424 0.458 0.688 0.825 0.477 l 7.35 -4.244 Z")
        )
    }.build()
}
