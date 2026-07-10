package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RulerOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RulerOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.989 1.424 c -0.464 -0.457 -1.22 -0.444 -1.692 0.029 l -9.923 9.926 c -0.472 0.472 -0.485 1.226 -0.03 1.69 l 1.496 1.52 c 0.461 0.47 1.227 0.462 1.704 -0.016 l 9.942 -9.954 c 0.476 -0.478 0.484 -1.241 0.016 -1.702 l -1.514 -1.493 Z M 11.995 2.15 c 0.079 -0.078 0.205 -0.08 0.282 -0.004 l 1.514 1.492 c 0.077 0.077 0.076 0.204 -0.003 0.284 l -9.942 9.954 c -0.08 0.08 -0.207 0.08 -0.284 0.002 l -1.495 -1.52 c -0.076 -0.077 -0.074 -0.203 0.005 -0.282 l 0.64 -0.64 l 0.79 0.79 c 0.194 0.195 0.511 0.195 0.706 0.0 c 0.196 -0.196 0.196 -0.512 0.0 -0.707 l -0.79 -0.79 l 1.27 -1.27 l 0.79 0.79 c 0.196 0.194 0.513 0.194 0.708 0.0 c 0.195 -0.196 0.195 -0.513 0.0 -0.708 l -0.79 -0.79 L 6.667 7.48 l 0.79 0.79 c 0.195 0.195 0.512 0.195 0.707 0.0 c 0.196 -0.196 0.196 -0.512 0.0 -0.707 l -0.79 -0.79 L 8.644 5.5 l 0.792 0.791 c 0.195 0.195 0.512 0.195 0.707 0.0 c 0.195 -0.195 0.195 -0.512 0.0 -0.707 l -0.791 -0.79 l 1.27 -1.271 l 0.791 0.79 c 0.195 0.196 0.512 0.196 0.707 0.0 c 0.196 -0.195 0.196 -0.511 0.0 -0.706 l -0.79 -0.792 l 0.665 -0.666 Z")
        )
    }.build()
}
