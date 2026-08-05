package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WifiDefault24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WifiDefault24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 15.36 c 1.38 0.0 2.5 1.12 2.5 2.5 c 0.0 1.381 -1.12 2.5 -2.5 2.5 s -2.5 -1.119 -2.5 -2.5 c 0.0 -1.38 1.119 -2.5 2.5 -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 10.25 c 2.055 0.0 4.027 0.816 5.48 2.27 c 0.293 0.292 0.293 0.768 0.0 1.061 c -0.293 0.293 -0.768 0.293 -1.061 0.0 c -1.172 -1.172 -2.761 -1.831 -4.42 -1.831 c -1.657 0.0 -3.246 0.659 -4.418 1.831 c -0.293 0.293 -0.769 0.293 -1.062 0.0 c -0.292 -0.293 -0.292 -0.769 0.0 -1.061 c 1.454 -1.454 3.426 -2.27 5.48 -2.27 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 6.75 c 2.85 0.0 5.585 1.132 7.602 3.148 c 0.292 0.293 0.292 0.768 0.0 1.061 c -0.293 0.293 -0.768 0.293 -1.061 0.0 C 16.806 9.224 14.453 8.25 12.0 8.25 c -2.453 0.0 -4.806 0.974 -6.541 2.709 c -0.293 0.293 -0.768 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 c 2.015 -2.017 4.75 -3.149 7.6 -3.149 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 3.25 c 3.647 0.0 7.144 1.449 9.723 4.027 c 0.292 0.293 0.292 0.768 0.0 1.06 c -0.293 0.294 -0.768 0.294 -1.06 0.0 C 18.364 6.042 15.248 4.75 12.0 4.75 c -3.249 0.0 -6.365 1.29 -8.662 3.588 c -0.293 0.293 -0.768 0.293 -1.06 0.0 c -0.294 -0.293 -0.294 -0.768 0.0 -1.06 C 4.855 4.697 8.352 3.25 12.0 3.25 Z")
        )
    }.build()
}
