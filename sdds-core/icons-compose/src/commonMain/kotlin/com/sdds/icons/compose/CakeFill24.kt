package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CakeFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CakeFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.5 4.5 C 13.5 5.328 12.828 6.0 12.0 6.0 s -1.5 -0.672 -1.5 -1.5 C 10.5 3.0 12.0 1.0 12.0 1.0 s 1.5 2.0 1.5 3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.75 8.0 V 7.0 h -1.5 v 1.0 h -5.0 C 4.455 8.0 3.0 9.455 3.0 11.25 v 2.5 c 2.154 0.0 3.772 -1.688 4.274 -2.29 l 0.005 -0.007 c 0.022 -0.026 0.06 -0.072 0.098 -0.111 V 11.34 c 0.034 -0.035 0.152 -0.157 0.342 -0.222 c 0.201 -0.068 0.415 -0.06 0.61 0.024 c 0.185 0.08 0.292 0.21 0.323 0.248 v 0.001 c 0.035 0.042 0.07 0.091 0.089 0.119 l 0.005 0.007 c 0.184 0.261 0.584 0.77 1.158 1.208 C 10.476 13.163 11.182 13.5 12.0 13.5 c 0.818 0.0 1.524 -0.337 2.096 -0.774 c 0.574 -0.438 0.974 -0.947 1.158 -1.208 l 0.005 -0.007 c 0.02 -0.028 0.054 -0.077 0.088 -0.119 h 0.001 c 0.031 -0.038 0.138 -0.169 0.323 -0.248 c 0.195 -0.084 0.409 -0.093 0.61 -0.025 c 0.19 0.065 0.308 0.187 0.341 0.222 h 0.001 c 0.038 0.04 0.076 0.086 0.098 0.112 l 0.005 0.006 c 0.502 0.603 2.12 2.291 4.274 2.291 v -2.5 C 21.0 9.455 19.545 8.0 17.75 8.0 h -5.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.0 15.25 c -2.326 0.0 -4.084 -1.425 -4.956 -2.313 c -0.263 0.304 -0.61 0.655 -1.037 0.982 C 14.267 14.482 13.247 15.0 12.0 15.0 c -1.248 0.0 -2.266 -0.517 -3.006 -1.082 c -0.428 -0.326 -0.775 -0.677 -1.038 -0.98 C 7.084 13.825 5.326 15.25 3.0 15.25 v 2.5 C 3.0 19.545 4.455 21.0 6.25 21.0 h 11.5 c 1.795 0.0 3.25 -1.455 3.25 -3.25 v -2.5 Z")
        )
    }.build()
}
