package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideForwardBack24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideForwardBack24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.53 4.22 c -0.214 -0.215 -0.537 -0.279 -0.817 -0.163 c -0.28 0.116 -0.463 0.39 -0.463 0.693 v 5.0 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 V 6.56 L 20.19 12.0 l -5.44 5.44 v -2.19 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 H 7.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 6.586 16.0 7.0 16.0 h 6.25 v 3.25 c 0.0 0.303 0.183 0.577 0.463 0.693 c 0.28 0.116 0.603 0.052 0.817 -0.163 l 7.25 -7.25 c 0.293 -0.292 0.293 -0.767 0.0 -1.06 l -7.25 -7.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.53 8.03 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 L 2.22 9.22 c -0.293 0.293 -0.293 0.767 0.0 1.06 l 2.25 2.25 c 0.293 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.292 0.293 -0.767 0.0 -1.06 L 4.56 10.5 H 11.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 11.414 9.0 11.0 9.0 H 4.56 l 0.97 -0.97 Z")
        )
    }.build()
}
