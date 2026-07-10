package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SizeMaximize24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SizeMaximize24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 3.75 C 12.0 3.336 12.336 3.0 12.75 3.0 h 7.5 C 20.664 3.0 21.0 3.336 21.0 3.75 v 7.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 5.56 L 5.56 19.5 h 5.69 c 0.414 0.0 0.75 0.336 0.75 0.75 S 11.664 21.0 11.25 21.0 h -7.5 C 3.336 21.0 3.0 20.664 3.0 20.25 v -7.5 C 3.0 12.336 3.336 12.0 3.75 12.0 s 0.75 0.336 0.75 0.75 v 5.69 L 18.44 4.5 h -5.69 C 12.336 4.5 12.0 4.164 12.0 3.75 Z")
        )
    }.build()
}
