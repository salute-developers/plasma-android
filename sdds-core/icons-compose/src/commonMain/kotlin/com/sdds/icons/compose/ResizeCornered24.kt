package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ResizeCornered24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ResizeCornered24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.5 3.25 c 0.414 0.0 0.75 0.336 0.75 0.75 c 0.0 9.527 -7.723 17.25 -17.25 17.25 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 S 3.586 19.75 4.0 19.75 c 8.698 0.0 15.75 -7.052 15.75 -15.75 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
    }.build()
}
