package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Save24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Save24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.0 6.25 C 8.586 6.25 8.25 6.586 8.25 7.0 S 8.586 7.75 9.0 7.75 h 6.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 15.414 6.25 15.0 6.25 H 9.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.0 21.0 h 12.0 c 1.657 0.0 3.0 -1.343 3.0 -3.0 V 7.828 c 0.0 -0.53 -0.21 -1.039 -0.586 -1.414 l -2.828 -2.828 C 17.21 3.21 16.702 3.0 16.172 3.0 H 6.0 C 4.343 3.0 3.0 4.343 3.0 6.0 v 12.0 c 0.0 1.657 1.343 3.0 3.0 3.0 Z m 13.5 -3.0 V 7.828 c 0.0 -0.132 -0.053 -0.26 -0.146 -0.353 l -2.829 -2.829 C 16.431 4.553 16.305 4.5 16.172 4.5 H 6.0 C 5.172 4.5 4.5 5.172 4.5 6.0 v 12.0 c 0.0 0.828 0.672 1.5 1.5 1.5 h 1.0 v -5.0 C 7.0 13.672 7.672 13.0 8.5 13.0 h 7.0 c 0.828 0.0 1.5 0.672 1.5 1.5 v 5.0 h 1.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 Z m -4.0 1.5 h -7.0 v -5.0 h 7.0 v 5.0 Z")
        )
    }.build()
}
