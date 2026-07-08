package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SearchError24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SearchError24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.75 10.5 c 0.0 -3.176 2.574 -5.75 5.75 -5.75 s 5.75 2.574 5.75 5.75 c 0.0 2.369 -1.433 4.403 -3.479 5.284 c 0.133 0.488 0.211 0.998 0.226 1.524 c 0.758 -0.278 1.457 -0.679 2.072 -1.178 l 4.9 4.9 c 0.294 0.293 0.768 0.293 1.061 0.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 l -4.9 -4.901 c 1.013 -1.247 1.62 -2.837 1.62 -4.569 c 0.0 -4.004 -3.246 -7.25 -7.25 -7.25 S 3.25 6.496 3.25 10.5 c 0.0 0.445 0.04 0.88 0.117 1.304 c 0.447 -0.247 0.925 -0.442 1.428 -0.578 c -0.03 -0.238 -0.045 -0.48 -0.045 -0.726 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 17.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 S 1.0 20.538 1.0 17.5 S 3.462 12.0 6.5 12.0 s 5.5 2.462 5.5 5.5 Z m -7.975 -2.475 c 0.195 -0.195 0.512 -0.195 0.707 0.0 L 6.5 16.793 l 1.768 -1.768 c 0.195 -0.195 0.512 -0.195 0.707 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 L 7.207 17.5 l 1.768 1.768 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 L 6.5 18.207 l -1.768 1.768 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 L 5.793 17.5 l -1.768 -1.768 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 Z")
        )
    }.build()
}
