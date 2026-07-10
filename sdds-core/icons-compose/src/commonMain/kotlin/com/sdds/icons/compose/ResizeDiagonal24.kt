package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ResizeDiagonal24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ResizeDiagonal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.5 13.25 c 0.099 0.0 0.196 0.019 0.287 0.057 c 0.091 0.037 0.174 0.093 0.243 0.163 c 0.07 0.07 0.126 0.152 0.163 0.243 c 0.038 0.09 0.057 0.189 0.057 0.287 c 0.0 0.098 -0.019 0.196 -0.057 0.287 c -0.037 0.091 -0.093 0.174 -0.163 0.243 l -7.5 7.5 c -0.07 0.07 -0.152 0.126 -0.243 0.163 c -0.09 0.038 -0.189 0.057 -0.287 0.057 c -0.098 0.0 -0.196 -0.019 -0.287 -0.057 c -0.091 -0.037 -0.174 -0.093 -0.243 -0.163 c -0.07 -0.07 -0.126 -0.152 -0.163 -0.243 c -0.038 -0.09 -0.057 -0.188 -0.057 -0.287 c 0.0 -0.099 0.019 -0.196 0.057 -0.287 c 0.037 -0.091 0.093 -0.174 0.163 -0.243 l 7.5 -7.5 c 0.07 -0.07 0.152 -0.126 0.243 -0.163 c 0.09 -0.038 0.188 -0.057 0.287 -0.057 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.0 4.999 c 0.099 0.0 0.196 0.02 0.287 0.058 c 0.091 0.037 0.174 0.093 0.243 0.163 c 0.07 0.07 0.126 0.152 0.163 0.243 c 0.038 0.09 0.058 0.188 0.058 0.287 c 0.0 0.099 -0.02 0.196 -0.058 0.287 C 20.656 6.128 20.6 6.211 20.53 6.28 L 6.28 20.53 c -0.14 0.141 -0.331 0.22 -0.53 0.22 s -0.39 -0.079 -0.53 -0.22 C 5.079 20.39 5.0 20.2 5.0 20.0 s 0.079 -0.39 0.22 -0.53 L 19.47 5.22 c 0.07 -0.07 0.152 -0.126 0.243 -0.163 C 19.803 5.019 19.9 4.999 20.0 4.999 Z")
        )
    }.build()
}
