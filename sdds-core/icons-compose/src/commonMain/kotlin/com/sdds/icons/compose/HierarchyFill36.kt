package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HierarchyFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HierarchyFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.5 4.5 c 1.657 0.0 3.0 1.343 3.0 3.0 v 3.0 c 0.0 1.657 -1.343 3.0 -3.0 3.0 H 19.0 V 17.0 h 7.25 c 1.795 0.0 3.25 1.455 3.25 3.25 v 2.25 H 30.0 c 1.657 0.0 3.0 1.343 3.0 3.0 v 3.0 c 0.0 1.657 -1.343 3.0 -3.0 3.0 h -3.0 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 v -3.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 0.5 v -2.25 c 0.0 -0.69 -0.56 -1.25 -1.25 -1.25 H 19.0 v 3.5 h 0.5 c 1.657 0.0 3.0 1.343 3.0 3.0 v 3.0 c 0.0 1.657 -1.343 3.0 -3.0 3.0 h -3.0 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 v -3.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 H 17.0 V 19.0 H 9.75 c -0.69 0.0 -1.25 0.56 -1.25 1.25 v 2.25 H 9.0 c 1.657 0.0 3.0 1.343 3.0 3.0 v 3.0 c 0.0 1.657 -1.343 3.0 -3.0 3.0 H 6.0 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 v -3.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 0.5 v -2.25 C 6.5 18.455 7.955 17.0 9.75 17.0 H 17.0 v -3.5 h -0.5 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 v -3.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 3.0 Z")
        )
    }.build()
}
