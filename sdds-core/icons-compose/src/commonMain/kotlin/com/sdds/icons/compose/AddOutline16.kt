package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AddOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AddOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.6 4.184 c 0.0 -0.277 -0.225 -0.5 -0.5 -0.5 c -0.277 0.0 -0.5 0.223 -0.5 0.5 v 2.184 H 6.397 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 2.208 l 0.03 2.191 c 0.003 0.276 0.23 0.497 0.506 0.493 c 0.276 -0.003 0.497 -0.23 0.493 -0.506 L 9.606 7.368 H 11.8 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 9.6 V 4.184 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.448 1.5 c -0.967 0.0 -1.75 0.784 -1.75 1.75 v 7.238 c 0.0 0.966 0.783 1.75 1.75 1.75 h 7.303 c 0.967 0.0 1.75 -0.784 1.75 -1.75 V 3.25 c 0.0 -0.966 -0.783 -1.75 -1.75 -1.75 H 5.449 Z m 7.303 1.0 H 5.449 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 7.238 c 0.0 0.414 0.336 0.75 0.75 0.75 h 7.303 c 0.415 0.0 0.75 -0.336 0.75 -0.75 V 3.25 c 0.0 -0.414 -0.335 -0.75 -0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.0 4.911 c 0.276 0.0 0.5 0.224 0.5 0.5 v 6.84 c 0.0 0.69 0.56 1.25 1.25 1.25 h 6.893 c 0.276 0.0 0.5 0.224 0.5 0.5 c 0.0 0.277 -0.224 0.5 -0.5 0.5 H 3.75 c -1.243 0.0 -2.25 -1.007 -2.25 -2.25 v -6.84 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
    }.build()
}
