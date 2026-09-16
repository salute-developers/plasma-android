package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SpeedHighOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SpeedHighOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.235 6.72 c 0.314 -0.294 0.822 -0.294 1.136 0.0 l 5.046 4.733 c 0.315 0.296 0.316 0.798 0.0 1.094 L 4.37 17.279 c -0.314 0.294 -0.822 0.294 -1.136 0.0 c -0.313 -0.294 -0.313 -0.77 0.0 -1.065 L 7.727 12.0 L 3.235 7.786 c -0.313 -0.294 -0.313 -0.771 0.0 -1.065 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.735 6.72 c 0.314 -0.294 0.822 -0.294 1.136 0.0 l 5.046 4.733 c 0.316 0.296 0.316 0.798 0.0 1.094 L 9.87 17.279 c -0.314 0.294 -0.822 0.294 -1.136 0.0 c -0.313 -0.294 -0.313 -0.77 0.0 -1.065 L 13.227 12.0 L 8.735 7.786 c -0.313 -0.294 -0.313 -0.771 0.0 -1.065 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.235 6.72 c 0.314 -0.294 0.822 -0.294 1.136 0.0 l 5.046 4.733 c 0.316 0.296 0.316 0.798 0.0 1.094 l -5.046 4.732 c -0.314 0.294 -0.822 0.294 -1.136 0.0 c -0.313 -0.294 -0.313 -0.77 0.0 -1.065 L 18.727 12.0 l -4.492 -4.214 c -0.313 -0.294 -0.313 -0.771 0.0 -1.065 Z")
        )
    }.build()
}
