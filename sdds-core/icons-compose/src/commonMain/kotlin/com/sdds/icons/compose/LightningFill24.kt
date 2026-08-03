package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LightningFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LightningFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.129 2.103 c 0.306 0.179 0.445 0.548 0.332 0.884 L 13.291 9.5 h 5.959 c 0.297 0.0 0.566 0.175 0.686 0.447 c 0.12 0.271 0.069 0.588 -0.131 0.808 l -10.0 11.0 c -0.239 0.262 -0.628 0.321 -0.934 0.142 c -0.306 -0.179 -0.445 -0.548 -0.332 -0.884 l 2.17 -6.513 H 4.75 c -0.297 0.0 -0.566 -0.175 -0.686 -0.447 c -0.12 -0.271 -0.069 -0.588 0.131 -0.808 l 10.0 -11.0 c 0.239 -0.262 0.628 -0.321 0.934 -0.142 Z")
        )
    }.build()
}
