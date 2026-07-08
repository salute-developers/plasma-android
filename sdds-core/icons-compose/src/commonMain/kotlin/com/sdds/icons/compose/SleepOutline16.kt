package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SleepOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SleepOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.584 1.891 l 0.018 0.012 C 13.638 3.14 15.0 5.38 15.0 7.94 c 0.0 3.9 -3.164 7.062 -7.065 7.062 c -2.556 0.0 -4.795 -1.357 -6.034 -3.388 l -0.012 -0.018 c -0.108 -0.177 -0.206 -0.338 -0.272 -0.472 c -0.06 -0.121 -0.155 -0.335 -0.108 -0.577 c 0.054 -0.28 0.243 -0.513 0.508 -0.623 c 0.135 -0.056 0.265 -0.057 0.357 -0.05 c 0.094 0.01 0.188 0.03 0.273 0.054 c 0.164 0.045 0.375 0.12 0.619 0.209 l 0.02 0.006 c 0.564 0.203 1.173 0.314 1.808 0.314 c 2.958 0.0 5.355 -2.397 5.355 -5.354 c 0.0 -0.637 -0.11 -1.248 -0.315 -1.814 L 10.126 3.27 c -0.088 -0.244 -0.163 -0.454 -0.209 -0.619 c -0.024 -0.085 -0.045 -0.18 -0.053 -0.273 c -0.009 -0.091 -0.008 -0.222 0.048 -0.357 c 0.11 -0.264 0.342 -0.454 0.623 -0.508 c 0.241 -0.047 0.455 0.047 0.577 0.107 c 0.133 0.065 0.295 0.164 0.472 0.271 Z m -0.6 0.806 l 0.09 0.253 c 0.242 0.673 0.374 1.398 0.374 2.153 c 0.0 3.51 -2.845 6.354 -6.355 6.354 c -0.752 0.0 -1.475 -0.131 -2.147 -0.372 c -0.095 -0.035 -0.18 -0.065 -0.253 -0.09 l 0.06 0.098 c 1.066 1.746 2.988 2.91 5.181 2.91 c 3.35 0.0 6.065 -2.715 6.065 -6.063 c 0.0 -2.195 -1.167 -4.118 -2.917 -5.183 l -0.099 -0.06 Z")
        )
    }.build()
}
