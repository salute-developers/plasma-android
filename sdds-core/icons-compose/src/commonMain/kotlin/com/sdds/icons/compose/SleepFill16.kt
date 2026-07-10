package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SleepFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SleepFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.545 1.507 C 10.786 1.46 11.0 1.556 11.122 1.615 c 0.134 0.066 0.295 0.164 0.472 0.272 l 0.02 0.012 c 2.032 1.239 3.392 3.478 3.392 6.035 c 0.0 3.9 -3.164 7.062 -7.066 7.062 c -2.557 0.0 -4.797 -1.358 -6.037 -3.39 l -0.01 -0.019 C 1.784 11.41 1.685 11.25 1.62 11.115 c -0.06 -0.121 -0.154 -0.335 -0.107 -0.577 c 0.054 -0.28 0.243 -0.513 0.507 -0.623 c 0.135 -0.056 0.266 -0.057 0.358 -0.049 C 2.47 9.875 2.565 9.896 2.65 9.92 c 0.165 0.045 0.375 0.121 0.62 0.21 l 0.019 0.006 c 0.565 0.203 1.175 0.314 1.812 0.314 c 2.958 0.0 5.356 -2.397 5.356 -5.353 c 0.0 -0.637 -0.111 -1.247 -0.315 -1.812 l -0.006 -0.02 c -0.088 -0.243 -0.164 -0.454 -0.21 -0.618 c -0.023 -0.086 -0.044 -0.18 -0.052 -0.274 c -0.008 -0.091 -0.007 -0.221 0.049 -0.356 c 0.11 -0.265 0.34 -0.454 0.622 -0.509 Z")
        )
    }.build()
}
