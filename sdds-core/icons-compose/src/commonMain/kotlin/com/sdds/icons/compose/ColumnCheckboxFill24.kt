package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColumnCheckboxFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColumnCheckboxFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.041 2.0 h 1.544 C 7.791 2.583 8.347 3.0 9.0 3.0 h 6.0 c 0.653 0.0 1.209 -0.417 1.415 -1.0 h 1.544 C 17.72 3.419 16.486 4.5 15.0 4.5 H 9.0 C 7.513 4.5 6.28 3.419 6.041 2.0 Z M 15.0 21.0 H 9.0 c -0.653 0.0 -1.209 0.417 -1.415 1.0 H 6.041 C 6.28 20.581 7.513 19.5 9.0 19.5 h 6.0 c 1.486 0.0 2.72 1.081 2.959 2.5 h -1.544 c -0.206 -0.583 -0.762 -1.0 -1.415 -1.0 Z M 6.0 9.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 6.0 c 1.657 0.0 3.0 1.343 3.0 3.0 v 6.0 c 0.0 1.657 -1.343 3.0 -3.0 3.0 H 9.0 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 V 9.0 Z m 8.916 0.126 c 0.345 0.23 0.438 0.695 0.208 1.04 l -2.848 4.272 c -0.357 0.535 -1.13 0.569 -1.533 0.067 l -1.829 -2.287 c -0.258 -0.323 -0.206 -0.795 0.117 -1.054 c 0.324 -0.258 0.796 -0.206 1.055 0.117 l 1.359 1.7 l 2.431 -3.647 c 0.23 -0.345 0.695 -0.438 1.04 -0.208 Z")
        )
    }.build()
}
