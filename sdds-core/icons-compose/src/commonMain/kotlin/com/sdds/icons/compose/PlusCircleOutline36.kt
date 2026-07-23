package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlusCircleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlusCircleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 18.0 c 0.0 -7.18 5.82 -13.0 13.0 -13.0 c 7.179 0.0 12.999 5.82 12.999 13.0 c 0.0 7.179 -5.82 12.999 -13.0 12.999 c -7.179 0.0 -12.999 -5.82 -12.999 -13.0 Z M 18.0 3.0 C 9.714 3.0 3.0 9.715 3.0 18.0 c 0.0 8.283 6.715 14.999 15.0 14.999 c 8.283 0.0 14.999 -6.716 14.999 -15.0 c 0.0 -8.284 -6.716 -14.999 -15.0 -14.999 Z m 0.999 5.919 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 c -0.553 0.0 -1.0 0.447 -1.0 1.0 v 8.08 H 8.918 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 h 8.08 v 8.081 c 0.0 0.553 0.448 1.0 1.0 1.0 c 0.553 0.0 1.0 -0.447 1.0 -1.0 V 19.0 h 8.081 c 0.553 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.447 -1.0 -1.0 -1.0 H 19.0 V 8.919 Z")
        )
    }.build()
}
