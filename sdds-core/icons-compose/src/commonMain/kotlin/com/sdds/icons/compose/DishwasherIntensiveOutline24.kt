package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherIntensiveOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherIntensiveOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.75 c -1.795 0.0 -3.25 1.455 -3.25 3.25 h -5.0 C 3.336 6.0 3.0 6.336 3.0 6.75 S 3.336 7.5 3.75 7.5 H 5.0 v 7.815 c 0.0 0.401 0.0 0.69 0.04 0.943 c 0.22 1.391 1.31 2.482 2.702 2.702 C 7.995 19.0 8.284 19.0 8.685 19.0 H 8.75 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 9.164 17.5 8.75 17.5 c -0.493 0.0 -0.652 -0.002 -0.774 -0.021 c -0.749 -0.12 -1.336 -0.706 -1.454 -1.455 c -0.02 -0.122 -0.022 -0.28 -0.022 -0.774 V 7.5 h 11.0 v 4.75 c 0.0 0.414 0.336 0.75 0.75 0.75 S 19.0 12.664 19.0 12.25 V 7.5 h 1.25 C 20.664 7.5 21.0 7.164 21.0 6.75 S 20.664 6.0 20.25 6.0 h -5.0 c 0.0 -1.795 -1.455 -3.25 -3.25 -3.25 Z m 0.0 1.5 c -0.966 0.0 -1.75 0.784 -1.75 1.75 h 3.5 c 0.0 -0.966 -0.784 -1.75 -1.75 -1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.0 15.25 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 9.5 c 0.414 0.0 0.75 0.336 0.75 0.75 S 21.664 16.0 21.25 16.0 h -9.5 C 11.336 16.0 11.0 15.664 11.0 15.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.0 18.25 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 9.5 c 0.414 0.0 0.75 0.336 0.75 0.75 S 21.664 19.0 21.25 19.0 h -2.378 c -0.309 0.874 -1.142 1.5 -2.122 1.5 h -0.5 c -0.98 0.0 -1.813 -0.626 -2.122 -1.5 H 11.75 C 11.336 19.0 11.0 18.664 11.0 18.25 Z")
        )
    }.build()
}
