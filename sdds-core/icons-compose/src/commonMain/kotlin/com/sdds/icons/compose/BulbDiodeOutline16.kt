package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbDiodeOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbDiodeOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.975 1.0 C 4.895 1.0 2.4 3.506 2.4 6.593 c 0.0 1.617 0.684 3.075 1.778 4.095 c 0.336 0.314 0.772 0.444 1.182 0.444 h 5.23 c 0.41 0.0 0.846 -0.13 1.182 -0.444 c 1.093 -1.02 1.778 -2.478 1.778 -4.095 C 13.55 3.506 11.056 1.0 7.975 1.0 Z M 3.4 6.593 C 3.4 4.055 5.45 2.0 7.975 2.0 C 10.5 2.0 12.55 4.055 12.55 6.593 c 0.0 1.33 -0.562 2.525 -1.46 3.364 c -0.117 0.11 -0.292 0.175 -0.5 0.175 H 5.36 c -0.208 0.0 -0.384 -0.066 -0.5 -0.175 C 3.961 9.118 3.4 7.922 3.4 6.593 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.025 12.565 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 h 4.9 c 0.276 0.0 0.5 0.223 0.5 0.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 h -4.9 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.725 14.497 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 3.5 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -3.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
    }.build()
}
