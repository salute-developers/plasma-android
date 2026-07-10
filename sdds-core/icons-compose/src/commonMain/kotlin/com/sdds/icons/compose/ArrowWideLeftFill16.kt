package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideLeftFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideLeftFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.357 3.139 C 6.502 3.0 6.715 2.962 6.9 3.04 C 7.083 3.12 7.203 3.3 7.203 3.5 v 2.232 h 6.047 c 0.69 0.0 1.25 0.56 1.25 1.25 v 2.036 c 0.0 0.69 -0.56 1.25 -1.25 1.25 H 7.203 V 12.5 c 0.0 0.2 -0.12 0.381 -0.304 0.46 c -0.184 0.079 -0.397 0.04 -0.542 -0.099 l -4.703 -4.5 C 1.556 8.267 1.5 8.136 1.5 8.001 c 0.0 -0.137 0.056 -0.268 0.154 -0.362 l 4.703 -4.5 Z")
        )
    }.build()
}
