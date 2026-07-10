package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ExportOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ExportOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.5 15.25 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.5 c 0.0 2.071 -1.679 3.75 -3.75 3.75 h -13.0 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 V 16.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 S 3.25 15.586 3.25 16.0 v 2.5 c 0.0 1.243 1.007 2.25 2.25 2.25 h 13.0 c 1.243 0.0 2.25 -1.007 2.25 -2.25 V 16.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.357 3.008 c 0.352 -0.351 0.921 -0.351 1.273 0.0 l 4.727 4.728 c 0.293 0.293 0.293 0.767 0.0 1.06 c -0.293 0.293 -0.767 0.293 -1.06 0.0 l -3.505 -3.505 v 12.225 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 5.195 L 7.69 8.796 c -0.292 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 4.727 -4.728 Z")
        )
    }.build()
}
