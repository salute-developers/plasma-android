package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RepeatOneOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RepeatOneOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.03 2.72 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 L 13.19 5.0 H 9.0 c -3.866 0.0 -7.0 3.134 -7.0 7.0 c 0.0 1.575 0.521 3.03 1.4 4.2 c 0.249 0.332 0.719 0.398 1.05 0.15 c 0.331 -0.25 0.398 -0.72 0.15 -1.05 c -0.691 -0.92 -1.1 -2.061 -1.1 -3.3 c 0.0 -3.038 2.462 -5.5 5.5 -5.5 h 6.0 c 0.303 0.0 0.577 -0.183 0.693 -0.463 c 0.116 -0.28 0.052 -0.603 -0.163 -0.817 l -2.5 -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.6 7.799 c -0.25 -0.331 -0.72 -0.398 -1.05 -0.15 c -0.332 0.25 -0.398 0.72 -0.15 1.05 c 0.691 0.92 1.1 2.062 1.1 3.301 c 0.0 3.038 -2.462 5.5 -5.5 5.5 H 9.0 c -0.303 0.0 -0.577 0.183 -0.693 0.463 c -0.116 0.28 -0.052 0.603 0.163 0.817 l 2.5 2.5 c 0.293 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 L 10.81 19.0 H 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 c 0.0 -1.575 -0.521 -3.031 -1.4 -4.201 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.0 9.0 c 0.0 -0.303 -0.183 -0.577 -0.463 -0.693 c -0.28 -0.116 -0.603 -0.052 -0.817 0.163 l -1.5 1.5 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 0.22 -0.22 V 15.0 c 0.0 0.414 0.336 0.75 0.75 0.75 S 13.0 15.414 13.0 15.0 V 9.0 Z")
        )
    }.build()
}
