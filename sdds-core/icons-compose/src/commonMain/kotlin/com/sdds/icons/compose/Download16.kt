package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Download16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Download16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.502 2.25 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 8.205 L 5.741 8.694 c -0.195 -0.195 -0.512 -0.195 -0.707 0.0 c -0.195 0.195 -0.195 0.512 0.0 0.707 l 2.614 2.615 c 0.196 0.195 0.512 0.195 0.708 0.0 L 10.97 9.4 c 0.195 -0.195 0.195 -0.512 0.0 -0.707 c -0.195 -0.195 -0.512 -0.195 -0.707 0.0 l -1.761 1.761 V 2.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.75 7.13 c 0.0 -0.275 -0.224 -0.5 -0.5 -0.5 s -0.5 0.225 -0.5 0.5 v 4.245 c 0.0 0.402 0.0 0.734 0.022 1.005 c 0.023 0.281 0.072 0.54 0.196 0.782 c 0.192 0.376 0.498 0.682 0.874 0.874 c 0.243 0.124 0.501 0.173 0.782 0.196 c 0.27 0.022 0.603 0.022 1.005 0.022 h 6.746 c 0.402 0.0 0.734 0.0 1.005 -0.022 c 0.28 -0.023 0.54 -0.072 0.782 -0.196 c 0.376 -0.192 0.682 -0.498 0.874 -0.874 c 0.124 -0.243 0.173 -0.501 0.196 -0.782 c 0.022 -0.27 0.022 -0.603 0.022 -1.005 V 7.13 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 4.223 c 0.0 0.428 0.0 0.72 -0.019 0.945 c -0.018 0.219 -0.05 0.33 -0.09 0.409 c -0.096 0.188 -0.249 0.341 -0.437 0.437 c -0.078 0.04 -0.19 0.072 -0.41 0.09 c -0.225 0.019 -0.516 0.019 -0.944 0.019 H 4.65 c -0.428 0.0 -0.72 0.0 -0.944 -0.019 c -0.22 -0.018 -0.332 -0.05 -0.41 -0.09 c -0.188 -0.096 -0.341 -0.249 -0.437 -0.437 c -0.04 -0.078 -0.072 -0.19 -0.09 -0.41 c -0.019 -0.225 -0.019 -0.516 -0.019 -0.944 V 7.131 Z")
        )
    }.build()
}
