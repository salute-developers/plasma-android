package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CallDashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CallDashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.196 1.564 C 5.482 1.398 5.745 1.367 5.983 1.43 c 0.24 0.063 0.456 0.22 0.65 0.435 c 0.39 0.43 0.688 1.091 0.897 1.681 c 0.068 0.192 0.113 0.322 0.14 0.414 c 0.028 0.097 0.048 0.186 0.05 0.288 c 0.0 0.095 -0.003 0.164 -0.017 0.23 c -0.008 0.04 -0.02 0.078 -0.036 0.12 c -0.007 0.02 -0.016 0.04 -0.024 0.058 l -0.018 0.04 H 7.624 l -0.03 0.051 l 0.004 0.002 C 7.573 4.79 7.518 4.871 7.376 5.032 C 7.243 5.183 7.057 5.38 6.81 5.642 C 6.503 5.969 6.228 6.397 6.138 6.93 C 6.054 7.423 6.13 8.006 6.486 8.685 l 7.04 -7.038 c 0.195 -0.196 0.512 -0.196 0.707 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 L 2.353 14.233 c -0.195 0.195 -0.511 0.195 -0.707 0.0 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 l 3.173 -3.173 c -0.071 -0.118 -0.143 -0.24 -0.215 -0.364 C 2.854 6.957 2.775 4.982 3.247 3.7 c 0.472 -1.282 1.495 -1.873 1.95 -2.135 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.587 10.006 c 0.133 -0.02 0.238 -0.001 0.321 0.048 l 0.017 0.006 c 0.064 0.02 0.126 0.052 0.208 0.1 c 0.088 0.053 0.155 0.115 0.224 0.188 c 0.067 0.07 0.157 0.173 0.29 0.328 c 0.406 0.476 0.829 1.064 1.007 1.616 c 0.09 0.276 0.117 0.543 0.052 0.781 s -0.224 0.45 -0.51 0.615 c -0.454 0.262 -1.477 0.853 -2.824 0.62 c -0.988 -0.17 -2.15 -0.784 -3.39 -2.295 l 1.885 -1.886 c 0.051 0.023 0.102 0.045 0.153 0.064 c 0.507 0.188 1.016 0.163 1.45 0.06 c 0.351 -0.083 0.615 -0.145 0.812 -0.184 c 0.115 -0.024 0.196 -0.037 0.254 -0.043 l 0.05 -0.018 Z")
        )
    }.build()
}
