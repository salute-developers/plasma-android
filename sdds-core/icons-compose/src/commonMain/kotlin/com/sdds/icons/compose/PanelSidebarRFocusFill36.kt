package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PanelSidebarRFocusFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PanelSidebarRFocusFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.88 6.0 h 18.24 c 0.802 0.0 1.47 0.0 2.017 0.045 c 0.57 0.046 1.105 0.147 1.61 0.405 c 0.777 0.395 1.408 1.026 1.803 1.802 c 0.258 0.506 0.359 1.041 0.405 1.611 C 33.0 10.409 33.0 11.078 33.0 11.879 v 12.242 c 0.0 0.8 0.0 1.47 -0.045 2.016 c -0.046 0.57 -0.147 1.105 -0.405 1.61 c -0.395 0.777 -1.026 1.408 -1.802 1.803 c -0.506 0.258 -1.041 0.359 -1.611 0.405 C 28.591 30.0 27.922 30.0 27.121 30.0 H 8.879 c -0.8 0.0 -1.47 0.0 -2.016 -0.045 c -0.57 -0.046 -1.105 -0.147 -1.61 -0.405 c -0.777 -0.395 -1.408 -1.026 -1.803 -1.802 c -0.258 -0.506 -0.359 -1.041 -0.405 -1.611 C 3.0 25.591 3.0 24.922 3.0 24.121 V 11.879 c 0.0 -0.8 0.0 -1.47 0.045 -2.016 c 0.046 -0.57 0.147 -1.105 0.405 -1.61 c 0.395 -0.777 1.026 -1.408 1.802 -1.803 c 0.506 -0.258 1.041 -0.359 1.611 -0.405 C 7.409 6.0 8.078 6.0 8.879 6.0 Z M 25.5 8.25 c -1.243 0.0 -2.25 1.007 -2.25 2.25 v 15.0 c 0.0 1.243 1.007 2.25 2.25 2.25 h 3.0 c 1.243 0.0 2.25 -1.007 2.25 -2.25 v -15.0 c 0.0 -1.243 -1.007 -2.25 -2.25 -2.25 h -3.0 Z")
        )
    }.build()
}
