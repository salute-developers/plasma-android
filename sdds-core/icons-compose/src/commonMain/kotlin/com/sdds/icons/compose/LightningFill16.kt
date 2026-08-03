package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LightningFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LightningFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.151 1.072 c 0.21 0.125 0.306 0.384 0.229 0.619 L 8.887 6.25 h 4.097 c 0.204 0.0 0.39 0.123 0.472 0.313 c 0.083 0.19 0.047 0.411 -0.09 0.565 l -6.875 7.7 c -0.164 0.184 -0.432 0.226 -0.642 0.1 c -0.21 -0.125 -0.306 -0.384 -0.229 -0.619 L 7.113 9.75 H 3.016 c -0.204 0.0 -0.39 -0.123 -0.472 -0.313 c -0.082 -0.19 -0.047 -0.411 0.09 -0.565 l 6.875 -7.7 c 0.164 -0.184 0.432 -0.225 0.642 -0.1 Z")
        )
    }.build()
}
