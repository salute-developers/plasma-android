package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AxisX16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AxisX16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.974 6.95 l 2.873 -3.85 h 1.747 l -3.62 4.718 L 12.72 12.9 h -1.803 L 7.918 8.826 L 5.017 12.9 H 3.27 l 3.605 -4.984 L 3.453 3.1 h 1.803 l 2.718 3.85 Z")
        )
    }.build()
}
