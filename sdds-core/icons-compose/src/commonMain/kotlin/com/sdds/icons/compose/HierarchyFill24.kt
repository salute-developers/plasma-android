package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HierarchyFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HierarchyFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.0 3.0 c 1.105 0.0 2.0 0.895 2.0 2.0 v 2.0 c 0.0 1.105 -0.895 2.0 -2.0 2.0 h -0.25 v 2.25 h 4.75 c 1.243 0.0 2.25 1.007 2.25 2.25 V 15.0 H 20.0 c 1.105 0.0 2.0 0.895 2.0 2.0 v 2.0 c 0.0 1.105 -0.895 2.0 -2.0 2.0 h -2.0 c -1.105 0.0 -2.0 -0.895 -2.0 -2.0 v -2.0 c 0.0 -1.105 0.895 -2.0 2.0 -2.0 h 0.25 v -1.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 h -4.75 V 15.0 H 13.0 c 1.105 0.0 2.0 0.895 2.0 2.0 v 2.0 c 0.0 1.105 -0.895 2.0 -2.0 2.0 h -2.0 c -1.105 0.0 -2.0 -0.895 -2.0 -2.0 v -2.0 c 0.0 -1.105 0.895 -2.0 2.0 -2.0 h 0.25 v -2.25 H 6.5 c -0.414 0.0 -0.75 0.336 -0.75 0.75 V 15.0 H 6.0 c 1.105 0.0 2.0 0.895 2.0 2.0 v 2.0 c 0.0 1.105 -0.895 2.0 -2.0 2.0 H 4.0 c -1.105 0.0 -2.0 -0.895 -2.0 -2.0 v -2.0 c 0.0 -1.105 0.895 -2.0 2.0 -2.0 h 0.25 v -1.5 c 0.0 -1.243 1.007 -2.25 2.25 -2.25 h 4.75 V 9.0 H 11.0 C 9.895 9.0 9.0 8.105 9.0 7.0 V 5.0 c 0.0 -1.105 0.895 -2.0 2.0 -2.0 h 2.0 Z")
        )
    }.build()
}
