package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationArrowFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationArrowFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.646 7.084 c 1.393 -0.502 2.741 0.846 2.24 2.239 L 20.73 31.975 c -0.589 1.636 -2.944 1.505 -3.348 -0.185 l -2.529 -10.582 c -0.01 -0.046 -0.047 -0.082 -0.092 -0.093 L 4.18 18.588 c -1.691 -0.405 -1.823 -2.76 -0.187 -3.35 l 22.652 -8.154 Z")
        )
    }.build()
}
