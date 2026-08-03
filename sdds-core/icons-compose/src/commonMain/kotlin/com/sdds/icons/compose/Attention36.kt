package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Attention36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Attention36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.5 6.0 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 S 16.5 5.172 16.5 6.0 v 15.5 c 0.0 0.828 0.672 1.5 1.5 1.5 s 1.5 -0.672 1.5 -1.5 V 6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 30.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 S 18.828 27.0 18.0 27.0 s -1.5 0.672 -1.5 1.5 S 17.172 30.0 18.0 30.0 Z")
        )
    }.build()
}
