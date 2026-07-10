package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LightningOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LightningOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.129 2.103 c 0.306 0.179 0.445 0.548 0.332 0.884 L 13.291 9.5 h 5.959 c 0.297 0.0 0.566 0.175 0.686 0.447 c 0.12 0.271 0.069 0.588 -0.131 0.808 l -10.0 11.0 c -0.239 0.262 -0.628 0.321 -0.934 0.142 c -0.306 -0.179 -0.445 -0.548 -0.332 -0.884 l 2.17 -6.513 H 4.75 c -0.297 0.0 -0.566 -0.175 -0.686 -0.447 c -0.12 -0.271 -0.069 -0.588 0.131 -0.808 l 10.0 -11.0 c 0.239 -0.262 0.628 -0.321 0.934 -0.142 Z M 6.445 13.0 h 5.305 c 0.241 0.0 0.467 0.116 0.608 0.312 c 0.141 0.195 0.18 0.447 0.103 0.675 l -1.376 4.13 L 17.555 11.0 H 12.25 c -0.241 0.0 -0.467 -0.116 -0.608 -0.311 c -0.141 -0.196 -0.18 -0.447 -0.103 -0.676 l 1.376 -4.13 L 6.445 13.0 Z")
        )
    }.build()
}
