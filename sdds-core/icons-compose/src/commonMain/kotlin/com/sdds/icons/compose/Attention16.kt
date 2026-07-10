package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Attention16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Attention16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.75 2.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 7.25 2.086 7.25 2.5 v 7.0 c 0.0 0.414 0.336 0.75 0.75 0.75 S 8.75 9.914 8.75 9.5 v -7.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 13.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 8.414 12.0 8.0 12.0 s -0.75 0.336 -0.75 0.75 S 7.586 13.5 8.0 13.5 Z")
        )
    }.build()
}
