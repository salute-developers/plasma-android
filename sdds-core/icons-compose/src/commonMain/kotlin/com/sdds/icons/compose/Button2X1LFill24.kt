package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button2X1LFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button2X1LFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.245 5.229 C 2.0 5.709 2.0 6.339 2.0 7.6 v 8.8 c 0.0 1.26 0.0 1.89 0.245 2.372 c 0.216 0.423 0.56 0.767 0.984 0.983 C 3.709 20.0 4.339 20.0 5.6 20.0 h 2.8 c 1.26 0.0 1.89 0.0 2.371 -0.245 c 0.424 -0.216 0.768 -0.56 0.984 -0.983 C 12.0 18.29 12.0 17.66 12.0 16.4 V 7.6 c 0.0 -1.26 0.0 -1.89 -0.245 -2.371 c -0.216 -0.424 -0.56 -0.768 -0.984 -0.984 C 10.291 4.0 9.662 4.0 8.4 4.0 H 5.6 C 4.34 4.0 3.71 4.0 3.229 4.245 C 2.805 4.461 2.46 4.805 2.245 5.23 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.245 7.229 C 14.0 7.709 14.0 8.339 14.0 9.6 v 4.8 c 0.0 1.26 0.0 1.89 0.245 2.371 c 0.216 0.424 0.56 0.768 0.984 0.984 C 15.709 18.0 16.338 18.0 17.6 18.0 h 0.8 c 1.26 0.0 1.89 0.0 2.372 -0.245 c 0.423 -0.216 0.767 -0.56 0.983 -0.983 C 22.0 16.29 22.0 15.66 22.0 14.4 V 9.6 c 0.0 -1.26 0.0 -1.89 -0.245 -2.371 c -0.216 -0.424 -0.56 -0.768 -0.983 -0.984 C 20.29 6.0 19.66 6.0 18.4 6.0 h -0.8 c -1.26 0.0 -1.89 0.0 -2.372 0.245 c -0.423 0.216 -0.767 0.56 -0.983 0.984 Z")
        )
    }.build()
}
