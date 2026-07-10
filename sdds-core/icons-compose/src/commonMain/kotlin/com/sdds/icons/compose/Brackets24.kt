package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Brackets24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Brackets24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.5 2.25 c 0.414 0.0 0.75 0.336 0.75 0.75 S 9.914 3.75 9.5 3.75 H 6.25 v 16.5 H 9.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 6.0 c -0.69 0.0 -1.25 -0.56 -1.25 -1.25 v -17.0 c 0.0 -0.69 0.56 -1.25 1.25 -1.25 h 3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 2.25 c 0.69 0.0 1.25 0.56 1.25 1.25 v 17.0 c 0.0 0.69 -0.56 1.25 -1.25 1.25 h -3.5 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 h 3.25 V 3.75 H 14.5 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 H 18.0 Z")
        )
    }.build()
}
