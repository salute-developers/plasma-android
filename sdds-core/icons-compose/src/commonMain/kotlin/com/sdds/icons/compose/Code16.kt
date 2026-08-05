package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Code16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Code16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.895 1.75 c 0.264 0.081 0.413 0.36 0.334 0.624 l -3.5 11.55 c -0.08 0.265 -0.36 0.413 -0.623 0.334 c -0.264 -0.08 -0.414 -0.36 -0.334 -0.623 l 3.5 -11.55 C 9.352 1.82 9.63 1.67 9.895 1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.147 5.201 c 0.195 -0.195 0.512 -0.195 0.707 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 L 2.756 8.004 l 2.098 2.098 c 0.195 0.195 0.195 0.511 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 L 1.795 8.457 c -0.25 -0.25 -0.25 -0.655 0.0 -0.905 l 2.352 -2.35 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.146 5.201 c 0.195 -0.195 0.511 -0.195 0.707 0.0 l 2.351 2.35 c 0.25 0.25 0.25 0.656 0.0 0.906 l -2.351 2.351 c -0.195 0.195 -0.512 0.196 -0.707 0.0 c -0.195 -0.195 -0.195 -0.511 0.0 -0.707 l 2.097 -2.097 l -2.097 -2.096 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 Z")
        )
    }.build()
}
