package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinListFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinListFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.45 6.532 c 0.678 -0.923 2.003 -1.05 2.788 -0.268 l 5.592 5.572 c 0.785 0.782 0.657 2.103 -0.27 2.779 l -5.624 4.103 c -0.577 0.421 -0.963 1.053 -1.069 1.75 l -0.777 5.1 c -0.32 2.105 -2.91 3.015 -4.389 1.542 l -3.253 -3.242 l -5.808 5.788 L 3.0 30.182 l 0.528 -2.631 l 5.808 -5.787 L 5.91 18.35 c -1.478 -1.473 -0.565 -4.054 1.548 -4.373 l 5.119 -0.775 c 0.698 -0.105 1.332 -0.49 1.755 -1.065 l 4.118 -5.605 Z m 10.941 3.86 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 h 2.614 c 0.552 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 H 29.39 Z m -6.347 17.859 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 8.587 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -8.587 Z m 2.36 -7.93 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 5.6 c 0.553 0.0 1.0 0.448 1.0 1.0 c 0.0 0.553 -0.447 1.0 -1.0 1.0 h -5.6 c -0.552 0.0 -1.0 -0.447 -1.0 -1.0 Z")
        )
    }.build()
}
