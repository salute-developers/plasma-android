package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RealOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RealOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.5 12.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 2.823 c 2.307 0.0 4.177 1.87 4.177 4.177 c 0.0 1.717 -1.037 3.192 -2.518 3.834 l 2.401 4.52 c 0.26 0.488 0.074 1.093 -0.414 1.352 c -0.488 0.26 -1.093 0.074 -1.352 -0.414 l -2.718 -5.116 H 12.5 V 24.5 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 v -12.0 Z m 2.0 5.353 h 1.823 c 1.203 0.0 2.177 -0.975 2.177 -2.177 S 15.526 13.5 14.323 13.5 H 12.5 v 4.353 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 23.75 11.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 1.182 c -1.306 0.421 -2.25 1.647 -2.25 3.093 V 15.5 c 0.0 1.795 1.455 3.25 3.25 3.25 c 0.69 0.0 1.25 0.56 1.25 1.25 v 0.225 c 0.0 0.69 -0.56 1.25 -1.25 1.25 H 21.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 0.75 V 24.5 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -1.182 c 1.306 -0.422 2.25 -1.647 2.25 -3.093 V 20.0 c 0.0 -1.795 -1.455 -3.25 -3.25 -3.25 c -0.69 0.0 -1.25 -0.56 -1.25 -1.25 v -0.225 c 0.0 -0.69 0.56 -1.25 1.25 -1.25 h 1.75 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -0.75 V 11.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 18.0 C 3.0 9.716 9.716 3.0 18.0 3.0 c 8.284 0.0 15.0 6.716 15.0 15.0 c 0.0 8.284 -6.716 15.0 -15.0 15.0 c -8.284 0.0 -15.0 -6.716 -15.0 -15.0 Z M 18.0 5.25 C 10.958 5.25 5.25 10.958 5.25 18.0 S 10.958 30.75 18.0 30.75 S 30.75 25.042 30.75 18.0 S 25.042 5.25 18.0 5.25 Z")
        )
    }.build()
}
