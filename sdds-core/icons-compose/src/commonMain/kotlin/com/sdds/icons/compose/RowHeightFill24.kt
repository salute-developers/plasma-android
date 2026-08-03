package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RowHeightFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RowHeightFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 4.0 3.75 C 4.0 3.336 4.336 3.0 4.75 3.0 h 14.5 C 19.664 3.0 20.0 3.336 20.0 3.75 S 19.664 4.5 19.25 4.5 H 4.75 C 4.336 4.5 4.0 4.164 4.0 3.75 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 4.5 6.0 C 3.672 6.0 3.0 6.672 3.0 7.5 V 10.0 c 0.0 0.828 0.672 1.5 1.5 1.5 h 15.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 V 7.5 C 21.0 6.672 20.328 6.0 19.5 6.0 h -15.0 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 4.5 12.5 C 3.672 12.5 3.0 13.172 3.0 14.0 v 2.5 C 3.0 17.328 3.672 18.0 4.5 18.0 h 15.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 V 14.0 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 h -15.0 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 4.75 19.5 C 4.336 19.5 4.0 19.836 4.0 20.25 S 4.336 21.0 4.75 21.0 h 14.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 4.75 Z")
        )
    }.build()
}
