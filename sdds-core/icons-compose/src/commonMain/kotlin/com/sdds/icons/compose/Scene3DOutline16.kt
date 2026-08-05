package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Scene3DOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Scene3DOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.Black),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 1f,
            pathData = addPathNodes("M 8.0 13.999 c -2.295 0.0 -4.164 -1.806 -4.242 -4.063 c -1.259 0.2 -2.148 0.447 -2.62 0.597 C 1.0 10.577 0.93 10.599 0.882 10.587 C 0.836 10.575 0.8 10.55 0.777 10.51 C 0.75 10.468 0.75 10.397 0.75 10.255 V 2.368 c 0.0 -0.165 0.0 -0.248 0.028 -0.291 c 0.027 -0.041 0.06 -0.064 0.108 -0.075 C 0.936 1.99 1.018 2.02 1.18 2.079 C 2.01 2.38 4.094 2.95 8.0 2.95 s 5.99 -0.57 6.819 -0.87 c 0.163 -0.06 0.245 -0.09 0.295 -0.078 c 0.048 0.01 0.081 0.034 0.108 0.075 c 0.028 0.043 0.028 0.126 0.028 0.291 v 7.887 c 0.0 0.142 0.0 0.213 -0.027 0.256 c -0.025 0.039 -0.06 0.064 -0.104 0.076 c -0.049 0.012 -0.118 -0.01 -0.258 -0.054 c -0.47 -0.15 -1.36 -0.397 -2.62 -0.597 c -0.077 2.257 -1.947 4.063 -4.241 4.063 Z m 0.0 0.0 c 2.344 0.0 4.244 -1.885 4.244 -4.21 c 0.0 -2.324 -1.9 -4.208 -4.244 -4.208 S 3.756 7.465 3.756 9.79 c 0.0 2.325 1.9 4.209 4.244 4.209 Z")
        )
    }.build()
}
