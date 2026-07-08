package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LineLinkFromto24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LineLinkFromto24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.78 6.22 l -2.75 -2.75 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 L 19.44 6.0 H 15.0 c -2.071 0.0 -3.75 1.679 -3.75 3.75 V 14.0 c 0.0 1.243 -1.007 2.25 -2.25 2.25 H 7.75 C 7.336 16.25 7.0 16.586 7.0 17.0 s 0.336 0.75 0.75 0.75 H 9.0 c 2.071 0.0 3.75 -1.679 3.75 -3.75 V 9.75 c 0.0 -1.243 1.007 -2.25 2.25 -2.25 h 4.44 l -1.47 1.47 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 2.75 -2.75 C 21.921 7.14 22.0 6.95 22.0 6.75 s -0.079 -0.39 -0.22 -0.53 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.0 19.0 c 1.105 0.0 2.0 -0.895 2.0 -2.0 s -0.895 -2.0 -2.0 -2.0 s -2.0 0.895 -2.0 2.0 s 0.895 2.0 2.0 2.0 Z")
        )
    }.build()
}
