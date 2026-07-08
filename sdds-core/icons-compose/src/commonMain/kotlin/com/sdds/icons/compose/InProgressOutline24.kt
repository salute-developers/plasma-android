package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.InProgressOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "InProgressOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 2.0 c 5.523 0.0 10.0 4.477 10.0 10.0 s -4.477 10.0 -10.0 10.0 S 2.0 17.523 2.0 12.0 S 6.477 2.0 12.0 2.0 Z m 0.0 1.5 c -4.694 0.0 -8.5 3.806 -8.5 8.5 s 3.806 8.5 8.5 8.5 s 8.5 -3.806 8.5 -8.5 s -3.806 -8.5 -8.5 -8.5 Z m 4.392 5.577 c 1.614 0.0 2.922 1.309 2.922 2.923 s -1.308 2.923 -2.922 2.923 c -1.615 0.0 -2.923 -1.309 -2.923 -2.923 s 1.308 -2.923 2.923 -2.923 Z M 6.165 10.54 c 0.807 0.0 1.46 0.654 1.461 1.461 c 0.0 0.807 -0.654 1.462 -1.461 1.462 S 4.703 12.807 4.703 12.0 c 0.0 -0.807 0.655 -1.46 1.462 -1.46 Z m 4.383 0.0 c 0.807 0.0 1.46 0.654 1.46 1.461 s -0.653 1.462 -1.46 1.462 c -0.807 0.0 -1.462 -0.655 -1.462 -1.462 c 0.0 -0.807 0.655 -1.46 1.462 -1.46 Z")
        )
    }.build()
}
