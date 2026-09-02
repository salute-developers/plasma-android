package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileUnpinFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileUnpinFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.334 13.963 c -0.195 0.196 -0.193 0.509 0.006 0.699 c 0.2 0.19 0.52 0.184 0.716 -0.012 L 14.627 2.038 C 14.823 1.842 14.82 1.53 14.62 1.34 c -0.2 -0.19 -0.52 -0.184 -0.716 0.012 l -3.33 3.34 h -0.183 c -0.373 0.0 -0.657 0.345 -0.598 0.724 L 9.8 5.468 L 7.314 7.962 C 6.884 7.866 6.44 7.806 5.985 7.79 L 5.699 7.782 c -1.527 0.0 -2.95 0.464 -4.137 1.258 c -0.447 0.299 -0.67 0.802 -0.67 1.296 c 0.0 0.907 0.736 1.641 1.642 1.641 h 0.779 l -1.979 1.986 Z m 7.623 -4.175 c -0.425 0.575 -0.028 1.404 0.674 1.404 h 1.709 v 2.75 l 0.567 0.75 l 0.563 -0.749 v -2.75 h 1.712 c 0.701 -0.001 1.1 -0.83 0.675 -1.405 l -1.031 -1.396 c -0.14 -0.19 -0.2 -0.432 -0.163 -0.669 l 0.356 -2.306 c 0.06 -0.38 -0.224 -0.724 -0.597 -0.725 h -0.034 l -3.23 3.22 c -0.009 0.172 -0.067 0.34 -0.17 0.48 L 8.956 9.788 Z M 2.979 4.42 c 0.0 1.516 1.209 2.762 2.72 2.762 c 1.51 0.0 2.719 -1.246 2.719 -2.762 s -1.21 -2.763 -2.72 -2.763 c -1.51 0.0 -2.719 1.246 -2.72 2.763 Z m 5.888 7.557 c 0.157 0.0 0.309 -0.024 0.453 -0.065 c -0.904 -0.171 -1.417 -1.075 -1.253 -1.916 l -1.986 1.98 h 2.786 Z")
        )
    }.build()
}
