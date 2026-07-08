package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LockFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LockFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.266 4.367 v 2.13 c 0.198 0.007 0.367 0.022 0.521 0.06 c 0.817 0.203 1.455 0.86 1.651 1.703 c 0.062 0.266 0.062 0.573 0.062 1.0 v 2.395 c 0.0 0.478 0.0 0.868 -0.025 1.185 c -0.026 0.329 -0.082 0.625 -0.219 0.902 c -0.214 0.434 -0.556 0.786 -0.976 1.007 c -0.269 0.141 -0.556 0.198 -0.875 0.225 C 11.098 15.0 10.72 15.0 10.256 15.0 H 5.744 c -0.463 0.0 -0.842 0.0 -1.15 -0.026 C 4.277 14.947 3.99 14.89 3.72 14.75 c -0.42 -0.221 -0.762 -0.573 -0.976 -1.007 c -0.137 -0.277 -0.193 -0.574 -0.219 -0.902 C 2.5 12.523 2.5 12.133 2.5 11.655 V 9.26 c 0.0 -0.427 0.0 -0.734 0.062 -1.0 c 0.196 -0.843 0.834 -1.5 1.65 -1.703 c 0.155 -0.038 0.324 -0.053 0.522 -0.06 v -2.13 C 4.734 2.507 6.196 1.0 8.0 1.0 s 3.266 1.507 3.266 3.367 Z m -5.5 0.0 c 0.0 -1.272 1.0 -2.304 2.234 -2.304 s 2.234 1.032 2.234 2.304 v 2.127 H 5.766 V 4.367 Z M 8.0 12.165 c 0.76 0.0 1.375 -0.635 1.375 -1.418 c 0.0 -0.783 -0.616 -1.418 -1.375 -1.418 c -0.76 0.0 -1.375 0.635 -1.375 1.418 c 0.0 0.783 0.616 1.418 1.375 1.418 Z")
        )
    }.build()
}
