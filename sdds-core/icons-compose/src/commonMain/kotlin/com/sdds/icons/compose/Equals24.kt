package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Equals24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Equals24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.0 14.25 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 4.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 S 3.586 14.25 4.0 14.25 h 16.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.0 8.25 c 0.414 0.0 0.75 0.336 0.75 0.75 S 20.414 9.75 20.0 9.75 H 4.0 C 3.586 9.75 3.25 9.414 3.25 9.0 S 3.586 8.25 4.0 8.25 h 16.0 Z")
        )
    }.build()
}
