package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SizeExpand24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SizeExpand24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 3.75 3.0 C 3.336 3.0 3.0 3.336 3.0 3.75 v 4.0 C 3.0 8.164 3.336 8.5 3.75 8.5 S 4.5 8.164 4.5 7.75 V 5.56 l 3.22 3.22 c 0.293 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 L 5.56 4.5 h 2.19 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 8.164 3.0 7.75 3.0 h -4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 3.75 21.0 C 3.336 21.0 3.0 20.664 3.0 20.25 v -4.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 s 0.75 0.336 0.75 0.75 v 2.19 l 3.22 -3.22 c 0.293 -0.293 0.767 -0.293 1.06 0.0 c 0.293 0.293 0.293 0.767 0.0 1.06 L 5.56 19.5 h 2.19 c 0.414 0.0 0.75 0.336 0.75 0.75 S 8.164 21.0 7.75 21.0 h -4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 21.0 3.75 C 21.0 3.336 20.664 3.0 20.25 3.0 h -4.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 2.19 l -3.22 3.22 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 3.22 -3.22 v 2.19 c 0.0 0.414 0.336 0.75 0.75 0.75 S 21.0 8.164 21.0 7.75 v -4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 20.25 21.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 v -4.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 2.19 l -3.22 -3.22 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 l 3.22 3.22 h -2.19 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 15.836 21.0 16.25 21.0 h 4.0 Z")
        )
    }.build()
}
