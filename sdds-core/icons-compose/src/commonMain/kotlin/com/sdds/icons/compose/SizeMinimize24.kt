package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SizeMinimize24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SizeMinimize24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 14.5 2.75 C 14.5 2.336 14.164 2.0 13.75 2.0 S 13.0 2.336 13.0 2.75 v 7.5 c 0.0 0.414 0.336 0.75 0.75 0.75 h 7.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 21.664 9.5 21.25 9.5 h -5.69 l 6.22 -6.22 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 L 14.5 8.44 V 2.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 2.0 13.75 c 0.0 0.414 0.336 0.75 0.75 0.75 h 5.69 l -6.22 6.22 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 6.22 -6.22 v 5.69 c 0.0 0.414 0.336 0.75 0.75 0.75 S 11.0 21.664 11.0 21.25 v -7.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 h -7.5 C 2.336 13.0 2.0 13.336 2.0 13.75 Z")
        )
    }.build()
}
