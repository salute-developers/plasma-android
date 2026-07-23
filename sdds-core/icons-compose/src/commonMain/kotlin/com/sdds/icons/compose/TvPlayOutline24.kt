package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvPlayOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvPlayOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.625 11.832 c 0.833 -0.48 0.833 -1.683 0.0 -2.165 l -4.5 -2.598 C 10.292 6.59 9.25 7.19 9.25 8.152 v 5.196 c 0.0 0.962 1.042 1.564 1.875 1.083 l 4.5 -2.598 Z M 10.75 8.585 l 3.75 2.165 l -3.75 2.165 v -4.33 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.863 17.0 H 3.137 c -0.058 0.0 -0.139 0.0 -0.212 -0.006 c -0.088 -0.007 -0.229 -0.026 -0.379 -0.103 c -0.188 -0.096 -0.341 -0.249 -0.437 -0.437 c -0.076 -0.15 -0.096 -0.29 -0.103 -0.379 C 2.0 16.002 2.0 15.921 2.0 15.863 V 5.137 c 0.0 -0.058 0.0 -0.139 0.006 -0.212 c 0.007 -0.088 0.027 -0.229 0.103 -0.379 c 0.096 -0.188 0.249 -0.341 0.437 -0.437 c 0.15 -0.076 0.29 -0.096 0.379 -0.103 C 2.998 4.0 3.079 4.0 3.137 4.0 h 17.726 c 0.058 0.0 0.139 0.0 0.212 0.006 c 0.088 0.007 0.229 0.027 0.379 0.103 c 0.188 0.096 0.341 0.249 0.437 0.437 c 0.077 0.15 0.096 0.29 0.103 0.379 C 22.0 4.998 22.0 5.079 22.0 5.137 v 10.726 c 0.0 0.058 0.0 0.139 -0.006 0.212 c -0.007 0.088 -0.026 0.229 -0.103 0.379 c -0.096 0.188 -0.249 0.341 -0.437 0.437 c -0.15 0.077 -0.29 0.096 -0.379 0.103 C 21.002 17.0 20.921 17.0 20.863 17.0 Z M 20.5 15.5 v -10.0 h -17.0 v 10.0 h 17.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.0 18.0 h 16.0 v 1.5 H 4.0 V 18.0 Z")
        )
    }.build()
}
