package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DevicesOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DevicesOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.863 17.0 c 0.058 0.0 0.139 0.0 0.212 -0.006 c 0.088 -0.007 0.229 -0.026 0.379 -0.103 c 0.188 -0.096 0.341 -0.249 0.437 -0.437 c 0.077 -0.15 0.096 -0.29 0.103 -0.379 C 22.0 16.002 22.0 15.921 22.0 15.863 V 5.137 c 0.0 -0.058 0.0 -0.139 -0.006 -0.212 c -0.007 -0.088 -0.026 -0.229 -0.103 -0.379 c -0.096 -0.188 -0.249 -0.341 -0.437 -0.437 c -0.15 -0.076 -0.29 -0.096 -0.379 -0.103 C 21.002 4.0 20.921 4.0 20.863 4.0 H 3.137 C 3.079 4.0 2.998 4.0 2.925 4.006 C 2.837 4.013 2.696 4.033 2.546 4.109 C 2.358 4.205 2.205 4.358 2.109 4.546 c -0.076 0.15 -0.096 0.29 -0.103 0.379 C 2.0 4.998 2.0 5.079 2.0 5.137 v 10.726 c 0.0 0.058 0.0 0.139 0.006 0.212 c 0.007 0.088 0.027 0.229 0.103 0.379 c 0.096 0.188 0.249 0.341 0.437 0.437 c 0.15 0.077 0.29 0.096 0.379 0.103 C 2.998 17.0 3.079 17.0 3.137 17.0 H 11.5 v -1.5 h -8.0 v -10.0 h 17.0 V 17.0 h 0.363 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.0 18.0 h 7.5 v 1.5 H 4.0 V 18.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.0 12.6 c 0.0 -0.56 0.0 -0.84 0.109 -1.054 c 0.096 -0.188 0.249 -0.341 0.437 -0.437 C 13.76 11.0 14.04 11.0 14.6 11.0 h 2.8 c 0.56 0.0 0.84 0.0 1.054 0.109 c 0.188 0.096 0.341 0.249 0.437 0.437 C 19.0 11.76 19.0 12.04 19.0 12.6 v 6.8 c 0.0 0.56 0.0 0.84 -0.109 1.054 c -0.096 0.188 -0.249 0.341 -0.437 0.437 C 18.24 21.0 17.96 21.0 17.4 21.0 h -2.8 c -0.56 0.0 -0.84 0.0 -1.054 -0.109 c -0.188 -0.096 -0.341 -0.249 -0.437 -0.437 C 13.0 20.24 13.0 19.96 13.0 19.4 v -6.8 Z m 1.0 6.65 c 0.0 -0.138 0.112 -0.25 0.25 -0.25 h 3.5 c 0.138 0.0 0.25 0.112 0.25 0.25 v 0.5 c 0.0 0.138 -0.112 0.25 -0.25 0.25 h -3.5 C 14.112 20.0 14.0 19.888 14.0 19.75 v -0.5 Z")
        )
    }.build()
}
