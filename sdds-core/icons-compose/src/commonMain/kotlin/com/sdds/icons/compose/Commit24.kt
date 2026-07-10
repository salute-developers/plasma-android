package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Commit24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Commit24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 7.0 c 2.507 0.0 4.582 1.844 4.944 4.25 H 22.0 v 1.5 h -5.056 C 16.583 15.156 14.507 17.0 12.0 17.0 s -4.582 -1.844 -4.944 -4.25 H 2.0 v -1.5 h 5.056 C 7.418 8.844 9.493 7.0 12.0 7.0 Z m 0.0 1.5 c -1.933 0.0 -3.5 1.567 -3.5 3.5 s 1.567 3.5 3.5 3.5 s 3.5 -1.567 3.5 -3.5 s -1.567 -3.5 -3.5 -3.5 Z")
        )
    }.build()
}
