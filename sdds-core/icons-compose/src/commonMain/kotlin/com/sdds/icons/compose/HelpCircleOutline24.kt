package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HelpCircleOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HelpCircleOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 10.398 7.655 C 10.071 7.909 9.75 8.405 9.75 9.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 8.25 9.914 8.25 9.5 c 0.0 -1.405 0.43 -2.409 1.227 -3.03 c 0.76 -0.59 1.715 -0.72 2.523 -0.72 s 1.763 0.13 2.523 0.72 c 0.798 0.621 1.227 1.625 1.227 3.03 c 0.0 1.643 -1.038 2.466 -1.8 3.037 c -0.847 0.636 -1.2 0.91 -1.2 1.463 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 c 0.0 -1.338 0.981 -2.06 1.645 -2.548 l 0.155 -0.114 c 0.738 -0.554 1.2 -0.981 1.2 -1.838 c 0.0 -1.095 -0.32 -1.591 -0.648 -1.845 C 13.237 7.37 12.692 7.25 12.0 7.25 c -0.692 0.0 -1.237 0.12 -1.602 0.405 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 13.0 16.5 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 C 6.477 2.0 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 s 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 Z M 3.5 12.0 c 0.0 -4.694 3.806 -8.5 8.5 -8.5 s 8.5 3.806 8.5 8.5 s -3.806 8.5 -8.5 8.5 s -8.5 -3.806 -8.5 -8.5 Z")
        )
    }.build()
}
