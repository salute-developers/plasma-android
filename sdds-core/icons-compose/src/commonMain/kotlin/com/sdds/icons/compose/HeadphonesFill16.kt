package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeadphonesFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeadphonesFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 2.05 C 4.714 2.05 2.05 4.714 2.05 8.0 v 0.708 C 2.404 8.48 2.824 8.35 3.275 8.35 c 1.256 0.0 2.275 1.019 2.275 2.275 v 2.1 C 5.55 13.982 4.531 15.0 3.275 15.0 S 1.0 13.981 1.0 12.725 V 8.0 c 0.0 -3.866 3.134 -7.0 7.0 -7.0 s 7.0 3.134 7.0 7.0 v 4.725 C 15.0 13.982 13.981 15.0 12.725 15.0 s -2.275 -1.019 -2.275 -2.275 v -2.1 c 0.0 -1.256 1.019 -2.275 2.275 -2.275 c 0.451 0.0 0.871 0.131 1.225 0.358 V 8.0 c 0.0 -3.286 -2.664 -5.95 -5.95 -5.95 Z")
        )
    }.build()
}
