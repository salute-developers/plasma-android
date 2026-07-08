package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ResizeCorneredFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ResizeCorneredFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.775 1.28 c 0.522 0.0 0.945 0.424 0.945 0.946 c 0.0 6.9 -5.594 12.493 -12.494 12.494 c -0.522 0.0 -0.946 -0.423 -0.946 -0.945 c 0.0 -0.521 0.424 -0.945 0.946 -0.945 c 5.856 0.0 10.604 -4.748 10.604 -10.604 c 0.0 -0.522 0.424 -0.946 0.945 -0.946 Z")
        )
    }.build()
}
