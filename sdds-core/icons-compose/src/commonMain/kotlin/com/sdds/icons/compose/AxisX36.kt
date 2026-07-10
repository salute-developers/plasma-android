package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AxisX36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AxisX36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.96 15.75 l 6.156 -8.25 h 3.742 l -7.756 10.11 L 28.13 28.5 h -3.863 l -6.428 -8.73 l -6.217 8.73 H 7.88 l 7.725 -10.68 L 8.272 7.5 h 3.863 l 5.825 8.25 Z")
        )
    }.build()
}
