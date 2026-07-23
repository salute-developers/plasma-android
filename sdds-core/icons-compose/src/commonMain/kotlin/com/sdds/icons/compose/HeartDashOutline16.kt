package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartDashOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartDashOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.525 1.646 c 0.196 -0.195 0.513 -0.195 0.708 0.0 c 0.195 0.196 0.195 0.512 0.0 0.707 l -11.88 11.88 c -0.195 0.195 -0.511 0.195 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.708 l 2.119 -2.119 c -0.375 -0.38 -0.732 -0.772 -1.055 -1.179 C 1.726 8.987 1.0 7.58 1.0 6.08 C 1.0 4.336 2.519 2.25 4.988 2.25 c 0.736 0.0 1.392 0.284 1.95 0.662 C 7.329 3.178 7.684 3.5 8.0 3.826 C 8.315 3.5 8.671 3.178 9.063 2.912 C 9.62 2.534 10.276 2.25 11.011 2.25 c 0.585 0.0 1.117 0.12 1.588 0.321 l 0.925 -0.925 Z M 11.012 3.25 c -0.471 0.0 -0.934 0.181 -1.387 0.49 C 9.17 4.047 8.751 4.465 8.376 4.893 L 8.0 5.325 l -0.376 -0.43 C 7.249 4.465 6.83 4.047 6.375 3.738 C 5.922 3.431 5.459 3.25 4.988 3.25 C 3.135 3.25 2.0 4.822 2.0 6.08 c 0.0 1.177 0.574 2.367 1.493 3.525 c 0.298 0.375 0.629 0.74 0.979 1.094 l 7.343 -7.343 c -0.25 -0.067 -0.518 -0.106 -0.803 -0.106 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.185 3.81 C 14.712 4.498 15.0 5.32 15.0 6.08 c 0.0 1.5 -0.726 2.908 -1.71 4.147 c -0.988 1.245 -2.278 2.373 -3.5 3.32 l -0.064 0.05 c -0.436 0.338 -0.762 0.59 -1.173 0.702 c -0.345 0.093 -0.761 0.093 -1.106 0.0 c -0.411 -0.111 -0.737 -0.364 -1.173 -0.702 l -0.063 -0.05 c -0.323 -0.25 -0.651 -0.513 -0.977 -0.787 l 0.71 -0.71 c 0.291 0.243 0.586 0.48 0.88 0.707 c 0.527 0.409 0.69 0.524 0.884 0.577 c 0.174 0.047 0.41 0.047 0.584 0.0 c 0.195 -0.053 0.357 -0.168 0.885 -0.577 c 1.197 -0.928 2.415 -1.998 3.33 -3.152 C 13.427 8.447 14.0 7.257 14.0 6.08 c 0.0 -0.508 -0.185 -1.069 -0.53 -1.556 l 0.715 -0.713 Z")
        )
    }.build()
}
