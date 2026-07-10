package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartDashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartDashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.525 1.646 c 0.196 -0.195 0.513 -0.195 0.708 0.0 c 0.195 0.196 0.195 0.512 0.0 0.707 l -11.88 11.88 c -0.195 0.195 -0.511 0.195 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.708 l 2.471 -2.471 C 2.643 9.559 1.5 7.854 1.5 6.079 c 0.0 -1.5 1.327 -3.329 3.488 -3.329 C 6.195 2.75 7.226 3.681 8.0 4.565 C 8.774 3.681 9.805 2.75 11.012 2.75 c 0.436 0.0 0.838 0.076 1.202 0.207 l 1.311 -1.31 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.828 4.166 c 0.436 0.588 0.672 1.28 0.672 1.913 c 0.0 2.678 -2.598 5.198 -5.018 7.073 c -0.498 0.387 -0.747 0.58 -1.06 0.664 c -0.26 0.07 -0.585 0.07 -0.844 0.0 c -0.313 -0.084 -0.562 -0.277 -1.06 -0.664 c -0.309 -0.239 -0.62 -0.488 -0.93 -0.747 l 8.24 -8.239 Z")
        )
    }.build()
}
