package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GiftFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GiftFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.08 4.105 c 1.474 -1.473 3.866 -1.473 5.34 0.0 L 18.0 6.682 l 2.58 -2.577 c 1.474 -1.473 3.866 -1.473 5.34 0.0 c 1.475 1.474 1.475 3.863 0.0 5.336 l -1.079 1.079 h 4.784 c 1.035 0.0 1.875 0.839 1.875 1.873 v 4.87 H 19.125 V 10.52 h 2.534 l 2.67 -2.668 c 0.597 -0.596 0.597 -1.562 0.0 -2.157 c -0.596 -0.596 -1.562 -0.596 -2.159 0.0 l -3.045 3.043 v 1.782 h -2.25 V 8.738 l -3.046 -3.043 c -0.596 -0.596 -1.562 -0.596 -2.159 0.0 c -0.596 0.595 -0.596 1.561 0.0 2.157 l 2.671 2.668 h 2.534 v 6.743 H 4.5 v -4.87 c 0.0 -1.034 0.84 -1.873 1.875 -1.873 h 4.784 l -1.08 -1.079 c -1.474 -1.473 -1.474 -3.862 0.0 -5.336 Z M 6.0 19.513 v 8.616 C 6.0 30.82 8.183 33.0 10.875 33.0 h 6.0 V 19.513 H 6.0 Z M 19.125 33.0 h 6.0 C 27.817 33.0 30.0 30.82 30.0 28.13 v -8.617 H 19.125 V 33.0 Z")
        )
    }.build()
}
