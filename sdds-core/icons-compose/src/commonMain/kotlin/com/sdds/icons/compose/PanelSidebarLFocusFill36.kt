package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PanelSidebarLFocusFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PanelSidebarLFocusFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 27.12 6.0 H 8.88 C 8.077 6.0 7.41 6.0 6.862 6.045 C 6.293 6.09 5.758 6.192 5.253 6.45 C 4.475 6.845 3.844 7.476 3.45 8.252 C 3.192 8.758 3.09 9.293 3.045 9.863 C 3.0 10.409 3.0 11.078 3.0 11.879 v 12.242 c 0.0 0.8 0.0 1.47 0.045 2.016 c 0.046 0.57 0.147 1.105 0.405 1.61 c 0.395 0.777 1.026 1.408 1.802 1.803 c 0.506 0.258 1.041 0.359 1.611 0.405 C 7.409 30.0 8.078 30.0 8.879 30.0 h 18.242 c 0.8 0.0 1.47 0.0 2.016 -0.045 c 0.57 -0.046 1.105 -0.147 1.61 -0.405 c 0.777 -0.395 1.408 -1.026 1.803 -1.802 c 0.258 -0.506 0.359 -1.041 0.405 -1.611 C 33.0 25.591 33.0 24.922 33.0 24.121 V 11.879 c 0.0 -0.8 0.0 -1.47 -0.045 -2.016 c -0.046 -0.57 -0.147 -1.105 -0.405 -1.61 c -0.395 -0.777 -1.026 -1.408 -1.802 -1.803 c -0.506 -0.258 -1.041 -0.359 -1.611 -0.405 C 28.591 6.0 27.922 6.0 27.121 6.0 Z M 10.5 8.25 c 1.243 0.0 2.25 1.007 2.25 2.25 v 15.0 c 0.0 1.243 -1.007 2.25 -2.25 2.25 h -3.0 c -1.243 0.0 -2.25 -1.007 -2.25 -2.25 v -15.0 c 0.0 -1.243 1.007 -2.25 2.25 -2.25 h 3.0 Z")
        )
    }.build()
}
