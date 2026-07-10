package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationArrowOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationArrowOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.647 7.084 c 1.393 -0.502 2.74 0.846 2.24 2.239 L 20.73 31.975 c -0.589 1.636 -2.945 1.505 -3.349 -0.186 l -2.545 -10.656 L 4.18 18.587 c -1.69 -0.404 -1.822 -2.76 -0.186 -3.348 l 22.653 -8.155 Z m 0.177 2.061 L 5.46 16.837 l 9.99 2.386 c 0.642 0.154 1.143 0.654 1.296 1.296 l 2.387 9.99 l 7.691 -21.364 Z")
        )
    }.build()
}
