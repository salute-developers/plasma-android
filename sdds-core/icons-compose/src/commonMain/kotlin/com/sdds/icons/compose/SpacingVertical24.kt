package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SpacingVertical24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SpacingVertical24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.5 20.25 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -15.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 h 15.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.997 5.712 c 0.205 0.0 0.402 0.082 0.544 0.23 l 3.274 3.412 c 0.287 0.3 0.278 0.774 -0.021 1.061 c -0.299 0.287 -0.774 0.277 -1.06 -0.021 L 12.75 8.326 v 7.226 l 1.999 -1.961 c 0.296 -0.29 0.77 -0.286 1.06 0.01 c 0.29 0.295 0.286 0.77 -0.01 1.06 l -3.274 3.215 c -0.293 0.288 -0.763 0.286 -1.054 -0.004 l -3.226 -3.215 c -0.293 -0.292 -0.294 -0.767 -0.002 -1.06 c 0.293 -0.294 0.767 -0.294 1.06 -0.002 l 1.947 1.94 V 8.346 L 9.32 10.39 c -0.285 0.3 -0.76 0.313 -1.061 0.029 c -0.3 -0.285 -0.314 -0.76 -0.03 -1.06 l 3.226 -3.413 c 0.141 -0.149 0.337 -0.233 0.542 -0.234 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.5 2.25 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -15.0 C 4.086 3.75 3.75 3.414 3.75 3.0 S 4.086 2.25 4.5 2.25 h 15.0 Z")
        )
    }.build()
}
